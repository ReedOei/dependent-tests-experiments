import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.KDC_SERVER;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        java.lang.String str0 = org.apache.ambari.server.topology.BlueprintValidatorImpl.LZO_CODEC_CLASS_PROPERTY_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "io.compression.codec.lzo.class" + "'", str0.equals("io.compression.codec.lzo.class"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        org.apache.ambari.server.orm.JPATableGenerationStrategy jPATableGenerationStrategy1 = org.apache.ambari.server.orm.JPATableGenerationStrategy.fromString("ambari.dispatch.credential.password");
        org.junit.Assert.assertTrue("'" + jPATableGenerationStrategy1 + "' != '" + org.apache.ambari.server.orm.JPATableGenerationStrategy.NONE + "'", jPATableGenerationStrategy1.equals(org.apache.ambari.server.orm.JPATableGenerationStrategy.NONE));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        java.lang.Float f0 = org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.DEFAULT_PRIORITY;
        org.junit.Assert.assertTrue("'" + f0 + "' != '" + 1.0f + "'", f0.equals(1.0f));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.Recommendation recommendation0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.Recommendation();
        java.util.Set<org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.ConfigGroup> set_configGroup1 = recommendation0.getConfigGroups();
        org.junit.Assert.assertNull(set_configGroup1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        java.lang.String str0 = org.eclipse.persistence.sessions.SessionProfiler.ConnectionManagement;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Timer:ConnectionManagement" + "'", str0.equals("Timer:ConnectionManagement"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Boolean> configurationproperty_b0 = org.apache.ambari.server.configuration.Configuration.TIMELINE_METRICS_CACHE_DISABLE;
        org.junit.Assert.assertNotNull(configurationproperty_b0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        java.io.File file0 = null;
        try {
            boolean b2 = org.apache.ambari.server.security.encryption.MasterKeyServiceImpl.initializeMasterKeyFile(file0, "servicecomponent_history");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity, java.lang.String> singularattribute_hostRoleCommandEntity_str0 = null;
        org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.customCommandName = singularattribute_hostRoleCommandEntity_str0;
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.KSTR_TYPE;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        java.lang.String str0 = org.apache.ambari.server.stack.StackDirectory.SERVICE_THEME_FILE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "theme.json" + "'", str0.equals("theme.json"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        org.apache.ambari.server.state.action.ActionId actionId0 = null;
        org.apache.ambari.server.state.action.ActionFailedEvent actionFailedEvent2 = new org.apache.ambari.server.state.action.ActionFailedEvent(actionId0, (long) 20);
        org.apache.ambari.server.state.action.ActionId actionId3 = actionFailedEvent2.getActionId();
        org.junit.Assert.assertNull(actionId3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.RECOVERY_WINDOW_IN_MIN;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.JAVA_HOME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "java_home" + "'", str0.equals("java_home"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        org.apache.ambari.server.state.alert.SourceType sourceType0 = org.apache.ambari.server.state.alert.SourceType.METRIC;
        org.junit.Assert.assertTrue("'" + sourceType0 + "' != '" + org.apache.ambari.server.state.alert.SourceType.METRIC + "'", sourceType0.equals(org.apache.ambari.server.state.alert.SourceType.METRIC));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity0 = new org.apache.ambari.server.orm.entities.ClusterServiceEntity();
        boolean b2 = clusterServiceEntity0._persistence_isAttributeFetched("validate_config");
        java.lang.Object obj3 = clusterServiceEntity0._persistence_getId();
        clusterServiceEntity0.setClusterId((java.lang.Long) 1L);
        org.apache.ambari.server.orm.entities.ClusterEntity clusterEntity6 = clusterServiceEntity0.getClusterEntity();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(clusterEntity6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        org.apache.ambari.server.ldap.service.AmbariLdapFacade.Parameters parameters0 = org.apache.ambari.server.ldap.service.AmbariLdapFacade.Parameters.TEST_USER_PASSWORD;
        org.junit.Assert.assertTrue("'" + parameters0 + "' != '" + org.apache.ambari.server.ldap.service.AmbariLdapFacade.Parameters.TEST_USER_PASSWORD + "'", parameters0.equals(org.apache.ambari.server.ldap.service.AmbariLdapFacade.Parameters.TEST_USER_PASSWORD));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.STATIC_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/static" + "'", str0.equals("ViewInstanceInfo/static"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.SECURITY_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "security_type" + "'", str0.equals("security_type"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        org.apache.ambari.server.view.validation.ValidationException validationException1 = new org.apache.ambari.server.view.validation.ValidationException("ambari_java_version");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
        org.apache.ambari.server.controller.internal.LoggingResourceProvider loggingResourceProvider1 = new org.apache.ambari.server.controller.internal.LoggingResourceProvider(ambariManagementController0);
        java.lang.String[] str_array19 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str20, str_array19);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str20;
        org.apache.ambari.server.controller.internal.ConfigurationTopologyException configurationTopologyException23 = new org.apache.ambari.server.controller.internal.ConfigurationTopologyException((java.util.Collection<java.lang.String>) linkedhashset_str20);
        java.util.Set<java.lang.String> set_str24 = loggingResourceProvider1.checkPropertyIds((java.util.Set<java.lang.String>) linkedhashset_str20);
        java.lang.String[] str_array42 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str43, str_array42);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str43;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str43;
        org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.propertyIds = linkedhashset_str43;
        java.lang.String[] str_array65 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str66, str_array65);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str66;
        org.apache.ambari.server.controller.internal.ConfigurationTopologyException configurationTopologyException69 = new org.apache.ambari.server.controller.internal.ConfigurationTopologyException((java.util.Collection<java.lang.String>) linkedhashset_str66);
        org.apache.ambari.server.controller.AmbariManagementController ambariManagementController70 = null;
        org.apache.ambari.server.controller.internal.LoggingResourceProvider loggingResourceProvider71 = new org.apache.ambari.server.controller.internal.LoggingResourceProvider(ambariManagementController70);
        java.lang.String[] str_array89 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str90 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str90, str_array89);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str90;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str90;
        java.util.Set<java.lang.String> set_str94 = loggingResourceProvider71.checkPropertyIds((java.util.Set<java.lang.String>) linkedhashset_str90);
        org.apache.ambari.server.orm.dao.KerberosKeytabPrincipalDAO.KerberosKeytabPrincipalFilter kerberosKeytabPrincipalFilter95 = new org.apache.ambari.server.orm.dao.KerberosKeytabPrincipalDAO.KerberosKeytabPrincipalFilter((java.util.Collection<java.lang.String>) set_str24, (java.util.Collection<java.lang.String>) linkedhashset_str43, (java.util.Collection<java.lang.String>) linkedhashset_str66, (java.util.Collection<java.lang.String>) set_str94);
        java.util.Collection<java.lang.String> collection_str96 = kerberosKeytabPrincipalFilter95.getServiceNames();
        org.junit.Assert.assertNotNull(str_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set_str24);
        org.junit.Assert.assertNotNull(str_array42);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(str_array65);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(str_array89);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertNotNull(set_str94);
        org.junit.Assert.assertNotNull(collection_str96);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.SQOOP_SERVICE_CHECK;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
        org.apache.ambari.server.controller.internal.LoggingResourceProvider loggingResourceProvider1 = new org.apache.ambari.server.controller.internal.LoggingResourceProvider(ambariManagementController0);
        java.lang.String[] str_array19 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str20, str_array19);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str20;
        org.apache.ambari.server.controller.internal.ConfigurationTopologyException configurationTopologyException23 = new org.apache.ambari.server.controller.internal.ConfigurationTopologyException((java.util.Collection<java.lang.String>) linkedhashset_str20);
        java.util.Set<java.lang.String> set_str24 = loggingResourceProvider1.checkPropertyIds((java.util.Set<java.lang.String>) linkedhashset_str20);
        java.lang.String[] str_array42 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str43, str_array42);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str43;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str43;
        org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.propertyIds = linkedhashset_str43;
        java.lang.String[] str_array65 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str66, str_array65);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str66;
        org.apache.ambari.server.controller.internal.ConfigurationTopologyException configurationTopologyException69 = new org.apache.ambari.server.controller.internal.ConfigurationTopologyException((java.util.Collection<java.lang.String>) linkedhashset_str66);
        org.apache.ambari.server.controller.AmbariManagementController ambariManagementController70 = null;
        org.apache.ambari.server.controller.internal.LoggingResourceProvider loggingResourceProvider71 = new org.apache.ambari.server.controller.internal.LoggingResourceProvider(ambariManagementController70);
        java.lang.String[] str_array89 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str90 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str90, str_array89);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str90;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str90;
        java.util.Set<java.lang.String> set_str94 = loggingResourceProvider71.checkPropertyIds((java.util.Set<java.lang.String>) linkedhashset_str90);
        org.apache.ambari.server.orm.dao.KerberosKeytabPrincipalDAO.KerberosKeytabPrincipalFilter kerberosKeytabPrincipalFilter95 = new org.apache.ambari.server.orm.dao.KerberosKeytabPrincipalDAO.KerberosKeytabPrincipalFilter((java.util.Collection<java.lang.String>) set_str24, (java.util.Collection<java.lang.String>) linkedhashset_str43, (java.util.Collection<java.lang.String>) linkedhashset_str66, (java.util.Collection<java.lang.String>) set_str94);
        java.util.Collection<java.lang.String> collection_str96 = kerberosKeytabPrincipalFilter95.getPrincipals();
        org.junit.Assert.assertNotNull(str_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set_str24);
        org.junit.Assert.assertNotNull(str_array42);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(str_array65);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(str_array89);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertNotNull(set_str94);
        org.junit.Assert.assertNotNull(collection_str96);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.SERVER_TASK_TIMEOUT;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        org.apache.ambari.server.controller.utilities.state.HiveServiceCalculatedState hiveServiceCalculatedState0 = new org.apache.ambari.server.controller.utilities.state.HiveServiceCalculatedState();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        org.apache.ambari.server.orm.entities.ViewParameterEntityPK viewParameterEntityPK0 = new org.apache.ambari.server.orm.entities.ViewParameterEntityPK();
        java.lang.String str1 = viewParameterEntityPK0.getName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        org.apache.ambari.server.state.stack.upgrade.TaskWrapperBuilder taskWrapperBuilder0 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapperBuilder();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ArtifactResourceProvider.SERVICE_NAME_PROPERTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Artifacts/service_name" + "'", str0.equals("Artifacts/service_name"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        org.apache.ambari.server.controller.internal.PasswordTrimmingStrategy passwordTrimmingStrategy0 = new org.apache.ambari.server.controller.internal.PasswordTrimmingStrategy();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        org.apache.ambari.server.state.alert.TargetType targetType0 = org.apache.ambari.server.state.alert.TargetType.EMAIL;
        org.junit.Assert.assertTrue("'" + targetType0 + "' != '" + org.apache.ambari.server.state.alert.TargetType.EMAIL + "'", targetType0.equals(org.apache.ambari.server.state.alert.TargetType.EMAIL));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.AmbariSNMPDispatcher.APACHE_AMBARI_TRAPS_OID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.3.6.1.4.1.18060.16.0" + "'", str0.equals("1.3.6.1.4.1.18060.16.0"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        java.util.Set<java.lang.String> set_str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.propertyIds;
        org.junit.Assert.assertNotNull(set_str0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        boolean b0 = org.apache.ambari.server.utils.ShellCommandUtil.LINUX;
        org.junit.Assert.assertTrue(b0 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFile.PRINCIPAL_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "principal_type" + "'", str0.equals("principal_type"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.FK_HOSTCOMPONENTDESIREDSTATE_DESIRED_STACK_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "FK_hostcomponentdesiredstate_desired_stack_id" + "'", str0.equals("FK_hostcomponentdesiredstate_desired_stack_id"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        org.apache.ambari.server.topology.BlueprintFactory blueprintFactory0 = null;
        org.apache.ambari.server.orm.dao.BlueprintDAO blueprintDAO1 = null;
        org.apache.ambari.server.topology.SecurityConfigurationFactory securityConfigurationFactory2 = null;
        com.google.gson.Gson gson3 = null;
        org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo4 = null;
        org.apache.ambari.server.controller.internal.BlueprintResourceProvider.init(blueprintFactory0, blueprintDAO1, securityConfigurationFactory2, gson3, ambariMetaInfo4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        org.apache.ambari.server.api.predicate.Token.TYPE tYPE0 = org.apache.ambari.server.api.predicate.Token.TYPE.PROPERTY_OPERAND;
        org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.ambari.server.api.predicate.Token.TYPE.PROPERTY_OPERAND + "'", tYPE0.equals(org.apache.ambari.server.api.predicate.Token.TYPE.PROPERTY_OPERAND));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_HOST_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/host_name" + "'", str0.equals("HostRoles/host_name"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertDefinitionEntity, java.lang.String> singularattribute_alertDefinitionEntity_str0 = null;
        org.apache.ambari.server.orm.entities.AlertDefinitionEntity_.hash = singularattribute_alertDefinitionEntity_str0;
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        org.apache.ambari.server.state.HostEventType hostEventType0 = org.apache.ambari.server.state.HostEventType.HOST_STATUS_UPDATES_RECEIVED;
        org.junit.Assert.assertTrue("'" + hostEventType0 + "' != '" + org.apache.ambari.server.state.HostEventType.HOST_STATUS_UPDATES_RECEIVED + "'", hostEventType0.equals(org.apache.ambari.server.state.HostEventType.HOST_STATUS_UPDATES_RECEIVED));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.USERS_TABLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "users" + "'", str0.equals("users"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
        org.apache.ambari.server.orm.helpers.dbms.DerbyHelper derbyHelper1 = new org.apache.ambari.server.orm.helpers.dbms.DerbyHelper(databasePlatform0);
        org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo3 = null;
        try {
            java.lang.String str4 = derbyHelper1.getAddColumnStatement("/api/v1/views/*", dBColumnInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity0 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks1 = viewResourceEntity0._persistence_getLinks();
        org.junit.Assert.assertNull(itemLinks1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher0 = null;
        try {
            org.apache.ambari.server.events.listeners.alerts.AlertStateChangedListener alertStateChangedListener1 = new org.apache.ambari.server.events.listeners.alerts.AlertStateChangedListener(alertEventPublisher0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.REPOSITORY_VERSION_STACK_SERVICES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RepositoryVersions/stack_services" + "'", str0.equals("RepositoryVersions/stack_services"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        org.apache.ambari.server.state.stack.UpgradePack.ProcessingComponent processingComponent0 = new org.apache.ambari.server.state.stack.UpgradePack.ProcessingComponent();
        java.util.List<org.apache.ambari.server.state.stack.upgrade.Task> list_task1 = processingComponent0.tasks;
        org.junit.Assert.assertNull(list_task1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        org.apache.ambari.server.audit.request.eventcreator.DefaultEventCreator defaultEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.DefaultEventCreator();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        org.apache.ambari.server.DBConnectionVerification dBConnectionVerification0 = new org.apache.ambari.server.DBConnectionVerification();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_PUBLIC_HOST_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/public_host_name" + "'", str0.equals("HostRoles/public_host_name"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType stackAdvisorCommandType0 = org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.RECOMMEND_CONFIGURATIONS;
        org.junit.Assert.assertTrue("'" + stackAdvisorCommandType0 + "' != '" + org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.RECOMMEND_CONFIGURATIONS + "'", stackAdvisorCommandType0.equals(org.apache.ambari.server.api.services.stackadvisor.commands.StackAdvisorCommandType.RECOMMEND_CONFIGURATIONS));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        java.lang.String[] str_array1 = new java.lang.String[] { "timelineMetricCacheManager" };
        try {
            org.apache.ambari.server.utils.ShellCommandUtil.Result result2 = org.apache.ambari.server.utils.ShellCommandUtil.runCommand(str_array1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(str_array1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.TaskResourceProvider.TASK_OUTPUTLOG_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tasks/output_log" + "'", str0.equals("Tasks/output_log"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        org.apache.ambari.server.bootstrap.BootStrapImpl bootStrapImpl0 = null;
        org.apache.ambari.server.api.rest.BootStrapResource.init(bootStrapImpl0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SRVR_KSTR_DIR;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        org.apache.ambari.server.state.svccomphost.ServiceComponentHostStopEvent serviceComponentHostStopEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostStopEvent("principal_type", "tagsForPrefix.", (long) 100);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        org.apache.ambari.server.actionmanager.Stage[] stage_array0 = new org.apache.ambari.server.actionmanager.Stage[] {};
        java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage> arraylist_stage1 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage1, stage_array0);
        org.apache.ambari.server.controller.internal.CalculatedStatus calculatedStatus3 = org.apache.ambari.server.controller.internal.CalculatedStatus.statusFromStages((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage1);
        org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest5 = null;
        org.apache.ambari.server.state.Clusters clusters6 = null;
        com.google.gson.Gson gson7 = null;
        try {
            org.apache.ambari.server.actionmanager.Request request8 = new org.apache.ambari.server.actionmanager.Request((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage1, "UQ_host_repo", executeActionRequest5, clusters6, gson7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(stage_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(calculatedStatus3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        org.apache.ambari.server.orm.dao.AmbariConfigurationDAO ambariConfigurationDAO0 = new org.apache.ambari.server.orm.dao.AmbariConfigurationDAO();
        org.apache.ambari.server.orm.entities.AmbariConfigurationEntity ambariConfigurationEntity1 = null;
        try {
            ambariConfigurationDAO0.refresh(ambariConfigurationEntity1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        org.apache.ambari.server.checks.ConfigurationMergeCheck.MergeDetail mergeDetail0 = new org.apache.ambari.server.checks.ConfigurationMergeCheck.MergeDetail();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        java.io.File file0 = null;
        org.apache.ambari.server.stack.QuickLinksConfigurationModule quickLinksConfigurationModule1 = new org.apache.ambari.server.stack.QuickLinksConfigurationModule(file0);
        org.apache.ambari.server.state.QuickLinksConfigurationInfo quickLinksConfigurationInfo2 = quickLinksConfigurationModule1.getModuleInfo();
        quickLinksConfigurationInfo2.setIsDefault((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(quickLinksConfigurationInfo2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        org.apache.ambari.server.api.services.SettingService settingService0 = new org.apache.ambari.server.api.services.SettingService();
        javax.ws.rs.core.HttpHeaders httpHeaders1 = null;
        javax.ws.rs.core.UriInfo uriInfo2 = null;
        try {
            javax.ws.rs.core.Response response4 = settingService0.deleteSetting(httpHeaders1, uriInfo2, "StackConfigurationDependency/dependency_type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationResourceProvider.PROPERTY_VALUE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurations/property_value" + "'", str0.equals("StackConfigurations/property_value"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity0 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.beans.PropertyChangeListener propertyChangeListener1 = requestOperationLevelEntity0._persistence_getPropertyChangeListener();
        requestOperationLevelEntity0.setServiceName("Stage/stage_id");
        org.eclipse.persistence.internal.identitymaps.CacheKey cacheKey4 = null;
        requestOperationLevelEntity0._persistence_setCacheKey(cacheKey4);
        org.junit.Assert.assertNull(propertyChangeListener1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        org.apache.ambari.server.state.ComponentInfo componentInfo0 = null;
        try {
            org.apache.ambari.server.controller.StackServiceComponentResponse stackServiceComponentResponse1 = new org.apache.ambari.server.controller.StackServiceComponentResponse(componentInfo0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        org.apache.ambari.server.state.quicklinks.QuickLinks quickLinks0 = new org.apache.ambari.server.state.quicklinks.QuickLinks();
        org.apache.ambari.server.state.quicklinks.QuickLinksConfiguration quickLinksConfiguration1 = null;
        quickLinks0.setQuickLinksConfiguration(quickLinksConfiguration1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_PUBLIC_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts/public_host_name" + "'", str0.equals("Hosts/public_host_name"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule0 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
        org.apache.ambari.server.controller.spi.Resource.Type type1 = null;
        try {
            org.apache.ambari.server.controller.spi.ResourceProvider resourceProvider2 = defaultProviderModule0.getResourceProvider(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus0 = org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING_TIMEDOUT;
        org.junit.Assert.assertTrue("'" + hostRoleStatus0 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING_TIMEDOUT + "'", hostRoleStatus0.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING_TIMEDOUT));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        org.apache.ambari.server.state.RepositoryVersionState repositoryVersionState0 = org.apache.ambari.server.state.RepositoryVersionState.INSTALLING;
        org.junit.Assert.assertTrue("'" + repositoryVersionState0 + "' != '" + org.apache.ambari.server.state.RepositoryVersionState.INSTALLING + "'", repositoryVersionState0.equals(org.apache.ambari.server.state.RepositoryVersionState.INSTALLING));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        org.apache.ambari.server.orm.dao.AmbariConfigurationDAO ambariConfigurationDAO0 = new org.apache.ambari.server.orm.dao.AmbariConfigurationDAO();
        org.apache.ambari.server.orm.entities.AmbariConfigurationEntity ambariConfigurationEntity1 = null;
        try {
            org.apache.ambari.server.orm.entities.AmbariConfigurationEntity ambariConfigurationEntity2 = ambariConfigurationDAO0.merge(ambariConfigurationEntity1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        org.apache.ambari.server.api.resources.StackConfigurationDependencyResourceDefinition stackConfigurationDependencyResourceDefinition0 = new org.apache.ambari.server.api.resources.StackConfigurationDependencyResourceDefinition();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        org.apache.ambari.server.orm.entities.KerberosKeytabEntity kerberosKeytabEntity1 = new org.apache.ambari.server.orm.entities.KerberosKeytabEntity("Upgrade/fail_on_check_warnings");
        java.lang.Object obj3 = kerberosKeytabEntity1._persistence_get("validate_config");
        java.lang.String str4 = kerberosKeytabEntity1._persistence_get_groupAccess();
        org.eclipse.persistence.queries.FetchGroup fetchGroup5 = null;
        kerberosKeytabEntity1._persistence_setFetchGroup(fetchGroup5);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        org.apache.ambari.server.state.action.ActionEventType actionEventType0 = org.apache.ambari.server.state.action.ActionEventType.ACTION_FAILED;
        org.junit.Assert.assertTrue("'" + actionEventType0 + "' != '" + org.apache.ambari.server.state.action.ActionEventType.ACTION_FAILED + "'", actionEventType0.equals(org.apache.ambari.server.state.action.ActionEventType.ACTION_FAILED));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        org.apache.ambari.server.orm.entities.StackEntity stackEntity1 = null;
        serviceConfigEntity0._persistence_set_stack(stackEntity1);
        java.lang.Long long3 = serviceConfigEntity0.getServiceConfigId();
        org.junit.Assert.assertNull(long3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys ambariLdapConfigurationKeys0 = org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.GROUP_OBJECT_CLASS;
        org.junit.Assert.assertTrue("'" + ambariLdapConfigurationKeys0 + "' != '" + org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.GROUP_OBJECT_CLASS + "'", ambariLdapConfigurationKeys0.equals(org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.GROUP_OBJECT_CLASS));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.AmbariSNMPDispatcher.AMBARI_ALERTS_OID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.3.6.1.4.1.18060.16.1" + "'", str0.equals("1.3.6.1.4.1.18060.16.1"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        java.lang.String str0 = org.eclipse.persistence.sessions.SessionProfiler.LoginTime;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Info:LoginTime" + "'", str0.equals("Info:LoginTime"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity, java.lang.String> singularattribute_hostEntity_str0 = null;
        org.apache.ambari.server.orm.entities.HostEntity_.hostName = singularattribute_hostEntity_str0;
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        org.apache.ambari.server.hooks.HookContext hookContext0 = null;
        org.apache.ambari.server.hooks.users.UserCreatedEvent userCreatedEvent1 = new org.apache.ambari.server.hooks.users.UserCreatedEvent(hookContext0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        org.apache.ambari.server.controller.ServiceComponentHostRequest serviceComponentHostRequest5 = new org.apache.ambari.server.controller.ServiceComponentHostRequest("RepositoryVersions/release/compatible_with", "STANDARD", "configure-task-insertions", "AlertNotice/target_id", "WidgetInfo/description");
        java.lang.String str6 = serviceComponentHostRequest5.toString();
        serviceComponentHostRequest5.setDesiredState("Repositories/distribution");
        java.lang.String str9 = serviceComponentHostRequest5.getMaintenanceState();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{ clusterName=RepositoryVersions/release/compatible_with, serviceName=STANDARD, componentName=configure-task-insertions, hostname=AlertNotice/target_id, publicHostname=null, desiredState=WidgetInfo/description, state=null, desiredStackId=null, staleConfig=null, adminState=null, maintenanceState=null}" + "'", str6.equals("{ clusterName=RepositoryVersions/release/compatible_with, serviceName=STANDARD, componentName=configure-task-insertions, hostname=AlertNotice/target_id, publicHostname=null, desiredState=WidgetInfo/description, state=null, desiredStackId=null, staleConfig=null, adminState=null, maintenanceState=null}"));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        org.eclipse.persistence.internal.descriptors.PersistenceObject persistenceObject0 = null;
        org.apache.ambari.server.orm.entities.BlueprintSettingEntity blueprintSettingEntity1 = new org.apache.ambari.server.orm.entities.BlueprintSettingEntity(persistenceObject0);
        blueprintSettingEntity1.setSettingName("Event/sync_time/end");
        java.lang.String str4 = blueprintSettingEntity1.getSettingName();
        java.lang.String str5 = blueprintSettingEntity1.getBlueprintName();
        blueprintSettingEntity1.setSettingData("ViewVersionInfo/parameters");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Event/sync_time/end" + "'", str4.equals("Event/sync_time/end"));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertNoticeEntity, org.apache.ambari.server.orm.entities.AlertTargetEntity> singularattribute_alertNoticeEntity_alertTargetEntity0 = org.apache.ambari.server.orm.entities.AlertNoticeEntity_.alertTarget;
        org.junit.Assert.assertNull(singularattribute_alertNoticeEntity_alertTargetEntity0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        org.apache.ambari.server.stack.MasterHostResolver.Service service0 = org.apache.ambari.server.stack.MasterHostResolver.Service.OTHER;
        org.junit.Assert.assertTrue("'" + service0 + "' != '" + org.apache.ambari.server.stack.MasterHostResolver.Service.OTHER + "'", service0.equals(org.apache.ambari.server.stack.MasterHostResolver.Service.OTHER));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS0 = org.apache.ambari.server.api.services.ResultStatus.STATUS.CONFLICT;
        org.junit.Assert.assertTrue("'" + sTATUS0 + "' != '" + org.apache.ambari.server.api.services.ResultStatus.STATUS.CONFLICT + "'", sTATUS0.equals(org.apache.ambari.server.api.services.ResultStatus.STATUS.CONFLICT));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.HBASE_SITE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hbase-site" + "'", str0.equals("hbase-site"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO hostRoleCommandStatusSummaryDTO15 = new org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO((java.lang.Number) (short) 100, (java.lang.Number) 100, (java.lang.Number) (short) 10, (java.lang.Number) 1.0f, (java.lang.Number) 8670, (java.lang.Number) 0, (java.lang.Number) (-1L), (java.lang.Number) 100, (java.lang.Number) (byte) 1, (java.lang.Number) 10, (java.lang.Number) (short) -1, (java.lang.Number) (short) 100, (java.lang.Number) (-1L), (java.lang.Number) (byte) 1, (java.lang.Number) 8670);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_CONNECTION_POOL_ACQUISITION_RETRY_DELAY;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        int i0 = org.apache.ambari.server.configuration.Configuration.PROCESSOR_BASED_THREADPOOL_MAX_SIZE_DEFAULT;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        char char0 = org.apache.ambari.server.controller.utilities.PropertyHelper.EXTERNAL_PATH_SEP;
        org.junit.Assert.assertTrue(char0 == '/');
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        org.apache.ambari.server.api.predicate.operators.LessOperator lessOperator0 = new org.apache.ambari.server.api.predicate.operators.LessOperator();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        java.lang.String str0 = org.apache.ambari.server.api.services.RootServiceComponentConfigurationService.DIRECTIVE_OPERATION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "op" + "'", str0.equals("op"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.SettingResourceProvider.UPDATE_TIMESTAMP;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "update_timestamp" + "'", str0.equals("update_timestamp"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        org.apache.ambari.server.hooks.users.UserHookParams userHookParams0 = org.apache.ambari.server.hooks.users.UserHookParams.CMD_INPUT_FILE;
        org.junit.Assert.assertTrue("'" + userHookParams0 + "' != '" + org.apache.ambari.server.hooks.users.UserHookParams.CMD_INPUT_FILE + "'", userHookParams0.equals(org.apache.ambari.server.hooks.users.UserHookParams.CMD_INPUT_FILE));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity, byte[]> singularattribute_stageEntity_byte_array0 = null;
        org.apache.ambari.server.orm.entities.StageEntity_.commandParamsStage = singularattribute_stageEntity_byte_array0;
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.JDK_NAME;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        java.lang.Object obj1 = requestResourceFilterEntity0._persistence_shallow_clone();
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        java.util.Properties properties0 = null;
        try {
            org.apache.ambari.server.upgrade.SchemaUpgradeHelper.UpgradeHelperModule upgradeHelperModule1 = new org.apache.ambari.server.upgrade.SchemaUpgradeHelper.UpgradeHelperModule(properties0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        org.apache.ambari.server.api.services.CredentialService credentialService1 = new org.apache.ambari.server.api.services.CredentialService("CompatibleRepositoryVersions/upgrade_types");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        org.apache.ambari.server.serveraction.kerberos.CreateKeytabFilesServerAction createKeytabFilesServerAction0 = new org.apache.ambari.server.serveraction.kerberos.CreateKeytabFilesServerAction();
        org.apache.ambari.server.agent.ExecutionCommand executionCommand1 = createKeytabFilesServerAction0.getExecutionCommand();
        org.junit.Assert.assertNull(executionCommand1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity0 = new org.apache.ambari.server.orm.entities.ClusterServiceEntity();
        boolean b2 = clusterServiceEntity0._persistence_isAttributeFetched("validate_config");
        java.lang.Object obj3 = clusterServiceEntity0._persistence_getId();
        clusterServiceEntity0.setClusterId((java.lang.Long) 1L);
        java.beans.PropertyChangeListener propertyChangeListener6 = clusterServiceEntity0._persistence_getPropertyChangeListener();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(propertyChangeListener6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_CONNECTION_POOL_MIN_SIZE;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        java.io.File file0 = null;
        org.apache.ambari.server.security.encryption.FileBasedCredentialStore fileBasedCredentialStore1 = new org.apache.ambari.server.security.encryption.FileBasedCredentialStore(file0);
        org.apache.ambari.server.security.encryption.MasterKeyService masterKeyService2 = null;
        fileBasedCredentialStore1.setMasterKeyService(masterKeyService2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosServerAction.OPERATION_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "operation_type" + "'", str0.equals("operation_type"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        org.apache.ambari.server.state.PropertyInfo.PropertyType propertyType6 = org.apache.ambari.server.state.PropertyInfo.PropertyType.UID;
        org.apache.ambari.server.state.PropertyInfo.PropertyType[] propertyType_array7 = new org.apache.ambari.server.state.PropertyInfo.PropertyType[] { propertyType6 };
        java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyInfo.PropertyType> linkedhashset_propertyType8 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyInfo.PropertyType>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyInfo.PropertyType>) linkedhashset_propertyType8, propertyType_array7);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> map_str_map_str_map_str_str16 = null;
        java.io.File[] file_array17 = new java.io.File[] {};
        java.util.ArrayList<java.io.File> arraylist_file18 = new java.util.ArrayList<java.io.File>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<java.io.File>) arraylist_file18, file_array17);
        java.lang.String[] str_array37 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str38, str_array37);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str38;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str38;
        org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning43 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
        java.util.Set<java.lang.String> set_str44 = hiveNotRollingWarning43.getApplicableServices();
        org.apache.ambari.server.controller.StackVersionResponse stackVersionResponse47 = new org.apache.ambari.server.controller.StackVersionResponse("RootServiceComponents/component_name", "ServiceInfo/service_name", true, "request_id", map_str_map_str_map_str_str16, (java.util.Collection<java.io.File>) arraylist_file18, (java.util.Set<java.lang.String>) linkedhashset_str38, false, (java.util.Collection<java.lang.String>) set_str44, "AlertNotice/target_id", "Request body for Blueprint create request is empty");
        java.util.Map<java.lang.String, java.lang.String> map_str_str48 = null;
        org.apache.ambari.server.state.stack.upgrade.Task[] task_array49 = new org.apache.ambari.server.state.stack.upgrade.Task[] {};
        org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper50 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("name", "Users/groups", (java.util.Set<java.lang.String>) linkedhashset_str38, map_str_str48, task_array49);
        java.util.Map<java.lang.String, java.lang.String> map_str_str51 = taskWrapper50.getParams();
        org.apache.ambari.server.state.ValueAttributesInfo valueAttributesInfo52 = null;
        org.apache.ambari.server.state.PropertyDependencyInfo[] propertyDependencyInfo_array53 = new org.apache.ambari.server.state.PropertyDependencyInfo[] {};
        java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo> linkedhashset_propertyDependencyInfo54 = new java.util.LinkedHashSet<org.apache.ambari.server.state.PropertyDependencyInfo>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.PropertyDependencyInfo>) linkedhashset_propertyDependencyInfo54, propertyDependencyInfo_array53);
        org.apache.ambari.server.controller.StackLevelConfigurationResponse stackLevelConfigurationResponse56 = new org.apache.ambari.server.controller.StackLevelConfigurationResponse("Stopping", "AlertHistory/state", "realm", "Event/summary/memberships/created", "StackConfigurations/property_type", (java.lang.Boolean) false, (java.util.Set<org.apache.ambari.server.state.PropertyInfo.PropertyType>) linkedhashset_propertyType8, map_str_str51, valueAttributesInfo52, (java.util.Set<org.apache.ambari.server.state.PropertyDependencyInfo>) linkedhashset_propertyDependencyInfo54);
        stackLevelConfigurationResponse56.setPropertyValue("security_type");
        org.junit.Assert.assertTrue("'" + propertyType6 + "' != '" + org.apache.ambari.server.state.PropertyInfo.PropertyType.UID + "'", propertyType6.equals(org.apache.ambari.server.state.PropertyInfo.PropertyType.UID));
        org.junit.Assert.assertNotNull(propertyType_array7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(file_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(set_str44);
        org.junit.Assert.assertNotNull(task_array49);
        org.junit.Assert.assertNotNull(map_str_str51);
        org.junit.Assert.assertNotNull(propertyDependencyInfo_array53);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        try {
            java.lang.String str1 = org.apache.ambari.server.utils.RequestUtils.getRemoteAddress(httpServletRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        org.apache.ambari.server.collections.functors.PredicateClassFactory predicateClassFactory0 = new org.apache.ambari.server.collections.functors.PredicateClassFactory();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        org.apache.ambari.server.state.ExtensionInfo extensionInfo0 = null;
        try {
            org.apache.ambari.server.state.ExtensionId extensionId1 = new org.apache.ambari.server.state.ExtensionId(extensionInfo0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StageResourceProvider.STAGE_COMMAND_PARAMS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stage/command_params" + "'", str0.equals("Stage/command_params"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        org.eclipse.persistence.internal.descriptors.PersistenceObject persistenceObject0 = null;
        org.apache.ambari.server.orm.entities.BlueprintSettingEntity blueprintSettingEntity1 = new org.apache.ambari.server.orm.entities.BlueprintSettingEntity(persistenceObject0);
        blueprintSettingEntity1.setSettingName("Event/sync_time/end");
        java.lang.String str4 = blueprintSettingEntity1.getSettingName();
        java.lang.String str5 = blueprintSettingEntity1.getBlueprintName();
        org.eclipse.persistence.sessions.Session session6 = null;
        blueprintSettingEntity1._persistence_setSession(session6);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Event/sync_time/end" + "'", str4.equals("Event/sync_time/end"));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        org.apache.ambari.server.serveraction.kerberos.IPAKerberosOperationHandler iPAKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.IPAKerberosOperationHandler();
        try {
            boolean b3 = iPAKerberosOperationHandler0.removePrincipal("ambari.dispatch.credential.password", false);
            org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.serveraction.kerberos.KerberosOperationException");
        } catch (org.apache.ambari.server.serveraction.kerberos.KerberosOperationException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
        org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder2 = deleteRepositoryVersionAuditEventBuilder0.withUrl("FK_upgrade_to_repo_version_id");
        org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        org.apache.ambari.server.checks.RangerPasswordCheck rangerPasswordCheck0 = new org.apache.ambari.server.checks.RangerPasswordCheck();
        org.apache.ambari.server.state.stack.PrerequisiteCheck prerequisiteCheck1 = null;
        org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType3 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING;
        org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest4 = new org.apache.ambari.server.controller.PrereqCheckRequest("version", upgradeType3);
        try {
            rangerPasswordCheck0.perform(prerequisiteCheck1, prereqCheckRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + upgradeType3 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING + "'", upgradeType3.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        org.apache.ambari.server.state.alert.AlertTarget alertTarget0 = new org.apache.ambari.server.state.alert.AlertTarget();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceConfigVersionResourceProvider.SERVICE_CONFIG_VERSION_IS_CURRENT_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "is_current" + "'", str0.equals("is_current"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        org.apache.ambari.server.state.AgentVersion agentVersion1 = new org.apache.ambari.server.state.AgentVersion("request_id");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        org.apache.ambari.server.checks.ComponentsExistInRepoCheck componentsExistInRepoCheck0 = new org.apache.ambari.server.checks.ComponentsExistInRepoCheck();
        org.apache.ambari.server.state.stack.PrereqCheckType prereqCheckType1 = componentsExistInRepoCheck0.getType();
        org.junit.Assert.assertTrue("'" + prereqCheckType1 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckType.CLUSTER + "'", prereqCheckType1.equals(org.apache.ambari.server.state.stack.PrereqCheckType.CLUSTER));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        java.lang.String str0 = org.apache.ambari.server.metadata.RoleCommandOrder.NO_GLUSTERFS_DEPS_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "optional_no_glusterfs" + "'", str0.equals("optional_no_glusterfs"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        org.apache.ambari.server.api.services.ServiceService serviceService1 = new org.apache.ambari.server.api.services.ServiceService("configure-task-insertions");
        javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
        javax.ws.rs.core.UriInfo uriInfo4 = null;
        try {
            javax.ws.rs.core.Response response6 = serviceService1.updateService("ACTION_USER_NAME", httpHeaders3, uriInfo4, "CompatibleRepositoryVersions/upgrade_types");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        org.apache.ambari.server.security.authorization.User user1 = null;
        org.apache.ambari.server.security.authorization.AmbariGrantedAuthority[] ambariGrantedAuthority_array2 = new org.apache.ambari.server.security.authorization.AmbariGrantedAuthority[] {};
        java.util.ArrayList<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority> arraylist_ambariGrantedAuthority3 = new java.util.ArrayList<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority>) arraylist_ambariGrantedAuthority3, ambariGrantedAuthority_array2);
        org.apache.ambari.server.security.authorization.jwt.JwtAuthentication jwtAuthentication5 = new org.apache.ambari.server.security.authorization.jwt.JwtAuthentication("timelineMetricCache", user1, (java.util.Collection<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority>) arraylist_ambariGrantedAuthority3);
        java.util.Collection<? extends org.apache.ambari.server.security.authorization.AmbariGrantedAuthority> collection_wildcard6 = jwtAuthentication5.getAuthorities();
        org.junit.Assert.assertNotNull(ambariGrantedAuthority_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection_wildcard6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition configUpgradeChangeDefinition0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition();
        java.lang.String str1 = configUpgradeChangeDefinition0.summary;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        try {
            java.lang.String str1 = org.apache.ambari.server.controller.internal.RequestOperationLevel.getExternalLevelName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        org.apache.ambari.server.state.scheduler.BatchRequest.Type type0 = org.apache.ambari.server.state.scheduler.BatchRequest.Type.PUT;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.ambari.server.state.scheduler.BatchRequest.Type.PUT + "'", type0.equals(org.apache.ambari.server.state.scheduler.BatchRequest.Type.PUT));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType concatenationType0 = org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType.NEW_LINES_ESCAPED;
        org.junit.Assert.assertTrue("'" + concatenationType0 + "' != '" + org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType.NEW_LINES_ESCAPED + "'", concatenationType0.equals(org.apache.ambari.server.controller.AuthToLocalBuilder.ConcatenationType.NEW_LINES_ESCAPED));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        org.apache.ambari.server.api.resources.ActiveWidgetLayoutResourceDefinition activeWidgetLayoutResourceDefinition0 = new org.apache.ambari.server.api.resources.ActiveWidgetLayoutResourceDefinition();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        org.apache.ambari.server.orm.entities.WidgetLayoutUserWidgetEntityPK widgetLayoutUserWidgetEntityPK0 = new org.apache.ambari.server.orm.entities.WidgetLayoutUserWidgetEntityPK();
        java.lang.Object obj1 = null;
        boolean b2 = widgetLayoutUserWidgetEntityPK0.equals(obj1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        java.net.URL uRL1 = java.lang.ClassLoader.getSystemResource("fields");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        org.apache.ambari.server.ldap.service.AmbariLdapConfigurationProvider ambariLdapConfigurationProvider0 = new org.apache.ambari.server.ldap.service.AmbariLdapConfigurationProvider();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity, java.lang.String> singularattribute_alertHistoryEntity_str0 = org.apache.ambari.server.orm.entities.AlertHistoryEntity_.alertLabel;
        org.junit.Assert.assertNull(singularattribute_alertHistoryEntity_str0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        org.apache.ambari.server.controller.spi.Predicate predicate5 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = org.apache.ambari.server.controller.utilities.PredicateHelper.getProperties(predicate5);
        java.util.LinkedHashSet<java.util.Map<java.lang.String, java.lang.Object>> linkedhashset_map_str_obj7 = new java.util.LinkedHashSet<java.util.Map<java.lang.String, java.lang.Object>>();
        boolean b8 = linkedhashset_map_str_obj7.add(map_str_obj6);
        org.apache.ambari.server.controller.spi.Predicate predicate9 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj10 = org.apache.ambari.server.controller.utilities.PredicateHelper.getProperties(predicate9);
        java.util.LinkedHashSet<java.util.Map<java.lang.String, java.lang.Object>> linkedhashset_map_str_obj11 = new java.util.LinkedHashSet<java.util.Map<java.lang.String, java.lang.Object>>();
        boolean b12 = linkedhashset_map_str_obj11.add(map_str_obj10);
        org.apache.ambari.server.controller.ConfigGroupResponse configGroupResponse13 = new org.apache.ambari.server.controller.ConfigGroupResponse((java.lang.Long) 10L, "javax.net.ssl.trustStorePassword", "Repositories/verify_base_url", "yarn-site", "ambari_java_version", (java.util.Set<java.util.Map<java.lang.String, java.lang.Object>>) linkedhashset_map_str_obj7, (java.util.Set<java.util.Map<java.lang.String, java.lang.Object>>) linkedhashset_map_str_obj11);
        configGroupResponse13.setId((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(map_str_obj6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map_str_obj10);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        java.lang.String str0 = org.apache.ambari.server.controller.AmbariCustomCommandExecutionHelper.DECOMMISSION_COMMAND_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "DECOMMISSION" + "'", str0.equals("DECOMMISSION"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity0 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        clusterConfigEntity0.setSelected(true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        org.apache.ambari.server.orm.entities.WidgetLayoutEntity widgetLayoutEntity0 = new org.apache.ambari.server.orm.entities.WidgetLayoutEntity();
        widgetLayoutEntity0.setId((java.lang.Long) (-1L));
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link3 = widgetLayoutEntity0._persistence_getHref();
        org.eclipse.persistence.internal.identitymaps.CacheKey cacheKey4 = widgetLayoutEntity0._persistence_getCacheKey();
        org.eclipse.persistence.queries.FetchGroup fetchGroup5 = widgetLayoutEntity0._persistence_getFetchGroup();
        org.junit.Assert.assertNull(link3);
        org.junit.Assert.assertNull(cacheKey4);
        org.junit.Assert.assertNull(fetchGroup5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosServerAction.UPDATE_CONFIGURATIONS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "update_configurations" + "'", str0.equals("update_configurations"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        org.apache.ambari.server.state.repository.StackPackage.UpgradeDependencyDeserializer upgradeDependencyDeserializer0 = new org.apache.ambari.server.state.repository.StackPackage.UpgradeDependencyDeserializer();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        org.apache.ambari.server.orm.dao.StackDAO stackDAO0 = null;
        org.apache.ambari.server.orm.dao.ExtensionDAO extensionDAO1 = null;
        org.apache.ambari.server.orm.dao.ExtensionLinkDAO extensionLinkDAO2 = null;
        org.apache.ambari.server.controller.AmbariManagementHelper ambariManagementHelper3 = new org.apache.ambari.server.controller.AmbariManagementHelper(stackDAO0, extensionDAO1, extensionLinkDAO2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        org.apache.ambari.server.controller.ServiceRequest serviceRequest5 = new org.apache.ambari.server.controller.ServiceRequest("timelineMetricCache", "jce_name", (java.lang.Long) 10L, "LinearExecutionJobs", "ViewVersionInfo/parameters");
        java.lang.String str6 = serviceRequest5.getCredentialStoreSupported();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        org.eclipse.persistence.queries.FetchGroup fetchGroup1 = null;
        requestResourceFilterEntity0._persistence_setFetchGroup(fetchGroup1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.SNMPDispatcher.SECURITY_LEVEL_PROPERTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari.dispatch.snmp.security.level" + "'", str0.equals("ambari.dispatch.snmp.security.level"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity0 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        java.lang.String str1 = viewResourceEntity0.getIdProperty();
        java.lang.Object obj2 = viewResourceEntity0._persistence_post_clone();
        viewResourceEntity0._persistence_set_service("selected_timestamp");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.CompatibleRepositoryVersionResourceProvider.REPOSITORY_VERSION_REPOSITORY_VERSION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CompatibleRepositoryVersions/repository_version" + "'", str0.equals("CompatibleRepositoryVersions/repository_version"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity0 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        java.lang.String str1 = viewResourceEntity0.getProvider();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks2 = null;
        viewResourceEntity0._persistence_setLinks(itemLinks2);
        java.lang.String str4 = viewResourceEntity0.getName();
        java.beans.PropertyChangeListener propertyChangeListener5 = viewResourceEntity0._persistence_getPropertyChangeListener();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(propertyChangeListener5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        org.apache.ambari.server.audit.request.eventcreator.ServiceConfigDownloadEventCreator serviceConfigDownloadEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.ServiceConfigDownloadEventCreator();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        org.apache.ambari.server.state.ServiceComponent serviceComponent0 = null;
        org.apache.ambari.server.state.Clusters clusters2 = null;
        org.apache.ambari.server.orm.dao.StackDAO stackDAO3 = null;
        org.apache.ambari.server.orm.dao.HostDAO hostDAO4 = null;
        org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO5 = null;
        org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO6 = new org.apache.ambari.server.orm.dao.HostComponentStateDAO();
        org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO hostComponentDesiredStateDAO7 = null;
        org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher8 = null;
        try {
            org.apache.ambari.server.state.svccomphost.ServiceComponentHostImpl serviceComponentHostImpl9 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostImpl(serviceComponent0, "update_configurations", clusters2, stackDAO3, hostDAO4, serviceComponentDesiredStateDAO5, hostComponentStateDAO6, hostComponentDesiredStateDAO7, ambariEventPublisher8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider widgetLayoutResourceProvider1 = new org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider(ambariManagementController0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        org.apache.ambari.server.state.AlertState alertState0 = org.apache.ambari.server.state.AlertState.WARNING;
        org.junit.Assert.assertTrue("'" + alertState0 + "' != '" + org.apache.ambari.server.state.AlertState.WARNING + "'", alertState0.equals(org.apache.ambari.server.state.AlertState.WARNING));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        org.apache.ambari.server.audit.request.eventcreator.UpgradeItemEventCreator upgradeItemEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.UpgradeItemEventCreator();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelper.DIRECTIVE_COMPONENTS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "regenerate_components" + "'", str0.equals("regenerate_components"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        try {
            org.apache.ambari.server.controller.internal.AlertResourceProviderUtils.verifyToggleAuthorization("ViewInstanceInfo/instance_name", (java.lang.Long) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.security.authorization.AuthorizationException");
        } catch (org.apache.ambari.server.security.authorization.AuthorizationException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RemoteClusterResourceProvider.USERNAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ClusterInfo/username" + "'", str0.equals("ClusterInfo/username"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationDependencyResourceProvider.STACK_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurationDependency/stack_name" + "'", str0.equals("StackConfigurationDependency/stack_name"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        org.apache.ambari.server.orm.dao.ConfigGroupConfigMappingDAO configGroupConfigMappingDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupConfigMappingDAO();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFileReaderFactory kerberosIdentityDataFileReaderFactory0 = new org.apache.ambari.server.serveraction.kerberos.KerberosIdentityDataFileReaderFactory();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        org.apache.ambari.server.orm.entities.KerberosKeytabEntity kerberosKeytabEntity1 = new org.apache.ambari.server.orm.entities.KerberosKeytabEntity("Upgrade/fail_on_check_warnings");
        boolean b2 = kerberosKeytabEntity1.isWriteAmbariJaasFile();
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        org.apache.ambari.server.serveraction.upgrades.RangerKerberosConfigCalculation rangerKerberosConfigCalculation0 = new org.apache.ambari.server.serveraction.upgrades.RangerKerberosConfigCalculation();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.RESPONSE_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hosts" + "'", str0.equals("Hosts"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        org.apache.ambari.server.stack.MasterHostResolver.Service service0 = org.apache.ambari.server.stack.MasterHostResolver.Service.HBASE;
        org.junit.Assert.assertTrue("'" + service0 + "' != '" + org.apache.ambari.server.stack.MasterHostResolver.Service.HBASE + "'", service0.equals(org.apache.ambari.server.stack.MasterHostResolver.Service.HBASE));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        org.apache.ambari.server.orm.dao.AmbariConfigurationDAO ambariConfigurationDAO0 = new org.apache.ambari.server.orm.dao.AmbariConfigurationDAO();
        org.apache.ambari.server.orm.entities.AmbariConfigurationEntity ambariConfigurationEntity1 = null;
        try {
            ambariConfigurationDAO0.create(ambariConfigurationEntity1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        org.apache.ambari.server.state.State state0 = org.apache.ambari.server.state.State.STARTED;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + org.apache.ambari.server.state.State.STARTED + "'", state0.equals(org.apache.ambari.server.state.State.STARTED));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        org.apache.ambari.server.security.authorization.User user1 = null;
        org.apache.ambari.server.security.authorization.AmbariGrantedAuthority[] ambariGrantedAuthority_array2 = new org.apache.ambari.server.security.authorization.AmbariGrantedAuthority[] {};
        java.util.ArrayList<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority> arraylist_ambariGrantedAuthority3 = new java.util.ArrayList<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority>) arraylist_ambariGrantedAuthority3, ambariGrantedAuthority_array2);
        org.apache.ambari.server.security.authorization.jwt.JwtAuthentication jwtAuthentication5 = new org.apache.ambari.server.security.authorization.jwt.JwtAuthentication("timelineMetricCache", user1, (java.util.Collection<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority>) arraylist_ambariGrantedAuthority3);
        jwtAuthentication5.setAuthenticated(true);
        java.util.Collection<? extends org.apache.ambari.server.security.authorization.AmbariGrantedAuthority> collection_wildcard8 = jwtAuthentication5.getAuthorities();
        org.junit.Assert.assertNotNull(ambariGrantedAuthority_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection_wildcard8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertNoticeResourceProvider.ALERT_NOTICE_TARGET_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertNotice/target_name" + "'", str0.equals("AlertNotice/target_name"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.AGENT_STACK_RETRY_ON_UNAVAILABILITY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "agent_stack_retry_on_unavailability" + "'", str0.equals("agent_stack_retry_on_unavailability"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.String str1 = serviceConfigEntity0.getNote();
        java.beans.PropertyChangeListener propertyChangeListener2 = serviceConfigEntity0._persistence_getPropertyChangeListener();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(propertyChangeListener2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent.AddRepositoryRequestAuditEventBuilder addRepositoryRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent.AddRepositoryRequestAuditEventBuilder();
        org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent.AddRepositoryRequestAuditEventBuilder addRepositoryRequestAuditEventBuilder2 = addRepositoryRequestAuditEventBuilder0.withTimestamp((java.lang.Long) 10L);
        org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent.AddRepositoryRequestAuditEventBuilder addRepositoryRequestAuditEventBuilder4 = addRepositoryRequestAuditEventBuilder0.withUserName("Tasks/output_log");
        org.junit.Assert.assertNotNull(addRepositoryRequestAuditEventBuilder2);
        org.junit.Assert.assertNotNull(addRepositoryRequestAuditEventBuilder4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder();
        org.apache.ambari.server.api.services.Request.Type type1 = null;
        org.apache.ambari.server.audit.event.request.BlueprintExportRequestAuditEvent.BlueprintExportRequestAuditEventBuilder blueprintExportRequestAuditEventBuilder2 = blueprintExportRequestAuditEventBuilder0.withRequestType(type1);
        org.junit.Assert.assertNotNull(blueprintExportRequestAuditEventBuilder2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        org.apache.ambari.server.topology.TopologyManager topologyManager0 = null;
        org.apache.ambari.server.topology.TopologyRequestFactory topologyRequestFactory1 = null;
        org.apache.ambari.server.topology.SecurityConfigurationFactory securityConfigurationFactory2 = null;
        com.google.gson.Gson gson3 = null;
        org.apache.ambari.server.controller.internal.ClusterResourceProvider.init(topologyManager0, topologyRequestFactory1, securityConfigurationFactory2, gson3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity0 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Long long1 = requestOperationLevelEntity0._persistence_get_operationLevelId();
        org.apache.ambari.server.orm.entities.RequestEntity requestEntity2 = null;
        requestOperationLevelEntity0.setRequestEntity(requestEntity2);
        requestOperationLevelEntity0._persistence_checkFetched("name");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        requestOperationLevelEntity0._persistence_setPropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        org.apache.ambari.server.orm.entities.StackEntity stackEntity0 = null;
        org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity4 = new org.apache.ambari.server.orm.entities.RepositoryVersionEntity(stackEntity0, "AlertTarget/alert_states", "Hosts/*", "Repositories/repository_version_id");
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link5 = repositoryVersionEntity4._persistence_getHref();
        org.junit.Assert.assertNull(link5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertResourceProvider.ALERT_COMPONENT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Alert/component_name" + "'", str0.equals("Alert/component_name"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        org.apache.ambari.server.orm.entities.StackEntity stackEntity0 = null;
        org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity4 = new org.apache.ambari.server.orm.entities.RepositoryVersionEntity(stackEntity0, "AlertTarget/alert_states", "Hosts/*", "Repositories/repository_version_id");
        repositoryVersionEntity4._persistence_set_isLegacy((short) (byte) 10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ConfigurationResourceProvider.CONFIGURATION_CONFIG_TAG_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tag" + "'", str0.equals("tag"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        java.lang.String str0 = org.apache.ambari.server.checks.PreviousUpgradeCompleted.ERROR_MESSAGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "There is an existing {0} {1} {2} which has not completed. This {3} must be completed before a new upgrade or downgrade can begin." + "'", str0.equals("There is an existing {0} {1} {2} which has not completed. This {3} must be completed before a new upgrade or downgrade can begin."));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        org.apache.ambari.server.agent.HostStatus hostStatus0 = new org.apache.ambari.server.agent.HostStatus();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        org.apache.ambari.server.orm.entities.RemoteAmbariClusterEntity remoteAmbariClusterEntity0 = new org.apache.ambari.server.orm.entities.RemoteAmbariClusterEntity();
        java.lang.String str1 = remoteAmbariClusterEntity0._persistence_get_username();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        java.lang.String str0 = org.eclipse.persistence.logging.SessionLog.PROPAGATION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "propagation" + "'", str0.equals("propagation"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        org.apache.ambari.server.state.AutoDeployInfo autoDeployInfo0 = new org.apache.ambari.server.state.AutoDeployInfo();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        org.apache.ambari.server.utils.Parallel parallel0 = new org.apache.ambari.server.utils.Parallel();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity0 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Long long1 = requestOperationLevelEntity0._persistence_get_operationLevelId();
        java.lang.String str2 = requestOperationLevelEntity0._persistence_get_clusterName();
        java.lang.String str3 = requestOperationLevelEntity0._persistence_get_hostComponentName();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        org.apache.ambari.server.state.kerberos.KerberosPrincipalType kerberosPrincipalType1 = null;
        org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor4 = new org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor("Clusters/provisioning_state", kerberosPrincipalType1, "kerberos.json", "{ clusterName=RepositoryVersions/release/compatible_with, serviceName=STANDARD, componentName=configure-task-insertions, hostname=AlertNotice/target_id, publicHostname=null, desiredState=WidgetInfo/description, state=null, desiredStackId=null, staleConfig=null, adminState=null, maintenanceState=null}");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        java.lang.String[] str_array17 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str18, str_array17);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str18;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str18;
        org.apache.ambari.server.controller.spi.TemporalInfo temporalInfo23 = null;
        org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey timelineAppMetricCacheKey24 = new org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey((java.util.Set<java.lang.String>) linkedhashset_str18, "name", temporalInfo23);
        java.lang.String str25 = timelineAppMetricCacheKey24.getSpec();
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        org.apache.ambari.server.state.UserGroupInfo userGroupInfo0 = new org.apache.ambari.server.state.UserGroupInfo();
        java.lang.String str1 = userGroupInfo0.getType();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        org.apache.ambari.server.controller.UserRequest userRequest1 = new org.apache.ambari.server.controller.UserRequest("");
        userRequest1.setAdmin((java.lang.Boolean) true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
        org.apache.ambari.server.orm.helpers.dbms.DerbyHelper derbyHelper1 = new org.apache.ambari.server.orm.helpers.dbms.DerbyHelper(databasePlatform0);
        java.lang.String str4 = derbyHelper1.getDropTableColumnStatement("Event/summary/users/updated", "/api/v1/views/*");
        java.lang.StringBuilder stringBuilder5 = null;
        org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo7 = null;
        try {
            java.lang.StringBuilder stringBuilder9 = derbyHelper1.writeSetNullableString(stringBuilder5, "ServiceInfo/service_name", dBColumnInfo7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ALTER TABLE Event/summary/users/updated DROP COLUMN /api/v1/views/*" + "'", str4.equals("ALTER TABLE Event/summary/users/updated DROP COLUMN /api/v1/views/*"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        org.apache.ambari.server.audit.request.eventcreator.PrivilegeEventCreator privilegeEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.PrivilegeEventCreator();
        java.util.Set<org.apache.ambari.server.api.services.Request.Type> set_type1 = privilegeEventCreator0.getRequestTypes();
        org.junit.Assert.assertNotNull(set_type1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.SERVICE_CHECK_MINIMAL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "minimal" + "'", str0.equals("minimal"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        org.apache.ambari.server.orm.entities.AlertTargetEntity_ alertTargetEntity_0 = new org.apache.ambari.server.orm.entities.AlertTargetEntity_();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        org.apache.ambari.server.actionmanager.HostRoleCommand[] hostRoleCommand_array0 = new org.apache.ambari.server.actionmanager.HostRoleCommand[] {};
        java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleCommand> arraylist_hostRoleCommand1 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleCommand>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.HostRoleCommand>) arraylist_hostRoleCommand1, hostRoleCommand_array0);
        java.util.Map<org.apache.ambari.server.actionmanager.HostRoleStatus, java.lang.Integer> map_hostRoleStatus_i3 = null;
        java.util.Map<org.apache.ambari.server.Role, java.lang.Float> map_role_f4 = null;
        org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus6 = org.apache.ambari.server.controller.internal.CalculatedStatus.calculateStageStatus((java.util.List<org.apache.ambari.server.actionmanager.HostRoleCommand>) arraylist_hostRoleCommand1, map_hostRoleStatus_i3, map_role_f4, true);
        boolean b7 = hostRoleStatus6.isHoldingState();
        org.junit.Assert.assertNotNull(hostRoleCommand_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + hostRoleStatus6 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED + "'", hostRoleStatus6.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StackEntity, java.lang.String> singularattribute_stackEntity_str0 = org.apache.ambari.server.orm.entities.StackEntity_.stackName;
        org.junit.Assert.assertNull(singularattribute_stackEntity_str0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        org.apache.ambari.server.serveraction.kerberos.KerberosConfigDataFileWriterFactory kerberosConfigDataFileWriterFactory0 = new org.apache.ambari.server.serveraction.kerberos.KerberosConfigDataFileWriterFactory();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        org.apache.ambari.server.checks.DatabaseConsistencyCheckResult databaseConsistencyCheckResult0 = org.apache.ambari.server.checks.DatabaseConsistencyCheckResult.DB_CHECK_WARNING;
        boolean b1 = databaseConsistencyCheckResult0.isError();
        org.junit.Assert.assertTrue("'" + databaseConsistencyCheckResult0 + "' != '" + org.apache.ambari.server.checks.DatabaseConsistencyCheckResult.DB_CHECK_WARNING + "'", databaseConsistencyCheckResult0.equals(org.apache.ambari.server.checks.DatabaseConsistencyCheckResult.DB_CHECK_WARNING));
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        org.apache.ambari.server.controller.UserAuthorizationResponse userAuthorizationResponse5 = new org.apache.ambari.server.controller.UserAuthorizationResponse("LinearExecutionJobs", "operation_type", "id", "Event/sync_time/end", "Timer:ConnectionManagement");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        org.apache.ambari.server.orm.entities.KerberosKeytabEntity kerberosKeytabEntity1 = new org.apache.ambari.server.orm.entities.KerberosKeytabEntity("Upgrade/fail_on_check_warnings");
        java.lang.Object obj3 = kerberosKeytabEntity1._persistence_get("validate_config");
        java.lang.String str4 = kerberosKeytabEntity1._persistence_get_groupAccess();
        java.lang.String str5 = kerberosKeytabEntity1.getKeytabPath();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Upgrade/fail_on_check_warnings" + "'", str5.equals("Upgrade/fail_on_check_warnings"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.SERVICE_DESIRED_STATE_TABLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "servicedesiredstate" + "'", str0.equals("servicedesiredstate"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type, java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.keyPropertyIds;
        org.junit.Assert.assertNotNull(map_type_str0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ArtifactResourceProvider.ARTIFACT_NAME_PROPERTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Artifacts/artifact_name" + "'", str0.equals("Artifacts/artifact_name"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        boolean b1 = requestResourceFilterEntity0._persistence_shouldRefreshFetchGroup();
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.AUTO_START_DISABLED;
        org.junit.Assert.assertNotNull(checkDescription0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        org.apache.ambari.server.state.alert.AmsSource.AmsInfo amsInfo0 = new org.apache.ambari.server.state.alert.AmsSource.AmsInfo();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostEntity, java.lang.String> singularattribute_hostEntity_str0 = org.apache.ambari.server.orm.entities.HostEntity_.hostAttributes;
        org.junit.Assert.assertNull(singularattribute_hostEntity_str0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        org.apache.ambari.server.serveraction.upgrades.FixLzoCodecPath fixLzoCodecPath0 = new org.apache.ambari.server.serveraction.upgrades.FixLzoCodecPath();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.Object obj2 = serviceConfigEntity0._persistence_get("jce_name");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity4 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        serviceConfigEntity0._persistence_propertyChange("Repositories/repository_version_id", (java.lang.Object) clusterConfigEntity4, (java.lang.Object) 10);
        org.apache.ambari.server.orm.entities.HostGroupConfigEntity hostGroupConfigEntity7 = new org.apache.ambari.server.orm.entities.HostGroupConfigEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) clusterConfigEntity4);
        hostGroupConfigEntity7.setConfigAttributes("ambari_java_version");
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks10 = hostGroupConfigEntity7._persistence_getLinks();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(itemLinks10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.LOG_OUTPUT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "log_output" + "'", str0.equals("log_output"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.PrivilegeResourceProvider.PRIVILEGE_ID_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PrivilegeInfo/privilege_id" + "'", str0.equals("PrivilegeInfo/privilege_id"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        java.lang.ClassLoader classLoader1 = classLoader0.getParent();
        classLoader0.clearAssertionStatus();
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertNotNull(classLoader1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        org.apache.ambari.server.controller.internal.ViewResourceProvider viewResourceProvider0 = new org.apache.ambari.server.controller.internal.ViewResourceProvider();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        java.lang.String str0 = org.apache.ambari.server.controller.metrics.RestMetricsPropertyProvider.URL_PATH_SEPARATOR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "##" + "'", str0.equals("##"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        org.apache.ambari.server.state.alert.PercentSource percentSource0 = new org.apache.ambari.server.state.alert.PercentSource();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        org.apache.ambari.server.controller.spi.Predicate[] predicate_array0 = new org.apache.ambari.server.controller.spi.Predicate[] {};
        org.apache.ambari.server.controller.predicate.AndPredicate andPredicate1 = new org.apache.ambari.server.controller.predicate.AndPredicate(predicate_array0);
        org.junit.Assert.assertNotNull(predicate_array0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        org.apache.ambari.server.checks.UpgradeCheckGroup upgradeCheckGroup0 = org.apache.ambari.server.checks.UpgradeCheckGroup.DEFAULT;
        org.junit.Assert.assertTrue("'" + upgradeCheckGroup0 + "' != '" + org.apache.ambari.server.checks.UpgradeCheckGroup.DEFAULT + "'", upgradeCheckGroup0.equals(org.apache.ambari.server.checks.UpgradeCheckGroup.DEFAULT));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        org.apache.ambari.server.state.scheduler.Batch batch0 = new org.apache.ambari.server.state.scheduler.Batch();
        org.apache.ambari.server.state.scheduler.BatchSettings batchSettings1 = null;
        batch0.setBatchSettings(batchSettings1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        org.apache.ambari.server.controller.ivory.Cluster.Interface interface3 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "AlertNotice/target_id", "validate_config");
        java.lang.String str4 = interface3.getVersion();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "validate_config" + "'", str4.equals("validate_config"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        org.apache.ambari.server.state.alert.Reporting.ReportTemplate reportTemplate0 = new org.apache.ambari.server.state.alert.Reporting.ReportTemplate();
        java.lang.Double d1 = reportTemplate0.getValue();
        org.junit.Assert.assertNull(d1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity0 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        long long1 = clusterConfigEntity0.getTimestamp();
        java.util.Collection<org.apache.ambari.server.orm.entities.ServiceConfigEntity> collection_serviceConfigEntity2 = clusterConfigEntity0.getServiceConfigEntities();
        clusterConfigEntity0._persistence_set_unmapped((short) 0);
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(collection_serviceConfigEntity2);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity0 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        java.lang.Long long1 = clusterConfigEntity0.getVersion();
        org.eclipse.persistence.internal.identitymaps.CacheKey cacheKey2 = null;
        clusterConfigEntity0._persistence_setCacheKey(cacheKey2);
        clusterConfigEntity0.setTimestamp((long) (short) 1);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.JDBC_IN_MEMORY_PASSWORD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "" + "'", str0.equals(""));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        org.apache.ambari.server.security.authorization.User user1 = null;
        org.apache.ambari.server.security.authorization.AmbariGrantedAuthority[] ambariGrantedAuthority_array2 = new org.apache.ambari.server.security.authorization.AmbariGrantedAuthority[] {};
        java.util.ArrayList<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority> arraylist_ambariGrantedAuthority3 = new java.util.ArrayList<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority>) arraylist_ambariGrantedAuthority3, ambariGrantedAuthority_array2);
        org.apache.ambari.server.security.authorization.jwt.JwtAuthentication jwtAuthentication5 = new org.apache.ambari.server.security.authorization.jwt.JwtAuthentication("timelineMetricCache", user1, (java.util.Collection<org.apache.ambari.server.security.authorization.AmbariGrantedAuthority>) arraylist_ambariGrantedAuthority3);
        jwtAuthentication5.setAuthenticated(true);
        org.apache.ambari.server.security.authorization.AmbariAuthentication ambariAuthentication9 = new org.apache.ambari.server.security.authorization.AmbariAuthentication((org.springframework.security.core.Authentication) jwtAuthentication5, (java.lang.Integer) 20);
        org.junit.Assert.assertNotNull(ambariGrantedAuthority_array2);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        try {
            java.security.interfaces.RSAPublicKey rSAPublicKey1 = org.apache.ambari.server.security.encryption.CertificateUtils.getPublicKeyFromFile("ThemeInfo/stack_version");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder();
        org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder2 = deleteRepositoryVersionAuditEventBuilder0.withRepoVersion("Stage/stage_id");
        org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        org.apache.ambari.server.orm.entities.KerberosKeytabEntity kerberosKeytabEntity1 = new org.apache.ambari.server.orm.entities.KerberosKeytabEntity("Upgrade/fail_on_check_warnings");
        kerberosKeytabEntity1._persistence_set_groupName("unlimited_key_jce_required");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.String str1 = serviceConfigEntity0.getNote();
        java.lang.Long long2 = serviceConfigEntity0._persistence_get_clusterId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.COMPONENTS_EXIST_IN_TARGET_REPO;
        org.apache.ambari.server.checks.CheckDescription.COMPONENTS_INSTALLATION = checkDescription0;
        org.apache.ambari.server.checks.CheckDescription.SERVICES_RANGER_PASSWORD_VERIFY = checkDescription0;
        org.junit.Assert.assertNotNull(checkDescription0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.RECOMMENDATIONS_ARTIFACTS_LIFETIME;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionVersionResourceProvider.EXTENSION_ERROR_SET;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/extension-errors" + "'", str0.equals("Versions/extension-errors"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.STACK_VERSION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "QuickLinkInfo/stack_version" + "'", str0.equals("QuickLinkInfo/stack_version"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys ambariLdapConfigurationKeys0 = org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.BIND_DN;
        org.junit.Assert.assertTrue("'" + ambariLdapConfigurationKeys0 + "' != '" + org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.BIND_DN + "'", ambariLdapConfigurationKeys0.equals(org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.BIND_DN));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity, java.lang.String> singularattribute_hostRoleCommandEntity_str0 = null;
        org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.role = singularattribute_hostRoleCommandEntity_str0;
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        try {
            org.apache.ambari.server.orm.PersistenceType persistenceType1 = org.apache.ambari.server.orm.PersistenceType.fromString("Request body for Blueprint create request is empty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.QUICKLINK_DATA_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "QuickLinkInfo/quicklink_data" + "'", str0.equals("QuickLinkInfo/quicklink_data"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        org.apache.ambari.server.audit.event.request.DeleteAlertGroupRequestAuditEvent.DeleteAlertGroupRequestAuditEventBuilder deleteAlertGroupRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.DeleteAlertGroupRequestAuditEvent.builder();
        org.junit.Assert.assertNotNull(deleteAlertGroupRequestAuditEventBuilder0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        org.apache.ambari.server.state.quicklinks.Check check0 = new org.apache.ambari.server.state.quicklinks.Check();
        java.lang.String str1 = check0.getSite();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        org.apache.ambari.server.view.configuration.PropertyConfig propertyConfig0 = new org.apache.ambari.server.view.configuration.PropertyConfig();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        com.google.inject.persist.PersistService persistService0 = null;
        org.apache.ambari.server.configuration.Configuration configuration1 = null;
        com.google.inject.Injector injector2 = null;
        org.apache.ambari.server.update.HostUpdateHelper hostUpdateHelper3 = new org.apache.ambari.server.update.HostUpdateHelper(persistService0, configuration1, injector2);
        hostUpdateHelper3.setHostChangesFile("ViewInstanceInfo/instance_name");
        java.lang.String str6 = hostUpdateHelper3.getHostChangesFile();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ViewInstanceInfo/instance_name" + "'", str6.equals("ViewInstanceInfo/instance_name"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        org.apache.ambari.server.api.resources.ViewResourceDefinition viewResourceDefinition0 = new org.apache.ambari.server.api.resources.ViewResourceDefinition();
        java.lang.String str1 = viewResourceDefinition0.getSingularName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "view" + "'", str1.equals("view"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.RACK_INFO_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "rack_info" + "'", str0.equals("rack_info"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        org.apache.ambari.server.actionmanager.TargetHostType targetHostType0 = org.apache.ambari.server.actionmanager.TargetHostType.ALL;
        org.junit.Assert.assertTrue("'" + targetHostType0 + "' != '" + org.apache.ambari.server.actionmanager.TargetHostType.ALL + "'", targetHostType0.equals(org.apache.ambari.server.actionmanager.TargetHostType.ALL));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        org.apache.ambari.server.state.stack.upgrade.TransferOperation transferOperation0 = org.apache.ambari.server.state.stack.upgrade.TransferOperation.DELETE;
        org.junit.Assert.assertTrue("'" + transferOperation0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.TransferOperation.DELETE + "'", transferOperation0.equals(org.apache.ambari.server.state.stack.upgrade.TransferOperation.DELETE));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        org.springframework.security.authentication.AuthenticationManager authenticationManager0 = null;
        org.apache.ambari.server.configuration.Configuration configuration1 = null;
        org.apache.ambari.server.security.AmbariEntryPoint ambariEntryPoint2 = new org.apache.ambari.server.security.AmbariEntryPoint(configuration1);
        org.apache.ambari.server.audit.AuditLogger auditLogger3 = null;
        org.apache.ambari.server.security.authorization.PermissionHelper permissionHelper4 = null;
        org.apache.ambari.server.security.authentication.AmbariBasicAuthenticationFilter ambariBasicAuthenticationFilter5 = new org.apache.ambari.server.security.authentication.AmbariBasicAuthenticationFilter(authenticationManager0, ambariEntryPoint2, auditLogger3, permissionHelper4);
        org.apache.ambari.server.security.authentication.AmbariAuthenticationFilter[] ambariAuthenticationFilter_array6 = new org.apache.ambari.server.security.authentication.AmbariAuthenticationFilter[] { ambariBasicAuthenticationFilter5 };
        java.util.ArrayList<org.apache.ambari.server.security.authentication.AmbariAuthenticationFilter> arraylist_ambariAuthenticationFilter7 = new java.util.ArrayList<org.apache.ambari.server.security.authentication.AmbariAuthenticationFilter>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.security.authentication.AmbariAuthenticationFilter>) arraylist_ambariAuthenticationFilter7, ambariAuthenticationFilter_array6);
        org.apache.ambari.server.security.authentication.AmbariDelegatingAuthenticationFilter ambariDelegatingAuthenticationFilter9 = new org.apache.ambari.server.security.authentication.AmbariDelegatingAuthenticationFilter((java.util.Collection<org.apache.ambari.server.security.authentication.AmbariAuthenticationFilter>) arraylist_ambariAuthenticationFilter7);
        org.junit.Assert.assertNotNull(ambariAuthenticationFilter_array6);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewVersionResourceProvider.VIEW_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewVersionInfo/view_name" + "'", str0.equals("ViewVersionInfo/view_name"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        org.apache.ambari.server.events.AggregateAlertRecalculateEvent aggregateAlertRecalculateEvent1 = new org.apache.ambari.server.events.AggregateAlertRecalculateEvent((long) 2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.AUDIT_LOGGER_CAPACITY;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        org.apache.ambari.server.utils.CustomStringUtils customStringUtils0 = new org.apache.ambari.server.utils.CustomStringUtils();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        org.apache.ambari.server.controller.internal.ViewVersionResourceProvider viewVersionResourceProvider0 = new org.apache.ambari.server.controller.internal.ViewVersionResourceProvider();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        org.apache.ambari.server.state.stack.JsonOsFamilyRoot jsonOsFamilyRoot0 = new org.apache.ambari.server.state.stack.JsonOsFamilyRoot();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        org.apache.ambari.server.serveraction.upgrades.OozieConfigCalculation oozieConfigCalculation0 = new org.apache.ambari.server.serveraction.upgrades.OozieConfigCalculation();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertResourceProvider.ALERT_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Alert/id" + "'", str0.equals("Alert/id"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_CLUSTER_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/cluster_name" + "'", str0.equals("UpgradeChecks/cluster_name"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        org.apache.ambari.server.api.resources.ClusterResourceDefinition clusterResourceDefinition0 = new org.apache.ambari.server.api.resources.ClusterResourceDefinition();
        try {
            org.apache.ambari.server.api.query.render.Renderer renderer2 = clusterResourceDefinition0.getRenderer("Stage/stage_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        org.apache.ambari.server.checks.UpgradeCheckGroup upgradeCheckGroup0 = org.apache.ambari.server.checks.UpgradeCheckGroup.LIVELINESS;
        org.junit.Assert.assertTrue("'" + upgradeCheckGroup0 + "' != '" + org.apache.ambari.server.checks.UpgradeCheckGroup.LIVELINESS + "'", upgradeCheckGroup0.equals(org.apache.ambari.server.checks.UpgradeCheckGroup.LIVELINESS));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        org.apache.ambari.server.state.ServiceOsSpecific serviceOsSpecific1 = new org.apache.ambari.server.state.ServiceOsSpecific("ALTER TABLE Event/summary/users/updated DROP COLUMN /api/v1/views/*");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        org.apache.ambari.server.state.stack.upgrade.SecurityCondition securityCondition0 = new org.apache.ambari.server.state.stack.upgrade.SecurityCondition();
        java.lang.String str1 = securityCondition0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SecurityCondition{}" + "'", str1.equals("SecurityCondition{}"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        org.apache.ambari.server.hooks.users.UserHookParams userHookParams0 = org.apache.ambari.server.hooks.users.UserHookParams.CLUSTER_NAME;
        org.junit.Assert.assertTrue("'" + userHookParams0 + "' != '" + org.apache.ambari.server.hooks.users.UserHookParams.CLUSTER_NAME + "'", userHookParams0.equals(org.apache.ambari.server.hooks.users.UserHookParams.CLUSTER_NAME));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RequestResourceProvider.ACTION_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "action" + "'", str0.equals("action"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        org.apache.ambari.server.state.ServiceComponent serviceComponent0 = null;
        org.apache.ambari.server.orm.entities.HostComponentStateEntity hostComponentStateEntity1 = null;
        org.apache.ambari.server.orm.entities.HostComponentDesiredStateEntity hostComponentDesiredStateEntity2 = null;
        org.apache.ambari.server.state.Clusters clusters3 = null;
        org.apache.ambari.server.orm.dao.StackDAO stackDAO4 = null;
        org.apache.ambari.server.orm.dao.HostDAO hostDAO5 = new org.apache.ambari.server.orm.dao.HostDAO();
        org.apache.ambari.server.orm.dao.ServiceComponentDesiredStateDAO serviceComponentDesiredStateDAO6 = null;
        org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO7 = new org.apache.ambari.server.orm.dao.HostComponentStateDAO();
        org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO hostComponentDesiredStateDAO8 = null;
        org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher9 = null;
        try {
            org.apache.ambari.server.state.svccomphost.ServiceComponentHostImpl serviceComponentHostImpl10 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostImpl(serviceComponent0, hostComponentStateEntity1, hostComponentDesiredStateEntity2, clusters3, stackDAO4, hostDAO5, serviceComponentDesiredStateDAO6, hostComponentStateDAO7, hostComponentDesiredStateDAO8, ambariEventPublisher9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        org.apache.ambari.server.configuration.Configuration configuration0 = null;
        try {
            org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheEntryFactory timelineMetricCacheEntryFactory1 = new org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheEntryFactory(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_YARN_TIMELINE_ST;
        org.apache.ambari.server.checks.CheckDescription.SERVICES_NAMENODE_HA = checkDescription0;
        org.apache.ambari.server.checks.CheckDescription.VERSION_MISMATCH = checkDescription0;
        org.apache.ambari.server.checks.CheckDescription.SERVICES_UP = checkDescription0;
        org.apache.ambari.server.checks.CheckDescription.COMPONENTS_INSTALLATION = checkDescription0;
        org.junit.Assert.assertNotNull(checkDescription0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        org.apache.ambari.server.orm.entities.BlueprintConfigEntity blueprintConfigEntity0 = new org.apache.ambari.server.orm.entities.BlueprintConfigEntity();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks1 = blueprintConfigEntity0._persistence_getLinks();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks2 = null;
        blueprintConfigEntity0._persistence_setLinks(itemLinks2);
        org.junit.Assert.assertNull(itemLinks1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        org.apache.ambari.server.controller.ServiceComponentHostRequest serviceComponentHostRequest5 = new org.apache.ambari.server.controller.ServiceComponentHostRequest("RepositoryVersions/release/compatible_with", "STANDARD", "configure-task-insertions", "AlertNotice/target_id", "WidgetInfo/description");
        java.lang.String str6 = serviceComponentHostRequest5.toString();
        java.lang.String str7 = serviceComponentHostRequest5.getComponentName();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{ clusterName=RepositoryVersions/release/compatible_with, serviceName=STANDARD, componentName=configure-task-insertions, hostname=AlertNotice/target_id, publicHostname=null, desiredState=WidgetInfo/description, state=null, desiredStackId=null, staleConfig=null, adminState=null, maintenanceState=null}" + "'", str6.equals("{ clusterName=RepositoryVersions/release/compatible_with, serviceName=STANDARD, componentName=configure-task-insertions, hostname=AlertNotice/target_id, publicHostname=null, desiredState=WidgetInfo/description, state=null, desiredStackId=null, staleConfig=null, adminState=null, maintenanceState=null}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "configure-task-insertions" + "'", str7.equals("configure-task-insertions"));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        org.apache.ambari.server.orm.entities.StackEntity_ stackEntity_0 = new org.apache.ambari.server.orm.entities.StackEntity_();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        java.lang.String str0 = org.apache.hadoop.metrics2.sink.timeline.AbstractTimelineMetricsSink.SSL_KEYSTORE_PASSWORD_PROPERTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "truststore.password" + "'", str0.equals("truststore.password"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        org.apache.ambari.server.checks.ServicePresenceCheck servicePresenceCheck0 = new org.apache.ambari.server.checks.ServicePresenceCheck();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackVersionResourceProvider.STACK_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/stack_name" + "'", str0.equals("Versions/stack_name"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.PROVISIONING_STATE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "provisioning_state" + "'", str0.equals("provisioning_state"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelper.MANAGE_IDENTITIES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "manage_identities" + "'", str0.equals("manage_identities"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        org.apache.ambari.server.security.authorization.AuthorizationHelper authorizationHelper0 = new org.apache.ambari.server.security.authorization.AuthorizationHelper();
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity1 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Long long2 = requestOperationLevelEntity1._persistence_get_operationLevelId();
        org.apache.ambari.server.orm.entities.PrivilegeEntity privilegeEntity3 = new org.apache.ambari.server.orm.entities.PrivilegeEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity1);
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity4 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Long long5 = requestOperationLevelEntity4._persistence_get_operationLevelId();
        org.apache.ambari.server.orm.entities.PrivilegeEntity privilegeEntity6 = new org.apache.ambari.server.orm.entities.PrivilegeEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity4);
        org.apache.ambari.server.state.HostState hostState7 = org.apache.ambari.server.state.HostState.HEALTHY;
        privilegeEntity6._persistence_setId((java.lang.Object) hostState7);
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity9 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Long long10 = requestOperationLevelEntity9._persistence_get_operationLevelId();
        org.apache.ambari.server.orm.entities.PrivilegeEntity privilegeEntity11 = new org.apache.ambari.server.orm.entities.PrivilegeEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity9);
        org.apache.ambari.server.state.HostState hostState12 = org.apache.ambari.server.state.HostState.HEALTHY;
        privilegeEntity11._persistence_setId((java.lang.Object) hostState12);
        org.apache.ambari.server.orm.entities.PrivilegeEntity[] privilegeEntity_array14 = new org.apache.ambari.server.orm.entities.PrivilegeEntity[] { privilegeEntity3, privilegeEntity6, privilegeEntity11 };
        java.util.ArrayList<org.apache.ambari.server.orm.entities.PrivilegeEntity> arraylist_privilegeEntity15 = new java.util.ArrayList<org.apache.ambari.server.orm.entities.PrivilegeEntity>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.orm.entities.PrivilegeEntity>) arraylist_privilegeEntity15, privilegeEntity_array14);
        java.util.Collection<org.springframework.security.core.GrantedAuthority> collection_grantedAuthority17 = authorizationHelper0.convertPrivilegesToAuthorities((java.util.Collection<org.apache.ambari.server.orm.entities.PrivilegeEntity>) arraylist_privilegeEntity15);
        org.junit.Assert.assertNull(long2);
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertTrue("'" + hostState7 + "' != '" + org.apache.ambari.server.state.HostState.HEALTHY + "'", hostState7.equals(org.apache.ambari.server.state.HostState.HEALTHY));
        org.junit.Assert.assertNull(long10);
        org.junit.Assert.assertTrue("'" + hostState12 + "' != '" + org.apache.ambari.server.state.HostState.HEALTHY + "'", hostState12.equals(org.apache.ambari.server.state.HostState.HEALTHY));
        org.junit.Assert.assertNotNull(privilegeEntity_array14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection_grantedAuthority17);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        org.apache.ambari.server.orm.entities.ClusterEntity clusterEntity0 = null;
        com.google.inject.Injector injector1 = null;
        org.apache.ambari.server.events.publishers.AmbariEventPublisher ambariEventPublisher2 = null;
        try {
            org.apache.ambari.server.state.cluster.ClusterImpl clusterImpl3 = new org.apache.ambari.server.state.cluster.ClusterImpl(clusterEntity0, injector1, ambariEventPublisher2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RequestResourceProvider.REQUEST_CLUSTER_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Requests/cluster_name" + "'", str0.equals("Requests/cluster_name"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        org.apache.ambari.server.metrics.system.impl.MetricsConfiguration metricsConfiguration0 = org.apache.ambari.server.metrics.system.impl.MetricsConfiguration.getMetricsConfiguration();
        org.junit.Assert.assertNull(metricsConfiguration0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_RUN_CUSTOM_COMMAND;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_RUN_CUSTOM_COMMAND + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_RUN_CUSTOM_COMMAND));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        org.apache.ambari.server.state.stack.upgrade.Grouping grouping0 = new org.apache.ambari.server.state.stack.upgrade.Grouping();
        java.lang.String str1 = grouping0.toString();
        org.apache.ambari.server.state.stack.upgrade.Direction direction2 = null;
        grouping0.intendedDirection = direction2;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Grouping{name=null}" + "'", str1.equals("Grouping{name=null}"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        org.apache.ambari.server.utils.RetryHelper.clearAffectedClusters();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        org.apache.ambari.server.controller.internal.ProvisionAction provisionAction0 = org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START;
        org.junit.Assert.assertTrue("'" + provisionAction0 + "' != '" + org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START + "'", provisionAction0.equals(org.apache.ambari.server.controller.internal.ProvisionAction.INSTALL_AND_START));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
        org.apache.ambari.server.orm.helpers.dbms.DerbyHelper derbyHelper1 = new org.apache.ambari.server.orm.helpers.dbms.DerbyHelper(databasePlatform0);
        java.lang.String str4 = derbyHelper1.getDropTableColumnStatement("Event/summary/users/updated", "/api/v1/views/*");
        try {
            java.lang.String str7 = derbyHelper1.getDropFKConstraintStatement("Actions/description", "slave_type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ALTER TABLE Event/summary/users/updated DROP COLUMN /api/v1/views/*" + "'", str4.equals("ALTER TABLE Event/summary/users/updated DROP COLUMN /api/v1/views/*"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        org.apache.ambari.server.orm.dao.RequestScheduleDAO requestScheduleDAO0 = new org.apache.ambari.server.orm.dao.RequestScheduleDAO();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
        org.apache.ambari.server.api.resources.StackConfigurationResourceDefinition stackConfigurationResourceDefinition1 = new org.apache.ambari.server.api.resources.StackConfigurationResourceDefinition(type0);
        java.util.Set<org.apache.ambari.server.api.resources.SubResourceDefinition> set_subResourceDefinition2 = stackConfigurationResourceDefinition1.getSubResourceDefinitions();
        org.junit.Assert.assertNotNull(set_subResourceDefinition2);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.OS_VERSION;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertNoticeEntity, java.lang.Long> singularattribute_alertNoticeEntity_long0 = org.apache.ambari.server.orm.entities.AlertNoticeEntity_.notificationId;
        org.junit.Assert.assertNull(singularattribute_alertNoticeEntity_long0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_RESTORE;
        org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_RESTORE + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_RESTORE));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.COMPONENT_NAME_COLUMN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "component_name" + "'", str0.equals("component_name"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        org.apache.ambari.server.checks.UpgradeCheckGroup upgradeCheckGroup0 = org.apache.ambari.server.checks.UpgradeCheckGroup.INFORMATIONAL_WARNING;
        org.junit.Assert.assertTrue("'" + upgradeCheckGroup0 + "' != '" + org.apache.ambari.server.checks.UpgradeCheckGroup.INFORMATIONAL_WARNING + "'", upgradeCheckGroup0.equals(org.apache.ambari.server.checks.UpgradeCheckGroup.INFORMATIONAL_WARNING));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse recommendationResponse0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse();
        java.util.Set<java.lang.String> set_str1 = recommendationResponse0.getServices();
        org.junit.Assert.assertNull(set_str1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        byte[] byte_array5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byte_array6 = null;
        byte[] byte_array10 = new byte[] { (byte) 1, (byte) 10, (byte) 10 };
        org.apache.ambari.server.security.encryption.EncryptionResult encryptionResult11 = new org.apache.ambari.server.security.encryption.EncryptionResult(byte_array5, byte_array6, byte_array10);
        byte[] byte_array12 = new byte[] {};
        encryptionResult11.cipher = byte_array12;
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array12);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.REPOSITORY_VERSION_PARENT_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RepositoryVersions/parent_id" + "'", str0.equals("RepositoryVersions/parent_id"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        org.apache.ambari.server.state.quicklinks.Port port0 = new org.apache.ambari.server.state.quicklinks.Port();
        java.lang.String str1 = port0.getHttpDefaultPort();
        java.lang.String str2 = port0.getHttpProperty();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        org.apache.ambari.server.state.stack.upgrade.TransferOperation transferOperation0 = org.apache.ambari.server.state.stack.upgrade.TransferOperation.MOVE;
        org.junit.Assert.assertTrue("'" + transferOperation0 + "' != '" + org.apache.ambari.server.state.stack.upgrade.TransferOperation.MOVE + "'", transferOperation0.equals(org.apache.ambari.server.state.stack.upgrade.TransferOperation.MOVE));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity, byte[]> singularattribute_hostRoleCommandEntity_byte_array0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.stdError;
        org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_byte_array0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.WIDGETLAYOUT_SCOPE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WidgetLayoutInfo/scope" + "'", str0.equals("WidgetLayoutInfo/scope"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        org.apache.ambari.server.state.theme.Widget widget0 = new org.apache.ambari.server.state.theme.Widget();
        java.lang.String str1 = widget0.getType();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
        org.apache.ambari.view.ViewContext viewContext0 = null;
        org.apache.ambari.server.view.HttpImpersonatorImpl httpImpersonatorImpl1 = new org.apache.ambari.server.view.HttpImpersonatorImpl(viewContext0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
        org.apache.ambari.server.orm.helpers.dbms.DerbyHelper derbyHelper1 = new org.apache.ambari.server.orm.helpers.dbms.DerbyHelper(databasePlatform0);
        boolean b2 = derbyHelper1.supportsColumnTypeChange();
        org.apache.ambari.server.agent.AgentEnv agentEnv5 = new org.apache.ambari.server.agent.AgentEnv();
        java.lang.String[] str_array6 = agentEnv5.getExistingRepos();
        org.apache.ambari.server.serveraction.users.ShellCommandUtilityCallable shellCommandUtilityCallable7 = new org.apache.ambari.server.serveraction.users.ShellCommandUtilityCallable(str_array6);
        java.lang.String str8 = derbyHelper1.getAddPrimaryKeyConstraintStatement("FK_upgrade_to_repo_version_id", "Request body for Blueprint create request is empty", str_array6);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ALTER TABLE FK_upgrade_to_repo_version_id ADD CONSTRAINT Request body for Blueprint create request is empty PRIMARY KEY ()" + "'", str8.equals("ALTER TABLE FK_upgrade_to_repo_version_id ADD CONSTRAINT Request body for Blueprint create request is empty PRIMARY KEY ()"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_FOR_REVERT_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/for_revert" + "'", str0.equals("UpgradeChecks/for_revert"));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        org.apache.ambari.server.serveraction.upgrades.RangerKmsProxyConfig rangerKmsProxyConfig0 = new org.apache.ambari.server.serveraction.upgrades.RangerKmsProxyConfig();
        java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object> concurrentmap_str_obj1 = null;
        try {
            org.apache.ambari.server.agent.CommandReport commandReport2 = rangerKmsProxyConfig0.execute(concurrentmap_str_obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.GLUSTERFS_CLIENT;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        org.apache.ambari.server.orm.entities.StackEntity stackEntity1 = null;
        serviceConfigEntity0._persistence_set_stack(stackEntity1);
        serviceConfigEntity0._persistence_set_clusterId((java.lang.Long) 10L);
        serviceConfigEntity0.setGroupId((java.lang.Long) 0L);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        java.lang.String str0 = org.apache.ambari.server.view.ViewRegistry.API_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/api/v1/clusters/" + "'", str0.equals("/api/v1/clusters/"));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        java.lang.String str1 = org.apache.ambari.server.security.authorization.AuthorizationHelper.resolveLoginAliasToUserName("principal_type");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "principal_type" + "'", str1.equals("principal_type"));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertCurrentEntity, java.lang.Long> singularattribute_alertCurrentEntity_long0 = org.apache.ambari.server.orm.entities.AlertCurrentEntity_.alertId;
        org.junit.Assert.assertNull(singularattribute_alertCurrentEntity_long0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        org.apache.ambari.server.view.configuration.PersistenceConfig persistenceConfig0 = new org.apache.ambari.server.view.configuration.PersistenceConfig();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity0 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.beans.PropertyChangeListener propertyChangeListener1 = requestOperationLevelEntity0._persistence_getPropertyChangeListener();
        requestOperationLevelEntity0.setServiceName("Stage/stage_id");
        org.eclipse.persistence.sessions.Session session4 = requestOperationLevelEntity0._persistence_getSession();
        org.junit.Assert.assertNull(propertyChangeListener1);
        org.junit.Assert.assertNull(session4);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertTargetResourceProvider.ALERT_TARGET;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertTarget" + "'", str0.equals("AlertTarget"));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
        org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse recommendationResponse0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse();
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
        recommendationResponse0.setServices((java.util.Set<java.lang.String>) linkedhashset_str27);
        org.junit.Assert.assertNotNull(file_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set_str33);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        org.apache.ambari.server.state.stack.PrereqCheckType prereqCheckType0 = org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE;
        org.junit.Assert.assertTrue("'" + prereqCheckType0 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE + "'", prereqCheckType0.equals(org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
        org.apache.ambari.server.api.handlers.ReadHandler readHandler0 = new org.apache.ambari.server.api.handlers.ReadHandler();
        org.apache.ambari.server.api.services.Request request1 = null;
        try {
            org.apache.ambari.server.api.services.Result result2 = readHandler0.handleRequest(request1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        org.apache.ambari.server.state.theme.Placement placement0 = new org.apache.ambari.server.state.theme.Placement();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        org.apache.ambari.server.configuration.Configuration configuration0 = null;
        try {
            org.apache.ambari.server.audit.AuditLoggerDefaultImpl auditLoggerDefaultImpl1 = new org.apache.ambari.server.audit.AuditLoggerDefaultImpl(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        java.lang.String str0 = org.apache.ambari.server.orm.dao.HostRoleCommandDAO.HRC_STATUS_SUMMARY_CACHE_SIZE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "hostRoleCommandStatusSummaryCacheSize" + "'", str0.equals("hostRoleCommandStatusSummaryCacheSize"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity0 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        long long1 = clusterConfigEntity0.getTimestamp();
        clusterConfigEntity0._persistence_set_unmapped((short) 100);
        clusterConfigEntity0.setTag("Stopping");
        org.apache.ambari.server.orm.entities.ClusterEntity clusterEntity6 = clusterConfigEntity0.getClusterEntity();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(clusterEntity6);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        java.lang.String str0 = org.apache.ambari.server.api.predicate.QueryLexer.QUERY_TO;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "to" + "'", str0.equals("to"));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
        org.apache.ambari.server.controller.UserRequest userRequest1 = new org.apache.ambari.server.controller.UserRequest("");
        userRequest1.setPassword("Alert/id");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity0 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        org.apache.ambari.server.orm.entities.ViewEntity viewEntity1 = viewResourceEntity0._persistence_get_view();
        java.lang.String str2 = viewResourceEntity0.getViewName();
        org.junit.Assert.assertNull(viewEntity1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        java.lang.String str0 = org.apache.ambari.server.serveraction.kerberos.KerberosOperationHandler.KERBEROS_ENV_ADMIN_SERVER_HOST;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "admin_server_host" + "'", str0.equals("admin_server_host"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        org.apache.ambari.server.bootstrap.SshHostInfo sshHostInfo0 = new org.apache.ambari.server.bootstrap.SshHostInfo();
        sshHostInfo0.setVerbose(true);
        sshHostInfo0.setUserRunAs("slave_type");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
        org.apache.ambari.server.topology.AsyncCallableService.RetryTaskSilently retryTaskSilently4 = new org.apache.ambari.server.topology.AsyncCallableService.RetryTaskSilently();
        org.apache.ambari.server.security.credential.InvalidCredentialValueException invalidCredentialValueException5 = new org.apache.ambari.server.security.credential.InvalidCredentialValueException("servicecomponent_history", (java.lang.Throwable) retryTaskSilently4);
        org.apache.ambari.server.serveraction.kerberos.KerberosRealmException kerberosRealmException6 = new org.apache.ambari.server.serveraction.kerberos.KerberosRealmException("AMBARI.ADMINISTRATOR", (java.lang.Throwable) invalidCredentialValueException5);
        org.apache.ambari.server.security.authorization.jwt.AuthenticationJwtUserNotFoundException authenticationJwtUserNotFoundException7 = new org.apache.ambari.server.security.authorization.jwt.AuthenticationJwtUserNotFoundException("Request body for Blueprint create request is empty", "createtime", (java.lang.Throwable) kerberosRealmException6);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.builder();
        org.apache.ambari.server.audit.event.request.UserPasswordChangeRequestAuditEvent.UserPasswordChangeRequestAuditEventBuilder userPasswordChangeRequestAuditEventBuilder2 = userPasswordChangeRequestAuditEventBuilder0.withUserName("log_output");
        org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder0);
        org.junit.Assert.assertNotNull(userPasswordChangeRequestAuditEventBuilder2);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
        java.lang.String str0 = org.apache.ambari.server.topology.RepositorySetting.BASE_URL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "base_url" + "'", str0.equals("base_url"));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_SERVICE_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/service_name" + "'", str0.equals("HostRoles/service_name"));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
        org.apache.ambari.server.state.services.AmbariServerAlertService ambariServerAlertService0 = new org.apache.ambari.server.state.services.AmbariServerAlertService();
        com.google.common.util.concurrent.Service service1 = ambariServerAlertService0.stopAsync();
        boolean b2 = ambariServerAlertService0.isRunning();
        com.google.common.util.concurrent.ListenableFuture<com.google.common.util.concurrent.Service.State> listenablefuture_state3 = ambariServerAlertService0.start();
        org.junit.Assert.assertNotNull(service1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(listenablefuture_state3);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
        org.apache.ambari.server.configuration.Configuration configuration0 = null;
        org.apache.ambari.server.security.SecurityFilter.init(configuration0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> map_str_map_str_map_str_str4 = null;
        java.io.File[] file_array5 = new java.io.File[] {};
        java.util.ArrayList<java.io.File> arraylist_file6 = new java.util.ArrayList<java.io.File>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.io.File>) arraylist_file6, file_array5);
        java.lang.String[] str_array25 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str26, str_array25);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str26;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str26;
        org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning31 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
        java.util.Set<java.lang.String> set_str32 = hiveNotRollingWarning31.getApplicableServices();
        org.apache.ambari.server.controller.StackVersionResponse stackVersionResponse35 = new org.apache.ambari.server.controller.StackVersionResponse("RootServiceComponents/component_name", "ServiceInfo/service_name", true, "request_id", map_str_map_str_map_str_str4, (java.util.Collection<java.io.File>) arraylist_file6, (java.util.Set<java.lang.String>) linkedhashset_str26, false, (java.util.Collection<java.lang.String>) set_str32, "AlertNotice/target_id", "Request body for Blueprint create request is empty");
        java.lang.String str36 = stackVersionResponse35.getMinJdk();
        org.junit.Assert.assertNotNull(file_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set_str32);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "AlertNotice/target_id" + "'", str36.equals("AlertNotice/target_id"));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        org.apache.ambari.server.orm.entities.WidgetLayoutEntity widgetLayoutEntity0 = new org.apache.ambari.server.orm.entities.WidgetLayoutEntity();
        widgetLayoutEntity0.setId((java.lang.Long) (-1L));
        widgetLayoutEntity0._persistence_resetFetchGroup();
        java.lang.Object obj4 = widgetLayoutEntity0._persistence_post_clone();
        org.eclipse.persistence.queries.FetchGroup fetchGroup5 = widgetLayoutEntity0._persistence_getFetchGroup();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(fetchGroup5);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        java.lang.String str0 = org.apache.ambari.server.agent.RecoveryConfigHelper.RECOVERY_MAX_COUNT_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "recovery_max_count" + "'", str0.equals("recovery_max_count"));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
        org.apache.ambari.server.state.stack.ExtensionMetainfoXml extensionMetainfoXml0 = new org.apache.ambari.server.state.stack.ExtensionMetainfoXml();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        org.apache.ambari.server.agent.RecoveryConfig recoveryConfig0 = new org.apache.ambari.server.agent.RecoveryConfig();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        org.apache.ambari.server.controller.internal.AppCookieManager appCookieManager0 = new org.apache.ambari.server.controller.internal.AppCookieManager();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeItemResourceProvider.UPGRADE_ITEM_STAGE_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeItem/stage_id" + "'", str0.equals("UpgradeItem/stage_id"));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.DATA_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/instance_data" + "'", str0.equals("ViewInstanceInfo/instance_data"));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
        org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Replace replace0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Replace();
        java.lang.String str1 = replace0.replaceWith;
        replace0.ifType = "keytab_file_group_name";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.SCOPE sCOPE0 = org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.SCOPE.USER;
        org.junit.Assert.assertTrue("'" + sCOPE0 + "' != '" + org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.SCOPE.USER + "'", sCOPE0.equals(org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.SCOPE.USER));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
        org.apache.ambari.server.utils.ShellCommandUtil.Result result10 = org.apache.ambari.server.utils.ShellCommandUtil.setFileMode("RootServiceComponents/component_name", true, false, true, true, false, false, false, true, false);
        org.junit.Assert.assertNotNull(result10);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = org.apache.ambari.server.checks.CheckDescription.SERVICES_YARN_TIMELINE_ST;
        org.apache.ambari.server.checks.CheckDescription.SERVICES_NAMENODE_HA = checkDescription0;
        org.apache.ambari.server.checks.CheckDescription.VERSION_MISMATCH = checkDescription0;
        org.apache.ambari.server.checks.CheckDescription.SERVICES_UP = checkDescription0;
        org.apache.ambari.server.checks.CheckDescription.RANGER_SERVICE_AUDIT_DB_CHECK = checkDescription0;
        org.junit.Assert.assertNotNull(checkDescription0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.REPOSITORY_VERSION_DISPLAY_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RepositoryVersions/display_name" + "'", str0.equals("RepositoryVersions/display_name"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        org.springframework.security.authentication.AuthenticationManager authenticationManager0 = null;
        org.apache.ambari.server.configuration.Configuration configuration1 = null;
        org.apache.ambari.server.security.AmbariEntryPoint ambariEntryPoint2 = new org.apache.ambari.server.security.AmbariEntryPoint(configuration1);
        org.apache.ambari.server.audit.AuditLogger auditLogger3 = null;
        org.apache.ambari.server.security.authorization.PermissionHelper permissionHelper4 = null;
        org.apache.ambari.server.security.authentication.AmbariBasicAuthenticationFilter ambariBasicAuthenticationFilter5 = new org.apache.ambari.server.security.authentication.AmbariBasicAuthenticationFilter(authenticationManager0, ambariEntryPoint2, auditLogger3, permissionHelper4);
        ambariBasicAuthenticationFilter5.destroy();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.ALERTS_CACHE_SIZE;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
        org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning0 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
        java.util.Set<java.lang.String> set_str1 = hiveNotRollingWarning0.getApplicableServices();
        org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.propertyIds = set_str1;
        org.junit.Assert.assertNotNull(set_str1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        org.apache.ambari.server.controller.spi.Predicate predicate5 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = org.apache.ambari.server.controller.utilities.PredicateHelper.getProperties(predicate5);
        java.util.LinkedHashSet<java.util.Map<java.lang.String, java.lang.Object>> linkedhashset_map_str_obj7 = new java.util.LinkedHashSet<java.util.Map<java.lang.String, java.lang.Object>>();
        boolean b8 = linkedhashset_map_str_obj7.add(map_str_obj6);
        org.apache.ambari.server.controller.spi.Predicate predicate9 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj10 = org.apache.ambari.server.controller.utilities.PredicateHelper.getProperties(predicate9);
        java.util.LinkedHashSet<java.util.Map<java.lang.String, java.lang.Object>> linkedhashset_map_str_obj11 = new java.util.LinkedHashSet<java.util.Map<java.lang.String, java.lang.Object>>();
        boolean b12 = linkedhashset_map_str_obj11.add(map_str_obj10);
        org.apache.ambari.server.controller.ConfigGroupResponse configGroupResponse13 = new org.apache.ambari.server.controller.ConfigGroupResponse((java.lang.Long) 10L, "javax.net.ssl.trustStorePassword", "Repositories/verify_base_url", "yarn-site", "ambari_java_version", (java.util.Set<java.util.Map<java.lang.String, java.lang.Object>>) linkedhashset_map_str_obj7, (java.util.Set<java.util.Map<java.lang.String, java.lang.Object>>) linkedhashset_map_str_obj11);
        configGroupResponse13.setId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(map_str_obj6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map_str_obj10);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.OperatingSystemResourceProvider.OPERATING_SYSTEM_STACK_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "OperatingSystems/stack_name" + "'", str0.equals("OperatingSystems/stack_name"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.Object obj2 = serviceConfigEntity0._persistence_get("jce_name");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity4 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        serviceConfigEntity0._persistence_propertyChange("Repositories/repository_version_id", (java.lang.Object) clusterConfigEntity4, (java.lang.Object) 10);
        org.apache.ambari.server.orm.entities.HostGroupConfigEntity hostGroupConfigEntity7 = new org.apache.ambari.server.orm.entities.HostGroupConfigEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) clusterConfigEntity4);
        hostGroupConfigEntity7.setConfigAttributes("ambari_java_version");
        org.apache.ambari.server.orm.entities.BlueprintEntity blueprintEntity10 = new org.apache.ambari.server.orm.entities.BlueprintEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) hostGroupConfigEntity7);
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link11 = blueprintEntity10._persistence_getHref();
        org.apache.ambari.server.state.SecurityType securityType12 = null;
        blueprintEntity10._persistence_set_securityType(securityType12);
        java.lang.Object obj14 = blueprintEntity10._persistence_shallow_clone();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(link11);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.TaskResourceProvider.TASK_EXIT_CODE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tasks/exit_code" + "'", str0.equals("Tasks/exit_code"));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
        org.apache.ambari.server.collections.Predicate predicate0 = null;
        java.lang.String str1 = org.apache.ambari.server.collections.PredicateUtils.toJSON(predicate0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        org.apache.ambari.server.configuration.Configuration configuration0 = null;
        try {
            org.apache.ambari.server.orm.dao.AlertsDAO alertsDAO1 = new org.apache.ambari.server.orm.dao.AlertsDAO(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.Object obj2 = serviceConfigEntity0._persistence_get("jce_name");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity4 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        serviceConfigEntity0._persistence_propertyChange("Repositories/repository_version_id", (java.lang.Object) clusterConfigEntity4, (java.lang.Object) 10);
        org.apache.ambari.server.orm.entities.HostGroupConfigEntity hostGroupConfigEntity7 = new org.apache.ambari.server.orm.entities.HostGroupConfigEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) clusterConfigEntity4);
        hostGroupConfigEntity7.setConfigAttributes("ambari_java_version");
        org.apache.ambari.server.orm.entities.BlueprintEntity blueprintEntity10 = new org.apache.ambari.server.orm.entities.BlueprintEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) hostGroupConfigEntity7);
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link11 = blueprintEntity10._persistence_getHref();
        org.apache.ambari.server.state.SecurityType securityType12 = null;
        blueprintEntity10._persistence_set_securityType(securityType12);
        org.eclipse.persistence.queries.FetchGroup fetchGroup14 = blueprintEntity10._persistence_getFetchGroup();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(link11);
        org.junit.Assert.assertNull(fetchGroup14);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_VIEWS;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_VIEWS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_VIEWS));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
        org.apache.ambari.server.state.svccomphost.ServiceComponentHostUninstallEvent serviceComponentHostUninstallEvent3 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostUninstallEvent("Counter:CacheHits", "Requests/cluster_name", (long) 2);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        java.util.regex.Pattern pattern1 = null;
        try {
            boolean b2 = org.apache.ambari.server.checks.HardcodedStackVersionPropertiesCheck.stringContainsVersionHardcode("QuickLinkInfo/stack_version", pattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
        org.apache.ambari.server.serveraction.upgrades.ZooKeeperQuorumCalculator zooKeeperQuorumCalculator0 = new org.apache.ambari.server.serveraction.upgrades.ZooKeeperQuorumCalculator();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        org.apache.ambari.server.orm.entities.StackEntity stackEntity0 = null;
        org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity4 = new org.apache.ambari.server.orm.entities.RepositoryVersionEntity(stackEntity0, "AlertTarget/alert_states", "Hosts/*", "Repositories/repository_version_id");
        repositoryVersionEntity4._persistence_resetFetchGroup();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity0 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        long long1 = clusterConfigEntity0.getTimestamp();
        java.lang.Long long2 = clusterConfigEntity0._persistence_get_clusterId();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        org.apache.ambari.server.bootstrap.SshHostInfo sshHostInfo0 = new org.apache.ambari.server.bootstrap.SshHostInfo();
        boolean b1 = sshHostInfo0.isVerbose();
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        org.apache.ambari.server.api.resources.TaskResourceDefinition taskResourceDefinition0 = new org.apache.ambari.server.api.resources.TaskResourceDefinition();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
        org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity1 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        java.lang.String str2 = viewResourceEntity1.getProvider();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks3 = null;
        viewResourceEntity1._persistence_setLinks(itemLinks3);
        java.util.Set<java.lang.String> set_str5 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.propertyIds;
        viewResourceEntity1.setSubResourceNames((java.util.Collection<java.lang.String>) set_str5);
        org.apache.ambari.server.controller.spi.UnsupportedPropertyException unsupportedPropertyException7 = new org.apache.ambari.server.controller.spi.UnsupportedPropertyException(type0, set_str5);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(set_str5);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        org.apache.ambari.server.state.MaintenanceState maintenanceState0 = null;
        org.apache.ambari.server.state.ServiceComponentHost serviceComponentHost1 = null;
        try {
            org.apache.ambari.server.events.MaintenanceModeEvent maintenanceModeEvent2 = new org.apache.ambari.server.events.MaintenanceModeEvent(maintenanceState0, serviceComponentHost1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.CHECK_REMOTE_MOUNTS;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        java.lang.Number number0 = null;
        java.lang.Number number12 = null;
        org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO hostRoleCommandStatusSummaryDTO15 = new org.apache.ambari.server.orm.dao.HostRoleCommandStatusSummaryDTO(number0, (java.lang.Number) (byte) 0, (java.lang.Number) (byte) 1, (java.lang.Number) (-1L), (java.lang.Number) 20, (java.lang.Number) (byte) 10, (java.lang.Number) (short) 0, (java.lang.Number) (short) 1, (java.lang.Number) 100.0d, (java.lang.Number) 20, (java.lang.Number) (byte) 10, (java.lang.Number) 0L, number12, (java.lang.Number) 100, (java.lang.Number) (short) 60);
        int i16 = hostRoleCommandStatusSummaryDTO15.getTaskTotal();
        org.junit.Assert.assertTrue(i16 == 321);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "cluster_id" + "'", str0.equals("cluster_id"));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        org.eclipse.persistence.internal.descriptors.PersistenceObject persistenceObject0 = null;
        org.apache.ambari.server.orm.entities.BlueprintSettingEntity blueprintSettingEntity1 = new org.apache.ambari.server.orm.entities.BlueprintSettingEntity(persistenceObject0);
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks2 = null;
        blueprintSettingEntity1._persistence_setLinks(itemLinks2);
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link4 = blueprintSettingEntity1._persistence_getHref();
        org.junit.Assert.assertNull(link4);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.SettingResourceProvider.ALL_PROPERTIES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Settings/*" + "'", str0.equals("Settings/*"));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.REFRESH_TOPOLOGY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "refresh_topology" + "'", str0.equals("refresh_topology"));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        java.lang.String str0 = org.eclipse.persistence.sessions.SessionProfiler.RemoteLazy;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Timer:RemoteLazy" + "'", str0.equals("Timer:RemoteLazy"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        org.apache.ambari.server.topology.ConfigRecommendationStrategy configRecommendationStrategy0 = org.apache.ambari.server.topology.ConfigRecommendationStrategy.ONLY_STACK_DEFAULTS_APPLY;
        org.junit.Assert.assertTrue("'" + configRecommendationStrategy0 + "' != '" + org.apache.ambari.server.topology.ConfigRecommendationStrategy.ONLY_STACK_DEFAULTS_APPLY + "'", configRecommendationStrategy0.equals(org.apache.ambari.server.topology.ConfigRecommendationStrategy.ONLY_STACK_DEFAULTS_APPLY));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
        org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent.AddRepositoryRequestAuditEventBuilder addRepositoryRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent.AddRepositoryRequestAuditEventBuilder();
        org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent.AddRepositoryRequestAuditEventBuilder addRepositoryRequestAuditEventBuilder2 = addRepositoryRequestAuditEventBuilder0.withTimestamp((java.lang.Long) 10L);
        org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent.AddRepositoryRequestAuditEventBuilder addRepositoryRequestAuditEventBuilder4 = addRepositoryRequestAuditEventBuilder0.withBaseUrl("kerberos_preconfigure.json");
        org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent.AddRepositoryRequestAuditEventBuilder addRepositoryRequestAuditEventBuilder6 = addRepositoryRequestAuditEventBuilder4.withOperation("Artifacts/artifact_name");
        org.junit.Assert.assertNotNull(addRepositoryRequestAuditEventBuilder2);
        org.junit.Assert.assertNotNull(addRepositoryRequestAuditEventBuilder4);
        org.junit.Assert.assertNotNull(addRepositoryRequestAuditEventBuilder6);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
        java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelper.DIRECTIVE_IGNORE_CONFIGS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ignore_config_updates" + "'", str0.equals("ignore_config_updates"));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        org.apache.ambari.server.view.configuration.ViewConfig viewConfig0 = null;
        java.net.URL uRL1 = null;
        java.net.URL[] uRL_array2 = new java.net.URL[] { uRL1 };
        org.apache.ambari.server.view.ViewClassLoader viewClassLoader3 = new org.apache.ambari.server.view.ViewClassLoader(viewConfig0, uRL_array2);
        org.apache.ambari.server.utils.Closeables.closeSilently((java.io.Closeable) viewClassLoader3);
        org.junit.Assert.assertNotNull(uRL_array2);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.ConfigGroup configGroup0 = new org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.ConfigGroup();
        java.util.List<java.lang.String> list_str1 = configGroup0.getHosts();
        java.util.Map<java.lang.String, org.apache.ambari.server.api.services.stackadvisor.recommendations.RecommendationResponse.BlueprintConfigurations> map_str_blueprintConfigurations2 = configGroup0.getConfigurations();
        org.junit.Assert.assertNull(list_str1);
        org.junit.Assert.assertNotNull(map_str_blueprintConfigurations2);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
        javax.net.SocketFactory socketFactory0 = org.apache.ambari.server.security.InternalSSLSocketFactoryTrusting.getDefault();
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        serviceConfigEntity0._persistence_set_serviceConfigId((java.lang.Long) 1L);
        org.apache.ambari.server.orm.entities.RoleAuthorizationEntity roleAuthorizationEntity3 = new org.apache.ambari.server.orm.entities.RoleAuthorizationEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) serviceConfigEntity0);
        java.util.List list4 = serviceConfigEntity0._persistence_getRelationships();
        org.junit.Assert.assertNull(list4);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        org.apache.ambari.server.orm.dao.TopologyHostRequestDAO topologyHostRequestDAO0 = new org.apache.ambari.server.orm.dao.TopologyHostRequestDAO();
        org.apache.ambari.server.orm.entities.TopologyHostRequestEntity topologyHostRequestEntity1 = null;
        try {
            topologyHostRequestDAO0.remove(topologyHostRequestEntity1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        org.apache.ambari.server.stack.StackManager.PATH_DELIMITER = "Repositories/verify_base_url";
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
        java.lang.String str0 = org.apache.ambari.server.controller.KerberosHelper.AMBARI_SERVER_HOST_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ambari_server" + "'", str0.equals("ambari_server"));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
        org.apache.ambari.server.orm.dao.UserDAO userDAO0 = null;
        org.apache.ambari.server.security.authorization.Users users1 = new org.apache.ambari.server.security.authorization.Users();
        org.springframework.security.crypto.password.PasswordEncoder passwordEncoder2 = null;
        org.apache.ambari.server.security.authorization.AmbariLocalUserProvider ambariLocalUserProvider3 = new org.apache.ambari.server.security.authorization.AmbariLocalUserProvider(userDAO0, users1, passwordEncoder2);
        try {
            users1.setGroupLdap("resources");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.WIDGETS_DESCRIPTOR_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "widgets_descriptor" + "'", str0.equals("widgets_descriptor"));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
        org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity0 = new org.apache.ambari.server.orm.entities.ClusterServiceEntity();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link1 = null;
        clusterServiceEntity0._persistence_setHref(link1);
        clusterServiceEntity0.setServiceEnabled((int) (byte) -1);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
        org.apache.ambari.server.orm.entities.TopologyLogicalTaskEntity topologyLogicalTaskEntity0 = new org.apache.ambari.server.orm.entities.TopologyLogicalTaskEntity();
        java.lang.Object obj1 = topologyLogicalTaskEntity0._persistence_post_clone();
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_ID_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Clusters/cluster_id" + "'", str0.equals("Clusters/cluster_id"));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.OJDBC_JAR_NAME;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
        java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ConfigureFunction.actionVerb;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Configuring" + "'", str0.equals("Configuring"));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
        org.apache.ambari.server.state.StackInfo stackInfo0 = null;
        try {
            org.apache.ambari.server.state.repository.VersionDefinitionXml versionDefinitionXml1 = org.apache.ambari.server.state.repository.VersionDefinitionXml.build(stackInfo0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        org.apache.ambari.server.orm.entities.ViewInstanceDataEntityPK viewInstanceDataEntityPK0 = new org.apache.ambari.server.orm.entities.ViewInstanceDataEntityPK();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.UPGRADE_HISTORY_TABLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "upgrade_history" + "'", str0.equals("upgrade_history"));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_CONFIGS;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_CONFIGS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_VIEW_CONFIGS));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
        org.apache.ambari.server.audit.request.eventcreator.UpgradeEventCreator upgradeEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.UpgradeEventCreator();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
        org.apache.ambari.server.orm.entities.StackEntity stackEntity0 = null;
        org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity4 = new org.apache.ambari.server.orm.entities.RepositoryVersionEntity(stackEntity0, "AlertTarget/alert_states", "Hosts/*", "Repositories/repository_version_id");
        short s5 = repositoryVersionEntity4._persistence_get_isLegacy();
        org.junit.Assert.assertTrue(s5 == (short) 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryResourceProvider.REPOSITORY_TAGS_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Repositories/tags" + "'", str0.equals("Repositories/tags"));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StackEntity, java.lang.Long> singularattribute_stackEntity_long0 = org.apache.ambari.server.orm.entities.StackEntity_.stackId;
        org.junit.Assert.assertNull(singularattribute_stackEntity_long0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
        org.apache.ambari.server.orm.entities.ResourceEntity resourceEntity0 = new org.apache.ambari.server.orm.entities.ResourceEntity();
        java.lang.Object obj1 = resourceEntity0._persistence_getId();
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
        org.apache.ambari.server.orm.dao.UserDAO userDAO0 = null;
        org.apache.ambari.server.security.authorization.Users users1 = new org.apache.ambari.server.security.authorization.Users();
        org.springframework.security.crypto.password.PasswordEncoder passwordEncoder2 = null;
        org.apache.ambari.server.security.authorization.AmbariLocalUserProvider ambariLocalUserProvider3 = new org.apache.ambari.server.security.authorization.AmbariLocalUserProvider(userDAO0, users1, passwordEncoder2);
        org.springframework.security.core.authority.mapping.GrantedAuthoritiesMapper grantedAuthoritiesMapper4 = null;
        ambariLocalUserProvider3.setAuthoritiesMapper(grantedAuthoritiesMapper4);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
        java.lang.String str0 = org.apache.ambari.server.agent.RecoveryConfigHelper.RECOVERY_MAX_COUNT_DEFAULT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "6" + "'", str0.equals("6"));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        serviceConfigEntity0._persistence_set_serviceConfigId((java.lang.Long) 1L);
        java.util.List<org.apache.ambari.server.orm.entities.ClusterConfigEntity> list_clusterConfigEntity3 = serviceConfigEntity0.getClusterConfigEntities();
        org.junit.Assert.assertNull(list_clusterConfigEntity3);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity0 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        java.lang.String str1 = viewResourceEntity0.getProvider();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks2 = null;
        viewResourceEntity0._persistence_setLinks(itemLinks2);
        org.apache.ambari.server.orm.entities.ViewEntity viewEntity4 = null;
        viewResourceEntity0._persistence_set_view(viewEntity4);
        viewResourceEntity0.setProvider("update_timestamp");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
        org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity0 = new org.apache.ambari.server.orm.entities.ClusterServiceEntity();
        boolean b2 = clusterServiceEntity0._persistence_isAttributeFetched("validate_config");
        java.lang.Object obj3 = clusterServiceEntity0._persistence_getId();
        org.eclipse.persistence.queries.FetchGroup fetchGroup4 = clusterServiceEntity0._persistence_getFetchGroup();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(fetchGroup4);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
        java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type, java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.keyPropertyIds;
        org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor1 = new org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor(map_type_str0);
        java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type, java.lang.String> map_type_str2 = org.apache.ambari.server.state.kerberos.AbstractKerberosDescriptor.nullToEmpty(map_type_str0);
        org.junit.Assert.assertNotNull(map_type_str0);
        org.junit.Assert.assertNotNull(map_type_str2);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
        int i3 = org.apache.ambari.server.utils.VersionUtils.compareVersionsWithBuild("Info:LoginTime", "StackConfigurationDependency/dependency_type", (int) ' ');
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackVersionResourceProvider.STACK_MIN_VERSION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/min_upgrade_version" + "'", str0.equals("Versions/min_upgrade_version"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.VersionDefinitionResourceProvider.VERSION_DEF_STACK_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "VersionDefinition/stack_name" + "'", str0.equals("VersionDefinition/stack_name"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
        java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type, java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.keyPropertyIds;
        org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor1 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor(map_type_str0);
        org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.keyPropertyIds = map_type_str0;
        org.junit.Assert.assertNotNull(map_type_str0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        java.lang.String str0 = org.apache.ambari.server.stack.StackDirectory.RCO_FILE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "role_command_order.json" + "'", str0.equals("role_command_order.json"));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
        org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.builder();
        org.apache.ambari.server.api.services.ResultStatus resultStatus1 = null;
        org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder2 = deleteRepositoryVersionAuditEventBuilder0.withResultStatus(resultStatus1);
        org.apache.ambari.server.audit.event.request.DeleteRepositoryVersionRequestAuditEvent.DeleteRepositoryVersionAuditEventBuilder deleteRepositoryVersionAuditEventBuilder4 = deleteRepositoryVersionAuditEventBuilder2.withRepoVersion("PrivilegeInfo/principal_type");
        org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder0);
        org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder2);
        org.junit.Assert.assertNotNull(deleteRepositoryVersionAuditEventBuilder4);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity0 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Object obj1 = requestOperationLevelEntity0._persistence_post_clone();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks2 = requestOperationLevelEntity0._persistence_getLinks();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(itemLinks2);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test399");
        org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricsCacheSizeOfEngine timelineMetricsCacheSizeOfEngine0 = new org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricsCacheSizeOfEngine();
        net.sf.ehcache.pool.SizeOfEngine sizeOfEngine3 = timelineMetricsCacheSizeOfEngine0.copyWith((int) 'a', false);
        org.junit.Assert.assertNotNull(sizeOfEngine3);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.INSTALL_PACKAGES;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test401");
        org.apache.ambari.server.controller.spi.Predicate predicate0 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj1 = org.apache.ambari.server.controller.utilities.PredicateHelper.getProperties(predicate0);
        java.lang.String str2 = org.apache.ambari.server.controller.internal.HostResourceProvider.getHostNameFromProperties(map_str_obj1);
        org.junit.Assert.assertNotNull(map_str_obj1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test403");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.Object obj2 = serviceConfigEntity0._persistence_get("jce_name");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity4 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        serviceConfigEntity0._persistence_propertyChange("Repositories/repository_version_id", (java.lang.Object) clusterConfigEntity4, (java.lang.Object) 10);
        org.apache.ambari.server.orm.entities.HostGroupConfigEntity hostGroupConfigEntity7 = new org.apache.ambari.server.orm.entities.HostGroupConfigEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) clusterConfigEntity4);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        hostGroupConfigEntity7._persistence_setPropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
        org.apache.ambari.server.controller.StackConfigurationDependencyRequest stackConfigurationDependencyRequest5 = new org.apache.ambari.server.controller.StackConfigurationDependencyRequest("Credential/principal", "RootServiceComponents/component_name", "jce_name", "Repositories/repository_version_id", "operation_level/service_name");
        java.lang.String str6 = stackConfigurationDependencyRequest5.getServiceName();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "jce_name" + "'", str6.equals("jce_name"));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
        org.apache.ambari.server.controller.GroupResponse groupResponse2 = new org.apache.ambari.server.controller.GroupResponse("ambari.dispatch.credential.password", false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
        org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys ambariLdapConfigurationKeys0 = org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.REFERRAL_HANDLING;
        org.junit.Assert.assertTrue("'" + ambariLdapConfigurationKeys0 + "' != '" + org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.REFERRAL_HANDLING + "'", ambariLdapConfigurationKeys0.equals(org.apache.ambari.server.ldap.domain.AmbariLdapConfigurationKeys.REFERRAL_HANDLING));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
        org.apache.ambari.server.api.services.RequestService requestService1 = new org.apache.ambari.server.api.services.RequestService("AlertNotice/target_id");
        org.apache.ambari.server.api.services.StageService stageService3 = requestService1.getStageHandler("ranger-hive-plugin-properties");
        javax.ws.rs.core.HttpHeaders httpHeaders5 = null;
        org.apache.ambari.server.api.services.LocalUriInfo localUriInfo7 = new org.apache.ambari.server.api.services.LocalUriInfo("commands_to_retry");
        try {
            javax.ws.rs.core.Response response8 = stageService3.getStages("metadata", httpHeaders5, (javax.ws.rs.core.UriInfo) localUriInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stageService3);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
        org.apache.ambari.server.state.action.ActionState actionState0 = org.apache.ambari.server.state.action.ActionState.INIT;
        org.junit.Assert.assertTrue("'" + actionState0 + "' != '" + org.apache.ambari.server.state.action.ActionState.INIT + "'", actionState0.equals(org.apache.ambari.server.state.action.ActionState.INIT));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_GROUP_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "host_group" + "'", str0.equals("host_group"));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
        org.apache.ambari.server.api.rest.BootStrapResource bootStrapResource0 = new org.apache.ambari.server.api.rest.BootStrapResource();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
        org.apache.ambari.server.serveraction.kerberos.Component component4 = new org.apache.ambari.server.serveraction.kerberos.Component("AlertNotice/target_id", "RepositoryVersions/display_name", "truststore.password", (java.lang.Long) 100L);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test412");
        org.apache.ambari.server.orm.entities.WidgetLayoutEntity widgetLayoutEntity0 = new org.apache.ambari.server.orm.entities.WidgetLayoutEntity();
        java.lang.Long long1 = widgetLayoutEntity0.getId();
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test413");
        org.apache.ambari.server.state.ConfigMergeHelper configMergeHelper0 = new org.apache.ambari.server.state.ConfigMergeHelper();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
        org.apache.ambari.server.topology.validators.UnitValidatedProperty unitValidatedProperty3 = new org.apache.ambari.server.topology.validators.UnitValidatedProperty("data_directory", "", "QuickLinkInfo/stack_version");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
        org.apache.ambari.server.state.alert.AlertDefinitionFactory alertDefinitionFactory0 = new org.apache.ambari.server.state.alert.AlertDefinitionFactory();
        java.io.File file1 = null;
        org.apache.ambari.server.security.encryption.FileBasedCredentialStore fileBasedCredentialStore2 = new org.apache.ambari.server.security.encryption.FileBasedCredentialStore(file1);
        java.io.File file3 = fileBasedCredentialStore2.getKeyStorePath();
        org.apache.ambari.server.security.encryption.MasterKeyServiceImpl masterKeyServiceImpl4 = new org.apache.ambari.server.security.encryption.MasterKeyServiceImpl(file3);
        try {
            java.util.Set<org.apache.ambari.server.state.alert.AlertDefinition> set_alertDefinition6 = alertDefinitionFactory0.getAlertDefinitions(file3, "HostRoles/service_name");
            org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.AmbariException");
        } catch (org.apache.ambari.server.AmbariException e) {
        }
        org.junit.Assert.assertNotNull(file3);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
        org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Replace replace0 = new org.apache.ambari.server.state.stack.upgrade.ConfigUpgradeChangeDefinition.Replace();
        replace0.key = "Requests/cluster_name";
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test417");
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity0 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Long long1 = requestOperationLevelEntity0._persistence_get_operationLevelId();
        org.apache.ambari.server.orm.entities.PrivilegeEntity privilegeEntity2 = new org.apache.ambari.server.orm.entities.PrivilegeEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity0);
        org.eclipse.persistence.sessions.Session session3 = null;
        privilegeEntity2._persistence_setSession(session3);
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test418");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceResourceProvider.SERVICE_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RootService/service_name" + "'", str0.equals("RootService/service_name"));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test419");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.ZOOKEEPER_QUORUM_SERVICE_CHECK;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test420");
        org.apache.ambari.server.serveraction.kerberos.PrepareKerberosIdentitiesServerAction prepareKerberosIdentitiesServerAction0 = new org.apache.ambari.server.serveraction.kerberos.PrepareKerberosIdentitiesServerAction();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test421");
        java.lang.String str0 = org.apache.ambari.server.stack.StackManager.EXTENSIONS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "extensions" + "'", str0.equals("extensions"));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
        org.apache.ambari.server.state.PropertyUpgradeBehavior propertyUpgradeBehavior0 = new org.apache.ambari.server.state.PropertyUpgradeBehavior();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
        org.apache.ambari.server.orm.entities.WidgetLayoutEntity widgetLayoutEntity0 = new org.apache.ambari.server.orm.entities.WidgetLayoutEntity();
        widgetLayoutEntity0.setId((java.lang.Long) (-1L));
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link3 = widgetLayoutEntity0._persistence_getHref();
        org.eclipse.persistence.internal.identitymaps.CacheKey cacheKey4 = widgetLayoutEntity0._persistence_getCacheKey();
        widgetLayoutEntity0._persistence_setShouldRefreshFetchGroup(false);
        org.junit.Assert.assertNull(link3);
        org.junit.Assert.assertNull(cacheKey4);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
        org.apache.ambari.server.state.stack.upgrade.Batch batch0 = new org.apache.ambari.server.state.stack.upgrade.Batch();
        batch0.percent = (short) 1;
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test425");
        org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
        org.apache.ambari.server.api.resources.ExtensionResourceDefinition extensionResourceDefinition1 = new org.apache.ambari.server.api.resources.ExtensionResourceDefinition(type0);
        java.lang.String str2 = extensionResourceDefinition1.getPluralName();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "extensions" + "'", str2.equals("extensions"));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
        java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.CUSTOM_FOLDER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "custom_folder" + "'", str0.equals("custom_folder"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test427");
        org.apache.ambari.server.security.authorization.PamAuthenticationException pamAuthenticationException3 = new org.apache.ambari.server.security.authorization.PamAuthenticationException("SET_KEYTAB");
        org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException kerberosAdminAuthenticationException4 = new org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException("Hosts/*", (java.lang.Throwable) pamAuthenticationException3);
        org.apache.ambari.server.view.IllegalClusterException illegalClusterException5 = new org.apache.ambari.server.view.IllegalClusterException("Artifacts/stack_name", (java.lang.Throwable) kerberosAdminAuthenticationException4);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.VIEWS_HTTP_CHARSET;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
        org.apache.ambari.server.security.credential.InvalidCredentialValueException invalidCredentialValueException1 = new org.apache.ambari.server.security.credential.InvalidCredentialValueException("");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test430");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        requestResourceFilterEntity0._persistence_set_componentName("javax.net.ssl.trustStorePassword");
        requestResourceFilterEntity0._persistence_checkFetched("host_id");
        java.lang.Long long5 = requestResourceFilterEntity0.getFilterId();
        org.apache.ambari.server.orm.entities.GroupEntity groupEntity6 = new org.apache.ambari.server.orm.entities.GroupEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestResourceFilterEntity0);
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks7 = null;
        groupEntity6._persistence_setLinks(itemLinks7);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test431");
        org.apache.ambari.server.controller.ExtensionRequest extensionRequest1 = new org.apache.ambari.server.controller.ExtensionRequest("Configuring");
        extensionRequest1.setExtensionName("ranger-hive-plugin-properties");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity0 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        java.lang.String str1 = viewResourceEntity0.getProvider();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link2 = null;
        viewResourceEntity0._persistence_setHref(link2);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> map_str_map_str_map_str_str6 = null;
        java.io.File[] file_array7 = new java.io.File[] {};
        java.util.ArrayList<java.io.File> arraylist_file8 = new java.util.ArrayList<java.io.File>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<java.io.File>) arraylist_file8, file_array7);
        java.lang.String[] str_array27 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str28, str_array27);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str28;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str28;
        org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning33 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
        java.util.Set<java.lang.String> set_str34 = hiveNotRollingWarning33.getApplicableServices();
        org.apache.ambari.server.controller.StackVersionResponse stackVersionResponse37 = new org.apache.ambari.server.controller.StackVersionResponse("RootServiceComponents/component_name", "ServiceInfo/service_name", true, "request_id", map_str_map_str_map_str_str6, (java.util.Collection<java.io.File>) arraylist_file8, (java.util.Set<java.lang.String>) linkedhashset_str28, false, (java.util.Collection<java.lang.String>) set_str34, "AlertNotice/target_id", "Request body for Blueprint create request is empty");
        java.util.Map<java.lang.String, java.lang.String> map_str_str38 = null;
        org.apache.ambari.server.state.stack.upgrade.Task[] task_array39 = new org.apache.ambari.server.state.stack.upgrade.Task[] {};
        org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper40 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("name", "Users/groups", (java.util.Set<java.lang.String>) linkedhashset_str28, map_str_str38, task_array39);
        java.util.Map<java.lang.String, java.lang.String> map_str_str41 = taskWrapper40.getParams();
        try {
            org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel42 = new org.apache.ambari.server.controller.internal.RequestOperationLevel(map_str_str41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(file_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set_str34);
        org.junit.Assert.assertNotNull(task_array39);
        org.junit.Assert.assertNotNull(map_str_str41);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test434");
        java.lang.String str0 = org.apache.ambari.server.controller.ServiceConfigVersionResponse.DEFAULT_CONFIG_GROUP_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Default" + "'", str0.equals("Default"));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test435");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
        org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider1 = null;
        org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration2 = null;
        org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule3 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
        org.apache.ambari.server.controller.spi.Resource.Type type4 = null;
        org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type type5 = org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete;
        java.util.Set<java.lang.String> set_str6 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str7 = null;
        java.util.Map<java.lang.String, org.apache.ambari.server.controller.spi.TemporalInfo> map_str_temporalInfo8 = null;
        org.apache.ambari.server.controller.spi.PageRequest pageRequest9 = null;
        org.apache.ambari.server.controller.spi.SortRequest sortRequest10 = null;
        org.apache.ambari.server.controller.spi.Request request11 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(set_str6, map_str_str7, map_str_temporalInfo8, pageRequest9, sortRequest10);
        org.apache.ambari.server.controller.spi.Predicate predicate12 = null;
        org.apache.ambari.server.controller.internal.ResourceProviderEvent resourceProviderEvent13 = new org.apache.ambari.server.controller.internal.ResourceProviderEvent(type4, type5, request11, predicate12);
        defaultProviderModule3.update(resourceProviderEvent13);
        try {
            org.apache.ambari.server.controller.metrics.ganglia.GangliaHostPropertyProvider gangliaHostPropertyProvider17 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaHostPropertyProvider(map_str_map_str_propertyInfo0, uRLStreamProvider1, componentSSLConfiguration2, (org.apache.ambari.server.controller.metrics.MetricHostProvider) defaultProviderModule3, "version", "slave_type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete + "'", type5.equals(org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete));
        org.junit.Assert.assertNotNull(request11);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
        org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
        org.apache.ambari.server.api.resources.StackLevelConfigurationResourceDefinition stackLevelConfigurationResourceDefinition1 = new org.apache.ambari.server.api.resources.StackLevelConfigurationResourceDefinition(type0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RequestResourceProvider.REQUEST_CLUSTER_ID_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Requests/cluster_id" + "'", str0.equals("Requests/cluster_id"));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
        org.apache.ambari.server.state.ClientConfigFileDefinition clientConfigFileDefinition0 = new org.apache.ambari.server.state.ClientConfigFileDefinition();
        clientConfigFileDefinition0.setDictionaryName("SET_KEYTAB");
        clientConfigFileDefinition0.setOptional(false);
        clientConfigFileDefinition0.setType("Event/summary/memberships/created");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test439");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity0 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        long long1 = clusterConfigEntity0.getTimestamp();
        java.util.Collection<org.apache.ambari.server.orm.entities.ServiceConfigEntity> collection_serviceConfigEntity2 = clusterConfigEntity0.getServiceConfigEntities();
        org.apache.ambari.server.orm.entities.RoleSuccessCriteriaEntity roleSuccessCriteriaEntity3 = new org.apache.ambari.server.orm.entities.RoleSuccessCriteriaEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) clusterConfigEntity0);
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(collection_serviceConfigEntity2);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test440");
        org.apache.ambari.server.orm.dao.TopologyLogicalTaskDAO topologyLogicalTaskDAO0 = new org.apache.ambari.server.orm.dao.TopologyLogicalTaskDAO();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.STACK_COMPONENT_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Artifacts/component_name" + "'", str0.equals("Artifacts/component_name"));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
        org.apache.ambari.server.bootstrap.SshHostInfo sshHostInfo0 = new org.apache.ambari.server.bootstrap.SshHostInfo();
        sshHostInfo0.setVerbose(true);
        sshHostInfo0.setUser("1.3.6.1.4.1.18060.16.1");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test443");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ProvisionClusterRequest.REPO_VERSION_ID_PROPERTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "repository_version_id" + "'", str0.equals("repository_version_id"));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test444");
        org.apache.ambari.server.state.stack.upgrade.UpgradeType upgradeType1 = org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING;
        org.apache.ambari.server.controller.PrereqCheckRequest prereqCheckRequest2 = new org.apache.ambari.server.controller.PrereqCheckRequest("version", upgradeType1);
        org.apache.ambari.server.checks.CheckDescription checkDescription3 = org.apache.ambari.server.checks.CheckDescription.SERVICES_YARN_TIMELINE_ST;
        org.apache.ambari.server.checks.CheckDescription.SERVICES_NAMENODE_HA = checkDescription3;
        org.apache.ambari.server.checks.CheckDescription.VERSION_MISMATCH = checkDescription3;
        org.apache.ambari.server.checks.CheckDescription.SERVICES_UP = checkDescription3;
        org.apache.ambari.server.state.stack.PrereqCheckStatus prereqCheckStatus7 = null;
        prereqCheckRequest2.addResult(checkDescription3, prereqCheckStatus7);
        org.apache.ambari.server.checks.CheckDescription checkDescription9 = org.apache.ambari.server.checks.CheckDescription.SERVICES_MAINTENANCE_MODE;
        org.apache.ambari.server.state.stack.PrereqCheckStatus prereqCheckStatus10 = org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL;
        prereqCheckRequest2.addResult(checkDescription9, prereqCheckStatus10);
        org.junit.Assert.assertTrue("'" + upgradeType1 + "' != '" + org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING + "'", upgradeType1.equals(org.apache.ambari.server.state.stack.upgrade.UpgradeType.ROLLING));
        org.junit.Assert.assertNotNull(checkDescription3);
        org.junit.Assert.assertNotNull(checkDescription9);
        org.junit.Assert.assertTrue("'" + prereqCheckStatus10 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL + "'", prereqCheckStatus10.equals(org.apache.ambari.server.state.stack.PrereqCheckStatus.FAIL));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test445");
        org.apache.ambari.server.stack.ModuleState moduleState0 = org.apache.ambari.server.stack.ModuleState.RESOLVED;
        org.junit.Assert.assertTrue("'" + moduleState0 + "' != '" + org.apache.ambari.server.stack.ModuleState.RESOLVED + "'", moduleState0.equals(org.apache.ambari.server.stack.ModuleState.RESOLVED));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test446");
        org.apache.ambari.server.orm.entities.TopologyHostGroupEntity topologyHostGroupEntity0 = new org.apache.ambari.server.orm.entities.TopologyHostGroupEntity();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test447");
        org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteCheckProperties prerequisiteCheckProperties0 = new org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteCheckProperties();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test448");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity, java.lang.String> singularattribute_alertHistoryEntity_str0 = org.apache.ambari.server.orm.entities.AlertHistoryEntity_.hostName;
        org.junit.Assert.assertNull(singularattribute_alertHistoryEntity_str0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test449");
        java.lang.String str0 = org.apache.ambari.server.stack.StackManager.PATH_DELIMITER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Repositories/verify_base_url" + "'", str0.equals("Repositories/verify_base_url"));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test450");
        org.apache.ambari.server.orm.entities.HostRoleCommandEntity hostRoleCommandEntity5 = null;
        org.apache.ambari.server.controller.internal.UpgradeSummary upgradeSummary6 = new org.apache.ambari.server.controller.internal.UpgradeSummary("service_name", (java.lang.Long) 1L, (java.lang.Long) 1L, (java.lang.Long) 1L, "stack_name", hostRoleCommandEntity5);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test451");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.String str1 = serviceConfigEntity0._persistence_get_user();
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity2 = new org.apache.ambari.server.orm.entities.ViewResourceEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) serviceConfigEntity0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "_db" + "'", str1.equals("_db"));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test452");
        org.apache.ambari.server.bootstrap.BSResponse bSResponse0 = new org.apache.ambari.server.bootstrap.BSResponse();
        java.lang.String str1 = bSResponse0.getLog();
        long long2 = bSResponse0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(long2 == 0L);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test453");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SRVR_CRT_NAME;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test454");
        org.apache.ambari.server.ldap.service.AttributeDetector[] attributeDetector_array0 = new org.apache.ambari.server.ldap.service.AttributeDetector[] {};
        java.util.LinkedHashSet<org.apache.ambari.server.ldap.service.AttributeDetector> linkedhashset_attributeDetector1 = new java.util.LinkedHashSet<org.apache.ambari.server.ldap.service.AttributeDetector>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.ldap.service.AttributeDetector>) linkedhashset_attributeDetector1, attributeDetector_array0);
        org.apache.ambari.server.ldap.service.ads.detectors.ChainedAttributeDetector chainedAttributeDetector3 = new org.apache.ambari.server.ldap.service.ads.detectors.ChainedAttributeDetector((java.util.Set<org.apache.ambari.server.ldap.service.AttributeDetector>) linkedhashset_attributeDetector1);
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = chainedAttributeDetector3.detect();
        org.junit.Assert.assertNotNull(attributeDetector_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(map_str_str4);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test455");
        org.apache.ambari.server.controller.spi.Resource.InternalType internalType0 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo1 = null;
        org.apache.ambari.server.controller.internal.URLStreamProvider uRLStreamProvider2 = null;
        org.apache.ambari.server.configuration.ComponentSSLConfiguration componentSSLConfiguration3 = null;
        org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricCacheProvider timelineMetricCacheProvider4 = null;
        org.apache.ambari.server.controller.internal.DefaultProviderModule defaultProviderModule5 = new org.apache.ambari.server.controller.internal.DefaultProviderModule();
        org.apache.ambari.server.controller.spi.Resource.Type type6 = null;
        org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type type7 = org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete;
        java.util.Set<java.lang.String> set_str8 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = null;
        java.util.Map<java.lang.String, org.apache.ambari.server.controller.spi.TemporalInfo> map_str_temporalInfo10 = null;
        org.apache.ambari.server.controller.spi.PageRequest pageRequest11 = null;
        org.apache.ambari.server.controller.spi.SortRequest sortRequest12 = null;
        org.apache.ambari.server.controller.spi.Request request13 = org.apache.ambari.server.controller.utilities.PropertyHelper.getReadRequest(set_str8, map_str_str9, map_str_temporalInfo10, pageRequest11, sortRequest12);
        org.apache.ambari.server.controller.spi.Predicate predicate14 = null;
        org.apache.ambari.server.controller.internal.ResourceProviderEvent resourceProviderEvent15 = new org.apache.ambari.server.controller.internal.ResourceProviderEvent(type6, type7, request13, predicate14);
        defaultProviderModule5.update(resourceProviderEvent15);
        org.apache.ambari.server.controller.metrics.MetricsServiceProvider metricsServiceProvider17 = null;
        try {
            org.apache.ambari.server.controller.metrics.MetricsPropertyProviderProxy metricsPropertyProviderProxy21 = new org.apache.ambari.server.controller.metrics.MetricsPropertyProviderProxy(internalType0, map_str_map_str_propertyInfo1, uRLStreamProvider2, componentSSLConfiguration3, timelineMetricCacheProvider4, (org.apache.ambari.server.controller.metrics.MetricHostProvider) defaultProviderModule5, metricsServiceProvider17, "1.3.6.1.4.1.18060.16.0", "6", "ejb");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete + "'", type7.equals(org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete));
        org.junit.Assert.assertNotNull(request13);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test456");
        org.apache.ambari.server.api.services.SettingService settingService0 = new org.apache.ambari.server.api.services.SettingService();
        javax.ws.rs.core.HttpHeaders httpHeaders2 = null;
        org.apache.ambari.server.api.services.LocalUriInfo localUriInfo4 = new org.apache.ambari.server.api.services.LocalUriInfo("commands_to_retry");
        try {
            javax.ws.rs.core.Response response5 = settingService0.getSettings("Versions/stack_name", httpHeaders2, (javax.ws.rs.core.UriInfo) localUriInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test457");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        requestResourceFilterEntity0._persistence_set_componentName("javax.net.ssl.trustStorePassword");
        requestResourceFilterEntity0._persistence_checkFetched("host_id");
        java.lang.Long long5 = requestResourceFilterEntity0.getFilterId();
        org.apache.ambari.server.orm.entities.GroupEntity groupEntity6 = new org.apache.ambari.server.orm.entities.GroupEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestResourceFilterEntity0);
        org.apache.ambari.server.controller.ServiceRequest serviceRequest12 = new org.apache.ambari.server.controller.ServiceRequest("timelineMetricCache", "jce_name", (java.lang.Long) 10L, "LinearExecutionJobs", "ViewVersionInfo/parameters");
        groupEntity6._persistence_setId((java.lang.Object) "LinearExecutionJobs");
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test458");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        requestResourceFilterEntity0._persistence_set_componentName("javax.net.ssl.trustStorePassword");
        requestResourceFilterEntity0._persistence_checkFetched("host_id");
        java.lang.Long long5 = requestResourceFilterEntity0.getFilterId();
        org.eclipse.persistence.internal.identitymaps.CacheKey cacheKey6 = null;
        requestResourceFilterEntity0._persistence_setCacheKey(cacheKey6);
        org.junit.Assert.assertNull(long5);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test459");
        java.util.Map<java.lang.String, java.util.List<? extends javax.persistence.metamodel.SingularAttribute<?, ?>>> map_str_list_wildcard0 = org.apache.ambari.server.orm.entities.AlertNoticeEntity_.getPredicateMapping();
        org.junit.Assert.assertNotNull(map_str_list_wildcard0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test460");
        org.apache.ambari.server.notifications.TargetConfigurationResult targetConfigurationResult0 = org.apache.ambari.server.notifications.TargetConfigurationResult.valid();
        org.junit.Assert.assertNotNull(targetConfigurationResult0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test461");
        org.apache.ambari.server.controller.StackConfigurationDependencyRequest stackConfigurationDependencyRequest5 = new org.apache.ambari.server.controller.StackConfigurationDependencyRequest("", "", "Hosts/*", "io.compression.codec.lzo.class", "ambari.dispatch.snmp.security.auth.passphrase");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test462");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.AlertGroupResourceProvider.ALERT_GROUP_DEFAULT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AlertGroup/default" + "'", str0.equals("AlertGroup/default"));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test463");
        org.apache.ambari.server.orm.dao.PrivilegeDAO privilegeDAO0 = new org.apache.ambari.server.orm.dao.PrivilegeDAO();
        org.apache.ambari.server.orm.dao.UserDAO userDAO1 = null;
        org.apache.ambari.server.orm.dao.GroupDAO groupDAO2 = null;
        org.apache.ambari.server.orm.dao.PrincipalDAO principalDAO3 = null;
        org.apache.ambari.server.orm.dao.PermissionDAO permissionDAO4 = null;
        org.apache.ambari.server.orm.dao.ResourceDAO resourceDAO5 = null;
        org.apache.ambari.server.controller.internal.PrivilegeResourceProvider.init(privilegeDAO0, userDAO1, groupDAO2, principalDAO3, permissionDAO4, resourceDAO5);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test464");
        org.apache.ambari.server.state.alert.AlertDefinitionFactory alertDefinitionFactory0 = new org.apache.ambari.server.state.alert.AlertDefinitionFactory();
        org.apache.ambari.server.state.alert.MetricSource metricSource1 = new org.apache.ambari.server.state.alert.MetricSource();
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization2 = org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MODIFY_CONFIGS;
        boolean b3 = metricSource1.equals((java.lang.Object) roleAuthorization2);
        org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity4 = null;
        try {
            org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity5 = alertDefinitionFactory0.mergeSource((org.apache.ambari.server.state.alert.Source) metricSource1, alertDefinitionEntity4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + roleAuthorization2 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MODIFY_CONFIGS + "'", roleAuthorization2.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.CLUSTER_MODIFY_CONFIGS));
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test465");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ServiceResourceProvider.SERVICE_DESIRED_STACK_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ServiceInfo/desired_stack" + "'", str0.equals("ServiceInfo/desired_stack"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test466");
        org.apache.ambari.server.topology.validators.TopologyValidatorFactory topologyValidatorFactory0 = new org.apache.ambari.server.topology.validators.TopologyValidatorFactory();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test467");
        org.apache.ambari.server.security.InternalSSLSocketFactoryTrusting internalSSLSocketFactoryTrusting0 = new org.apache.ambari.server.security.InternalSSLSocketFactoryTrusting();
        java.net.InetAddress inetAddress3 = null;
        try {
            java.net.Socket socket5 = internalSSLSocketFactoryTrusting0.createSocket("Counter:CacheHits", (int) 'a', inetAddress3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.BindException");
        } catch (java.net.BindException e) {
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test468");
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity0 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Long long1 = requestOperationLevelEntity0._persistence_get_operationLevelId();
        org.apache.ambari.server.orm.entities.PrivilegeEntity privilegeEntity2 = new org.apache.ambari.server.orm.entities.PrivilegeEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity0);
        org.apache.ambari.server.state.HostState hostState3 = org.apache.ambari.server.state.HostState.HEALTHY;
        privilegeEntity2._persistence_setId((java.lang.Object) hostState3);
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks5 = privilegeEntity2._persistence_getLinks();
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + hostState3 + "' != '" + org.apache.ambari.server.state.HostState.HEALTHY + "'", hostState3.equals(org.apache.ambari.server.state.HostState.HEALTHY));
        org.junit.Assert.assertNull(itemLinks5);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test469");
        org.apache.hadoop.metrics2.sink.timeline.TimelineMetric timelineMetric0 = null;
        try {
            org.apache.ambari.server.controller.metrics.MetricsDownsamplingMethod metricsDownsamplingMethod1 = org.apache.ambari.server.controller.metrics.MetricsDownsamplingMethodFactory.detectDownsamplingMethod(timelineMetric0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test470");
        org.apache.ambari.server.controller.ivory.Cluster.Interface interface3 = new org.apache.ambari.server.controller.ivory.Cluster.Interface("", "AlertNotice/target_id", "validate_config");
        java.lang.String str4 = interface3.getType();
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str5 = org.apache.ambari.server.configuration.Configuration.KSTR_NAME;
        boolean b6 = interface3.equals((java.lang.Object) configurationproperty_str5);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(configurationproperty_str5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test471");
        org.apache.ambari.server.serveraction.kerberos.IPAKerberosOperationHandler iPAKerberosOperationHandler0 = new org.apache.ambari.server.serveraction.kerberos.IPAKerberosOperationHandler();
        try {
            boolean b3 = iPAKerberosOperationHandler0.principalExists("STARTED", false);
            org.junit.Assert.fail("Expected exception of type org.apache.ambari.server.serveraction.kerberos.KerberosOperationException");
        } catch (org.apache.ambari.server.serveraction.kerberos.KerberosOperationException e) {
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test472");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        requestResourceFilterEntity0._persistence_set_componentName("javax.net.ssl.trustStorePassword");
        requestResourceFilterEntity0._persistence_checkFetched("host_id");
        java.util.List list5 = requestResourceFilterEntity0._persistence_getRelationships();
        org.junit.Assert.assertNull(list5);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test473");
        org.apache.ambari.server.orm.entities.ResourceEntity resourceEntity0 = new org.apache.ambari.server.orm.entities.ResourceEntity();
        resourceEntity0._persistence_setShouldRefreshFetchGroup(true);
        java.lang.Object obj3 = resourceEntity0._persistence_post_clone();
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test474");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.UpgradeItemResourceProvider.UPGRADE_ITEM_TEXT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeItem/text" + "'", str0.equals("UpgradeItem/text"));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test475");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.CLIENT_API_SSL_CRT_PASS;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test476");
        org.apache.ambari.server.controller.internal.UpgradeResourceProvider.ConfigurationPackBuilder configurationPackBuilder0 = new org.apache.ambari.server.controller.internal.UpgradeResourceProvider.ConfigurationPackBuilder();
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test477");
        org.apache.ambari.server.stack.ConfigurationInfo.Supports supports0 = org.apache.ambari.server.stack.ConfigurationInfo.Supports.ADDING_FORBIDDEN;
        java.lang.String str1 = supports0.getDefaultValue();
        org.junit.Assert.assertTrue("'" + supports0 + "' != '" + org.apache.ambari.server.stack.ConfigurationInfo.Supports.ADDING_FORBIDDEN + "'", supports0.equals(org.apache.ambari.server.stack.ConfigurationInfo.Supports.ADDING_FORBIDDEN));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false" + "'", str1.equals("false"));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test478");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = null;
        org.apache.ambari.server.checks.CheckDescription.LZO_CONFIG_CHECK = checkDescription0;
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test479");
        org.apache.ambari.server.state.repository.StackPackage stackPackage0 = new org.apache.ambari.server.state.repository.StackPackage();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test480");
        org.apache.ambari.server.state.stack.UpgradePack upgradePack0 = new org.apache.ambari.server.state.stack.UpgradePack();
        java.lang.String str1 = upgradePack0.getTarget();
        java.lang.String str2 = upgradePack0.getTarget();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.apache.ambari.server.state.stack.UpgradePack.ProcessingComponent>> map_str_map_str_processingComponent3 = upgradePack0.getTasks();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(map_str_map_str_processingComponent3);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test481");
        org.apache.ambari.server.controller.spi.ClusterController clusterController0 = org.apache.ambari.server.controller.utilities.ClusterControllerHelper.getClusterController();
        org.junit.Assert.assertNotNull(clusterController0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test482");
        org.apache.ambari.server.security.InternalSSLSocketFactoryTrusting internalSSLSocketFactoryTrusting0 = new org.apache.ambari.server.security.InternalSSLSocketFactoryTrusting();
        java.net.Socket socket1 = null;
        try {
            java.net.Socket socket5 = internalSSLSocketFactoryTrusting0.createSocket(socket1, "ServiceInfo/service_name", (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test483");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.SERVER_JDBC_USER_PASSWD;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test484");
        org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
        org.apache.ambari.server.api.resources.ViewExternalSubResourceDefinition viewExternalSubResourceDefinition1 = new org.apache.ambari.server.api.resources.ViewExternalSubResourceDefinition(type0);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test485");
        org.apache.ambari.server.security.AmbariViewsSecurityHeaderFilter ambariViewsSecurityHeaderFilter0 = new org.apache.ambari.server.security.AmbariViewsSecurityHeaderFilter();
        javax.servlet.ServletRequest servletRequest1 = null;
        javax.servlet.ServletResponse servletResponse2 = null;
        javax.servlet.FilterChain filterChain3 = null;
        try {
            ambariViewsSecurityHeaderFilter0.doFilter(servletRequest1, servletResponse2, filterChain3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test486");
        org.apache.ambari.server.state.stack.RepositoryXml repositoryXml0 = new org.apache.ambari.server.state.stack.RepositoryXml();
        repositoryXml0.addError("ViewInstanceInfo/icon_path");
        boolean b3 = repositoryXml0.isValid();
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test487");
        java.lang.String str0 = org.eclipse.persistence.logging.SessionLog.ALL_LABEL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ALL" + "'", str0.equals("ALL"));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test488");
        org.apache.ambari.server.state.theme.Layout layout0 = new org.apache.ambari.server.state.theme.Layout();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test489");
        org.apache.ambari.server.api.resources.ViewVersionResourceDefinition viewVersionResourceDefinition0 = new org.apache.ambari.server.api.resources.ViewVersionResourceDefinition();
        org.apache.ambari.server.controller.AmbariManagementController ambariManagementController1 = null;
        org.apache.ambari.server.controller.internal.LoggingResourceProvider loggingResourceProvider2 = new org.apache.ambari.server.controller.internal.LoggingResourceProvider(ambariManagementController1);
        java.lang.String[] str_array20 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str21, str_array20);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str21;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str21;
        java.util.Set<java.lang.String> set_str25 = loggingResourceProvider2.checkPropertyIds((java.util.Set<java.lang.String>) linkedhashset_str21);
        org.apache.ambari.server.api.query.QueryInfo queryInfo26 = new org.apache.ambari.server.api.query.QueryInfo((org.apache.ambari.server.api.resources.ResourceDefinition) viewVersionResourceDefinition0, set_str25);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set_str25);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test490");
        org.apache.ambari.server.configuration.Configuration configuration0 = null;
        try {
            org.apache.ambari.server.controller.metrics.ThreadPoolEnabledPropertyProvider.init(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test491");
        org.apache.ambari.server.state.HostState hostState0 = org.apache.ambari.server.state.HostState.UNHEALTHY;
        org.junit.Assert.assertTrue("'" + hostState0 + "' != '" + org.apache.ambari.server.state.HostState.UNHEALTHY + "'", hostState0.equals(org.apache.ambari.server.state.HostState.UNHEALTHY));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test492");
        org.apache.ambari.server.state.stack.upgrade.StopGrouping stopGrouping0 = new org.apache.ambari.server.state.stack.upgrade.StopGrouping();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test493");
        org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService[] affectedService_array0 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService[] {};
        java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService> arraylist_affectedService1 = new java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService>) arraylist_affectedService1, affectedService_array0);
        org.apache.ambari.server.state.stack.ConfigUpgradePack configUpgradePack3 = new org.apache.ambari.server.state.stack.ConfigUpgradePack((java.util.List<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService>) arraylist_affectedService1);
        java.util.List<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService> list_affectedService4 = configUpgradePack3.services;
        org.junit.Assert.assertNotNull(affectedService_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_affectedService4);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test494");
        org.apache.ambari.server.orm.dao.AlertSummaryDTO alertSummaryDTO5 = new org.apache.ambari.server.orm.dao.AlertSummaryDTO((java.lang.Number) 0.0d, (java.lang.Number) (short) -1, (java.lang.Number) 100.0d, (java.lang.Number) 1L, (java.lang.Number) (-1.0d));
        int i6 = alertSummaryDTO5.getCriticalCount();
        org.junit.Assert.assertTrue(i6 == 100);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test495");
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity0 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        viewResourceEntity0._persistence_set_pluralName("servicecomponent_history");
        viewResourceEntity0._persistence_set_service("AlertGroup/default");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test496");
        org.apache.ambari.server.orm.entities.StackEntity stackEntity0 = null;
        org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity4 = new org.apache.ambari.server.orm.entities.RepositoryVersionEntity(stackEntity0, "AlertTarget/alert_states", "Hosts/*", "Repositories/repository_version_id");
        org.apache.ambari.server.state.StackId stackId5 = repositoryVersionEntity4.getStackId();
        org.junit.Assert.assertNull(stackId5);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test497");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.JWT_PUBLIC;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test498");
        org.apache.ambari.server.view.configuration.ViewConfig viewConfig0 = new org.apache.ambari.server.view.configuration.ViewConfig();
        java.lang.String str1 = viewConfig0.getVersion();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test499");
        java.lang.String[] str_array17 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str18, str_array17);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str18;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str18;
        org.apache.ambari.server.controller.spi.TemporalInfo temporalInfo23 = null;
        org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey timelineAppMetricCacheKey24 = new org.apache.ambari.server.controller.metrics.timeline.cache.TimelineAppMetricCacheKey((java.util.Set<java.lang.String>) linkedhashset_str18, "name", temporalInfo23);
        org.apache.ambari.server.controller.spi.TemporalInfo temporalInfo25 = null;
        timelineAppMetricCacheKey24.setTemporalInfo(temporalInfo25);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test500");
        org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO0 = new org.apache.ambari.server.orm.dao.HostComponentStateDAO();
        org.apache.ambari.server.orm.entities.HostComponentStateEntity hostComponentStateEntity1 = null;
        try {
            hostComponentStateDAO0.refresh(hostComponentStateEntity1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}
