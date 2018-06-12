/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ambari.server.serveraction.upgrades;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.ambari.server.AmbariException;
import org.apache.ambari.server.actionmanager.HostRoleCommand;
import org.apache.ambari.server.actionmanager.HostRoleStatus;
import org.apache.ambari.server.agent.CommandReport;
import org.apache.ambari.server.api.services.AmbariMetaInfo;
import org.apache.ambari.server.orm.dao.ArtifactDAO;
import org.apache.ambari.server.orm.entities.ArtifactEntity;
import org.apache.ambari.server.serveraction.AbstractServerAction;
import org.apache.ambari.server.state.Cluster;
import org.apache.ambari.server.state.Clusters;
import org.apache.ambari.server.state.StackId;
import org.apache.ambari.server.state.kerberos.KerberosDescriptor;
import org.apache.ambari.server.state.kerberos.KerberosDescriptorFactory;
import org.apache.ambari.server.state.kerberos.KerberosDescriptorUpdateHelper;
import org.apache.ambari.server.state.stack.upgrade.Direction;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;

/**
 * Update the user-defined Kerberos Descriptor to work with the current stack.
 *
 * @see org.apache.ambari.server.state.kerberos.KerberosDescriptorUpdateHelper
 */
public class UpgradeUserKerberosDescriptor extends AbstractServerAction {
  private static final Logger LOG = LoggerFactory.getLogger(UpgradeUserKerberosDescriptor.class);

  /**
   * The upgrade direction.
   *
   * @see Direction
   */
  private static final String UPGRADE_DIRECTION_KEY = "upgrade_direction";

  /**
   * The original "current" stack of the cluster before the upgrade started.
   * This is the same regardless of whether the current direction is
   * {@link Direction#UPGRADE} or {@link Direction#DOWNGRADE}.
   *
   * @see Direction
   */
  private static final String ORIGINAL_STACK_KEY = "original_stack";

  /**
   * The target upgrade stack before the upgrade started. This is the same
   * regardless of whether the current direction is {@link Direction#UPGRADE} or
   * {@link Direction#DOWNGRADE}.
   *
   * @see Direction
   */
  private static final String TARGET_STACK_KEY = "target_stack";

  private final static String KERBEROS_DESCRIPTOR_NAME = "kerberos_descriptor";
  private final static String KERBEROS_DESCRIPTOR_BACKUP_NAME = "kerberos_descriptor_backup";

  @Inject
  private ArtifactDAO artifactDAO;

  @Inject
  private Clusters clusters;

  @Inject
  private AmbariMetaInfo ambariMetaInfo;

  @Inject
  private KerberosDescriptorFactory kerberosDescriptorFactory;

  protected UpgradeUserKerberosDescriptor() {
  }

  /**
   * Update Kerberos Descriptor Storm properties when upgrading to Storm 1.0
   * <p/>
   * Finds the relevant artifact entities and iterates through them to process each independently.
   */
  @Override
  public CommandReport execute(ConcurrentMap<String, Object> requestSharedDataContext)
      throws AmbariException, InterruptedException {
    HostRoleCommand hostRoleCommand = getHostRoleCommand();
    String clusterName = hostRoleCommand.getExecutionCommandWrapper().getExecutionCommand().getClusterName();
    Cluster cluster = clusters.getCluster(clusterName);
    List<String> messages = new ArrayList<String>();
    List<String> errorMessages = new ArrayList<String>();

    if (cluster != null) {
      logMessage(messages, "Obtaining the user-defined Kerberos descriptor");

      TreeMap<String, String> foreignKeys = new TreeMap<String, String>();
      foreignKeys.put("cluster", String.valueOf(cluster.getClusterId()));

      ArtifactEntity entity = artifactDAO.findByNameAndForeignKeys("kerberos_descriptor", foreignKeys);
      KerberosDescriptor userDescriptor = (entity == null) ? null : kerberosDescriptorFactory.createInstance(entity.getArtifactData());

      if (userDescriptor != null) {
        StackId originalStackId = getStackIdFromCommandParams(ORIGINAL_STACK_KEY);
        StackId targetStackId = getStackIdFromCommandParams(TARGET_STACK_KEY);

        if (isDowngrade()) {
          restoreDescriptor(foreignKeys, messages, errorMessages);
        } else {
          backupDescriptor(foreignKeys, messages, errorMessages);

          KerberosDescriptor newDescriptor = null;
          KerberosDescriptor previousDescriptor = null;

          if (targetStackId == null) {
            logErrorMessage(messages, errorMessages, "The new stack version information was not found.");
          } else {
            logMessage(messages, String.format("Obtaining new stack Kerberos descriptor for %s.", targetStackId.toString()));
            newDescriptor = ambariMetaInfo.getKerberosDescriptor(targetStackId.getStackName(), targetStackId.getStackVersion());

            if (newDescriptor == null) {
              logErrorMessage(messages, errorMessages, String.format("The Kerberos descriptor for the new stack version, %s, was not found.", targetStackId.toString()));
            }
          }

          if (originalStackId == null) {
            logErrorMessage(messages, errorMessages, "The previous stack version information was not found.");
          } else {
            logMessage(messages, String.format("Obtaining previous stack Kerberos descriptor for %s.", originalStackId.toString()));
            previousDescriptor = ambariMetaInfo.getKerberosDescriptor(originalStackId.getStackName(), originalStackId.getStackVersion());

            if (newDescriptor == null) {
              logErrorMessage(messages, errorMessages, String.format("The Kerberos descriptor for the previous stack version, %s, was not found.", originalStackId.toString()));
            }
          }

          if (errorMessages.isEmpty()) {
            logMessage(messages, "Updating the user-specified Kerberos descriptor.");

            KerberosDescriptor updatedDescriptor = KerberosDescriptorUpdateHelper.updateUserKerberosDescriptor(
                previousDescriptor,
                newDescriptor,
                userDescriptor);

            logMessage(messages, "Storing updated user-specified Kerberos descriptor.");

            entity.setArtifactData(updatedDescriptor.toMap());
            artifactDAO.merge(entity);

            logMessage(messages, "Successfully updated the user-specified Kerberos descriptor.");
          }
        }
      } else {
        logMessage(messages, "A user-specified Kerberos descriptor was not found. No updates are necessary.");
      }
    } else {
      logErrorMessage(messages, errorMessages, String.format("The cluster named %s was not found.", clusterName));
    }

    if (!errorMessages.isEmpty()) {
      logErrorMessage(messages, errorMessages, "No updates have been performed due to previous issues.");
    }

    return createCommandReport(0, HostRoleStatus.COMPLETED, "{}", StringUtils.join(messages, "\n"), StringUtils.join(errorMessages, "\n"));
  }

