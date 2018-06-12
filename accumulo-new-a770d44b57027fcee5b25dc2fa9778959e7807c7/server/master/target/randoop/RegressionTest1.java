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
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("Sequential Work Assigner", "replicationQueue", "exportVersion", iD3);
        org.apache.accumulo.master.Master master5 = null;
        try {
            importTable4.checkVersions(master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector6);
        java.lang.String str8 = unorderedWorkAssigner7.getName();
        java.lang.String str9 = unorderedWorkAssigner7.getName();
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Unordered Work Assigner" + "'", str8.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Unordered Work Assigner" + "'", str9.equals("Unordered Work Assigner"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("srcDataVersion", "filesPendingReplication", "Accumulo", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call((long) (byte) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call(1528496735705L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "maxReplicationThreads", iD2, "Data-Center Replication Metrics");
        org.apache.accumulo.master.Master master6 = null;
        try {
            exportTable4.undo((long) (byte) 0, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = cancelCompactions2.call(1528496734124L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = cancelCompactions2.call(1528496713149L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = cancelCompactions2.call(1528496735927L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Accumulo", "Sequential Work Assigner");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo((long) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "maxReplicationThreads", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady((long) (-1), master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call((long) (-1), master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = null;
        tableStats0.end(masterState5);
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts7 = tableStats0.getLast();
        org.apache.accumulo.core.master.thrift.MasterState masterState8 = tableStats0.getLastMasterState();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496737420L);
        org.junit.Assert.assertNull(map_iD_tableCounts7);
        org.junit.Assert.assertNull(masterState8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("srcDataVersion", "filesPendingReplication", "Accumulo", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496733232L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner3 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        try {
            unorderedWorkAssigner5.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "", "MasterReplication", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo((long) '4', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("exportVersion", (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater7 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector6);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable8 = tracerepo_runnable3.call(1528496733957L, (java.lang.Runnable) finishedWorkUpdater7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        java.lang.String str5 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = exportTable4.call((long) (byte) 100, master7);
        java.lang.String str9 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master11 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master12 = exportTable4.call(0L, master11);
        org.apache.accumulo.master.Master master14 = null;
        try {
            long long15 = exportTable4.isReady(1528496726670L, master14);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(repo_master8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(repo_master12);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496727977L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        long long3 = tableStats0.getScanTime();
        long long4 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = null;
        tableStats0.end(masterState5);
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertTrue(long4 == 0L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            cancelCompactions2.undo((long) (-1), master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.hosted();
        int i3 = tableCounts0.hosted();
        int i4 = tableCounts0.assigned();
        int i5 = tableCounts0.unassigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "maxReplicationThreads", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo(1528496730308L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady(1528496711176L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
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
        org.apache.accumulo.master.tableOps.CloneTable cloneTable36 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD1, iD2, "ExportTable", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str33);
        org.apache.accumulo.master.Master master38 = null;
        try {
            long long39 = cloneTable36.isReady(1528496731442L, master38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo(10L, master5);
        org.apache.accumulo.master.Master master8 = null;
        createNamespace3.undo(10L, master8);
        org.apache.accumulo.master.Master master11 = null;
        createNamespace3.undo((long) '#', master11);
        java.lang.String str13 = createNamespace3.getDescription();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "CreateNamespace" + "'", str13.equals("CreateNamespace"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            long long24 = cloneTable21.isReady(1528496735705L, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
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
        org.apache.accumulo.core.client.impl.Namespace.ID iD26 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD27 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str29 = null;
        java.lang.String[] str_array43 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str44, str_array43);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable46 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD26, iD27, "", map_str_str29, (java.util.Set<java.lang.String>) linkedhashset_str44);
        org.apache.accumulo.core.client.impl.Namespace.ID iD48 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD49 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str51 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD53 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD54 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str56 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD58 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD59 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str61 = null;
        java.lang.String[] str_array84 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str85 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str85, str_array84);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable87 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD58, iD59, "MasterReplication", map_str_str61, (java.util.Set<java.lang.String>) linkedhashset_str85);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable88 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD53, iD54, "ExportTable", map_str_str56, (java.util.Set<java.lang.String>) linkedhashset_str85);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable89 = new org.apache.accumulo.master.tableOps.CloneTable("Sequential Work Assigner", iD48, iD49, "failures.txt", map_str_str51, (java.util.Set<java.lang.String>) linkedhashset_str85);
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str90 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b91 = arraylist_collection_str90.add((java.util.Collection<java.lang.String>) linkedhashset_str44);
        boolean b92 = arraylist_collection_str90.add((java.util.Collection<java.lang.String>) linkedhashset_str85);
        try {
            boolean b93 = recoveryManager1.recoverLogs(keyExtent24, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(str_array84);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue(b92 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater7 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector6);
        try {
            tracerepo_runnable4.undo(1528496726670L, (java.lang.Runnable) finishedWorkUpdater7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "exportVersion", "^([a-z0-9]+)$", false);
        java.lang.String str5 = bulkImport4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            bulkImport4.undo((long) 100, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.hosted();
        int i3 = tableCounts0.assignedToDeadServers();
        int i4 = tableCounts0.suspended();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        try {
            java.lang.String str5 = tracerepo_runnable4.getReturn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "srcDataVersion", "TabletServer");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call((-1L), master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("RenameNamespace", 1528496711176L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "replicationQueue", iD2, "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call(1528496727977L, master6);
        org.junit.Assert.assertNotNull(repo_master7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call((long) (short) 1, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            deleteNamespace1.undo(1528496733957L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = tableStats0.getLastMasterState();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(masterState2);
        org.junit.Assert.assertNull(masterState3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
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
        org.apache.accumulo.master.tableOps.CloneTable cloneTable36 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD1, iD2, "ExportTable", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str33);
        org.apache.accumulo.master.Master master38 = null;
        try {
            long long39 = cloneTable36.isReady(1528496735705L, master38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        java.lang.Runnable runnable6 = null;
        try {
            long long7 = tracerepo_runnable4.isReady(1528496726670L, runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        org.apache.accumulo.fate.Repo<java.util.Set<java.lang.String>> repo_set_str0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.util.Set<java.lang.String>> tracerepo_set_str1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.util.Set<java.lang.String>>(repo_set_str0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue10m", "MasterReplication");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady(1L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        java.lang.String str6 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master8 = null;
        shutdownTServer2.undo((long) 0, master8);
        org.apache.accumulo.master.Master master11 = null;
        long long12 = shutdownTServer2.isReady((long) 10, master11);
        org.apache.accumulo.master.Master master14 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master15 = shutdownTServer2.call((long) ' ', master14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ShutdownTServer" + "'", str6.equals("ShutdownTServer"));
        org.junit.Assert.assertTrue(long12 == 0L);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = null;
        tableStats0.end(masterState3);
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts6 = tableStats0.getLast(iD5);
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts8 = tableStats0.getLast(iD7);
        int i9 = tableCounts8.assigned();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNotNull(tableCounts6);
        org.junit.Assert.assertNotNull(tableCounts8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496730308L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("Sequential Work Assigner", "replicationQueue", "exportVersion", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496729268L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector3 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater4 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector3);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable5 = tracerepo_runnable1.call((-1L), (java.lang.Runnable) finishedWorkUpdater4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call(1528496713149L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, 1528496729268L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "srcDataVersion", "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo(1528496734124L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady((long) (short) 10, master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady((long) (short) 10, master8);
        java.lang.String str10 = createNamespace3.getDescription();
        org.apache.accumulo.master.Master master12 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master13 = createNamespace3.call(1528496730542L, master12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(long9 == 0L);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "CreateNamespace" + "'", str10.equals("CreateNamespace"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "filesPendingReplication", "failures.txt", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((long) (byte) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        try {
            java.lang.String str5 = tracerepo_runnable4.getReturn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts6 = tableStats0.getLast(iD5);
        int i7 = tableCounts6.assignedToDeadServers();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496739572L);
        org.junit.Assert.assertNotNull(tableCounts6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        try {
            java.lang.String str2 = tracerepo_runnable1.getReturn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Sequential Work Assigner", "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call((long) (byte) 10, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "maxReplicationThreads", "Unordered Work Assigner");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo(1528496730373L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("replicationQueue10m", "TabletServer", "ExportTable", iD3);
        org.apache.accumulo.master.Master master5 = null;
        try {
            importTable4.checkVersions(master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("maxReplicationThreads", 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        int i4 = tableCounts3.hosted();
        int i5 = tableCounts3.assignedToDeadServers();
        int i6 = tableCounts3.assignedToDeadServers();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("srcDataVersion", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = null;
        tableStats0.end(masterState5);
        long long7 = tableStats0.getScanTime();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts8 = tableStats0.getLast();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496739765L);
        org.junit.Assert.assertTrue(long7 == 1528496739766L);
        org.junit.Assert.assertNull(map_iD_tableCounts8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Sequential Work Assigner", "^([a-z0-9]+)$");
        java.lang.String str5 = renameTable4.getReturn();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Master", "replicationQueue10m");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo(1528496730308L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
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
        org.apache.accumulo.master.Master master12 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager13 = new org.apache.accumulo.master.recovery.RecoveryManager(master12);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent14 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str15 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b16 = recoveryManager13.recoverLogs(keyExtent14, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str15);
        boolean b17 = recoveryManager10.recoverLogs(keyExtent11, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str15);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent18 = null;
        org.apache.accumulo.master.Master master19 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager20 = new org.apache.accumulo.master.recovery.RecoveryManager(master19);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent21 = null;
        org.apache.accumulo.master.Master master22 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager23 = new org.apache.accumulo.master.recovery.RecoveryManager(master22);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent24 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str25 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b26 = recoveryManager23.recoverLogs(keyExtent24, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str25);
        boolean b27 = recoveryManager20.recoverLogs(keyExtent21, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str25);
        boolean b28 = recoveryManager10.recoverLogs(keyExtent18, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str25);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent29 = null;
        org.apache.accumulo.master.Master master30 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager31 = new org.apache.accumulo.master.recovery.RecoveryManager(master30);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent32 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str33 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b34 = recoveryManager31.recoverLogs(keyExtent32, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str33);
        boolean b35 = recoveryManager10.recoverLogs(keyExtent29, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str33);
        boolean b36 = recoveryManager1.recoverLogs(keyExtent8, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str33);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "numPeers", "Thrift");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call((long) (byte) 10, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "replicationQueue10m", "Accumulo");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496727977L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Master,sub=Replication", "master");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            cancelCompactions2.undo(1528496729268L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo(0L, master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady(10L, master10);
        org.apache.accumulo.master.Master master13 = null;
        long long14 = shutdownTServer2.isReady(1528496727711L, master13);
        org.junit.Assert.assertTrue(long11 == 0L);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
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
        org.apache.accumulo.master.Master master10 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory11 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration1, master10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call((long) (short) 10, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Sequential Work Assigner", "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496735927L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, 1528496734124L, false, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        java.lang.String str5 = exportTable4.getDescription();
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = exportTable4.call(10L, master7);
        org.apache.accumulo.master.Master master10 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master11 = exportTable4.call(1528496740080L, master10);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertNotNull(repo_master8);
        org.junit.Assert.assertNotNull(repo_master11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("srcDataVersion", "filesPendingReplication", "Accumulo", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(1528496739572L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
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
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner13 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration5, connector12);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater7 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector6);
        try {
            long long8 = tracerepo_runnable4.isReady((long) 'a', (java.lang.Runnable) finishedWorkUpdater7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.hosted();
        int i3 = tableCounts0.assignedToDeadServers();
        int i4 = tableCounts0.assignedToDeadServers();
        int i5 = tableCounts0.hosted();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Sequential Work Assigner", "failures.txt");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call(1528496739572L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue10m", "MasterReplication");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady(1528496733957L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
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
            cloneTable36.undo(1528496737420L, master38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
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
        org.apache.accumulo.master.EventCoordinator eventCoordinator28 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD30 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master35 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager36 = new org.apache.accumulo.master.recovery.RecoveryManager(master35);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent37 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str38 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b39 = recoveryManager36.recoverLogs(keyExtent37, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str38);
        java.lang.Object[] obj_array40 = new java.lang.Object[] { validator_iD30, "replicationQueue", '4', (byte) 100, 100, recoveryManager36 };
        eventCoordinator28.event("TabletServer", obj_array40);
        org.apache.accumulo.master.EventCoordinator eventCoordinator43 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD45 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master50 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager51 = new org.apache.accumulo.master.recovery.RecoveryManager(master50);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent52 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str53 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b54 = recoveryManager51.recoverLogs(keyExtent52, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str53);
        java.lang.Object[] obj_array55 = new java.lang.Object[] { validator_iD45, "replicationQueue", '4', (byte) 100, 100, recoveryManager51 };
        eventCoordinator43.event("TabletServer", obj_array55);
        org.apache.accumulo.core.util.Validator<java.lang.String> validator_str60 = org.apache.accumulo.master.util.TableValidators.NOT_SYSTEM;
        org.apache.accumulo.core.client.Connector connector62 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords63 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector62);
        java.lang.Object[] obj_array64 = new java.lang.Object[] { 1L, "maxReplicationThreads", validator_str60, 1.0d, connector62 };
        eventCoordinator43.event("maxReplicationThreads", obj_array64);
        eventCoordinator28.event("ShutdownTServer", obj_array64);
        eventCoordinator0.event("", obj_array64);
        org.apache.accumulo.master.EventCoordinator eventCoordinator69 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.master.EventCoordinator.Listener listener70 = eventCoordinator69.getListener();
        org.apache.accumulo.master.EventCoordinator eventCoordinator72 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD74 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master79 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager80 = new org.apache.accumulo.master.recovery.RecoveryManager(master79);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent81 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str82 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b83 = recoveryManager80.recoverLogs(keyExtent81, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str82);
        java.lang.Object[] obj_array84 = new java.lang.Object[] { validator_iD74, "replicationQueue", '4', (byte) 100, 100, recoveryManager80 };
        eventCoordinator72.event("TabletServer", obj_array84);
        eventCoordinator69.event("Data-Center Replication Metrics", obj_array84);
        eventCoordinator0.event("replicationQueue10m", obj_array84);
        org.junit.Assert.assertNotNull(listener1);
        org.junit.Assert.assertNotNull(validator_iD5);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(validator_str20);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertNotNull(validator_iD30);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(obj_array40);
        org.junit.Assert.assertNotNull(validator_iD45);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(obj_array55);
        org.junit.Assert.assertNotNull(validator_str60);
        org.junit.Assert.assertNotNull(obj_array64);
        org.junit.Assert.assertNotNull(listener70);
        org.junit.Assert.assertNotNull(validator_iD74);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(obj_array84);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "exportVersion", "^([a-z0-9]+)$", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((long) (byte) 10, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("replicationQueue10m", "TabletServer", "ExportTable", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(1528496735927L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, 1528496727733L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            deleteNamespace1.undo(1528496731343L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Thrift", "hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        long long3 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState4 = null;
        tableStats0.end(masterState4);
        org.apache.accumulo.core.client.impl.Table.ID iD6 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState7 = null;
        try {
            tableStats0.update(iD6, tabletState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertTrue(long3 == 1L);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, 1528496714506L, true, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1528496737420L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords7 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector6);
        try {
            long long8 = tracerepo_runnable4.isReady(1528496731442L, (java.lang.Runnable) removeCompleteReplicationRecords7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner3 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner5 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector4);
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        org.apache.accumulo.fate.Repo<java.util.ArrayList<java.util.Collection<java.lang.String>>> repo_arraylist_collection_str0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.util.ArrayList<java.util.Collection<java.lang.String>>> tracerepo_arraylist_collection_str1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.util.ArrayList<java.util.Collection<java.lang.String>>>(repo_arraylist_collection_str0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496739766L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            cancelCompactions2.undo((-1L), master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "TabletServer", iD2, "srcDataVersion");
        java.lang.String str5 = exportTable4.getDescription();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "RenameNamespace", iD2, "CancelCompactions");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1528496733232L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater7 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector6);
        try {
            long long8 = tracerepo_runnable3.isReady(1528496731442L, (java.lang.Runnable) finishedWorkUpdater7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
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
        org.apache.accumulo.master.Master master12 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory13 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration5, master12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "CancelCompactions", "");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = renameTable4.isReady(1528496733232L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "replicationQueue10m", "CancelCompactions");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = renameTable4.isReady(1528496714506L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = null;
        tableStats0.end(masterState3);
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts5 = tableStats0.getLast();
        tableStats0.begin();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNotNull(map_iD_tableCounts5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            long long24 = cloneTable21.isReady((long) (byte) 0, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call((long) (short) 10, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
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
        org.apache.accumulo.master.tableOps.CloneTable cloneTable42 = new org.apache.accumulo.master.tableOps.CloneTable("Sequential Work Assigner", iD1, iD2, "failures.txt", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.Master master44 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master45 = cloneTable42.call(1528496739765L, master44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("ShutdownTServer", 1528496731442L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = cancelCompactions2.call(1528496739572L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner5 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector4);
        java.lang.String str6 = sequentialWorkAssigner5.getName();
        org.apache.commons.configuration.Configuration configuration7 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration8 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration7);
        org.apache.accumulo.core.client.Connector connector9 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner10 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration8, connector9);
        org.apache.accumulo.core.client.Connector connector11 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner12 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration8, connector11);
        org.apache.accumulo.core.client.Connector connector13 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner14 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration8, connector13);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration15 = null;
        org.apache.accumulo.core.client.Connector connector16 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner17 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration15, connector16);
        org.apache.commons.configuration.Configuration configuration18 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration19 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration18);
        org.apache.accumulo.core.client.Connector connector20 = null;
        sequentialWorkAssigner17.configure(accumuloConfiguration19, connector20);
        org.apache.accumulo.core.client.Connector connector22 = null;
        sequentialWorkAssigner14.configure(accumuloConfiguration19, connector22);
        org.apache.accumulo.core.client.Connector connector24 = null;
        sequentialWorkAssigner5.configure(accumuloConfiguration19, connector24);
        try {
            sequentialWorkAssigner5.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Sequential Work Assigner" + "'", str6.equals("Sequential Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration8);
        org.junit.Assert.assertNotNull(accumuloConfiguration19);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
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
        org.apache.accumulo.master.tableOps.CloneTable cloneTable36 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD1, iD2, "ExportTable", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str33);
        org.apache.accumulo.master.Master master38 = null;
        try {
            long long39 = cloneTable36.isReady((long) 'a', master38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("hi!", 1528496727711L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady(1528496727550L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "srcDataVersion");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "filesPendingReplication", "");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo(1L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array27 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str28, str_array27);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable30 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD1, iD2, "MasterReplication", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str28);
        org.apache.accumulo.master.Master master32 = null;
        try {
            long long33 = cloneTable30.isReady((long) (byte) 10, master32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            deleteNamespace1.undo((long) 1, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = null;
        tableStats0.end(masterState2);
        org.apache.accumulo.core.master.thrift.MasterState masterState4 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        try {
            org.apache.accumulo.master.state.TableCounts tableCounts6 = tableStats0.getLast(iD5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNull(masterState4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        java.lang.String str5 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            exportTable4.undo((long) 0, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("Master,sub=Replication", "", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, 1528496730373L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array8 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        byte[] byte_array14 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 1 };
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array15 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting16 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting16, iteratorSetting_array15);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig18 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange19 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array8, byte_array14, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting16, compactionStrategyConfig18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(iteratorSetting_array15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "CancelCompactions", "replicationQueue10m", false);
        java.lang.String str5 = bulkImport4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            long long8 = bulkImport4.isReady(1528496711176L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable1);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords5 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector4);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable6 = tracerepo_runnable2.call(0L, (java.lang.Runnable) removeCompleteReplicationRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Data-Center Replication Metrics", "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496714506L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue", "Unordered Work Assigner", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = bulkImport4.call((long) (byte) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.core.client.Connector connector5 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords6 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector5);
        try {
            tracerepo_runnable2.undo((long) (short) 1, (java.lang.Runnable) removeCompleteReplicationRecords6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady((long) (byte) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "srcDataVersion", "TabletServer");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call((long) (short) -1, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "^([a-z0-9]+)$", iD2, "maxReplicationThreads");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        org.apache.accumulo.master.Master master0 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager1 = new org.apache.accumulo.master.recovery.RecoveryManager(master0);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent2 = null;
        org.apache.accumulo.master.Master master3 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager4 = new org.apache.accumulo.master.recovery.RecoveryManager(master3);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent5 = null;
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager7 = new org.apache.accumulo.master.recovery.RecoveryManager(master6);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent8 = null;
        org.apache.accumulo.master.Master master9 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager10 = new org.apache.accumulo.master.recovery.RecoveryManager(master9);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent11 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str12 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b13 = recoveryManager10.recoverLogs(keyExtent11, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str12);
        boolean b14 = recoveryManager7.recoverLogs(keyExtent8, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str12);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent15 = null;
        org.apache.accumulo.master.Master master16 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager17 = new org.apache.accumulo.master.recovery.RecoveryManager(master16);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent18 = null;
        org.apache.accumulo.master.Master master19 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager20 = new org.apache.accumulo.master.recovery.RecoveryManager(master19);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent21 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str22 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b23 = recoveryManager20.recoverLogs(keyExtent21, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str22);
        boolean b24 = recoveryManager17.recoverLogs(keyExtent18, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str22);
        boolean b25 = recoveryManager7.recoverLogs(keyExtent15, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str22);
        boolean b26 = recoveryManager4.recoverLogs(keyExtent5, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str22);
        boolean b27 = recoveryManager1.recoverLogs(keyExtent2, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str22);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = null;
        tableStats0.end(masterState2);
        org.apache.accumulo.core.master.thrift.MasterState masterState4 = tableStats0.getLastMasterState();
        tableStats0.begin();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(masterState4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue10m", "failures.txt", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady(1528496741832L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            cancelCompactions2.undo(1528496733232L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, (long) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, (long) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        int i4 = tableCounts3.hosted();
        int i5 = tableCounts3.suspended();
        int i6 = tableCounts3.hosted();
        int i7 = tableCounts3.assignedToDeadServers();
        int i8 = tableCounts3.suspended();
        int i9 = tableCounts3.hosted();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.assigned();
        int i3 = tableCounts0.unassigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "", "hi!");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496734124L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector5 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords6 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector5);
        try {
            tracerepo_runnable3.undo((long) (short) 1, (java.lang.Runnable) removeCompleteReplicationRecords6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo((long) (byte) 10, master7);
        org.apache.accumulo.master.Master master10 = null;
        shutdownTServer2.undo((long) (short) 10, master10);
        org.apache.accumulo.master.Master master13 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master14 = shutdownTServer2.call(100L, master13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("^([a-z0-9]+)$", "srcDataVersion", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady((long) (short) 0, master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady(1528496730373L, master8);
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(long9 == 0L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = cancelCompactions2.call((long) (byte) 0, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
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
            cloneTable36.undo((long) (byte) 1, master38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("CreateNamespace", "Accumulo", map_str_str2);
        java.lang.String str4 = createNamespace3.getReturn();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = null;
        tableStats0.end(masterState3);
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts6 = tableStats0.getLast(iD5);
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts8 = tableStats0.getLast(iD7);
        long long9 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNotNull(tableCounts6);
        org.junit.Assert.assertNotNull(tableCounts8);
        org.junit.Assert.assertTrue(long9 == 1528496749061L);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "", "MasterReplication", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((long) 5, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "Unordered Work Assigner");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("replicationQueue", "hi!", map_str_str2);
        java.lang.String str4 = createNamespace3.getReturn();
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = createNamespace3.call(1528496733232L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("replicationQueue10m", "MasterReplication", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "filesPendingReplication", "numPeers", false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo((long) (byte) 10, master7);
        org.apache.accumulo.master.Master master10 = null;
        shutdownTServer2.undo((long) (short) 10, master10);
        org.apache.accumulo.master.Master master13 = null;
        long long14 = shutdownTServer2.isReady((long) 0, master13);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1528496739545L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "CancelCompactions", iD2, "maxReplicationThreads");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call((long) (byte) 100, master6);
        org.apache.accumulo.master.Master master9 = null;
        try {
            long long10 = exportTable4.isReady(10L, master9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(repo_master7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, (long) 'a', false, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "CancelCompactions", iD2, "maxReplicationThreads");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = exportTable4.isReady((long) (byte) 0, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call(1528496714506L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = null;
        tableStats0.end(masterState2);
        tableStats0.begin();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState6 = null;
        tableStats0.end(masterState6);
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(masterState5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1528496711176L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "CancelCompactions", iD2, "maxReplicationThreads");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call((long) '#', master6);
        org.apache.accumulo.master.Master master9 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master10 = exportTable4.call(1528496739765L, master9);
        org.junit.Assert.assertNotNull(repo_master7);
        org.junit.Assert.assertNotNull(repo_master10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, 1528496719616L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords7 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector6);
        try {
            tracerepo_runnable3.undo(1528496739545L, (java.lang.Runnable) removeCompleteReplicationRecords7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "replicationQueue10m", iD2, "MasterReplication");
        org.apache.accumulo.master.Master master6 = null;
        try {
            exportTable4.undo((long) (byte) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "^([a-z0-9]+)$", iD2, "CancelCompactions");
        org.apache.accumulo.master.Master master6 = null;
        try {
            exportTable4.undo((long) (byte) -1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        try {
            java.lang.String str5 = tracerepo_runnable4.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("exportVersion", "srcDataVersion", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) (byte) 1, master5);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "numPeers", "replicationQueue10m");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "CancelCompactions", "replicationQueue10m", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady(1528496750615L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Master,sub=Replication", "filesPendingReplication", map_str_str2);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call((long) (short) 0, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable1);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords5 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector4);
        try {
            long long6 = tracerepo_runnable1.isReady((long) (short) 0, (java.lang.Runnable) removeCompleteReplicationRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "Master", "ShutdownTServer", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = bulkImport4.call(100L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        java.lang.String str5 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = exportTable4.call((long) (byte) 100, master7);
        java.lang.String str9 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master11 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master12 = exportTable4.call(0L, master11);
        org.apache.accumulo.master.Master master14 = null;
        try {
            long long15 = exportTable4.isReady(100L, master14);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(repo_master8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(repo_master12);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("master", "srcDataVersion", map_str_str2);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "TabletServer", "Master");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496729268L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "replicationQueue10m");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call(1528496730542L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1528496727977L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady((long) (short) 10, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "Sequential Work Assigner", iD2, "master");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "maxReplicationThreads", "Unordered Work Assigner");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496749061L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "srcDataVersion", "TabletServer");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call(1528496729847L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        java.lang.String str3 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        shutdownTServer2.undo((long) (short) -1, master5);
        org.apache.accumulo.master.Master master8 = null;
        shutdownTServer2.undo((long) (byte) -1, master8);
        java.lang.String str10 = shutdownTServer2.getReturn();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ShutdownTServer" + "'", str3.equals("ShutdownTServer"));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "ExportTable");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady(1528496713149L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("Sequential Work Assigner", 1528496742231L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        try {
            java.lang.String str5 = tracerepo_runnable3.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady(1528496741832L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = cancelCompactions2.call(1528496740080L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master24 = cloneTable21.call((long) 'a', master23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "", iD2, "maxReplicationThreads");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call((long) (short) 0, master6);
        org.junit.Assert.assertNotNull(repo_master7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
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
        try {
            unorderedWorkAssigner10.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration4);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            deleteNamespace1.undo(10L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = cancelCompactions2.call(1528496729847L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("master", "master", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "CancelCompactions", "replicationQueue10m", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = bulkImport4.call((long) 10, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("replicationQueue", "hi!", map_str_str2);
        java.lang.String str4 = createNamespace3.getReturn();
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = createNamespace3.call(0L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("replicationQueue", "hi!", map_str_str2);
        java.lang.String str4 = createNamespace3.getReturn();
        java.lang.String str5 = createNamespace3.getReturn();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "TabletServer", "numPeers", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(1528496737420L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts4 = tableStats0.getLast(iD3);
        long long5 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD6 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts7 = tableStats0.getLast(iD6);
        int i8 = tableCounts7.hosted();
        int i9 = tableCounts7.unassigned();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertNotNull(tableCounts4);
        org.junit.Assert.assertTrue(long5 == 1528496752093L);
        org.junit.Assert.assertNotNull(tableCounts7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = cancelCompactions2.isReady(1528496751306L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Data-Center Replication Metrics", "^([a-z0-9]+)$");
        java.lang.String str5 = renameTable4.getReturn();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "srcDataVersion", "Master,sub=Replication");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue10m", "failures.txt", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady(1528496730373L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        org.apache.accumulo.master.EventCoordinator eventCoordinator0 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD2 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager8 = new org.apache.accumulo.master.recovery.RecoveryManager(master7);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent9 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str10 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b11 = recoveryManager8.recoverLogs(keyExtent9, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str10);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { validator_iD2, "replicationQueue", '4', (byte) 100, 100, recoveryManager8 };
        eventCoordinator0.event("TabletServer", obj_array12);
        org.apache.accumulo.core.util.Validator<java.lang.String> validator_str17 = org.apache.accumulo.master.util.TableValidators.NOT_SYSTEM;
        org.apache.accumulo.core.client.Connector connector19 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords20 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector19);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1L, "maxReplicationThreads", validator_str17, 1.0d, connector19 };
        eventCoordinator0.event("maxReplicationThreads", obj_array21);
        java.lang.Object[] obj_array24 = null;
        eventCoordinator0.event("maxReplicationThreads", obj_array24);
        org.junit.Assert.assertNotNull(validator_iD2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(validator_str17);
        org.junit.Assert.assertNotNull(obj_array21);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
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
            long long39 = cloneTable36.isReady(1528496734124L, master38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        int i4 = tableCounts3.hosted();
        int i5 = tableCounts3.suspended();
        int i6 = tableCounts3.hosted();
        int i7 = tableCounts3.unassigned();
        int i8 = tableCounts3.suspended();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable1);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords5 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector4);
        try {
            tracerepo_runnable1.undo((long) ' ', (java.lang.Runnable) removeCompleteReplicationRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ExportTable", "TabletServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) '4', master5);
        org.apache.accumulo.master.Master master8 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = createNamespace3.call((long) (byte) 100, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady((long) (short) 10, master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady((long) (short) 10, master8);
        java.lang.String str10 = createNamespace3.getDescription();
        org.apache.accumulo.master.Master master12 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master13 = createNamespace3.call((long) (byte) 1, master12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(long9 == 0L);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "CreateNamespace" + "'", str10.equals("CreateNamespace"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, (long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ExportTable", "TabletServer", map_str_str2);
        java.lang.String str4 = createNamespace3.getDescription();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CreateNamespace" + "'", str4.equals("CreateNamespace"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady(1528496740080L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "RenameNamespace");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = tableStats0.getLastMasterState();
        long long3 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD4 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState5 = null;
        try {
            tableStats0.update(iD4, tabletState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 1528496752585L);
        org.junit.Assert.assertNull(masterState2);
        org.junit.Assert.assertTrue(long3 == 1528496752586L);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
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
        org.apache.accumulo.master.Master master12 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager13 = new org.apache.accumulo.master.recovery.RecoveryManager(master12);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent14 = null;
        org.apache.accumulo.master.Master master15 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager16 = new org.apache.accumulo.master.recovery.RecoveryManager(master15);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent17 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str18 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b19 = recoveryManager16.recoverLogs(keyExtent17, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str18);
        boolean b20 = recoveryManager13.recoverLogs(keyExtent14, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str18);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent21 = null;
        org.apache.accumulo.master.Master master22 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager23 = new org.apache.accumulo.master.recovery.RecoveryManager(master22);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent24 = null;
        org.apache.accumulo.master.Master master25 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager26 = new org.apache.accumulo.master.recovery.RecoveryManager(master25);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent27 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str28 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b29 = recoveryManager26.recoverLogs(keyExtent27, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str28);
        boolean b30 = recoveryManager23.recoverLogs(keyExtent24, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str28);
        boolean b31 = recoveryManager13.recoverLogs(keyExtent21, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str28);
        boolean b32 = recoveryManager10.recoverLogs(keyExtent11, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str28);
        boolean b33 = recoveryManager1.recoverLogs(keyExtent8, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str28);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent34 = null;
        org.apache.accumulo.master.Master master35 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager36 = new org.apache.accumulo.master.recovery.RecoveryManager(master35);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent37 = null;
        org.apache.accumulo.master.Master master38 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager39 = new org.apache.accumulo.master.recovery.RecoveryManager(master38);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent40 = null;
        org.apache.accumulo.master.Master master41 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager42 = new org.apache.accumulo.master.recovery.RecoveryManager(master41);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent43 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str44 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b45 = recoveryManager42.recoverLogs(keyExtent43, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str44);
        boolean b46 = recoveryManager39.recoverLogs(keyExtent40, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str44);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent47 = null;
        org.apache.accumulo.master.Master master48 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager49 = new org.apache.accumulo.master.recovery.RecoveryManager(master48);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent50 = null;
        org.apache.accumulo.master.Master master51 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager52 = new org.apache.accumulo.master.recovery.RecoveryManager(master51);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent53 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str54 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b55 = recoveryManager52.recoverLogs(keyExtent53, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str54);
        boolean b56 = recoveryManager49.recoverLogs(keyExtent50, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str54);
        boolean b57 = recoveryManager39.recoverLogs(keyExtent47, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str54);
        boolean b58 = recoveryManager36.recoverLogs(keyExtent37, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str54);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent59 = null;
        org.apache.accumulo.master.Master master60 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager61 = new org.apache.accumulo.master.recovery.RecoveryManager(master60);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent62 = null;
        org.apache.accumulo.master.Master master63 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager64 = new org.apache.accumulo.master.recovery.RecoveryManager(master63);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent65 = null;
        org.apache.accumulo.master.Master master66 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager67 = new org.apache.accumulo.master.recovery.RecoveryManager(master66);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent68 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str69 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b70 = recoveryManager67.recoverLogs(keyExtent68, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str69);
        boolean b71 = recoveryManager64.recoverLogs(keyExtent65, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str69);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent72 = null;
        org.apache.accumulo.master.Master master73 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager74 = new org.apache.accumulo.master.recovery.RecoveryManager(master73);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent75 = null;
        org.apache.accumulo.master.Master master76 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager77 = new org.apache.accumulo.master.recovery.RecoveryManager(master76);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent78 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str79 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b80 = recoveryManager77.recoverLogs(keyExtent78, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str79);
        boolean b81 = recoveryManager74.recoverLogs(keyExtent75, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str79);
        boolean b82 = recoveryManager64.recoverLogs(keyExtent72, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str79);
        boolean b83 = recoveryManager61.recoverLogs(keyExtent62, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str79);
        boolean b84 = recoveryManager36.recoverLogs(keyExtent59, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str79);
        boolean b85 = recoveryManager1.recoverLogs(keyExtent34, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str79);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "ExportTable");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady(1528496734124L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call(1528496739766L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, 1528496731343L, false, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, 1528496731344L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "srcDataVersion", "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady(1528496713149L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, 1528496731442L, true, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "Data-Center Replication Metrics");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("TabletServer", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            cancelCompactions2.undo(1528496739545L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            cancelCompactions2.undo((long) 5, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        java.lang.String str4 = unorderedWorkAssigner3.getName();
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Unordered Work Assigner" + "'", str4.equals("Unordered Work Assigner"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "^([a-z0-9]+)$", iD2, "CancelCompactions");
        java.lang.String str5 = exportTable4.getReturn();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        try {
            java.lang.String str5 = tracerepo_runnable2.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = null;
        tableStats0.end(masterState5);
        org.apache.accumulo.core.master.thrift.MasterState masterState7 = tableStats0.getLastMasterState();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496754979L);
        org.junit.Assert.assertNull(masterState7);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ExportTable", "TabletServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) '4', master5);
        org.apache.accumulo.master.Master master8 = null;
        createNamespace3.undo(1528496730373L, master8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        org.apache.accumulo.master.EventCoordinator eventCoordinator0 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD2 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager8 = new org.apache.accumulo.master.recovery.RecoveryManager(master7);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent9 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str10 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b11 = recoveryManager8.recoverLogs(keyExtent9, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str10);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { validator_iD2, "replicationQueue", '4', (byte) 100, 100, recoveryManager8 };
        eventCoordinator0.event("TabletServer", obj_array12);
        org.apache.accumulo.master.EventCoordinator eventCoordinator15 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD17 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master22 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager23 = new org.apache.accumulo.master.recovery.RecoveryManager(master22);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent24 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str25 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b26 = recoveryManager23.recoverLogs(keyExtent24, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str25);
        java.lang.Object[] obj_array27 = new java.lang.Object[] { validator_iD17, "replicationQueue", '4', (byte) 100, 100, recoveryManager23 };
        eventCoordinator15.event("TabletServer", obj_array27);
        org.apache.accumulo.core.util.Validator<java.lang.String> validator_str32 = org.apache.accumulo.master.util.TableValidators.NOT_SYSTEM;
        org.apache.accumulo.core.client.Connector connector34 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords35 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector34);
        java.lang.Object[] obj_array36 = new java.lang.Object[] { 1L, "maxReplicationThreads", validator_str32, 1.0d, connector34 };
        eventCoordinator15.event("maxReplicationThreads", obj_array36);
        eventCoordinator0.event("ShutdownTServer", obj_array36);
        org.apache.accumulo.master.EventCoordinator.Listener listener39 = eventCoordinator0.getListener();
        org.junit.Assert.assertNotNull(validator_iD2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(validator_iD17);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertNotNull(validator_str32);
        org.junit.Assert.assertNotNull(obj_array36);
        org.junit.Assert.assertNotNull(listener39);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496748452L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = null;
        tableStats0.end(masterState3);
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts6 = tableStats0.getLast(iD5);
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts7 = tableStats0.getLast();
        org.apache.accumulo.core.master.thrift.MasterState masterState8 = tableStats0.getLastMasterState();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNotNull(tableCounts6);
        org.junit.Assert.assertNotNull(map_iD_tableCounts7);
        org.junit.Assert.assertNull(masterState8);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
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
        int i11 = tableCounts8.hosted();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNotNull(tableCounts6);
        org.junit.Assert.assertNotNull(tableCounts8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.unassigned();
        int i3 = tableCounts0.assignedToDeadServers();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ShutdownTServer", "replicationQueue10m", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo(1528496752019L, master5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = null;
        tableStats0.end(masterState3);
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts5 = tableStats0.getLast();
        org.apache.accumulo.core.client.impl.Table.ID iD6 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts7 = tableStats0.getLast(iD6);
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNotNull(map_iD_tableCounts5);
        org.junit.Assert.assertNotNull(tableCounts7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords7 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector6);
        try {
            long long8 = tracerepo_runnable4.isReady((long) '4', (java.lang.Runnable) removeCompleteReplicationRecords7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts6 = tableStats0.getLast(iD5);
        int i7 = tableCounts6.hosted();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496755389L);
        org.junit.Assert.assertNotNull(tableCounts6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Sequential Work Assigner", "failures.txt");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady((-1L), master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, 1528496730373L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        int i4 = tableCounts3.hosted();
        int i5 = tableCounts3.suspended();
        int i6 = tableCounts3.assignedToDeadServers();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
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
            cloneTable36.undo(1528496727711L, master38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, 1528496741832L, true, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "replicationQueue10m", iD2, "MasterReplication");
        org.apache.accumulo.master.Master master6 = null;
        try {
            exportTable4.undo((long) (byte) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "exportVersion", "^([a-z0-9]+)$", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo(100L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        long long8 = shutdownTServer2.isReady((long) (byte) 1, master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady(0L, master10);
        java.lang.String str12 = shutdownTServer2.getReturn();
        org.junit.Assert.assertTrue(long8 == 0L);
        org.junit.Assert.assertTrue(long11 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
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
        org.apache.accumulo.master.tableOps.CloneTable cloneTable36 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD1, iD2, "ExportTable", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str33);
        org.apache.accumulo.master.Master master38 = null;
        try {
            cloneTable36.undo(1528496735055L, master38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("replicationQueue10m", "TabletServer", "ExportTable", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady((long) '#', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "", "failures.txt");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady((long) 5, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector5 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords6 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector5);
        try {
            long long7 = tracerepo_runnable3.isReady(1528496726670L, (java.lang.Runnable) removeCompleteReplicationRecords6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "CancelCompactions", iD2, "maxReplicationThreads");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = exportTable4.isReady(1528496735705L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, (long) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496719616L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("srcDataVersion", "filesPendingReplication", "Accumulo", iD3);
        org.apache.accumulo.master.Master master5 = null;
        try {
            importTable4.checkVersions(master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("exportVersion", 1528496739766L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner5 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector4);
        java.lang.String str6 = sequentialWorkAssigner5.getName();
        org.apache.commons.configuration.Configuration configuration7 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration8 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration7);
        org.apache.accumulo.core.client.Connector connector9 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner10 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration8, connector9);
        org.apache.accumulo.core.client.Connector connector11 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner12 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration8, connector11);
        org.apache.accumulo.core.client.Connector connector13 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner14 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration8, connector13);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration15 = null;
        org.apache.accumulo.core.client.Connector connector16 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner17 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration15, connector16);
        org.apache.commons.configuration.Configuration configuration18 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration19 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration18);
        org.apache.accumulo.core.client.Connector connector20 = null;
        sequentialWorkAssigner17.configure(accumuloConfiguration19, connector20);
        org.apache.accumulo.core.client.Connector connector22 = null;
        sequentialWorkAssigner14.configure(accumuloConfiguration19, connector22);
        org.apache.accumulo.core.client.Connector connector24 = null;
        sequentialWorkAssigner5.configure(accumuloConfiguration19, connector24);
        org.apache.accumulo.core.client.Connector connector26 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner27 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration19, connector26);
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Sequential Work Assigner" + "'", str6.equals("Sequential Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration8);
        org.junit.Assert.assertNotNull(accumuloConfiguration19);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
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
        org.apache.accumulo.master.Master master19 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory20 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration14, master19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertNotNull(accumuloConfiguration14);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("numPeers", "", "replicationQueue", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo((long) (short) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts4 = tableStats0.getLast(iD3);
        int i5 = tableCounts4.suspended();
        int i6 = tableCounts4.assignedToDeadServers();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertNotNull(tableCounts4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("maxReplicationThreads", "srcDataVersion", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) 'a', master5);
        java.lang.String str7 = createNamespace3.getReturn();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, 1528496730542L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = cancelCompactions2.call(1528496733232L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        try {
            java.lang.String str5 = tracerepo_runnable4.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue10m", "MasterReplication");
        java.lang.String str4 = renameNamespace3.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameNamespace3.call(1528496714506L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "RenameNamespace" + "'", str4.equals("RenameNamespace"));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("replicationQueue", 1528496749061L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "numPeers", "Thrift");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo(1528496730308L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater7 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector6);
        try {
            long long8 = tracerepo_runnable4.isReady(1528496751307L, (java.lang.Runnable) finishedWorkUpdater7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "hi!", "Data-Center Replication Metrics", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo((long) (byte) 10, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = null;
        tableStats0.end(masterState3);
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts5 = tableStats0.getLast();
        long long6 = tableStats0.getScanTime();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNotNull(map_iD_tableCounts5);
        org.junit.Assert.assertTrue(long6 == 1L);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1528496734124L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call(1528496739545L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        long long5 = shutdownTServer2.isReady(10L, master4);
        org.apache.accumulo.master.Master master7 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = shutdownTServer2.call((long) (byte) 100, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long5 == 0L);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, (long) 'a', true, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ShutdownTServer", "ShutdownTServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) (byte) 1, master5);
        org.apache.accumulo.master.Master master8 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = createNamespace3.call(1528496731343L, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords5 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector4);
        try {
            long long6 = tracerepo_runnable2.isReady(1528496730308L, (java.lang.Runnable) removeCompleteReplicationRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("^([a-z0-9]+)$", "Data-Center Replication Metrics", "Thrift", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(1528496737420L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, 1528496739572L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "master", iD2, "");
        java.lang.String str5 = exportTable4.getDescription();
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = exportTable4.call((long) (byte) 0, master7);
        org.apache.accumulo.master.Master master10 = null;
        try {
            exportTable4.undo(1528496749061L, master10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertNotNull(repo_master8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "filesPendingReplication", "failures.txt", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo(1528496727977L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, 1528496739765L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("CreateNamespace", "numPeers", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo(10L, master5);
        org.apache.accumulo.master.Master master8 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = createNamespace3.call(1528496714506L, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.getScanTime();
        long long2 = tableStats0.lastScanFinished();
        org.junit.Assert.assertTrue(long1 == 1528496762020L);
        org.junit.Assert.assertTrue(long2 == 0L);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = null;
        tableStats0.end(masterState3);
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts6 = tableStats0.getLast(iD5);
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts8 = tableStats0.getLast(iD7);
        long long9 = tableStats0.getScanTime();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNotNull(tableCounts6);
        org.junit.Assert.assertNotNull(tableCounts8);
        org.junit.Assert.assertTrue(long9 == 1L);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady(1528496750615L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady(1528496731344L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("Data-Center Replication Metrics", 1528496733957L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("CancelCompactions", "maxReplicationThreads", "Unordered Work Assigner", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call((long) (short) 10, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array4 = new byte[] { (byte) 100, (byte) 1 };
        byte[] byte_array8 = new byte[] { (byte) 100, (byte) 0, (byte) -1 };
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array9 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting10 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting10, iteratorSetting_array9);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig12 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange13 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array4, byte_array8, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting10, compactionStrategyConfig12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(iteratorSetting_array9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ShutdownTServer", "numPeers", map_str_str2);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "failures.txt", iD2, "Master,sub=Replication");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = exportTable4.isReady(0L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = cancelCompactions2.call(1528496730308L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1528496727733L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState6 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts8 = tableStats0.getLast(iD7);
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts9 = tableStats0.getLast();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496762349L);
        org.junit.Assert.assertNull(masterState5);
        org.junit.Assert.assertNull(masterState6);
        org.junit.Assert.assertNotNull(tableCounts8);
        org.junit.Assert.assertNotNull(map_iD_tableCounts9);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady((long) (short) 10, master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady((long) 5, master8);
        java.lang.String str10 = createNamespace3.getDescription();
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(long9 == 0L);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "CreateNamespace" + "'", str10.equals("CreateNamespace"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, (long) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "srcDataVersion", "TabletServer");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady(1528496711176L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        java.lang.String str6 = shutdownTServer2.getDescription();
        java.lang.String str7 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master9 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master10 = shutdownTServer2.call((long) 100, master9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ShutdownTServer" + "'", str6.equals("ShutdownTServer"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ShutdownTServer" + "'", str7.equals("ShutdownTServer"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner2 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration0, connector1);
        org.apache.commons.configuration.Configuration configuration3 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration4 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration3);
        org.apache.accumulo.core.client.Connector connector5 = null;
        sequentialWorkAssigner2.configure(accumuloConfiguration4, connector5);
        java.lang.String str7 = sequentialWorkAssigner2.getName();
        org.junit.Assert.assertNotNull(accumuloConfiguration4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Sequential Work Assigner" + "'", str7.equals("Sequential Work Assigner"));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = null;
        tableStats0.end(masterState3);
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts6 = tableStats0.getLast(iD5);
        int i7 = tableCounts6.assigned();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNotNull(tableCounts6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        try {
            java.lang.String str4 = tracerepo_runnable2.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
        org.apache.accumulo.master.EventCoordinator eventCoordinator0 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD2 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager8 = new org.apache.accumulo.master.recovery.RecoveryManager(master7);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent9 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str10 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b11 = recoveryManager8.recoverLogs(keyExtent9, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str10);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { validator_iD2, "replicationQueue", '4', (byte) 100, 100, recoveryManager8 };
        eventCoordinator0.event("TabletServer", obj_array12);
        org.apache.accumulo.core.util.Validator<java.lang.String> validator_str17 = org.apache.accumulo.master.util.TableValidators.NOT_SYSTEM;
        org.apache.accumulo.core.client.Connector connector19 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords20 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector19);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { 1L, "maxReplicationThreads", validator_str17, 1.0d, connector19 };
        eventCoordinator0.event("maxReplicationThreads", obj_array21);
        org.apache.accumulo.master.EventCoordinator.Listener listener23 = eventCoordinator0.getListener();
        org.junit.Assert.assertNotNull(validator_iD2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(validator_str17);
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertNotNull(listener23);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady(1528496729847L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("", 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("ExportTable", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            long long24 = cloneTable21.isReady(1528496754499L, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "TabletServer", "Master");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = renameTable4.isReady((long) (short) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner2 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration0, connector1);
        org.apache.commons.configuration.Configuration configuration3 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration4 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration3);
        org.apache.accumulo.core.client.Connector connector5 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner6 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration4, connector5);
        org.apache.accumulo.core.client.Connector connector7 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner8 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration4, connector7);
        org.apache.accumulo.core.client.Connector connector9 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner10 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration4, connector9);
        org.apache.accumulo.core.client.Connector connector11 = null;
        unorderedWorkAssigner2.configure(accumuloConfiguration4, connector11);
        java.lang.String str13 = unorderedWorkAssigner2.getName();
        org.junit.Assert.assertNotNull(accumuloConfiguration4);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Unordered Work Assigner" + "'", str13.equals("Unordered Work Assigner"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call((long) 1, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("numPeers", "", "replicationQueue", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(0L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.hosted();
        int i3 = tableCounts0.hosted();
        int i4 = tableCounts0.assignedToDeadServers();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Master,sub=Replication", "master", map_str_str2);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
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
        org.apache.commons.configuration.Configuration configuration10 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration11 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration10);
        org.apache.accumulo.core.client.Connector connector12 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner13 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration11, connector12);
        org.apache.accumulo.core.client.Connector connector14 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner15 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration11, connector14);
        org.apache.accumulo.core.client.Connector connector16 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner17 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration11, connector16);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration18 = null;
        org.apache.accumulo.core.client.Connector connector19 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner20 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration18, connector19);
        org.apache.commons.configuration.Configuration configuration21 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration22 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration21);
        org.apache.accumulo.core.client.Connector connector23 = null;
        sequentialWorkAssigner20.configure(accumuloConfiguration22, connector23);
        org.apache.accumulo.core.client.Connector connector25 = null;
        sequentialWorkAssigner17.configure(accumuloConfiguration22, connector25);
        org.apache.accumulo.core.client.Connector connector27 = null;
        unorderedWorkAssigner9.configure(accumuloConfiguration22, connector27);
        org.apache.accumulo.core.client.Connector connector29 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner30 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration22, connector29);
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertNotNull(accumuloConfiguration11);
        org.junit.Assert.assertNotNull(accumuloConfiguration22);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "^([a-z0-9]+)$", "exportVersion");
        java.lang.String str5 = renameTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            renameTable4.undo(1528496734124L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        try {
            java.lang.String str4 = tracerepo_runnable3.getReturn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "master", "Data-Center Replication Metrics");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts4 = tableStats0.getLast(iD3);
        long long5 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD6 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts7 = tableStats0.getLast(iD6);
        int i8 = tableCounts7.suspended();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertNotNull(tableCounts4);
        org.junit.Assert.assertTrue(long5 == 1528496763187L);
        org.junit.Assert.assertNotNull(tableCounts7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "filesPendingReplication", "failures.txt", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = bulkImport4.call(1528496740080L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Thrift", "Thrift");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "master", "ShutdownTServer", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo(0L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        long long3 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD4 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts5 = tableStats0.getLast(iD4);
        int i6 = tableCounts5.assigned();
        int i7 = tableCounts5.unassigned();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertTrue(long3 == 1528496763342L);
        org.junit.Assert.assertNotNull(tableCounts5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        java.lang.String str3 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        shutdownTServer2.undo((long) (short) -1, master5);
        org.apache.accumulo.master.Master master8 = null;
        shutdownTServer2.undo((long) 'a', master8);
        org.apache.accumulo.master.Master master11 = null;
        shutdownTServer2.undo(1528496754499L, master11);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ShutdownTServer" + "'", str3.equals("ShutdownTServer"));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = tableStats0.getLastMasterState();
        long long4 = tableStats0.lastScanFinished();
        org.junit.Assert.assertTrue(long1 == 1528496763437L);
        org.junit.Assert.assertNull(masterState2);
        org.junit.Assert.assertNull(masterState3);
        org.junit.Assert.assertTrue(long4 == 0L);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("Sequential Work Assigner", "replicationQueue", "exportVersion", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo(1528496739545L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "^([a-z0-9]+)$", iD2, "CancelCompactions");
        org.apache.accumulo.master.Master master6 = null;
        try {
            exportTable4.undo(1528496719616L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = null;
        tableStats0.end(masterState2);
        org.apache.accumulo.core.client.impl.Table.ID iD4 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState5 = null;
        try {
            tableStats0.update(iD4, tabletState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 0L);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "CancelCompactions", "Unordered Work Assigner");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo(1528496729268L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("", "exportVersion", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        org.apache.accumulo.master.Master master0 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager1 = new org.apache.accumulo.master.recovery.RecoveryManager(master0);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent2 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str3 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b4 = recoveryManager1.recoverLogs(keyExtent2, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str3);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent5 = null;
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager7 = new org.apache.accumulo.master.recovery.RecoveryManager(master6);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent8 = null;
        org.apache.accumulo.master.Master master9 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager10 = new org.apache.accumulo.master.recovery.RecoveryManager(master9);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent11 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str12 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b13 = recoveryManager10.recoverLogs(keyExtent11, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str12);
        boolean b14 = recoveryManager7.recoverLogs(keyExtent8, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str12);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent15 = null;
        org.apache.accumulo.master.Master master16 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager17 = new org.apache.accumulo.master.recovery.RecoveryManager(master16);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent18 = null;
        org.apache.accumulo.master.Master master19 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager20 = new org.apache.accumulo.master.recovery.RecoveryManager(master19);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent21 = null;
        org.apache.accumulo.master.Master master22 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager23 = new org.apache.accumulo.master.recovery.RecoveryManager(master22);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent24 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str25 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b26 = recoveryManager23.recoverLogs(keyExtent24, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str25);
        boolean b27 = recoveryManager20.recoverLogs(keyExtent21, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str25);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent28 = null;
        org.apache.accumulo.master.Master master29 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager30 = new org.apache.accumulo.master.recovery.RecoveryManager(master29);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent31 = null;
        org.apache.accumulo.master.Master master32 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager33 = new org.apache.accumulo.master.recovery.RecoveryManager(master32);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent34 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str35 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b36 = recoveryManager33.recoverLogs(keyExtent34, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str35);
        boolean b37 = recoveryManager30.recoverLogs(keyExtent31, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str35);
        boolean b38 = recoveryManager20.recoverLogs(keyExtent28, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str35);
        boolean b39 = recoveryManager17.recoverLogs(keyExtent18, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str35);
        boolean b40 = recoveryManager7.recoverLogs(keyExtent15, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str35);
        boolean b41 = recoveryManager1.recoverLogs(keyExtent5, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str35);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("TabletServer", "maxReplicationThreads", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady((long) 5, master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady(1528496727711L, master8);
        org.apache.accumulo.master.Master master11 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master12 = createNamespace3.call(1528496741832L, master11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(long9 == 0L);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, 1528496763437L, true, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, 1528496761210L, false, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        long long5 = shutdownTServer2.isReady(10L, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo((long) ' ', master7);
        org.apache.accumulo.master.Master master10 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master11 = shutdownTServer2.call(1528496729268L, master10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long5 == 0L);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.unassigned();
        int i3 = tableCounts0.unassigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
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
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master39 = cloneTable36.call((long) '#', master38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords7 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector6);
        try {
            tracerepo_runnable2.undo(1528496719616L, (java.lang.Runnable) removeCompleteReplicationRecords7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Master", "Master,sub=Replication");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("", 1528496735705L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("filesPendingReplication", (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call(1528496719616L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        java.lang.String str5 = exportTable4.getDescription();
        org.apache.accumulo.master.Master master7 = null;
        try {
            long long8 = exportTable4.isReady(0L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ShutdownTServer", "ShutdownTServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady(1528496762020L, master5);
        org.junit.Assert.assertTrue(long6 == 0L);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("MasterReplication", "hi!", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "srcDataVersion", "Data-Center Replication Metrics");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo((long) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("^([a-z0-9]+)$", "Data-Center Replication Metrics", "Thrift", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo(1528496735055L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
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
        org.apache.accumulo.master.Master master16 = null;
        long long17 = shutdownTServer2.isReady(1528496742231L, master16);
        org.junit.Assert.assertTrue(long17 == 0L);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call(1528496752093L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "replicationQueue10m", "Data-Center Replication Metrics");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = cancelCompactions2.call((long) (short) -1, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496735705L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "TabletServer", "Master");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = renameTable4.isReady((long) '#', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, 1528496739766L, true, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("Master,sub=Replication", "Accumulo", "replicationQueue", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo((long) 'a', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        java.lang.String str5 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            exportTable4.undo(1528496763187L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Unordered Work Assigner", "Data-Center Replication Metrics");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496734124L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.hosted();
        int i3 = tableCounts0.hosted();
        int i4 = tableCounts0.hosted();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
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
        java.lang.String str20 = sequentialWorkAssigner0.getName();
        try {
            sequentialWorkAssigner0.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration2);
        org.junit.Assert.assertNotNull(accumuloConfiguration13);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Sequential Work Assigner" + "'", str20.equals("Sequential Work Assigner"));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        java.lang.String str6 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master8 = null;
        shutdownTServer2.undo((long) 0, master8);
        org.apache.accumulo.master.Master master11 = null;
        long long12 = shutdownTServer2.isReady((long) 10, master11);
        org.apache.accumulo.master.Master master14 = null;
        shutdownTServer2.undo(1528496752093L, master14);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ShutdownTServer" + "'", str6.equals("ShutdownTServer"));
        org.junit.Assert.assertTrue(long12 == 0L);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("Unordered Work Assigner", "ShutdownTServer", "MasterReplication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady((long) (byte) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call(1528496763342L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
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
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master30 = cloneTable27.call(1528496761210L, master29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array23);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "master", iD2, "");
        java.lang.String str5 = exportTable4.getDescription();
        java.lang.String str6 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master8 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = exportTable4.call(1528496763437L, master8);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(repo_master9);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Master", "ExportTable");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call((long) (short) 100, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "Master", "ShutdownTServer", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = bulkImport4.call(1528496750615L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        long long8 = shutdownTServer2.isReady((long) (byte) 1, master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady(0L, master10);
        org.apache.accumulo.master.Master master13 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master14 = shutdownTServer2.call(0L, master13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long8 == 0L);
        org.junit.Assert.assertTrue(long11 == 0L);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        java.lang.String str4 = createNamespace3.getDescription();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CreateNamespace" + "'", str4.equals("CreateNamespace"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "ExportTable", "", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo((long) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("^([a-z0-9]+)$", "Data-Center Replication Metrics", "Thrift", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(1528496762227L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "maxReplicationThreads", "Unordered Work Assigner");
        java.lang.String str5 = renameTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = renameTable4.call(1528496733957L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords7 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector6);
        try {
            tracerepo_runnable3.undo(1528496739765L, (java.lang.Runnable) removeCompleteReplicationRecords7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("TabletServer", "TabletServer", map_str_str2);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
        org.apache.accumulo.master.Master master0 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager1 = new org.apache.accumulo.master.recovery.RecoveryManager(master0);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent2 = null;
        org.apache.accumulo.master.Master master3 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager4 = new org.apache.accumulo.master.recovery.RecoveryManager(master3);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent5 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str6 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b7 = recoveryManager4.recoverLogs(keyExtent5, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str6);
        boolean b8 = recoveryManager1.recoverLogs(keyExtent2, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str6);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent9 = null;
        org.apache.accumulo.master.Master master10 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager11 = new org.apache.accumulo.master.recovery.RecoveryManager(master10);
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
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent22 = null;
        org.apache.accumulo.master.Master master23 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager24 = new org.apache.accumulo.master.recovery.RecoveryManager(master23);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent25 = null;
        org.apache.accumulo.master.Master master26 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager27 = new org.apache.accumulo.master.recovery.RecoveryManager(master26);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent28 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str29 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b30 = recoveryManager27.recoverLogs(keyExtent28, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str29);
        boolean b31 = recoveryManager24.recoverLogs(keyExtent25, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str29);
        boolean b32 = recoveryManager14.recoverLogs(keyExtent22, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str29);
        boolean b33 = recoveryManager11.recoverLogs(keyExtent12, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str29);
        boolean b34 = recoveryManager1.recoverLogs(keyExtent9, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str29);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent35 = null;
        org.apache.accumulo.master.Master master36 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager37 = new org.apache.accumulo.master.recovery.RecoveryManager(master36);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent38 = null;
        org.apache.accumulo.master.Master master39 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager40 = new org.apache.accumulo.master.recovery.RecoveryManager(master39);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent41 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str42 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b43 = recoveryManager40.recoverLogs(keyExtent41, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str42);
        boolean b44 = recoveryManager37.recoverLogs(keyExtent38, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str42);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent45 = null;
        org.apache.accumulo.master.Master master46 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager47 = new org.apache.accumulo.master.recovery.RecoveryManager(master46);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent48 = null;
        org.apache.accumulo.master.Master master49 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager50 = new org.apache.accumulo.master.recovery.RecoveryManager(master49);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent51 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str52 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b53 = recoveryManager50.recoverLogs(keyExtent51, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str52);
        boolean b54 = recoveryManager47.recoverLogs(keyExtent48, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str52);
        boolean b55 = recoveryManager37.recoverLogs(keyExtent45, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str52);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent56 = null;
        org.apache.accumulo.master.Master master57 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager58 = new org.apache.accumulo.master.recovery.RecoveryManager(master57);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent59 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str60 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b61 = recoveryManager58.recoverLogs(keyExtent59, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str60);
        boolean b62 = recoveryManager37.recoverLogs(keyExtent56, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str60);
        boolean b63 = recoveryManager1.recoverLogs(keyExtent35, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str60);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1528496762227L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496751306L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "replicationQueue10m", "hi!");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496726670L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = null;
        tableStats0.end(masterState2);
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts4 = tableStats0.getLast();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState6 = null;
        tableStats0.end(masterState6);
        org.apache.accumulo.core.master.thrift.MasterState masterState8 = null;
        tableStats0.end(masterState8);
        org.apache.accumulo.core.client.impl.Table.ID iD10 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState11 = null;
        try {
            tableStats0.update(iD10, tabletState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNull(map_iD_tableCounts4);
        org.junit.Assert.assertNull(masterState5);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1528496735705L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("numPeers", "replicationQueue10m", "srcDataVersion", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(1528496713149L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test399");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        java.lang.String str3 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        shutdownTServer2.undo((long) (short) -1, master5);
        org.apache.accumulo.master.Master master8 = null;
        shutdownTServer2.undo((long) 'a', master8);
        org.apache.accumulo.master.Master master11 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master12 = shutdownTServer2.call((long) 'a', master11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ShutdownTServer" + "'", str3.equals("ShutdownTServer"));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = cancelCompactions2.call(1528496727733L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test401");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            cancelCompactions2.undo(1528496737420L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test402");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady((long) (byte) -1, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test403");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "Accumulo", "replicationQueue10m", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo(0L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        int i4 = tableCounts3.hosted();
        int i5 = tableCounts3.suspended();
        int i6 = tableCounts3.hosted();
        int i7 = tableCounts3.suspended();
        int i8 = tableCounts3.assigned();
        int i9 = tableCounts3.assigned();
        int i10 = tableCounts3.unassigned();
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
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "CancelCompactions", "replicationQueue10m", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady(1528496726670L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "ShutdownTServer", "", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady(1528496719616L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
        org.apache.accumulo.master.EventCoordinator eventCoordinator0 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.master.EventCoordinator.Listener listener1 = eventCoordinator0.getListener();
        org.apache.accumulo.master.EventCoordinator.Listener listener2 = eventCoordinator0.getListener();
        org.apache.accumulo.master.EventCoordinator.Listener listener3 = eventCoordinator0.getListener();
        org.apache.accumulo.master.EventCoordinator eventCoordinator5 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD7 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master12 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager13 = new org.apache.accumulo.master.recovery.RecoveryManager(master12);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent14 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str15 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b16 = recoveryManager13.recoverLogs(keyExtent14, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str15);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { validator_iD7, "replicationQueue", '4', (byte) 100, 100, recoveryManager13 };
        eventCoordinator5.event("TabletServer", obj_array17);
        org.apache.accumulo.master.EventCoordinator eventCoordinator20 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD22 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master27 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager28 = new org.apache.accumulo.master.recovery.RecoveryManager(master27);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent29 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str30 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b31 = recoveryManager28.recoverLogs(keyExtent29, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str30);
        java.lang.Object[] obj_array32 = new java.lang.Object[] { validator_iD22, "replicationQueue", '4', (byte) 100, 100, recoveryManager28 };
        eventCoordinator20.event("TabletServer", obj_array32);
        org.apache.accumulo.core.util.Validator<java.lang.String> validator_str37 = org.apache.accumulo.master.util.TableValidators.NOT_SYSTEM;
        org.apache.accumulo.core.client.Connector connector39 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords40 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector39);
        java.lang.Object[] obj_array41 = new java.lang.Object[] { 1L, "maxReplicationThreads", validator_str37, 1.0d, connector39 };
        eventCoordinator20.event("maxReplicationThreads", obj_array41);
        eventCoordinator5.event("ShutdownTServer", obj_array41);
        eventCoordinator0.event("Accumulo", obj_array41);
        org.apache.accumulo.master.EventCoordinator.Listener listener45 = eventCoordinator0.getListener();
        org.junit.Assert.assertNotNull(listener1);
        org.junit.Assert.assertNotNull(listener2);
        org.junit.Assert.assertNotNull(listener3);
        org.junit.Assert.assertNotNull(validator_iD7);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertNotNull(validator_iD22);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(obj_array32);
        org.junit.Assert.assertNotNull(validator_str37);
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertNotNull(listener45);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        java.lang.String str3 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        shutdownTServer2.undo((long) (short) -1, master5);
        org.apache.accumulo.master.Master master8 = null;
        shutdownTServer2.undo((long) (byte) -1, master8);
        org.apache.accumulo.master.Master master11 = null;
        shutdownTServer2.undo(1528496752093L, master11);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ShutdownTServer" + "'", str3.equals("ShutdownTServer"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("srcDataVersion", "filesPendingReplication", "Accumulo", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady((long) (short) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
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
        try {
            unorderedWorkAssigner2.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration5);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Unordered Work Assigner" + "'", str10.equals("Unordered Work Assigner"));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("replicationQueue", "hi!", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo(1528496731344L, master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady((long) (short) -1, master8);
        org.apache.accumulo.master.Master master11 = null;
        long long12 = createNamespace3.isReady(1528496731442L, master11);
        org.junit.Assert.assertTrue(long9 == 0L);
        org.junit.Assert.assertTrue(long12 == 0L);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test412");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Master", "Sequential Work Assigner");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call(1528496754979L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test413");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("replicationQueue10m", "ShutdownTServer", "srcDataVersion", iD3);
        org.apache.accumulo.master.Master master5 = null;
        try {
            importTable4.checkVersions(master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = null;
        tableStats0.end(masterState3);
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts6 = tableStats0.getLast(iD5);
        org.apache.accumulo.core.master.thrift.MasterState masterState7 = tableStats0.getLastMasterState();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNotNull(tableCounts6);
        org.junit.Assert.assertNull(masterState7);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        long long2 = tableStats0.getScanTime();
        long long3 = tableStats0.getScanTime();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertTrue(long2 == 1528496773264L);
        org.junit.Assert.assertTrue(long3 == 1528496773264L);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array27 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str28, str_array27);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable30 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD1, iD2, "MasterReplication", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str28);
        org.apache.accumulo.master.Master master32 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master33 = cloneTable30.call(100L, master32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test417");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("RenameNamespace", "Master", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo(1528496735927L, master5);
        org.apache.accumulo.master.Master master8 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = createNamespace3.call(1528496763437L, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test418");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "CancelCompactions", "replicationQueue10m", false);
        java.lang.String str5 = bulkImport4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            long long8 = bulkImport4.isReady(1528496729847L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test419");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts4 = tableStats0.getLast(iD3);
        int i5 = tableCounts4.suspended();
        int i6 = tableCounts4.assigned();
        int i7 = tableCounts4.assignedToDeadServers();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertNotNull(tableCounts4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test420");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = null;
        tableStats0.end(masterState2);
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts4 = tableStats0.getLast();
        tableStats0.begin();
        org.apache.accumulo.core.client.impl.Table.ID iD6 = null;
        try {
            org.apache.accumulo.master.state.TableCounts tableCounts7 = tableStats0.getLast(iD6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNull(map_iD_tableCounts4);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test421");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "TabletServer", "numPeers", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady((long) '4', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
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
        org.apache.accumulo.core.client.Connector connector20 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner21 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration13, connector20);
        org.junit.Assert.assertNotNull(accumuloConfiguration2);
        org.junit.Assert.assertNotNull(accumuloConfiguration13);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
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
        try {
            sequentialWorkAssigner7.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertNotNull(accumuloConfiguration12);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "CancelCompactions", "replicationQueue10m", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo(1528496749061L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test425");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, false);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (byte) 100, master4);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
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
        org.apache.accumulo.master.Master master14 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory15 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration7, master14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Unordered Work Assigner" + "'", str4.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Unordered Work Assigner" + "'", str5.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration7);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test427");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "maxReplicationThreads", "Unordered Work Assigner");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = renameTable4.isReady(1528496750615L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "failures.txt", "RenameNamespace");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = renameTable4.isReady(1528496754499L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "ExportTable");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call(1528496761210L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test430");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("CreateNamespace", 1528496735055L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test431");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array3 = new byte[] { (byte) 0 };
        byte[] byte_array4 = new byte[] {};
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
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertNotNull(iteratorSetting_array5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(10L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
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
            long long30 = cloneTable27.isReady(100L, master29);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array23);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test434");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady(1528496726670L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test435");
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
        try {
            unorderedWorkAssigner2.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration5);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Unordered Work Assigner" + "'", str10.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration12);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
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
        org.apache.accumulo.master.tableOps.CloneTable cloneTable42 = new org.apache.accumulo.master.tableOps.CloneTable("Sequential Work Assigner", iD1, iD2, "failures.txt", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str38);
        org.apache.accumulo.master.Master master44 = null;
        try {
            cloneTable42.undo((long) 10, master44);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = exportTable4.isReady(1528496727711L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array27 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str28, str_array27);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable30 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD1, iD2, "MasterReplication", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str28);
        org.apache.accumulo.master.Master master32 = null;
        try {
            long long33 = cloneTable30.isReady(1528496762349L, master32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test439");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, 1528496734124L, false, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test440");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts4 = tableStats0.getLast(iD3);
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts5 = tableStats0.getLast();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertNotNull(tableCounts4);
        org.junit.Assert.assertNotNull(map_iD_tableCounts5);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.replication.UnorderedWorkAssigner> repo_unorderedWorkAssigner0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<org.apache.accumulo.master.replication.UnorderedWorkAssigner> tracerepo_unorderedWorkAssigner1 = new org.apache.accumulo.master.tableOps.TraceRepo<org.apache.accumulo.master.replication.UnorderedWorkAssigner>(repo_unorderedWorkAssigner0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = null;
        tableStats0.end(masterState5);
        long long7 = tableStats0.getScanTime();
        long long8 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.client.impl.Table.ID iD9 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState10 = null;
        try {
            tableStats0.update(iD9, tabletState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496779160L);
        org.junit.Assert.assertTrue(long7 == 1528496779161L);
        org.junit.Assert.assertTrue(long8 == 1528496779161L);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test443");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady((long) 1, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test444");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("replicationQueue10m", "TabletServer", "ExportTable", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496737420L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test445");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ExportTable", "TabletServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo(1528496752093L, master5);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test446");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "master", iD2, "");
        java.lang.String str5 = exportTable4.getDescription();
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = exportTable4.call(1528496742231L, master7);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertNotNull(repo_master8);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test447");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Master", "Sequential Work Assigner");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady(1528496739545L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test448");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts4 = tableStats0.getLast();
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState6 = null;
        try {
            tableStats0.update(iD5, tabletState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 1528496779295L);
        org.junit.Assert.assertNull(masterState2);
        org.junit.Assert.assertNull(masterState3);
        org.junit.Assert.assertNotNull(map_iD_tableCounts4);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test449");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            cancelCompactions2.undo(1528496773264L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test450");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "RenameNamespace", "ExportTable");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady(1528496748452L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test451");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ExportTable", "TabletServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) '4', master5);
        org.apache.accumulo.master.Master master8 = null;
        createNamespace3.undo(1528496755389L, master8);
        org.apache.accumulo.master.Master master11 = null;
        createNamespace3.undo(1528496754499L, master11);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test452");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady(1528496739765L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test453");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "master", "ShutdownTServer", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = bulkImport4.call((long) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test454");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byte_array11 = new byte[] { (byte) 1, (byte) -1, (byte) -1 };
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array12 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting13 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting13, iteratorSetting_array12);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig15 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange16 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array7, byte_array11, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting13, compactionStrategyConfig15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(iteratorSetting_array12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test455");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call(1528496763437L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test456");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater7 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector6);
        try {
            long long8 = tracerepo_runnable4.isReady((long) '4', (java.lang.Runnable) finishedWorkUpdater7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test457");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, 1528496739765L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test458");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("^([a-z0-9]+)$", "srcDataVersion", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady((long) (short) 0, master5);
        org.apache.accumulo.master.Master master8 = null;
        createNamespace3.undo(1528496731344L, master8);
        org.apache.accumulo.master.Master master11 = null;
        createNamespace3.undo((long) 1, master11);
        org.junit.Assert.assertTrue(long6 == 0L);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test459");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        long long3 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD4 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts5 = tableStats0.getLast(iD4);
        int i6 = tableCounts5.assigned();
        int i7 = tableCounts5.assignedToDeadServers();
        int i8 = tableCounts5.unassigned();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertTrue(long3 == 1528496779575L);
        org.junit.Assert.assertNotNull(tableCounts5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test460");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = tableStats0.getLastMasterState();
        tableStats0.begin();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(masterState2);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test461");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner2 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration0, connector1);
        org.apache.commons.configuration.Configuration configuration3 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration4 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration3);
        org.apache.accumulo.core.client.Connector connector5 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner6 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration4, connector5);
        org.apache.accumulo.core.client.Connector connector7 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner8 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration4, connector7);
        org.apache.accumulo.core.client.Connector connector9 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner10 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration4, connector9);
        org.apache.accumulo.core.client.Connector connector11 = null;
        unorderedWorkAssigner2.configure(accumuloConfiguration4, connector11);
        try {
            unorderedWorkAssigner2.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration4);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test462");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "failures.txt", "CancelCompactions");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test463");
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
        org.apache.accumulo.master.tableOps.CloneTable cloneTable36 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD1, iD2, "ExportTable", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str33);
        org.apache.accumulo.master.Master master38 = null;
        try {
            cloneTable36.undo(1528496739545L, master38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test464");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        long long5 = shutdownTServer2.isReady(10L, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo((long) ' ', master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady((long) (-1), master10);
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertTrue(long11 == 0L);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test465");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.assignedToDeadServers();
        int i2 = tableCounts0.assignedToDeadServers();
        int i3 = tableCounts0.assignedToDeadServers();
        int i4 = tableCounts0.unassigned();
        int i5 = tableCounts0.assignedToDeadServers();
        int i6 = tableCounts0.assignedToDeadServers();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test466");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo(1528496733232L, master7);
        org.apache.accumulo.master.Master master10 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master11 = shutdownTServer2.call(1528496727711L, master10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test467");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("exportVersion", "failures.txt", map_str_str2);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test469");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Accumulo", "maxReplicationThreads");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496735055L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test470");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("hi!", 1528496739766L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test471");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("srcDataVersion", "hi!", "", iD3);
        org.apache.accumulo.master.Master master5 = null;
        try {
            importTable4.checkVersions(master5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test472");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "", "hi!");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo(1528496730308L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test473");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Accumulo", "Accumulo");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo(1528496749061L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test474");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("", "RenameNamespace", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test475");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo(0L, master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady((long) (byte) 1, master10);
        org.apache.accumulo.master.Master master13 = null;
        long long14 = shutdownTServer2.isReady(1528496762934L, master13);
        org.junit.Assert.assertTrue(long11 == 0L);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test476");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        java.lang.String str6 = shutdownTServer2.getDescription();
        java.lang.String str7 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master9 = null;
        long long10 = shutdownTServer2.isReady(1528496761210L, master9);
        org.apache.accumulo.master.Master master12 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master13 = shutdownTServer2.call(1528496727711L, master12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ShutdownTServer" + "'", str6.equals("ShutdownTServer"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ShutdownTServer" + "'", str7.equals("ShutdownTServer"));
        org.junit.Assert.assertTrue(long10 == 0L);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test477");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("Data-Center Replication Metrics", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test478");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo(10L, master5);
        org.apache.accumulo.master.Master master8 = null;
        createNamespace3.undo(1528496763187L, master8);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test479");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "srcDataVersion", "CancelCompactions", true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test480");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, 1528496762934L, true, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test482");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater5 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector4);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable6 = tracerepo_runnable2.call(1528496762020L, (java.lang.Runnable) finishedWorkUpdater5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test483");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        try {
            java.lang.String str5 = tracerepo_runnable3.getReturn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test484");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater7 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector6);
        try {
            tracerepo_runnable3.undo(10L, (java.lang.Runnable) finishedWorkUpdater7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test486");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        long long2 = tableStats0.getScanTime();
        long long3 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertTrue(long2 == 1528496780429L);
        org.junit.Assert.assertTrue(long3 == 0L);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test487");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "numPeers", "Thrift");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo(1528496750615L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test488");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("replicationQueue", 1528496726670L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test489");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        long long3 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState4 = null;
        tableStats0.end(masterState4);
        org.apache.accumulo.core.master.thrift.MasterState masterState6 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.master.thrift.MasterState masterState7 = tableStats0.getLastMasterState();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertNull(masterState6);
        org.junit.Assert.assertNull(masterState7);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test490");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("^([a-z0-9]+)$", "Data-Center Replication Metrics", "Thrift", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496726670L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test491");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Master,sub=Replication", "ShutdownTServer");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test492");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = cancelCompactions2.isReady(1528496748452L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test493");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("", "RenameNamespace", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) '#', master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady((long) (-1), master8);
        org.apache.accumulo.master.Master master11 = null;
        createNamespace3.undo((long) ' ', master11);
        org.junit.Assert.assertTrue(long9 == 0L);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test494");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("numPeers", "", "replicationQueue", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(1528496739545L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test495");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo(0L, master4);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test496");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("failures.txt", "maxReplicationThreads", "CreateNamespace", iD3);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test497");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "Data-Center Replication Metrics", iD2, "Master,sub=Replication");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test498");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("srcDataVersion", "hi!", "", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496735705L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test499");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts6 = tableStats0.getLast(iD5);
        long long7 = tableStats0.lastScanFinished();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts8 = tableStats0.getLast();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496785912L);
        org.junit.Assert.assertNotNull(tableCounts6);
        org.junit.Assert.assertTrue(long7 == 0L);
        org.junit.Assert.assertNotNull(map_iD_tableCounts8);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test500");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Thrift", "RenameNamespace");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo(0L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }
}
