/**
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

package org.apache.ambari.server.stack;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

import javax.annotation.Nullable;

import org.apache.ambari.server.AmbariException;
import org.apache.ambari.server.state.stack.RepositoryXml;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Encapsulates IO operations on a stack service directory.
 */
public class StackServiceDirectory extends ServiceDirectory {

  /**
   * logger instance
   */
  private static final Logger LOG = LoggerFactory.getLogger(StackServiceDirectory.class);


  /**
   * repository file
   */
  @Nullable
  private RepositoryXml repoFile;

  /**
   * repository directory
   */
  @Nullable
  private String repoDir;

  /**
   * Constructor.
   *
   * @param servicePath     path of the service directory
   * @throws org.apache.ambari.server.AmbariException if unable to parse the service directory
   */
  public StackServiceDirectory(String servicePath) throws AmbariException {
    super(servicePath);
  }

  /**
   * Obtain the repository xml file if exists or null
   *
   * @return the repository xml file if exists or null
   */
  @Nullable
  public RepositoryXml getRepoFile() {
    return repoFile;
  }

  /**
   * Obtain the repository directory if exists or null
   *
   * @return the repository directory if exists or null
   */
  @Nullable
  public String getRepoDir() {
    return repoDir;
  }

  @Override
  /**
   * Obtain the advisor name.
   *
   * @return advisor name
   */
  public String getAdvisorName(String serviceName) {
    if (getAdvisorFile() == null || serviceName == null)
      return null;

    File serviceDir = new File(getAbsolutePath());
    File stackVersionDir = serviceDir.getParentFile().getParentFile();
    File stackDir = stackVersionDir.getParentFile();

    String stackName = stackDir.getName();
    String versionString = stackVersionDir.getName().replaceAll("\\.", "");

    return stackName + versionString + serviceName + "ServiceAdvisor";
  }

  /**
   * Parse the repository file.
   *
   * @param subDirs service directory sub directories
   */
  private void parseRepoFile(Collection<String> subDirs) {
    RepositoryFolderAndXml repoDirAndXml = RepoUtil.parseRepoFile(directory, subDirs, unmarshaller);
    repoDir = repoDirAndXml.repoDir.orNull();
    repoFile = repoDirAndXml.repoXml.orNull();

    if (repoFile == null || !repoFile.isValid()) {
      LOG.info("No repository information defined for "
          + ", serviceName=" + getName()
          + ", repoFolder=" + getPath() + File.separator + RepoUtil.REPOSITORY_FOLDER_NAME);
    }
  }

  @Override
  protected void parsePath() throws AmbariException {
    super.parsePath();
    Collection<String> subDirs = Arrays.asList(directory.list());
    parseRepoFile(subDirs);
  }

  @Override
  /**
   * @return the resources directory
   */
  protected File getResourcesDirectory() {
    File serviceDir = new File(getAbsolutePath());
    return serviceDir.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile();
  }


  @Override
  /**
   * @return the service name (will be used for logging purposes by superclass)
   */
  public String getService() {
    File serviceDir = new File(getAbsolutePath());

    return serviceDir.getName();
  }

  @Override
  /**
   * @return the stack name-version (will be used for logging purposes by superclass)
   */
  public String getStack() {
    File serviceDir = new File(getAbsolutePath());
    File stackVersionDir = serviceDir.getParentFile().getParentFile();
    File stackDir = stackVersionDir.getParentFile();

    String stackId = String.format("%s-%s", stackDir.getName(), stackVersionDir.getName());
    return stackId;
  }

}
