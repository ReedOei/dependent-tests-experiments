import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.ambari.server.api.services.ClusterService clusterService0 = new org.apache.ambari.server.api.services.ClusterService();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.ambari.server.orm.dao.ExecutionCommandDAO executionCommandDAO0 = new org.apache.ambari.server.orm.dao.ExecutionCommandDAO();
        org.apache.ambari.server.orm.entities.ExecutionCommandEntity executionCommandEntity2 = executionCommandDAO0.findByPK((long) (short) 100);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.ambari.server.state.alert.AlertDefinition alertDefinition0 = new org.apache.ambari.server.state.alert.AlertDefinition();
        org.junit.Assert.assertTrue("Contract failed: alertDefinition0.equals(alertDefinition0)", alertDefinition0.equals(alertDefinition0));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.ambari.server.controller.utilities.KerberosChecker.checkJaasConfiguration();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.ambari.server.agent.ExecutionCommand executionCommand0 = new org.apache.ambari.server.agent.ExecutionCommand();
        org.junit.Assert.assertTrue("Contract failed: executionCommand0.equals(executionCommand0)", executionCommand0.equals(executionCommand0));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.ambari.server.orm.dao.SettingDAO settingDAO0 = new org.apache.ambari.server.orm.dao.SettingDAO();
        settingDAO0.removeByName("artifact_data");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.ambari.server.state.ExtensionInfo extensionInfo0 = new org.apache.ambari.server.state.ExtensionInfo();
        org.junit.Assert.assertTrue("Contract failed: compareTo-reflexive on extensionInfo0", extensionInfo0.compareTo(extensionInfo0) == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.ambari.server.orm.dao.TopologyHostGroupDAO topologyHostGroupDAO0 = new org.apache.ambari.server.orm.dao.TopologyHostGroupDAO();
        org.apache.ambari.server.orm.entities.TopologyHostGroupEntity topologyHostGroupEntity3 = topologyHostGroupDAO0.findByRequestIdAndName((long) '#', "Actions/default_timeout");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.ambari.server.orm.dao.AmbariConfigurationDAO ambariConfigurationDAO0 = new org.apache.ambari.server.orm.dao.AmbariConfigurationDAO();
        org.apache.ambari.server.orm.entities.AmbariConfigurationEntity[] ambariConfigurationEntity_array1 = new org.apache.ambari.server.orm.entities.AmbariConfigurationEntity[] {};
        java.util.ArrayList<org.apache.ambari.server.orm.entities.AmbariConfigurationEntity> arraylist_ambariConfigurationEntity2 = new java.util.ArrayList<org.apache.ambari.server.orm.entities.AmbariConfigurationEntity>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<org.apache.ambari.server.orm.entities.AmbariConfigurationEntity>) arraylist_ambariConfigurationEntity2, ambariConfigurationEntity_array1);
        ambariConfigurationDAO0.remove((java.util.Collection<org.apache.ambari.server.orm.entities.AmbariConfigurationEntity>) arraylist_ambariConfigurationEntity2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.ambari.server.controller.utilities.DatabaseChecker.checkDBVersion();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.ambari.server.orm.dao.UpgradeDAO upgradeDAO0 = new org.apache.ambari.server.orm.dao.UpgradeDAO();
        org.apache.ambari.server.orm.entities.UpgradeEntity upgradeEntity2 = upgradeDAO0.findRevertable((long) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.ambari.server.audit.event.request.UpdateUpgradeItemRequestAuditEvent.UpdateUpgradeItemRequestAuditEventBuilder updateUpgradeItemRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.UpdateUpgradeItemRequestAuditEvent.builder();
        org.apache.ambari.server.audit.event.request.UpdateUpgradeItemRequestAuditEvent updateUpgradeItemRequestAuditEvent1 = updateUpgradeItemRequestAuditEventBuilder0.build();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity0 = new org.apache.ambari.server.orm.entities.PrincipalEntity();
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity1 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.beans.PropertyChangeListener propertyChangeListener2 = requestOperationLevelEntity1._persistence_getPropertyChangeListener();
        requestOperationLevelEntity1.setServiceName("Stage/stage_id");
        java.lang.Object obj5 = principalEntity0._persistence_new((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity1);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        principalEntity0._persistence_setPropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj5", obj5.equals(obj5) ? obj5.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.ambari.server.security.authorization.Users users0 = new org.apache.ambari.server.security.authorization.Users();
        org.apache.ambari.server.security.authorization.User user2 = users0.getUser((java.lang.Integer) 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.ambari.server.orm.dao.SettingDAO settingDAO0 = new org.apache.ambari.server.orm.dao.SettingDAO();
        settingDAO0.removeByName("from_repo_version_id");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.ambari.server.checks.DatabaseConsistencyCheckResult databaseConsistencyCheckResult1 = org.apache.ambari.server.checks.DatabaseConsistencyCheckHelper.runAllDBChecks(false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.ambari.server.actionmanager.Stage stage5 = org.apache.ambari.server.utils.StageUtils.getATestStage((long) '#', (long) 'a', "org.apache.ambari.server.serveraction.kerberos.KerberosAdminAuthenticationException: Hosts/*", "ViewInstanceInfo/icon_path", "STANDARD");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity0 = new org.apache.ambari.server.orm.entities.PrincipalEntity();
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity1 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.beans.PropertyChangeListener propertyChangeListener2 = requestOperationLevelEntity1._persistence_getPropertyChangeListener();
        requestOperationLevelEntity1.setServiceName("Stage/stage_id");
        java.lang.Object obj5 = principalEntity0._persistence_new((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity1);
        java.lang.Long long6 = principalEntity0.getId();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj5", obj5.equals(obj5) ? obj5.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity0 = new org.apache.ambari.server.orm.entities.PrincipalEntity();
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity1 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.beans.PropertyChangeListener propertyChangeListener2 = requestOperationLevelEntity1._persistence_getPropertyChangeListener();
        requestOperationLevelEntity1.setServiceName("Stage/stage_id");
        java.lang.Object obj5 = principalEntity0._persistence_new((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity1);
        org.apache.ambari.server.orm.entities.RequestEntity requestEntity6 = null;
        requestOperationLevelEntity1.setRequestEntity(requestEntity6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj5", obj5.equals(obj5) ? obj5.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.ambari.server.orm.dao.PrivilegeDAO privilegeDAO0 = new org.apache.ambari.server.orm.dao.PrivilegeDAO();
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity1 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Long long2 = requestOperationLevelEntity1._persistence_get_operationLevelId();
        org.apache.ambari.server.orm.entities.PrivilegeEntity privilegeEntity3 = new org.apache.ambari.server.orm.entities.PrivilegeEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity1);
        org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity4 = privilegeEntity3.getPrincipal();
        privilegeDAO0.create(privilegeEntity3);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.ambari.server.orm.dao.HostDAO hostDAO0 = new org.apache.ambari.server.orm.dao.HostDAO();
        org.apache.ambari.server.orm.entities.HostEntity hostEntity2 = hostDAO0.findById((long) (short) 100);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO0 = new org.apache.ambari.server.orm.dao.HostComponentStateDAO();
        java.util.List<org.apache.ambari.server.orm.entities.HostComponentStateEntity> list_hostComponentStateEntity2 = hostComponentStateDAO0.findByService("AMBARI.ADMINISTRATOR");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.ambari.server.orm.dao.KeyValueDAO keyValueDAO0 = new org.apache.ambari.server.orm.dao.KeyValueDAO();
        java.util.Collection<org.apache.ambari.server.orm.entities.KeyValueEntity> collection_keyValueEntity1 = keyValueDAO0.findAll();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.ambari.server.orm.dao.ExecutionCommandDAO executionCommandDAO0 = new org.apache.ambari.server.orm.dao.ExecutionCommandDAO();
        org.apache.ambari.server.orm.entities.ExecutionCommandEntity executionCommandEntity2 = executionCommandDAO0.findByPK(0L);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.ambari.server.orm.dao.HostComponentStateDAO hostComponentStateDAO0 = new org.apache.ambari.server.orm.dao.HostComponentStateDAO();
        org.apache.ambari.server.orm.entities.HostComponentStateEntity hostComponentStateEntity2 = hostComponentStateDAO0.findById(10L);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.ambari.server.orm.entities.ServiceConfigEntity serviceConfigEntity0 = new org.apache.ambari.server.orm.entities.ServiceConfigEntity();
        org.apache.ambari.server.orm.entities.StackEntity stackEntity1 = serviceConfigEntity0._persistence_get_stack();
        org.apache.ambari.server.orm.entities.RequestOperationLevelEntity requestOperationLevelEntity3 = new org.apache.ambari.server.orm.entities.RequestOperationLevelEntity();
        java.lang.Object obj4 = requestOperationLevelEntity3._persistence_post_clone();
        serviceConfigEntity0._persistence_set("java_home", (java.lang.Object) requestOperationLevelEntity3);
        org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity serviceComponentDesiredStateEntity6 = new org.apache.ambari.server.orm.entities.ServiceComponentDesiredStateEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestOperationLevelEntity3);
        boolean b7 = serviceComponentDesiredStateEntity6.isRecoveryEnabled();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO hostComponentDesiredStateDAO0 = new org.apache.ambari.server.orm.dao.HostComponentDesiredStateDAO();
        org.apache.ambari.server.orm.entities.HostComponentDesiredStateEntity hostComponentDesiredStateEntity4 = hostComponentDesiredStateDAO0.findByServiceComponentAndHost("host_group", "Clusters/cluster_id", "WidgetLayoutInfo/section_name");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.ambari.server.orm.dao.ConfigGroupDAO configGroupDAO0 = new org.apache.ambari.server.orm.dao.ConfigGroupDAO();
        org.apache.ambari.server.orm.entities.ConfigGroupEntity configGroupEntity2 = configGroupDAO0.findByName("RANGER_ADMIN");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.ambari.server.audit.event.request.ConfigurationChangeRequestAuditEvent.ConfigurationChangeRequestAuditEventBuilder configurationChangeRequestAuditEventBuilder0 = org.apache.ambari.server.audit.event.request.ConfigurationChangeRequestAuditEvent.builder();
        org.apache.ambari.server.audit.event.request.ConfigurationChangeRequestAuditEvent configurationChangeRequestAuditEvent1 = configurationChangeRequestAuditEventBuilder0.build();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent.AddRepositoryRequestAuditEventBuilder addRepositoryRequestAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent.AddRepositoryRequestAuditEventBuilder();
        org.apache.ambari.server.audit.event.request.AddRepositoryRequestAuditEvent addRepositoryRequestAuditEvent1 = addRepositoryRequestAuditEventBuilder0.build();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.ambari.server.actionmanager.Stage stage5 = org.apache.ambari.server.utils.StageUtils.getATestStage((long) (-1), (long) 10, "Versions/active", "service_check_type", "minimal");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.ambari.server.orm.entities.RequestResourceFilterEntity requestResourceFilterEntity0 = new org.apache.ambari.server.orm.entities.RequestResourceFilterEntity();
        requestResourceFilterEntity0._persistence_set_componentName("javax.net.ssl.trustStorePassword");
        requestResourceFilterEntity0._persistence_checkFetched("host_id");
        java.lang.Long long5 = requestResourceFilterEntity0.getFilterId();
        org.apache.ambari.server.orm.entities.GroupEntity groupEntity6 = new org.apache.ambari.server.orm.entities.GroupEntity((org.eclipse.persistence.internal.descriptors.PersistenceObject) requestResourceFilterEntity0);
        org.apache.ambari.server.orm.entities.PrincipalEntity principalEntity7 = new org.apache.ambari.server.orm.entities.PrincipalEntity();
        groupEntity6._persistence_set_principal(principalEntity7);
        org.eclipse.persistence.internal.identitymaps.CacheKey cacheKey9 = groupEntity6._persistence_getCacheKey();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on principalEntity7 and principalEntity7", principalEntity7.equals(principalEntity7) ? principalEntity7.hashCode() == principalEntity7.hashCode() : true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.ambari.server.orm.dao.KeyValueDAO keyValueDAO0 = new org.apache.ambari.server.orm.dao.KeyValueDAO();
        org.apache.ambari.server.orm.entities.KeyValueEntity keyValueEntity2 = keyValueDAO0.findByKey("ALL");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.ambari.server.orm.dao.SettingDAO settingDAO0 = new org.apache.ambari.server.orm.dao.SettingDAO();
        org.apache.ambari.server.orm.entities.SettingEntity settingEntity2 = settingDAO0.findByName("Cookie");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder addCredentialAuditEventBuilder0 = new org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder();
        org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent.AddCredentialAuditEventBuilder addCredentialAuditEventBuilder2 = addCredentialAuditEventBuilder0.withUserName("data_directory");
        org.apache.ambari.server.audit.event.request.AddCredentialRequestAuditEvent addCredentialRequestAuditEvent3 = addCredentialAuditEventBuilder0.build();
    }
}
