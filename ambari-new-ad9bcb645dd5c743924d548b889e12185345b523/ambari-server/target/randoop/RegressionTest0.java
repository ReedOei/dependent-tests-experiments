import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str0 = org.apache.ambari.server.api.resources.AlertTargetResourceDefinition.VALIDATE_CONFIG_DIRECTIVE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "validate_config" + "'", str0.equals("validate_config"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = org.apache.ambari.server.serveraction.ServerAction.ACTION_USER_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ACTION_USER_NAME" + "'", str0.equals("ACTION_USER_NAME"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.ambari.server.controller.internal.AmbariServerConfigurationCategory ambariServerConfigurationCategory0 = org.apache.ambari.server.controller.internal.AmbariServerConfigurationCategory.LDAP_CONFIGURATION;
        org.junit.Assert.assertTrue("'" + ambariServerConfigurationCategory0 + "' != '" + org.apache.ambari.server.controller.internal.AmbariServerConfigurationCategory.LDAP_CONFIGURATION + "'", ambariServerConfigurationCategory0.equals(org.apache.ambari.server.controller.internal.AmbariServerConfigurationCategory.LDAP_CONFIGURATION));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertNoticeResourceProvider.ALERT_NOTICE_TARGET_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertNotice/target_id" + "'", str0.equals("AlertNotice/target_id"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.KERBEROS_AUTH_AUTH_TO_LOCAL_RULES;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.ambari.server.state.ServiceComponent serviceComponent0 = null;
        org.apache.ambari.server.orm.entities.HostComponentStateEntity hostComponentStateEntity1 = null;
        org.apache.ambari.server.orm.entities.HostComponentDesiredStateEntity hostComponentDesiredStateEntity2 = null;
        org.apache.ambari.server.state.Clusters clusters3 = null;
        org.apache.ambari.server.orm.dao.StackDAO stackDAO4 = null;
        org.apache.ambari.server.orm.dao.HostDAO hostDAO5 = null;
        org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO6 = null;
        org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO7 = null;
        org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO hostComponentDesiredStateDAO8 = null;
        org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher9 = null;
        try {
            org.apache.ambari.server.state.svccomphost.ServiceComponentHostImpl serviceComponentHostImpl10 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostImpl(serviceComponent0, hostComponentStateEntity1, hostComponentDesiredStateEntity2, clusters3, stackDAO4, hostDAO5, serviceComponentDesiredStateDAO6, hostComponentStateDAO7, hostComponentDesiredStateDAO8, ambariEventPublisher9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        long long0 = org.apache.ambari.server.orm.entities.ResourceEntity.AMBARI_RESOURCE_ID;
        org.junit.Assert.assertTrue(long0 == 1L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.collections.Predicate predicate0 = null;
        try {
            org.apache.ambari.server.collections.functors.NotPredicate notPredicate1 = new org.apache.ambari.server.collections.functors.NotPredicate(predicate0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.ambari.server.state.svccomphost.ServiceComponentHostUninstallEvent serviceComponentHostUninstallEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostUninstallEvent("ACTION_USER_NAME", "validate_config", (long) (short) 10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.ambari.server.topology.ConfigRecommendationStrategy configRecommendationStrategy0 = org.apache.ambari.server.topology.ConfigRecommendationStrategy.ALWAYS_APPLY;
        org.junit.Assert.assertTrue("'" + configRecommendationStrategy0 + "' != '" + org.apache.ambari.server.topology.ConfigRecommendationStrategy.ALWAYS_APPLY + "'", configRecommendationStrategy0.equals(org.apache.ambari.server.topology.ConfigRecommendationStrategy.ALWAYS_APPLY));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.ambari.server.api.resources.ViewUrlResourceDefinition viewUrlResourceDefinition0 = new org.apache.ambari.server.api.resources.ViewUrlResourceDefinition();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_TOGGLE_MAINTENANCE;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_TOGGLE_MAINTENANCE + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_TOGGLE_MAINTENANCE));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Set<org.apache.ambari.server.state.Cluster> set_cluster0 = org.apache.ambari.server.utils.RetryHelper.getAffectedClusters();
        org.junit.Assert.assertNotNull(set_cluster0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.google.inject.Injector injector0 = null;
        try {
            com.google.common.eventbus.EventBus eventBus1 = org.apache.ambari.server.utils.EventBusSynchronizer.synchronizeAmbariEventPublisher(injector0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosConfigDataFile.DATA_FILE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "configs.dat" + "'", str0.equals("configs.dat"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceConfigVersionResourceProvider.SERVICE_CONFIG_VERSION_CREATE_TIME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "createtime" + "'", str0.equals("createtime"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
        org.apache.ambari.server.orm.helpers.dbms.DerbyHelper derbyHelper1 = new org.apache.ambari.server.orm.helpers.dbms.DerbyHelper(databasePlatform0);
        java.lang.StringBuilder stringBuilder2 = null;
        org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo4 = null;
        try {
            java.lang.StringBuilder stringBuilder6 = derbyHelper1.writeSetNullableString(stringBuilder2, "configs.dat", dBColumnInfo4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.METRIC_RETRIEVAL_SERVICE_THREADPOOL_WORKER_QUEUE_SIZE;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys ambariLdapConfigurationKeys0 = org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.ANONYMOUS_BIND;
        org.junit.Assert.assertTrue("'" + ambariLdapConfigurationKeys0 + "' != '" + org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.ANONYMOUS_BIND + "'", ambariLdapConfigurationKeys0.equals(org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.ANONYMOUS_BIND));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_DRIVER;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.ambari.server.state.Service service0 = null;
        org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity serviceComponentDesiredStateEntity1 = null;
        org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo2 = null;
        org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO3 = null;
        org.apache.ambari.server.orm.dao.ClusterServiceDAO clusterServiceDAO4 = null;
        org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO hostComponentDesiredStateDAO5 = null;
        org.apache.ambari.server.state.ServiceComponentHostFactory serviceComponentHostFactory6 = null;
        org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher7 = null;
        try {
            org.apache.ambari.server.state.ServiceComponentImpl serviceComponentImpl8 = new org.apache.ambari.server.state.ServiceComponentImpl(service0, serviceComponentDesiredStateEntity1, ambariMetaInfo2, serviceComponentDesiredStateDAO3, clusterServiceDAO4, hostComponentDesiredStateDAO5, serviceComponentHostFactory6, ambariEventPublisher7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.ambari.server.serveraction.upgrades.FixOozieAdminUsers fixOozieAdminUsers0 = new org.apache.ambari.server.serveraction.upgrades.FixOozieAdminUsers();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionLinkResourceProvider.EXTENSION_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ExtensionLink/extension_name" + "'", str0.equals("ExtensionLink/extension_name"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.IP_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ip" + "'", str0.equals("ip"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.ambari.server.controller.utilities.ClusterControllerHelper clusterControllerHelper0 = new org.apache.ambari.server.controller.utilities.ClusterControllerHelper();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.CURRENT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CURRENT" + "'", str0.equals("CURRENT"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosServerAction.DATA_DIRECTORY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "data_directory" + "'", str0.equals("data_directory"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_VERSION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Clusters/version" + "'", str0.equals("Clusters/version"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int i0 = org.apache.ambari.server.proxy.ProxyService.URL_READ_TIMEOUT;
        org.junit.Assert.assertTrue(i0 == 15000);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.ambari.server.state.UpgradeContext upgradeContext0 = null;
        try {
            org.apache.ambari.server.state.stack.ConfigUpgradePack configUpgradePack1 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.ConfigurationPackBuilder.build(upgradeContext0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String str0 = org.apache.ambari.server.state.services.AlertNoticeDispatchService.AMBARI_DISPATCH_CREDENTIAL_PASSWORD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari.dispatch.credential.password" + "'", str0.equals("ambari.dispatch.credential.password"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.ambari.server.controller.utilities.LoginContextHelper loginContextHelper0 = new org.apache.ambari.server.controller.utilities.LoginContextHelper();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.ambari.server.orm.dao.BlueprintDAO blueprintDAO0 = null;
        org.apache.ambari.server.topology.BlueprintFactory.init(blueprintDAO0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.SERVICE_COMPONENT_HISTORY_TABLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "servicecomponent_history" + "'", str0.equals("servicecomponent_history"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.EXECUTION_SCHEDULER_THREADS;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.STACK_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Artifacts/stack_name" + "'", str0.equals("Artifacts/stack_name"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = null;
        org.apache.ambari.server.checks.CheckDescription.SERVICES_HIVE_DYNAMIC_SERVICE_DISCOVERY = checkDescription0;
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.ambari.server.actionmanager.ActionType actionType0 = org.apache.ambari.server.actionmanager.ActionType.SYSTEM;
        org.junit.Assert.assertTrue("'" + actionType0 + "' != '" + org.apache.ambari.server.actionmanager.ActionType.SYSTEM + "'", actionType0.equals(org.apache.ambari.server.actionmanager.ActionType.SYSTEM));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String str0 = org.apache.ambari.server.utils.AmbariPath.rootDirectory;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ArtifactResourceProvider.ARTIFACT_DATA_PROPERTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "artifact_data" + "'", str0.equals("artifact_data"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.ambari.server.state.ServiceInfo.Selection selection0 = org.apache.ambari.server.state.ServiceInfo.Selection.DEFAULT;
        org.junit.Assert.assertTrue("'" + selection0 + "' != '" + org.apache.ambari.server.state.ServiceInfo.Selection.DEFAULT + "'", selection0.equals(org.apache.ambari.server.state.ServiceInfo.Selection.DEFAULT));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.ambari.server.checks.ConfigurationMergeCheck configurationMergeCheck0 = new org.apache.ambari.server.checks.ConfigurationMergeCheck();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_RCA_USER_NAME;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.actionVerb;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Configuring" + "'", str0.equals("Configuring"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_VIEW_METRICS;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_VIEW_METRICS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_VIEW_METRICS));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str0 = org.eclipse.jetty.util.component.AbstractLifeCycle.STARTED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "STARTED" + "'", str0.equals("STARTED"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.ambari.server.api.services.Request request0 = null;
        try {
            java.lang.String str2 = org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreatorHelper.getNamedProperty(request0, "Configuring");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity, java.lang.Long> singularattribute_hostRoleCommandEntity_long0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.lastAttemptTime;
        org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_long0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.HBASE_REGIONSERVER;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity, java.lang.Long> singularattribute_hostEntity_long0 = null;
        org.apache.ambari.server.orm.entities.HostEntity_.hostId = singularattribute_hostEntity_long0;
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.REQUEST_BODY_EMPTY_ERROR_MESSAGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Request body for Blueprint create request is empty" + "'", str0.equals("Request body for Blueprint create request is empty"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
        org.apache.ambari.server.orm.helpers.dbms.DerbyHelper derbyHelper1 = new org.apache.ambari.server.orm.helpers.dbms.DerbyHelper(databasePlatform0);
        boolean b2 = derbyHelper1.isConstraintSupportedAfterNullability();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity, java.lang.String> singularattribute_hostRoleCommandEntity_str0 = null;
        org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.errorLog = singularattribute_hostRoleCommandEntity_str0;
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider.MEMBERSHIPS_CREATED_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Event/summary/memberships/created" + "'", str0.equals("Event/summary/memberships/created"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher0 = null;
        org.apache.ambari.server.controller.KerberosHelper kerberosHelper1 = null;
        org.apache.ambari.server.state.Clusters clusters2 = null;
        org.apache.ambari.server.controller.utilities.KerberosIdentityCleaner kerberosIdentityCleaner3 = new org.apache.ambari.server.controller.utilities.KerberosIdentityCleaner(ambariEventPublisher0, kerberosHelper1, clusters2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.ambari.server.checks.LZOCheck lZOCheck0 = new org.apache.ambari.server.checks.LZOCheck();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelperImpl.SET_KEYTAB;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SET_KEYTAB" + "'", str0.equals("SET_KEYTAB"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.SERVER_VERSION_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "version" + "'", str0.equals("version"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.ambari.server.checks.InstallPackagesCheck installPackagesCheck0 = new org.apache.ambari.server.checks.InstallPackagesCheck();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.ambari.server.controller.internal.Stack stack0 = null;
        org.apache.ambari.server.topology.validators.UnitValidatedProperty unitValidatedProperty1 = null;
        try {
            org.apache.ambari.server.controller.internal.UnitUpdater.PropertyUnit propertyUnit2 = org.apache.ambari.server.controller.internal.UnitUpdater.PropertyUnit.of(stack0, unitValidatedProperty1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        try {
            org.apache.ambari.server.update.HostUpdateHelper.UpdateHelperModule updateHelperModule0 = new org.apache.ambari.server.update.HostUpdateHelper.UpdateHelperModule();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity, java.lang.String> singularattribute_alertDefinitionEntity_str0 = null;
        org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.definitionName = singularattribute_alertDefinitionEntity_str0;
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_AUTO_START;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_AUTO_START + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MANAGE_AUTO_START));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.ambari.server.state.stack.upgrade.HostOrderItem.HostOrderActionType hostOrderActionType0 = org.apache.ambari.server.state.stack.upgrade.HostOrderItem.HostOrderActionType.SERVICE_CHECK;
        org.junit.Assert.assertTrue("'" + hostOrderActionType0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.HostOrderItem.HostOrderActionType.SERVICE_CHECK + "'", hostOrderActionType0.equals(org.apache.ambari.server.state.stack.upgrade.HostOrderItem.HostOrderActionType.SERVICE_CHECK));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.KERBEROS_OPERATION_VERIFY_KDC_TRUST;
        org.junit.Assert.assertNotNull(configurationproperty_b0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.ambari.server.state.Cluster cluster0 = null;
        java.util.Map<java.lang.String, org.apache.ambari.server.state.Config> map_str_config5 = null;
        java.util.Map<java.lang.Long, org.apache.ambari.server.state.Host> map_long_host6 = null;
        org.apache.ambari.server.state.Clusters clusters7 = null;
        org.apache.ambari.server.state.ConfigFactory configFactory8 = null;
        org.apache.ambari.server.orm.dao.ClusterDAO clusterDAO9 = null;
        org.apache.ambari.server.orm.dao.HostDAO hostDAO10 = null;
        org.apache.ambari.server.orm.dao.ConfigGroupDAO configGroupDAO11 = null;
        org.apache.ambari.server.orm.dao.ConfigGroupConfigMappingDAO configGroupConfigMappingDAO12 = null;
        org.apache.ambari.server.orm.dao.ConfigGroupHostMappingDAO configGroupHostMappingDAO13 = null;
        org.apache.ambari.server.logging.LockFactory lockFactory14 = null;
        try {
            org.apache.ambari.server.state.configgroup.ConfigGroupImpl configGroupImpl15 = new org.apache.ambari.server.state.configgroup.ConfigGroupImpl(cluster0, "hi!", "artifact_data", "hi!", "", map_str_config5, map_long_host6, clusters7, configFactory8, clusterDAO9, hostDAO10, configGroupDAO11, configGroupConfigMappingDAO12, configGroupHostMappingDAO13, lockFactory14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Long> configurationproperty_long0 = org.apache.ambari.server.configuration.Configuration.PROPERTY_PROVIDER_THREADPOOL_COMPLETION_TIMEOUT;
        org.junit.Assert.assertNotNull(configurationproperty_long0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Set<java.lang.String> set_str0 = null;
        org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = set_str0;
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.ALL_PROPERTIES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/*" + "'", str0.equals("Hosts/*"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int i0 = org.apache.ambari.server.api.services.BaseRequest.DEFAULT_PAGE_SIZE;
        org.junit.Assert.assertTrue(i0 == 20);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.ambari.server.state.theme.ConfigPlacement configPlacement0 = new org.apache.ambari.server.state.theme.ConfigPlacement();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Integer i0 = org.apache.ambari.server.utils.StageUtils.DEFAULT_PING_PORT;
        org.junit.Assert.assertTrue("'" + i0 + "' != '" + 8670 + "'", i0.equals(8670));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryResourceProvider.REPOSITORY_DISTRIBUTION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Repositories/distribution" + "'", str0.equals("Repositories/distribution"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryResourceProvider.REPOSITORY_REPOSITORY_VERSION_ID_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Repositories/repository_version_id" + "'", str0.equals("Repositories/repository_version_id"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.ambari.server.metrics.system.MetricsSource metricsSource1 = org.apache.ambari.server.metrics.system.impl.MetricsServiceImpl.getSource("ExtensionLink/extension_name");
        org.junit.Assert.assertNull(metricsSource1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.google.inject.Injector injector0 = null;
        try {
            org.apache.ambari.server.upgrade.UpdateAlertScriptPaths updateAlertScriptPaths1 = new org.apache.ambari.server.upgrade.UpdateAlertScriptPaths(injector0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.collections.Predicate predicate0 = null;
        org.apache.commons.collections.Predicate predicate1 = null;
        try {
            org.apache.ambari.server.collections.functors.OrPredicate orPredicate2 = new org.apache.ambari.server.collections.functors.OrPredicate(predicate0, predicate1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.CLIENT_API_SSL_TSTR_NAME;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity, byte[]> singularattribute_stageEntity_byte_array0 = null;
        org.apache.ambari.server.orm.entities.StageEntity_.hostParamsStage = singularattribute_stageEntity_byte_array0;
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map_str_map_str_str0 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> map_str_map_str_map_str_str1 = null;
        org.apache.ambari.server.state.ConfigHelper.processHiddenAttribute(map_str_map_str_str0, map_str_map_str_map_str_str1, "Event/summary/memberships/created", true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str0 = org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfileBuilder.NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "name" + "'", str0.equals("name"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat bSStat0 = org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat.ERROR;
        org.junit.Assert.assertTrue("'" + bSStat0 + "' != '" + org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat.ERROR + "'", bSStat0.equals(org.apache.ambari.server.bootstrap.BootStrapStatus.BSStat.ERROR));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType stackAdvisorCommandType0 = org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.VALIDATE_CONFIGURATIONS;
        org.junit.Assert.assertTrue("'" + stackAdvisorCommandType0 + "' != '" + org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.VALIDATE_CONFIGURATIONS + "'", stackAdvisorCommandType0.equals(org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.VALIDATE_CONFIGURATIONS));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_RCA_USER_PASSWD;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.UNLIMITED_KEY_JCE_REQUIRED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "unlimited_key_jce_required" + "'", str0.equals("unlimited_key_jce_required"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SERVER_VERSION_FILE;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfile quickLinksProfile0 = new org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfile();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.ambari.server.topology.AmbariContext.TaskType taskType0 = org.apache.ambari.server.topology.AmbariContext.TaskType.START;
        org.junit.Assert.assertTrue("'" + taskType0 + "' != '" + org.apache.ambari.server.topology.AmbariContext.TaskType.START + "'", taskType0.equals(org.apache.ambari.server.topology.AmbariContext.TaskType.START));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str0 = org.apache.hadoop.metrics2.sink.timeline.AbstractTimelineMetricsSink.COLLECTOR_HOSTS_PROPERTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "collector.hosts" + "'", str0.equals("collector.hosts"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.ambari.server.state.stack.TrimmingAdapter trimmingAdapter0 = new org.apache.ambari.server.state.stack.TrimmingAdapter();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.JCE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "jce_name" + "'", str0.equals("jce_name"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider.REPOSITORY_UPGRADES_SUPPORTED_TYPES_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CompatibleRepositoryVersions/upgrade_types" + "'", str0.equals("CompatibleRepositoryVersions/upgrade_types"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
        try {
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo1 = org.apache.ambari.server.controller.utilities.PropertyHelper.getJMXPropertyIds(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.ambari.server.collections.PredicateUtils predicateUtils0 = new org.apache.ambari.server.collections.PredicateUtils();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.JWT_AUTH_ENABLED;
        org.junit.Assert.assertNotNull(configurationproperty_b0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.ambari.server.api.services.Request request0 = null;
        try {
            java.lang.String str2 = org.apache.ambari.server.audit.request.eventcreator.RequestAuditEventCreatorHelper.getNamedProperty(request0, "SET_KEYTAB");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str0 = org.apache.ambari.server.api.services.serializers.CsvSerializer.PROPERTY_COLUMN_MAP;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "csv_column_map" + "'", str0.equals("csv_column_map"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.ambari.server.topology.validators.TopologyValidatorService topologyValidatorService0 = new org.apache.ambari.server.topology.validators.TopologyValidatorService();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ConfigureTask.PARAMETER_INSERTIONS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "configure-task-insertions" + "'", str0.equals("configure-task-insertions"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.regex.Pattern pattern1 = null;
        try {
            boolean b2 = org.apache.ambari.server.checks.HardcodedStackVersionPropertiesCheck.stringContainsVersionHardcode("Repositories/distribution", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.ambari.server.orm.entities.RequestScheduleBatchRequestEntityPK requestScheduleBatchRequestEntityPK0 = new org.apache.ambari.server.orm.entities.RequestScheduleBatchRequestEntityPK();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.ambari.server.controller.spi.ProviderModule providerModule0 = null;
        org.apache.ambari.server.view.ViewProviderModule viewProviderModule1 = org.apache.ambari.server.view.ViewProviderModule.getViewProviderModule(providerModule0);
        org.junit.Assert.assertNotNull(viewProviderModule1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceResourceProvider.SERVICE_SERVICE_STATE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ServiceInfo/state" + "'", str0.equals("ServiceInfo/state"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.ID_COLUMN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "id" + "'", str0.equals("id"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.ambari.server.api.services.RequestService requestService0 = new org.apache.ambari.server.api.services.RequestService();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.ambari.server.agent.AgentEnv agentEnv0 = new org.apache.ambari.server.agent.AgentEnv();
        java.lang.String[] str_array1 = agentEnv0.getExistingRepos();
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.ambari.server.utils.ShellCommandUtil.InteractiveHandler interactiveHandler3 = null;
        try {
            org.apache.ambari.server.utils.ShellCommandUtil.Result result5 = org.apache.ambari.server.utils.ShellCommandUtil.runCommand(str_array1, map_str_str2, interactiveHandler3, true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(str_array1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryResourceProvider.REPOSITORY_VERIFY_BASE_URL_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Repositories/verify_base_url" + "'", str0.equals("Repositories/verify_base_url"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.ambari.server.controller.utilities.StreamProvider streamProvider0 = null;
        org.apache.ambari.server.state.Clusters clusters1 = null;
        java.util.Map<java.lang.String, java.util.List<org.apache.ambari.server.controller.internal.HttpPropertyProvider.HttpPropertyRequest>> map_str_list_httpPropertyRequest6 = null;
        try {
            org.apache.ambari.server.controller.internal.HttpPropertyProvider httpPropertyProvider7 = new org.apache.ambari.server.controller.internal.HttpPropertyProvider(streamProvider0, clusters1, "Clusters/version", "createtime", "configure-task-insertions", "version", map_str_list_httpPropertyRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.ambari.server.controller.utilities.RemovableIdentities removableIdentities0 = org.apache.ambari.server.controller.utilities.RemovableIdentities.none();
        org.junit.Assert.assertNotNull(removableIdentities0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.WIDGETLAYOUT_SCOPE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/scope" + "'", str0.equals("WidgetLayoutInfo/scope"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_START_STOP;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_START_STOP + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_START_STOP));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewVersionResourceProvider.PARAMETERS_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewVersionInfo/parameters" + "'", str0.equals("ViewVersionInfo/parameters"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.ambari.server.state.Cluster cluster1 = null;
        try {
            org.apache.ambari.server.utils.SecretReference secretReference2 = new org.apache.ambari.server.utils.SecretReference("Event/summary/memberships/created", cluster1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Map<java.lang.String, java.lang.String> map_str_str0 = null;
        try {
            org.apache.ambari.server.controller.AmbariServer.enableLog4jMonitor(map_str_str0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.ambari.server.events.ServiceComponentUninstalledEvent serviceComponentUninstalledEvent8 = new org.apache.ambari.server.events.ServiceComponentUninstalledEvent(0L, "artifact_data", "id", "servicecomponent_history", "collector.hosts", "hi!", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        boolean b0 = org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricsCacheSizeOfEngine.DEFAULT_ABORT_WHEN_MAX_DEPTH_EXCEEDED;
        org.junit.Assert.assertTrue(b0 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String str0 = org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheProvider.TIMELINE_METRIC_CACHE_INSTANCE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "timelineMetricCache" + "'", str0.equals("timelineMetricCache"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.COMMAND_EXECUTION_TYPE;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_RCA_URL;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.UPGRADE_FAIL_ON_CHECK_WARNINGS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Upgrade/fail_on_check_warnings" + "'", str0.equals("Upgrade/fail_on_check_warnings"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String[] str_array0 = org.eclipse.persistence.logging.SessionLog.loggerCatagories;
        org.junit.Assert.assertNotNull(str_array0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.net.URI uRI0 = null;
        org.apache.ambari.server.state.stack.RepoUrlInfoCallable repoUrlInfoCallable1 = new org.apache.ambari.server.state.stack.RepoUrlInfoCallable(uRI0);
        try {
            java.util.Map<org.apache.ambari.server.stack.StackModule, org.apache.ambari.server.state.stack.RepoUrlInfoCallable.RepoUrlInfoResult> map_stackModule_repoUrlInfoResult2 = org.apache.ambari.server.utils.RetryHelper.executeWithRetry((java.util.concurrent.Callable<java.util.Map<org.apache.ambari.server.stack.StackModule, org.apache.ambari.server.state.stack.RepoUrlInfoCallable.RepoUrlInfoResult>>) repoUrlInfoCallable1);
            org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.AmbariException");
        } catch (org.apache.ambari.server.AmbariException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.ambari.server.state.kerberos.KerberosDescriptorUpdateHelper kerberosDescriptorUpdateHelper0 = new org.apache.ambari.server.state.kerberos.KerberosDescriptorUpdateHelper();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.AMBARI_JAVA_VERSION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari_java_version" + "'", str0.equals("ambari_java_version"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.ambari.server.serveraction.upgrades.HBaseEnvMaxDirectMemorySizeAction hBaseEnvMaxDirectMemorySizeAction0 = new org.apache.ambari.server.serveraction.upgrades.HBaseEnvMaxDirectMemorySizeAction();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.ambari.server.state.stack.upgrade.ExecuteHostType executeHostType0 = org.apache.ambari.server.state.stack.upgrade.ExecuteHostType.MASTER;
        org.junit.Assert.assertTrue("'" + executeHostType0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.ExecuteHostType.MASTER + "'", executeHostType0.equals(org.apache.ambari.server.state.stack.upgrade.ExecuteHostType.MASTER));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.ambari.server.utils.EventBusSynchronizer eventBusSynchronizer0 = new org.apache.ambari.server.utils.EventBusSynchronizer();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.ambari.server.state.ServiceOsSpecific serviceOsSpecific1 = new org.apache.ambari.server.state.ServiceOsSpecific("hi!");
        org.apache.ambari.server.state.ServiceOsSpecific.Repo repo2 = serviceOsSpecific1.getRepo();
        org.junit.Assert.assertNull(repo2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceComponentResourceProvider.COMPONENT_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceComponents/component_name" + "'", str0.equals("RootServiceComponents/component_name"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.ambari.server.checks.AutoStartDisabledCheck autoStartDisabledCheck0 = new org.apache.ambari.server.checks.AutoStartDisabledCheck();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.google.common.base.Function<org.apache.ambari.server.state.RepositoryInfo, java.lang.String> function_repositoryInfo_str0 = org.apache.ambari.server.state.RepositoryInfo.GET_OSTYPE_FUNCTION;
        org.junit.Assert.assertNotNull(function_repositoryInfo_str0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeResourceProvider.UPGRADE_VERSIONS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Upgrade/versions" + "'", str0.equals("Upgrade/versions"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str0 = org.apache.ambari.server.orm.entities.PermissionEntity.VIEW_USER_PERMISSION_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "VIEW.USER" + "'", str0.equals("VIEW.USER"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFile.KEYTAB_FILE_GROUP_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "keytab_file_group_name" + "'", str0.equals("keytab_file_group_name"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity, java.lang.String> singularattribute_hostEntity_str0 = null;
        org.apache.ambari.server.orm.entities.HostEntity_.hostAttributes = singularattribute_hostEntity_str0;
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.ambari.server.api.services.ServiceService serviceService1 = new org.apache.ambari.server.api.services.ServiceService("configure-task-insertions");
        javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
        javax.ws.rs.core.UriInfo uriInfo4 = null;
        try {
            javax.ws.rs.core.Response response7 = serviceService1.deleteArtifact("version", httpHeaders3, uriInfo4, "timelineMetricCache", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.String str0 = org.apache.ambari.server.state.UpgradeContext.COMMAND_PARAM_CLUSTER_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "clusterName" + "'", str0.equals("clusterName"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.String str0 = org.apache.ambari.server.api.services.BlueprintService.BLUEPRINT_REQUEST_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "org.apache.ambari.server.controller.BlueprintSwagger" + "'", str0.equals("org.apache.ambari.server.controller.BlueprintSwagger"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_REPOSITORY_VERSION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/repository_version" + "'", str0.equals("UpgradeChecks/repository_version"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.INSTANCE_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/instance_name" + "'", str0.equals("ViewInstanceInfo/instance_name"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.AGENT_THREADPOOL_SIZE;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelper.DIRECTIVE_HOSTS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "regenerate_hosts" + "'", str0.equals("regenerate_hosts"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.String str0 = org.apache.ambari.server.upgrade.AbstractUpgradeCatalog.CONFIGURATION_TYPE_RANGER_HIVE_PLUGIN_PROPERTIES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ranger-hive-plugin-properties" + "'", str0.equals("ranger-hive-plugin-properties"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        try {
            org.apache.ambari.server.state.ExtensionId extensionId1 = new org.apache.ambari.server.state.ExtensionId("CompatibleRepositoryVersions/upgrade_types");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.SERVICE_CHECK_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "service_check_type" + "'", str0.equals("service_check_type"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationResourceProvider.PROPERTY_PROPERTY_TYPE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurations/property_type" + "'", str0.equals("StackConfigurations/property_type"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertTargetEntity, java.lang.String> singularattribute_alertTargetEntity_str0 = null;
        org.apache.ambari.server.orm.entities.AlertTargetEntity_.description = singularattribute_alertTargetEntity_str0;
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.WidgetResourceProvider.WIDGET_DESCRIPTION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetInfo/description" + "'", str0.equals("WidgetInfo/description"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.ambari.server.state.quicklinksprofile.Service service0 = new org.apache.ambari.server.state.quicklinksprofile.Service();
        java.util.List<org.apache.ambari.server.state.quicklinksprofile.Filter> list_filter1 = service0.getFilters();
        org.junit.Assert.assertNull(list_filter1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        int i0 = org.apache.ambari.server.security.authorization.AuthorizationHelper.getAuthenticatedId();
        org.junit.Assert.assertTrue(i0 == (-1));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.ambari.server.orm.dao.PermissionDAO permissionDAO0 = null;
        org.apache.ambari.server.controller.internal.ViewPermissionResourceProvider.init(permissionDAO0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.AMBARI_SERVER_ACTION;
        org.apache.ambari.server.RoleCommand roleCommand1 = org.apache.ambari.server.RoleCommand.UPGRADE;
        org.apache.ambari.server.stageplanner.RoleGraphNode roleGraphNode2 = new org.apache.ambari.server.stageplanner.RoleGraphNode(role0, roleCommand1);
        roleGraphNode2.decrementInDegree();
        org.junit.Assert.assertNotNull(role0);
        org.junit.Assert.assertTrue("'" + roleCommand1 + "' != '" + org.apache.ambari.server.RoleCommand.UPGRADE + "'", roleCommand1.equals(org.apache.ambari.server.RoleCommand.UPGRADE));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertHistoryResourceProvider.ALERT_HISTORY_TIMESTAMP;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertHistory/timestamp" + "'", str0.equals("AlertHistory/timestamp"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Long> configurationproperty_long0 = org.apache.ambari.server.configuration.Configuration.EXECUTION_SCHEDULER_WAIT;
        org.junit.Assert.assertNotNull(configurationproperty_long0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.ambari.server.controller.StackServiceRequest stackServiceRequest3 = new org.apache.ambari.server.controller.StackServiceRequest("configure-task-insertions", "timelineMetricCache", "ip");
        stackServiceRequest3.setCredentialStoreSupported("version");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.String str0 = org.apache.ambari.server.state.ValueAttributesInfo.ENTRIES_EDITABLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "entries_editable" + "'", str0.equals("entries_editable"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.String str0 = org.apache.ambari.server.state.ValueAttributesInfo.PROPERTY_FILE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "property-file-name" + "'", str0.equals("property-file-name"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_STARTED;
        org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_STARTED + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_STARTED));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String str0 = org.apache.ambari.server.api.handlers.BaseManagementHandler.RESOURCES_NODE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "resources" + "'", str0.equals("resources"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.ambari.server.controller.RequestsByStatusesRequest requestsByStatusesRequest0 = new org.apache.ambari.server.controller.RequestsByStatusesRequest();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.ambari.server.KdcServerConnectionVerification.ConnectionProtocol connectionProtocol0 = org.apache.ambari.server.KdcServerConnectionVerification.ConnectionProtocol.TCP;
        org.junit.Assert.assertTrue("'" + connectionProtocol0 + "' != '" + org.apache.ambari.server.KdcServerConnectionVerification.ConnectionProtocol.TCP + "'", connectionProtocol0.equals(org.apache.ambari.server.KdcServerConnectionVerification.ConnectionProtocol.TCP));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.ambari.server.security.authorization.DuplicateLdapUserFoundAuthenticationException duplicateLdapUserFoundAuthenticationException1 = new org.apache.ambari.server.security.authorization.DuplicateLdapUserFoundAuthenticationException("Event/summary/memberships/created");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.CLIENT_RETRY;
        org.junit.Assert.assertNotNull(checkDescription0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.String str0 = org.apache.ambari.server.controller.spi.Request.REQUEST_INFO_BODY_PROPERTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RAW_REQUEST_BODY" + "'", str0.equals("RAW_REQUEST_BODY"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.ambari.server.state.stack.upgrade.ExecuteHostType executeHostType0 = org.apache.ambari.server.state.stack.upgrade.ExecuteHostType.ANY;
        org.junit.Assert.assertTrue("'" + executeHostType0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.ExecuteHostType.ANY + "'", executeHostType0.equals(org.apache.ambari.server.state.stack.upgrade.ExecuteHostType.ANY));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.ambari.server.api.resources.AlertResourceDefinition alertResourceDefinition0 = new org.apache.ambari.server.api.resources.AlertResourceDefinition();
        java.util.List<org.apache.ambari.server.api.resources.ResourceDefinition.PostProcessor> list_postProcessor1 = alertResourceDefinition0.getPostProcessors();
        org.junit.Assert.assertNotNull(list_postProcessor1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.KERBEROS_AUTH_SPNEGO_KEYTAB_FILE;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.COMPONENTS_EXIST_IN_TARGET_REPO;
        org.apache.ambari.server.checks.CheckDescription.CONFIG_MERGE = checkDescription0;
        org.junit.Assert.assertNotNull(checkDescription0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.ambari.server.state.alert.Reporting.ReportingType reportingType0 = org.apache.ambari.server.state.alert.Reporting.ReportingType.PERCENT;
        org.junit.Assert.assertTrue("'" + reportingType0 + "' != '" + org.apache.ambari.server.state.alert.Reporting.ReportingType.PERCENT + "'", reportingType0.equals(org.apache.ambari.server.state.alert.Reporting.ReportingType.PERCENT));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.YARN_SITE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "yarn-site" + "'", str0.equals("yarn-site"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.ambari.server.topology.ClusterTopology clusterTopology0 = null;
        org.apache.ambari.server.topology.HostRequest hostRequest1 = null;
        org.apache.ambari.server.topology.tasks.InstallHostTask installHostTask3 = new org.apache.ambari.server.topology.tasks.InstallHostTask(clusterTopology0, hostRequest1, false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.ambari.server.RoleCommand roleCommand0 = org.apache.ambari.server.RoleCommand.RESTART;
        org.junit.Assert.assertTrue("'" + roleCommand0 + "' != '" + org.apache.ambari.server.RoleCommand.RESTART + "'", roleCommand0.equals(org.apache.ambari.server.RoleCommand.RESTART));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.ambari.server.api.resources.InstanceResourceDefinition instanceResourceDefinition0 = new org.apache.ambari.server.api.resources.InstanceResourceDefinition();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.String str1 = org.apache.ambari.server.utils.DateUtils.convertToReadableTime((java.lang.Long) 0L);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1969-12-31 16:00:00" + "'", str1.equals("1969-12-31 16:00:00"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.Enumeration<java.net.URL> enumeration_uRL1 = java.lang.ClassLoader.getSystemResources("unlimited_key_jce_required");
        org.junit.Assert.assertNotNull(enumeration_uRL1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.String str0 = org.apache.ambari.server.scheduler.ExecutionJob.LINEAR_EXECUTION_JOB_GROUP;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "LinearExecutionJobs" + "'", str0.equals("LinearExecutionJobs"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_SET_SERVICE_USERS_GROUPS;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_SET_SERVICE_USERS_GROUPS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_SET_SERVICE_USERS_GROUPS));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity, java.lang.Long> singularattribute_alertHistoryEntity_long0 = null;
        org.apache.ambari.server.orm.entities.AlertHistoryEntity_.alertTimestamp = singularattribute_alertHistoryEntity_long0;
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.SELECTED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1" + "'", str0.equals("1"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.ambari.server.scheduler.ExecutionScheduleManager executionScheduleManager0 = null;
        org.apache.ambari.server.state.scheduler.BatchRequestJob batchRequestJob2 = new org.apache.ambari.server.state.scheduler.BatchRequestJob(executionScheduleManager0, (long) (byte) 1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.net.URI uRI0 = null;
        org.apache.ambari.server.state.stack.RepoUrlInfoCallable repoUrlInfoCallable1 = new org.apache.ambari.server.state.stack.RepoUrlInfoCallable(uRI0);
        org.apache.ambari.server.stack.StackModule stackModule2 = null;
        repoUrlInfoCallable1.addStack(stackModule2);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity, java.lang.String> singularattribute_stageEntity_str0 = org.apache.ambari.server.orm.entities.StageEntity_.requestContext;
        org.junit.Assert.assertNull(singularattribute_stageEntity_str0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.ambari.server.controller.internal.AlertResourceProviderUtils alertResourceProviderUtils0 = new org.apache.ambari.server.controller.internal.AlertResourceProviderUtils();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.STACK_UPGRADE_AUTO_RETRY_CHECK_INTERVAL_SECS;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.JAVAX_SSL_TRUSTSTORE_PASSWORD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "javax.net.ssl.trustStorePassword" + "'", str0.equals("javax.net.ssl.trustStorePassword"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.STACK_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ThemeInfo/stack_name" + "'", str0.equals("ThemeInfo/stack_name"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_METRICS;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_METRICS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_METRICS));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.codahale.metrics.MetricFilter metricFilter0 = com.codahale.metrics.MetricFilter.ALL;
        org.junit.Assert.assertNotNull(metricFilter0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.Date date0 = null;
        try {
            java.lang.String str1 = org.apache.ambari.server.utils.DateUtils.convertDateToString(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.resetCheckResult();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.PrivilegeResourceProvider.PRINCIPAL_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PrivilegeInfo/principal_name" + "'", str0.equals("PrivilegeInfo/principal_name"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.RECOMMENDATIONS_ARTIFACTS_ROLLOVER_MAX;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RequestOperationLevel.OPERATION_SERVICE_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "operation_level/service_name" + "'", str0.equals("operation_level/service_name"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.AGENT_STACK_RETRY_ON_REPO_UNAVAILABILITY;
        org.junit.Assert.assertNotNull(configurationproperty_b0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Long> configurationproperty_long0 = org.apache.ambari.server.configuration.Configuration.AGENT_TASK_TIMEOUT;
        org.junit.Assert.assertNotNull(configurationproperty_long0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.util.List<org.apache.ambari.server.actionmanager.Stage> list_stage1 = null;
        org.apache.ambari.server.actionmanager.RequestFactory requestFactory2 = null;
        org.apache.ambari.server.actionmanager.ActionManager actionManager3 = null;
        org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest4 = null;
        org.apache.ambari.server.controller.internal.RequestStageContainer requestStageContainer5 = new org.apache.ambari.server.controller.internal.RequestStageContainer((java.lang.Long) 100L, list_stage1, requestFactory2, actionManager3, executeActionRequest4);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.ambari.server.actionmanager.Stage[] stage_array1 = new org.apache.ambari.server.actionmanager.Stage[] {};
        java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage> arraylist_stage2 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage2, stage_array1);
        org.apache.ambari.server.controller.internal.CalculatedStatus calculatedStatus4 = org.apache.ambari.server.controller.internal.CalculatedStatus.statusFromStages((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage2);
        org.apache.ambari.server.actionmanager.RequestFactory requestFactory5 = null;
        org.apache.ambari.server.actionmanager.ActionManager actionManager6 = null;
        org.apache.ambari.server.controller.internal.RequestStageContainer requestStageContainer7 = new org.apache.ambari.server.controller.internal.RequestStageContainer((java.lang.Long) 1L, (java.util.List<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage2, requestFactory5, actionManager6);
        org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest9 = null;
        org.apache.ambari.server.state.Clusters clusters10 = null;
        com.google.gson.Gson gson11 = null;
        try {
            org.apache.ambari.server.actionmanager.Request request12 = new org.apache.ambari.server.actionmanager.Request((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage2, "1969-12-31 16:00:00", executeActionRequest9, clusters10, gson11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(stage_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(calculatedStatus4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.String str0 = org.apache.ambari.server.state.UpgradeContext.COMMAND_PARAM_REQUEST_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "request_id" + "'", str0.equals("request_id"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceHostComponentResourceProvider.RESPONSE_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceHostComponents" + "'", str0.equals("RootServiceHostComponents"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.String str0 = org.eclipse.persistence.sessions.SessionProfiler.CacheHits;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Counter:CacheHits" + "'", str0.equals("Counter:CacheHits"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
        org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider1 = null;
        org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration2 = null;
        org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheProvider timelineMetricCacheProvider3 = null;
        org.apache.ambari.server.controller.metrics.MetricHostProvider metricHostProvider4 = null;
        org.apache.ambari.server.controller.metrics.MetricsServiceProvider metricsServiceProvider5 = null;
        try {
            org.apache.ambari.server.controller.metrics.MetricsReportPropertyProviderProxy metricsReportPropertyProviderProxy7 = org.apache.ambari.server.controller.metrics.MetricsReportPropertyProvider.createInstance(map_str_map_str_propertyInfo0, uRLStreamProvider1, componentSSLConfiguration2, timelineMetricCacheProvider3, metricHostProvider4, metricsServiceProvider5, "regenerate_hosts");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.ambari.server.configuration.Configuration configuration0 = null;
        try {
            org.apache.ambari.server.logging.LockFactory lockFactory1 = new org.apache.ambari.server.logging.LockFactory(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.ROLLING_UPGRADE_SKIP_PACKAGES_PREFIXES;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.String str0 = org.eclipse.jetty.util.component.AbstractLifeCycle.FAILED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "FAILED" + "'", str0.equals("FAILED"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.ZKFC;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_ADD_DELETE_COMPONENTS;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_ADD_DELETE_COMPONENTS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.HOST_ADD_DELETE_COMPONENTS));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.PARAMETER_TRANSFERS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "configure-task-transfers" + "'", str0.equals("configure-task-transfers"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
        java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type, java.lang.String> map_type_str1 = null;
        try {
            org.apache.ambari.server.controller.utilities.PropertyHelper.setKeyPropertyIds(type0, map_type_str1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.REPOSITORY_VERSION_RELEASE_COMPATIBLE_WITH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RepositoryVersions/release/compatible_with" + "'", str0.equals("RepositoryVersions/release/compatible_with"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.String str0 = org.apache.ambari.view.ViewContext.CONTEXT_ATTRIBUTE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari-view-context" + "'", str0.equals("ambari-view-context"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.COMPONENT_PROVISION_ACTION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "provision_action" + "'", str0.equals("provision_action"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackServiceResourceProvider.STACK_VERSION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackServices/stack_version" + "'", str0.equals("StackServices/stack_version"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_PROVISIONING_STATE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Clusters/provisioning_state" + "'", str0.equals("Clusters/provisioning_state"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.COMPONENTS_EXIST_IN_TARGET_REPO;
        org.apache.ambari.server.checks.CheckDescription.COMPONENTS_INSTALLATION = checkDescription0;
        org.apache.ambari.server.checks.CheckDescription.SERVICES_TEZ_DISTRIBUTED_CACHE = checkDescription0;
        org.junit.Assert.assertNotNull(checkDescription0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceHostComponentResourceProvider.COMPONENT_STATE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootServiceHostComponents/component_state" + "'", str0.equals("RootServiceHostComponents/component_state"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.Short s0 = org.apache.ambari.server.customactions.ActionDefinitionManager.MIN_TIMEOUT;
        org.junit.Assert.assertTrue("'" + s0 + "' != '" + (short) 60 + "'", s0.equals((short) 60));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        int i0 = org.apache.ambari.server.orm.entities.PermissionEntity.AMBARI_ADMINISTRATOR_PERMISSION;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.ambari.server.actionmanager.ActionType actionType0 = org.apache.ambari.server.actionmanager.ActionType.USER_REQUIRES_ADMIN;
        org.junit.Assert.assertTrue("'" + actionType0 + "' != '" + org.apache.ambari.server.actionmanager.ActionType.USER_REQUIRES_ADMIN + "'", actionType0.equals(org.apache.ambari.server.actionmanager.ActionType.USER_REQUIRES_ADMIN));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SERVER_PERSISTENCE_TYPE;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.ambari.server.api.services.ServiceService serviceService1 = new org.apache.ambari.server.api.services.ServiceService("configure-task-insertions");
        javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
        javax.ws.rs.core.UriInfo uriInfo4 = null;
        try {
            javax.ws.rs.core.Response response6 = serviceService1.getService("keytab_file_group_name", httpHeaders3, uriInfo4, "RAW_REQUEST_BODY");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity0 = null;
        org.apache.ambari.server.controller.internal.CompatibleRepositoryVersion compatibleRepositoryVersion1 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersion(repositoryVersionEntity0);
        org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType2 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING;
        compatibleRepositoryVersion1.addUpgradePackType(upgradeType2);
        org.junit.Assert.assertTrue("'" + upgradeType2 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING + "'", upgradeType2.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.ambari.server.orm.dao.ConfigGroupDAO configGroupDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupDAO();
        org.apache.ambari.server.orm.entities.ConfigGroupEntity configGroupEntity1 = null;
        try {
            configGroupDAO0.remove(configGroupEntity1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.CredentialResourceProvider.CREDENTIAL_PRINCIPAL_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Credential/principal" + "'", str0.equals("Credential/principal"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus0 = org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING_FAILED;
        org.junit.Assert.assertTrue("'" + hostRoleStatus0 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING_FAILED + "'", hostRoleStatus0.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING_FAILED));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertTargetResourceProvider.ALERT_TARGET_STATES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertTarget/alert_states" + "'", str0.equals("AlertTarget/alert_states"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.STANDARD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "STANDARD" + "'", str0.equals("STANDARD"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity, byte[]> singularattribute_stageEntity_byte_array0 = org.apache.ambari.server.orm.entities.StageEntity_.commandParamsStage;
        org.junit.Assert.assertNull(singularattribute_stageEntity_byte_array0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.ambari.server.security.ClientSecurityType clientSecurityType0 = org.apache.ambari.server.security.ClientSecurityType.PAM;
        org.junit.Assert.assertTrue("'" + clientSecurityType0 + "' != '" + org.apache.ambari.server.security.ClientSecurityType.PAM + "'", clientSecurityType0.equals(org.apache.ambari.server.security.ClientSecurityType.PAM));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.CLUSTER_ENV_STACK_NAME_PROPERTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "stack_name" + "'", str0.equals("stack_name"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceResourceProvider.SERVICE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "service_name" + "'", str0.equals("service_name"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ActionResourceProvider.DESCRIPTION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Actions/description" + "'", str0.equals("Actions/description"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder();
        org.apache.ambari.server.api.services.ResultStatus resultStatus1 = null;
        org.apache.ambari.server.audit.event.request.AddUserToGroupRequestAuditEvent.AddUserToGroupRequestAuditEventBuilder addUserToGroupRequestAuditEventBuilder2 = addUserToGroupRequestAuditEventBuilder0.withResultStatus(resultStatus1);
        org.junit.Assert.assertNotNull(addUserToGroupRequestAuditEventBuilder2);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.ambari.server.controller.spi.ClusterController clusterController0 = org.apache.ambari.server.topology.AmbariContext.getClusterController();
        org.junit.Assert.assertNotNull(clusterController0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationDependencyResourceProvider.PROPERTY_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurationDependency/property_name" + "'", str0.equals("StackConfigurationDependency/property_name"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.eclipse.persistence.logging.SessionLog sessionLog0 = org.eclipse.persistence.logging.AbstractSessionLog.getLog();
        org.junit.Assert.assertNotNull(sessionLog0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.lang.String str0 = org.apache.ambari.server.stack.StackDirectory.KERBEROS_DESCRIPTOR_PRECONFIGURE_FILE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "kerberos_preconfigure.json" + "'", str0.equals("kerberos_preconfigure.json"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.util.Properties properties0 = null;
        try {
            org.apache.ambari.server.controller.ControllerModule controllerModule1 = new org.apache.ambari.server.controller.ControllerModule(properties0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.ambari.server.state.PropertyInfo.PropertyType propertyType0 = org.apache.ambari.server.state.PropertyInfo.PropertyType.UID;
        org.junit.Assert.assertTrue("'" + propertyType0 + "' != '" + org.apache.ambari.server.state.PropertyInfo.PropertyType.UID + "'", propertyType0.equals(org.apache.ambari.server.state.PropertyInfo.PropertyType.UID));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity0 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        java.lang.String str1 = clusterConfigEntity0._persistence_get_configAttributesJson();
        java.lang.String str2 = clusterConfigEntity0.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.ambari.server.state.Service service0 = null;
        org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo2 = null;
        org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO3 = null;
        org.apache.ambari.server.orm.dao.ClusterServiceDAO clusterServiceDAO4 = null;
        org.apache.ambari.server.state.ServiceComponentHostFactory serviceComponentHostFactory5 = null;
        org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher6 = null;
        try {
            org.apache.ambari.server.state.ServiceComponentImpl serviceComponentImpl7 = new org.apache.ambari.server.state.ServiceComponentImpl(service0, "Event/summary/memberships/created", ambariMetaInfo2, serviceComponentDesiredStateDAO3, clusterServiceDAO4, serviceComponentHostFactory5, ambariEventPublisher6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.ambari.server.agent.RecoveryReport recoveryReport0 = new org.apache.ambari.server.agent.RecoveryReport();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackServiceResourceProvider.STACK_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackServices/stack_name" + "'", str0.equals("StackServices/stack_name"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_RUN_CUSTOM_COMMAND;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_RUN_CUSTOM_COMMAND + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_RUN_CUSTOM_COMMAND));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.YARN_CLIENT;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceResourceProvider.SERVICE_SERVICE_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ServiceInfo/service_name" + "'", str0.equals("ServiceInfo/service_name"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.ambari.server.checks.PreviousUpgradeCompleted previousUpgradeCompleted0 = new org.apache.ambari.server.checks.PreviousUpgradeCompleted();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_ADD_DELETE_SERVICES;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_ADD_DELETE_SERVICES + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_ADD_DELETE_SERVICES));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider.USERS_UPDATED_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Event/summary/users/updated" + "'", str0.equals("Event/summary/users/updated"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.io.File file0 = null;
        org.apache.ambari.server.security.encryption.FileBasedCredentialStore fileBasedCredentialStore1 = new org.apache.ambari.server.security.encryption.FileBasedCredentialStore(file0);
        org.apache.ambari.server.security.credential.Credential credential3 = null;
        try {
            fileBasedCredentialStore1.addCredential("ViewInstanceInfo/instance_name", credential3);
            org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.AmbariException");
        } catch (org.apache.ambari.server.AmbariException e) {
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.ambari.server.serveraction.kerberos.KDCType kDCType0 = org.apache.ambari.server.serveraction.kerberos.KDCType.MIT_KDC;
        org.junit.Assert.assertTrue("'" + kDCType0 + "' != '" + org.apache.ambari.server.serveraction.kerberos.KDCType.MIT_KDC + "'", kDCType0.equals(org.apache.ambari.server.serveraction.kerberos.KDCType.MIT_KDC));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.HOST_ID_COLUMN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "host_id" + "'", str0.equals("host_id"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.google.gson.Gson gson0 = null;
        org.apache.ambari.server.utils.StageUtils.setGson(gson0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.ambari.server.api.resources.TargetClusterResourceDefinition targetClusterResourceDefinition0 = new org.apache.ambari.server.api.resources.TargetClusterResourceDefinition();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.ambari.server.state.alert.AlertDefinition alertDefinition2 = null;
        org.apache.ambari.server.agent.AlertExecutionCommand alertExecutionCommand3 = new org.apache.ambari.server.agent.AlertExecutionCommand("Upgrade/fail_on_check_warnings", "entries_editable", alertDefinition2);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = null;
        org.apache.ambari.server.checks.CheckDescription.SERVICES_RANGER_PASSWORD_VERIFY = checkDescription0;
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity0 = new org.apache.ambari.server.orm.entities.ClusterServiceEntity();
        boolean b2 = clusterServiceEntity0._persistence_isAttributeFetched("validate_config");
        org.apache.ambari.server.orm.entities.ClusterEntity clusterEntity3 = clusterServiceEntity0.getClusterEntity();
        org.apache.ambari.server.orm.entities.ServiceDesiredStateEntity serviceDesiredStateEntity4 = clusterServiceEntity0._persistence_get_serviceDesiredStateEntity();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(clusterEntity3);
        org.junit.Assert.assertNull(serviceDesiredStateEntity4);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.ambari.server.controller.StackRequest stackRequest1 = new org.apache.ambari.server.controller.StackRequest("Credential/principal");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity0 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        java.lang.String str1 = clusterConfigEntity0._persistence_get_configAttributesJson();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        clusterConfigEntity0._persistence_setPropertyChangeListener(propertyChangeListener2);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StageResourceProvider.STAGE_STAGE_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stage/stage_id" + "'", str0.equals("Stage/stage_id"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.PrivilegeResourceProvider.PERMISSION_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PrivilegeInfo/permission_name" + "'", str0.equals("PrivilegeInfo/permission_name"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SECONDARY_NAMENODE_MUST_BE_DELETED;
        org.junit.Assert.assertNotNull(checkDescription0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RemoteClusterResourceProvider.SERVICES_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ClusterInfo/services" + "'", str0.equals("ClusterInfo/services"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.ambari.server.controller.logging.LogFileType logFileType0 = org.apache.ambari.server.controller.logging.LogFileType.AUDIT;
        org.junit.Assert.assertTrue("'" + logFileType0 + "' != '" + org.apache.ambari.server.controller.logging.LogFileType.AUDIT + "'", logFileType0.equals(org.apache.ambari.server.controller.logging.LogFileType.AUDIT));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.lang.String str0 = org.apache.hadoop.metrics2.sink.timeline.AbstractTimelineMetricsSink.TAGS_FOR_PREFIX_PROPERTY_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tagsForPrefix." + "'", str0.equals("tagsForPrefix."));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.ambari.server.agent.AgentEnv.JavaProc javaProc0 = new org.apache.ambari.server.agent.AgentEnv.JavaProc();
        boolean b1 = javaProc0.isHadoop();
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.SECONDARY_NAMENODE;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.ambari.server.security.authorization.User user1 = null;
        org.apache.ambari.server.security.authorization.AmbariGrantedAuthority[] ambariGrantedAuthority_array2 = new org.apache.ambari.server.security.authorization.AmbariGrantedAuthority[] {};
        java.util.ArrayList<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority> arraylist_ambariGrantedAuthority3 = new java.util.ArrayList<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority>) arraylist_ambariGrantedAuthority3, ambariGrantedAuthority_array2);
        org.apache.ambari.server.security.authorization.jwt.JwtAuthentication jwtAuthentication5 = new org.apache.ambari.server.security.authorization.jwt.JwtAuthentication("timelineMetricCache", user1, (java.util.Collection<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority>) arraylist_ambariGrantedAuthority3);
        boolean b6 = jwtAuthentication5.isAuthenticated();
        org.junit.Assert.assertNotNull(ambariGrantedAuthority_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.ambari.server.agent.rest.AgentResource agentResource0 = new org.apache.ambari.server.agent.rest.AgentResource();
        org.apache.ambari.server.agent.Register register1 = null;
        javax.servlet.http.HttpServletRequest httpServletRequest2 = null;
        try {
            org.apache.ambari.server.agent.RegistrationResponse registrationResponse3 = agentResource0.register(register1, httpServletRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.ambari.server.api.services.InstanceService instanceService1 = new org.apache.ambari.server.api.services.InstanceService("timelineMetricCache");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
        java.lang.String[] str_array54 = new java.lang.String[] { "PrivilegeInfo/principal_name", "hi!", "STARTED", "Upgrade/versions", "operation_level/service_name", "AlertNotice/target_id", "operation_level/service_name", "ambari-view-context", "createtime", "Stage/stage_id", "data_directory", "resources", "Stage/stage_id", "FAILED", "Configuring", "stack_name", "Event/summary/users/updated", "configure-task-transfers", "kerberos_preconfigure.json", "Repositories/distribution", "WidgetLayoutInfo/scope", "configs.dat", "Hosts/*", "WidgetLayoutInfo/scope", "Upgrade/versions", "javax.net.ssl.trustStorePassword", "Counter:CacheHits", "ambari-view-context", "Repositories/distribution", "service_check_type", "servicecomponent_history", "Hosts/*", "collector.hosts", "validate_config", "name", "kerberos_preconfigure.json", "StackServices/stack_name", "RootServiceComponents/component_name", "id", "Hosts/*", "VIEW.USER", "ViewInstanceInfo/instance_name", "ACTION_USER_NAME", "yarn-site", "Hosts/*", "stack_name", "Artifacts/stack_name", "entries_editable", "ServiceInfo/state", "provision_action", "StackConfigurationDependency/property_name", "AlertHistory/timestamp", "ViewVersionInfo/parameters" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str55, str_array54);
        try {
            org.apache.ambari.server.controller.utilities.PropertyHelper.setPropertyIds(type0, (java.util.Set<java.lang.String>) linkedhashset_str55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array54);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.VIEW_USE;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.VIEW_USE + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.VIEW_USE));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.lang.String str0 = org.apache.ambari.server.bootstrap.BootStrapImpl.DEV_VERSION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "${ambariVersion}" + "'", str0.equals("${ambariVersion}"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.io.Closeable closeable0 = null;
        org.slf4j.Logger logger1 = null;
        org.apache.ambari.server.utils.Closeables.closeLoggingExceptions(closeable0, logger1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.lang.String str0 = org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheProvider.TIMELINE_METRIC_CACHE_MANAGER_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "timelineMetricCacheManager" + "'", str0.equals("timelineMetricCacheManager"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.ambari.server.state.alert.SourceType sourceType0 = org.apache.ambari.server.state.alert.SourceType.RECOVERY;
        org.junit.Assert.assertTrue("'" + sourceType0 + "' != '" + org.apache.ambari.server.state.alert.SourceType.RECOVERY + "'", sourceType0.equals(org.apache.ambari.server.state.alert.SourceType.RECOVERY));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.DeleteUserRequestAuditEventBuilder deleteUserRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.DeleteUserRequestAuditEventBuilder();
        org.apache.ambari.server.audit.event.request.DeleteUserRequestAuditEvent.DeleteUserRequestAuditEventBuilder deleteUserRequestAuditEventBuilder2 = deleteUserRequestAuditEventBuilder0.withTimestamp((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(deleteUserRequestAuditEventBuilder2);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.ambari.server.security.authorization.ResourceType resourceType0 = org.apache.ambari.server.security.authorization.ResourceType.AMBARI;
        org.junit.Assert.assertTrue("'" + resourceType0 + "' != '" + org.apache.ambari.server.security.authorization.ResourceType.AMBARI + "'", resourceType0.equals(org.apache.ambari.server.security.authorization.ResourceType.AMBARI));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.lang.String str0 = org.eclipse.persistence.logging.SessionLog.EJB;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ejb" + "'", str0.equals("ejb"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.ambari.server.state.action.ActionType actionType1 = null;
        org.apache.ambari.server.state.action.ActionId actionId2 = new org.apache.ambari.server.state.action.ActionId((-1L), actionType1);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.RECOVERY_ENABLED_COMPONENTS;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.API_CSRF_PREVENTION;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.ambari.server.state.alert.MetricSource metricSource0 = new org.apache.ambari.server.state.alert.MetricSource();
        org.apache.ambari.server.state.alert.Reporting reporting1 = metricSource0.getReporting();
        org.apache.ambari.server.state.alert.SourceType sourceType2 = metricSource0.getType();
        org.junit.Assert.assertNull(reporting1);
        org.junit.Assert.assertNull(sourceType2);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.ambari.server.alerts.AmbariPerformanceRunnable ambariPerformanceRunnable1 = new org.apache.ambari.server.alerts.AmbariPerformanceRunnable("ranger-hive-plugin-properties");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.SQOOP;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentProcessResourceProvider.HC_PROCESS_STATUS_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostComponentProcess/status" + "'", str0.equals("HostComponentProcess/status"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.String str0 = org.apache.ambari.server.upgrade.AbstractUpgradeCatalog.PROPERTY_RANGER_KNOX_PLUGIN_ENABLED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ranger-knox-plugin-enabled" + "'", str0.equals("ranger-knox-plugin-enabled"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.ambari.server.events.publishers.JPAEventPublisher jPAEventPublisher0 = new org.apache.ambari.server.events.publishers.JPAEventPublisher();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.ambari.server.controller.ControllerResponse controllerResponse1 = new org.apache.ambari.server.controller.ControllerResponse("");
        java.lang.String str2 = controllerResponse1.getName();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.ambari.server.topology.AsyncCallableService.RetryTaskSilently retryTaskSilently2 = new org.apache.ambari.server.topology.AsyncCallableService.RetryTaskSilently();
        org.apache.ambari.server.security.credential.InvalidCredentialValueException invalidCredentialValueException3 = new org.apache.ambari.server.security.credential.InvalidCredentialValueException("servicecomponent_history", (java.lang.Throwable) retryTaskSilently2);
        org.apache.ambari.server.controller.spi.NoSuchParentResourceException noSuchParentResourceException4 = new org.apache.ambari.server.controller.spi.NoSuchParentResourceException("ejb", (java.lang.Throwable) invalidCredentialValueException3);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.ICON_PATH_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/icon_path" + "'", str0.equals("ViewInstanceInfo/icon_path"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.lang.String str0 = org.apache.ambari.server.orm.entities.PermissionEntity.AMBARI_ADMINISTRATOR_PERMISSION_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AMBARI.ADMINISTRATOR" + "'", str0.equals("AMBARI.ADMINISTRATOR"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.ambari.server.orm.entities.StageEntity stageEntity0 = null;
        org.apache.ambari.server.orm.dao.HostRoleCommandDAO hostRoleCommandDAO1 = null;
        org.apache.ambari.server.actionmanager.ActionDBAccessor actionDBAccessor2 = null;
        org.apache.ambari.server.state.Clusters clusters3 = null;
        org.apache.ambari.server.actionmanager.HostRoleCommandFactory hostRoleCommandFactory4 = null;
        org.apache.ambari.server.actionmanager.ExecutionCommandWrapperFactory executionCommandWrapperFactory5 = null;
        try {
            org.apache.ambari.server.actionmanager.Stage stage6 = new org.apache.ambari.server.actionmanager.Stage(stageEntity0, hostRoleCommandDAO1, actionDBAccessor2, clusters3, hostRoleCommandFactory4, executionCommandWrapperFactory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.ambari.server.state.svccomphost.ServiceComponentHostOpSucceededEvent serviceComponentHostOpSucceededEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostOpSucceededEvent("Event/summary/memberships/created", "CompatibleRepositoryVersions/upgrade_types", (long) '#');
        long long4 = serviceComponentHostOpSucceededEvent3.getTimestamp();
        org.junit.Assert.assertTrue(long4 == (-1L));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.ambari.server.state.stack.ServiceMetainfoXml serviceMetainfoXml0 = new org.apache.ambari.server.state.stack.ServiceMetainfoXml();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.FROM_REPO_VERSION_ID_COLUMN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "from_repo_version_id" + "'", str0.equals("from_repo_version_id"));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.SettingResourceProvider.NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "name" + "'", str0.equals("name"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.lang.String str0 = org.eclipse.persistence.logging.SessionLog.PROPERTIES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "properties" + "'", str0.equals("properties"));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.lang.String str0 = org.apache.ambari.server.api.predicate.QueryLexer.QUERY_FIELDS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "fields" + "'", str0.equals("fields"));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.ambari.server.api.resources.UpgradeResourceDefinition.SKIP_SERVICE_CHECKS_DIRECTIVE = "ViewInstanceInfo/icon_path";
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.Object obj2 = serviceConfigEntity0._persistence_get("jce_name");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity4 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        serviceConfigEntity0._persistence_propertyChange("Repositories/repository_version_id", (java.lang.Object) clusterConfigEntity4, (java.lang.Object) 10);
        org.apache.ambari.server.orm.entities.StackEntity stackEntity7 = serviceConfigEntity0._persistence_get_stack();
        org.eclipse.persistence.queries.FetchGroup fetchGroup8 = serviceConfigEntity0._persistence_getFetchGroup();
        java.util.List<java.lang.Long> list_long9 = serviceConfigEntity0.getHostIds();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(stackEntity7);
        org.junit.Assert.assertNull(fetchGroup8);
        org.junit.Assert.assertNull(list_long9);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.google.common.base.Function<org.apache.ambari.server.state.RepositoryInfo, java.lang.String> function_repositoryInfo_str0 = org.apache.ambari.server.state.RepositoryInfo.GET_REPO_NAME_FUNCTION;
        org.junit.Assert.assertNotNull(function_repositoryInfo_str0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.UserResourceProvider.USER_GROUPS_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Users/groups" + "'", str0.equals("Users/groups"));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.STACK_UPGRADE_BYPASS_PRECHECKS;
        org.junit.Assert.assertNotNull(configurationproperty_b0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.STACK_VERSION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ThemeInfo/stack_version" + "'", str0.equals("ThemeInfo/stack_version"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.lang.String str0 = org.apache.ambari.server.controller.RootServiceResponseFactory.NOT_APPLICABLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "NOT_APPLICABLE" + "'", str0.equals("NOT_APPLICABLE"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        java.lang.ClassLoader classLoader1 = classLoader0.getParent();
        java.lang.ClassLoader classLoader2 = classLoader1.getParent();
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertNotNull(classLoader1);
        org.junit.Assert.assertNull(classLoader2);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewPermissionResourceProvider.PERMISSION_ID_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PermissionInfo/permission_id" + "'", str0.equals("PermissionInfo/permission_id"));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.lang.String str0 = org.apache.ambari.server.api.services.parsers.RequestBodyParser.REQUEST_INFO_PATH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RequestInfo" + "'", str0.equals("RequestInfo"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_OS_FAMILY_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/os_family" + "'", str0.equals("Hosts/os_family"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.lang.String str0 = org.apache.ambari.server.controller.AmbariServer.VIEWS_URL_PATTERN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/api/v1/views/*" + "'", str0.equals("/api/v1/views/*"));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.lang.String str0 = org.apache.ambari.server.scheduler.ExecutionJob.NEXT_EXECUTION_SEPARATION_SECONDS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ExecutionJob.SeparationMinutes" + "'", str0.equals("ExecutionJob.SeparationMinutes"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_CONNECTION_POOL_MAX_AGE;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertNoticeEntity, org.apache.ambari.server.orm.entities.AlertNoticeEntity> singularattribute_alertNoticeEntity_alertNoticeEntity0 = org.apache.ambari.server.orm.entities.AlertNoticeEntity_.alertHistory;
        org.junit.Assert.assertNull(singularattribute_alertNoticeEntity_alertNoticeEntity0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.ambari.server.orm.entities.HostRoleCommandEntity_ hostRoleCommandEntity_0 = new org.apache.ambari.server.orm.entities.HostRoleCommandEntity_();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.HUE_SERVER;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.lang.String str0 = org.apache.ambari.server.api.services.parsers.RequestBodyParser.BODY_TITLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Body" + "'", str0.equals("Body"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.ambari.server.state.action.ActionState actionState0 = org.apache.ambari.server.state.action.ActionState.FAILED;
        org.junit.Assert.assertTrue("'" + actionState0 + "' != '" + org.apache.ambari.server.state.action.ActionState.FAILED + "'", actionState0.equals(org.apache.ambari.server.state.action.ActionState.FAILED));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.ambari.server.controller.StackConfigurationDependencyRequest stackConfigurationDependencyRequest5 = new org.apache.ambari.server.controller.StackConfigurationDependencyRequest("Credential/principal", "RootServiceComponents/component_name", "jce_name", "Repositories/repository_version_id", "operation_level/service_name");
        java.lang.String str6 = stackConfigurationDependencyRequest5.getCredentialStoreEnabled();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.ambari.server.audit.event.request.DeleteGroupRequestAuditEvent.DeleteGroupRequestAuditEventBuilder deleteGroupRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteGroupRequestAuditEvent.DeleteGroupRequestAuditEventBuilder();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.lang.String str0 = org.apache.hadoop.metrics2.sink.timeline.AbstractTimelineMetricsSink.SKIP_COUNTER_TRANSFROMATION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "skipCounterDerivative" + "'", str0.equals("skipCounterDerivative"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_UNINSTALL;
        org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_UNINSTALL + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_UNINSTALL));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.WIDGETLAYOUT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayouts" + "'", str0.equals("WidgetLayouts"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.ambari.server.actionmanager.HostRoleCommand[] hostRoleCommand_array0 = new org.apache.ambari.server.actionmanager.HostRoleCommand[] {};
        java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleCommand> arraylist_hostRoleCommand1 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleCommand>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.HostRoleCommand>) arraylist_hostRoleCommand1, hostRoleCommand_array0);
        org.apache.ambari.server.events.TaskCreateEvent taskCreateEvent3 = new org.apache.ambari.server.events.TaskCreateEvent((java.util.List<org.apache.ambari.server.actionmanager.HostRoleCommand>) arraylist_hostRoleCommand1);
        org.apache.ambari.server.events.TaskCreateEvent taskCreateEvent4 = new org.apache.ambari.server.events.TaskCreateEvent((java.util.List<org.apache.ambari.server.actionmanager.HostRoleCommand>) arraylist_hostRoleCommand1);
        org.junit.Assert.assertNotNull(hostRoleCommand_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.GroupResourceProvider.GROUP_GROUPTYPE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Groups/group_type" + "'", str0.equals("Groups/group_type"));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.ambari.server.serveraction.kerberos.ConfigureAmbariIdentitiesServerAction configureAmbariIdentitiesServerAction0 = new org.apache.ambari.server.serveraction.kerberos.ConfigureAmbariIdentitiesServerAction();
        org.apache.ambari.server.agent.ExecutionCommand executionCommand1 = null;
        configureAmbariIdentitiesServerAction0.setExecutionCommand(executionCommand1);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.ambari.server.security.authorization.PamAuthenticationException pamAuthenticationException4 = new org.apache.ambari.server.security.authorization.PamAuthenticationException("SET_KEYTAB");
        org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException kerberosAdminAuthenticationException5 = new org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException("Hosts/*", (java.lang.Throwable) pamAuthenticationException4);
        org.apache.ambari.server.security.authorization.DuplicateLdapUserFoundAuthenticationException duplicateLdapUserFoundAuthenticationException6 = new org.apache.ambari.server.security.authorization.DuplicateLdapUserFoundAuthenticationException("unlimited_key_jce_required", (java.lang.Throwable) kerberosAdminAuthenticationException5);
        org.apache.ambari.server.controller.spi.NoSuchResourceException noSuchResourceException7 = new org.apache.ambari.server.controller.spi.NoSuchResourceException("clusterName", (java.lang.Throwable) kerberosAdminAuthenticationException5);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.ambari.server.ldap.service.ads.DefaultLdapConnectionConfigService defaultLdapConnectionConfigService0 = new org.apache.ambari.server.ldap.service.ads.DefaultLdapConnectionConfigService();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.lang.String str0 = org.apache.ambari.server.metadata.RoleCommandOrder.RESOURCEMANAGER_HA_DEPS_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "resourcemanager_optional_ha" + "'", str0.equals("resourcemanager_optional_ha"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.ambari.server.state.svccomphost.ServiceComponentHostDisableEvent serviceComponentHostDisableEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostDisableEvent("RootServiceHostComponents/component_state", "yarn-site", (long) '4');
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.io.File file0 = null;
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.ambari.server.state.stack.OsFamily osFamily3 = null;
        org.apache.ambari.server.orm.dao.MetainfoDAO metainfoDAO5 = null;
        org.apache.ambari.server.metadata.ActionMetadata actionMetadata6 = null;
        org.apache.ambari.server.orm.dao.StackDAO stackDAO7 = null;
        org.apache.ambari.server.orm.dao.ExtensionDAO extensionDAO8 = null;
        org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO9 = null;
        org.apache.ambari.server.controller.AmbariManagementHelper ambariManagementHelper10 = null;
        try {
            org.apache.ambari.server.stack.StackManager stackManager11 = new org.apache.ambari.server.stack.StackManager(file0, file1, file2, osFamily3, true, metainfoDAO5, actionMetadata6, stackDAO7, extensionDAO8, extensionLinkDAO9, ambariManagementHelper10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.lang.String str0 = org.apache.ambari.server.topology.SecurityConfigurationFactory.TYPE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "type" + "'", str0.equals("type"));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.ambari.server.api.services.PersistKeyValueImpl persistKeyValueImpl0 = null;
        org.apache.ambari.server.api.services.KeyService.init(persistKeyValueImpl0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.MAPREDUCE_SERVICE_CHECK;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.BlueprintResourceProvider.PROPERTIES_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "properties" + "'", str0.equals("properties"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.ambari.server.state.stack.WidgetLayout widgetLayout0 = new org.apache.ambari.server.state.stack.WidgetLayout();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity0 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        java.lang.Long long1 = clusterConfigEntity0.getClusterId();
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity, java.lang.Long> singularattribute_hostRoleCommandEntity_long0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.requestId;
        org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_long0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.ambari.server.api.services.ServiceService serviceService1 = new org.apache.ambari.server.api.services.ServiceService("configure-task-insertions");
        javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
        javax.ws.rs.core.UriInfo uriInfo4 = null;
        try {
            javax.ws.rs.core.Response response5 = serviceService1.updateServices("property-file-name", httpHeaders3, uriInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.ambari.server.api.resources.HostComponentProcessResourceDefinition hostComponentProcessResourceDefinition0 = new org.apache.ambari.server.api.resources.HostComponentProcessResourceDefinition();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.THEME_DATA_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ThemeInfo/theme_data" + "'", str0.equals("ThemeInfo/theme_data"));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.lang.String str0 = org.apache.ambari.server.api.services.AmbariMetaInfo.KERBEROS_DESCRIPTOR_FILE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "kerberos.json" + "'", str0.equals("kerberos.json"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.JWT_AUTH_PROVIDER_URL;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.ambari.server.security.authorization.internal.InternalTokenStorage internalTokenStorage0 = null;
        org.apache.ambari.server.security.authorization.internal.AmbariInternalAuthenticationProvider ambariInternalAuthenticationProvider1 = new org.apache.ambari.server.security.authorization.internal.AmbariInternalAuthenticationProvider(internalTokenStorage0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.ambari.server.orm.entities.PrincipalTypeEntity.PrincipalType principalType0 = org.apache.ambari.server.orm.entities.PrincipalTypeEntity.PrincipalType.USER;
        org.junit.Assert.assertTrue("'" + principalType0 + "' != '" + org.apache.ambari.server.orm.entities.PrincipalTypeEntity.PrincipalType.USER + "'", principalType0.equals(org.apache.ambari.server.orm.entities.PrincipalTypeEntity.PrincipalType.USER));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys ambariLdapConfigurationKeys0 = org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.FORCE_LOWERCASE_USERNAMES;
        org.apache.ambari.server.configuration.ConfigurationPropertyType configurationPropertyType1 = ambariLdapConfigurationKeys0.getConfigurationPropertyType();
        org.junit.Assert.assertTrue("'" + ambariLdapConfigurationKeys0 + "' != '" + org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.FORCE_LOWERCASE_USERNAMES + "'", ambariLdapConfigurationKeys0.equals(org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.FORCE_LOWERCASE_USERNAMES));
        org.junit.Assert.assertTrue("'" + configurationPropertyType1 + "' != '" + org.apache.ambari.server.configuration.ConfigurationPropertyType.PLAINTEXT + "'", configurationPropertyType1.equals(org.apache.ambari.server.configuration.ConfigurationPropertyType.PLAINTEXT));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.lang.String str0 = org.apache.ambari.server.utils.ShellCommandUtil.MASK_OWNER_ONLY_RW;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "600" + "'", str0.equals("600"));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
        org.apache.ambari.server.orm.helpers.dbms.DerbyHelper derbyHelper1 = new org.apache.ambari.server.orm.helpers.dbms.DerbyHelper(databasePlatform0);
        java.lang.StringBuilder stringBuilder2 = null;
        org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo4 = null;
        try {
            java.lang.StringBuilder stringBuilder6 = derbyHelper1.writeSetNullableString(stringBuilder2, "StackServices/stack_name", dBColumnInfo4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.ambari.server.api.services.parsers.BodyParseException bodyParseException1 = new org.apache.ambari.server.api.services.parsers.BodyParseException("ip");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.SNMPDispatcher.SECURITY_AUTH_PASSPHRASE_PROPERTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari.dispatch.snmp.security.auth.passphrase" + "'", str0.equals("ambari.dispatch.snmp.security.auth.passphrase"));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        serviceConfigEntity0._persistence_set_serviceConfigId((java.lang.Long) 1L);
        serviceConfigEntity0._persistence_setShouldRefreshFetchGroup(false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.ambari.server.state.ServicePropertyInfo servicePropertyInfo0 = new org.apache.ambari.server.state.ServicePropertyInfo();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.ambari.server.controller.ServiceComponentHostRequest serviceComponentHostRequest5 = new org.apache.ambari.server.controller.ServiceComponentHostRequest("RepositoryVersions/release/compatible_with", "STANDARD", "configure-task-insertions", "AlertNotice/target_id", "WidgetInfo/description");
        serviceComponentHostRequest5.setServiceName("AMBARI.ADMINISTRATOR");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType concatenationType0 = org.apache.ambari.server.controller.AuthToLocalBuilder.DEFAULT_CONCATENATION_TYPE;
        org.junit.Assert.assertTrue("'" + concatenationType0 + "' != '" + org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType.NEW_LINES + "'", concatenationType0.equals(org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType.NEW_LINES));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map_str_map_str_str0 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map_str_map_str_str1 = null;
        try {
            org.apache.ambari.server.state.ConfigHelper.mergeConfigAttributes(map_str_map_str_str0, map_str_map_str_str1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider.EVENT_END_TIME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Event/sync_time/end" + "'", str0.equals("Event/sync_time/end"));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.lang.String str0 = org.apache.ambari.server.stack.StackDirectory.SERVICE_PROPERTIES_FOLDER_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "properties" + "'", str0.equals("properties"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ActionResourceProvider.DEFAULT_TIMEOUT_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Actions/default_timeout" + "'", str0.equals("Actions/default_timeout"));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.ambari.server.utils.DateUtils dateUtils0 = new org.apache.ambari.server.utils.DateUtils();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.util.Properties properties0 = null;
        org.apache.ambari.server.metrics.system.impl.MetricsConfiguration metricsConfiguration1 = new org.apache.ambari.server.metrics.system.impl.MetricsConfiguration(properties0);
        java.util.Properties properties2 = metricsConfiguration1.getProperties();
        org.junit.Assert.assertNull(properties2);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.ambari.server.controller.ServiceRequest serviceRequest5 = new org.apache.ambari.server.controller.ServiceRequest("timelineMetricCache", "jce_name", (java.lang.Long) 10L, "LinearExecutionJobs", "ViewVersionInfo/parameters");
        java.lang.String str6 = serviceRequest5.getMaintenanceState();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.HTTP_X_CONTENT_TYPE_HEADER_VALUE;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        boolean b1 = org.apache.ambari.server.utils.XmlUtils.isValidXml("StackConfigurations/property_type");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.ambari.server.serveraction.kerberos.IPAKerberosOperationHandler iPAKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.IPAKerberosOperationHandler();
        org.apache.ambari.server.security.credential.PrincipalKeyCredential principalKeyCredential1 = null;
        try {
            iPAKerberosOperationHandler0.setAdministratorCredential(principalKeyCredential1);
            org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException");
        } catch (org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.util.Date date0 = null;
        try {
            java.lang.Long long1 = org.apache.ambari.server.utils.DateUtils.getDateDifferenceInMinutes(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.ambari.server.serveraction.upgrades.AtlasProxyUserConfigCalculation atlasProxyUserConfigCalculation0 = new org.apache.ambari.server.serveraction.upgrades.AtlasProxyUserConfigCalculation();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertHistoryResourceProvider.ALERT_HISTORY_STATE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertHistory/state" + "'", str0.equals("AlertHistory/state"));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelper.DEFAULT_REALM;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "realm" + "'", str0.equals("realm"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceResourceProvider.SERVICE_CREDENTIAL_STORE_ENABLED_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ServiceInfo/credential_store_enabled" + "'", str0.equals("ServiceInfo/credential_store_enabled"));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.ambari.server.serveraction.upgrades.FinalizeUpgradeAction finalizeUpgradeAction0 = new org.apache.ambari.server.serveraction.upgrades.FinalizeUpgradeAction();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertTargetResourceProvider.ALERT_TARGET_ENABLED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertTarget/enabled" + "'", str0.equals("AlertTarget/enabled"));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertNoticeEntity, java.lang.String> singularattribute_alertNoticeEntity_str0 = null;
        org.apache.ambari.server.orm.entities.AlertNoticeEntity_.uuid = singularattribute_alertNoticeEntity_str0;
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.lang.String str0 = org.apache.ambari.server.controller.AmbariCustomCommandExecutionHelper.DECOM_SLAVE_COMPONENT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "slave_type" + "'", str0.equals("slave_type"));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewVersionResourceProvider.VIEW_BUILD_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewVersionInfo/build_number" + "'", str0.equals("ViewVersionInfo/build_number"));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning0 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
        org.apache.ambari.server.state.stack.PrerequisiteCheck prerequisiteCheck1 = null;
        org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType3 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING;
        org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest4 = new org.apache.ambari.server.controller.PrereqCheckRequest("version", upgradeType3);
        try {
            hiveNotRollingWarning0.perform(prerequisiteCheck1, prereqCheckRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + upgradeType3 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING + "'", upgradeType3.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationDependencyResourceProvider.DEPENDENCY_TYPE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurationDependency/dependency_type" + "'", str0.equals("StackConfigurationDependency/dependency_type"));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.StopTask.actionVerb;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stopping" + "'", str0.equals("Stopping"));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_OS_TYPE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/os_type" + "'", str0.equals("Hosts/os_type"));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.PrivilegeResourceProvider.PRINCIPAL_TYPE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PrivilegeInfo/principal_type" + "'", str0.equals("PrivilegeInfo/principal_type"));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.ambari.server.state.UpgradeState upgradeState0 = org.apache.ambari.server.state.UpgradeState.VERSION_MISMATCH;
        org.junit.Assert.assertTrue("'" + upgradeState0 + "' != '" + org.apache.ambari.server.state.UpgradeState.VERSION_MISMATCH + "'", upgradeState0.equals(org.apache.ambari.server.state.UpgradeState.VERSION_MISMATCH));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity0 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        long long1 = clusterConfigEntity0.getTimestamp();
        java.util.Collection collection2 = clusterConfigEntity0._persistence_get_serviceConfigEntities();
        java.lang.Long long3 = clusterConfigEntity0._persistence_get_version();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.UQ_HOST_REPO;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UQ_host_repo" + "'", str0.equals("UQ_host_repo"));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
        org.apache.ambari.server.controller.internal.RoleAuthorizationResourceProvider roleAuthorizationResourceProvider1 = new org.apache.ambari.server.controller.internal.RoleAuthorizationResourceProvider(ambariManagementController0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFile.COMPONENT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "component" + "'", str0.equals("component"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity0 = null;
        org.apache.ambari.server.controller.internal.CompatibleRepositoryVersion compatibleRepositoryVersion1 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersion(repositoryVersionEntity0);
        org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity2 = compatibleRepositoryVersion1.getRepositoryVersionEntity();
        org.junit.Assert.assertNull(repositoryVersionEntity2);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        int i0 = org.apache.ambari.server.configuration.Configuration.PROCESSOR_BASED_THREADPOOL_CORE_SIZE_DEFAULT;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackLevelConfigurationResourceProvider.PROPERTY_FINAL_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackLevelConfigurations/final" + "'", str0.equals("StackLevelConfigurations/final"));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.ambari.server.topology.RepositorySetting repositorySetting0 = new org.apache.ambari.server.topology.RepositorySetting();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.COMMON_SERVICES_DIR_PATH;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.ambari.server.state.alert.AlertUri alertUri0 = null;
        try {
            org.apache.ambari.server.state.alert.AlertUri.HighAvailability highAvailability1 = alertUri0.new HighAvailability();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.MYSQL_JAR_NAME;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.TIMELINE_METRICS_CACHE_TTL;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.ambari.server.security.unsecured.rest.CertificateSign certificateSign0 = new org.apache.ambari.server.security.unsecured.rest.CertificateSign();
        org.apache.ambari.server.security.SignMessage signMessage2 = null;
        javax.servlet.http.HttpServletRequest httpServletRequest3 = null;
        try {
            org.apache.ambari.server.security.SignCertResponse signCertResponse4 = certificateSign0.signAgentCrt("LinearExecutionJobs", signMessage2, httpServletRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys ambariLdapConfigurationKeys0 = org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.PAGINATION_ENABLED;
        org.junit.Assert.assertTrue("'" + ambariLdapConfigurationKeys0 + "' != '" + org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.PAGINATION_ENABLED + "'", ambariLdapConfigurationKeys0.equals(org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.PAGINATION_ENABLED));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.ambari.server.security.authorization.PamAuthenticationException pamAuthenticationException3 = new org.apache.ambari.server.security.authorization.PamAuthenticationException("SET_KEYTAB");
        org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException kerberosAdminAuthenticationException4 = new org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException("Hosts/*", (java.lang.Throwable) pamAuthenticationException3);
        org.apache.ambari.server.security.authorization.DuplicateLdapUserFoundAuthenticationException duplicateLdapUserFoundAuthenticationException5 = new org.apache.ambari.server.security.authorization.DuplicateLdapUserFoundAuthenticationException("unlimited_key_jce_required", (java.lang.Throwable) kerberosAdminAuthenticationException4);
        java.lang.Object obj6 = duplicateLdapUserFoundAuthenticationException5.getExtraInformation();
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.ambari.server.audit.request.eventcreator.CredentialEventCreator credentialEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.CredentialEventCreator();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.ambari.server.state.action.ActionEventType actionEventType0 = org.apache.ambari.server.state.action.ActionEventType.ACTION_IN_PROGRESS;
        org.junit.Assert.assertTrue("'" + actionEventType0 + "' != '" + org.apache.ambari.server.state.action.ActionEventType.ACTION_IN_PROGRESS + "'", actionEventType0.equals(org.apache.ambari.server.state.action.ActionEventType.ACTION_IN_PROGRESS));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.RESOURCEMANAGER;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.ambari.server.agent.DiskInfo diskInfo0 = new org.apache.ambari.server.agent.DiskInfo();
        java.lang.String str1 = diskInfo0.getMountPoint();
        java.lang.String str2 = diskInfo0.getMountPoint();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.REPO_VERSION_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "repository_version_id" + "'", str0.equals("repository_version_id"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_HIVE_ROLLING_WARNING;
        org.junit.Assert.assertNotNull(checkDescription0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.ambari.server.state.stack.UpgradePack.IntermediateStack intermediateStack0 = new org.apache.ambari.server.state.stack.UpgradePack.IntermediateStack();
        java.lang.String str1 = intermediateStack0.version;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.lang.String str0 = org.eclipse.persistence.sessions.SessionProfiler.UowCreated;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Counter:UnitOfWorkCreates" + "'", str0.equals("Counter:UnitOfWorkCreates"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.ambari.server.security.authorization.PamAuthenticationException pamAuthenticationException2 = new org.apache.ambari.server.security.authorization.PamAuthenticationException("SET_KEYTAB");
        org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException kerberosAdminAuthenticationException3 = new org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException("Hosts/*", (java.lang.Throwable) pamAuthenticationException2);
        java.lang.String str4 = kerberosAdminAuthenticationException3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException: Hosts/*" + "'", str4.equals("org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException: Hosts/*"));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.ambari.server.utils.HTTPUtils hTTPUtils0 = new org.apache.ambari.server.utils.HTTPUtils();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.lang.String str0 = org.apache.ambari.server.upgrade.AbstractUpgradeCatalog.CONFIGURATION_TYPE_RANGER_HBASE_PLUGIN_PROPERTIES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ranger-hbase-plugin-properties" + "'", str0.equals("ranger-hbase-plugin-properties"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.lang.String str0 = org.apache.ambari.server.stack.StackDirectory.SERVICE_ALERT_FILE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "alerts.json" + "'", str0.equals("alerts.json"));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.ambari.server.agent.AgentEnv agentEnv0 = new org.apache.ambari.server.agent.AgentEnv();
        java.lang.String[] str_array1 = agentEnv0.getExistingRepos();
        org.apache.ambari.server.agent.AgentEnv.HostHealth hostHealth2 = null;
        agentEnv0.setHostHealth(hostHealth2);
        java.lang.Boolean b4 = agentEnv0.getHasUnlimitedJcePolicy();
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertNull(b4);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity, org.apache.ambari.server.state.AlertState> singularattribute_alertHistoryEntity_alertState0 = org.apache.ambari.server.orm.entities.AlertHistoryEntity_.alertState;
        org.junit.Assert.assertNull(singularattribute_alertHistoryEntity_alertState0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.lang.String str0 = org.eclipse.persistence.sessions.SessionProfiler.CacheCoordination;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Timer:CacheCoordination" + "'", str0.equals("Timer:CacheCoordination"));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.ambari.server.controller.ServiceRequest serviceRequest4 = new org.apache.ambari.server.controller.ServiceRequest("regenerate_hosts", "configs.dat", (java.lang.Long) (-1L), "RootServiceHostComponents/component_state");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.ambari.server.state.stack.upgrade.TransferCoercionType transferCoercionType0 = org.apache.ambari.server.state.stack.upgrade.TransferCoercionType.YAML_ARRAY;
        org.junit.Assert.assertTrue("'" + transferCoercionType0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.TransferCoercionType.YAML_ARRAY + "'", transferCoercionType0.equals(org.apache.ambari.server.state.stack.upgrade.TransferCoercionType.YAML_ARRAY));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RequestResourceProvider.HOSTS_PREDICATE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hosts_predicate" + "'", str0.equals("hosts_predicate"));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.CLUSTER_ENV_RETRY_COMMANDS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "commands_to_retry" + "'", str0.equals("commands_to_retry"));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.ambari.server.orm.entities.ViewEntity viewEntity0 = null;
        org.apache.ambari.server.view.configuration.InstanceConfig instanceConfig1 = null;
        try {
            org.apache.ambari.server.orm.entities.ViewInstanceEntity viewInstanceEntity2 = new org.apache.ambari.server.orm.entities.ViewInstanceEntity(viewEntity0, instanceConfig1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.ambari.server.state.stack.RepoUrlInfoCallable.RepoUrlInfoResult repoUrlInfoResult0 = new org.apache.ambari.server.state.stack.RepoUrlInfoCallable.RepoUrlInfoResult();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.ambari.server.api.services.RoleAuthorizationService roleAuthorizationService0 = new org.apache.ambari.server.api.services.RoleAuthorizationService();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.ambari.server.state.Cluster cluster0 = null;
        try {
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> map_str_set_str1 = org.apache.ambari.server.utils.StageUtils.getClusterHostInfo(cluster0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        java.lang.String str0 = org.apache.ambari.server.orm.entities.PermissionEntity.CLUSTER_OPERATOR_PERMISSION_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CLUSTER.OPERATOR" + "'", str0.equals("CLUSTER.OPERATOR"));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.ACCUMULO_CLIENT;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.eclipse.persistence.internal.descriptors.PersistenceObject persistenceObject0 = null;
        org.apache.ambari.server.orm.entities.BlueprintSettingEntity blueprintSettingEntity1 = new org.apache.ambari.server.orm.entities.BlueprintSettingEntity(persistenceObject0);
        blueprintSettingEntity1.setSettingName("Event/sync_time/end");
        blueprintSettingEntity1._persistence_set_settingData("ranger-hbase-plugin-properties");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalDoesNotExistException kerberosPrincipalDoesNotExistException1 = new org.apache.ambari.server.serveraction.kerberos.KerberosPrincipalDoesNotExistException("realm");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.ambari.server.actionmanager.ActionType actionType0 = org.apache.ambari.server.actionmanager.ActionType.SYSTEM_DISABLED;
        org.junit.Assert.assertTrue("'" + actionType0 + "' != '" + org.apache.ambari.server.actionmanager.ActionType.SYSTEM_DISABLED + "'", actionType0.equals(org.apache.ambari.server.actionmanager.ActionType.SYSTEM_DISABLED));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_YARN_TIMELINE_ST;
        org.apache.ambari.server.checks.CheckDescription.ATLAS_SERVICE_PRESENCE_CHECK = checkDescription0;
        org.junit.Assert.assertNotNull(checkDescription0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.PARAMETER_KEY_VALUE_PAIRS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "configure-task-key-value-pairs" + "'", str0.equals("configure-task-key-value-pairs"));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.HIVE_SERVER_HIVE_KERBEROS_IDENTITY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hive_server_hive" + "'", str0.equals("hive_server_hive"));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.ambari.server.api.predicate.QueryLexer queryLexer0 = new org.apache.ambari.server.api.predicate.QueryLexer();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.STATE_COLUMN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "state" + "'", str0.equals("state"));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.ambari.server.serveraction.upgrades.HBaseConfigCalculation hBaseConfigCalculation0 = new org.apache.ambari.server.serveraction.upgrades.HBaseConfigCalculation();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.STATE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "host_state" + "'", str0.equals("host_state"));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.ambari.server.controller.StackConfigurationDependencyRequest stackConfigurationDependencyRequest5 = new org.apache.ambari.server.controller.StackConfigurationDependencyRequest("Credential/principal", "RootServiceComponents/component_name", "jce_name", "Repositories/repository_version_id", "operation_level/service_name");
        stackConfigurationDependencyRequest5.setStackName("service_check_type");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.ambari.server.state.ServiceOsSpecific serviceOsSpecific0 = new org.apache.ambari.server.state.ServiceOsSpecific();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO0 = new org.apache.ambari.server.orm.dao.HostComponentStateDAO();
        org.apache.ambari.server.orm.entities.HostComponentStateEntity hostComponentStateEntity1 = null;
        try {
            org.apache.ambari.server.orm.entities.HostComponentStateEntity hostComponentStateEntity2 = hostComponentStateDAO0.merge(hostComponentStateEntity1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.ambari.server.state.Clusters clusters0 = null;
        org.apache.ambari.server.actionmanager.ActionManager actionManager1 = null;
        org.apache.ambari.server.agent.HeartbeatMonitor heartbeatMonitor2 = null;
        com.google.inject.Injector injector3 = null;
        try {
            org.apache.ambari.server.agent.HeartbeatProcessor heartbeatProcessor4 = new org.apache.ambari.server.agent.HeartbeatProcessor(clusters0, actionManager1, heartbeatMonitor2, injector3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.ambari.server.api.resources.StackDependencyResourceDefinition stackDependencyResourceDefinition0 = new org.apache.ambari.server.api.resources.StackDependencyResourceDefinition();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_RENAME_CLUSTER;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_RENAME_CLUSTER + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_RENAME_CLUSTER));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.ACTIVE_INSTANCE;
        org.junit.Assert.assertNotNull(configurationproperty_b0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.TaskResourceProvider.TASK_STATUS_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tasks/status" + "'", str0.equals("Tasks/status"));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFileWriterFactory kerberosIdentityDataFileWriterFactory0 = new org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFileWriterFactory();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STATUS_INFO;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STATUS_INFO + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_STATUS_INFO));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_YARN_TIMELINE_ST;
        org.apache.ambari.server.checks.CheckDescription.SERVICES_NAMENODE_HA = checkDescription0;
        org.apache.ambari.server.checks.CheckDescription.SERVICE_CHECK = checkDescription0;
        org.junit.Assert.assertNotNull(checkDescription0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_SETTINGS;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_SETTINGS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_SETTINGS));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.lang.String str0 = org.apache.ambari.server.api.predicate.QueryLexer.QUERY_SORT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "sortBy" + "'", str0.equals("sortBy"));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity0 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Long long1 = requestOperationLevelEntity0._persistence_get_operationLevelId();
        org.apache.ambari.server.orm.entities.PrivilegeEntity privilegeEntity2 = new org.apache.ambari.server.orm.entities.PrivilegeEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity0);
        org.apache.ambari.server.orm.entities.ResourceEntity resourceEntity3 = privilegeEntity2.getResource();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(resourceEntity3);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity0 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.beans.PropertyChangeListener propertyChangeListener1 = requestOperationLevelEntity0._persistence_getPropertyChangeListener();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        requestOperationLevelEntity0._persistence_setPropertyChangeListener(propertyChangeListener2);
        org.junit.Assert.assertNull(propertyChangeListener1);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.ambari.server.orm.entities.RemoteAmbariClusterEntity remoteAmbariClusterEntity0 = new org.apache.ambari.server.orm.entities.RemoteAmbariClusterEntity();
        org.apache.ambari.server.configuration.Configuration configuration1 = null;
        try {
            org.apache.ambari.server.view.RemoteAmbariCluster remoteAmbariCluster2 = new org.apache.ambari.server.view.RemoteAmbariCluster(remoteAmbariClusterEntity0, configuration1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys ambariLdapConfigurationKeys0 = org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.USER_MEMBER_FILTER;
        org.junit.Assert.assertTrue("'" + ambariLdapConfigurationKeys0 + "' != '" + org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.USER_MEMBER_FILTER + "'", ambariLdapConfigurationKeys0.equals(org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.USER_MEMBER_FILTER));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.ambari.server.state.HostEventType hostEventType0 = org.apache.ambari.server.state.HostEventType.HOST_HEARTBEAT_LOST;
        org.junit.Assert.assertTrue("'" + hostEventType0 + "' != '" + org.apache.ambari.server.state.HostEventType.HOST_HEARTBEAT_LOST + "'", hostEventType0.equals(org.apache.ambari.server.state.HostEventType.HOST_HEARTBEAT_LOST));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
        org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider compatibleRepositoryVersionResourceProvider1 = new org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider(ambariManagementController0);
        org.apache.ambari.server.controller.spi.Resource.Type type2 = null;
        org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type type3 = org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete;
        java.util.Set<java.lang.String> set_str4 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str5 = null;
        java.util.Map<java.lang.String, org.apache.ambari.server.controller.spi.TemporalInfo> map_str_temporalInfo6 = null;
        org.apache.ambari.server.controller.spi.PageRequest pageRequest7 = null;
        org.apache.ambari.server.controller.spi.SortRequest sortRequest8 = null;
        org.apache.ambari.server.controller.spi.Request request9 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(set_str4, map_str_str5, map_str_temporalInfo6, pageRequest7, sortRequest8);
        org.apache.ambari.server.controller.spi.Predicate predicate10 = null;
        org.apache.ambari.server.controller.internal.ResourceProviderEvent resourceProviderEvent11 = new org.apache.ambari.server.controller.internal.ResourceProviderEvent(type2, type3, request9, predicate10);
        org.apache.ambari.server.controller.spi.Predicate predicate12 = null;
        java.util.Set<org.apache.ambari.server.controller.spi.Resource> set_resource13 = compatibleRepositoryVersionResourceProvider1.getResources(request9, predicate12);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete + "'", type3.equals(org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete));
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(set_resource13);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.ambari.server.serveraction.upgrades.KerberosKeytabsAction kerberosKeytabsAction0 = new org.apache.ambari.server.serveraction.upgrades.KerberosKeytabsAction();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.springframework.security.authentication.AuthenticationManager authenticationManager0 = null;
        org.apache.ambari.server.configuration.Configuration configuration1 = null;
        org.apache.ambari.server.security.AmbariEntryPoint ambariEntryPoint2 = new org.apache.ambari.server.security.AmbariEntryPoint(configuration1);
        org.apache.ambari.server.audit.AuditLogger auditLogger3 = null;
        org.apache.ambari.server.security.authorization.PermissionHelper permissionHelper4 = null;
        org.apache.ambari.server.security.authentication.AmbariBasicAuthenticationFilter ambariBasicAuthenticationFilter5 = new org.apache.ambari.server.security.authentication.AmbariBasicAuthenticationFilter(authenticationManager0, ambariEntryPoint2, auditLogger3, permissionHelper4);
        try {
            ambariBasicAuthenticationFilter5.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.ARTIFACT_DATA_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "artifact_data" + "'", str0.equals("artifact_data"));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.TIMELINE_METRICS_CACHE_IDLE_TIME;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.ambari.server.api.resources.ServiceConfigVersionResourceDefinition serviceConfigVersionResourceDefinition0 = new org.apache.ambari.server.api.resources.ServiceConfigVersionResourceDefinition();
        java.lang.String str1 = serviceConfigVersionResourceDefinition0.getPluralName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "service_config_versions" + "'", str1.equals("service_config_versions"));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.lang.String str0 = org.eclipse.persistence.logging.SessionLog.EJB_OR_METADATA;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "metadata" + "'", str0.equals("metadata"));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.ambari.server.state.HostHealthStatus.HealthStatus healthStatus0 = org.apache.ambari.server.state.HostHealthStatus.HealthStatus.HEALTHY;
        org.junit.Assert.assertTrue("'" + healthStatus0 + "' != '" + org.apache.ambari.server.state.HostHealthStatus.HealthStatus.HEALTHY + "'", healthStatus0.equals(org.apache.ambari.server.state.HostHealthStatus.HealthStatus.HEALTHY));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.ambari.server.controller.internal.DefaultResourcePredicateEvaluator defaultResourcePredicateEvaluator0 = new org.apache.ambari.server.controller.internal.DefaultResourcePredicateEvaluator();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity, java.lang.String> singularattribute_alertDefinitionEntity_str0 = org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.componentName;
        org.junit.Assert.assertNull(singularattribute_alertDefinitionEntity_str0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.io.File file0 = null;
        org.apache.ambari.server.stack.QuickLinksConfigurationModule quickLinksConfigurationModule1 = new org.apache.ambari.server.stack.QuickLinksConfigurationModule(file0);
        org.apache.ambari.server.state.QuickLinksConfigurationInfo quickLinksConfigurationInfo2 = quickLinksConfigurationModule1.getModuleInfo();
        quickLinksConfigurationModule1.setValid(false);
        org.junit.Assert.assertNotNull(quickLinksConfigurationInfo2);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.ambari.server.state.theme.ConfigCondition.ConfigConditionResult configConditionResult0 = new org.apache.ambari.server.state.theme.ConfigCondition.ConfigConditionResult();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.lang.String str0 = org.apache.ambari.server.state.ValueAttributesInfo.READ_ONLY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "read_only" + "'", str0.equals("read_only"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType syncType0 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> map_str_map_str_map_str_str5 = null;
        java.io.File[] file_array6 = new java.io.File[] {};
        java.util.ArrayList<java.io.File> arraylist_file7 = new java.util.ArrayList<java.io.File>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<java.io.File>) arraylist_file7, file_array6);
        java.lang.String[] str_array26 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str27, str_array26);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str27;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str27;
        org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning32 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
        java.util.Set<java.lang.String> set_str33 = hiveNotRollingWarning32.getApplicableServices();
        org.apache.ambari.server.controller.StackVersionResponse stackVersionResponse36 = new org.apache.ambari.server.controller.StackVersionResponse("RootServiceComponents/component_name", "ServiceInfo/service_name", true, "request_id", map_str_map_str_map_str_str5, (java.util.Collection<java.io.File>) arraylist_file7, (java.util.Set<java.lang.String>) linkedhashset_str27, false, (java.util.Collection<java.lang.String>) set_str33, "AlertNotice/target_id", "Request body for Blueprint create request is empty");
        org.apache.ambari.server.controller.LdapSyncRequest ldapSyncRequest37 = new org.apache.ambari.server.controller.LdapSyncRequest(syncType0, set_str33);
        org.junit.Assert.assertNotNull(file_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set_str33);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.lang.String str0 = org.apache.ambari.server.api.resources.RepositoryResourceDefinition.VALIDATE_ONLY_DIRECTIVE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "validate_only" + "'", str0.equals("validate_only"));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.ambari.server.security.encryption.CredentialStoreType credentialStoreType3 = null;
        org.apache.ambari.server.topology.Credential credential4 = new org.apache.ambari.server.topology.Credential("ServiceInfo/state", "timelineMetricCache", "ranger-hive-plugin-properties", credentialStoreType3);
        org.apache.ambari.server.security.encryption.CredentialStoreType credentialStoreType5 = credential4.getType();
        org.junit.Assert.assertNull(credentialStoreType5);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        int i0 = org.apache.ambari.server.orm.entities.PermissionEntity.CLUSTER_ADMINISTRATOR_PERMISSION;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SERVER_DB_NAME;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceHostComponentResourceProvider.COMPONENT_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "component_name" + "'", str0.equals("component_name"));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertNoticeResourceProvider.ALERT_NOTICE_HISTORY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertNotice/history_id" + "'", str0.equals("AlertNotice/history_id"));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.ALLOW_REVERT_COLUMN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "revert_allowed" + "'", str0.equals("revert_allowed"));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.FK_UPGRADE_TO_REPO_VERSION_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "FK_upgrade_to_repo_version_id" + "'", str0.equals("FK_upgrade_to_repo_version_id"));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfileParser quickLinksProfileParser0 = new org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfileParser();
        byte[] byte_array2 = new byte[] { (byte) 100 };
        try {
            org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfile quickLinksProfile3 = quickLinksProfileParser0.parse(byte_array2);
            org.junit.Assert.fail("Expected exception of type org.codehaus.jackson.JsonParseException");
        } catch (org.codehaus.jackson.JsonParseException e) {
        }
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.ambari.server.topology.ClusterTopology clusterTopology0 = null;
        org.apache.ambari.server.topology.HostRequest hostRequest1 = null;
        org.apache.ambari.server.topology.tasks.StartHostTask startHostTask3 = new org.apache.ambari.server.topology.tasks.StartHostTask(clusterTopology0, hostRequest1, false);
        try {
            startHostTask3.runTask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.ambari.server.orm.entities.KerberosKeytabEntity kerberosKeytabEntity1 = new org.apache.ambari.server.orm.entities.KerberosKeytabEntity("Upgrade/fail_on_check_warnings");
        java.lang.Object obj3 = kerberosKeytabEntity1._persistence_get("validate_config");
        java.lang.String str4 = kerberosKeytabEntity1._persistence_get_groupAccess();
        java.lang.String str5 = kerberosKeytabEntity1.getGroupAccess();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity0 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        java.lang.String str1 = viewResourceEntity0.getProvider();
        org.apache.ambari.server.orm.entities.ViewEntity viewEntity2 = null;
        viewResourceEntity0._persistence_set_view(viewEntity2);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.ambari.server.state.stack.Metric metric5 = new org.apache.ambari.server.state.stack.Metric("Upgrade/versions", true, false, true, "ejb");
        java.lang.String str6 = metric5.getName();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Upgrade/versions" + "'", str6.equals("Upgrade/versions"));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelper.KERBEROS_ENV;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "kerberos-env" + "'", str0.equals("kerberos-env"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.ambari.server.utils.JaxbMapKeyVal[] jaxbMapKeyVal_array1 = new org.apache.ambari.server.utils.JaxbMapKeyVal[] {};
        org.apache.ambari.server.utils.JaxbMapKeyMap jaxbMapKeyMap2 = new org.apache.ambari.server.utils.JaxbMapKeyMap("RepositoryVersions/release/compatible_with", jaxbMapKeyVal_array1);
        java.lang.String str3 = jaxbMapKeyMap2.key;
        org.junit.Assert.assertNotNull(jaxbMapKeyVal_array1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "RepositoryVersions/release/compatible_with" + "'", str3.equals("RepositoryVersions/release/compatible_with"));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.ambari.server.topology.ClusterTopology clusterTopology0 = null;
        org.apache.ambari.server.topology.ClusterConfigurationRequest clusterConfigurationRequest1 = null;
        org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher2 = null;
        org.apache.ambari.server.topology.tasks.ConfigureClusterTask configureClusterTask3 = new org.apache.ambari.server.topology.tasks.ConfigureClusterTask(clusterTopology0, clusterConfigurationRequest1, ambariEventPublisher2);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.VersionDefinitionResourceProvider.SUBRESOURCE_OPERATING_SYSTEMS_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "operating_systems" + "'", str0.equals("operating_systems"));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.ambari.server.controller.internal.Stack stack0 = null;
        org.apache.ambari.server.controller.internal.UnitUpdater.PropertyUnit propertyUnit4 = org.apache.ambari.server.controller.internal.UnitUpdater.PropertyUnit.of(stack0, "configs.dat", "RepositoryVersions/release/compatible_with", "StackServices/stack_name");
        org.junit.Assert.assertNotNull(propertyUnit4);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType comparisonType0 = org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType.CONTAINS;
        org.junit.Assert.assertTrue("'" + comparisonType0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType.CONTAINS + "'", comparisonType0.equals(org.apache.ambari.server.state.stack.upgrade.ConfigurationCondition.ComparisonType.CONTAINS));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_HEALTH_REPORT_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Clusters/health_report" + "'", str0.equals("Clusters/health_report"));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        java.lang.String str0 = org.apache.ambari.server.controller.AmbariCustomCommandExecutionHelper.DECOM_INCLUDED_HOSTS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "included_hosts" + "'", str0.equals("included_hosts"));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.ambari.server.controller.internal.PermissionResourceProvider permissionResourceProvider0 = new org.apache.ambari.server.controller.internal.PermissionResourceProvider();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.io.File file0 = null;
        org.apache.ambari.server.stack.QuickLinksConfigurationModule quickLinksConfigurationModule1 = new org.apache.ambari.server.stack.QuickLinksConfigurationModule(file0);
        quickLinksConfigurationModule1.setValid(false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity0 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        java.lang.String str1 = viewResourceEntity0.getProvider();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks2 = null;
        viewResourceEntity0._persistence_setLinks(itemLinks2);
        org.apache.ambari.server.orm.entities.ViewEntity viewEntity4 = null;
        viewResourceEntity0._persistence_set_view(viewEntity4);
        java.beans.PropertyChangeListener propertyChangeListener6 = viewResourceEntity0._persistence_getPropertyChangeListener();
        org.apache.ambari.server.orm.entities.ViewEntity viewEntity7 = null;
        viewResourceEntity0.setViewEntity(viewEntity7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(propertyChangeListener6);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.SettingResourceProvider.SETTING_SETTING_TYPE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Settings/setting_type" + "'", str0.equals("Settings/setting_type"));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MOVE;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MOVE + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_MOVE));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ActiveWidgetLayoutResourceProvider.WIDGETLAYOUT_SECTION_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/section_name" + "'", str0.equals("WidgetLayoutInfo/section_name"));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.ambari.server.api.services.WorkflowService workflowService1 = new org.apache.ambari.server.api.services.WorkflowService("ViewInstanceInfo/instance_name");
        javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
        javax.ws.rs.core.UriInfo uriInfo4 = null;
        try {
            javax.ws.rs.core.Response response5 = workflowService1.getWorkflows("Request body for Blueprint create request is empty", httpHeaders3, uriInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity, java.lang.String> singularattribute_hostEntity_str0 = null;
        org.apache.ambari.server.orm.entities.HostEntity_.rackInfo = singularattribute_hostEntity_str0;
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.ambari.server.checks.DatabaseConsistencyChecker.CheckHelperAuditModule checkHelperAuditModule0 = new org.apache.ambari.server.checks.DatabaseConsistencyChecker.CheckHelperAuditModule();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.ambari.server.events.ServiceComponentUninstalledEvent serviceComponentUninstalledEvent8 = new org.apache.ambari.server.events.ServiceComponentUninstalledEvent((long) 0, "Configuring", "alerts.json", "kerberos.json", "kerberos.json", "clusterName", false, (java.lang.Long) (-1L));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.google.inject.Injector injector0 = null;
        try {
            org.apache.ambari.server.upgrade.UpgradeCatalog260 upgradeCatalog260_1 = new org.apache.ambari.server.upgrade.UpgradeCatalog260(injector0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.ambari.server.state.stack.upgrade.RestartTask restartTask0 = new org.apache.ambari.server.state.stack.upgrade.RestartTask();
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.SELECTED_TIMESTAMP_COLUMN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "selected_timestamp" + "'", str0.equals("selected_timestamp"));
    }
}
