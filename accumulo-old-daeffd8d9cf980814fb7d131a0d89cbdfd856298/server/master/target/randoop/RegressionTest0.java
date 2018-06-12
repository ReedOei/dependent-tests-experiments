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
        java.lang.String str0 = org.apache.accumulo.server.metrics.Metrics.PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Accumulo" + "'", str0.equals("Accumulo"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.accumulo.core.util.Validator<java.lang.String> validator_str0 = org.apache.accumulo.master.util.TableValidators.NOT_METADATA;
        org.junit.Assert.assertNotNull(validator_str0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("Accumulo", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            cancelCompactions2.undo(0L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.accumulo.master.Master master0 = null;
        try {
            org.apache.accumulo.master.replication.ReplicationDriver replicationDriver1 = new org.apache.accumulo.master.replication.ReplicationDriver(master0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.master.Master master1 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory2 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration0, master1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "CancelCompactions");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, (long) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.accumulo.master.util.TableValidators tableValidators0 = new org.apache.accumulo.master.util.TableValidators();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int i0 = java.lang.Thread.MAX_PRIORITY;
        org.junit.Assert.assertTrue(i0 == 10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str0 = org.apache.accumulo.master.util.TableValidators.VALID_ID_REGEX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "^([a-z0-9]+)$" + "'", str0.equals("^([a-z0-9]+)$"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str0 = org.apache.accumulo.master.tableOps.ExportTable.EXPORT_VERSION_PROP;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "exportVersion" + "'", str0.equals("exportVersion"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.accumulo.core.client.Connector connector0 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords1 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector0);
        try {
            removeCompleteReplicationRecords1.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str0 = org.apache.accumulo.master.metrics.Metrics2ReplicationMetrics.REPLICATION_QUEUE_TIME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "replicationQueue" + "'", str0.equals("replicationQueue"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str0 = org.apache.accumulo.master.metrics.Metrics2ReplicationMetrics.RECORD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "MasterReplication" + "'", str0.equals("MasterReplication"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int i0 = java.lang.Thread.NORM_PRIORITY;
        org.junit.Assert.assertTrue(i0 == 5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int i0 = java.lang.Thread.MIN_PRIORITY;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.master.Master master2 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory3 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration1, master2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD0 = org.apache.accumulo.master.util.TableValidators.VALID_ID;
        org.junit.Assert.assertNotNull(validator_iD0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str0 = org.apache.accumulo.master.metrics.Metrics2ReplicationMetrics.CONTEXT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "master" + "'", str0.equals("master"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str0 = org.apache.accumulo.master.metrics.Metrics2ReplicationMetrics.NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Master,sub=Replication" + "'", str0.equals("Master,sub=Replication"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, (long) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = cancelCompactions2.call((long) 10, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "exportVersion");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady(10L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.accumulo.core.util.Validator<java.lang.String> validator_str0 = org.apache.accumulo.master.util.TableValidators.VALID_NAME;
        org.junit.Assert.assertNotNull(validator_str0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "exportVersion");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call((long) (short) 100, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "master");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.accumulo.core.util.Validator<java.lang.String> validator_str0 = org.apache.accumulo.master.util.TableValidators.NOT_SYSTEM;
        org.junit.Assert.assertNotNull(validator_str0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String str0 = org.apache.accumulo.server.metrics.Metrics.TSERVER_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TabletServer" + "'", str0.equals("TabletServer"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, (long) 100, true, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "hi!", "Accumulo");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady((long) 5, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "", "hi!");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo(0L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            cancelCompactions2.undo((long) '4', master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, (long) 'a', true, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.accumulo.master.util.FateAdmin fateAdmin0 = new org.apache.accumulo.master.util.FateAdmin();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array8 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        byte[] byte_array9 = new byte[] {};
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array10 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting11 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting11, iteratorSetting_array10);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig13 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange14 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array8, byte_array9, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting11, compactionStrategyConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(iteratorSetting_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation2 = null;
        try {
            org.apache.accumulo.master.tableOps.ChangeTableState changeTableState3 = new org.apache.accumulo.master.tableOps.ChangeTableState(iD0, iD1, tableOperation2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady((long) (byte) 10, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String str0 = org.apache.accumulo.master.metrics.Metrics2ReplicationMetrics.MAX_REPLICATION_THREADS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "maxReplicationThreads" + "'", str0.equals("maxReplicationThreads"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "exportVersion");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo((long) 'a', master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int i0 = org.apache.accumulo.master.tableOps.ExportTable.VERSION;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.accumulo.core.client.Connector connector0 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker1 = new org.apache.accumulo.master.replication.StatusMaker(connector0);
        statusMaker1.setSourceTableName("Accumulo");
        try {
            statusMaker1.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.accumulo.server.master.state.MergeInfo.Operation operation0 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.hadoop.io.Text text3 = null;
        org.apache.hadoop.io.Text text4 = null;
        try {
            org.apache.accumulo.master.tableOps.TableRangeOp tableRangeOp5 = new org.apache.accumulo.master.tableOps.TableRangeOp(operation0, iD1, iD2, text3, text4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array5 = new byte[] { (byte) 1, (byte) 0, (byte) 0 };
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.accumulo.master.Master master0 = null;
        try {
            org.apache.accumulo.master.MasterTime masterTime1 = new org.apache.accumulo.master.MasterTime(master0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, (long) (byte) 0, true, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo((long) 100, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.accumulo.core.util.Validator<java.lang.String> validator_str0 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT;
        org.junit.Assert.assertNotNull(validator_str0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, (long) 1, false, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, (long) (short) 100, true, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "", "hi!");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = renameTable4.isReady((long) (short) 10, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.String str0 = org.apache.accumulo.master.metrics.Metrics2ReplicationMetrics.DESCRIPTION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Data-Center Replication Metrics" + "'", str0.equals("Data-Center Replication Metrics"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "hi!", "Accumulo");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady((long) 0, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "^([a-z0-9]+)$", "exportVersion");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo(100L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call((long) (short) -1, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner2 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration0, connector1);
        try {
            unorderedWorkAssigner2.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady((long) (short) 1, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "^([a-z0-9]+)$", "exportVersion");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call((long) (byte) 0, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.accumulo.server.master.state.MergeInfo mergeInfo0 = null;
        try {
            org.apache.accumulo.master.state.MergeStats mergeStats1 = new org.apache.accumulo.master.state.MergeStats(mergeInfo0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "hi!", "Accumulo");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo((long) (-1), master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
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
        org.apache.accumulo.master.Master master10 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory11 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration5, master10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "exportVersion");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady((long) '#', master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "exportVersion", "^([a-z0-9]+)$", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((long) (byte) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str0 = org.apache.accumulo.server.metrics.Metrics.THRIFT_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Thrift" + "'", str0.equals("Thrift"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.accumulo.master.Master master0 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager1 = new org.apache.accumulo.master.recovery.RecoveryManager(master0);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent2 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str3 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b4 = recoveryManager1.recoverLogs(keyExtent2, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str3);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent5 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD7 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD8 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str10 = null;
        java.lang.String[] str_array24 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str25, str_array24);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable27 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD7, iD8, "", map_str_str10, (java.util.Set<java.lang.String>) linkedhashset_str25);
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str28 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b29 = arraylist_collection_str28.add((java.util.Collection<java.lang.String>) linkedhashset_str25);
        try {
            boolean b30 = recoveryManager1.recoverLogs(keyExtent5, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.accumulo.master.tableOps.Utils utils0 = new org.apache.accumulo.master.tableOps.Utils();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "", "hi!");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call((long) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "exportVersion");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call((long) (byte) -1, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady((long) (byte) 100, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call((-1L), master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD0 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.junit.Assert.assertNotNull(validator_iD0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("maxReplicationThreads", "replicationQueue", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "master", iD2, "");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = exportTable4.isReady((long) (byte) -1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str0 = org.apache.accumulo.master.metrics.Metrics2ReplicationMetrics.PENDING_FILES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "filesPendingReplication" + "'", str0.equals("filesPendingReplication"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("ShutdownTServer", (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "^([a-z0-9]+)$", "exportVersion");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo((long) 0, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, (long) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("ExportTable", (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, (long) (short) -1, true, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = cancelCompactions2.isReady((long) 100, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "", "hi!");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call((-1L), master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady((long) 1, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = cancelCompactions2.call((long) (short) 10, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.accumulo.master.Master master0 = null;
        try {
            org.apache.accumulo.master.replication.MasterReplicationCoordinator masterReplicationCoordinator1 = new org.apache.accumulo.master.replication.MasterReplicationCoordinator(master0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.String str0 = org.apache.accumulo.master.metrics.Metrics2ReplicationMetrics.NUM_PEERS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "numPeers" + "'", str0.equals("numPeers"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String str0 = org.apache.accumulo.master.tableOps.BulkImport.FAILURES_TXT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "failures.txt" + "'", str0.equals("failures.txt"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "exportVersion");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo(0L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master24 = cloneTable21.call(1L, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str0 = org.apache.accumulo.server.metrics.Metrics.MASTER_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Master" + "'", str0.equals("Master"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, (long) 5, true, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Sequential Work Assigner", "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = renameTable4.isReady((long) (short) 0, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "master", iD2, "");
        java.lang.String str5 = exportTable4.getDescription();
        org.apache.accumulo.master.Master master7 = null;
        try {
            exportTable4.undo(1L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ShutdownTServer", "ShutdownTServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = createNamespace3.call(10L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, (long) 'a', true, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "exportVersion");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady(1L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady((long) (short) 100, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "hi!", "Accumulo");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady((long) '#', master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String str0 = org.apache.accumulo.master.tableOps.ExportTable.DATA_VERSION_PROP;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "srcDataVersion" + "'", str0.equals("srcDataVersion"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master5 = null;
        try {
            importTable4.checkVersions(master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call((long) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.accumulo.core.client.Connector connector0 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker1 = new org.apache.accumulo.master.replication.StatusMaker(connector0);
        try {
            statusMaker1.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo((-1L), master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner2 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration0, connector1);
        java.lang.String str3 = unorderedWorkAssigner2.getName();
        java.lang.String str4 = unorderedWorkAssigner2.getName();
        try {
            unorderedWorkAssigner2.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Unordered Work Assigner" + "'", str4.equals("Unordered Work Assigner"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = cancelCompactions2.isReady((long) ' ', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo((long) (byte) -1, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo((long) (short) -1, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, 10L, false, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.accumulo.master.state.SetGoalState setGoalState0 = new org.apache.accumulo.master.state.SetGoalState();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue", "Unordered Work Assigner", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((long) 0, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue", "Unordered Work Assigner", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo((long) '4', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady((long) (short) 100, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call((long) (short) 0, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            long long24 = cloneTable21.isReady((long) '4', master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.accumulo.core.client.Connector connector0 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater1 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector0);
        try {
            finishedWorkUpdater1.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ShutdownTServer", "ShutdownTServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = createNamespace3.call((long) (short) 1, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo(0L, master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady(10L, master10);
        org.apache.accumulo.master.Master master13 = null;
        shutdownTServer2.undo((long) (byte) -1, master13);
        org.junit.Assert.assertTrue(long11 == 0L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = cancelCompactions2.isReady((long) (byte) 0, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.accumulo.master.Master master0 = null;
        try {
            org.apache.accumulo.master.replication.WorkDriver workDriver1 = new org.apache.accumulo.master.replication.WorkDriver(master0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue", "Unordered Work Assigner", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((long) (short) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(0L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue", "Unordered Work Assigner", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((-1L), master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "exportVersion", "^([a-z0-9]+)$", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo((long) 'a', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = cancelCompactions2.call((long) 'a', master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, (long) '#', true, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady((long) '4', master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "exportVersion", "^([a-z0-9]+)$", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((long) (-1), master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            long long24 = cloneTable21.isReady((long) 0, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory7 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            cloneTable21.undo((long) (byte) 100, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo((-1L), master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.accumulo.server.AccumuloServerContext accumuloServerContext0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.WorkMaker workMaker2 = new org.apache.accumulo.master.replication.WorkMaker(accumuloServerContext0, connector1);
        try {
            workMaker2.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "exportVersion", "^([a-z0-9]+)$", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((long) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.accumulo.master.Master master0 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager1 = new org.apache.accumulo.master.recovery.RecoveryManager(master0);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent2 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str3 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b4 = recoveryManager1.recoverLogs(keyExtent2, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str3);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent5 = null;
        java.util.Collection<java.util.Collection<java.lang.String>> collection_collection_str6 = null;
        try {
            boolean b7 = recoveryManager1.recoverLogs(keyExtent5, collection_collection_str6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue", "Unordered Work Assigner", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = bulkImport4.call((long) 'a', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(0L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call((long) (short) 100, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory5 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration1, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "^([a-z0-9]+)$", "exportVersion");
        java.lang.String str5 = renameTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = renameTable4.call((long) (byte) 0, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "exportVersion", "^([a-z0-9]+)$", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = bulkImport4.call((long) 5, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        long long2 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState4 = null;
        try {
            tableStats0.update(iD3, tabletState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertTrue(long2 == 1528496712253L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("Sequential Work Assigner", (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            cloneTable21.undo((long) (byte) -1, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "ExportTable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call((long) (byte) -1, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState2 = null;
        try {
            tableStats0.update(iD1, tabletState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady((long) 10, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector3 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords4 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector3);
        try {
            long long5 = tracerepo_runnable1.isReady((-1L), (java.lang.Runnable) removeCompleteReplicationRecords4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call((-1L), master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.accumulo.master.EventCoordinator eventCoordinator0 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.master.EventCoordinator.Listener listener1 = eventCoordinator0.getListener();
        listener1.waitForEvents((long) 10);
        org.junit.Assert.assertNotNull(listener1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "hi!", "Accumulo");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady((long) 'a', master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array8 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) -1 };
        byte[] byte_array10 = new byte[] { (byte) 0 };
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array11 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting12 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting12, iteratorSetting_array11);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig14 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange15 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array8, byte_array10, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting12, compactionStrategyConfig14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(iteratorSetting_array11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            cloneTable21.undo((long) 100, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "^([a-z0-9]+)$", "exportVersion");
        java.lang.String str5 = renameTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = renameTable4.call(0L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
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
            long long14 = exportTable4.isReady((long) (short) 10, master13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(repo_master8);
        org.junit.Assert.assertNotNull(repo_master11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("ShutdownTServer", "^([a-z0-9]+)$", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector3 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords4 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector3);
        try {
            tracerepo_runnable1.undo((long) (short) 1, (java.lang.Runnable) removeCompleteReplicationRecords4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "ExportTable", "", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((long) (byte) -1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = cancelCompactions2.isReady((long) (short) -1, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady((long) (-1), master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Sequential Work Assigner", "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = renameTable4.isReady((long) (byte) 10, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        byte[] byte_array9 = new byte[] { (byte) 10, (byte) 10 };
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array10 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting11 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting11, iteratorSetting_array10);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig13 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange14 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array6, byte_array9, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting11, compactionStrategyConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(iteratorSetting_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "maxReplicationThreads", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady((long) (short) -1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Sequential Work Assigner", "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call((long) (-1), master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "hi!", "Accumulo");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo((long) 0, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, false);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = shutdownTServer2.isReady((long) (short) 0, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo(0L, master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady(10L, master10);
        org.apache.accumulo.master.Master master13 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master14 = shutdownTServer2.call(1528496713149L, master13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long11 == 0L);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            cloneTable21.undo((long) (byte) 10, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts1 = tableStats0.getLast();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState3 = null;
        try {
            tableStats0.update(iD2, tabletState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_iD_tableCounts1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        java.lang.String str5 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = exportTable4.call((long) (byte) 100, master7);
        org.apache.accumulo.master.Master master10 = null;
        try {
            long long11 = exportTable4.isReady(0L, master10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(repo_master8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("^([a-z0-9]+)$", "Master,sub=Replication", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady((long) (short) 10, master5);
        org.apache.accumulo.master.Master master8 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = createNamespace3.call(0L, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long6 == 0L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String str0 = org.apache.accumulo.master.metrics.Metrics2ReplicationMetrics.REPLICATION_QUEUE_TIME_QUANTILES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "replicationQueue10m" + "'", str0.equals("replicationQueue10m"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady((long) (short) -1, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, (long) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        org.apache.accumulo.master.Master master6 = null;
        try {
            exportTable4.undo(1528496713149L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        java.lang.String str6 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master8 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = shutdownTServer2.call(1528496713149L, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ShutdownTServer" + "'", str6.equals("ShutdownTServer"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call(10L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.hosted();
        int i3 = tableCounts0.assigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "exportVersion");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call((long) (short) 10, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner3 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        java.lang.String str6 = unorderedWorkAssigner5.getName();
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Unordered Work Assigner" + "'", str6.equals("Unordered Work Assigner"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        try {
            java.lang.String str2 = tracerepo_runnable1.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, (long) (byte) 0, true, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.accumulo.master.Master master0 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager1 = new org.apache.accumulo.master.recovery.RecoveryManager(master0);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent2 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str7 = null;
        java.lang.String[] str_array21 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str22, str_array21);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable24 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD4, iD5, "", map_str_str7, (java.util.Set<java.lang.String>) linkedhashset_str22);
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str25 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b26 = arraylist_collection_str25.add((java.util.Collection<java.lang.String>) linkedhashset_str22);
        try {
            boolean b27 = recoveryManager1.recoverLogs(keyExtent2, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.tableOps.DeleteNamespace> repo_deleteNamespace0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<org.apache.accumulo.master.tableOps.DeleteNamespace> tracerepo_deleteNamespace1 = new org.apache.accumulo.master.tableOps.TraceRepo<org.apache.accumulo.master.tableOps.DeleteNamespace>(repo_deleteNamespace0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, false);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = shutdownTServer2.isReady((long) (byte) 1, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "hi!", "Accumulo");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo((long) (byte) 0, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "hi!", "Accumulo");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo((long) (short) -1, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue", "Unordered Work Assigner", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = bulkImport4.call((long) (short) -1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            deleteNamespace1.undo(1L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        try {
            java.lang.String str3 = tracerepo_runnable2.getReturn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        long long5 = shutdownTServer2.isReady((long) (short) 100, master4);
        org.junit.Assert.assertTrue(long5 == 0L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector3 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater4 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector3);
        try {
            tracerepo_runnable1.undo(1L, (java.lang.Runnable) finishedWorkUpdater4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "CancelCompactions", "Unordered Work Assigner");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call((long) 10, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, (long) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, 1528496714506L, true, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady((long) '#', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = cancelCompactions2.isReady((long) (short) 10, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "maxReplicationThreads", iD2, "Data-Center Replication Metrics");
        org.apache.accumulo.master.Master master6 = null;
        try {
            exportTable4.undo((long) 5, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master24 = cloneTable21.call((long) '4', master23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater5 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector4);
        try {
            long long6 = tracerepo_runnable2.isReady((long) (byte) 10, (java.lang.Runnable) finishedWorkUpdater5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner7 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector6);
        try {
            sequentialWorkAssigner7.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            cancelCompactions2.undo((long) 0, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater5 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector4);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable6 = tracerepo_runnable2.call((long) 100, (java.lang.Runnable) finishedWorkUpdater5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = cancelCompactions2.isReady((long) (short) -1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, 1528496711176L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = createNamespace3.call((long) 10, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        try {
            java.lang.String str4 = tracerepo_runnable3.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = cancelCompactions2.call(1528496711176L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "master", iD2, "");
        java.lang.String str5 = exportTable4.getDescription();
        java.lang.String str6 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master8 = null;
        try {
            exportTable4.undo(1528496714506L, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = cancelCompactions2.isReady(1L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "MasterReplication", "");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call((long) (byte) -1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue", "Unordered Work Assigner", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady(100L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("MasterReplication", (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            cancelCompactions2.undo((long) (short) 0, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master24 = cloneTable21.call((long) '#', master23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("^([a-z0-9]+)$", "Data-Center Replication Metrics", "Thrift", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo(1528496714506L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            cloneTable21.undo(1528496714506L, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "", "hi!");
        java.lang.String str5 = renameTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            renameTable4.undo(10L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "maxReplicationThreads", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master5 = null;
        try {
            importTable4.checkVersions(master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("^([a-z0-9]+)$", "Data-Center Replication Metrics", "Thrift", iD3);
        org.apache.accumulo.master.Master master5 = null;
        try {
            importTable4.checkVersions(master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            cancelCompactions2.undo(100L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue10m", "MasterReplication");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo((long) (short) 10, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady((long) (short) 10, master5);
        org.apache.accumulo.master.Master master8 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = createNamespace3.call(1L, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long6 == 0L);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = cancelCompactions2.call((long) (byte) 1, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "master", iD2, "");
        java.lang.String str5 = exportTable4.getDescription();
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = exportTable4.call((long) (byte) 0, master7);
        org.apache.accumulo.master.Master master10 = null;
        try {
            long long11 = exportTable4.isReady((long) 0, master10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertNotNull(repo_master8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "hi!", "Accumulo");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call((long) '#', master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = shutdownTServer2.call((long) 10, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        java.lang.String str6 = shutdownTServer2.getDescription();
        java.lang.String str7 = shutdownTServer2.getReturn();
        org.apache.accumulo.master.Master master9 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master10 = shutdownTServer2.call((long) 0, master9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ShutdownTServer" + "'", str6.equals("ShutdownTServer"));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "replicationQueue", iD2, "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call(1528496711176L, master6);
        org.apache.accumulo.master.Master master9 = null;
        try {
            exportTable4.undo(1528496713149L, master9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(repo_master7);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = cancelCompactions2.isReady(0L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "exportVersion");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo((long) (byte) -1, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater5 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector4);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable6 = tracerepo_runnable2.call((long) (byte) 0, (java.lang.Runnable) finishedWorkUpdater5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ShutdownTServer", "ShutdownTServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = createNamespace3.call((long) (byte) 0, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("replicationQueue", (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
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
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration28 = null;
        org.apache.accumulo.core.client.Connector connector29 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner30 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration28, connector29);
        java.lang.String str31 = unorderedWorkAssigner30.getName();
        org.apache.commons.configuration.Configuration configuration32 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration33 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration32);
        org.apache.accumulo.core.client.Connector connector34 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner35 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration33, connector34);
        org.apache.accumulo.core.client.Connector connector36 = null;
        unorderedWorkAssigner30.configure(accumuloConfiguration33, connector36);
        java.lang.String str38 = unorderedWorkAssigner30.getName();
        org.apache.accumulo.master.state.SetGoalState setGoalState39 = new org.apache.accumulo.master.state.SetGoalState();
        org.apache.accumulo.core.client.Connector connector40 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker41 = new org.apache.accumulo.master.replication.StatusMaker(connector40);
        org.apache.accumulo.master.state.SetGoalState setGoalState43 = new org.apache.accumulo.master.state.SetGoalState();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { str38, setGoalState39, connector40, "ShutdownTServer", setGoalState43 };
        eventCoordinator0.event("srcDataVersion", obj_array44);
        org.apache.accumulo.master.EventCoordinator eventCoordinator47 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD49 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master54 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager55 = new org.apache.accumulo.master.recovery.RecoveryManager(master54);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent56 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str57 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b58 = recoveryManager55.recoverLogs(keyExtent56, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str57);
        java.lang.Object[] obj_array59 = new java.lang.Object[] { validator_iD49, "replicationQueue", '4', (byte) 100, 100, recoveryManager55 };
        eventCoordinator47.event("TabletServer", obj_array59);
        eventCoordinator0.event("MasterReplication", obj_array59);
        org.apache.accumulo.master.EventCoordinator.Listener listener62 = eventCoordinator0.getListener();
        listener62.waitForEvents((long) (short) 100);
        org.junit.Assert.assertNotNull(listener1);
        org.junit.Assert.assertNotNull(validator_iD5);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj_array15);
        org.junit.Assert.assertNotNull(validator_str20);
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Unordered Work Assigner" + "'", str31.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration33);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Unordered Work Assigner" + "'", str38.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertNotNull(validator_iD49);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertNotNull(listener62);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        tableStats0.begin();
        org.apache.accumulo.core.master.thrift.MasterState masterState3 = null;
        tableStats0.end(masterState3);
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
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo(0L, master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady(10L, master10);
        org.apache.accumulo.master.Master master13 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master14 = shutdownTServer2.call(10L, master13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long11 == 0L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "master", iD2, "");
        java.lang.String str5 = exportTable4.getDescription();
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = exportTable4.call((long) (byte) 0, master7);
        org.apache.accumulo.master.Master master10 = null;
        try {
            exportTable4.undo(1528496711176L, master10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertNotNull(repo_master8);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "^([a-z0-9]+)$", "exportVersion");
        java.lang.String str5 = renameTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            renameTable4.undo(1528496714506L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector3 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater4 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector3);
        try {
            tracerepo_runnable1.undo(1528496711176L, (java.lang.Runnable) finishedWorkUpdater4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo((long) (-1), master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            long long24 = cloneTable21.isReady((long) 5, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            cancelCompactions2.undo((long) (byte) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "exportVersion", "^([a-z0-9]+)$", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady(0L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector3 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords4 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector3);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable5 = tracerepo_runnable1.call((-1L), (java.lang.Runnable) removeCompleteReplicationRecords4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "ExportTable");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo(10L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "Master,sub=Replication");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "maxReplicationThreads", iD2, "Data-Center Replication Metrics");
        org.apache.accumulo.master.Master master6 = null;
        try {
            exportTable4.undo((long) (byte) 10, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("maxReplicationThreads", "srcDataVersion", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array27 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str28, str_array27);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable30 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD1, iD2, "MasterReplication", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str28);
        org.apache.accumulo.master.Master master32 = null;
        try {
            long long33 = cloneTable30.isReady(0L, master32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, false);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = shutdownTServer2.isReady((long) 5, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "replicationQueue", iD2, "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call(1528496711176L, master6);
        org.apache.accumulo.master.Master master9 = null;
        try {
            long long10 = exportTable4.isReady((long) (byte) 100, master9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(repo_master7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("Master,sub=Replication", "Accumulo", "replicationQueue", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo((long) (-1), master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "ExportTable");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo(1528496711176L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        java.lang.String str6 = unorderedWorkAssigner5.getName();
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Unordered Work Assigner" + "'", str6.equals("Unordered Work Assigner"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        long long6 = createNamespace3.isReady((long) (short) 10, master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady((long) (short) 10, master8);
        org.apache.accumulo.master.Master master11 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master12 = createNamespace3.call(100L, master11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(long9 == 0L);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "MasterReplication", "");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = renameTable4.isReady((long) '4', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("Master,sub=Replication", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.accumulo.core.client.Connector connector0 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker1 = new org.apache.accumulo.master.replication.StatusMaker(connector0);
        statusMaker1.setSourceTableName("Accumulo");
        statusMaker1.setSourceTableName("exportVersion");
        statusMaker1.setSourceTableName("hi!");
        statusMaker1.setSourceTableName("Accumulo");
        try {
            statusMaker1.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady(1528496714506L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = cancelCompactions2.call((-1L), master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        try {
            java.lang.String str3 = tracerepo_runnable2.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        long long8 = shutdownTServer2.isReady((long) (byte) 1, master7);
        org.apache.accumulo.master.Master master10 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master11 = shutdownTServer2.call((long) (short) 0, master10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long8 == 0L);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = cancelCompactions2.isReady((long) 5, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array27 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str28, str_array27);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable30 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD1, iD2, "MasterReplication", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str28);
        org.apache.accumulo.master.Master master32 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master33 = cloneTable30.call(0L, master32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue", "Unordered Work Assigner", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady(0L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner5 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory7 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "ExportTable", "", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = bulkImport4.call((long) (byte) 0, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("TabletServer", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady(10L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call((long) (-1), master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.accumulo.fate.Repo<java.lang.Object> repo_obj0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Object> tracerepo_obj1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Object>(repo_obj0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector3 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater4 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector3);
        try {
            long long5 = tracerepo_runnable1.isReady((long) (byte) 10, (java.lang.Runnable) finishedWorkUpdater4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("^([a-z0-9]+)$", "Data-Center Replication Metrics", "Thrift", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call((long) 10, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "ExportTable", "", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((long) (-1), master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("Unordered Work Assigner", "TabletServer", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        try {
            java.lang.String str4 = tracerepo_runnable3.getReturn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("Accumulo", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner2 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration0, connector1);
        java.lang.String str3 = unorderedWorkAssigner2.getName();
        org.apache.commons.configuration.Configuration configuration4 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration5 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration5, connector6);
        org.apache.accumulo.core.client.Connector connector8 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner9 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration5, connector8);
        org.apache.accumulo.core.client.Connector connector10 = null;
        unorderedWorkAssigner2.configure(accumuloConfiguration5, connector10);
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
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = cancelCompactions2.call((long) (byte) 10, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "numPeers", "Thrift");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady((long) '#', master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater5 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector4);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable6 = tracerepo_runnable2.call((long) (short) 100, (java.lang.Runnable) finishedWorkUpdater5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            long long24 = cloneTable21.isReady((long) (byte) 10, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady(0L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState4 = null;
        try {
            tableStats0.update(iD3, tabletState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 1528496725622L);
        org.junit.Assert.assertNull(masterState2);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "TabletServer", iD2, "Sequential Work Assigner");
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = exportTable4.isReady((long) (byte) 0, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array3 = new byte[] { (byte) -1 };
        byte[] byte_array5 = new byte[] { (byte) 100 };
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array6 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting7 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting7, iteratorSetting_array6);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig9 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange10 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array3, byte_array5, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting7, compactionStrategyConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(iteratorSetting_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords5 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector4);
        try {
            long long6 = tracerepo_runnable2.isReady((long) 5, (java.lang.Runnable) removeCompleteReplicationRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue", "ExportTable");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo((long) 1, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("failures.txt", 1528496713149L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, (long) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.accumulo.master.Master master0 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager1 = new org.apache.accumulo.master.recovery.RecoveryManager(master0);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent2 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD5 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str7 = null;
        java.lang.String[] str_array30 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str31, str_array30);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable33 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD4, iD5, "MasterReplication", map_str_str7, (java.util.Set<java.lang.String>) linkedhashset_str31);
        org.apache.accumulo.core.client.impl.Namespace.ID iD35 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD36 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str38 = null;
        java.lang.String[] str_array52 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str53, str_array52);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable55 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD35, iD36, "", map_str_str38, (java.util.Set<java.lang.String>) linkedhashset_str53);
        org.apache.accumulo.core.client.impl.Namespace.ID iD57 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD58 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str60 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD62 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD63 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str65 = null;
        java.lang.String[] str_array88 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str89 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str89, str_array88);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable91 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD62, iD63, "MasterReplication", map_str_str65, (java.util.Set<java.lang.String>) linkedhashset_str89);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable92 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD57, iD58, "ExportTable", map_str_str60, (java.util.Set<java.lang.String>) linkedhashset_str89);
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str93 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b94 = arraylist_collection_str93.add((java.util.Collection<java.lang.String>) linkedhashset_str31);
        boolean b95 = arraylist_collection_str93.add((java.util.Collection<java.lang.String>) linkedhashset_str53);
        boolean b96 = arraylist_collection_str93.add((java.util.Collection<java.lang.String>) linkedhashset_str89);
        try {
            boolean b97 = recoveryManager1.recoverLogs(keyExtent2, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(str_array52);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(str_array88);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue(b94 == true);
        org.junit.Assert.assertTrue(b95 == true);
        org.junit.Assert.assertTrue(b96 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("^([a-z0-9]+)$", "Data-Center Replication Metrics", "Thrift", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo((long) '4', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Data-Center Replication Metrics", "master");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady(1528496719616L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector5 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords6 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector5);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable7 = tracerepo_runnable3.call((long) 'a', (java.lang.Runnable) removeCompleteReplicationRecords6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, (long) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "^([a-z0-9]+)$", "exportVersion");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo(1528496719616L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue10m", "MasterReplication");
        org.apache.accumulo.master.Master master5 = null;
        try {
            renameNamespace3.undo(1528496711176L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call((long) 5, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        java.lang.String str3 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master5 = null;
        shutdownTServer2.undo((long) '4', master5);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ShutdownTServer" + "'", str3.equals("ShutdownTServer"));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            deleteNamespace1.undo((long) 100, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ShutdownTServer", "ShutdownTServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) (byte) 1, master5);
        org.apache.accumulo.master.Master master8 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = createNamespace3.call(1528496714506L, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, 1528496713149L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("Accumulo", 1528496713149L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, (long) (byte) 100, true, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.accumulo.master.EventCoordinator eventCoordinator0 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.master.EventCoordinator.Listener listener1 = eventCoordinator0.getListener();
        listener1.waitForEvents((long) 100);
        listener1.waitForEvents(100L);
        org.junit.Assert.assertNotNull(listener1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
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
        java.lang.String str17 = sequentialWorkAssigner7.getName();
        try {
            sequentialWorkAssigner7.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertNotNull(accumuloConfiguration12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Sequential Work Assigner" + "'", str17.equals("Sequential Work Assigner"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "MasterReplication", "");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496711176L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "srcDataVersion", "TabletServer");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady((long) (short) 100, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "srcDataVersion", "TabletServer");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call(1528496711176L, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable1);
        try {
            java.lang.String str3 = tracerepo_runnable1.getReturn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady((long) 5, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.hosted();
        int i3 = tableCounts0.assignedToDeadServers();
        int i4 = tableCounts0.unassigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496714506L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, 0L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        int i4 = tableCounts3.hosted();
        int i5 = tableCounts3.unassigned();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.hosted();
        int i3 = tableCounts0.unassigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady((long) 100, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "MasterReplication");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords5 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector4);
        try {
            long long6 = tracerepo_runnable2.isReady((long) (short) 100, (java.lang.Runnable) removeCompleteReplicationRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call((long) 0, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "maxReplicationThreads", "Unordered Work Assigner");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo((long) (short) -1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = cancelCompactions2.isReady((long) (short) 0, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("Master", 1528496719616L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable1);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater5 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector4);
        try {
            tracerepo_runnable2.undo((long) 100, (java.lang.Runnable) finishedWorkUpdater5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.accumulo.core.client.Connector connector0 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker1 = new org.apache.accumulo.master.replication.StatusMaker(connector0);
        statusMaker1.setSourceTableName("Accumulo");
        statusMaker1.setSourceTableName("exportVersion");
        statusMaker1.setSourceTableName("replicationQueue10m");
        try {
            statusMaker1.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            long long24 = cloneTable21.isReady(1528496727733L, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "TabletServer", iD2, "Sequential Work Assigner");
        java.lang.String str5 = exportTable4.getReturn();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "ExportTable", "", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo((long) (-1), master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("maxReplicationThreads", "ShutdownTServer", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
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
        org.apache.accumulo.master.EventCoordinator.Listener listener16 = eventCoordinator15.getListener();
        org.apache.accumulo.master.EventCoordinator eventCoordinator18 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD20 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master25 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager26 = new org.apache.accumulo.master.recovery.RecoveryManager(master25);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent27 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str28 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b29 = recoveryManager26.recoverLogs(keyExtent27, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str28);
        java.lang.Object[] obj_array30 = new java.lang.Object[] { validator_iD20, "replicationQueue", '4', (byte) 100, 100, recoveryManager26 };
        eventCoordinator18.event("TabletServer", obj_array30);
        org.apache.accumulo.core.util.Validator<java.lang.String> validator_str35 = org.apache.accumulo.master.util.TableValidators.NOT_SYSTEM;
        org.apache.accumulo.core.client.Connector connector37 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords38 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector37);
        java.lang.Object[] obj_array39 = new java.lang.Object[] { 1L, "maxReplicationThreads", validator_str35, 1.0d, connector37 };
        eventCoordinator18.event("maxReplicationThreads", obj_array39);
        eventCoordinator15.event("replicationQueue", obj_array39);
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration43 = null;
        org.apache.accumulo.core.client.Connector connector44 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner45 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration43, connector44);
        java.lang.String str46 = unorderedWorkAssigner45.getName();
        org.apache.commons.configuration.Configuration configuration47 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration48 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration47);
        org.apache.accumulo.core.client.Connector connector49 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner50 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration48, connector49);
        org.apache.accumulo.core.client.Connector connector51 = null;
        unorderedWorkAssigner45.configure(accumuloConfiguration48, connector51);
        java.lang.String str53 = unorderedWorkAssigner45.getName();
        org.apache.accumulo.master.state.SetGoalState setGoalState54 = new org.apache.accumulo.master.state.SetGoalState();
        org.apache.accumulo.core.client.Connector connector55 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker56 = new org.apache.accumulo.master.replication.StatusMaker(connector55);
        org.apache.accumulo.master.state.SetGoalState setGoalState58 = new org.apache.accumulo.master.state.SetGoalState();
        java.lang.Object[] obj_array59 = new java.lang.Object[] { str53, setGoalState54, connector55, "ShutdownTServer", setGoalState58 };
        eventCoordinator15.event("srcDataVersion", obj_array59);
        eventCoordinator0.event("filesPendingReplication", obj_array59);
        org.apache.accumulo.master.EventCoordinator eventCoordinator63 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.master.EventCoordinator.Listener listener64 = eventCoordinator63.getListener();
        org.apache.accumulo.master.EventCoordinator eventCoordinator66 = new org.apache.accumulo.master.EventCoordinator();
        org.apache.accumulo.core.util.Validator<org.apache.accumulo.core.client.impl.Table.ID> validator_iD68 = org.apache.accumulo.master.util.TableValidators.NOT_ROOT_ID;
        org.apache.accumulo.master.Master master73 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager74 = new org.apache.accumulo.master.recovery.RecoveryManager(master73);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent75 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str76 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b77 = recoveryManager74.recoverLogs(keyExtent75, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str76);
        java.lang.Object[] obj_array78 = new java.lang.Object[] { validator_iD68, "replicationQueue", '4', (byte) 100, 100, recoveryManager74 };
        eventCoordinator66.event("TabletServer", obj_array78);
        org.apache.accumulo.core.util.Validator<java.lang.String> validator_str83 = org.apache.accumulo.master.util.TableValidators.NOT_SYSTEM;
        org.apache.accumulo.core.client.Connector connector85 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords86 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector85);
        java.lang.Object[] obj_array87 = new java.lang.Object[] { 1L, "maxReplicationThreads", validator_str83, 1.0d, connector85 };
        eventCoordinator66.event("maxReplicationThreads", obj_array87);
        eventCoordinator63.event("replicationQueue", obj_array87);
        eventCoordinator0.event("filesPendingReplication", obj_array87);
        org.junit.Assert.assertNotNull(validator_iD2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertNotNull(listener16);
        org.junit.Assert.assertNotNull(validator_iD20);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj_array30);
        org.junit.Assert.assertNotNull(validator_str35);
        org.junit.Assert.assertNotNull(obj_array39);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Unordered Work Assigner" + "'", str46.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration48);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Unordered Work Assigner" + "'", str53.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertNotNull(listener64);
        org.junit.Assert.assertNotNull(validator_iD68);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(obj_array78);
        org.junit.Assert.assertNotNull(validator_str83);
        org.junit.Assert.assertNotNull(obj_array87);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("^([a-z0-9]+)$", "Data-Center Replication Metrics", "Thrift", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496727711L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
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
        org.apache.accumulo.core.client.impl.Namespace.ID iD11 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD12 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = null;
        java.lang.String[] str_array28 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str29, str_array28);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable31 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD11, iD12, "", map_str_str14, (java.util.Set<java.lang.String>) linkedhashset_str29);
        org.apache.accumulo.core.client.impl.Namespace.ID iD33 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD34 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str36 = null;
        java.lang.String[] str_array50 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str51, str_array50);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable53 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD33, iD34, "", map_str_str36, (java.util.Set<java.lang.String>) linkedhashset_str51);
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str54 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b55 = arraylist_collection_str54.add((java.util.Collection<java.lang.String>) linkedhashset_str29);
        boolean b56 = arraylist_collection_str54.add((java.util.Collection<java.lang.String>) linkedhashset_str51);
        try {
            boolean b57 = recoveryManager1.recoverLogs(keyExtent9, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(str_array28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(str_array50);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            long long24 = cloneTable21.isReady((long) 1, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable1);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords5 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector4);
        try {
            tracerepo_runnable2.undo(0L, (java.lang.Runnable) removeCompleteReplicationRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "exportVersion", "^([a-z0-9]+)$", false);
        java.lang.String str5 = bulkImport4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            bulkImport4.undo(100L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array27 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str28, str_array27);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable30 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD1, iD2, "MasterReplication", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str28);
        org.apache.accumulo.master.Master master32 = null;
        try {
            cloneTable30.undo(10L, master32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue10m", "MasterReplication");
        java.lang.String str4 = renameNamespace3.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameNamespace3.undo((long) (short) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "RenameNamespace" + "'", str4.equals("RenameNamespace"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo(10L, master5);
        org.apache.accumulo.master.Master master8 = null;
        createNamespace3.undo(10L, master8);
        org.apache.accumulo.master.Master master11 = null;
        createNamespace3.undo((long) '#', master11);
        org.apache.accumulo.master.Master master14 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master15 = createNamespace3.call(100L, master14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
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
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master14 = shutdownTServer2.call(1L, master13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long8 == 0L);
        org.junit.Assert.assertTrue(long11 == 0L);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "exportVersion", "^([a-z0-9]+)$", false);
        java.lang.String str5 = bulkImport4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = bulkImport4.call(1528496719616L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue10m", "failures.txt", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((long) (byte) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("Master,sub=Replication", "Accumulo", "replicationQueue", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496727977L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("Master,sub=Replication", "Accumulo", "replicationQueue", iD3);
        org.apache.accumulo.master.Master master5 = null;
        try {
            importTable4.checkVersions(master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
            long long39 = cloneTable36.isReady((long) 5, master38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "replicationQueue", iD2, "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = exportTable4.call(1528496711176L, master6);
        org.apache.accumulo.master.Master master9 = null;
        try {
            exportTable4.undo((long) (-1), master9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(repo_master7);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "CancelCompactions", "replicationQueue10m", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady(1528496713149L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "exportVersion");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("Thrift", "TabletServer", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts4 = tableStats0.getLast(iD3);
        long long5 = tableStats0.getScanTime();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts6 = tableStats0.getLast();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertNotNull(tableCounts4);
        org.junit.Assert.assertTrue(long5 == 1528496730308L);
        org.junit.Assert.assertNotNull(map_iD_tableCounts6);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Unordered Work Assigner", "Data-Center Replication Metrics");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo(1528496729268L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "TabletServer", "Master");
        java.lang.String str5 = renameTable4.getReturn();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array27 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str28, str_array27);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable30 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD1, iD2, "MasterReplication", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str28);
        org.apache.accumulo.master.Master master32 = null;
        try {
            cloneTable30.undo((long) (short) 0, master32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo(1528496727711L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "CancelCompactions", "replicationQueue10m", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo((long) 10, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        long long3 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD4 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts5 = tableStats0.getLast(iD4);
        int i6 = tableCounts5.hosted();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertTrue(long3 == 1528496730542L);
        org.junit.Assert.assertNotNull(tableCounts5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            deleteNamespace1.undo(1528496730542L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector3 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater4 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector3);
        try {
            tracerepo_runnable1.undo((long) (short) 1, (java.lang.Runnable) finishedWorkUpdater4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "master", iD2, "");
        java.lang.String str5 = exportTable4.getDescription();
        java.lang.String str6 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master8 = null;
        try {
            long long9 = exportTable4.isReady(1L, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, (long) '4', false, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.assignedToDeadServers();
        int i2 = tableCounts0.assignedToDeadServers();
        int i3 = tableCounts0.assigned();
        int i4 = tableCounts0.unassigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("srcDataVersion", 1528496730308L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo(0L, master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady(10L, master10);
        org.apache.accumulo.master.Master master13 = null;
        long long14 = shutdownTServer2.isReady((long) (byte) 10, master13);
        org.junit.Assert.assertTrue(long11 == 0L);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.accumulo.fate.Repo<java.util.RandomAccess> repo_randomAccess0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.util.RandomAccess> tracerepo_randomAccess1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.util.RandomAccess>(repo_randomAccess0);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("Unordered Work Assigner", "ExportTable", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo(10L, master5);
        org.apache.accumulo.master.Master master8 = null;
        createNamespace3.undo(10L, master8);
        org.apache.accumulo.master.Master master11 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master12 = createNamespace3.call((long) '4', master11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo((long) 'a', master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveNamespace(iD0, (long) ' ', false, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
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
        try {
            unorderedWorkAssigner2.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertNotNull(accumuloConfiguration5);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector5 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords6 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector5);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable7 = tracerepo_runnable3.call((long) '#', (java.lang.Runnable) removeCompleteReplicationRecords6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call((long) 0, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.accumulo.master.state.TableCounts tableCounts0 = new org.apache.accumulo.master.state.TableCounts();
        int i1 = tableCounts0.unassigned();
        int i2 = tableCounts0.assigned();
        int i3 = tableCounts0.hosted();
        int i4 = tableCounts0.assigned();
        int i5 = tableCounts0.assigned();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        java.lang.String str5 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = exportTable4.call((long) (byte) 100, master7);
        org.apache.accumulo.master.Master master10 = null;
        try {
            exportTable4.undo(1528496727733L, master10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(repo_master8);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner3 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner7 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector6);
        java.lang.String str8 = unorderedWorkAssigner7.getName();
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Unordered Work Assigner" + "'", str8.equals("Unordered Work Assigner"));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call(1528496729847L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.accumulo.core.client.Instance instance0 = null;
        org.apache.accumulo.server.conf.ServerConfigurationFactory serverConfigurationFactory1 = null;
        org.apache.accumulo.server.fs.VolumeManager volumeManager2 = null;
        try {
            org.apache.accumulo.master.Master master4 = new org.apache.accumulo.master.Master(instance0, serverConfigurationFactory1, volumeManager2, "TabletServer");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(0L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        org.apache.accumulo.master.Master master6 = null;
        try {
            exportTable4.undo((long) (byte) -1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            cancelCompactions2.undo((long) 'a', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "CancelCompactions", "replicationQueue10m", false);
        java.lang.String str5 = bulkImport4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            bulkImport4.undo((long) 0, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        long long2 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts4 = tableStats0.getLast(iD3);
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = null;
        tableStats0.end(masterState5);
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertTrue(long2 == 1528496731442L);
        org.junit.Assert.assertNotNull(tableCounts4);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            deleteNamespace1.undo(1528496726670L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("^([a-z0-9]+)$", "srcDataVersion", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = createNamespace3.call((long) 1, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            deleteTable2.undo(1528496714506L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner3 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory7 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "CancelCompactions", "");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo(1L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.accumulo.fate.Repo<java.lang.Comparable<java.lang.String>> repo_comparable_str0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Comparable<java.lang.String>> tracerepo_comparable_str1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Comparable<java.lang.String>>(repo_comparable_str0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable1);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater5 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector4);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable6 = tracerepo_runnable1.call((long) ' ', (java.lang.Runnable) finishedWorkUpdater5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "replicationQueue", iD2, "^([a-z0-9]+)$");
        java.lang.String str5 = exportTable4.getDescription();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable1);
        try {
            java.lang.String str3 = tracerepo_runnable2.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        try {
            java.lang.String str4 = tracerepo_runnable2.getReturn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496727711L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, (long) (short) 1, false, true, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call((long) '#', master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady(1528496730373L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = cancelCompactions2.call((long) '#', master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "maxReplicationThreads", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call(1528496730308L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, 1528496729268L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "Master", "replicationQueue10m");
        org.apache.accumulo.master.Master master5 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master6 = renameNamespace3.call((long) '4', master5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        int i4 = tableCounts3.hosted();
        int i5 = tableCounts3.suspended();
        int i6 = tableCounts3.assigned();
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState3 = null;
        try {
            tableStats0.update(iD2, tabletState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 0L);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
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
        java.lang.Object[] obj_array69 = null;
        eventCoordinator0.event("replicationQueue10m", obj_array69);
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
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
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
        org.apache.accumulo.master.EventCoordinator.Listener listener68 = eventCoordinator0.getListener();
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
        org.junit.Assert.assertNotNull(listener68);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.accumulo.master.Master master0 = null;
        org.apache.accumulo.master.recovery.RecoveryManager recoveryManager1 = new org.apache.accumulo.master.recovery.RecoveryManager(master0);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent2 = null;
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str3 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b4 = recoveryManager1.recoverLogs(keyExtent2, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str3);
        org.apache.accumulo.core.data.impl.KeyExtent keyExtent5 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD7 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD8 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str10 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD12 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD13 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str15 = null;
        java.lang.String[] str_array38 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str39, str_array38);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable41 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD12, iD13, "MasterReplication", map_str_str15, (java.util.Set<java.lang.String>) linkedhashset_str39);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable42 = new org.apache.accumulo.master.tableOps.CloneTable("replicationQueue10m", iD7, iD8, "ExportTable", map_str_str10, (java.util.Set<java.lang.String>) linkedhashset_str39);
        org.apache.accumulo.core.client.impl.Namespace.ID iD44 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD45 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str47 = null;
        java.lang.String[] str_array61 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str62, str_array61);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable64 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD44, iD45, "", map_str_str47, (java.util.Set<java.lang.String>) linkedhashset_str62);
        org.apache.accumulo.core.client.impl.Namespace.ID iD66 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD67 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str69 = null;
        java.lang.String[] str_array83 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str84 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str84, str_array83);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable86 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD66, iD67, "", map_str_str69, (java.util.Set<java.lang.String>) linkedhashset_str84);
        java.util.ArrayList<java.util.Collection<java.lang.String>> arraylist_collection_str87 = new java.util.ArrayList<java.util.Collection<java.lang.String>>();
        boolean b88 = arraylist_collection_str87.add((java.util.Collection<java.lang.String>) linkedhashset_str39);
        boolean b89 = arraylist_collection_str87.add((java.util.Collection<java.lang.String>) linkedhashset_str62);
        boolean b90 = arraylist_collection_str87.add((java.util.Collection<java.lang.String>) linkedhashset_str84);
        try {
            boolean b91 = recoveryManager1.recoverLogs(keyExtent5, (java.util.Collection<java.util.Collection<java.lang.String>>) arraylist_collection_str87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array38);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(str_array61);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(str_array83);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(b90 == true);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("replicationQueue", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady((long) (short) 0, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = importTable4.call((long) ' ', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            deleteNamespace1.undo((long) (-1), master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue10m", "MasterReplication");
        org.apache.accumulo.master.Master master5 = null;
        try {
            long long6 = renameNamespace3.isReady((long) (byte) 10, master5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts3 = tableStats0.getLast(iD2);
        long long4 = tableStats0.getScanTime();
        org.apache.accumulo.core.master.thrift.MasterState masterState5 = null;
        tableStats0.end(masterState5);
        org.apache.accumulo.core.client.impl.Table.ID iD7 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState8 = null;
        try {
            tableStats0.update(iD7, tabletState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(tableCounts3);
        org.junit.Assert.assertTrue(long4 == 1528496733301L);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady((long) 10, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "master", iD2, "");
        java.lang.String str5 = exportTable4.getDescription();
        java.lang.String str6 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master8 = null;
        try {
            long long9 = exportTable4.isReady(1528496714506L, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady((long) (byte) 10, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady(1528496730373L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = cancelCompactions2.call((long) (byte) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords5 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector4);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable6 = tracerepo_runnable2.call((long) (short) -1, (java.lang.Runnable) removeCompleteReplicationRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable1);
        try {
            java.lang.String str3 = tracerepo_runnable2.getReturn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496731344L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array27 = new java.lang.String[] { "Master", "Unordered Work Assigner", "Accumulo", "hi!", "", "", "Sequential Work Assigner", "exportVersion", "ExportTable", "Data-Center Replication Metrics", "CancelCompactions", "srcDataVersion", "Thrift", "MasterReplication", "master", "MasterReplication", "MasterReplication", "TabletServer", "srcDataVersion", "CancelCompactions", "numPeers", "master" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str28, str_array27);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable30 = new org.apache.accumulo.master.tableOps.CloneTable("hi!", iD1, iD2, "MasterReplication", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str28);
        org.apache.accumulo.master.Master master32 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master33 = cloneTable30.call((long) (byte) 10, master32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "master", iD2, "");
        java.lang.String str5 = exportTable4.getDescription();
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = exportTable4.call((long) (byte) 0, master7);
        org.apache.accumulo.master.Master master10 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master11 = exportTable4.call((long) 1, master10);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertNotNull(repo_master8);
        org.junit.Assert.assertNotNull(repo_master11);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
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
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master39 = cloneTable36.call(1528496727550L, master38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner2 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration0, connector1);
        java.lang.String str3 = sequentialWorkAssigner2.getName();
        java.lang.String str4 = sequentialWorkAssigner2.getName();
        java.lang.String str5 = sequentialWorkAssigner2.getName();
        try {
            sequentialWorkAssigner2.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Sequential Work Assigner" + "'", str3.equals("Sequential Work Assigner"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Sequential Work Assigner" + "'", str4.equals("Sequential Work Assigner"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Sequential Work Assigner" + "'", str5.equals("Sequential Work Assigner"));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            deleteNamespace1.undo(1528496727977L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
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
            cloneTable36.undo(1528496727733L, master38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ShutdownTServer", "ShutdownTServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) (byte) 1, master5);
        org.apache.accumulo.master.Master master8 = null;
        long long9 = createNamespace3.isReady((long) (short) -1, master8);
        org.junit.Assert.assertTrue(long9 == 0L);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "replicationQueue10m", "hi!");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo((long) (short) 0, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveTable(iD0, (long) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.accumulo.core.client.Connector connector0 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker1 = new org.apache.accumulo.master.replication.StatusMaker(connector0);
        statusMaker1.setSourceTableName("Accumulo");
        statusMaker1.setSourceTableName("exportVersion");
        statusMaker1.setSourceTableName("exportVersion");
        try {
            statusMaker1.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.RenameNamespace renameNamespace3 = new org.apache.accumulo.master.tableOps.RenameNamespace(iD0, "replicationQueue10m", "MasterReplication");
        java.lang.String str4 = renameNamespace3.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = renameNamespace3.isReady((long) (-1), master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "RenameNamespace" + "'", str4.equals("RenameNamespace"));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.accumulo.core.client.Connector connector0 = null;
        org.apache.accumulo.master.replication.StatusMaker statusMaker1 = new org.apache.accumulo.master.replication.StatusMaker(connector0);
        statusMaker1.setSourceTableName("Accumulo");
        statusMaker1.setSourceTableName("exportVersion");
        try {
            statusMaker1.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("MasterReplication", "", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        shutdownTServer2.undo(0L, master7);
        org.apache.accumulo.master.Master master10 = null;
        long long11 = shutdownTServer2.isReady(10L, master10);
        java.lang.String str12 = shutdownTServer2.getReturn();
        org.junit.Assert.assertTrue(long11 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = cancelCompactions2.call(1528496719616L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        java.lang.String str6 = shutdownTServer2.getDescription();
        org.apache.accumulo.master.Master master8 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = shutdownTServer2.call((long) 100, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ShutdownTServer" + "'", str6.equals("ShutdownTServer"));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable1);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords5 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector4);
        try {
            tracerepo_runnable2.undo((long) (byte) 0, (java.lang.Runnable) removeCompleteReplicationRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
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
            long long39 = cloneTable36.isReady(1528496713149L, master38);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        try {
            long long2 = org.apache.accumulo.master.tableOps.Utils.reserveHdfsDirectory("exportVersion", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "master", iD2, "");
        java.lang.String str5 = exportTable4.getDescription();
        java.lang.String str6 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master8 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = exportTable4.call(1528496729268L, master8);
        java.lang.String str10 = exportTable4.getDescription();
        org.apache.accumulo.master.Master master12 = null;
        try {
            long long13 = exportTable4.isReady((-1L), master12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(repo_master9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ExportTable" + "'", str10.equals("ExportTable"));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ExportTable", "TabletServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) '4', master5);
        org.apache.accumulo.master.Master master8 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = createNamespace3.call((long) 1, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "replicationQueue10m", "hi!");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496711176L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        java.lang.String str5 = exportTable4.getDescription();
        org.apache.accumulo.master.Master master7 = null;
        org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master8 = exportTable4.call(10L, master7);
        org.apache.accumulo.master.Master master10 = null;
        try {
            exportTable4.undo((long) 5, master10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertNotNull(repo_master8);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "maxReplicationThreads", "Unordered Work Assigner");
        java.lang.String str5 = renameTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            long long8 = renameTable4.isReady((long) 1, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = cancelCompactions2.call(1528496719616L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "filesPendingReplication", iD2, "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        try {
            exportTable4.undo(1528496730308L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable1);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords removeCompleteReplicationRecords5 = new org.apache.accumulo.master.replication.RemoveCompleteReplicationRecords(connector4);
        try {
            long long6 = tracerepo_runnable2.isReady(0L, (java.lang.Runnable) removeCompleteReplicationRecords5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue", "Unordered Work Assigner", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo(1528496727977L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady((long) (byte) 0, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "master", iD2, "");
        java.lang.String str5 = exportTable4.getDescription();
        java.lang.String str6 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master8 = null;
        try {
            exportTable4.undo((long) (short) -1, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            deleteNamespace1.undo(0L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = null;
        org.apache.accumulo.master.tableOps.CreateNamespace createNamespace3 = new org.apache.accumulo.master.tableOps.CreateNamespace("ExportTable", "TabletServer", map_str_str2);
        org.apache.accumulo.master.Master master5 = null;
        createNamespace3.undo((long) '#', master5);
        org.apache.accumulo.master.Master master8 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master9 = createNamespace3.call(1528496713149L, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, (long) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "replicationQueue10m", "failures.txt", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo(1528496726670L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            cancelCompactions2.undo(1528496713149L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "Master", iD2, "^([a-z0-9]+)$");
        java.lang.String str5 = exportTable4.getDescription();
        org.apache.accumulo.master.Master master7 = null;
        try {
            long long8 = exportTable4.isReady(10L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        org.apache.accumulo.core.master.thrift.MasterState masterState2 = null;
        tableStats0.end(masterState2);
        long long4 = tableStats0.lastScanFinished();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertTrue(long4 == 1528496735055L);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveNamespace(iD0, (long) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        org.apache.accumulo.core.client.Connector connector5 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater6 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector5);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable7 = tracerepo_runnable2.call((long) '#', (java.lang.Runnable) finishedWorkUpdater6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            cloneTable21.undo(1L, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.commons.configuration.Configuration configuration0 = null;
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration1 = org.apache.accumulo.core.client.impl.ClientContext.convertClientConfig(configuration0);
        org.apache.accumulo.core.client.Connector connector2 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner3 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector2);
        org.apache.accumulo.core.client.Connector connector4 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner5 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration1, connector4);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner7 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration1, connector6);
        org.apache.accumulo.master.Master master8 = null;
        try {
            org.apache.accumulo.master.metrics.MasterMetricsFactory masterMetricsFactory9 = new org.apache.accumulo.master.metrics.MasterMetricsFactory(accumuloConfiguration1, master8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(accumuloConfiguration1);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "", "MasterReplication", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = bulkImport4.call((long) (byte) 0, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
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
            exportTable4.undo(1528496727711L, master14);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(repo_master8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(repo_master12);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "^([a-z0-9]+)$", "exportVersion");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(100L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable2);
        try {
            java.lang.String str4 = tracerepo_runnable3.getDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("", "numPeers", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.accumulo.server.master.state.TServerInstance tServerInstance0 = null;
        org.apache.accumulo.master.tserverOps.ShutdownTServer shutdownTServer2 = new org.apache.accumulo.master.tserverOps.ShutdownTServer(tServerInstance0, true);
        org.apache.accumulo.master.Master master4 = null;
        shutdownTServer2.undo((long) (short) -1, master4);
        org.apache.accumulo.master.Master master7 = null;
        long long8 = shutdownTServer2.isReady((long) (byte) 1, master7);
        org.apache.accumulo.master.Master master10 = null;
        shutdownTServer2.undo((long) '4', master10);
        org.apache.accumulo.master.Master master13 = null;
        long long14 = shutdownTServer2.isReady((long) (short) -1, master13);
        org.junit.Assert.assertTrue(long8 == 0L);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "exportVersion", "^([a-z0-9]+)$", false);
        java.lang.String str5 = bulkImport4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            bulkImport4.undo(1528496727550L, master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("^([a-z0-9]+)$", "Data-Center Replication Metrics", "Thrift", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = importTable4.isReady((long) ' ', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "Master", iD2, "^([a-z0-9]+)$");
        java.lang.String str5 = exportTable4.getDescription();
        java.lang.String str6 = exportTable4.getDescription();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ExportTable" + "'", str5.equals("ExportTable"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ExportTable" + "'", str6.equals("ExportTable"));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("", "maxReplicationThreads", "Master,sub=Replication", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo(1528496731344L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
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
            cloneTable42.undo(100L, master44);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.accumulo.core.client.impl.Namespace.ID iD1 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "Accumulo", "", "hi!", "Master,sub=Replication", "", "Thrift", "TabletServer", "ShutdownTServer", "CancelCompactions", "replicationQueue", "^([a-z0-9]+)$", "MasterReplication" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str19, str_array18);
        org.apache.accumulo.master.tableOps.CloneTable cloneTable21 = new org.apache.accumulo.master.tableOps.CloneTable("TabletServer", iD1, iD2, "", map_str_str4, (java.util.Set<java.lang.String>) linkedhashset_str19);
        org.apache.accumulo.master.Master master23 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master24 = cloneTable21.call(1528496735055L, master23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.accumulo.core.client.admin.TimeType timeType2 = null;
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.accumulo.core.client.impl.Namespace.ID iD4 = null;
        try {
            org.apache.accumulo.master.tableOps.CreateTable createTable5 = new org.apache.accumulo.master.tableOps.CreateTable("Master,sub=Replication", "ShutdownTServer", timeType2, map_str_str3, iD4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "maxReplicationThreads", "Unordered Work Assigner");
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = renameTable4.call(1528496714506L, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master4 = deleteNamespace1.call(1528496727977L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        org.apache.accumulo.core.master.thrift.MasterState masterState1 = tableStats0.getLastMasterState();
        java.util.Map<org.apache.accumulo.core.client.impl.Table.ID, org.apache.accumulo.master.state.TableCounts> map_iD_tableCounts2 = tableStats0.getLast();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts4 = tableStats0.getLast(iD3);
        long long5 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD6 = null;
        org.apache.accumulo.server.master.state.TabletState tabletState7 = null;
        try {
            tableStats0.update(iD6, tabletState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(masterState1);
        org.junit.Assert.assertNotNull(map_iD_tableCounts2);
        org.junit.Assert.assertNotNull(tableCounts4);
        org.junit.Assert.assertTrue(long5 == 1528496735910L);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.accumulo.master.state.TableStats tableStats0 = new org.apache.accumulo.master.state.TableStats();
        long long1 = tableStats0.lastScanFinished();
        long long2 = tableStats0.getScanTime();
        org.apache.accumulo.core.client.impl.Table.ID iD3 = null;
        org.apache.accumulo.master.state.TableCounts tableCounts4 = tableStats0.getLast(iD3);
        int i5 = tableCounts4.unassigned();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertTrue(long2 == 1528496735927L);
        org.junit.Assert.assertNotNull(tableCounts4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "CancelCompactions", "replicationQueue10m", false);
        org.apache.accumulo.master.Master master6 = null;
        try {
            bulkImport4.undo((-1L), master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.accumulo.core.client.impl.Namespace.ID iD3 = null;
        org.apache.accumulo.master.tableOps.ImportTable importTable4 = new org.apache.accumulo.master.tableOps.ImportTable("Master,sub=Replication", "Accumulo", "replicationQueue", iD3);
        org.apache.accumulo.master.Master master6 = null;
        try {
            importTable4.undo((long) '#', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master5 = deleteTable2.call(1528496727711L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.accumulo.core.client.impl.AbstractId abstractId0 = null;
        try {
            java.util.concurrent.locks.Lock lock2 = org.apache.accumulo.master.tableOps.Utils.getReadLock(abstractId0, 1528496730542L);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        byte[] byte_array3 = new byte[] { (byte) 100 };
        byte[] byte_array5 = new byte[] { (byte) 0 };
        org.apache.accumulo.core.client.IteratorSetting[] iteratorSetting_array6 = new org.apache.accumulo.core.client.IteratorSetting[] {};
        java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting> arraylist_iteratorSetting7 = new java.util.ArrayList<org.apache.accumulo.core.client.IteratorSetting>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting7, iteratorSetting_array6);
        org.apache.accumulo.core.client.admin.CompactionStrategyConfig compactionStrategyConfig9 = null;
        try {
            org.apache.accumulo.master.tableOps.CompactRange compactRange10 = new org.apache.accumulo.master.tableOps.CompactRange(iD0, iD1, byte_array3, byte_array5, (java.util.List<org.apache.accumulo.core.client.IteratorSetting>) arraylist_iteratorSetting7, compactionStrategyConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNotNull(byte_array5);
        org.junit.Assert.assertNotNull(iteratorSetting_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.RenameTable renameTable4 = new org.apache.accumulo.master.tableOps.RenameTable(iD0, iD1, "Sequential Work Assigner", "^([a-z0-9]+)$");
        org.apache.accumulo.master.Master master6 = null;
        try {
            renameTable4.undo((long) (byte) 100, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.DeleteTable deleteTable2 = new org.apache.accumulo.master.tableOps.DeleteTable(iD0, iD1);
        org.apache.accumulo.master.Master master4 = null;
        try {
            long long5 = deleteTable2.isReady(1528496735055L, master4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD2 = null;
        org.apache.accumulo.master.tableOps.ExportTable exportTable4 = new org.apache.accumulo.master.tableOps.ExportTable(iD0, "exportVersion", iD2, "TabletServer");
        java.lang.String str5 = exportTable4.getReturn();
        org.apache.accumulo.master.Master master7 = null;
        try {
            exportTable4.undo((long) '#', master7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.SequentialWorkAssigner sequentialWorkAssigner2 = new org.apache.accumulo.master.replication.SequentialWorkAssigner(accumuloConfiguration0, connector1);
        java.lang.String str3 = sequentialWorkAssigner2.getName();
        java.lang.String str4 = sequentialWorkAssigner2.getName();
        try {
            sequentialWorkAssigner2.assignWork();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Sequential Work Assigner" + "'", str3.equals("Sequential Work Assigner"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Sequential Work Assigner" + "'", str4.equals("Sequential Work Assigner"));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable0 = null;
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable1 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable2 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable3 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>(repo_runnable0);
        org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable> tracerepo_runnable4 = new org.apache.accumulo.master.tableOps.TraceRepo<java.lang.Runnable>((org.apache.accumulo.fate.Repo<java.lang.Runnable>) tracerepo_runnable3);
        org.apache.accumulo.core.client.Connector connector6 = null;
        org.apache.accumulo.master.replication.FinishedWorkUpdater finishedWorkUpdater7 = new org.apache.accumulo.master.replication.FinishedWorkUpdater(connector6);
        try {
            org.apache.accumulo.fate.Repo<java.lang.Runnable> repo_runnable8 = tracerepo_runnable3.call(1528496735705L, (java.lang.Runnable) finishedWorkUpdater7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.core.client.impl.thrift.TableOperation tableOperation4 = null;
        try {
            long long5 = org.apache.accumulo.master.tableOps.Utils.reserveTable(iD0, 0L, false, false, tableOperation4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            cancelCompactions2.undo((long) ' ', master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.core.client.impl.Table.ID iD1 = null;
        org.apache.accumulo.master.tableOps.CancelCompactions cancelCompactions2 = new org.apache.accumulo.master.tableOps.CancelCompactions(iD0, iD1);
        java.lang.String str3 = cancelCompactions2.getDescription();
        java.lang.String str4 = cancelCompactions2.getDescription();
        org.apache.accumulo.master.Master master6 = null;
        try {
            org.apache.accumulo.fate.Repo<org.apache.accumulo.master.Master> repo_master7 = cancelCompactions2.call((long) (short) -1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CancelCompactions" + "'", str3.equals("CancelCompactions"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CancelCompactions" + "'", str4.equals("CancelCompactions"));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.accumulo.core.conf.AccumuloConfiguration accumuloConfiguration0 = null;
        org.apache.accumulo.core.client.Connector connector1 = null;
        org.apache.accumulo.master.replication.UnorderedWorkAssigner unorderedWorkAssigner2 = new org.apache.accumulo.master.replication.UnorderedWorkAssigner(accumuloConfiguration0, connector1);
        java.lang.String str3 = unorderedWorkAssigner2.getName();
        java.lang.String str4 = unorderedWorkAssigner2.getName();
        java.lang.String str5 = unorderedWorkAssigner2.getName();
        java.lang.String str6 = unorderedWorkAssigner2.getName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Unordered Work Assigner" + "'", str3.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Unordered Work Assigner" + "'", str4.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Unordered Work Assigner" + "'", str5.equals("Unordered Work Assigner"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Unordered Work Assigner" + "'", str6.equals("Unordered Work Assigner"));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.accumulo.core.client.impl.Table.ID iD0 = null;
        org.apache.accumulo.master.tableOps.BulkImport bulkImport4 = new org.apache.accumulo.master.tableOps.BulkImport(iD0, "filesPendingReplication", "failures.txt", true);
        org.apache.accumulo.master.Master master6 = null;
        try {
            long long7 = bulkImport4.isReady((long) (byte) 1, master6);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.accumulo.core.client.impl.Namespace.ID iD0 = null;
        org.apache.accumulo.master.tableOps.DeleteNamespace deleteNamespace1 = new org.apache.accumulo.master.tableOps.DeleteNamespace(iD0);
        org.apache.accumulo.master.Master master3 = null;
        try {
            long long4 = deleteNamespace1.isReady(1528496727711L, master3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        try {
            org.apache.accumulo.master.tableOps.Utils.unreserveHdfsDirectory("", (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }
}

