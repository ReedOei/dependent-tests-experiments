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
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("Master,sub=Replication", (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        org.apache.accumulo.core.client.Connector connector0 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker1 = new org.apache.accumulo.master.replication.StatusMaker(connector0);
        statusMaker1.setSourceTableName("Accumulo");
        statusMaker1.setSourceTableName("exportVersion");
        statusMaker1.setSourceTableName("hi!");
        statusMaker1.setSourceTableName("Accumulo");
        statusMaker1.setSourceTableName("numPeers");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "MasterReplication", "");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo((long) (byte) -1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.core.client.Connector connector5 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater6 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector5);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable7 = tracerepo_runnable3.call(1528496711176L, (java.lang.Runnable) finishedWorkUpdater6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable1);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater5 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector4);
        try {
            tracerepo_runnable1.undo(1528496739545L, (java.lang.Runnable) finishedWorkUpdater5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts1 = tableStats0.getLast();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState4 = tableStats0.getLastMasterState();
        org.junit.Assert.assertNotNull(map_iD_tableCounts1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertNull(masterState3);
        org.junit.Assert.assertNull(masterState4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        org.apache.accumulo.master.Master master0 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager1 = new org.apache.accumulo.master.recovery.RecoveryManager(master0);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent2 = null;
        org.apache.accumulo.master.Master master3 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager4 = new org.apache.accumulo.master.recovery.RecoveryManager(master3);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent5 = null;
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager7 = new org.apache.accumulo.master.recovery.RecoveryManager(master6);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent8 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str9 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b10 = recoveryManager7.recoverLogs(keyExtent8, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str9);
        boolean b11 = recoveryManager4.recoverLogs(keyExtent5, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str9);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent12 = null;
        org.apache.accumulo.master.Master master13 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager14 = new org.apache.accumulo.master.recovery.RecoveryManager(master13);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent15 = null;
        org.apache.accumulo.master.Master master16 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager17 = new org.apache.accumulo.master.recovery.RecoveryManager(master16);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent18 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str19 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b20 = recoveryManager17.recoverLogs(keyExtent18, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str19);
        boolean b21 = recoveryManager14.recoverLogs(keyExtent15, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str19);
        boolean b22 = recoveryManager4.recoverLogs(keyExtent12, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str19);
        boolean b23 = recoveryManager1.recoverLogs(keyExtent2, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str19);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent24 = null;
        org.apache.accumulo.master.Master master25 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager26 = new org.apache.accumulo.master.recovery.RecoveryManager(master25);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent27 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str28 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b29 = recoveryManager26.recoverLogs(keyExtent27, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str28);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent30 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str31 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b32 = recoveryManager26.recoverLogs(keyExtent30, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str31);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent33 = null;
        org.apache.accumulo.master.Master master34 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager35 = new org.apache.accumulo.master.recovery.RecoveryManager(master34);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent36 = null;
        org.apache.accumulo.master.Master master37 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager38 = new org.apache.accumulo.master.recovery.RecoveryManager(master37);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent39 = null;
        org.apache.accumulo.master.Master master40 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager41 = new org.apache.accumulo.master.recovery.RecoveryManager(master40);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent42 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str43 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b44 = recoveryManager41.recoverLogs(keyExtent42, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str43);
        boolean b45 = recoveryManager38.recoverLogs(keyExtent39, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str43);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent46 = null;
        org.apache.accumulo.master.Master master47 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager48 = new org.apache.accumulo.master.recovery.RecoveryManager(master47);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent49 = null;
        org.apache.accumulo.master.Master master50 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager51 = new org.apache.accumulo.master.recovery.RecoveryManager(master50);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent52 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str53 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b54 = recoveryManager51.recoverLogs(keyExtent52, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str53);
        boolean b55 = recoveryManager48.recoverLogs(keyExtent49, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str53);
        boolean b56 = recoveryManager38.recoverLogs(keyExtent46, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str53);
        boolean b57 = recoveryManager35.recoverLogs(keyExtent36, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str53);
        boolean b58 = recoveryManager26.recoverLogs(keyExtent33, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str53);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent59 = null;
        org.apache.accumulo.master.Master master60 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager61 = new org.apache.accumulo.master.recovery.RecoveryManager(master60);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent62 = null;
        org.apache.accumulo.master.Master master63 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager64 = new org.apache.accumulo.master.recovery.RecoveryManager(master63);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent65 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str66 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b67 = recoveryManager64.recoverLogs(keyExtent65, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str66);
        boolean b68 = recoveryManager61.recoverLogs(keyExtent62, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str66);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent69 = null;
        org.apache.accumulo.master.Master master70 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager71 = new org.apache.accumulo.master.recovery.RecoveryManager(master70);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent72 = null;
        org.apache.accumulo.master.Master master73 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager74 = new org.apache.accumulo.master.recovery.RecoveryManager(master73);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent75 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str76 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b77 = recoveryManager74.recoverLogs(keyExtent75, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str76);
        boolean b78 = recoveryManager71.recoverLogs(keyExtent72, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str76);
        boolean b79 = recoveryManager61.recoverLogs(keyExtent69, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str76);
        boolean b80 = recoveryManager26.recoverLogs(keyExtent59, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str76);
        boolean b81 = recoveryManager1.recoverLogs(keyExtent24, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str76);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("CancelCompactions", "srcDataVersion", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo(0L, master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady((long) (byte) 1, master10);
        java.lang.String str12 = shutdownTServer2.getReturn();
        org.apache.accumulo.master.Master master14 = null;
        long long15 = shutdownTServer2.isReady(0L, master14);
        org.junit.Assert.assertTrue(long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(long15 == 0L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "CancelCompactions", iD2, "maxReplicationThreads");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call((long) '#', master6);
        org.apache.accumulo.master.Master master9 = null;
        try {
            long long10 = exportTable4.isReady(1528496711176L, master9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(repo_master7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("hi!", "", "filesPendingReplication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496729268L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        try {
            unorderedWorkAssigner3.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ShutdownTServer", "replicationQueue10m", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady(1528496754499L, master5);
        org.junit.Assert.assertTrue(long6 == 0L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "filesPendingReplication");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call(0L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "RenameNamespace", "ExportTable");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call(1528496773138L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array3 = new byte[] { (byte) 0 };
        byte[] byte_array9 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array10 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting11 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting11, iteratorSetting_array10);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig13 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange14 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array3, byte_array9, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting11, compactionStrategyConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(iteratorSetting_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("Unordered Work Assigner", "replicationQueue", "replicationQueue10m", iD3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("replicationQueue10m", 1528496735927L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD6 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD11 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD12 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = null;
        java.lang.String[] str_array37 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str38, str_array37);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable40 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD11, iD12, "MasterReplication", map_str_str14, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable41 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD6, iD7, "ExportTable", map_str_str9, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable42 = new org.apache.accumulo.master.tableOps.CloneTable("srcDataVersion", iD1, iD2, "failures.txt", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.Master master44 = null;
        try {
            long long45 = cloneTable42.isReady(0L, master44);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "failures.txt", "TabletServer", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady(1528496711176L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "CancelCompactions", iD2, "maxReplicationThreads");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call((long) '#', master6);
        java.lang.String str8 = exportTable4.getReturn();
        org.junit.Assert.assertNotNull(repo_master7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner7 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector6);
        java.lang.String str8 = sequentialWorkAssigner7.getName();
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration9 = null;
        org.apache.accumulo.core.client.Connector connector10 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner11 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration9, connector10);
        java.lang.String str12 = unorderedWorkAssigner11.getName();
        org.apache.commons.configuration.Configuration configuration13 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration14 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration13);
        org.apache.accumulo.core.client.Connector connector15 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner16 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration14, connector15);
        org.apache.accumulo.core.client.Connector connector17 = null;
        unorderedWorkAssigner11.configure(accumuloConfiguration14, connector17);
        org.apache.accumulo.core.client.Connector connector19 = null;
        sequentialWorkAssigner7.configure(accumuloConfiguration14, connector19);
        org.apache.accumulo.core.client.Connector connector21 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner22 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration14, connector21);
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sequential Work Assigner" + "'", str8.equals("Sequential Work Assigner"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Unordered Work Assigner" + "'", str12.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = cancelCompactions2.call(1528496761210L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("", "RenameNamespace", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) '#', master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady((long) (-1), master8);
        org.apache.accumulo.master.Master master11 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master12 = createNamespace3.call(1528496754499L, master11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long9 == 0L);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        long long5 = shutdownTServer2.isReady((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        long long8 = shutdownTServer2.isReady(1L, master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady(1528496719616L, master10);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertTrue(long8 == 0L);
        org.junit.Assert.assertTrue(long11 == 0L);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater7 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector6);
        try {
            long long8 = tracerepo_runnable4.isReady(1528496739572L, (java.lang.Runnable) finishedWorkUpdater7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo(0L, master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady(10L, master10);
        org.apache.accumulo.master.Master master13 = null;
        long long14 = shutdownTServer2.isReady((-1L), master13);
        org.junit.Assert.assertTrue(long11 == 0L);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("hi!", "", "filesPendingReplication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady((long) (-1), master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "CreateNamespace");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        long long3 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD4 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts5 = tableStats0.getLast(iD4);
        long long6 = tableStats0.getScanTime();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertTrue(long3 == 1528496788141L);
        org.junit.Assert.assertNotNull(tableCounts5);
        org.junit.Assert.assertTrue(long6 == 1528496788142L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "ExportTable", "", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = bulkImport4.call(1528496762020L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = cancelCompactions2.isReady(1528496772103L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        try {
            java.lang.String str5 = tracerepo_runnable2.getReturn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("Accumulo", 1528496719616L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array3 = new byte[] { (byte) -1 };
        byte[] byte_array4 = null;
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array5 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting6 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting6, iteratorSetting_array5);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig8 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange9 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array3, byte_array4, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting6, compactionStrategyConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(iteratorSetting_array5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("hi!", "", "filesPendingReplication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496772103L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call(1528496735927L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "^([a-z0-9]+)$", iD2, "Master,sub=Replication");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call(1528496761210L, master6);
        org.junit.Assert.assertNotNull(repo_master7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array5 = new byte[] { (byte) 100, (byte) -1, (byte) 100 };
        byte[] byte_array7 = new byte[] { (byte) 0 };
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array8 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting9 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting9, iteratorSetting_array8);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig11 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange12 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array5, byte_array7, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting9, compactionStrategyConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(iteratorSetting_array8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("RenameNamespace", "", map_str_str2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, (long) 10, false, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Accumulo", "Accumulo", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady(1528496734124L, master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady(1528496762935L, master8);
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(long9 == 0L);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("Master,sub=Replication", "Accumulo", "replicationQueue", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(1528496734124L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("CancelCompactions", "maxReplicationThreads", "Unordered Work Assigner", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(1528496788141L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496762934L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "CancelCompactions", "replicationQueue10m", false);
        java.lang.String str5 = bulkImport4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            long long8 = bulkImport4.isReady((long) 'a', master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "", "RenameTable", true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD6 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD11 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD12 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = null;
        java.lang.String[] str_array37 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str38, str_array37);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable40 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD11, iD12, "MasterReplication", map_str_str14, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable41 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD6, iD7, "ExportTable", map_str_str9, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable42 = new org.apache.accumulo.master.tableOps.CloneTable("", iD1, iD2, "RenameNamespace", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.Master master44 = null;
        try {
            cloneTable42.undo(0L, master44);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "", "maxReplicationThreads", false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("RenameNamespace", 1528496762349L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, 1528496762934L, true, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "", "MasterReplication", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo(1528496754499L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "^([a-z0-9]+)$", "exportVersion");
        java.lang.String str5 = renameTable4.getReturn();
        java.lang.String str6 = renameTable4.getDescription();
        org.apache.accumulo.master.Master master8 = null;
        try {
            long long9 = renameTable4.isReady((long) 1, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "RenameTable" + "'", str6.equals("RenameTable"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1528496751307L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "RenameTable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array27 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str28, str_array27);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable30 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD1, iD2, "MasterReplication", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str28);
        org.apache.accumulo.master.Master master32 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master33 = cloneTable30.call(1528496762935L, master32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.core.client.Connector connector5 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater6 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector5);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable7 = tracerepo_runnable2.call(1528496731343L, (java.lang.Runnable) finishedWorkUpdater6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        long long3 = tableStats0.getScanTime();
        tableStats0.begin();
        tableStats0.begin();
        long long6 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState8 = null;
        try {
            tableStats0.update(iD7, tabletState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertTrue(long6 == 0L);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("numPeers", "", "replicationQueue", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo(1528496751307L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ShutdownTServer", "replicationQueue10m", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo(1528496739765L, master5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts1 = tableStats0.getLast();
        long long2 = tableStats0.lastScanFinished();
        org.junit.Assert.assertNotNull(map_iD_tableCounts1);
        org.junit.Assert.assertTrue(long2 == 0L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "maxReplicationThreads", "Master,sub=Replication", iD3);
        java.lang.String str5 = importTable4.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.checkVersions(master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ImportTable" + "'", str5.equals("ImportTable"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "^([a-z0-9]+)$", iD2, "Master,sub=Replication");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call((long) 10, master6);
        org.junit.Assert.assertNotNull(repo_master7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Unordered Work Assigner", "Data-Center Replication Metrics");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo(1528496727977L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "filesPendingReplication", "Data-Center Replication Metrics");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "RenameNamespace", "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo(1528496726670L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = null;
        tableStats0.end(masterState3);
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState6 = null;
        tableStats0.end(masterState6);
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(masterState5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts1 = tableStats0.getLast();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD4 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts5 = tableStats0.getLast(iD4);
        org.junit.Assert.assertNotNull(map_iD_tableCounts1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertNull(masterState3);
        org.junit.Assert.assertNotNull(tableCounts5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        long long3 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD4 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts5 = tableStats0.getLast(iD4);
        long long6 = tableStats0.lastScanFinished();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertTrue(long3 == 1528496794824L);
        org.junit.Assert.assertNotNull(tableCounts5);
        org.junit.Assert.assertTrue(long6 == 0L);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner2 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration0, connector1);
        java.lang.String str3 = unorderedWorkAssigner2.getName();
        org.apache.commons.configuration.Configuration configuration4 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration5 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration5, connector6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        unorderedWorkAssigner2.configure(accumuloConfiguration5, connector8);
        java.lang.String str10 = unorderedWorkAssigner2.getName();
        java.lang.String str11 = unorderedWorkAssigner2.getName();
        java.lang.String str12 = unorderedWorkAssigner2.getName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration5);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Unordered Work Assigner" + "'", str10.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Unordered Work Assigner" + "'", str11.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Unordered Work Assigner" + "'", str12.equals("Unordered Work Assigner"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts4 = tableStats0.getLast();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts5 = tableStats0.getLast();
        tableStats0.begin();
        org.junit.Assert.assertTrue(long1 == 1528496794875L);
        org.junit.Assert.assertNull(masterState2);
        org.junit.Assert.assertNull(masterState3);
        org.junit.Assert.assertNotNull(map_iD_tableCounts4);
        org.junit.Assert.assertNotNull(map_iD_tableCounts5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "TabletServer", "numPeers", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496735055L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = cancelCompactions2.call(1528496754979L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Sequential Work Assigner", "Master");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = renameTable4.isReady(1L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("replicationQueue10m", "ImportTable", map_str_str2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ExportTable", "TabletServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) '#', master5);
        org.apache.accumulo.master.Master master8 = null;
        createNamespace3.undo((-1L), master8);
        org.apache.accumulo.master.Master master11 = null;
        createNamespace3.undo(1528496726670L, master11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = cancelCompactions2.isReady(1528496780429L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array2 = new byte[] {};
        byte[] byte_array3 = new byte[] {};
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array4 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting5 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting5, iteratorSetting_array4);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig7 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange8 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array2, byte_array3, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting5, compactionStrategyConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(iteratorSetting_array4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "RenameNamespace", "^([a-z0-9]+)$");
        java.lang.String str4 = renameNamespace3.getReturn();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("srcDataVersion", "filesPendingReplication", "Accumulo", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496727550L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "filesPendingReplication", "failures.txt", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo(1528496780429L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = cancelCompactions2.call(1528496788122L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Sequential Work Assigner", "Master");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496740080L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "failures.txt", "ShutdownTServer", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo(1528496735927L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        org.apache.accumulo.core.client.Connector connector0 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker1 = new org.apache.accumulo.master.replication.StatusMaker(connector0);
        statusMaker1.setSourceTableName("Accumulo");
        statusMaker1.setSourceTableName("exportVersion");
        statusMaker1.setSourceTableName("hi!");
        statusMaker1.setSourceTableName("Accumulo");
        statusMaker1.setSourceTableName("Master");
        try {
            statusMaker1.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        java.lang.String str6 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master8 = null;
        shutdownTServer2.undo(1528496751307L, master8);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ShutdownTServer" + "'", str6.equals("ShutdownTServer"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "master", "ShutdownTServer", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo(1528496739572L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts4 = tableStats0.getLast();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts5 = tableStats0.getLast();
        org.apache.accumulo.core.client.impl.Table.ID iD6 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState7 = null;
        try {
            tableStats0.update(iD6, tabletState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 1528496795366L);
        org.junit.Assert.assertNull(masterState2);
        org.junit.Assert.assertNull(masterState3);
        org.junit.Assert.assertNotNull(map_iD_tableCounts4);
        org.junit.Assert.assertNotNull(map_iD_tableCounts5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration4 = null;
        org.apache.accumulo.core.client.Connector connector5 = null;
        unorderedWorkAssigner3.configure(accumuloConfiguration4, connector5);
        java.lang.String str7 = unorderedWorkAssigner3.getName();
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Unordered Work Assigner" + "'", str7.equals("Unordered Work Assigner"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("^([a-z0-9]+)$", "srcDataVersion", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady((long) (short) 0, master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady(1528496752019L, master8);
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(long9 == 0L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("TabletServer", "maxReplicationThreads", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady((long) 5, master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady(1528496727711L, master8);
        org.apache.accumulo.master.Master master11 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master12 = createNamespace3.call(1528496733957L, master11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(long9 == 0L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts3 = tableStats0.getLast();
        org.apache.accumulo.core.master.thrift.MasterState masterState4 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = null;
        tableStats0.end(masterState5);
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        try {
            org.apache.accumulo.master.state.TableCounts tableCounts8 = tableStats0.getLast(iD7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(masterState2);
        org.junit.Assert.assertNotNull(map_iD_tableCounts3);
        org.junit.Assert.assertNull(masterState4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner3 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner9 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector8);
        java.lang.String str10 = unorderedWorkAssigner9.getName();
        java.lang.String str11 = unorderedWorkAssigner9.getName();
        java.lang.String str12 = unorderedWorkAssigner9.getName();
        java.lang.String str13 = unorderedWorkAssigner9.getName();
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Unordered Work Assigner" + "'", str10.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Unordered Work Assigner" + "'", str11.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Unordered Work Assigner" + "'", str12.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Unordered Work Assigner" + "'", str13.equals("Unordered Work Assigner"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "exportVersion", "^([a-z0-9]+)$", false);
        java.lang.String str5 = bulkImport4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            bulkImport4.undo(1528496730308L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        java.lang.String str3 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        shutdownTServer2.undo((long) (short) -1, master5);
        java.lang.String str7 = shutdownTServer2.getReturn();
        java.lang.String str8 = shutdownTServer2.getReturn();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ShutdownTServer" + "'", str3.equals("ShutdownTServer"));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "Sequential Work Assigner");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "maxReplicationThreads", "Master,sub=Replication", iD3);
        java.lang.String str5 = importTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            importTable4.undo((long) (-1), master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.hosted();
        int i3 = tableCounts0.assignedToDeadServers();
        int i4 = tableCounts0.hosted();
        int i5 = tableCounts0.unassigned();
        int i6 = tableCounts0.suspended();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner0 = new org.apache.accumulo.master.replication.SequentialWorkAssigner();
        org.apache.commons.configuration.Configuration configuration1 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration2 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration1);
        org.apache.accumulo.core.client.Connector connector3 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner4 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration2, connector3);
        org.apache.accumulo.core.client.Connector connector5 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner6 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration2, connector5);
        org.apache.accumulo.core.client.Connector connector7 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner8 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration2, connector7);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration9 = null;
        org.apache.accumulo.core.client.Connector connector10 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner11 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration9, connector10);
        org.apache.commons.configuration.Configuration configuration12 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration13 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration12);
        org.apache.accumulo.core.client.Connector connector14 = null;
        sequentialWorkAssigner11.configure(accumuloConfiguration13, connector14);
        org.apache.accumulo.core.client.Connector connector16 = null;
        sequentialWorkAssigner8.configure(accumuloConfiguration13, connector16);
        org.apache.accumulo.core.client.Connector connector18 = null;
        sequentialWorkAssigner0.configure(accumuloConfiguration13, connector18);
        org.apache.accumulo.master.Master master20 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory21 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration13, master20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration2);
        org.junit.Assert.assertNotNull(accumuloConfiguration13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, 1528496730542L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, (long) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call((long) ' ', master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("exportVersion", 1528496730373L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = null;
        tableStats0.end(masterState2);
        tableStats0.begin();
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState6 = null;
        try {
            tableStats0.update(iD5, tabletState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 0L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue", "Unordered Work Assigner", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady(1528496762935L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("numPeers", (long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        long long3 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD4 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts5 = tableStats0.getLast(iD4);
        org.apache.accumulo.core.master.thrift.MasterState masterState6 = null;
        tableStats0.end(masterState6);
        org.apache.accumulo.core.client.impl.Table.ID iD8 = null;
        try {
            org.apache.accumulo.master.state.TableCounts tableCounts9 = tableStats0.getLast(iD8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertTrue(long3 == 1528496795811L);
        org.junit.Assert.assertNotNull(tableCounts5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue10m", "MasterReplication");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call((long) (byte) -1, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = null;
        tableStats0.end(masterState3);
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts6 = tableStats0.getLast(iD5);
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts8 = tableStats0.getLast(iD7);
        int i9 = tableCounts8.hosted();
        int i10 = tableCounts8.unassigned();
        int i11 = tableCounts8.assigned();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNotNull(tableCounts6);
        org.junit.Assert.assertNotNull(tableCounts8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner2 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration0, connector1);
        java.lang.String str3 = unorderedWorkAssigner2.getName();
        java.lang.String str4 = unorderedWorkAssigner2.getName();
        java.lang.String str5 = unorderedWorkAssigner2.getName();
        org.apache.commons.configuration.Configuration configuration6 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration7 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner9 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration7, connector8);
        org.apache.accumulo.core.client.Connector connector10 = null;
        unorderedWorkAssigner2.configure(accumuloConfiguration7, connector10);
        org.apache.accumulo.core.client.Connector connector12 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner13 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration7, connector12);
        try {
            sequentialWorkAssigner13.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Unordered Work Assigner" + "'", str4.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Unordered Work Assigner" + "'", str5.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Sequential Work Assigner", "failures.txt");
        java.lang.String str4 = renameNamespace3.getReturn();
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameNamespace3.undo((long) '4', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = cancelCompactions2.isReady((long) 1, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("failures.txt", 1528496762020L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD6 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = null;
        java.lang.String[] str_array23 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str24, str_array23);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable26 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD6, iD7, "", map_str_str9, (java.util.Set<java.lang.String>) linkedhashset_str24);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable27 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "Data-Center Replication Metrics", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str24);
        org.apache.accumulo.master.Master master29 = null;
        try {
            long long30 = cloneTable27.isReady(1528496772103L, master29);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array23);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("replicationQueue", "hi!", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo(1528496731344L, master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady((long) (short) -1, master8);
        org.apache.accumulo.master.Master master11 = null;
        long long12 = createNamespace3.isReady((long) 0, master11);
        org.junit.Assert.assertTrue(long9 == 0L);
        org.junit.Assert.assertTrue(long12 == 0L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, 1528496711176L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("failures.txt", 1528496739765L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, 1528496711176L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady((long) (byte) 1, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD6 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD11 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD12 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD16 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD17 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str19 = null;
        java.lang.String[] str_array42 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str43, str_array42);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable45 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD16, iD17, "MasterReplication", map_str_str19, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable46 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD11, iD12, "ExportTable", map_str_str14, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable47 = new org.apache.accumulo.master.tableOps.CloneTable("", iD6, iD7, "^([a-z0-9]+)$", map_str_str9, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable48 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD1, iD2, "hi!", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.Master master50 = null;
        try {
            long long51 = cloneTable48.isReady(1528496730542L, master50);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array42);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner0 = new org.apache.accumulo.master.replication.SequentialWorkAssigner();
        java.lang.String str1 = sequentialWorkAssigner0.getName();
        org.apache.commons.configuration.Configuration configuration2 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration3 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner5 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration3, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration3, connector6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        sequentialWorkAssigner0.configure(accumuloConfiguration3, connector8);
        org.apache.commons.configuration.Configuration configuration10 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration11 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration10);
        org.apache.accumulo.core.client.Connector connector12 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner13 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration11, connector12);
        org.apache.accumulo.core.client.Connector connector14 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner15 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration11, connector14);
        java.lang.String str16 = sequentialWorkAssigner15.getName();
        org.apache.commons.configuration.Configuration configuration17 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration18 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration17);
        org.apache.accumulo.core.client.Connector connector19 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner20 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration18, connector19);
        org.apache.accumulo.core.client.Connector connector21 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner22 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration18, connector21);
        org.apache.accumulo.core.client.Connector connector23 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner24 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration18, connector23);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration25 = null;
        org.apache.accumulo.core.client.Connector connector26 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner27 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration25, connector26);
        org.apache.commons.configuration.Configuration configuration28 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration29 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration28);
        org.apache.accumulo.core.client.Connector connector30 = null;
        sequentialWorkAssigner27.configure(accumuloConfiguration29, connector30);
        org.apache.accumulo.core.client.Connector connector32 = null;
        sequentialWorkAssigner24.configure(accumuloConfiguration29, connector32);
        org.apache.accumulo.core.client.Connector connector34 = null;
        sequentialWorkAssigner15.configure(accumuloConfiguration29, connector34);
        org.apache.accumulo.core.client.Connector connector36 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner37 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration29, connector36);
        org.apache.accumulo.core.client.Connector connector38 = null;
        sequentialWorkAssigner0.configure(accumuloConfiguration29, connector38);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Sequential Work Assigner" + "'", str1.equals("Sequential Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration3);
        org.junit.Assert.assertNotNull(accumuloConfiguration11);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Sequential Work Assigner" + "'", str16.equals("Sequential Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration18);
        org.junit.Assert.assertNotNull(accumuloConfiguration29);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "ExportTable", iD2, "^([a-z0-9]+)$");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.hosted();
        int i3 = tableCounts0.hosted();
        int i4 = tableCounts0.unassigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady(1528496739545L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.util.Set<java.lang.String> set_str5 = null;
        org.apache.accumulo.master.tableOps.CloneTable cloneTable6 = new org.apache.accumulo.master.tableOps.CloneTable("filesPendingReplication", iD1, iD2, "srcDataVersion", map_str_str4, set_str5);
        org.apache.accumulo.master.Master master8 = null;
        try {
            long long9 = cloneTable6.isReady((long) (short) -1, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "MasterReplication", "Accumulo");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo(1528496763437L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "filesPendingReplication", "failures.txt", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo(0L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.assigned();
        int i3 = tableCounts0.assigned();
        int i4 = tableCounts0.suspended();
        int i5 = tableCounts0.unassigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("srcDataVersion", "filesPendingReplication", "Accumulo", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo(1528496752019L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD6 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD11 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD12 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD16 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD17 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str19 = null;
        java.lang.String[] str_array42 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str43, str_array42);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable45 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD16, iD17, "MasterReplication", map_str_str19, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable46 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD11, iD12, "ExportTable", map_str_str14, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable47 = new org.apache.accumulo.master.tableOps.CloneTable("", iD6, iD7, "RenameNamespace", map_str_str9, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable48 = new org.apache.accumulo.master.tableOps.CloneTable("MasterReplication", iD1, iD2, "CreateNamespace", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.Master master50 = null;
        try {
            long long51 = cloneTable48.isReady(1528496719616L, master50);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array42);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "numPeers", "replicationQueue10m", false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        org.apache.accumulo.master.Master master0 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager1 = new org.apache.accumulo.master.recovery.RecoveryManager(master0);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent2 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str3 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b4 = recoveryManager1.recoverLogs(keyExtent2, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str3);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent5 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str6 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b7 = recoveryManager1.recoverLogs(keyExtent5, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str6);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent8 = null;
        org.apache.accumulo.master.Master master9 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager10 = new org.apache.accumulo.master.recovery.RecoveryManager(master9);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent11 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str12 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b13 = recoveryManager10.recoverLogs(keyExtent11, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str12);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent14 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str15 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b16 = recoveryManager10.recoverLogs(keyExtent14, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str15);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent17 = null;
        org.apache.accumulo.master.Master master18 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager19 = new org.apache.accumulo.master.recovery.RecoveryManager(master18);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent20 = null;
        org.apache.accumulo.master.Master master21 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager22 = new org.apache.accumulo.master.recovery.RecoveryManager(master21);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent23 = null;
        org.apache.accumulo.master.Master master24 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager25 = new org.apache.accumulo.master.recovery.RecoveryManager(master24);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent26 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str27 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b28 = recoveryManager25.recoverLogs(keyExtent26, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str27);
        boolean b29 = recoveryManager22.recoverLogs(keyExtent23, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str27);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent30 = null;
        org.apache.accumulo.master.Master master31 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager32 = new org.apache.accumulo.master.recovery.RecoveryManager(master31);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent33 = null;
        org.apache.accumulo.master.Master master34 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager35 = new org.apache.accumulo.master.recovery.RecoveryManager(master34);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent36 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str37 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b38 = recoveryManager35.recoverLogs(keyExtent36, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str37);
        boolean b39 = recoveryManager32.recoverLogs(keyExtent33, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str37);
        boolean b40 = recoveryManager22.recoverLogs(keyExtent30, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str37);
        boolean b41 = recoveryManager19.recoverLogs(keyExtent20, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str37);
        boolean b42 = recoveryManager10.recoverLogs(keyExtent17, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str37);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent43 = null;
        org.apache.accumulo.master.Master master44 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager45 = new org.apache.accumulo.master.recovery.RecoveryManager(master44);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent46 = null;
        org.apache.accumulo.master.Master master47 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager48 = new org.apache.accumulo.master.recovery.RecoveryManager(master47);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent49 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str50 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b51 = recoveryManager48.recoverLogs(keyExtent49, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str50);
        boolean b52 = recoveryManager45.recoverLogs(keyExtent46, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str50);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent53 = null;
        org.apache.accumulo.master.Master master54 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager55 = new org.apache.accumulo.master.recovery.RecoveryManager(master54);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent56 = null;
        org.apache.accumulo.master.Master master57 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager58 = new org.apache.accumulo.master.recovery.RecoveryManager(master57);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent59 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str60 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b61 = recoveryManager58.recoverLogs(keyExtent59, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str60);
        boolean b62 = recoveryManager55.recoverLogs(keyExtent56, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str60);
        boolean b63 = recoveryManager45.recoverLogs(keyExtent53, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str60);
        boolean b64 = recoveryManager10.recoverLogs(keyExtent43, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str60);
        boolean b65 = recoveryManager1.recoverLogs(keyExtent8, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str60);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "TabletServer", "numPeers", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496796009L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, 1528496752093L, false, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD6 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD11 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD12 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD16 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD17 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str19 = null;
        java.lang.String[] str_array42 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str43, str_array42);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable45 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD16, iD17, "MasterReplication", map_str_str19, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable46 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD11, iD12, "ExportTable", map_str_str14, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable47 = new org.apache.accumulo.master.tableOps.CloneTable("Sequential Work Assigner", iD6, iD7, "Sequential Work Assigner", map_str_str9, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable48 = new org.apache.accumulo.master.tableOps.CloneTable("failures.txt", iD1, iD2, "Accumulo", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.junit.Assert.assertNotNull(str_array42);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        org.apache.accumulo.master.EventCoordinator eventCoordinator0 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.master.EventCoordinator.Listener listener1 = eventCoordinator0.getListener();
        org.apache.accumulo.master.EventCoordinator eventCoordinator3 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD5 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master10 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager11 = new org.apache.accumulo.master.recovery.RecoveryManager(master10);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent12 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str13 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b14 = recoveryManager11.recoverLogs(keyExtent12, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str13);
        java.lang.Object[] obj_array15 = new java.lang.Object[] { validator_iD5, "replicationQueue", '4', (byte) 100, 100, recoveryManager11 };
        eventCoordinator3.event("TabletServer", obj_array15);
        org.apache.accumulo.core.util.Validator<java.lang.String> validator_str20 = org.apache.accumulo.master.util.TableValidators.NOT_SYSTEM;
        org.apache.accumulo.core.client.Connector connector22 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords23 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector22);
        java.lang.Object[] obj_array24 = new java.lang.Object[] { 1L, "maxReplicationThreads", validator_str20, 1.0d, connector22 };
        eventCoordinator3.event("maxReplicationThreads", obj_array24);
        eventCoordinator0.event("replicationQueue", obj_array24);
        org.apache.accumulo.master.state.TableStats tableStats28 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState29 = tableStats28.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts30 = tableStats28.getLast();
        org.apache.accumulo.core.client.Connector connector31 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker32 = new org.apache.accumulo.master.replication.StatusMaker(connector31);
        statusMaker32.setSourceTableName("Accumulo");
        statusMaker32.setSourceTableName("exportVersion");
        statusMaker32.setSourceTableName("replicationQueue10m");
        org.apache.accumulo.core.client.impl.Namespace.ID iD43 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable44 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD43);
        java.lang.Object[] obj_array46 = new java.lang.Object[] { map_iD_tableCounts30, statusMaker32, (-1), "", 1528496729268L };
        eventCoordinator0.event("Master", obj_array46);
        org.apache.accumulo.master.EventCoordinator eventCoordinator49 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.master.EventCoordinator.Listener listener50 = eventCoordinator49.getListener();
        org.apache.accumulo.master.EventCoordinator eventCoordinator52 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD54 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master59 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager60 = new org.apache.accumulo.master.recovery.RecoveryManager(master59);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent61 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str62 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b63 = recoveryManager60.recoverLogs(keyExtent61, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str62);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { validator_iD54, "replicationQueue", '4', (byte) 100, 100, recoveryManager60 };
        eventCoordinator52.event("TabletServer", obj_array64);
        org.apache.accumulo.core.util.Validator<java.lang.String> validator_str69 = org.apache.accumulo.master.util.TableValidators.NOT_SYSTEM;
        org.apache.accumulo.core.client.Connector connector71 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords72 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector71);
        java.lang.Object[] obj_array73 = new java.lang.Object[] { 1L, "maxReplicationThreads", validator_str69, 1.0d, connector71 };
        eventCoordinator52.event("maxReplicationThreads", obj_array73);
        eventCoordinator49.event("replicationQueue", obj_array73);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration77 = null;
        org.apache.accumulo.core.client.Connector connector78 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner79 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration77, connector78);
        java.lang.String str80 = unorderedWorkAssigner79.getName();
        org.apache.commons.configuration.Configuration configuration81 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration82 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration81);
        org.apache.accumulo.core.client.Connector connector83 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner84 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration82, connector83);
        org.apache.accumulo.core.client.Connector connector85 = null;
        unorderedWorkAssigner79.configure(accumuloConfiguration82, connector85);
        java.lang.String str87 = unorderedWorkAssigner79.getName();
        org.apache.accumulo.master.state.SetGoalState setGoalState88 = new org.apache.accumulo.master.state.SetGoalState();
        org.apache.accumulo.core.client.Connector connector89 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker90 = new org.apache.accumulo.master.replication.StatusMaker(connector89);
        org.apache.accumulo.master.state.SetGoalState setGoalState92 = new org.apache.accumulo.master.state.SetGoalState();
        java.lang.Object[] obj_array93 = new java.lang.Object[] { str87, setGoalState88, connector89, "ShutdownTServer", setGoalState92 };
        eventCoordinator49.event("srcDataVersion", obj_array93);
        eventCoordinator0.event("ShutdownTServer", obj_array93);
        org.junit.Assert.assertNotNull(listener1);
        org.junit.Assert.assertNotNull(validator_iD5);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(validator_str20);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertNull(masterState29);
        org.junit.Assert.assertNotNull(map_iD_tableCounts30);
        org.junit.Assert.assertNotNull(obj_array46);
        org.junit.Assert.assertNotNull(listener50);
        org.junit.Assert.assertNotNull(validator_iD54);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertNotNull(validator_str69);
        org.junit.Assert.assertNotNull(obj_array73);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "Unordered Work Assigner" + "'", str80.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration82);
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "Unordered Work Assigner" + "'", str87.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(obj_array93);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "RenameNamespace", "Accumulo", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = bulkImport4.call(1528496752019L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, 1528496739572L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner2 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration0, connector1);
        java.lang.String str3 = unorderedWorkAssigner2.getName();
        org.apache.commons.configuration.Configuration configuration4 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration5 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration5, connector6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        unorderedWorkAssigner2.configure(accumuloConfiguration5, connector8);
        java.lang.String str10 = unorderedWorkAssigner2.getName();
        org.apache.commons.configuration.Configuration configuration11 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration12 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration11);
        org.apache.accumulo.core.client.Connector connector13 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner14 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration12, connector13);
        org.apache.accumulo.core.client.Connector connector15 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner16 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration12, connector15);
        org.apache.accumulo.core.client.Connector connector17 = null;
        unorderedWorkAssigner2.configure(accumuloConfiguration12, connector17);
        org.apache.accumulo.core.client.Connector connector19 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner20 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration12, connector19);
        org.apache.accumulo.master.Master master21 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory22 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration12, master21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration5);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Unordered Work Assigner" + "'", str10.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = cancelCompactions2.call(1528496727977L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.assigned();
        int i3 = tableCounts0.hosted();
        int i4 = tableCounts0.assigned();
        int i5 = tableCounts0.suspended();
        int i6 = tableCounts0.unassigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo((long) (byte) 10, master7);
        org.apache.accumulo.master.Master master10 = null;
        shutdownTServer2.undo((long) (short) 10, master10);
        org.apache.accumulo.master.Master master13 = null;
        shutdownTServer2.undo(1528496750615L, master13);
        java.lang.String str15 = shutdownTServer2.getReturn();
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call((long) (byte) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner2 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration0, connector1);
        java.lang.String str3 = unorderedWorkAssigner2.getName();
        org.apache.commons.configuration.Configuration configuration4 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration5 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration5, connector6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        unorderedWorkAssigner2.configure(accumuloConfiguration5, connector8);
        org.apache.accumulo.core.client.Connector connector10 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner11 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration5, connector10);
        org.apache.accumulo.core.client.Connector connector12 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner13 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration5, connector12);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo(10L, master5);
        org.apache.accumulo.master.Master master8 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = createNamespace3.call(1528496730308L, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            cancelCompactions2.undo(1528496730308L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        java.lang.String str6 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master8 = null;
        shutdownTServer2.undo(1528496731343L, master8);
        java.lang.String str10 = shutdownTServer2.getReturn();
        org.apache.accumulo.master.Master master12 = null;
        long long13 = shutdownTServer2.isReady(1528496773264L, master12);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ShutdownTServer" + "'", str6.equals("ShutdownTServer"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(long13 == 0L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        org.apache.accumulo.core.client.impl.Table.ID iD4 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts5 = tableStats0.getLast(iD4);
        org.apache.accumulo.core.master.thrift.MasterState masterState6 = tableStats0.getLastMasterState();
        tableStats0.begin();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertNotNull(tableCounts5);
        org.junit.Assert.assertNull(masterState6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.getScanTime();
        long long2 = tableStats0.getScanTime();
        tableStats0.begin();
        org.apache.accumulo.core.client.impl.Table.ID iD4 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState5 = null;
        try {
            tableStats0.update(iD4, tabletState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 1528496798701L);
        org.junit.Assert.assertTrue(long2 == 1528496798701L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Unordered Work Assigner", "Data-Center Replication Metrics");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496737420L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "ShutdownTServer", "ExportTable");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "srcDataVersion", "ImportTable");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.tableOps.CloneTable> repo_cloneTable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<org.apache.accumulo.master.tableOps.CloneTable> tracerepo_cloneTable1 = new org.apache.accumulo.master.tableOps.TraceRepo<org.apache.accumulo.master.tableOps.CloneTable>(repo_cloneTable0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call((long) (byte) 0, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("^([a-z0-9]+)$", "CancelCompactions", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable1);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater5 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector4);
        try {
            tracerepo_runnable1.undo(1528496794875L, (java.lang.Runnable) finishedWorkUpdater5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = null;
        tableStats0.end(masterState5);
        org.apache.accumulo.core.master.thrift.MasterState masterState7 = null;
        tableStats0.end(masterState7);
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496798846L);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "maxReplicationThreads", "ImportTable");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array5 = new byte[] { (byte) 100, (byte) 100, (byte) 10 };
        byte[] byte_array6 = new byte[] {};
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array7 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting8 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting8, iteratorSetting_array7);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig10 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange11 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array5, byte_array6, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting8, compactionStrategyConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(iteratorSetting_array7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("Unordered Work Assigner", "ShutdownTServer", "MasterReplication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady((long) (short) -1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        org.apache.accumulo.fate.Repo<java.util.AbstractCollection<java.util.Collection<java.lang.String>>> repo_abstractcollection_collection_str0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.util.AbstractCollection<java.util.Collection<java.lang.String>>> tracerepo_abstractcollection_collection_str1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.util.AbstractCollection<java.util.Collection<java.lang.String>>>(repo_abstractcollection_collection_str0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "numPeers", iD2, "Thrift");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call(1528496733957L, master6);
        org.apache.accumulo.master.Master master9 = null;
        try {
            exportTable4.undo(1528496731343L, master9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(repo_master7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            cancelCompactions2.undo(1528496762934L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("Master", "CreateNamespace", "ShutdownTServer", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(1528496772103L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, 1528496750615L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "^([a-z0-9]+)$", "exportVersion");
        java.lang.String str5 = renameTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = renameTable4.call(1528496794968L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        byte[] byte_array7 = new byte[] {};
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array8 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting9 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting9, iteratorSetting_array8);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig11 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange12 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array6, byte_array7, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting9, compactionStrategyConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(iteratorSetting_array8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            deleteNamespace1.undo(1528496794875L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        java.lang.String str6 = shutdownTServer2.getDescription();
        java.lang.String str7 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master9 = null;
        long long10 = shutdownTServer2.isReady(1528496762934L, master9);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ShutdownTServer" + "'", str6.equals("ShutdownTServer"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ShutdownTServer" + "'", str7.equals("ShutdownTServer"));
        org.junit.Assert.assertTrue(long10 == 0L);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.getScanTime();
        tableStats0.begin();
        org.junit.Assert.assertTrue(long1 == 1528496799157L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496733232L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "hi!", "RenameNamespace");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ExportTable", "TabletServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) '#', master5);
        org.apache.accumulo.master.Master master8 = null;
        createNamespace3.undo((-1L), master8);
        org.apache.accumulo.master.Master master11 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master12 = createNamespace3.call(1528496733957L, master11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts6 = tableStats0.getLast(iD5);
        long long7 = tableStats0.getScanTime();
        long long8 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState9 = null;
        tableStats0.end(masterState9);
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496799250L);
        org.junit.Assert.assertNotNull(tableCounts6);
        org.junit.Assert.assertTrue(long7 == 1528496799251L);
        org.junit.Assert.assertTrue(long8 == 1528496799251L);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Master", "replicationQueue10m");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady(1528496794966L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "CancelCompactions", iD2, "maxReplicationThreads");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call((long) (byte) 100, master6);
        org.apache.accumulo.master.Master master9 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master10 = exportTable4.call(0L, master9);
        org.junit.Assert.assertNotNull(repo_master7);
        org.junit.Assert.assertNotNull(repo_master10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, 1528496731344L, false, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts6 = tableStats0.getLast(iD5);
        long long7 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.master.thrift.MasterState masterState8 = null;
        tableStats0.end(masterState8);
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496799336L);
        org.junit.Assert.assertNotNull(tableCounts6);
        org.junit.Assert.assertTrue(long7 == 0L);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner7 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector6);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration8 = null;
        org.apache.accumulo.core.client.Connector connector9 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner10 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration8, connector9);
        org.apache.commons.configuration.Configuration configuration11 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration12 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration11);
        org.apache.accumulo.core.client.Connector connector13 = null;
        sequentialWorkAssigner10.configure(accumuloConfiguration12, connector13);
        org.apache.accumulo.core.client.Connector connector15 = null;
        sequentialWorkAssigner7.configure(accumuloConfiguration12, connector15);
        org.apache.commons.configuration.Configuration configuration17 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration18 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration17);
        org.apache.accumulo.core.client.Connector connector19 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner20 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration18, connector19);
        org.apache.accumulo.core.client.Connector connector21 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner22 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration18, connector21);
        org.apache.accumulo.core.client.Connector connector23 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner24 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration18, connector23);
        org.apache.accumulo.core.client.Connector connector25 = null;
        sequentialWorkAssigner7.configure(accumuloConfiguration18, connector25);
        java.lang.String str27 = sequentialWorkAssigner7.getName();
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertNotNull(accumuloConfiguration12);
        org.junit.Assert.assertNotNull(accumuloConfiguration18);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Sequential Work Assigner" + "'", str27.equals("Sequential Work Assigner"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.core.client.Connector connector5 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords6 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector5);
        try {
            tracerepo_runnable3.undo(1528496739545L, (java.lang.Runnable) removeCompleteReplicationRecords6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Sequential Work Assigner", "Master");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = renameTable4.isReady((long) (byte) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.hosted();
        int i2 = tableCounts0.assigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "failures.txt", "RenameNamespace");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call((long) (byte) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1528496719616L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "master", "ShutdownTServer", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((long) 'a', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("", 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.util.Set<java.lang.String> set_str5 = null;
        org.apache.accumulo.master.tableOps.CloneTable cloneTable6 = new org.apache.accumulo.master.tableOps.CloneTable("filesPendingReplication", iD1, iD2, "srcDataVersion", map_str_str4, set_str5);
        org.apache.accumulo.master.Master master8 = null;
        try {
            long long9 = cloneTable6.isReady(1528496748452L, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "maxReplicationThreads");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState6 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts8 = tableStats0.getLast(iD7);
        int i9 = tableCounts8.assigned();
        int i10 = tableCounts8.suspended();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496799604L);
        org.junit.Assert.assertNull(masterState5);
        org.junit.Assert.assertNull(masterState6);
        org.junit.Assert.assertNotNull(tableCounts8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "ExportTable", iD2, "numPeers");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner3 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner9 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector8);
        java.lang.String str10 = unorderedWorkAssigner9.getName();
        java.lang.String str11 = unorderedWorkAssigner9.getName();
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner12 = new org.apache.accumulo.master.replication.SequentialWorkAssigner();
        java.lang.String str13 = sequentialWorkAssigner12.getName();
        java.lang.String str14 = sequentialWorkAssigner12.getName();
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration15 = null;
        org.apache.accumulo.core.client.Connector connector16 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner17 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration15, connector16);
        java.lang.String str18 = unorderedWorkAssigner17.getName();
        org.apache.commons.configuration.Configuration configuration19 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration20 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration19);
        org.apache.accumulo.core.client.Connector connector21 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner22 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration20, connector21);
        org.apache.accumulo.core.client.Connector connector23 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner24 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration20, connector23);
        org.apache.accumulo.core.client.Connector connector25 = null;
        unorderedWorkAssigner17.configure(accumuloConfiguration20, connector25);
        org.apache.accumulo.core.client.Connector connector27 = null;
        sequentialWorkAssigner12.configure(accumuloConfiguration20, connector27);
        org.apache.accumulo.core.client.Connector connector29 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner30 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration20, connector29);
        org.apache.accumulo.core.client.Connector connector31 = null;
        unorderedWorkAssigner9.configure(accumuloConfiguration20, connector31);
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Unordered Work Assigner" + "'", str10.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Unordered Work Assigner" + "'", str11.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Sequential Work Assigner" + "'", str13.equals("Sequential Work Assigner"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Sequential Work Assigner" + "'", str14.equals("Sequential Work Assigner"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Unordered Work Assigner" + "'", str18.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration20);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496731442L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "RenameNamespace", "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo(1528496772103L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.hosted();
        int i3 = tableCounts0.assignedToDeadServers();
        int i4 = tableCounts0.hosted();
        int i5 = tableCounts0.unassigned();
        int i6 = tableCounts0.assigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = cancelCompactions2.call((long) 1, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD6 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD11 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD12 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = null;
        java.lang.String[] str_array37 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str38, str_array37);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable40 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD11, iD12, "MasterReplication", map_str_str14, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable41 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD6, iD7, "ExportTable", map_str_str9, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable42 = new org.apache.accumulo.master.tableOps.CloneTable("Sequential Work Assigner", iD1, iD2, "Sequential Work Assigner", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str38);
        java.lang.String str43 = cloneTable42.getReturn();
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        long long3 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState4 = null;
        tableStats0.end(masterState4);
        org.apache.accumulo.core.master.thrift.MasterState masterState6 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState8 = null;
        try {
            tableStats0.update(iD7, tabletState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertNull(masterState6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = null;
        tableStats0.end(masterState2);
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts4 = tableStats0.getLast();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState6 = null;
        tableStats0.end(masterState6);
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts8 = tableStats0.getLast();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNull(map_iD_tableCounts4);
        org.junit.Assert.assertNull(masterState5);
        org.junit.Assert.assertNull(map_iD_tableCounts8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts4 = tableStats0.getLast(iD3);
        int i5 = tableCounts4.assigned();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertNotNull(tableCounts4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "maxReplicationThreads", "RenameNamespace");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496796010L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = null;
        tableStats0.end(masterState5);
        long long7 = tableStats0.getScanTime();
        long long8 = tableStats0.lastScanFinished();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts9 = tableStats0.getLast();
        org.apache.accumulo.core.master.thrift.MasterState masterState10 = tableStats0.getLastMasterState();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496800329L);
        org.junit.Assert.assertTrue(long7 == 1528496800329L);
        org.junit.Assert.assertTrue(long8 == 1528496800329L);
        org.junit.Assert.assertNull(map_iD_tableCounts9);
        org.junit.Assert.assertNull(masterState10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo(1528496799336L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("maxReplicationThreads", "numPeers", "Accumulo", iD3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array27 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str28, str_array27);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable30 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD1, iD2, "MasterReplication", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str28);
        org.apache.accumulo.master.Master master32 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master33 = cloneTable30.call(1528496727550L, master32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        org.apache.accumulo.core.client.Connector connector0 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker1 = new org.apache.accumulo.master.replication.StatusMaker(connector0);
        statusMaker1.setSourceTableName("Accumulo");
        statusMaker1.setSourceTableName("exportVersion");
        statusMaker1.setSourceTableName("replicationQueue10m");
        statusMaker1.setSourceTableName("numPeers");
        statusMaker1.setSourceTableName("Master");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "Master,sub=Replication", iD2, "Master");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner9 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector8);
        org.apache.accumulo.core.client.Connector connector10 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner11 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector10);
        org.apache.accumulo.core.client.Connector connector12 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner13 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector12);
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        try {
            java.lang.String str5 = tracerepo_runnable4.getReturn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call(1528496711176L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner9 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector8);
        org.apache.accumulo.core.client.Connector connector10 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner11 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector10);
        java.lang.String str12 = unorderedWorkAssigner11.getName();
        org.apache.commons.configuration.Configuration configuration13 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration14 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration13);
        org.apache.accumulo.core.client.Connector connector15 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner16 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration14, connector15);
        org.apache.accumulo.core.client.Connector connector17 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner18 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration14, connector17);
        org.apache.accumulo.core.client.Connector connector19 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner20 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration14, connector19);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration21 = null;
        org.apache.accumulo.core.client.Connector connector22 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner23 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration21, connector22);
        org.apache.commons.configuration.Configuration configuration24 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration25 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration24);
        org.apache.accumulo.core.client.Connector connector26 = null;
        sequentialWorkAssigner23.configure(accumuloConfiguration25, connector26);
        org.apache.accumulo.core.client.Connector connector28 = null;
        sequentialWorkAssigner20.configure(accumuloConfiguration25, connector28);
        org.apache.commons.configuration.Configuration configuration30 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration31 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration30);
        org.apache.accumulo.core.client.Connector connector32 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner33 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration31, connector32);
        org.apache.accumulo.core.client.Connector connector34 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner35 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration31, connector34);
        org.apache.accumulo.core.client.Connector connector36 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner37 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration31, connector36);
        org.apache.accumulo.core.client.Connector connector38 = null;
        sequentialWorkAssigner20.configure(accumuloConfiguration31, connector38);
        org.apache.accumulo.core.client.Connector connector40 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner41 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration31, connector40);
        org.apache.accumulo.core.client.Connector connector42 = null;
        unorderedWorkAssigner11.configure(accumuloConfiguration31, connector42);
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Unordered Work Assigner" + "'", str12.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration14);
        org.junit.Assert.assertNotNull(accumuloConfiguration25);
        org.junit.Assert.assertNotNull(accumuloConfiguration31);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD6 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = null;
        java.lang.String[] str_array32 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str33, str_array32);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable35 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD6, iD7, "MasterReplication", map_str_str9, (java.util.Set<java.lang.String>) linkedhashset_str33);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable36 = new org.apache.accumulo.master.tableOps.CloneTable("numPeers", iD1, iD2, "Master", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str33);
        org.apache.accumulo.master.Master master38 = null;
        try {
            cloneTable36.undo((long) (short) -1, master38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496799250L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call(1528496799157L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("replicationQueue10m", "TabletServer", "ExportTable", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo(1528496788122L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "ExportTable", iD2, "filesPendingReplication");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.suspended();
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner3 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner9 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector8);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration10 = null;
        org.apache.accumulo.core.client.Connector connector11 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner12 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration10, connector11);
        org.apache.commons.configuration.Configuration configuration13 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration14 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration13);
        org.apache.accumulo.core.client.Connector connector15 = null;
        sequentialWorkAssigner12.configure(accumuloConfiguration14, connector15);
        org.apache.accumulo.core.client.Connector connector17 = null;
        unorderedWorkAssigner9.configure(accumuloConfiguration14, connector17);
        org.apache.accumulo.core.client.Connector connector19 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner20 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration14, connector19);
        org.apache.commons.configuration.Configuration configuration21 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration22 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration21);
        org.apache.accumulo.core.client.Connector connector23 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner24 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration22, connector23);
        org.apache.accumulo.core.client.Connector connector25 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner26 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration22, connector25);
        org.apache.accumulo.core.client.Connector connector27 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner28 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration22, connector27);
        org.apache.accumulo.core.client.Connector connector29 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner30 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration22, connector29);
        org.apache.commons.configuration.Configuration configuration31 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration32 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration31);
        org.apache.accumulo.core.client.Connector connector33 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner34 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration32, connector33);
        org.apache.accumulo.core.client.Connector connector35 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner36 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration32, connector35);
        org.apache.accumulo.core.client.Connector connector37 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner38 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration32, connector37);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration39 = null;
        org.apache.accumulo.core.client.Connector connector40 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner41 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration39, connector40);
        org.apache.commons.configuration.Configuration configuration42 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration43 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration42);
        org.apache.accumulo.core.client.Connector connector44 = null;
        sequentialWorkAssigner41.configure(accumuloConfiguration43, connector44);
        org.apache.accumulo.core.client.Connector connector46 = null;
        sequentialWorkAssigner38.configure(accumuloConfiguration43, connector46);
        org.apache.accumulo.core.client.Connector connector48 = null;
        unorderedWorkAssigner30.configure(accumuloConfiguration43, connector48);
        org.apache.accumulo.core.client.Connector connector50 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner51 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration43, connector50);
        org.apache.accumulo.core.client.Connector connector52 = null;
        sequentialWorkAssigner20.configure(accumuloConfiguration43, connector52);
        try {
            sequentialWorkAssigner20.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertNotNull(accumuloConfiguration14);
        org.junit.Assert.assertNotNull(accumuloConfiguration22);
        org.junit.Assert.assertNotNull(accumuloConfiguration32);
        org.junit.Assert.assertNotNull(accumuloConfiguration43);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
        org.apache.accumulo.core.client.Connector connector0 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker1 = new org.apache.accumulo.master.replication.StatusMaker(connector0);
        statusMaker1.setSourceTableName("Accumulo");
        statusMaker1.setSourceTableName("exportVersion");
        statusMaker1.setSourceTableName("Sequential Work Assigner");
        try {
            statusMaker1.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "maxReplicationThreads", "srcDataVersion", false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState3 = null;
        try {
            tableStats0.update(iD2, tabletState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(masterState1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner0 = new org.apache.accumulo.master.replication.SequentialWorkAssigner();
        java.lang.String str1 = sequentialWorkAssigner0.getName();
        java.lang.String str2 = sequentialWorkAssigner0.getName();
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration3 = null;
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration3, connector4);
        java.lang.String str6 = unorderedWorkAssigner5.getName();
        org.apache.commons.configuration.Configuration configuration7 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration8 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration7);
        org.apache.accumulo.core.client.Connector connector9 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner10 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration8, connector9);
        org.apache.accumulo.core.client.Connector connector11 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner12 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration8, connector11);
        org.apache.accumulo.core.client.Connector connector13 = null;
        unorderedWorkAssigner5.configure(accumuloConfiguration8, connector13);
        org.apache.accumulo.core.client.Connector connector15 = null;
        sequentialWorkAssigner0.configure(accumuloConfiguration8, connector15);
        org.apache.accumulo.core.client.Connector connector17 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner18 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration8, connector17);
        org.apache.accumulo.core.client.Connector connector19 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner20 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration8, connector19);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Sequential Work Assigner" + "'", str1.equals("Sequential Work Assigner"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Sequential Work Assigner" + "'", str2.equals("Sequential Work Assigner"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Unordered Work Assigner" + "'", str6.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call(1528496729268L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "CancelCompactions", "replicationQueue10m", false);
        java.lang.String str5 = bulkImport4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            long long8 = bulkImport4.isReady(1528496785912L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1528496755389L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner2 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration0, connector1);
        java.lang.String str3 = unorderedWorkAssigner2.getName();
        java.lang.String str4 = unorderedWorkAssigner2.getName();
        java.lang.String str5 = unorderedWorkAssigner2.getName();
        org.apache.commons.configuration.Configuration configuration6 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration7 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner9 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration7, connector8);
        org.apache.accumulo.core.client.Connector connector10 = null;
        unorderedWorkAssigner2.configure(accumuloConfiguration7, connector10);
        org.apache.accumulo.core.client.Connector connector12 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner13 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration7, connector12);
        java.lang.String str14 = unorderedWorkAssigner13.getName();
        try {
            unorderedWorkAssigner13.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Unordered Work Assigner" + "'", str4.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Unordered Work Assigner" + "'", str5.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration7);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Unordered Work Assigner" + "'", str14.equals("Unordered Work Assigner"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "failures.txt", iD2, "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call(1528496752019L, master6);
        org.apache.accumulo.master.Master master9 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master10 = exportTable4.call(1528496739765L, master9);
        org.junit.Assert.assertNotNull(repo_master7);
        org.junit.Assert.assertNotNull(repo_master10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Unordered Work Assigner", "Data-Center Replication Metrics");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo((long) 'a', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte[] byte_array14 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1 };
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array15 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting16 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting16, iteratorSetting_array15);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig18 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange19 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array7, byte_array14, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting16, compactionStrategyConfig18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(iteratorSetting_array15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts4 = tableStats0.getLast(iD3);
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(masterState2);
        org.junit.Assert.assertNotNull(tableCounts4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("numPeers", "", "replicationQueue", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(1528496733232L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.assignedToDeadServers();
        int i2 = tableCounts0.assignedToDeadServers();
        int i3 = tableCounts0.assigned();
        int i4 = tableCounts0.suspended();
        int i5 = tableCounts0.suspended();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD6 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD11 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD12 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = null;
        java.lang.String[] str_array37 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str38, str_array37);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable40 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD11, iD12, "MasterReplication", map_str_str14, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable41 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD6, iD7, "ExportTable", map_str_str9, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable42 = new org.apache.accumulo.master.tableOps.CloneTable("", iD1, iD2, "^([a-z0-9]+)$", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.Master master44 = null;
        try {
            cloneTable42.undo(1528496785912L, master44);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = cancelCompactions2.call(1528496755389L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner2 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration0, connector1);
        org.apache.commons.configuration.Configuration configuration3 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration4 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration3);
        org.apache.accumulo.core.client.Connector connector5 = null;
        sequentialWorkAssigner2.configure(accumuloConfiguration4, connector5);
        org.apache.accumulo.core.client.Connector connector7 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner8 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration4, connector7);
        org.apache.accumulo.core.client.Connector connector9 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner10 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration4, connector9);
        org.apache.accumulo.core.client.Connector connector11 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner12 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration4, connector11);
        org.apache.accumulo.master.Master master13 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory14 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration4, master13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration4);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD6 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD11 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD12 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = null;
        java.lang.String[] str_array37 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str38, str_array37);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable40 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD11, iD12, "MasterReplication", map_str_str14, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable41 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD6, iD7, "ExportTable", map_str_str9, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable42 = new org.apache.accumulo.master.tableOps.CloneTable("", iD1, iD2, "^([a-z0-9]+)$", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.Master master44 = null;
        try {
            cloneTable42.undo(1528496735055L, master44);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Master", "ExportTable");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo(1528496719616L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "failures.txt", "Master,sub=Replication");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("replicationQueue", "hi!", map_str_str2);
        java.lang.String str4 = createNamespace3.getReturn();
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = createNamespace3.call(1528496751307L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "maxReplicationThreads", "Unordered Work Assigner");
        java.lang.String str5 = renameTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            renameTable4.undo((long) (byte) 0, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("filesPendingReplication", "CreateNamespace", map_str_str2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "^([a-z0-9]+)$", "Master,sub=Replication", false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo(0L, master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady(10L, master10);
        org.apache.accumulo.master.Master master13 = null;
        long long14 = shutdownTServer2.isReady((long) (short) 1, master13);
        java.lang.String str15 = shutdownTServer2.getReturn();
        org.junit.Assert.assertTrue(long11 == 0L);
        org.junit.Assert.assertTrue(long14 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("master", "MasterReplication", map_str_str2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "", "MasterReplication", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady(1528496711176L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "replicationQueue", iD2, "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call(0L, master6);
        org.apache.accumulo.master.Master master9 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master10 = exportTable4.call(1528496729847L, master9);
        org.junit.Assert.assertNotNull(repo_master7);
        org.junit.Assert.assertNotNull(repo_master10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "replicationQueue10m", "hi!");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496730542L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner3 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner9 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector8);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration10 = null;
        org.apache.accumulo.core.client.Connector connector11 = null;
        unorderedWorkAssigner9.configure(accumuloConfiguration10, connector11);
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts4 = tableStats0.getLast(iD3);
        long long5 = tableStats0.getScanTime();
        long long6 = tableStats0.getScanTime();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertNotNull(tableCounts4);
        org.junit.Assert.assertTrue(long5 == 1528496802217L);
        org.junit.Assert.assertTrue(long6 == 1528496802217L);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, 1528496729268L, false, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        long long3 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD4 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts5 = tableStats0.getLast(iD4);
        int i6 = tableCounts5.unassigned();
        int i7 = tableCounts5.assignedToDeadServers();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertTrue(long3 == 1528496802256L);
        org.junit.Assert.assertNotNull(tableCounts5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.assigned();
        int i3 = tableCounts0.assigned();
        int i4 = tableCounts0.suspended();
        int i5 = tableCounts0.hosted();
        int i6 = tableCounts0.unassigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("", "RenameNamespace", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) '#', master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady(1528496763437L, master8);
        org.junit.Assert.assertTrue(long9 == 0L);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = null;
        tableStats0.end(masterState2);
        long long4 = tableStats0.getScanTime();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertTrue(long4 == 1528496802314L);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
        org.apache.accumulo.fate.Repo<java.util.AbstractSet<java.lang.String>> repo_abstractset_str0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.util.AbstractSet<java.lang.String>> tracerepo_abstractset_str1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.util.AbstractSet<java.lang.String>>(repo_abstractset_str0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, (long) 100, true, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        tableStats0.begin();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts3 = tableStats0.getLast();
        org.apache.accumulo.core.master.thrift.MasterState masterState4 = null;
        tableStats0.end(masterState4);
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner0 = new org.apache.accumulo.master.replication.SequentialWorkAssigner();
        java.lang.String str1 = sequentialWorkAssigner0.getName();
        org.apache.commons.configuration.Configuration configuration2 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration3 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner5 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration3, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration3, connector6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        sequentialWorkAssigner0.configure(accumuloConfiguration3, connector8);
        java.lang.String str10 = sequentialWorkAssigner0.getName();
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration11 = null;
        org.apache.accumulo.core.client.Connector connector12 = null;
        sequentialWorkAssigner0.configure(accumuloConfiguration11, connector12);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Sequential Work Assigner" + "'", str1.equals("Sequential Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Sequential Work Assigner" + "'", str10.equals("Sequential Work Assigner"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner7 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector6);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration8 = null;
        org.apache.accumulo.core.client.Connector connector9 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner10 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration8, connector9);
        org.apache.commons.configuration.Configuration configuration11 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration12 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration11);
        org.apache.accumulo.core.client.Connector connector13 = null;
        sequentialWorkAssigner10.configure(accumuloConfiguration12, connector13);
        org.apache.accumulo.core.client.Connector connector15 = null;
        sequentialWorkAssigner7.configure(accumuloConfiguration12, connector15);
        org.apache.commons.configuration.Configuration configuration17 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration18 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration17);
        org.apache.accumulo.core.client.Connector connector19 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner20 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration18, connector19);
        org.apache.accumulo.core.client.Connector connector21 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner22 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration18, connector21);
        org.apache.accumulo.core.client.Connector connector23 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner24 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration18, connector23);
        org.apache.accumulo.core.client.Connector connector25 = null;
        sequentialWorkAssigner7.configure(accumuloConfiguration18, connector25);
        org.apache.commons.configuration.Configuration configuration27 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration28 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration27);
        org.apache.accumulo.core.client.Connector connector29 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner30 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration28, connector29);
        org.apache.accumulo.core.client.Connector connector31 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner32 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration28, connector31);
        org.apache.accumulo.core.client.Connector connector33 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner34 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration28, connector33);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration35 = null;
        org.apache.accumulo.core.client.Connector connector36 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner37 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration35, connector36);
        org.apache.commons.configuration.Configuration configuration38 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration39 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration38);
        org.apache.accumulo.core.client.Connector connector40 = null;
        sequentialWorkAssigner37.configure(accumuloConfiguration39, connector40);
        org.apache.accumulo.core.client.Connector connector42 = null;
        sequentialWorkAssigner34.configure(accumuloConfiguration39, connector42);
        org.apache.commons.configuration.Configuration configuration44 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration45 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration44);
        org.apache.accumulo.core.client.Connector connector46 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner47 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration45, connector46);
        org.apache.accumulo.core.client.Connector connector48 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner49 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration45, connector48);
        org.apache.accumulo.core.client.Connector connector50 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner51 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration45, connector50);
        org.apache.accumulo.core.client.Connector connector52 = null;
        sequentialWorkAssigner34.configure(accumuloConfiguration45, connector52);
        org.apache.accumulo.core.client.Connector connector54 = null;
        sequentialWorkAssigner7.configure(accumuloConfiguration45, connector54);
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertNotNull(accumuloConfiguration12);
        org.junit.Assert.assertNotNull(accumuloConfiguration18);
        org.junit.Assert.assertNotNull(accumuloConfiguration28);
        org.junit.Assert.assertNotNull(accumuloConfiguration39);
        org.junit.Assert.assertNotNull(accumuloConfiguration45);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(1528496796010L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Unordered Work Assigner", "");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner2 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration0, connector1);
        java.lang.String str3 = unorderedWorkAssigner2.getName();
        org.apache.commons.configuration.Configuration configuration4 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration5 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration5, connector6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        unorderedWorkAssigner2.configure(accumuloConfiguration5, connector8);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration10 = null;
        org.apache.accumulo.core.client.Connector connector11 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner12 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration10, connector11);
        org.apache.commons.configuration.Configuration configuration13 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration14 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration13);
        org.apache.accumulo.core.client.Connector connector15 = null;
        sequentialWorkAssigner12.configure(accumuloConfiguration14, connector15);
        org.apache.accumulo.core.client.Connector connector17 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner18 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration14, connector17);
        org.apache.accumulo.core.client.Connector connector19 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner20 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration14, connector19);
        org.apache.accumulo.core.client.Connector connector21 = null;
        unorderedWorkAssigner2.configure(accumuloConfiguration14, connector21);
        org.apache.accumulo.core.client.Connector connector23 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner24 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration14, connector23);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration5);
        org.junit.Assert.assertNotNull(accumuloConfiguration14);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        java.lang.String str5 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = exportTable4.call((long) (byte) 100, master7);
        org.apache.accumulo.master.Master master10 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master11 = exportTable4.call(1528496711176L, master10);
        org.apache.accumulo.master.Master master13 = null;
        try {
            long long14 = exportTable4.isReady(1528496727550L, master13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(repo_master8);
        org.junit.Assert.assertNotNull(repo_master11);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        int i4 = tableCounts3.hosted();
        int i5 = tableCounts3.suspended();
        int i6 = tableCounts3.hosted();
        int i7 = tableCounts3.suspended();
        int i8 = tableCounts3.assigned();
        int i9 = tableCounts3.suspended();
        int i10 = tableCounts3.assigned();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts3 = tableStats0.getLast();
        long long4 = tableStats0.lastScanFinished();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(masterState2);
        org.junit.Assert.assertNotNull(map_iD_tableCounts3);
        org.junit.Assert.assertTrue(long4 == 0L);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, 1528496711176L, false, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady(1528496751307L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = createNamespace3.call(1528496762934L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.assigned();
        int i3 = tableCounts0.assigned();
        int i4 = tableCounts0.suspended();
        int i5 = tableCounts0.assigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords7 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector6);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable8 = tracerepo_runnable2.call(1528496796009L, (java.lang.Runnable) removeCompleteReplicationRecords7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array27 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str28, str_array27);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable30 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD1, iD2, "MasterReplication", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str28);
        org.apache.accumulo.master.Master master32 = null;
        try {
            cloneTable30.undo(0L, master32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "failures.txt", "ShutdownTServer", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady(1528496788141L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner7 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector6);
        java.lang.String str8 = sequentialWorkAssigner7.getName();
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration9 = null;
        org.apache.accumulo.core.client.Connector connector10 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner11 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration9, connector10);
        java.lang.String str12 = unorderedWorkAssigner11.getName();
        org.apache.commons.configuration.Configuration configuration13 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration14 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration13);
        org.apache.accumulo.core.client.Connector connector15 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner16 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration14, connector15);
        org.apache.accumulo.core.client.Connector connector17 = null;
        unorderedWorkAssigner11.configure(accumuloConfiguration14, connector17);
        org.apache.accumulo.core.client.Connector connector19 = null;
        sequentialWorkAssigner7.configure(accumuloConfiguration14, connector19);
        org.apache.accumulo.core.client.Connector connector21 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner22 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration14, connector21);
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Sequential Work Assigner" + "'", str8.equals("Sequential Work Assigner"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Unordered Work Assigner" + "'", str12.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration14);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = null;
        tableStats0.end(masterState2);
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts4 = tableStats0.getLast();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = tableStats0.getLastMasterState();
        long long6 = tableStats0.getScanTime();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNull(map_iD_tableCounts4);
        org.junit.Assert.assertNull(masterState5);
        org.junit.Assert.assertTrue(long6 == 1528496803467L);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "ExportTable", "Unordered Work Assigner");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("^([a-z0-9]+)$", "", map_str_str2);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("replicationQueue", "hi!", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) '4', master5);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD6 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD11 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD12 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD16 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD17 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str19 = null;
        java.lang.String[] str_array42 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str43, str_array42);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable45 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD16, iD17, "MasterReplication", map_str_str19, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable46 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD11, iD12, "ExportTable", map_str_str14, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable47 = new org.apache.accumulo.master.tableOps.CloneTable("", iD6, iD7, "^([a-z0-9]+)$", map_str_str9, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable48 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD1, iD2, "hi!", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str43);
        org.apache.accumulo.master.Master master50 = null;
        try {
            cloneTable48.undo(100L, master50);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array42);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Master,sub=Replication", "replicationQueue");
    }
}