  /**
   * Determines if upgrade direction is {@link Direction#UPGRADE} or {@link Direction#DOWNGRADE}.
   *
   * @return {@code true} if {@link Direction#DOWNGRADE}; {@code false} if {@link Direction#UPGRADE}
   */
  private boolean isDowngrade() {
    return Direction.DOWNGRADE.name().equalsIgnoreCase(getCommandParameterValue(UPGRADE_DIRECTION_KEY));
  }

  private StackId getStackIdFromCommandParams(String commandParamKey) {
    String stackId = getCommandParameterValue(commandParamKey);
    if (stackId == null) {
      return null;
    } else {
      return new StackId(stackId);
    }
  }

  private void logMessage(List<String> messages, String message) {
    LOG.info(message);
    messages.add(message);
  }

  private void logErrorMessage(List<String> messages, List<String> errorMessages, String message) {
    LOG.error(message);
    messages.add(message);
    errorMessages.add(message);
  }

  /**
   * Create copy of user defined kerberos descriptor and stores it with name {@code kerberos_descriptor_backup}.
   *
   * @param foreignKeys   keys specific for cluster
   * @param messages      list of log messages
   * @param errorMessages list of error log messages
   */
  private void backupDescriptor(TreeMap<String, String> foreignKeys, List<String> messages, List<String> errorMessages) {
    ArtifactEntity backupEntity = artifactDAO.findByNameAndForeignKeys(KERBEROS_DESCRIPTOR_BACKUP_NAME, foreignKeys);
    if (backupEntity != null) {
      artifactDAO.remove(backupEntity);
    }

    ArtifactEntity entity = artifactDAO.findByNameAndForeignKeys(KERBEROS_DESCRIPTOR_NAME, foreignKeys);
    if (entity != null) {
      backupEntity = new ArtifactEntity();
      backupEntity.setArtifactName(KERBEROS_DESCRIPTOR_BACKUP_NAME);
      backupEntity.setForeignKeys(entity.getForeignKeys());
      backupEntity.setArtifactData(entity.getArtifactData());

      artifactDAO.create(backupEntity);
      logMessage(messages, "Created backup of kerberos descriptor");
    } else {
      logErrorMessage(
          messages,
          errorMessages,
          "No backup of kerberos descriptor created due to missing original kerberos descriptor"
      );
    }


  }

  /**
   * Restores user defined kerberos descriptor from artifact with name {@code kerberos_descriptor_backup}.
   *
   * @param foreignKeys   keys specific for cluster
   * @param messages      list of log messages
   * @param errorMessages list of error log messages
   */
  private void restoreDescriptor(TreeMap<String, String> foreignKeys, List<String> messages, List<String> errorMessages) {
    ArtifactEntity backupEntity = artifactDAO.findByNameAndForeignKeys(KERBEROS_DESCRIPTOR_BACKUP_NAME, foreignKeys);

    if (backupEntity != null) {
      ArtifactEntity entity = artifactDAO.findByNameAndForeignKeys(KERBEROS_DESCRIPTOR_NAME, foreignKeys);
      if (entity != null) {
        artifactDAO.remove(entity);
      }

      entity = new ArtifactEntity();
      entity.setArtifactName(KERBEROS_DESCRIPTOR_NAME);
      entity.setForeignKeys(backupEntity.getForeignKeys());
      entity.setArtifactData(backupEntity.getArtifactData());

      artifactDAO.create(entity);
      logMessage(messages, "Restored kerberos descriptor from backup");
    } else {
      logErrorMessage(messages, errorMessages, "No backup of kerberos descriptor found");
    }
  }

}