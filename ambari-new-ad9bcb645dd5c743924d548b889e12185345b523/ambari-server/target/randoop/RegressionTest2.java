import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        org.apache.ambari.server.audit.request.eventcreator.ViewPrivilegeEventCreator viewPrivilegeEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.ViewPrivilegeEventCreator();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.builder();
        org.apache.ambari.server.audit.event.request.ChangeAlertGroupRequestAuditEvent.ChangeAlertGroupRequestAuditEventBuilder changeAlertGroupRequestAuditEventBuilder2 = changeAlertGroupRequestAuditEventBuilder0.withTimestamp((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder0);
        org.junit.Assert.assertNotNull(changeAlertGroupRequestAuditEventBuilder2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        org.apache.ambari.server.orm.entities.HostEntity_ hostEntity_0 = new org.apache.ambari.server.orm.entities.HostEntity_();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        org.apache.ambari.server.orm.dao.PrincipalTypeDAO principalTypeDAO0 = new org.apache.ambari.server.orm.dao.PrincipalTypeDAO();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity0 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Long long1 = requestOperationLevelEntity0._persistence_get_operationLevelId();
        org.apache.ambari.server.orm.entities.PrivilegeEntity privilegeEntity2 = new org.apache.ambari.server.orm.entities.PrivilegeEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity0);
        java.lang.Object obj3 = privilegeEntity2._persistence_getId();
        org.apache.ambari.server.orm.entities.ResourceEntity resourceEntity4 = new org.apache.ambari.server.orm.entities.ResourceEntity();
        privilegeEntity2._persistence_set_resource(resourceEntity4);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        int i0 = org.apache.ambari.server.api.predicate.operators.Operator.MAX_OP_PRECEDENCE;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
        org.apache.ambari.server.controller.internal.ActionResourceProvider actionResourceProvider1 = new org.apache.ambari.server.controller.internal.ActionResourceProvider(ambariManagementController0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
        org.apache.ambari.server.api.resources.RootServiceHostComponentResourceDefinition rootServiceHostComponentResourceDefinition1 = new org.apache.ambari.server.api.resources.RootServiceHostComponentResourceDefinition(type0);
        java.lang.String str2 = rootServiceHostComponentResourceDefinition1.getSingularName();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hostComponent" + "'", str2.equals("hostComponent"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.VIEWS_HTTP_CACHE_CONTROL_HEADER_VALUE;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        org.apache.ambari.view.migration.ViewDataMigrationContext viewDataMigrationContext0 = null;
        org.apache.ambari.server.view.ViewDataMigrationUtility.CopyAllDataMigrator copyAllDataMigrator1 = new org.apache.ambari.server.view.ViewDataMigrationUtility.CopyAllDataMigrator(viewDataMigrationContext0);
        try {
            copyAllDataMigrator1.migrateInstanceData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        org.apache.ambari.server.orm.entities.BlueprintConfigEntity blueprintConfigEntity0 = new org.apache.ambari.server.orm.entities.BlueprintConfigEntity();
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
        blueprintConfigEntity0._persistence_setRelationships((java.util.List) arraylist_file7);
        blueprintConfigEntity0._persistence_set_configAttributes("RepositoryVersions/stack_services");
        org.junit.Assert.assertNotNull(file_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set_str33);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackLevelConfigurationResourceProvider.PROPERTY_DESCRIPTION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackLevelConfigurations/property_description" + "'", str0.equals("StackLevelConfigurations/property_description"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionResourceProvider.EXTENSION_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Extensions/extension_name" + "'", str0.equals("Extensions/extension_name"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        org.apache.ambari.server.controller.utilities.state.HDFSServiceCalculatedState hDFSServiceCalculatedState0 = new org.apache.ambari.server.controller.utilities.state.HDFSServiceCalculatedState();
        org.apache.ambari.server.state.State state3 = hDFSServiceCalculatedState0.getState("entries_editable", "id");
        org.apache.ambari.server.controller.utilities.state.HDFSServiceCalculatedState hDFSServiceCalculatedState4 = new org.apache.ambari.server.controller.utilities.state.HDFSServiceCalculatedState();
        org.apache.ambari.server.state.State state7 = hDFSServiceCalculatedState4.getState("entries_editable", "id");
        boolean b8 = org.apache.ambari.server.state.State.isValidStateTransition(state3, state7);
        org.junit.Assert.assertTrue("'" + state3 + "' != '" + org.apache.ambari.server.state.State.UNKNOWN + "'", state3.equals(org.apache.ambari.server.state.State.UNKNOWN));
        org.junit.Assert.assertTrue("'" + state7 + "' != '" + org.apache.ambari.server.state.State.UNKNOWN + "'", state7.equals(org.apache.ambari.server.state.State.UNKNOWN));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        org.apache.ambari.server.orm.entities.RoleAuthorizationEntity roleAuthorizationEntity0 = new org.apache.ambari.server.orm.entities.RoleAuthorizationEntity();
        roleAuthorizationEntity0.setAuthorizationId("validate_config");
        java.lang.Object obj3 = roleAuthorizationEntity0._persistence_post_clone();
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity4 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        java.lang.String str5 = viewResourceEntity4.getProvider();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks6 = null;
        viewResourceEntity4._persistence_setLinks(itemLinks6);
        org.apache.ambari.server.orm.entities.ViewEntity viewEntity8 = null;
        viewResourceEntity4._persistence_set_view(viewEntity8);
        java.lang.Object obj10 = roleAuthorizationEntity0._persistence_new((org.eclipse.persistence.internal.descriptors.PersistenceObject) viewEntity8);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        serviceConfigEntity0._persistence_set_serviceConfigId((java.lang.Long) 1L);
        org.apache.ambari.server.orm.entities.RoleAuthorizationEntity roleAuthorizationEntity3 = new org.apache.ambari.server.orm.entities.RoleAuthorizationEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) serviceConfigEntity0);
        org.eclipse.persistence.queries.FetchGroup fetchGroup4 = null;
        roleAuthorizationEntity3._persistence_setFetchGroup(fetchGroup4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        requestResourceFilterEntity0._persistence_set_componentName("javax.net.ssl.trustStorePassword");
        requestResourceFilterEntity0._persistence_checkFetched("host_id");
        java.lang.Long long5 = requestResourceFilterEntity0.getFilterId();
        org.apache.ambari.server.orm.entities.GroupEntity groupEntity6 = new org.apache.ambari.server.orm.entities.GroupEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestResourceFilterEntity0);
        java.lang.Integer i7 = groupEntity6.getGroupId();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks8 = null;
        groupEntity6._persistence_setLinks(itemLinks8);
        boolean b10 = groupEntity6._persistence_shouldRefreshFetchGroup();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        org.apache.ambari.server.orm.dao.DaoUtils daoUtils0 = new org.apache.ambari.server.orm.dao.DaoUtils();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_UPGRADE_STATE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/upgrade_state" + "'", str0.equals("HostRoles/upgrade_state"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        requestResourceFilterEntity0._persistence_set_componentName("javax.net.ssl.trustStorePassword");
        requestResourceFilterEntity0._persistence_checkFetched("host_id");
        org.apache.ambari.server.orm.entities.ViewParameterEntity viewParameterEntity5 = new org.apache.ambari.server.orm.entities.ViewParameterEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestResourceFilterEntity0);
        org.apache.ambari.server.api.resources.ServiceConfigVersionResourceDefinition serviceConfigVersionResourceDefinition6 = new org.apache.ambari.server.api.resources.ServiceConfigVersionResourceDefinition();
        java.util.Collection<java.lang.String> collection_str7 = serviceConfigVersionResourceDefinition6.getReadDirectives();
        requestResourceFilterEntity0._persistence_setId((java.lang.Object) serviceConfigVersionResourceDefinition6);
        org.junit.Assert.assertNotNull(collection_str7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        org.apache.ambari.server.orm.entities.RemoteAmbariClusterEntity remoteAmbariClusterEntity0 = new org.apache.ambari.server.orm.entities.RemoteAmbariClusterEntity();
        org.eclipse.persistence.queries.FetchGroup fetchGroup1 = null;
        remoteAmbariClusterEntity0._persistence_setFetchGroup(fetchGroup1);
        remoteAmbariClusterEntity0._persistence_set_password("Counter:UnitOfWorkCreates");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        requestResourceFilterEntity0._persistence_set_componentName("javax.net.ssl.trustStorePassword");
        requestResourceFilterEntity0._persistence_checkFetched("host_id");
        java.lang.Long long5 = requestResourceFilterEntity0.getFilterId();
        org.apache.ambari.server.orm.entities.GroupEntity groupEntity6 = new org.apache.ambari.server.orm.entities.GroupEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestResourceFilterEntity0);
        java.lang.Integer i7 = groupEntity6.getGroupId();
        java.lang.Object obj8 = groupEntity6._persistence_post_clone();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_REASON_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/reason" + "'", str0.equals("UpgradeChecks/reason"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackVersionResourceProvider.STACK_ACTIVE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Versions/active" + "'", str0.equals("Versions/active"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.REPOSITORY_VERSION_STACK_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RepositoryVersions/stack_name" + "'", str0.equals("RepositoryVersions/stack_name"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        org.apache.ambari.server.controller.spi.Resource[] resource_array0 = new org.apache.ambari.server.controller.spi.Resource[] {};
        java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource> linkedhashset_resource1 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.Resource>) linkedhashset_resource1, resource_array0);
        org.apache.ambari.server.controller.internal.QueryResponseImpl queryResponseImpl6 = new org.apache.ambari.server.controller.internal.QueryResponseImpl((java.util.Set<org.apache.ambari.server.controller.spi.Resource>) linkedhashset_resource1, true, true, (int) (byte) 1);
        boolean b7 = queryResponseImpl6.isPagedResponse();
        org.junit.Assert.assertNotNull(resource_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        org.apache.ambari.server.api.query.render.MinimalRenderer minimalRenderer0 = new org.apache.ambari.server.api.query.render.MinimalRenderer();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        org.apache.ambari.server.state.ServiceComponentHostEventType serviceComponentHostEventType0 = org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_SERVER_ACTION;
        org.junit.Assert.assertTrue("'" + serviceComponentHostEventType0 + "' != '" + org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_SERVER_ACTION + "'", serviceComponentHostEventType0.equals(org.apache.ambari.server.state.ServiceComponentHostEventType.HOST_SVCCOMP_SERVER_ACTION));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning0 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
        java.util.Set<java.lang.String> set_str1 = hiveNotRollingWarning0.getApplicableServices();
        org.apache.ambari.server.checks.CheckDescription checkDescription2 = hiveNotRollingWarning0.getDescription();
        org.apache.ambari.server.checks.CheckDescription.VALID_SERVICES_INCLUDED_IN_REPOSITORY = checkDescription2;
        org.apache.ambari.server.checks.CheckDescription.AUTO_START_DISABLED = checkDescription2;
        org.junit.Assert.assertNotNull(set_str1);
        org.junit.Assert.assertNotNull(checkDescription2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.UserAuthorizationResourceProvider.AUTHORIZATION_VIEW_INSTANCE_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "AuthorizationInfo/view_instance_name" + "'", str0.equals("AuthorizationInfo/view_instance_name"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.Object obj2 = serviceConfigEntity0._persistence_get("jce_name");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity4 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        serviceConfigEntity0._persistence_propertyChange("Repositories/repository_version_id", (java.lang.Object) clusterConfigEntity4, (java.lang.Object) 10);
        org.apache.ambari.server.orm.entities.StackEntity stackEntity7 = null;
        clusterConfigEntity4.setStack(stackEntity7);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        java.util.concurrent.TimeUnit timeUnit3 = null;
        java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingqueue_runnable4 = null;
        try {
            org.apache.ambari.server.utils.ManagedThreadPoolExecutor managedThreadPoolExecutor5 = new org.apache.ambari.server.utils.ManagedThreadPoolExecutor((int) (byte) 100, 3, (long) 20, timeUnit3, blockingqueue_runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        org.apache.ambari.server.api.services.ServiceService serviceService1 = new org.apache.ambari.server.api.services.ServiceService("configure-task-insertions");
        javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
        org.apache.ambari.server.api.services.LocalUriInfo localUriInfo5 = new org.apache.ambari.server.api.services.LocalUriInfo("commands_to_retry");
        try {
            javax.ws.rs.core.Response response7 = serviceService1.updateArtifacts("RAW_REQUEST_BODY", httpHeaders3, (javax.ws.rs.core.UriInfo) localUriInfo5, "WidgetLayouts");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.Object obj2 = serviceConfigEntity0._persistence_get("jce_name");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity4 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        serviceConfigEntity0._persistence_propertyChange("Repositories/repository_version_id", (java.lang.Object) clusterConfigEntity4, (java.lang.Object) 10);
        org.apache.ambari.server.orm.entities.HostGroupConfigEntity hostGroupConfigEntity7 = new org.apache.ambari.server.orm.entities.HostGroupConfigEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) clusterConfigEntity4);
        hostGroupConfigEntity7.setConfigAttributes("ambari_java_version");
        org.eclipse.persistence.internal.identitymaps.CacheKey cacheKey10 = hostGroupConfigEntity7._persistence_getCacheKey();
        hostGroupConfigEntity7.setConfigData("Counter:CacheHits");
        java.util.List list13 = hostGroupConfigEntity7._persistence_getRelationships();
        java.beans.PropertyChangeListener propertyChangeListener14 = hostGroupConfigEntity7._persistence_getPropertyChangeListener();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(cacheKey10);
        org.junit.Assert.assertNull(list13);
        org.junit.Assert.assertNull(propertyChangeListener14);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        org.apache.ambari.server.agent.AgentEnv agentEnv0 = new org.apache.ambari.server.agent.AgentEnv();
        org.apache.ambari.server.agent.AgentEnv.Directory directory1 = null;
        org.apache.ambari.server.agent.AgentEnv.Directory[] directory_array2 = new org.apache.ambari.server.agent.AgentEnv.Directory[] { directory1 };
        agentEnv0.setStackFoldersAndFiles(directory_array2);
        org.junit.Assert.assertNotNull(directory_array2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        org.apache.ambari.server.agent.DiskInfo diskInfo0 = new org.apache.ambari.server.agent.DiskInfo();
        java.lang.String str1 = diskInfo0.getAvailable();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
        org.apache.ambari.server.api.resources.RootServiceHostComponentResourceDefinition rootServiceHostComponentResourceDefinition1 = new org.apache.ambari.server.api.resources.RootServiceHostComponentResourceDefinition(type0);
        java.util.List<org.apache.ambari.server.api.resources.ResourceDefinition.PostProcessor> list_postProcessor2 = rootServiceHostComponentResourceDefinition1.getPostProcessors();
        org.junit.Assert.assertNotNull(list_postProcessor2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        org.apache.ambari.server.hooks.users.PostUserCreationHookContext postUserCreationHookContext1 = new org.apache.ambari.server.hooks.users.PostUserCreationHookContext("Upgrade/fail_on_check_warnings");
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> map_str_set_str2 = postUserCreationHookContext1.getUserGroups();
        org.junit.Assert.assertNotNull(map_str_set_str2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        org.apache.ambari.server.security.authorization.PamAuthenticationException pamAuthenticationException2 = new org.apache.ambari.server.security.authorization.PamAuthenticationException("SET_KEYTAB");
        org.springframework.security.core.Authentication authentication3 = null;
        pamAuthenticationException2.setAuthentication(authentication3);
        org.apache.ambari.server.view.IllegalClusterException illegalClusterException5 = new org.apache.ambari.server.view.IllegalClusterException("PrivilegeInfo/privilege_id", (java.lang.Throwable) pamAuthenticationException2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        org.apache.ambari.server.orm.entities.AlertGroupEntity alertGroupEntity0 = new org.apache.ambari.server.orm.entities.AlertGroupEntity();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        java.lang.String str0 = org.apache.hadoop.metrics2.sink.timeline.AbstractTimelineMetricsSink.HOST_IN_MEMORY_AGGREGATION_PORT_PROPERTY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "host_in_memory_aggregation_port" + "'", str0.equals("host_in_memory_aggregation_port"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        java.lang.String str0 = org.eclipse.persistence.logging.SessionLog.SERVER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "server" + "'", str0.equals("server"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        org.apache.ambari.server.audit.AuditLoggerModule auditLoggerModule0 = new org.apache.ambari.server.audit.AuditLoggerModule();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.builder();
        org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder2 = addComponentToHostRequestAuditEventBuilder0.withTimestamp((java.lang.Long) 100L);
        org.apache.ambari.server.audit.event.request.AddComponentToHostRequestAuditEvent.AddComponentToHostRequestAuditEventBuilder addComponentToHostRequestAuditEventBuilder4 = addComponentToHostRequestAuditEventBuilder0.withOperation("configs.dat");
        org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder0);
        org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder2);
        org.junit.Assert.assertNotNull(addComponentToHostRequestAuditEventBuilder4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        org.apache.ambari.server.orm.entities.StackEntity stackEntity1 = null;
        serviceConfigEntity0._persistence_set_stack(stackEntity1);
        serviceConfigEntity0._persistence_set_version((java.lang.Long) 10L);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
        org.apache.ambari.server.controller.utilities.StreamProvider streamProvider1 = null;
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
        java.lang.String str18 = defaultProviderModule3.getJMXRpcMetricTag("tagsForPrefix.", "is_current", "ALTER TABLE Event/summary/users/updated DROP COLUMN /api/v1/views/*");
        try {
            org.apache.ambari.server.controller.metrics.ganglia.GangliaReportPropertyProvider gangliaReportPropertyProvider20 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaReportPropertyProvider(map_str_map_str_propertyInfo0, streamProvider1, componentSSLConfiguration2, (org.apache.ambari.server.controller.metrics.MetricHostProvider) defaultProviderModule3, "update_timestamp");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete + "'", type5.equals(org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete));
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array3 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {};
        java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter4 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>) arraylist_requestResourceFilter4, requestResourceFilter_array3);
        org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel6 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> map_str_map_str_map_str_str13 = null;
        java.io.File[] file_array14 = new java.io.File[] {};
        java.util.ArrayList<java.io.File> arraylist_file15 = new java.util.ArrayList<java.io.File>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<java.io.File>) arraylist_file15, file_array14);
        java.lang.String[] str_array34 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str35, str_array34);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str35;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str35;
        org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning40 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
        java.util.Set<java.lang.String> set_str41 = hiveNotRollingWarning40.getApplicableServices();
        org.apache.ambari.server.controller.StackVersionResponse stackVersionResponse44 = new org.apache.ambari.server.controller.StackVersionResponse("RootServiceComponents/component_name", "ServiceInfo/service_name", true, "request_id", map_str_map_str_map_str_str13, (java.util.Collection<java.io.File>) arraylist_file15, (java.util.Set<java.lang.String>) linkedhashset_str35, false, (java.util.Collection<java.lang.String>) set_str41, "AlertNotice/target_id", "Request body for Blueprint create request is empty");
        java.util.Map<java.lang.String, java.lang.String> map_str_str45 = null;
        org.apache.ambari.server.state.stack.upgrade.Task[] task_array46 = new org.apache.ambari.server.state.stack.upgrade.Task[] {};
        org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper47 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("name", "Users/groups", (java.util.Set<java.lang.String>) linkedhashset_str35, map_str_str45, task_array46);
        java.util.Map<java.lang.String, java.lang.String> map_str_str48 = taskWrapper47.getParams();
        org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest50 = new org.apache.ambari.server.controller.ExecuteActionRequest("Upgrade/versions", "host_id", "read_only", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>) arraylist_requestResourceFilter4, requestOperationLevel6, map_str_str48, true);
        java.lang.String str51 = executeActionRequest50.getClusterName();
        java.lang.String str52 = executeActionRequest50.toString();
        org.junit.Assert.assertNotNull(requestResourceFilter_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(file_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(str_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set_str41);
        org.junit.Assert.assertNotNull(task_array46);
        org.junit.Assert.assertNotNull(map_str_str48);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Upgrade/versions" + "'", str51.equals("Upgrade/versions"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "isCommand :false, action :read_only, command :host_id, inputs :{}, resourceFilters: [], exclusive: true, clusterName :Upgrade/versions" + "'", str52.equals("isCommand :false, action :read_only, command :host_id, inputs :{}, resourceFilters: [], exclusive: true, clusterName :Upgrade/versions"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        javax.ws.rs.core.HttpHeaders httpHeaders0 = null;
        org.apache.ambari.server.api.services.RequestBody requestBody1 = null;
        javax.ws.rs.core.UriInfo uriInfo2 = null;
        org.apache.ambari.server.api.resources.ResourceInstance resourceInstance3 = null;
        org.apache.ambari.server.api.services.DeleteRequest deleteRequest4 = new org.apache.ambari.server.api.services.DeleteRequest(httpHeaders0, requestBody1, uriInfo2, resourceInstance3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity0 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Long long1 = requestOperationLevelEntity0._persistence_get_operationLevelId();
        org.apache.ambari.server.orm.entities.PrivilegeEntity privilegeEntity2 = new org.apache.ambari.server.orm.entities.PrivilegeEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity0);
        org.apache.ambari.server.state.HostState hostState3 = org.apache.ambari.server.state.HostState.HEALTHY;
        privilegeEntity2._persistence_setId((java.lang.Object) hostState3);
        java.util.List list5 = privilegeEntity2._persistence_getRelationships();
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity6 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) privilegeEntity2);
        serviceConfigEntity6._persistence_checkFetchedForSet("RequestInfo");
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertTrue("'" + hostState3 + "' != '" + org.apache.ambari.server.state.HostState.HEALTHY + "'", hostState3.equals(org.apache.ambari.server.state.HostState.HEALTHY));
        org.junit.Assert.assertNull(list5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        java.lang.String str0 = org.eclipse.persistence.sessions.SessionProfiler.RemoteMetadata;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Timer:RemoteMetadata" + "'", str0.equals("Timer:RemoteMetadata"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        org.apache.ambari.server.topology.TopologyRequest topologyRequest1 = null;
        org.apache.ambari.server.topology.ClusterTopology clusterTopology2 = null;
        try {
            org.apache.ambari.server.topology.LogicalRequest logicalRequest3 = new org.apache.ambari.server.topology.LogicalRequest((java.lang.Long) 0L, topologyRequest1, clusterTopology2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.GANGLIA_MONITOR;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder addCredentialAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.builder();
        org.junit.Assert.assertNotNull(addCredentialAuditEventBuilder0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.apache.ambari.server.controller.internal.PropertyInfo>> map_str_map_str_propertyInfo0 = null;
        org.apache.ambari.server.controller.utilities.StreamProvider streamProvider1 = null;
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
            org.apache.ambari.server.controller.metrics.ganglia.GangliaReportPropertyProvider gangliaReportPropertyProvider16 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaReportPropertyProvider(map_str_map_str_propertyInfo0, streamProvider1, componentSSLConfiguration2, (org.apache.ambari.server.controller.metrics.MetricHostProvider) defaultProviderModule3, "version");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete + "'", type5.equals(org.apache.ambari.server.controller.internal.ResourceProviderEvent.Type.Delete));
        org.junit.Assert.assertNotNull(request11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        com.google.gson.Gson gson0 = null;
        org.apache.ambari.server.configuration.Configuration configuration1 = null;
        org.apache.ambari.server.api.AmbariErrorHandler ambariErrorHandler2 = new org.apache.ambari.server.api.AmbariErrorHandler(gson0, configuration1);
        ambariErrorHandler2.stop();
        java.lang.String str4 = org.eclipse.jetty.util.component.AggregateLifeCycle.dump((org.eclipse.jetty.util.component.Dumpable) ambariErrorHandler2);
        boolean b5 = ambariErrorHandler2.isRunning();
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        org.apache.ambari.server.orm.entities.StackEntity stackEntity0 = null;
        org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity4 = new org.apache.ambari.server.orm.entities.RepositoryVersionEntity(stackEntity0, "AlertTarget/alert_states", "Hosts/*", "Repositories/repository_version_id");
        java.lang.String str5 = repositoryVersionEntity4.toString();
        boolean b7 = repositoryVersionEntity4._persistence_isAttributeFetched("host_group");
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "RepositoryVersionEntity{id=null, stack=null, version=AlertTarget/alert_states, type=STANDARD, hidden=false}" + "'", str5.equals("RepositoryVersionEntity{id=null, stack=null, version=AlertTarget/alert_states, type=STANDARD, hidden=false}"));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.AddBlueprintRequestAuditEventBuilder addBlueprintRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.AddBlueprintRequestAuditEvent.builder();
        org.junit.Assert.assertNotNull(addBlueprintRequestAuditEventBuilder0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        java.util.Map<java.lang.String, java.lang.String> map_str_str0 = org.apache.ambari.server.controller.AmbariCustomCommandExecutionHelper.masterToSlaveMappingForDecom;
        org.junit.Assert.assertNotNull(map_str_str0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        org.apache.ambari.server.checks.CheckDescription checkDescription0 = null;
        org.apache.ambari.server.checks.CheckDescription.SERVICE_PRESENCE_CHECK = checkDescription0;
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType syncType0 = org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType.SPECIFIC;
        java.util.Set<java.lang.String> set_str1 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.propertyIds;
        org.apache.ambari.server.controller.LdapSyncRequest ldapSyncRequest2 = new org.apache.ambari.server.controller.LdapSyncRequest(syncType0, set_str1);
        java.util.Set<java.lang.String> set_str3 = ldapSyncRequest2.getPrincipalNames();
        org.junit.Assert.assertTrue("'" + syncType0 + "' != '" + org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType.SPECIFIC + "'", syncType0.equals(org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.SyncType.SPECIFIC));
        org.junit.Assert.assertNotNull(set_str1);
        org.junit.Assert.assertNotNull(set_str3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteChecks prerequisiteChecks0 = new org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteChecks();
        org.apache.ambari.server.state.stack.UpgradePack.PrerequisiteCheckConfig prerequisiteCheckConfig1 = null;
        prerequisiteChecks0.configuration = prerequisiteCheckConfig1;
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        requestResourceFilterEntity0._persistence_set_componentName("javax.net.ssl.trustStorePassword");
        requestResourceFilterEntity0._persistence_checkFetched("host_id");
        org.apache.ambari.server.orm.entities.ViewParameterEntity viewParameterEntity5 = new org.apache.ambari.server.orm.entities.ViewParameterEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestResourceFilterEntity0);
        java.lang.Object obj6 = viewParameterEntity5._persistence_post_clone();
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        org.apache.ambari.server.api.services.InstanceService instanceService1 = new org.apache.ambari.server.api.services.InstanceService("SET_KEYTAB");
        javax.ws.rs.core.HttpHeaders httpHeaders3 = null;
        org.apache.ambari.server.api.services.LocalUriInfo localUriInfo5 = new org.apache.ambari.server.api.services.LocalUriInfo("commands_to_retry");
        try {
            javax.ws.rs.core.Response response7 = instanceService1.getInstance("is_current", httpHeaders3, (javax.ws.rs.core.UriInfo) localUriInfo5, "slave_type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.PrivilegeResourceProvider.PERMISSION_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PrivilegeInfo/permission_name" + "'", str0.equals("PrivilegeInfo/permission_name"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        java.io.File file0 = null;
        org.apache.ambari.server.security.encryption.FileBasedCredentialStore fileBasedCredentialStore1 = new org.apache.ambari.server.security.encryption.FileBasedCredentialStore(file0);
        java.io.File file2 = fileBasedCredentialStore1.getKeyStorePath();
        org.apache.ambari.server.security.encryption.MasterKeyServiceImpl masterKeyServiceImpl3 = new org.apache.ambari.server.security.encryption.MasterKeyServiceImpl(file2);
        java.io.File file5 = null;
        org.apache.ambari.server.state.ServiceInfo.ServiceAdvisorType serviceAdvisorType7 = org.apache.ambari.server.state.ServiceInfo.ServiceAdvisorType.JAVA;
        org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRunner stackAdvisorRunner9 = null;
        org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo10 = null;
        org.apache.ambari.server.api.services.stackadvisor.commands.ComponentLayoutRecommendationCommand componentLayoutRecommendationCommand11 = new org.apache.ambari.server.api.services.stackadvisor.commands.ComponentLayoutRecommendationCommand(file5, "service_name", serviceAdvisorType7, (int) (byte) 0, stackAdvisorRunner9, ambariMetaInfo10);
        org.apache.ambari.server.api.services.stackadvisor.StackAdvisorRunner stackAdvisorRunner13 = null;
        org.apache.ambari.server.api.services.AmbariMetaInfo ambariMetaInfo14 = null;
        org.apache.ambari.server.api.services.stackadvisor.commands.ConfigurationRecommendationCommand configurationRecommendationCommand15 = new org.apache.ambari.server.api.services.stackadvisor.commands.ConfigurationRecommendationCommand(file2, "ViewInstanceInfo/instance_data", serviceAdvisorType7, 2, stackAdvisorRunner13, ambariMetaInfo14);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertTrue("'" + serviceAdvisorType7 + "' != '" + org.apache.ambari.server.state.ServiceInfo.ServiceAdvisorType.JAVA + "'", serviceAdvisorType7.equals(org.apache.ambari.server.state.ServiceInfo.ServiceAdvisorType.JAVA));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.RANGER_ADMIN;
        java.lang.String str1 = role0.name();
        org.junit.Assert.assertNotNull(role0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RANGER_ADMIN" + "'", str1.equals("RANGER_ADMIN"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.CLUSTER_ID_COLUMN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "cluster_id" + "'", str0.equals("cluster_id"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        java.lang.String str0 = org.apache.ambari.server.security.authorization.AuthorizationHelper.getAuthenticatedName();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.Object obj2 = serviceConfigEntity0._persistence_get("jce_name");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity4 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        serviceConfigEntity0._persistence_propertyChange("Repositories/repository_version_id", (java.lang.Object) clusterConfigEntity4, (java.lang.Object) 10);
        org.apache.ambari.server.orm.entities.HostGroupConfigEntity hostGroupConfigEntity7 = new org.apache.ambari.server.orm.entities.HostGroupConfigEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) clusterConfigEntity4);
        hostGroupConfigEntity7.setConfigAttributes("ambari_java_version");
        org.apache.ambari.server.orm.entities.HostGroupEntity hostGroupEntity10 = hostGroupConfigEntity7._persistence_get_hostGroup();
        java.lang.Object obj11 = hostGroupConfigEntity7._persistence_shallow_clone();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(hostGroupEntity10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        try {
            org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.PrincipalType principalType1 = org.apache.ambari.server.orm.entities.LdapSyncSpecEntity.PrincipalType.valueOfIgnoreCase("tag");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        java.lang.String str0 = org.apache.ambari.server.state.stack.upgrade.ServerSideActionTask.actionVerb;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Executing" + "'", str0.equals("Executing"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        org.apache.ambari.server.view.RemoteAmbariStreamProvider remoteAmbariStreamProvider7 = new org.apache.ambari.server.view.RemoteAmbariStreamProvider("Tasks/output_log", "component", "properties", (int) '#', (int) (byte) 10);
        org.apache.ambari.server.view.RemoteAmbariCluster remoteAmbariCluster8 = new org.apache.ambari.server.view.RemoteAmbariCluster("There is an existing {0} {1} {2} which has not completed. This {3} must be completed before a new upgrade or downgrade can begin.", "ACTION_USER_NAME", (org.apache.ambari.view.AmbariStreamProvider) remoteAmbariStreamProvider7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        org.apache.ambari.server.orm.dao.GroupDAO groupDAO0 = new org.apache.ambari.server.orm.dao.GroupDAO();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        org.apache.ambari.server.orm.entities.StackEntity stackEntity1 = serviceConfigEntity0._persistence_get_stack();
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity3 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Object obj4 = requestOperationLevelEntity3._persistence_post_clone();
        serviceConfigEntity0._persistence_set("java_home", (java.lang.Object) requestOperationLevelEntity3);
        org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity serviceComponentDesiredStateEntity6 = new org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity3);
        org.eclipse.persistence.queries.FetchGroup fetchGroup7 = serviceComponentDesiredStateEntity6._persistence_getFetchGroup();
        org.junit.Assert.assertNull(stackEntity1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(fetchGroup7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.SCRIPT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "script" + "'", str0.equals("script"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        org.apache.ambari.server.stack.StackModule stackModule0 = null;
        java.util.Map<java.lang.String, java.net.URI> map_str_uRI2 = null;
        org.apache.ambari.server.state.stack.OsFamily osFamily3 = null;
        try {
            org.apache.ambari.server.state.stack.RepoVdfCallable repoVdfCallable4 = new org.apache.ambari.server.state.stack.RepoVdfCallable(stackModule0, "OperatingSystems/stack_name", map_str_uRI2, osFamily3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        org.apache.ambari.server.actionmanager.HostRoleCommand[] hostRoleCommand_array0 = new org.apache.ambari.server.actionmanager.HostRoleCommand[] {};
        java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleCommand> arraylist_hostRoleCommand1 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleCommand>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.HostRoleCommand>) arraylist_hostRoleCommand1, hostRoleCommand_array0);
        java.util.Map<org.apache.ambari.server.actionmanager.HostRoleStatus, java.lang.Integer> map_hostRoleStatus_i3 = null;
        java.util.Map<org.apache.ambari.server.Role, java.lang.Float> map_role_f4 = null;
        org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus6 = org.apache.ambari.server.controller.internal.CalculatedStatus.calculateStageStatus((java.util.List<org.apache.ambari.server.actionmanager.HostRoleCommand>) arraylist_hostRoleCommand1, map_hostRoleStatus_i3, map_role_f4, true);
        boolean b7 = hostRoleStatus6.isHoldingState();
        org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus8 = org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING_TIMEDOUT;
        org.apache.ambari.server.actionmanager.HostRoleCommand[] hostRoleCommand_array9 = new org.apache.ambari.server.actionmanager.HostRoleCommand[] {};
        java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleCommand> arraylist_hostRoleCommand10 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleCommand>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.HostRoleCommand>) arraylist_hostRoleCommand10, hostRoleCommand_array9);
        java.util.Map<org.apache.ambari.server.actionmanager.HostRoleStatus, java.lang.Integer> map_hostRoleStatus_i12 = null;
        java.util.Map<org.apache.ambari.server.Role, java.lang.Float> map_role_f13 = null;
        org.apache.ambari.server.actionmanager.HostRoleStatus hostRoleStatus15 = org.apache.ambari.server.controller.internal.CalculatedStatus.calculateStageStatus((java.util.List<org.apache.ambari.server.actionmanager.HostRoleCommand>) arraylist_hostRoleCommand10, map_hostRoleStatus_i12, map_role_f13, true);
        org.apache.ambari.server.actionmanager.HostRoleStatus[] hostRoleStatus_array16 = new org.apache.ambari.server.actionmanager.HostRoleStatus[] { hostRoleStatus6, hostRoleStatus8, hostRoleStatus15 };
        java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleStatus> arraylist_hostRoleStatus17 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.HostRoleStatus>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.HostRoleStatus>) arraylist_hostRoleStatus17, hostRoleStatus_array16);
        java.util.Map<org.apache.ambari.server.actionmanager.HostRoleStatus, java.lang.Integer> map_hostRoleStatus_i19 = org.apache.ambari.server.controller.internal.CalculatedStatus.calculateStatusCounts((java.util.Collection<org.apache.ambari.server.actionmanager.HostRoleStatus>) arraylist_hostRoleStatus17);
        org.junit.Assert.assertNotNull(hostRoleCommand_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + hostRoleStatus6 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED + "'", hostRoleStatus6.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + hostRoleStatus8 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING_TIMEDOUT + "'", hostRoleStatus8.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.HOLDING_TIMEDOUT));
        org.junit.Assert.assertNotNull(hostRoleCommand_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + hostRoleStatus15 + "' != '" + org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED + "'", hostRoleStatus15.equals(org.apache.ambari.server.actionmanager.HostRoleStatus.COMPLETED));
        org.junit.Assert.assertNotNull(hostRoleStatus_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(map_hostRoleStatus_i19);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type, java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.keyPropertyIds;
        org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor1 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor(map_type_str0);
        org.apache.ambari.server.state.kerberos.KerberosConfigurationDescriptor kerberosConfigurationDescriptor3 = kerberosComponentDescriptor1.getConfiguration("ServiceInfo/credential_store_enabled");
        org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor[] kerberosIdentityDescriptor_array4 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor[] {};
        java.util.ArrayList<org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor> arraylist_kerberosIdentityDescriptor5 = new java.util.ArrayList<org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor>) arraylist_kerberosIdentityDescriptor5, kerberosIdentityDescriptor_array4);
        kerberosComponentDescriptor1.setIdentities((java.util.List<org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor>) arraylist_kerberosIdentityDescriptor5);
        org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor kerberosIdentityDescriptor9 = kerberosComponentDescriptor1.getIdentity("AlertNotice/target_id");
        java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type, java.lang.String> map_type_str10 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.keyPropertyIds;
        org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor11 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor(map_type_str10);
        java.lang.String str12 = kerberosComponentDescriptor11.getName();
        try {
            kerberosIdentityDescriptor9.setParent((org.apache.ambari.server.state.kerberos.AbstractKerberosDescriptor) kerberosComponentDescriptor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_type_str0);
        org.junit.Assert.assertNull(kerberosConfigurationDescriptor3);
        org.junit.Assert.assertNotNull(kerberosIdentityDescriptor_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(kerberosIdentityDescriptor9);
        org.junit.Assert.assertNotNull(map_type_str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.DESCRIPTION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/description" + "'", str0.equals("ViewInstanceInfo/description"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        org.eclipse.persistence.internal.descriptors.PersistenceObject persistenceObject0 = null;
        org.apache.ambari.server.orm.entities.BlueprintSettingEntity blueprintSettingEntity1 = new org.apache.ambari.server.orm.entities.BlueprintSettingEntity(persistenceObject0);
        blueprintSettingEntity1.setSettingName("Event/sync_time/end");
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link4 = blueprintSettingEntity1._persistence_getHref();
        org.junit.Assert.assertNull(link4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity0 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        java.lang.String str1 = viewResourceEntity0.getProvider();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks2 = null;
        viewResourceEntity0._persistence_setLinks(itemLinks2);
        java.util.Set<java.lang.String> set_str4 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.propertyIds;
        viewResourceEntity0.setSubResourceNames((java.util.Collection<java.lang.String>) set_str4);
        org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity6 = new org.apache.ambari.server.orm.entities.AlertDefinitionEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) viewResourceEntity0);
        java.lang.String str7 = alertDefinitionEntity6._persistence_get_definitionName();
        org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService[] affectedService_array8 = new org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService[] {};
        java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService> arraylist_affectedService9 = new java.util.ArrayList<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService>) arraylist_affectedService9, affectedService_array8);
        org.apache.ambari.server.state.stack.ConfigUpgradePack configUpgradePack11 = new org.apache.ambari.server.state.stack.ConfigUpgradePack((java.util.List<org.apache.ambari.server.state.stack.ConfigUpgradePack.AffectedService>) arraylist_affectedService9);
        alertDefinitionEntity6._persistence_setRelationships((java.util.List) arraylist_affectedService9);
        org.apache.ambari.server.orm.entities.ClusterEntity clusterEntity13 = null;
        alertDefinitionEntity6.setCluster(clusterEntity13);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(set_str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(affectedService_array8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.String> configurationproperty_str0 = org.apache.ambari.server.configuration.Configuration.VIEWS_DIRECTORY;
        org.junit.Assert.assertNotNull(configurationproperty_str0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
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
        stackVersionResponse35.setStackVersion("hive_server_hive");
        stackVersionResponse35.setStackVersion("PrivilegeInfo/principal_name");
        stackVersionResponse35.setStackName("kerberos.json");
        org.junit.Assert.assertNotNull(file_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set_str32);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RootServiceComponentConfigurationResourceProvider.CONFIGURATION_COMPONENT_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Configuration/component_name" + "'", str0.equals("Configuration/component_name"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.StackConfigurationResourceProvider.STACK_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StackConfigurations/stack_name" + "'", str0.equals("StackConfigurations/stack_name"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        java.net.URL uRL1 = java.lang.ClassLoader.getSystemResource("truststore.password");
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        org.apache.ambari.server.checks.HiveMultipleMetastoreCheck hiveMultipleMetastoreCheck0 = new org.apache.ambari.server.checks.HiveMultipleMetastoreCheck();
        java.util.Set<java.lang.String> set_str1 = hiveMultipleMetastoreCheck0.getApplicableServices();
        org.junit.Assert.assertNotNull(set_str1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.QuickLinkArtifactResourceProvider.STACK_SERVICE_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "QuickLinkInfo/service_name" + "'", str0.equals("QuickLinkInfo/service_name"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        serviceConfigEntity0._persistence_set_serviceConfigId((java.lang.Long) 1L);
        org.apache.ambari.server.orm.entities.RoleAuthorizationEntity roleAuthorizationEntity3 = new org.apache.ambari.server.orm.entities.RoleAuthorizationEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) serviceConfigEntity0);
        roleAuthorizationEntity3.setAuthorizationName("Event/summary/memberships/created");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricsCacheSizeOfEngine.DEFAULT_MAX_DEPTH = (byte) 100;
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        org.apache.ambari.server.security.authorization.PamAuthenticationException pamAuthenticationException2 = new org.apache.ambari.server.security.authorization.PamAuthenticationException("SET_KEYTAB");
        org.apache.ambari.server.topology.InvalidTopologyException invalidTopologyException3 = new org.apache.ambari.server.topology.InvalidTopologyException("", (java.lang.Throwable) pamAuthenticationException2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        org.apache.ambari.server.state.theme.Widget widget0 = new org.apache.ambari.server.state.theme.Widget();
        widget0.setDisplayName("hive_server_hive");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.TaskResourceProvider.TASK_START_TIME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tasks/start_time" + "'", str0.equals("Tasks/start_time"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        org.apache.ambari.server.bootstrap.BSResponse bSResponse0 = new org.apache.ambari.server.bootstrap.BSResponse();
        bSResponse0.setRequestId(10L);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        java.util.Map<org.apache.ambari.server.api.resources.BaseResourceDefinition.DirectiveType, java.util.Set<java.lang.String>> map_directiveType_set_str0 = org.apache.ambari.server.api.services.RootServiceComponentConfigurationService.DIRECTIVES_MAP;
        org.junit.Assert.assertNotNull(map_directiveType_set_str0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.ORACLE_JDBC_URL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "oracle_jdbc_url" + "'", str0.equals("oracle_jdbc_url"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        java.lang.String str0 = org.eclipse.jetty.util.component.AbstractLifeCycle.STOPPING;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "STOPPING" + "'", str0.equals("STOPPING"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        org.apache.ambari.server.controller.spi.Predicate predicate5 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = org.apache.ambari.server.controller.utilities.PredicateHelper.getProperties(predicate5);
        java.util.LinkedHashSet<java.util.Map<java.lang.String, java.lang.Object>> linkedhashset_map_str_obj7 = new java.util.LinkedHashSet<java.util.Map<java.lang.String, java.lang.Object>>();
        boolean b8 = linkedhashset_map_str_obj7.add(map_str_obj6);
        org.apache.ambari.server.controller.spi.Predicate predicate9 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj10 = org.apache.ambari.server.controller.utilities.PredicateHelper.getProperties(predicate9);
        java.util.LinkedHashSet<java.util.Map<java.lang.String, java.lang.Object>> linkedhashset_map_str_obj11 = new java.util.LinkedHashSet<java.util.Map<java.lang.String, java.lang.Object>>();
        boolean b12 = linkedhashset_map_str_obj11.add(map_str_obj10);
        org.apache.ambari.server.controller.ConfigGroupResponse configGroupResponse13 = new org.apache.ambari.server.controller.ConfigGroupResponse((java.lang.Long) 10L, "javax.net.ssl.trustStorePassword", "Repositories/verify_base_url", "yarn-site", "ambari_java_version", (java.util.Set<java.util.Map<java.lang.String, java.lang.Object>>) linkedhashset_map_str_obj7, (java.util.Set<java.util.Map<java.lang.String, java.lang.Object>>) linkedhashset_map_str_obj11);
        java.util.Set<java.util.Map<java.lang.String, java.lang.Object>> set_map_str_obj14 = configGroupResponse13.getVersionTags();
        org.junit.Assert.assertNotNull(map_str_obj6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map_str_obj10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set_map_str_obj14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        org.apache.ambari.server.state.stack.RepoTag repoTag0 = org.apache.ambari.server.state.stack.RepoTag.GPL;
        org.junit.Assert.assertTrue("'" + repoTag0 + "' != '" + org.apache.ambari.server.state.stack.RepoTag.GPL + "'", repoTag0.equals(org.apache.ambari.server.state.stack.RepoTag.GPL));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        org.apache.ambari.server.controller.internal.RequestResourceFilter[] requestResourceFilter_array3 = new org.apache.ambari.server.controller.internal.RequestResourceFilter[] {};
        java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter> arraylist_requestResourceFilter4 = new java.util.ArrayList<org.apache.ambari.server.controller.internal.RequestResourceFilter>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.internal.RequestResourceFilter>) arraylist_requestResourceFilter4, requestResourceFilter_array3);
        org.apache.ambari.server.controller.internal.RequestOperationLevel requestOperationLevel6 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> map_str_map_str_map_str_str13 = null;
        java.io.File[] file_array14 = new java.io.File[] {};
        java.util.ArrayList<java.io.File> arraylist_file15 = new java.util.ArrayList<java.io.File>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<java.io.File>) arraylist_file15, file_array14);
        java.lang.String[] str_array34 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str35, str_array34);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str35;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str35;
        org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning40 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
        java.util.Set<java.lang.String> set_str41 = hiveNotRollingWarning40.getApplicableServices();
        org.apache.ambari.server.controller.StackVersionResponse stackVersionResponse44 = new org.apache.ambari.server.controller.StackVersionResponse("RootServiceComponents/component_name", "ServiceInfo/service_name", true, "request_id", map_str_map_str_map_str_str13, (java.util.Collection<java.io.File>) arraylist_file15, (java.util.Set<java.lang.String>) linkedhashset_str35, false, (java.util.Collection<java.lang.String>) set_str41, "AlertNotice/target_id", "Request body for Blueprint create request is empty");
        java.util.Map<java.lang.String, java.lang.String> map_str_str45 = null;
        org.apache.ambari.server.state.stack.upgrade.Task[] task_array46 = new org.apache.ambari.server.state.stack.upgrade.Task[] {};
        org.apache.ambari.server.state.stack.upgrade.TaskWrapper taskWrapper47 = new org.apache.ambari.server.state.stack.upgrade.TaskWrapper("name", "Users/groups", (java.util.Set<java.lang.String>) linkedhashset_str35, map_str_str45, task_array46);
        java.util.Map<java.lang.String, java.lang.String> map_str_str48 = taskWrapper47.getParams();
        org.apache.ambari.server.controller.ExecuteActionRequest executeActionRequest50 = new org.apache.ambari.server.controller.ExecuteActionRequest("Upgrade/versions", "host_id", "read_only", (java.util.List<org.apache.ambari.server.controller.internal.RequestResourceFilter>) arraylist_requestResourceFilter4, requestOperationLevel6, map_str_str48, true);
        java.lang.String str51 = executeActionRequest50.getClusterName();
        java.lang.String str52 = executeActionRequest50.getActionName();
        org.junit.Assert.assertNotNull(requestResourceFilter_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(file_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(str_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set_str41);
        org.junit.Assert.assertNotNull(task_array46);
        org.junit.Assert.assertNotNull(map_str_str48);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Upgrade/versions" + "'", str51.equals("Upgrade/versions"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "read_only" + "'", str52.equals("read_only"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        org.apache.ambari.server.state.PropertyInfo.PropertyType propertyType0 = org.apache.ambari.server.state.PropertyInfo.PropertyType.GROUP;
        org.junit.Assert.assertTrue("'" + propertyType0 + "' != '" + org.apache.ambari.server.state.PropertyInfo.PropertyType.GROUP + "'", propertyType0.equals(org.apache.ambari.server.state.PropertyInfo.PropertyType.GROUP));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        org.eclipse.persistence.sessions.Session session1 = requestResourceFilterEntity0._persistence_getSession();
        org.junit.Assert.assertNull(session1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        org.apache.ambari.server.audit.request.eventcreator.ConfigurationChangeEventCreator configurationChangeEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.ConfigurationChangeEventCreator();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.AlertHistoryEntity, org.apache.ambari.server.orm.entities.AlertDefinitionEntity> singularattribute_alertHistoryEntity_alertDefinitionEntity0 = org.apache.ambari.server.orm.entities.AlertHistoryEntity_.alertDefinition;
        org.junit.Assert.assertNull(singularattribute_alertHistoryEntity_alertDefinitionEntity0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.VersionDefinitionResourceProvider.VERSION_DEF_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "VersionDefinition/id" + "'", str0.equals("VersionDefinition/id"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.HostRoleCommandEntity, java.lang.String> singularattribute_hostRoleCommandEntity_str0 = org.apache.ambari.server.orm.entities.HostRoleCommandEntity_.outputLog;
        org.junit.Assert.assertNull(singularattribute_hostRoleCommandEntity_str0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map_str_map_str_str0 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> map_str_map_str_map_str_str1 = null;
        org.apache.ambari.server.topology.Configuration configuration2 = new org.apache.ambari.server.topology.Configuration(map_str_map_str_str0, map_str_map_str_map_str_str1);
        try {
            java.lang.String str7 = configuration2.setAttribute("StackConfigurations/property_type", "StackServices/stack_name", "AlertTarget", "PermissionInfo/permission_id");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        org.apache.ambari.server.api.services.stackadvisor.StackAdvisorException stackAdvisorException1 = new org.apache.ambari.server.api.services.stackadvisor.StackAdvisorException("There is an existing {0} {1} {2} which has not completed. This {3} must be completed before a new upgrade or downgrade can begin.");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        org.apache.ambari.server.resources.ResourceManager resourceManager0 = null;
        org.apache.ambari.server.resources.api.rest.GetResource.init(resourceManager0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        org.apache.ambari.server.audit.request.eventcreator.AlertTargetEventCreator alertTargetEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.AlertTargetEventCreator();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        org.apache.ambari.server.state.stack.RepositoryXml repositoryXml0 = new org.apache.ambari.server.state.stack.RepositoryXml();
        repositoryXml0.addError("Event/summary/memberships/created");
        java.util.List<org.apache.ambari.server.state.stack.RepositoryXml.Os> list_os3 = repositoryXml0.getOses();
        org.junit.Assert.assertNotNull(list_os3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        org.apache.ambari.server.state.stack.upgrade.Grouping grouping0 = new org.apache.ambari.server.state.stack.upgrade.Grouping();
        java.lang.String str1 = grouping0.toString();
        java.lang.String str2 = grouping0.addAfterGroup;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Grouping{name=null}" + "'", str1.equals("Grouping{name=null}"));
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity0 = new org.apache.ambari.server.orm.entities.ClusterServiceEntity();
        java.lang.Object obj1 = clusterServiceEntity0._persistence_getId();
        org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntity configGroupHostMappingEntity2 = new org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) clusterServiceEntity0);
        java.lang.Object obj4 = configGroupHostMappingEntity2._persistence_get("selected_timestamp");
        java.lang.Object obj6 = configGroupHostMappingEntity2._persistence_get("resourcemanager_optional_ha");
        configGroupHostMappingEntity2._persistence_setShouldRefreshFetchGroup(true);
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link9 = configGroupHostMappingEntity2._persistence_getHref();
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(link9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning0 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
        java.util.Set<java.lang.String> set_str1 = hiveNotRollingWarning0.getApplicableServices();
        org.apache.ambari.server.checks.CheckDescription checkDescription2 = hiveNotRollingWarning0.getDescription();
        org.apache.ambari.server.state.stack.PrerequisiteCheck prerequisiteCheck4 = new org.apache.ambari.server.state.stack.PrerequisiteCheck(checkDescription2, "STANDARD");
        org.apache.ambari.server.state.stack.PrereqCheckType prereqCheckType5 = prerequisiteCheck4.getType();
        org.junit.Assert.assertNotNull(set_str1);
        org.junit.Assert.assertNotNull(checkDescription2);
        org.junit.Assert.assertTrue("'" + prereqCheckType5 + "' != '" + org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE + "'", prereqCheckType5.equals(org.apache.ambari.server.state.stack.PrereqCheckType.SERVICE));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        org.apache.ambari.server.orm.entities.WidgetLayoutEntity widgetLayoutEntity0 = new org.apache.ambari.server.orm.entities.WidgetLayoutEntity();
        widgetLayoutEntity0._persistence_set_layoutName("Event/summary/memberships/created");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity0 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        java.lang.String str1 = viewResourceEntity0.getProvider();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks2 = null;
        viewResourceEntity0._persistence_setLinks(itemLinks2);
        java.util.Set<java.lang.String> set_str4 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.propertyIds;
        viewResourceEntity0.setSubResourceNames((java.util.Collection<java.lang.String>) set_str4);
        org.apache.ambari.server.orm.entities.AlertDefinitionEntity alertDefinitionEntity6 = new org.apache.ambari.server.orm.entities.AlertDefinitionEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) viewResourceEntity0);
        alertDefinitionEntity6.setEnabled(true);
        org.eclipse.persistence.internal.identitymaps.CacheKey cacheKey9 = null;
        alertDefinitionEntity6._persistence_setCacheKey(cacheKey9);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(set_str4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        org.apache.ambari.server.orm.entities.StackEntity stackEntity0 = null;
        org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity4 = new org.apache.ambari.server.orm.entities.RepositoryVersionEntity(stackEntity0, "AlertTarget/alert_states", "Hosts/*", "Repositories/repository_version_id");
        java.lang.String str5 = repositoryVersionEntity4.toString();
        java.lang.Object obj6 = repositoryVersionEntity4._persistence_shallow_clone();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "RepositoryVersionEntity{id=null, stack=null, version=AlertTarget/alert_states, type=STANDARD, hidden=false}" + "'", str5.equals("RepositoryVersionEntity{id=null, stack=null, version=AlertTarget/alert_states, type=STANDARD, hidden=false}"));
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.VIEW_REQUEST_THREADPOOL_MAX_SIZE;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        javax.naming.Context context1 = null;
        try {
            javax.naming.Name name2 = org.apache.ambari.server.security.authorization.AmbariLdapUtils.getFullDn("principal_type", context1);
            org.junit.Assert.fail("Expected exception of type org.springframework.ldap.InvalidNameException");
        } catch (org.springframework.ldap.InvalidNameException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        org.apache.ambari.server.orm.entities.StageEntity[] stageEntity_array0 = new org.apache.ambari.server.orm.entities.StageEntity[] {};
        java.util.ArrayList<org.apache.ambari.server.orm.entities.StageEntity> arraylist_stageEntity1 = new java.util.ArrayList<org.apache.ambari.server.orm.entities.StageEntity>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.orm.entities.StageEntity>) arraylist_stageEntity1, stageEntity_array0);
        org.apache.ambari.server.controller.internal.CalculatedStatus calculatedStatus3 = org.apache.ambari.server.controller.internal.CalculatedStatus.statusFromStageEntities((java.util.Collection<org.apache.ambari.server.orm.entities.StageEntity>) arraylist_stageEntity1);
        org.junit.Assert.assertNotNull(stageEntity_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(calculatedStatus3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        org.apache.ambari.server.state.PropertyDependencyInfo propertyDependencyInfo2 = new org.apache.ambari.server.state.PropertyDependencyInfo("StackLevelConfigurations/final", "timelineMetricCacheManager");
        org.apache.ambari.server.controller.StackConfigurationDependencyResponse stackConfigurationDependencyResponse3 = propertyDependencyInfo2.convertToResponse();
        java.lang.String str4 = stackConfigurationDependencyResponse3.getPropertyName();
        stackConfigurationDependencyResponse3.setServiceName("resources");
        org.junit.Assert.assertNotNull(stackConfigurationDependencyResponse3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.URLStreamProvider.COOKIE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Cookie" + "'", str0.equals("Cookie"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.Object obj2 = serviceConfigEntity0._persistence_get("jce_name");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity4 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        serviceConfigEntity0._persistence_propertyChange("Repositories/repository_version_id", (java.lang.Object) clusterConfigEntity4, (java.lang.Object) 10);
        org.apache.ambari.server.orm.entities.HostGroupConfigEntity hostGroupConfigEntity7 = new org.apache.ambari.server.orm.entities.HostGroupConfigEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) clusterConfigEntity4);
        hostGroupConfigEntity7.setConfigAttributes("ambari_java_version");
        org.apache.ambari.server.orm.entities.BlueprintEntity blueprintEntity10 = new org.apache.ambari.server.orm.entities.BlueprintEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) hostGroupConfigEntity7);
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link11 = blueprintEntity10._persistence_getHref();
        org.eclipse.persistence.queries.FetchGroup fetchGroup12 = null;
        blueprintEntity10._persistence_setFetchGroup(fetchGroup12);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(link11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type, java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.keyPropertyIds;
        org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor kerberosPrincipalDescriptor1 = new org.apache.ambari.server.state.kerberos.KerberosPrincipalDescriptor(map_type_str0);
        org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor2 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor(map_type_str0);
        org.junit.Assert.assertNotNull(map_type_str0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        java.lang.String str0 = org.apache.ambari.server.notifications.dispatchers.AmbariSNMPDispatcher.AMBARI_ALERT_DEFINITION_ID_OID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1.3.6.1.4.1.18060.16.1.1.1.1" + "'", str0.equals("1.3.6.1.4.1.18060.16.1.1.1.1"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_GROUPS;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_GROUPS + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.AMBARI_MANAGE_GROUPS));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        requestResourceFilterEntity0._persistence_set_componentName("javax.net.ssl.trustStorePassword");
        requestResourceFilterEntity0._persistence_checkFetched("host_id");
        java.lang.Long long5 = requestResourceFilterEntity0.getFilterId();
        org.apache.ambari.server.orm.entities.GroupEntity groupEntity6 = new org.apache.ambari.server.orm.entities.GroupEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestResourceFilterEntity0);
        java.lang.Object obj7 = requestResourceFilterEntity0._persistence_shallow_clone();
        org.junit.Assert.assertNull(long5);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        org.apache.ambari.server.state.stack.upgrade.Grouping grouping0 = new org.apache.ambari.server.state.stack.upgrade.Grouping();
        java.lang.String str1 = grouping0.toString();
        boolean b2 = grouping0.supportsAutoSkipOnFailure;
        java.lang.String str3 = grouping0.title;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Grouping{name=null}" + "'", str1.equals("Grouping{name=null}"));
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        org.apache.ambari.server.orm.entities.ViewResourceEntity viewResourceEntity0 = new org.apache.ambari.server.orm.entities.ViewResourceEntity();
        java.lang.String str1 = viewResourceEntity0.getIdProperty();
        java.lang.String str2 = viewResourceEntity0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        org.apache.ambari.server.state.stack.upgrade.ClusterGrouping.ExecuteStage executeStage0 = new org.apache.ambari.server.state.stack.upgrade.ClusterGrouping.ExecuteStage();
        org.apache.ambari.server.state.stack.upgrade.SecurityCondition securityCondition1 = new org.apache.ambari.server.state.stack.upgrade.SecurityCondition();
        executeStage0.condition = securityCondition1;
        java.lang.String str3 = executeStage0.title;
        java.lang.String str4 = executeStage0.id;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.THREAD_POOL_SIZE_FOR_EXTERNAL_SCRIPT;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        com.google.gson.Gson gson0 = null;
        org.apache.ambari.server.configuration.Configuration configuration1 = null;
        org.apache.ambari.server.api.AmbariErrorHandler ambariErrorHandler2 = new org.apache.ambari.server.api.AmbariErrorHandler(gson0, configuration1);
        ambariErrorHandler2.stop();
        boolean b4 = ambariErrorHandler2.isRunning();
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        java.lang.String str0 = org.apache.ambari.server.state.ConfigHelper.CLUSTER_ENV_ALERT_REPEAT_TOLERANCE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "alerts_repeat_tolerance" + "'", str0.equals("alerts_repeat_tolerance"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        org.apache.ambari.server.orm.entities.PrivilegeEntity privilegeEntity0 = new org.apache.ambari.server.orm.entities.PrivilegeEntity();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity serviceComponentDesiredStateEntity0 = new org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        org.apache.ambari.server.state.svccomphost.ServiceComponentHostUpgradeEvent serviceComponentHostUpgradeEvent4 = new org.apache.ambari.server.state.svccomphost.ServiceComponentHostUpgradeEvent("600", "DECOMMISSION", (long) (-1), "ViewVersionInfo/parameters");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        org.apache.ambari.server.orm.entities.StackEntity stackEntity0 = null;
        org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity4 = new org.apache.ambari.server.orm.entities.RepositoryVersionEntity(stackEntity0, "AlertTarget/alert_states", "Hosts/*", "Repositories/repository_version_id");
        java.lang.String str5 = repositoryVersionEntity4.toString();
        org.apache.ambari.server.state.repository.VersionDefinitionXml versionDefinitionXml6 = repositoryVersionEntity4.getRepositoryXml();
        java.lang.String str7 = repositoryVersionEntity4.getVersionUrl();
        try {
            repositoryVersionEntity4.removePrefixFromVersion();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "RepositoryVersionEntity{id=null, stack=null, version=AlertTarget/alert_states, type=STANDARD, hidden=false}" + "'", str5.equals("RepositoryVersionEntity{id=null, stack=null, version=AlertTarget/alert_states, type=STANDARD, hidden=false}"));
        org.junit.Assert.assertNull(versionDefinitionXml6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        org.eclipse.persistence.platform.database.DatabasePlatform databasePlatform0 = null;
        org.apache.ambari.server.orm.helpers.dbms.DerbyHelper derbyHelper1 = new org.apache.ambari.server.orm.helpers.dbms.DerbyHelper(databasePlatform0);
        boolean b2 = derbyHelper1.supportsColumnTypeChange();
        java.lang.StringBuilder stringBuilder3 = null;
        org.apache.ambari.server.orm.DBAccessor.DBColumnInfo dBColumnInfo4 = null;
        try {
            java.lang.StringBuilder stringBuilder5 = derbyHelper1.writeColumnModifyString(stringBuilder3, dBColumnInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        org.apache.ambari.server.state.quicklinks.Port port0 = new org.apache.ambari.server.state.quicklinks.Port();
        java.lang.String str1 = port0.getHttpsRegex();
        java.lang.String str2 = port0.getHttpsProperty();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        org.apache.ambari.server.orm.entities.StackEntity stackEntity0 = null;
        org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity4 = new org.apache.ambari.server.orm.entities.RepositoryVersionEntity(stackEntity0, "AlertTarget/alert_states", "Hosts/*", "Repositories/repository_version_id");
        java.lang.String str5 = repositoryVersionEntity4.toString();
        java.util.Set set6 = repositoryVersionEntity4._persistence_get_hostVersionEntities();
        try {
            java.lang.String str7 = repositoryVersionEntity4.getStackVersion();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "RepositoryVersionEntity{id=null, stack=null, version=AlertTarget/alert_states, type=STANDARD, hidden=false}" + "'", str5.equals("RepositoryVersionEntity{id=null, stack=null, version=AlertTarget/alert_states, type=STANDARD, hidden=false}"));
        org.junit.Assert.assertNull(set6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        org.apache.ambari.server.RoleCommand roleCommand0 = org.apache.ambari.server.RoleCommand.ACTIONEXECUTE;
        org.junit.Assert.assertTrue("'" + roleCommand0 + "' != '" + org.apache.ambari.server.RoleCommand.ACTIONEXECUTE + "'", roleCommand0.equals(org.apache.ambari.server.RoleCommand.ACTIONEXECUTE));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        java.lang.String str0 = org.apache.ambari.server.configuration.Configuration.JAVAX_SSL_TRUSTSTORE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "javax.net.ssl.trustStore" + "'", str0.equals("javax.net.ssl.trustStore"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        org.apache.ambari.server.state.kerberos.KerberosPrincipalType kerberosPrincipalType0 = null;
        java.lang.String str1 = org.apache.ambari.server.state.kerberos.KerberosPrincipalType.translate(kerberosPrincipalType0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        org.apache.ambari.server.controller.metrics.timeline.cache.TimelineMetricsCacheSizeOfEngine.DEFAULT_ABORT_WHEN_MAX_DEPTH_EXCEEDED = false;
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        org.apache.ambari.server.api.services.LocalUriInfo localUriInfo1 = new org.apache.ambari.server.api.services.LocalUriInfo("commands_to_retry");
        try {
            javax.ws.rs.core.MultivaluedMap<java.lang.String, java.lang.String> multivaluedmap_str_str3 = localUriInfo1.getPathParameters(true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.CredentialResourceProvider.CREDENTIAL_CLUSTER_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Credential/cluster_name" + "'", str0.equals("Credential/cluster_name"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        org.apache.ambari.server.Role role0 = org.apache.ambari.server.Role.INFRA_SOLR;
        org.junit.Assert.assertNotNull(role0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
        org.apache.ambari.server.controller.spi.Resource.Type[] type_array3 = new org.apache.ambari.server.controller.spi.Resource.Type[] {};
        org.apache.ambari.server.api.resources.SimpleResourceDefinition simpleResourceDefinition4 = new org.apache.ambari.server.api.resources.SimpleResourceDefinition(type0, "commands_to_retry", "1.3.6.1.4.1.18060.16.1.1.1.1", type_array3);
        org.junit.Assert.assertNotNull(type_array3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity0 = new org.apache.ambari.server.orm.entities.ClusterServiceEntity();
        boolean b2 = clusterServiceEntity0._persistence_isAttributeFetched("validate_config");
        java.lang.Object obj3 = clusterServiceEntity0._persistence_getId();
        clusterServiceEntity0.setClusterId((java.lang.Long) 1L);
        org.eclipse.persistence.sessions.Session session6 = clusterServiceEntity0._persistence_getSession();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(session6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        org.eclipse.persistence.internal.descriptors.PersistenceObject persistenceObject0 = null;
        org.apache.ambari.server.orm.entities.BlueprintSettingEntity blueprintSettingEntity1 = new org.apache.ambari.server.orm.entities.BlueprintSettingEntity(persistenceObject0);
        org.eclipse.persistence.internal.jpa.rs.metadata.model.ItemLinks itemLinks2 = null;
        blueprintSettingEntity1._persistence_setLinks(itemLinks2);
        blueprintSettingEntity1._persistence_checkFetched("ranger-knox-plugin-enabled");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
        org.apache.ambari.server.api.resources.ExtensionResourceDefinition extensionResourceDefinition1 = new org.apache.ambari.server.api.resources.ExtensionResourceDefinition(type0);
        org.apache.ambari.server.controller.AmbariManagementController ambariManagementController2 = null;
        org.apache.ambari.server.controller.internal.LoggingResourceProvider loggingResourceProvider3 = new org.apache.ambari.server.controller.internal.LoggingResourceProvider(ambariManagementController2);
        java.lang.String[] str_array21 = new java.lang.String[] { "Repositories/distribution", "ServiceInfo/state", "hi!", "AlertNotice/target_id", "Repositories/repository_version_id", "Repositories/repository_version_id", "ACTION_USER_NAME", "ExtensionLink/extension_name", "createtime", "validate_config", "csv_column_map", "CURRENT", "version", "servicecomponent_history", "ACTION_USER_NAME", "servicecomponent_history", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str22, str_array21);
        org.apache.ambari.server.controller.internal.WidgetLayoutResourceProvider.propertyIds = linkedhashset_str22;
        org.apache.ambari.server.controller.internal.ThemeArtifactResourceProvider.propertyIds = linkedhashset_str22;
        java.util.Set<java.lang.String> set_str26 = loggingResourceProvider3.checkPropertyIds((java.util.Set<java.lang.String>) linkedhashset_str22);
        org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning27 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
        java.util.Set<java.lang.String> set_str28 = hiveNotRollingWarning27.getApplicableServices();
        org.apache.ambari.server.controller.internal.RepositoryResourceProvider.propertyIds = set_str28;
        java.util.Set<java.lang.String> set_str30 = loggingResourceProvider3.checkPropertyIds(set_str28);
        org.apache.ambari.server.api.query.QueryInfo queryInfo31 = new org.apache.ambari.server.api.query.QueryInfo((org.apache.ambari.server.api.resources.ResourceDefinition) extensionResourceDefinition1, set_str30);
        org.junit.Assert.assertNotNull(str_array21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set_str26);
        org.junit.Assert.assertNotNull(set_str28);
        org.junit.Assert.assertNotNull(set_str30);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        org.apache.ambari.server.state.ConfigMergeHelper.ThreeWayValue threeWayValue0 = new org.apache.ambari.server.state.ConfigMergeHelper.ThreeWayValue();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        java.util.Set<java.lang.String> set_str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.propertyIds;
        org.apache.ambari.server.controller.internal.WidgetResourceProvider.propertyIds = set_str0;
        org.junit.Assert.assertNotNull(set_str0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        org.apache.ambari.server.security.authorization.RoleAuthorization roleAuthorization0 = org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_VIEW_STATUS_INFO;
        org.junit.Assert.assertTrue("'" + roleAuthorization0 + "' != '" + org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_VIEW_STATUS_INFO + "'", roleAuthorization0.equals(org.apache.ambari.server.security.authorization.RoleAuthorization.SERVICE_VIEW_STATUS_INFO));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        org.apache.ambari.server.state.OperatingSystemInfo operatingSystemInfo1 = new org.apache.ambari.server.state.OperatingSystemInfo("ambari.dispatch.credential.password");
        java.lang.String str2 = operatingSystemInfo1.getOsType();
        org.apache.ambari.server.checks.HiveNotRollingWarning hiveNotRollingWarning3 = new org.apache.ambari.server.checks.HiveNotRollingWarning();
        java.util.Set<java.lang.String> set_str4 = hiveNotRollingWarning3.getApplicableServices();
        org.apache.ambari.server.checks.CheckDescription checkDescription5 = hiveNotRollingWarning3.getDescription();
        org.apache.ambari.server.checks.CheckDescription.VALID_SERVICES_INCLUDED_IN_REPOSITORY = checkDescription5;
        boolean b7 = operatingSystemInfo1.equals((java.lang.Object) checkDescription5);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ambari.dispatch.credential.password" + "'", str2.equals("ambari.dispatch.credential.password"));
        org.junit.Assert.assertNotNull(set_str4);
        org.junit.Assert.assertNotNull(checkDescription5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        org.apache.ambari.server.notifications.Notification.Type type0 = org.apache.ambari.server.notifications.Notification.Type.ALERT;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.ambari.server.notifications.Notification.Type.ALERT + "'", type0.equals(org.apache.ambari.server.notifications.Notification.Type.ALERT));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        javax.persistence.metamodel.SingularAttribute<org.apache.ambari.server.orm.entities.StageEntity, org.apache.ambari.server.orm.entities.RequestEntity> singularattribute_stageEntity_requestEntity0 = null;
        org.apache.ambari.server.orm.entities.StageEntity_.request = singularattribute_stageEntity_requestEntity0;
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        java.lang.String str0 = org.apache.ambari.server.upgrade.UpgradeCatalog260.STALE_POSTGRESS_VIEWURL_PKEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "viewurl_pkey" + "'", str0.equals("viewurl_pkey"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        org.apache.ambari.server.api.GsonJsonProvider gsonJsonProvider0 = new org.apache.ambari.server.api.GsonJsonProvider();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        org.apache.ambari.server.agent.StatusCommand statusCommand0 = new org.apache.ambari.server.agent.StatusCommand();
        statusCommand0.setServiceName("kerberos_preconfigure.json");
        statusCommand0.setHostname("ALTER TABLE Event/summary/users/updated DROP COLUMN /api/v1/views/*");
        java.lang.String str5 = statusCommand0.getClusterName();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        org.apache.ambari.server.api.services.ResultStatus.STATUS sTATUS0 = org.apache.ambari.server.api.services.ResultStatus.STATUS.OK;
        boolean b1 = sTATUS0.isErrorState();
        org.junit.Assert.assertTrue("'" + sTATUS0 + "' != '" + org.apache.ambari.server.api.services.ResultStatus.STATUS.OK + "'", sTATUS0.equals(org.apache.ambari.server.api.services.ResultStatus.STATUS.OK));
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map_str_map_str_str0 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> map_str_map_str_map_str_str1 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map_str_map_str_str2 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> map_str_map_str_map_str_str3 = null;
        org.apache.ambari.server.topology.Configuration configuration4 = null;
        org.apache.ambari.server.topology.Configuration configuration5 = new org.apache.ambari.server.topology.Configuration(map_str_map_str_str2, map_str_map_str_map_str_str3, configuration4);
        org.apache.ambari.server.topology.Configuration configuration6 = new org.apache.ambari.server.topology.Configuration(map_str_map_str_str0, map_str_map_str_map_str_str1, configuration4);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostComponentResourceProvider.HOST_COMPONENT_ACTUAL_CONFIGS_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HostRoles/actual_configs" + "'", str0.equals("HostRoles/actual_configs"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
        org.apache.ambari.server.controller.internal.HostStackVersionResourceProvider hostStackVersionResourceProvider1 = new org.apache.ambari.server.controller.internal.HostStackVersionResourceProvider(ambariManagementController0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        org.apache.ambari.server.controller.MemberResponse memberResponse2 = new org.apache.ambari.server.controller.MemberResponse("Hosts", "is_current");
        java.lang.String str3 = memberResponse2.getUserName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "is_current" + "'", str3.equals("is_current"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ExtensionLinkResourceProvider.STACK_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ExtensionLink/stack_name" + "'", str0.equals("ExtensionLink/stack_name"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity0 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.beans.PropertyChangeListener propertyChangeListener1 = requestOperationLevelEntity0._persistence_getPropertyChangeListener();
        java.lang.String str2 = requestOperationLevelEntity0.getClusterName();
        org.junit.Assert.assertNull(propertyChangeListener1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity0 = new org.apache.ambari.server.orm.entities.ClusterServiceEntity();
        java.lang.Object obj1 = clusterServiceEntity0._persistence_getId();
        org.eclipse.persistence.internal.identitymaps.CacheKey cacheKey2 = null;
        clusterServiceEntity0._persistence_setCacheKey(cacheKey2);
        boolean b5 = clusterServiceEntity0._persistence_isAttributeFetched("ViewInstanceInfo/instance_name");
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
        org.apache.ambari.server.events.publishers.AlertEventPublisher alertEventPublisher0 = null;
        try {
            org.apache.ambari.server.events.listeners.alerts.AlertReceivedListener alertReceivedListener1 = new org.apache.ambari.server.events.listeners.alerts.AlertReceivedListener(alertEventPublisher0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        org.apache.ambari.server.controller.internal.ViewPermissionResourceProvider viewPermissionResourceProvider0 = new org.apache.ambari.server.controller.internal.ViewPermissionResourceProvider();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ActionResourceProvider.ACTION_TYPE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Actions/action_type" + "'", str0.equals("Actions/action_type"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        org.apache.ambari.server.audit.request.eventcreator.MemberEventCreator memberEventCreator0 = new org.apache.ambari.server.audit.request.eventcreator.MemberEventCreator();
        java.util.Set<org.apache.ambari.server.api.services.Request.Type> set_type1 = memberEventCreator0.getRequestTypes();
        org.junit.Assert.assertNotNull(set_type1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        org.apache.ambari.server.controller.spi.Predicate predicate0 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj1 = org.apache.ambari.server.controller.utilities.PredicateHelper.getProperties(predicate0);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> arraylist_map_str_obj2 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        boolean b3 = arraylist_map_str_obj2.add(map_str_obj1);
        org.apache.ambari.server.topology.Setting setting4 = org.apache.ambari.server.topology.SettingFactory.getSetting((java.util.Collection<java.util.Map<java.lang.String, java.lang.Object>>) arraylist_map_str_obj2);
        java.util.Set<java.util.HashMap<java.lang.String, java.lang.String>> set_hashmap_str_str6 = setting4.getSettingValue("users");
        java.util.Map<java.lang.String, java.util.Set<java.util.HashMap<java.lang.String, java.lang.String>>> map_str_set_hashmap_str_str7 = setting4.getProperties();
        org.junit.Assert.assertNotNull(map_str_obj1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(setting4);
        org.junit.Assert.assertNotNull(set_hashmap_str_str6);
        org.junit.Assert.assertNotNull(map_str_set_hashmap_str_str7);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
        org.apache.ambari.server.security.authorization.jwt.JwtAuthenticationProperties jwtAuthenticationProperties0 = null;
        org.apache.ambari.server.configuration.Configuration configuration1 = null;
        org.apache.ambari.server.security.AmbariEntryPoint ambariEntryPoint2 = new org.apache.ambari.server.security.AmbariEntryPoint(configuration1);
        org.apache.ambari.server.security.authorization.Users users3 = new org.apache.ambari.server.security.authorization.Users();
        org.apache.ambari.server.security.authorization.jwt.JwtAuthenticationFilter jwtAuthenticationFilter4 = new org.apache.ambari.server.security.authorization.jwt.JwtAuthenticationFilter(jwtAuthenticationProperties0, (org.springframework.security.web.AuthenticationEntryPoint) ambariEntryPoint2, users3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
        org.apache.ambari.server.api.services.LocalUriInfo localUriInfo1 = new org.apache.ambari.server.api.services.LocalUriInfo("commands_to_retry");
        try {
            javax.ws.rs.core.MultivaluedMap<java.lang.String, java.lang.String> multivaluedmap_str_str3 = localUriInfo1.getQueryParameters(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
        org.apache.ambari.server.orm.DBAccessor dBAccessor0 = null;
        com.google.inject.Injector injector1 = null;
        com.google.inject.persist.PersistService persistService2 = null;
        org.apache.ambari.server.checks.MpackInstallChecker mpackInstallChecker3 = new org.apache.ambari.server.checks.MpackInstallChecker(dBAccessor0, injector1, persistService2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity0 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Long long1 = requestOperationLevelEntity0._persistence_get_operationLevelId();
        org.apache.ambari.server.orm.entities.PrivilegeEntity privilegeEntity2 = new org.apache.ambari.server.orm.entities.PrivilegeEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity0);
        org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity3 = privilegeEntity2.getPrincipal();
        org.apache.ambari.server.orm.entities.ResourceEntity resourceEntity4 = new org.apache.ambari.server.orm.entities.ResourceEntity();
        resourceEntity4._persistence_setShouldRefreshFetchGroup(true);
        org.eclipse.persistence.internal.identitymaps.CacheKey cacheKey7 = resourceEntity4._persistence_getCacheKey();
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link8 = null;
        resourceEntity4._persistence_setHref(link8);
        privilegeEntity2.setResource(resourceEntity4);
        org.apache.ambari.server.actionmanager.Stage[] stage_array11 = new org.apache.ambari.server.actionmanager.Stage[] {};
        java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage> arraylist_stage12 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage12, stage_array11);
        org.apache.ambari.server.controller.internal.CalculatedStatus calculatedStatus14 = org.apache.ambari.server.controller.internal.CalculatedStatus.statusFromStages((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage12);
        boolean b15 = resourceEntity4.equals((java.lang.Object) calculatedStatus14);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNull(principalEntity3);
        org.junit.Assert.assertNull(cacheKey7);
        org.junit.Assert.assertNotNull(stage_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(calculatedStatus14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        org.apache.ambari.server.state.AlertState alertState0 = org.apache.ambari.server.state.AlertState.OK;
        org.junit.Assert.assertTrue("'" + alertState0 + "' != '" + org.apache.ambari.server.state.AlertState.OK + "'", alertState0.equals(org.apache.ambari.server.state.AlertState.OK));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
        org.apache.ambari.server.controller.AlertDefinitionResponse alertDefinitionResponse0 = new org.apache.ambari.server.controller.AlertDefinitionResponse();
        java.lang.String str1 = alertDefinitionResponse0.getDescription();
        java.lang.Long long2 = alertDefinitionResponse0.getDefinitionId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(long2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
        org.apache.ambari.server.topology.HostGroup[] hostGroup_array1 = new org.apache.ambari.server.topology.HostGroup[] {};
        java.util.ArrayList<org.apache.ambari.server.topology.HostGroup> arraylist_hostGroup2 = new java.util.ArrayList<org.apache.ambari.server.topology.HostGroup>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.topology.HostGroup>) arraylist_hostGroup2, hostGroup_array1);
        org.apache.ambari.server.controller.internal.Stack stack4 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map_str_map_str_str5 = null;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> map_str_map_str_map_str_str6 = null;
        org.apache.ambari.server.topology.Configuration configuration7 = null;
        org.apache.ambari.server.topology.Configuration configuration8 = new org.apache.ambari.server.topology.Configuration(map_str_map_str_str5, map_str_map_str_map_str_str6, configuration7);
        org.apache.ambari.server.topology.SecurityConfiguration securityConfiguration9 = null;
        org.apache.ambari.server.controller.spi.Predicate predicate10 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj11 = org.apache.ambari.server.controller.utilities.PredicateHelper.getProperties(predicate10);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> arraylist_map_str_obj12 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>>();
        boolean b13 = arraylist_map_str_obj12.add(map_str_obj11);
        org.apache.ambari.server.topology.Setting setting14 = org.apache.ambari.server.topology.SettingFactory.getSetting((java.util.Collection<java.util.Map<java.lang.String, java.lang.Object>>) arraylist_map_str_obj12);
        try {
            org.apache.ambari.server.topology.BlueprintImpl blueprintImpl15 = new org.apache.ambari.server.topology.BlueprintImpl("hostComponent", (java.util.Collection<org.apache.ambari.server.topology.HostGroup>) arraylist_hostGroup2, stack4, configuration7, securityConfiguration9, setting14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(hostGroup_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map_str_obj11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(setting14);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        org.apache.ambari.server.checks.MpackInstallChecker.MpackCheckerAuditModule mpackCheckerAuditModule0 = new org.apache.ambari.server.checks.MpackInstallChecker.MpackCheckerAuditModule();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
        java.util.Map<org.apache.ambari.server.controller.spi.Resource.Type, java.lang.String> map_type_str0 = org.apache.ambari.server.controller.internal.StackArtifactResourceProvider.keyPropertyIds;
        org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor kerberosComponentDescriptor1 = new org.apache.ambari.server.state.kerberos.KerberosComponentDescriptor(map_type_str0);
        org.apache.ambari.server.state.kerberos.KerberosConfigurationDescriptor kerberosConfigurationDescriptor3 = kerberosComponentDescriptor1.getConfiguration("ServiceInfo/credential_store_enabled");
        org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor[] kerberosIdentityDescriptor_array4 = new org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor[] {};
        java.util.ArrayList<org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor> arraylist_kerberosIdentityDescriptor5 = new java.util.ArrayList<org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor>) arraylist_kerberosIdentityDescriptor5, kerberosIdentityDescriptor_array4);
        kerberosComponentDescriptor1.setIdentities((java.util.List<org.apache.ambari.server.state.kerberos.KerberosIdentityDescriptor>) arraylist_kerberosIdentityDescriptor5);
        java.lang.String str8 = kerberosComponentDescriptor1.getPath();
        org.junit.Assert.assertNotNull(map_type_str0);
        org.junit.Assert.assertNull(kerberosConfigurationDescriptor3);
        org.junit.Assert.assertNotNull(kerberosIdentityDescriptor_array4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.SettingResourceProvider.SETTING_UPDATED_BY_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Settings/updated_by" + "'", str0.equals("Settings/updated_by"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        org.apache.ambari.server.orm.entities.StackEntity stackEntity0 = null;
        org.apache.ambari.server.orm.entities.RepositoryVersionEntity repositoryVersionEntity4 = new org.apache.ambari.server.orm.entities.RepositoryVersionEntity(stackEntity0, "AlertTarget/alert_states", "Hosts/*", "Repositories/repository_version_id");
        java.lang.String str5 = repositoryVersionEntity4.toString();
        repositoryVersionEntity4.setLegacy(false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "RepositoryVersionEntity{id=null, stack=null, version=AlertTarget/alert_states, type=STANDARD, hidden=false}" + "'", str5.equals("RepositoryVersionEntity{id=null, stack=null, version=AlertTarget/alert_states, type=STANDARD, hidden=false}"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
        org.apache.ambari.server.stack.ExtensionDirectory extensionDirectory0 = null;
        org.apache.ambari.server.orm.dao.MetainfoDAO metainfoDAO1 = null;
        org.apache.ambari.server.metadata.ActionMetadata actionMetadata2 = null;
        org.apache.ambari.server.state.stack.OsFamily osFamily3 = null;
        org.apache.ambari.server.stack.StackContext stackContext4 = new org.apache.ambari.server.stack.StackContext(metainfoDAO1, actionMetadata2, osFamily3);
        try {
            org.apache.ambari.server.stack.ExtensionModule extensionModule5 = new org.apache.ambari.server.stack.ExtensionModule(extensionDirectory0, stackContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_STATUS_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/status" + "'", str0.equals("UpgradeChecks/status"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        org.apache.ambari.server.state.stack.upgrade.Grouping grouping0 = new org.apache.ambari.server.state.stack.upgrade.Grouping();
        java.lang.String str1 = grouping0.toString();
        org.apache.ambari.server.state.stack.upgrade.ParallelScheduler parallelScheduler2 = null;
        grouping0.parallelScheduler = parallelScheduler2;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Grouping{name=null}" + "'", str1.equals("Grouping{name=null}"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
        org.apache.ambari.server.orm.entities.ClusterServiceEntity clusterServiceEntity0 = new org.apache.ambari.server.orm.entities.ClusterServiceEntity();
        java.lang.Object obj1 = clusterServiceEntity0._persistence_getId();
        org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntity configGroupHostMappingEntity2 = new org.apache.ambari.server.orm.entities.ConfigGroupHostMappingEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) clusterServiceEntity0);
        java.lang.Object obj4 = configGroupHostMappingEntity2._persistence_get("selected_timestamp");
        java.lang.Object obj6 = configGroupHostMappingEntity2._persistence_get("resourcemanager_optional_ha");
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link7 = null;
        configGroupHostMappingEntity2._persistence_setHref(link7);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.PreUpgradeCheckResourceProvider.UPGRADE_CHECK_TARGET_REPOSITORY_VERSION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpgradeChecks/repository_version" + "'", str0.equals("UpgradeChecks/repository_version"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        org.apache.ambari.server.orm.entities.BlueprintEntity blueprintEntity0 = new org.apache.ambari.server.orm.entities.BlueprintEntity();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        java.lang.String str0 = org.eclipse.persistence.sessions.SessionProfiler.Merge;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Timer:Merge" + "'", str0.equals("Timer:Merge"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        java.util.Map<org.apache.ambari.server.controller.spi.Resource, java.util.Set<java.util.Map<java.lang.String, java.lang.Object>>> map_resource_set_map_str_obj0 = null;
        org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor extendedResourcePredicateVisitor1 = new org.apache.ambari.server.api.query.ExtendedResourcePredicateVisitor(map_resource_set_map_str_obj0);
        org.apache.ambari.server.controller.predicate.CategoryPredicate categoryPredicate2 = null;
        extendedResourcePredicateVisitor1.acceptCategoryPredicate(categoryPredicate2);
        org.apache.ambari.server.controller.predicate.UnaryPredicate unaryPredicate4 = null;
        extendedResourcePredicateVisitor1.acceptUnaryPredicate(unaryPredicate4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.MemberResourceProvider.MEMBER_GROUP_NAME_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "MemberInfo/group_name" + "'", str0.equals("MemberInfo/group_name"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.HostResourceProvider.HOST_HEALTH_REPORT_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "host_health_report" + "'", str0.equals("host_health_report"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
        org.apache.ambari.server.controller.ServiceComponentHostRequest serviceComponentHostRequest5 = new org.apache.ambari.server.controller.ServiceComponentHostRequest("RepositoryVersions/release/compatible_with", "STANDARD", "configure-task-insertions", "AlertNotice/target_id", "WidgetInfo/description");
        java.lang.String str6 = serviceComponentHostRequest5.getServiceName();
        java.lang.String str7 = serviceComponentHostRequest5.getComponentName();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "STANDARD" + "'", str6.equals("STANDARD"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "configure-task-insertions" + "'", str7.equals("configure-task-insertions"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        org.apache.ambari.server.state.stack.upgrade.ServerActionTask serverActionTask0 = new org.apache.ambari.server.state.stack.upgrade.ServerActionTask();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
        try {
            java.lang.String str1 = org.apache.ambari.server.controller.internal.RequestOperationLevel.getInternalLevelName("Counter:CacheHits");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
        org.apache.ambari.server.agent.StatusCommand statusCommand0 = new org.apache.ambari.server.agent.StatusCommand();
        statusCommand0.setServiceName("kerberos_preconfigure.json");
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = statusCommand0.getHostLevelParams();
        java.lang.String str4 = statusCommand0.getComponentName();
        org.junit.Assert.assertNotNull(map_str_str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
        org.apache.ambari.server.security.AmbariViewsSecurityHeaderFilter ambariViewsSecurityHeaderFilter0 = new org.apache.ambari.server.security.AmbariViewsSecurityHeaderFilter();
        ambariViewsSecurityHeaderFilter0.destroy();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
        org.apache.ambari.server.api.services.LocalUriInfo localUriInfo1 = new org.apache.ambari.server.api.services.LocalUriInfo("commands_to_retry");
        try {
            java.lang.String str2 = localUriInfo1.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewInstanceResourceProvider.ICON64_PATH_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ViewInstanceInfo/icon64_path" + "'", str0.equals("ViewInstanceInfo/icon64_path"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        org.apache.ambari.server.topology.GPLLicenseNotAcceptedException gPLLicenseNotAcceptedException1 = new org.apache.ambari.server.topology.GPLLicenseNotAcceptedException("hive_server_hive");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        org.apache.ambari.server.orm.dao.AmbariConfigurationDAO ambariConfigurationDAO0 = new org.apache.ambari.server.orm.dao.AmbariConfigurationDAO();
        java.util.Collection<org.apache.ambari.server.orm.entities.AmbariConfigurationEntity> collection_ambariConfigurationEntity1 = null;
        try {
            ambariConfigurationDAO0.remove(collection_ambariConfigurationEntity1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.Object obj2 = serviceConfigEntity0._persistence_get("jce_name");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity4 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        serviceConfigEntity0._persistence_propertyChange("Repositories/repository_version_id", (java.lang.Object) clusterConfigEntity4, (java.lang.Object) 10);
        org.apache.ambari.server.orm.entities.HostGroupConfigEntity hostGroupConfigEntity7 = new org.apache.ambari.server.orm.entities.HostGroupConfigEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) clusterConfigEntity4);
        hostGroupConfigEntity7.setConfigAttributes("ambari_java_version");
        java.lang.String str10 = hostGroupConfigEntity7._persistence_get_type();
        org.apache.ambari.server.orm.entities.HostGroupEntity hostGroupEntity11 = hostGroupConfigEntity7._persistence_get_hostGroup();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(hostGroupEntity11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.RepositoryVersionResourceProvider.REPOSITORY_VERSION_TYPE_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RepositoryVersions/type" + "'", str0.equals("RepositoryVersions/type"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        org.apache.ambari.server.actionmanager.Stage[] stage_array1 = new org.apache.ambari.server.actionmanager.Stage[] {};
        java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage> arraylist_stage2 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage2, stage_array1);
        org.apache.ambari.server.controller.internal.CalculatedStatus calculatedStatus4 = org.apache.ambari.server.controller.internal.CalculatedStatus.statusFromStages((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage2);
        org.apache.ambari.server.actionmanager.RequestFactory requestFactory5 = null;
        org.apache.ambari.server.actionmanager.ActionManager actionManager6 = null;
        org.apache.ambari.server.controller.internal.RequestStageContainer requestStageContainer7 = new org.apache.ambari.server.controller.internal.RequestStageContainer((java.lang.Long) 1L, (java.util.List<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage2, requestFactory5, actionManager6);
        long long8 = requestStageContainer7.getLastStageId();
        org.apache.ambari.server.actionmanager.Stage[] stage_array10 = new org.apache.ambari.server.actionmanager.Stage[] {};
        java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage> arraylist_stage11 = new java.util.ArrayList<org.apache.ambari.server.actionmanager.Stage>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage11, stage_array10);
        org.apache.ambari.server.controller.internal.CalculatedStatus calculatedStatus13 = org.apache.ambari.server.controller.internal.CalculatedStatus.statusFromStages((java.util.Collection<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage11);
        org.apache.ambari.server.actionmanager.RequestFactory requestFactory14 = null;
        org.apache.ambari.server.actionmanager.ActionManager actionManager15 = null;
        org.apache.ambari.server.controller.internal.RequestStageContainer requestStageContainer16 = new org.apache.ambari.server.controller.internal.RequestStageContainer((java.lang.Long) 1L, (java.util.List<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage11, requestFactory14, actionManager15);
        requestStageContainer7.addStages((java.util.List<org.apache.ambari.server.actionmanager.Stage>) arraylist_stage11);
        org.junit.Assert.assertNotNull(stage_array1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(calculatedStatus4);
        org.junit.Assert.assertTrue(long8 == (-1L));
        org.junit.Assert.assertNotNull(stage_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(calculatedStatus13);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
        org.apache.ambari.server.api.resources.RequestResourceDefinition requestResourceDefinition0 = new org.apache.ambari.server.api.resources.RequestResourceDefinition();
        java.lang.String str1 = requestResourceDefinition0.getPluralName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "requests" + "'", str1.equals("requests"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        org.apache.ambari.server.state.Clusters clusters0 = null;
        org.apache.ambari.server.utils.RetryHelper.init(clusters0, 3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
        org.apache.ambari.server.state.ChangedConfigInfo changedConfigInfo3 = new org.apache.ambari.server.state.ChangedConfigInfo("Executing", "AlertNotice/target_id", "rack_info");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
        org.apache.ambari.server.state.ChangedConfigInfo changedConfigInfo0 = new org.apache.ambari.server.state.ChangedConfigInfo();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.Object obj2 = serviceConfigEntity0._persistence_get("jce_name");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity4 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        serviceConfigEntity0._persistence_propertyChange("Repositories/repository_version_id", (java.lang.Object) clusterConfigEntity4, (java.lang.Object) 10);
        java.util.List<org.apache.ambari.server.orm.entities.ClusterConfigEntity> list_clusterConfigEntity7 = serviceConfigEntity0.getClusterConfigEntities();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(list_clusterConfigEntity7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric gangliaMetric0 = new org.apache.ambari.server.controller.metrics.ganglia.GangliaMetric();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        org.apache.ambari.server.controller.spi.Resource.Type type0 = null;
        org.apache.ambari.server.api.resources.SubResourceDefinition subResourceDefinition1 = new org.apache.ambari.server.api.resources.SubResourceDefinition(type0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        org.apache.ambari.server.agent.rest.AgentResource agentResource0 = new org.apache.ambari.server.agent.rest.AgentResource();
        try {
            org.apache.ambari.server.agent.ComponentsResponse componentsResponse2 = agentResource0.components("ALTER TABLE Event/summary/users/updated DROP COLUMN /api/v1/views/*");
            org.junit.Assert.fail("Expected exception of type javax.ws.rs.WebApplicationException");
        } catch (javax.ws.rs.WebApplicationException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        java.lang.String str0 = org.apache.ambari.server.topology.ClusterConfigurationRequest.CLUSTER_HOST_INFO;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "clusterHostInfo" + "'", str0.equals("clusterHostInfo"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        org.apache.ambari.server.orm.entities.RemoteAmbariClusterEntity remoteAmbariClusterEntity0 = new org.apache.ambari.server.orm.entities.RemoteAmbariClusterEntity();
        org.eclipse.persistence.queries.FetchGroup fetchGroup1 = null;
        remoteAmbariClusterEntity0._persistence_setFetchGroup(fetchGroup1);
        remoteAmbariClusterEntity0._persistence_checkFetched("FK_hostcomponentdesiredstate_desired_stack_id");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
        com.google.gson.Gson gson0 = null;
        org.apache.ambari.server.configuration.Configuration configuration1 = null;
        org.apache.ambari.server.api.AmbariErrorHandler ambariErrorHandler2 = new org.apache.ambari.server.api.AmbariErrorHandler(gson0, configuration1);
        ambariErrorHandler2.stop();
        org.eclipse.jetty.server.Server server4 = null;
        ambariErrorHandler2.setServer(server4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        org.apache.ambari.server.state.PropertyInfo.PropertyType propertyType0 = org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE;
        org.junit.Assert.assertTrue("'" + propertyType0 + "' != '" + org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE + "'", propertyType0.equals(org.apache.ambari.server.state.PropertyInfo.PropertyType.VALUE_FROM_PROPERTY_FILE));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        org.apache.ambari.server.topology.HostGroupInfo hostGroupInfo1 = new org.apache.ambari.server.topology.HostGroupInfo("servicedesiredstate");
        org.apache.ambari.server.topology.Configuration configuration2 = hostGroupInfo1.getConfiguration();
        org.junit.Assert.assertNull(configuration2);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
        org.apache.ambari.server.security.SignCertResponse signCertResponse0 = new org.apache.ambari.server.security.SignCertResponse();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
        org.apache.ambari.server.state.stack.WidgetLayoutInfo widgetLayoutInfo0 = new org.apache.ambari.server.state.stack.WidgetLayoutInfo();
        java.lang.String str1 = widgetLayoutInfo0.getType();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        org.apache.ambari.server.audit.event.request.DeleteAlertTargetRequestAuditEvent.DeleteAlertTargetRequestAuditEventBuilder deleteAlertTargetRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.DeleteAlertTargetRequestAuditEvent.DeleteAlertTargetRequestAuditEventBuilder();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        org.apache.ambari.server.checks.RequiredServicesInRepositoryCheck requiredServicesInRepositoryCheck0 = new org.apache.ambari.server.checks.RequiredServicesInRepositoryCheck();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        org.apache.ambari.server.orm.entities.HostVersionEntity hostVersionEntity0 = null;
        try {
            org.apache.ambari.server.orm.entities.HostVersionEntity hostVersionEntity1 = new org.apache.ambari.server.orm.entities.HostVersionEntity(hostVersionEntity0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        org.apache.ambari.server.orm.entities.WidgetLayoutEntity widgetLayoutEntity0 = new org.apache.ambari.server.orm.entities.WidgetLayoutEntity();
        widgetLayoutEntity0.setId((java.lang.Long) (-1L));
        widgetLayoutEntity0._persistence_resetFetchGroup();
        org.apache.ambari.server.orm.entities.ClusterEntity clusterEntity4 = null;
        widgetLayoutEntity0._persistence_set_clusterEntity(clusterEntity4);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        org.apache.ambari.server.configuration.Configuration.ConfigurationProperty<java.lang.Integer> configurationproperty_i0 = org.apache.ambari.server.configuration.Configuration.VIEW_EXTRACTION_THREADPOOL_CORE_SIZE;
        org.junit.Assert.assertNotNull(configurationproperty_i0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ViewPrivilegeResourceProvider.PRIVILEGE_VIEW_VERSION_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PrivilegeInfo/version" + "'", str0.equals("PrivilegeInfo/version"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
        org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor kerberosKeytabDescriptor7 = new org.apache.ambari.server.state.kerberos.KerberosKeytabDescriptor("STANDARD", "PrivilegeInfo/privilege_id", "optional_no_glusterfs", "There is an existing {0} {1} {2} which has not completed. This {3} must be completed before a new upgrade or downgrade can begin.", "role_command_order.json", "action", false);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj8 = kerberosKeytabDescriptor7.toMap();
        org.junit.Assert.assertNotNull(map_str_obj8);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
        org.apache.ambari.server.controller.AmbariManagementController ambariManagementController0 = null;
        org.apache.ambari.server.controller.internal.UpgradeSummaryResourceProvider upgradeSummaryResourceProvider1 = new org.apache.ambari.server.controller.internal.UpgradeSummaryResourceProvider(ambariManagementController0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        java.lang.String str0 = org.apache.ambari.server.agent.ExecutionCommand.KeyNames.CUSTOM_COMMAND;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "custom_command" + "'", str0.equals("custom_command"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        org.apache.ambari.server.orm.dao.AlertHostSummaryDTO alertHostSummaryDTO4 = new org.apache.ambari.server.orm.dao.AlertHostSummaryDTO((int) (byte) 100, 321, (int) (byte) 100, (int) (short) 100);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        java.lang.String str0 = org.apache.ambari.server.metadata.ActionMetadata.SERVICE_CHECK_POSTFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "_SERVICE_CHECK" + "'", str0.equals("_SERVICE_CHECK"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
        org.apache.ambari.server.serveraction.kerberos.KerberosKDCSSLConnectionException kerberosKDCSSLConnectionException1 = new org.apache.ambari.server.serveraction.kerberos.KerberosKDCSSLConnectionException("validate_config");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfileParser quickLinksProfileParser1 = new org.apache.ambari.server.state.quicklinksprofile.QuickLinksProfileParser();
        boolean b2 = serviceConfigEntity0.equals((java.lang.Object) quickLinksProfileParser1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.LdapSyncEventResourceProvider.EVENT_SPECS_PROPERTY_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Event/specs" + "'", str0.equals("Event/specs"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        java.lang.Object obj2 = serviceConfigEntity0._persistence_get("jce_name");
        org.apache.ambari.server.orm.entities.ClusterConfigEntity clusterConfigEntity4 = new org.apache.ambari.server.orm.entities.ClusterConfigEntity();
        serviceConfigEntity0._persistence_propertyChange("Repositories/repository_version_id", (java.lang.Object) clusterConfigEntity4, (java.lang.Object) 10);
        org.apache.ambari.server.orm.entities.HostGroupConfigEntity hostGroupConfigEntity7 = new org.apache.ambari.server.orm.entities.HostGroupConfigEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) clusterConfigEntity4);
        hostGroupConfigEntity7.setConfigAttributes("ambari_java_version");
        org.apache.ambari.server.orm.entities.BlueprintEntity blueprintEntity10 = new org.apache.ambari.server.orm.entities.BlueprintEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) hostGroupConfigEntity7);
        org.eclipse.persistence.internal.jpa.rs.metadata.model.Link link11 = blueprintEntity10._persistence_getHref();
        org.apache.ambari.server.orm.entities.StackEntity stackEntity12 = null;
        blueprintEntity10.setStack(stackEntity12);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(link11);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        java.lang.String str0 = org.apache.ambari.server.controller.internal.ClusterResourceProvider.CLUSTER_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "cluster_name" + "'", str0.equals("cluster_name"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        org.apache.ambari.server.api.services.RoleAuthorizationService roleAuthorizationService1 = new org.apache.ambari.server.api.services.RoleAuthorizationService("/api/v1/views/*");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        org.apache.ambari.server.state.Alert[] alert_array0 = new org.apache.ambari.server.state.Alert[] {};
        java.util.ArrayList<org.apache.ambari.server.state.Alert> arraylist_alert1 = new java.util.ArrayList<org.apache.ambari.server.state.Alert>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.state.Alert>) arraylist_alert1, alert_array0);
        org.apache.ambari.server.events.AlertReceivedEvent alertReceivedEvent3 = new org.apache.ambari.server.events.AlertReceivedEvent((java.util.List<org.apache.ambari.server.state.Alert>) arraylist_alert1);
        org.junit.Assert.assertNotNull(alert_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        org.apache.ambari.server.controller.spi.Resource resource0 = null;
        org.apache.ambari.server.controller.spi.Resource[] resource_array1 = new org.apache.ambari.server.controller.spi.Resource[] {};
        java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource> linkedhashset_resource2 = new java.util.LinkedHashSet<org.apache.ambari.server.controller.spi.Resource>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.controller.spi.Resource>) linkedhashset_resource2, resource_array1);
        org.apache.ambari.server.controller.spi.RequestStatusMetaData requestStatusMetaData4 = null;
        org.apache.ambari.server.controller.internal.RequestStatusImpl requestStatusImpl5 = new org.apache.ambari.server.controller.internal.RequestStatusImpl(resource0, (java.util.Set<org.apache.ambari.server.controller.spi.Resource>) linkedhashset_resource2, requestStatusMetaData4);
        org.junit.Assert.assertNotNull(resource_array1);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
        org.apache.ambari.server.orm.dao.MetainfoDAO metainfoDAO0 = null;
        org.apache.ambari.server.metadata.ActionMetadata actionMetadata1 = null;
        org.apache.ambari.server.state.stack.OsFamily osFamily2 = null;
        org.apache.ambari.server.stack.StackContext stackContext3 = new org.apache.ambari.server.stack.StackContext(metainfoDAO0, actionMetadata1, osFamily2);
        stackContext3.executeRepoTasks();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        org.apache.ambari.server.state.quicklinks.Link link0 = new org.apache.ambari.server.state.quicklinks.Link();
        org.apache.ambari.server.state.quicklinks.Protocol protocol1 = link0.getProtocol();
        org.junit.Assert.assertNull(protocol1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        org.springframework.security.authentication.AuthenticationManager authenticationManager0 = null;
        org.springframework.security.authentication.AuthenticationManager authenticationManager1 = null;
        org.apache.ambari.server.configuration.Configuration configuration2 = null;
        org.apache.ambari.server.security.AmbariEntryPoint ambariEntryPoint3 = new org.apache.ambari.server.security.AmbariEntryPoint(configuration2);
        org.apache.ambari.server.audit.AuditLogger auditLogger4 = null;
        org.apache.ambari.server.security.authorization.PermissionHelper permissionHelper5 = null;
        org.apache.ambari.server.security.authentication.AmbariBasicAuthenticationFilter ambariBasicAuthenticationFilter6 = new org.apache.ambari.server.security.authentication.AmbariBasicAuthenticationFilter(authenticationManager1, ambariEntryPoint3, auditLogger4, permissionHelper5);
        org.apache.ambari.server.audit.AuditLogger auditLogger7 = null;
        org.apache.ambari.server.security.authorization.PermissionHelper permissionHelper8 = null;
        org.apache.ambari.server.security.authentication.AmbariBasicAuthenticationFilter ambariBasicAuthenticationFilter9 = new org.apache.ambari.server.security.authentication.AmbariBasicAuthenticationFilter(authenticationManager0, ambariEntryPoint3, auditLogger7, permissionHelper8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        org.apache.ambari.server.orm.entities.StackEntity stackEntity1 = null;
        serviceConfigEntity0._persistence_set_stack(stackEntity1);
        serviceConfigEntity0._persistence_set_clusterId((java.lang.Long) 10L);
        java.lang.Object obj5 = serviceConfigEntity0._persistence_post_clone();
        serviceConfigEntity0.setCreateTimestamp((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(obj5);
    }
}
