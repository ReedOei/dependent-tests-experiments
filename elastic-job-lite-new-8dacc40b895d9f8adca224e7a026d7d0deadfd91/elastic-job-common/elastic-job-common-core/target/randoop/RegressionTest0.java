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
        javax.sql.DataSource dataSource0 = null;
        try {
            com.dangdang.ddframe.job.event.rdb.JobEventRdbListener jobEventRdbListener1 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbListener(dataSource0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        try {
            java.lang.String str1 = com.dangdang.ddframe.job.context.TaskContext.getIdForUnassignedSlave("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.dangdang.ddframe.job.api.dataflow.DataflowJob<java.lang.Object> dataflowjob_obj0 = null;
        com.dangdang.ddframe.job.executor.JobFacade jobFacade1 = null;
        try {
            com.dangdang.ddframe.job.executor.type.DataflowJobExecutor dataflowJobExecutor2 = new com.dangdang.ddframe.job.executor.type.DataflowJobExecutor(dataflowjob_obj0, jobFacade1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source0 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.LITE_EXECUTOR;
        org.junit.Assert.assertTrue("'" + source0 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.LITE_EXECUTOR + "'", source0.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.LITE_EXECUTOR));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.dangdang.ddframe.job.api.JobType jobType0 = com.dangdang.ddframe.job.api.JobType.SCRIPT;
        org.junit.Assert.assertTrue("'" + jobType0 + "' != '" + com.dangdang.ddframe.job.api.JobType.SCRIPT + "'", jobType0.equals(com.dangdang.ddframe.job.api.JobType.SCRIPT));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str1 = com.dangdang.ddframe.job.util.digest.Encryption.md5("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str1.equals("aff97160474a056e838c1f721af01edf"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i3, i_array2);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo5 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i3);
        java.util.List<java.lang.Integer> list_i6 = metaInfo5.getShardingItems();
        java.lang.String str7 = metaInfo5.getJobName();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(list_i6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType0 = com.dangdang.ddframe.job.event.rdb.DatabaseType.DB2;
        org.junit.Assert.assertTrue("'" + databaseType0 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.DB2 + "'", databaseType0.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.DB2));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration0 = null;
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration3 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration0, "", true);
        java.lang.String str4 = dataflowJobConfiguration3.getJobClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType0 = com.dangdang.ddframe.job.event.rdb.DatabaseType.SQLServer;
        org.junit.Assert.assertTrue("'" + databaseType0 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.SQLServer + "'", databaseType0.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.SQLServer));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { (-1), 1, 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        java.lang.String str6 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString((java.util.List<java.lang.Integer>) arraylist_i4);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1,1,10" + "'", str6.equals("-1,1,10"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.dangdang.ddframe.job.api.ElasticJob elasticJob0 = null;
        com.dangdang.ddframe.job.executor.JobFacade jobFacade1 = null;
        try {
            com.dangdang.ddframe.job.executor.AbstractElasticJobExecutor abstractElasticJobExecutor2 = com.dangdang.ddframe.job.executor.JobExecutorFactory.getJobExecutor(elasticJob0, jobFacade1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        try {
            com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject executorServiceObject2 = new com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.dangdang.ddframe.job.util.config.ShardingItems shardingItems0 = new com.dangdang.ddframe.job.util.config.ShardingItems();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.dangdang.ddframe.job.api.JobType jobType0 = com.dangdang.ddframe.job.api.JobType.SIMPLE;
        org.junit.Assert.assertTrue("'" + jobType0 + "' != '" + com.dangdang.ddframe.job.api.JobType.SIMPLE + "'", jobType0.equals(com.dangdang.ddframe.job.api.JobType.SIMPLE));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.reflect.Type type0 = null;
        com.google.gson.TypeAdapter typeAdapter1 = null;
        try {
            com.dangdang.ddframe.job.util.json.GsonFactory.registerTypeAdapter(type0, typeAdapter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.dangdang.ddframe.job.util.concurrent.BlockUtils.sleep((long) (byte) 10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.dangdang.ddframe.job.event.JobEventConfiguration jobEventConfiguration0 = null;
        try {
            com.dangdang.ddframe.job.event.JobEventBus jobEventBus1 = new com.dangdang.ddframe.job.event.JobEventBus(jobEventConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        javax.sql.DataSource dataSource0 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch jobEventRdbSearch1 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch(dataSource0);
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition2 = null;
        try {
            com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<com.dangdang.ddframe.job.event.type.JobStatusTraceEvent> result_jobStatusTraceEvent3 = jobEventRdbSearch1.findJobStatusTraceEvents(condition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("hi!", "22f408e9-cb1a-482c-9330-8c6ee4df73b5", (int) (short) 100, "10", map_i_str4, (int) (short) 1);
        try {
            com.dangdang.ddframe.job.api.ShardingContext shardingContext8 = new com.dangdang.ddframe.job.api.ShardingContext(shardingContexts6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.String str1 = com.dangdang.ddframe.job.util.digest.Encryption.md5("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "d41d8cd98f00b204e9800998ecf8427e" + "'", str1.equals("d41d8cd98f00b204e9800998ecf8427e"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException10 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array9);
        java.lang.String str11 = appConfigurationException10.toString();
        appConfigurationException4.addSuppressed((java.lang.Throwable) appConfigurationException10);
        java.lang.Throwable throwable13 = null;
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException14 = new com.dangdang.ddframe.job.exception.JobSystemException(throwable13);
        try {
            appConfigurationException4.addSuppressed(throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str1 = com.dangdang.ddframe.job.util.digest.Encryption.md5("845a6b89-4321-431d-b9af-62c3463576ab");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11948a5fef67caa97a657c2ad1ab2a63" + "'", str1.equals("11948a5fef67caa97a657c2ad1ab2a63"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType4 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent8 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source3, executionType4, "aff97160474a056e838c1f721af01edf", state6, "");
        java.lang.String str9 = jobStatusTraceEvent8.getId();
        java.lang.String str10 = jobStatusTraceEvent8.getSlaveId();
        java.lang.String str11 = jobStatusTraceEvent8.getShardingItems();
        java.lang.String str12 = jobStatusTraceEvent8.getId();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "f37b267c-b9f2-479d-a8d8-f8022b36319b" + "'", str9.equals("f37b267c-b9f2-479d-a8d8-f8022b36319b"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str10.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str11.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "f37b267c-b9f2-479d-a8d8-f8022b36319b" + "'", str12.equals("f37b267c-b9f2-479d-a8d8-f8022b36319b"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("-1,1,10", "aff97160474a056e838c1f721af01edf", (int) '4', "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", map_i_str4, (int) (byte) -1);
        int i7 = shardingContexts6.getShardingTotalCount();
        org.junit.Assert.assertTrue(i7 == 52);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state0 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_RUNNING;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_RUNNING + "'", state0.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_RUNNING));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Throwable throwable0 = null;
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException1 = new com.dangdang.ddframe.job.exception.JobSystemException(throwable0);
        java.lang.String str2 = com.dangdang.ddframe.job.exception.ExceptionUtil.transform(throwable0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            zookeeperRegistryCenter5.remove("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType4 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent8 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source3, executionType4, "aff97160474a056e838c1f721af01edf", state6, "");
        java.lang.String str9 = jobStatusTraceEvent8.getId();
        java.lang.String str10 = jobStatusTraceEvent8.getSlaveId();
        java.lang.String str11 = jobStatusTraceEvent8.getShardingItems();
        java.lang.String str12 = jobStatusTraceEvent8.getJobName();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "eced765e-f561-4a4a-981e-06adcd7055da" + "'", str9.equals("eced765e-f561-4a4a-981e-06adcd7055da"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str10.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str11.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        javax.sql.DataSource dataSource0 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch jobEventRdbSearch1 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch(dataSource0);
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition2 = null;
        try {
            com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<com.dangdang.ddframe.job.event.type.JobExecutionEvent> result_jobExecutionEvent3 = jobEventRdbSearch1.findJobExecutionEvents(condition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.dangdang.ddframe.job.executor.JobFacade jobFacade0 = null;
        try {
            com.dangdang.ddframe.job.executor.type.ScriptJobExecutor scriptJobExecutor1 = new com.dangdang.ddframe.job.executor.type.ScriptJobExecutor(jobFacade0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            java.lang.String str7 = zookeeperRegistryCenter5.get("720a31a1-6e31-4409-abe8-90f69964d02f");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            java.util.List<java.lang.String> list_str7 = zookeeperRegistryCenter5.getChildrenKeys("f5f347ae-ac85-473e-9404-ec426b8a1fa1");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.Object[] obj_array12 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException13 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array12);
        java.lang.String str14 = appConfigurationException13.toString();
        java.lang.Object[] obj_array18 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException19 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array18);
        java.lang.String str20 = appConfigurationException19.toString();
        appConfigurationException13.addSuppressed((java.lang.Throwable) appConfigurationException19);
        java.lang.Throwable throwable22 = null;
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException23 = new com.dangdang.ddframe.job.exception.JobSystemException(throwable22);
        appConfigurationException13.addSuppressed((java.lang.Throwable) jobSystemException23);
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str29 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts31 = new com.dangdang.ddframe.job.executor.ShardingContexts("-1,1,10", "aff97160474a056e838c1f721af01edf", (int) '4', "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", map_i_str29, (int) (byte) -1);
        int i32 = shardingContexts31.getShardingTotalCount();
        java.lang.Integer[] i_array37 = new java.lang.Integer[] { (-1), 1, 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i38 = new java.util.ArrayList<java.lang.Integer>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i38, i_array37);
        java.lang.String str40 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString((java.util.List<java.lang.Integer>) arraylist_i38);
        java.lang.Object[] obj_array44 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException45 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array44);
        java.lang.String str46 = appConfigurationException45.toString();
        java.lang.Throwable[] throwable_array47 = appConfigurationException45.getSuppressed();
        java.lang.Cloneable[] cloneable_array48 = new java.lang.Cloneable[] { arraylist_i38, throwable_array47 };
        java.util.ArrayList<java.lang.Cloneable> arraylist_cloneable49 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) arraylist_cloneable49, cloneable_array48);
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<java.lang.Cloneable> result_cloneable51 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<java.lang.Cloneable>((java.lang.Integer) 10, (java.util.List<java.lang.Cloneable>) arraylist_cloneable49);
        java.lang.Object[] obj_array52 = new java.lang.Object[] { list_i7, 0L, jobSystemException23, shardingContexts31, result_cloneable51 };
        com.dangdang.ddframe.job.exception.JobExecutionEnvironmentException jobExecutionEnvironmentException53 = new com.dangdang.ddframe.job.exception.JobExecutionEnvironmentException("aff97160474a056e838c1f721af01edf", obj_array52);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str14.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str20.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue(i32 == 52);
        org.junit.Assert.assertNotNull(i_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-1,1,10" + "'", str40.equals("-1,1,10"));
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str46.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array47);
        org.junit.Assert.assertNotNull(cloneable_array48);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(obj_array52);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum1 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.from("");
        org.junit.Assert.assertNull(jobPropertiesEnum1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType4 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent8 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source3, executionType4, "aff97160474a056e838c1f721af01edf", state6, "");
        java.lang.String str9 = jobStatusTraceEvent8.getId();
        java.lang.String str10 = jobStatusTraceEvent8.getSlaveId();
        java.lang.String str11 = jobStatusTraceEvent8.getShardingItems();
        java.util.Date date12 = jobStatusTraceEvent8.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source13 = jobStatusTraceEvent8.getSource();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "738e59ae-440b-4d0d-b302-7d7b5d191676" + "'", str9.equals("738e59ae-440b-4d0d-b302-7d7b5d191676"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str10.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str11.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertNull(source13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.dangdang.ddframe.job.api.simple.SimpleJob simpleJob0 = null;
        com.dangdang.ddframe.job.executor.JobFacade jobFacade1 = null;
        try {
            com.dangdang.ddframe.job.executor.type.SimpleJobExecutor simpleJobExecutor2 = new com.dangdang.ddframe.job.executor.type.SimpleJobExecutor(simpleJob0, jobFacade1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state0 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_ERROR;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_ERROR + "'", state0.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_ERROR));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.dangdang.ddframe.job.util.concurrent.BlockUtils.waitingShortTime();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.dangdang.ddframe.job.executor.handler.ExecutorServiceHandler executorServiceHandler1 = null;
        try {
            java.util.concurrent.ExecutorService executorService2 = com.dangdang.ddframe.job.executor.handler.ExecutorServiceHandlerRegistry.getExecutorServiceHandler("8ee51d76-184c-4da8-93f2-731fbd1db162", executorServiceHandler1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source5 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent10 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source5, executionType6, "aff97160474a056e838c1f721af01edf", state8, "");
        java.lang.String str11 = jobStatusTraceEvent10.getId();
        java.lang.String str12 = jobStatusTraceEvent10.getShardingItems();
        java.util.Date date13 = jobStatusTraceEvent10.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source17 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType18 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state20 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent22 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source17, executionType18, "aff97160474a056e838c1f721af01edf", state20, "");
        java.lang.String str23 = jobStatusTraceEvent22.getId();
        java.lang.String str24 = jobStatusTraceEvent22.getShardingItems();
        java.util.Date date25 = jobStatusTraceEvent22.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics26 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date13, date25);
        long long27 = taskRunningStatistics26.getId();
        int i28 = taskRunningStatistics26.getRunningCount();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "18220525-2509-40cc-b0e7-71f957a72c51" + "'", str11.equals("18220525-2509-40cc-b0e7-71f957a72c51"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str12.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "3cae38aa-7ef9-49ac-8a03-3fd0876da30e" + "'", str23.equals("3cae38aa-7ef9-49ac-8a03-3fd0876da30e"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str24.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertTrue(long27 == 0L);
        org.junit.Assert.assertTrue(i28 == 10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.curator.framework.CuratorFramework curatorFramework1 = null;
        com.dangdang.ddframe.job.reg.base.ElectionCandidate electionCandidate3 = null;
        try {
            com.dangdang.ddframe.job.reg.zookeeper.ZookeeperElectionService zookeeperElectionService4 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperElectionService("d41d8cd98f00b204e9800998ecf8427e", curatorFramework1, "0e33c984-838b-481e-8d6f-03b38f77ed0c", electionCandidate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("-1,1,10", "aff97160474a056e838c1f721af01edf", (int) '4', "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", map_i_str4, (int) (byte) -1);
        try {
            com.dangdang.ddframe.job.api.ShardingContext shardingContext8 = new com.dangdang.ddframe.job.api.ShardingContext(shardingContexts6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("6cccc9fb-a442-47eb-a302-6d86b68b40e4", "9a50607d-a4e8-4c75-b7b0-9a37a0bcd871");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("10");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder5.description("9a50607d-a4e8-4c75-b7b0-9a37a0bcd871");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder11 = builder9.shardingItemParameters("720a31a1-6e31-4409-abe8-90f69964d02f");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source1 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.LITE_EXECUTOR;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source2 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source[] source_array3 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source[] { source1, source2 };
        java.util.ArrayList<com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source> arraylist_source4 = new java.util.ArrayList<com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source>) arraylist_source4, source_array3);
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source> result_source6 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source>((java.lang.Integer) 52, (java.util.List<com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source>) arraylist_source4);
        org.junit.Assert.assertTrue("'" + source1 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.LITE_EXECUTOR + "'", source1.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.LITE_EXECUTOR));
        org.junit.Assert.assertTrue("'" + source2 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER + "'", source2.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER));
        org.junit.Assert.assertNotNull(source_array3);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        javax.sql.DataSource dataSource0 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch jobEventRdbSearch1 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch(dataSource0);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source9 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state12 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent14 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source9, executionType10, "aff97160474a056e838c1f721af01edf", state12, "");
        java.lang.String str15 = jobStatusTraceEvent14.getId();
        java.lang.String str16 = jobStatusTraceEvent14.getShardingItems();
        java.util.Date date17 = jobStatusTraceEvent14.getCreationTime();
        java.util.Date date18 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj19 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition20 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date17, date18, map_str_obj19);
        try {
            com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<com.dangdang.ddframe.job.event.type.JobStatusTraceEvent> result_jobStatusTraceEvent21 = jobEventRdbSearch1.findJobStatusTraceEvents(condition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "db77d376-a69f-4bbd-b211-0ddd4116be50" + "'", str15.equals("db77d376-a69f-4bbd-b211-0ddd4116be50"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str16.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date17);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.List<java.lang.Cloneable> list_cloneable1 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<java.lang.Cloneable> result_cloneable2 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<java.lang.Cloneable>((java.lang.Integer) 3, list_cloneable1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType0 = com.dangdang.ddframe.job.event.rdb.DatabaseType.H2;
        org.junit.Assert.assertTrue("'" + databaseType0 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.H2 + "'", databaseType0.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.H2));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("d0cc04e7-efe9-4167-a154-8b65210ed06d", "9f29874b-7365-4fc9-aa02-e897d5bb5dcb");
        int i3 = zookeeperConfiguration2.getConnectionTimeoutMilliseconds();
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Date date1 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics2 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date1);
        java.util.Date date3 = jobRunningStatistics2.getCreationTime();
        int i4 = jobRunningStatistics2.getRunningCount();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        java.lang.String str12 = taskContext11.getSlaveId();
        taskContext11.setSlaveId("9f29874b-7365-4fc9-aa02-e897d5bb5dcb");
        java.lang.String str15 = taskContext11.toString();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "128.208.4.97" + "'", str12.equals("128.208.4.97"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str1 = com.dangdang.ddframe.job.util.digest.Encryption.md5("ecc20b57-52a5-4026-b6c0-d9395b02f7cf");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "cf8a01d8c1d240268658d404d6303d32" + "'", str1.equals("cf8a01d8c1d240268658d404d6303d32"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state0 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_LOST;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_LOST + "'", state0.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_LOST));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        javax.sql.DataSource dataSource0 = null;
        try {
            com.dangdang.ddframe.job.statistics.rdb.StatisticRdbRepository statisticRdbRepository1 = new com.dangdang.ddframe.job.statistics.rdb.StatisticRdbRepository(dataSource0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        try {
            java.lang.String str1 = com.dangdang.ddframe.job.context.TaskContext.getIdForUnassignedSlave("b0ada993-d6e1-4910-ac71-a51c3210b1d9");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state0 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_STAGING;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_STAGING + "'", state0.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_STAGING));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.dangdang.ddframe.job.util.concurrent.BlockUtils.sleep((long) 52);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b13 = taskContext11.equals((java.lang.Object) '#');
        java.lang.String str14 = taskContext11.getId();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        java.lang.String str12 = taskContext11.getSlaveId();
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = taskContext11.getType();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "128.208.4.97" + "'", str12.equals("128.208.4.97"));
        org.junit.Assert.assertTrue("'" + executionType13 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType13.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource0 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.NORMAL_TRIGGER;
        org.junit.Assert.assertTrue("'" + executionSource0 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.NORMAL_TRIGGER + "'", executionSource0.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.NORMAL_TRIGGER));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source6 = null;
        java.lang.Integer[] i_array10 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i11, i_array10);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo13 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i11);
        java.util.List<java.lang.Integer> list_i14 = metaInfo13.getShardingItems();
        java.lang.String str15 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i14);
        com.dangdang.ddframe.job.context.ExecutionType executionType16 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext18 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i14, executionType16, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state20 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source27 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType28 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state30 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent32 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source27, executionType28, "aff97160474a056e838c1f721af01edf", state30, "");
        java.lang.String str33 = jobStatusTraceEvent32.getId();
        java.lang.String str34 = jobStatusTraceEvent32.getShardingItems();
        java.util.Date date35 = jobStatusTraceEvent32.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source39 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType40 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state42 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent44 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source39, executionType40, "aff97160474a056e838c1f721af01edf", state42, "");
        java.lang.String str45 = jobStatusTraceEvent44.getId();
        java.lang.String str46 = jobStatusTraceEvent44.getShardingItems();
        java.util.Date date47 = jobStatusTraceEvent44.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics48 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date35, date47);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent49 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source6, executionType16, "128.208.4.97", state20, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date35);
        com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics jobRegisterStatistics50 = new com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics((int) (short) 10, date35);
        java.util.Date date51 = jobRegisterStatistics50.getStatisticsTime();
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(list_i14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10" + "'", str15.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType16 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType16.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state20 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state20.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "9eaaa3b5-8493-4825-8d70-85a402798479" + "'", str33.equals("9eaaa3b5-8493-4825-8d70-85a402798479"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str34.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "81674592-e7c3-4a59-8193-2fadeac4cbd4" + "'", str45.equals("81674592-e7c3-4a59-8193-2fadeac4cbd4"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str46.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertNotNull(date51);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.EnumMap<com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum, java.lang.String> enummap_jobPropertiesEnum_str0 = null;
        com.dangdang.ddframe.job.executor.handler.JobProperties jobProperties1 = new com.dangdang.ddframe.job.executor.handler.JobProperties(enummap_jobPropertiesEnum_str0);
        jobProperties1.put("8d4a5c91-8b38-4f21-ac3a-6f969ca8e9f7", "128.208.4.97");
        jobProperties1.put("ecc20b57-52a5-4026-b6c0-d9395b02f7cf", "b5641ed9-7f00-42b8-84fe-ed93ebeac240");
        try {
            java.lang.String str8 = jobProperties1.json();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo1 = com.dangdang.ddframe.job.context.TaskContext.MetaInfo.from("2b8109a1-0f3b-4158-8c18-45e863821443");
        org.junit.Assert.assertNotNull(metaInfo1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            zookeeperRegistryCenter5.persist("9eaaa3b5-8493-4825-8d70-85a402798479", "8f0e9b3e-3dfb-4d65-bfaa-40f368c4e0e8");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state0 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_KILLED;
        org.junit.Assert.assertTrue("'" + state0 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_KILLED + "'", state0.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_KILLED));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        org.apache.curator.framework.CuratorFramework curatorFramework6 = zookeeperRegistryCenter5.getClient();
        try {
            long long8 = zookeeperRegistryCenter5.getRegistryCenterTime("f5f347ae-ac85-473e-9404-ec426b8a1fa1");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertNull(curatorFramework6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.dangdang.ddframe.job.context.ExecutionType executionType0 = com.dangdang.ddframe.job.context.ExecutionType.READY;
        org.junit.Assert.assertTrue("'" + executionType0 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.READY + "'", executionType0.equals(com.dangdang.ddframe.job.context.ExecutionType.READY));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            java.lang.String str7 = zookeeperRegistryCenter5.get("97e61f56-746a-44ca-9d02-b65041954161");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source8 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source14 = null;
        java.lang.Integer[] i_array18 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i19 = new java.util.ArrayList<java.lang.Integer>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i19, i_array18);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo21 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i19);
        java.util.List<java.lang.Integer> list_i22 = metaInfo21.getShardingItems();
        java.lang.String str23 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i22);
        com.dangdang.ddframe.job.context.ExecutionType executionType24 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext26 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i22, executionType24, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state28 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source35 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType36 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state38 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent40 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source35, executionType36, "aff97160474a056e838c1f721af01edf", state38, "");
        java.lang.String str41 = jobStatusTraceEvent40.getId();
        java.lang.String str42 = jobStatusTraceEvent40.getShardingItems();
        java.util.Date date43 = jobStatusTraceEvent40.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source47 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType48 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state50 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent52 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source47, executionType48, "aff97160474a056e838c1f721af01edf", state50, "");
        java.lang.String str53 = jobStatusTraceEvent52.getId();
        java.lang.String str54 = jobStatusTraceEvent52.getShardingItems();
        java.util.Date date55 = jobStatusTraceEvent52.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics56 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date43, date55);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent57 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source14, executionType24, "128.208.4.97", state28, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date43);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state59 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent61 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("ee6144a8-6164-451f-9e3c-e3c85113af90", "d41d8cd98f00b204e9800998ecf8427e", "720a31a1-6e31-4409-abe8-90f69964d02f", source8, executionType24, "8d4a5c91-8b38-4f21-ac3a-6f969ca8e9f7", state59, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4");
        com.dangdang.ddframe.job.context.ExecutionType executionType62 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state64 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source71 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType72 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state74 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent76 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source71, executionType72, "aff97160474a056e838c1f721af01edf", state74, "");
        java.lang.String str77 = jobStatusTraceEvent76.getId();
        java.lang.String str78 = jobStatusTraceEvent76.getShardingItems();
        java.util.Date date79 = jobStatusTraceEvent76.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source83 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType84 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state86 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent88 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source83, executionType84, "aff97160474a056e838c1f721af01edf", state86, "");
        java.lang.String str89 = jobStatusTraceEvent88.getId();
        java.lang.String str90 = jobStatusTraceEvent88.getShardingItems();
        java.util.Date date91 = jobStatusTraceEvent88.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics92 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date79, date91);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent93 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("3cae38aa-7ef9-49ac-8a03-3fd0876da30e", "6672c855-ace2-4779-bdff-330d743fe162", "23b5f2f8-8322-48a7-8663-e88ed80c61f1", "9a50607d-a4e8-4c75-b7b0-9a37a0bcd871", "5b0e877d-c398-4f25-b46f-3a03e4ab95a4", source8, executionType62, "24fc29b5-4adc-41f8-96a8-04607ec1d4cc", state64, "5153ac74-7541-457e-bef8-c9969e17a79d", date91);
        org.junit.Assert.assertTrue("'" + source8 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER + "'", source8.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER));
        org.junit.Assert.assertNotNull(i_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(list_i22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "10" + "'", str23.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType24 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType24.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state28 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state28.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "bac9f337-eb42-4cb3-b627-1531931ff333" + "'", str41.equals("bac9f337-eb42-4cb3-b627-1531931ff333"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str42.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "261b4e37-64f8-409d-abb0-679f9d7bbb90" + "'", str53.equals("261b4e37-64f8-409d-abb0-679f9d7bbb90"));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str54.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertTrue("'" + state59 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED + "'", state59.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED));
        org.junit.Assert.assertTrue("'" + executionType62 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType62.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state64 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED + "'", state64.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "a681bb33-b97b-422e-a9d8-bfb1b6797980" + "'", str77.equals("a681bb33-b97b-422e-a9d8-bfb1b6797980"));
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str78.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "c8ef167c-d5e7-4ef6-8114-240ddae59a01" + "'", str89.equals("c8ef167c-d5e7-4ef6-8114-240ddae59a01"));
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str90.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date91);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException10 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array9);
        java.lang.String str11 = appConfigurationException10.toString();
        appConfigurationException4.addSuppressed((java.lang.Throwable) appConfigurationException10);
        com.dangdang.ddframe.job.reg.exception.RegException regException13 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException10);
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException14 = new com.dangdang.ddframe.job.exception.AppConfigurationException((java.lang.Throwable) appConfigurationException10);
        java.lang.String str15 = appConfigurationException14.toString();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str15.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration0 = null;
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration3 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration0, "", true);
        boolean b4 = dataflowJobConfiguration3.isStreamingProcess();
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration5 = dataflowJobConfiguration3.getCoreConfig();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(jobCoreConfiguration5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource6 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source13 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType14 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state16 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent18 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source13, executionType14, "aff97160474a056e838c1f721af01edf", state16, "");
        java.lang.String str19 = jobStatusTraceEvent18.getId();
        java.lang.String str20 = jobStatusTraceEvent18.getShardingItems();
        java.util.Date date21 = jobStatusTraceEvent18.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source25 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType26 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state28 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent30 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source25, executionType26, "aff97160474a056e838c1f721af01edf", state28, "");
        java.lang.String str31 = jobStatusTraceEvent30.getId();
        java.lang.String str32 = jobStatusTraceEvent30.getShardingItems();
        java.util.Date date33 = jobStatusTraceEvent30.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics34 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date21, date33);
        java.util.Date date36 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics37 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date36);
        java.util.Date date38 = jobRunningStatistics37.getCreationTime();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException44 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array43);
        java.lang.String str45 = appConfigurationException44.toString();
        java.lang.Throwable[] throwable_array46 = appConfigurationException44.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException47 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException44);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable49 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException47, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent50 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource6, (int) (byte) -1, date21, date38, false, jobExecutionEventThrowable49);
        java.util.Date date52 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics53 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date52);
        java.util.Date date54 = jobRunningStatistics53.getCreationTime();
        jobExecutionEvent50.setCompleteTime(date54);
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics56 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(10, date54);
        org.junit.Assert.assertTrue("'" + executionSource6 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource6.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "4c3d52b2-f3b1-4c8f-bf92-f0d2e95723e4" + "'", str19.equals("4c3d52b2-f3b1-4c8f-bf92-f0d2e95723e4"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str20.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "7841ca80-4b0f-43e8-b5ef-a398b52d6bf4" + "'", str31.equals("7841ca80-4b0f-43e8-b5ef-a398b52d6bf4"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str32.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str45.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array46);
        org.junit.Assert.assertNotNull(date54);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        com.dangdang.ddframe.job.exception.JobStatisticException jobStatisticException6 = new com.dangdang.ddframe.job.exception.JobStatisticException((java.lang.Exception) appConfigurationException4);
        com.dangdang.ddframe.job.exception.JobStatisticException jobStatisticException7 = new com.dangdang.ddframe.job.exception.JobStatisticException((java.lang.Exception) jobStatisticException6);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "f2da3452-ca49-4b9e-8e6a-53b0b3ca8c6c", (int) (byte) 10, "-1,1,10", map_i_str4, (int) (short) 1);
        try {
            com.dangdang.ddframe.job.api.ShardingContext shardingContext8 = new com.dangdang.ddframe.job.api.ShardingContext(shardingContexts6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        org.apache.curator.framework.CuratorFramework curatorFramework6 = zookeeperRegistryCenter5.getClient();
        try {
            int i8 = zookeeperRegistryCenter5.getNumChildren("9dcfbfd7-ce8a-4002-821b-8f5d6ca152dd");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertNull(curatorFramework6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("hi!", "22f408e9-cb1a-482c-9330-8c6ee4df73b5", (int) (short) 100, "10", map_i_str4, (int) (short) 1);
        int i7 = shardingContexts6.getJobEventSamplingCount();
        java.lang.String str8 = shardingContexts6.getJobName();
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "22f408e9-cb1a-482c-9330-8c6ee4df73b5" + "'", str8.equals("22f408e9-cb1a-482c-9330-8c6ee4df73b5"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.google.gson.Gson gson0 = com.dangdang.ddframe.job.util.json.GsonFactory.getGson();
        org.junit.Assert.assertNotNull(gson0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source5 = null;
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i10 = new java.util.ArrayList<java.lang.Integer>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i10, i_array9);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo12 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i10);
        java.util.List<java.lang.Integer> list_i13 = metaInfo12.getShardingItems();
        java.lang.String str14 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i13);
        com.dangdang.ddframe.job.context.ExecutionType executionType15 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext17 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i13, executionType15, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state19 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source26 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state29 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent31 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source26, executionType27, "aff97160474a056e838c1f721af01edf", state29, "");
        java.lang.String str32 = jobStatusTraceEvent31.getId();
        java.lang.String str33 = jobStatusTraceEvent31.getShardingItems();
        java.util.Date date34 = jobStatusTraceEvent31.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source38 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType39 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state41 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent43 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source38, executionType39, "aff97160474a056e838c1f721af01edf", state41, "");
        java.lang.String str44 = jobStatusTraceEvent43.getId();
        java.lang.String str45 = jobStatusTraceEvent43.getShardingItems();
        java.util.Date date46 = jobStatusTraceEvent43.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics47 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date34, date46);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent48 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source5, executionType15, "128.208.4.97", state19, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date34);
        jobStatusTraceEvent48.setOriginalTaskId("18220525-2509-40cc-b0e7-71f957a72c51");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state51 = jobStatusTraceEvent48.getState();
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(list_i13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10" + "'", str14.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType15 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType15.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state19 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state19.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "bc7c9a98-6a85-4696-b1e1-986be9bafac6" + "'", str32.equals("bc7c9a98-6a85-4696-b1e1-986be9bafac6"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str33.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "ce39fe81-621e-4a34-a654-b28944d02a4f" + "'", str44.equals("ce39fe81-621e-4a34-a654-b28944d02a4f"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str45.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertTrue("'" + state51 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state51.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException10 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array9);
        java.lang.String str11 = appConfigurationException10.toString();
        appConfigurationException4.addSuppressed((java.lang.Throwable) appConfigurationException10);
        try {
            com.dangdang.ddframe.job.reg.exception.RegExceptionHandler.handleException((java.lang.Exception) appConfigurationException10);
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            zookeeperRegistryCenter5.update("8ee51d76-184c-4da8-93f2-731fbd1db162", "2b8109a1-0f3b-4158-8c18-45e863821443");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source19 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType20 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state22 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent24 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source19, executionType20, "aff97160474a056e838c1f721af01edf", state22, "");
        java.lang.String str25 = jobStatusTraceEvent24.getId();
        java.lang.String str26 = jobStatusTraceEvent24.getShardingItems();
        java.util.Date date27 = jobStatusTraceEvent24.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics28 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date15, date27);
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics29 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics((int) ' ', date27);
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics30 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics(0, date27);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "822f3c87-0ee0-4da0-a545-282121e02b42" + "'", str13.equals("822f3c87-0ee0-4da0-a545-282121e02b42"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "a4a3389c-a9d9-4543-ac59-6de4f3588f51" + "'", str25.equals("a4a3389c-a9d9-4543-ac59-6de4f3588f51"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str26.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date27);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("-1,1,10", "aff97160474a056e838c1f721af01edf", (int) '4', "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", map_i_str4, (int) (byte) -1);
        java.lang.String str7 = shardingContexts6.getTaskId();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1,1,10" + "'", str7.equals("-1,1,10"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        try {
            com.dangdang.ddframe.job.util.config.ShardingItemParameters shardingItemParameters1 = new com.dangdang.ddframe.job.util.config.ShardingItemParameters("8ee51d76-184c-4da8-93f2-731fbd1db162");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.exception.JobConfigurationException");
        } catch (com.dangdang.ddframe.job.exception.JobConfigurationException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.Date date1 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics2 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date1);
        java.util.Date date3 = jobRunningStatistics2.getCreationTime();
        long long4 = jobRunningStatistics2.getId();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertTrue(long4 == 0L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException59 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array58);
        java.lang.String str60 = appConfigurationException59.toString();
        java.lang.Throwable[] throwable_array61 = appConfigurationException59.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException62 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent63 = jobExecutionEvent49.executionFailure((java.lang.Throwable) appConfigurationException59);
        java.lang.String str64 = jobExecutionEvent63.getFailureCause();
        boolean b65 = jobExecutionEvent63.isSuccess();
        jobExecutionEvent63.setSuccess(true);
        java.lang.String str68 = jobExecutionEvent63.getJobName();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "5408106b-2c7a-4d4c-967a-c4e2ee419cc6" + "'", str18.equals("5408106b-2c7a-4d4c-967a-c4e2ee419cc6"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "c52e5821-cf1e-460b-93cf-d0d4032245e7" + "'", str30.equals("c52e5821-cf1e-460b-93cf-d0d4032245e7"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str60.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(jobExecutionEvent63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n" + "'", str64.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n"));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "754a6b00-33cb-4148-ae8d-e84e632e718e" + "'", str68.equals("754a6b00-33cb-4148-ae8d-e84e632e718e"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException59 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array58);
        java.lang.String str60 = appConfigurationException59.toString();
        java.lang.Throwable[] throwable_array61 = appConfigurationException59.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException62 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent63 = jobExecutionEvent49.executionFailure((java.lang.Throwable) appConfigurationException59);
        java.util.Date date64 = jobExecutionEvent63.getStartTime();
        java.lang.Object[] obj_array68 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException69 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array68);
        java.lang.String str70 = appConfigurationException69.toString();
        java.lang.Object[] obj_array74 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException75 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array74);
        java.lang.String str76 = appConfigurationException75.toString();
        appConfigurationException69.addSuppressed((java.lang.Throwable) appConfigurationException75);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent78 = jobExecutionEvent63.executionFailure((java.lang.Throwable) appConfigurationException69);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable80 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) appConfigurationException69, "87346dbb-0e59-4bfe-b06c-eac1e2253cb7");
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException81 = new com.dangdang.ddframe.job.exception.AppConfigurationException((java.lang.Throwable) appConfigurationException69);
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "de2f9c35-080f-4c24-a9a0-43d8c9ff967d" + "'", str18.equals("de2f9c35-080f-4c24-a9a0-43d8c9ff967d"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "d92908f9-f143-41c7-9b25-27d1feba5842" + "'", str30.equals("d92908f9-f143-41c7-9b25-27d1feba5842"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str60.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(jobExecutionEvent63);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str70.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str76.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(jobExecutionEvent78);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        java.lang.String str12 = taskContext11.getSlaveId();
        java.lang.String str13 = taskContext11.toString();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "128.208.4.97" + "'", str12.equals("128.208.4.97"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        java.lang.String str12 = taskContext11.getSlaveId();
        boolean b14 = taskContext11.equals((java.lang.Object) "caca01be-67a2-4bf3-8c3c-ce17d9494590");
        java.lang.String str15 = taskContext11.toString();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "128.208.4.97" + "'", str12.equals("128.208.4.97"));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        org.apache.curator.framework.CuratorFramework curatorFramework6 = zookeeperRegistryCenter5.getClient();
        try {
            java.lang.String str8 = zookeeperRegistryCenter5.getDirectly("18220525-2509-40cc-b0e7-71f957a72c51");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertNull(curatorFramework6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration0 = null;
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration3 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration0, "", true);
        com.dangdang.ddframe.job.api.JobType jobType4 = dataflowJobConfiguration3.getJobType();
        boolean b5 = dataflowJobConfiguration3.isStreamingProcess();
        org.junit.Assert.assertTrue("'" + jobType4 + "' != '" + com.dangdang.ddframe.job.api.JobType.DATAFLOW + "'", jobType4.equals(com.dangdang.ddframe.job.api.JobType.DATAFLOW));
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        try {
            com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType1 = com.dangdang.ddframe.job.event.rdb.DatabaseType.valueFrom("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("aff97160474a056e838c1f721af01edf", "", (int) (short) -1, "d0be6b2b-9c52-490d-b882-bc3fca29f622", map_i_str4, 0);
        java.lang.String str7 = shardingContexts6.getTaskId();
        try {
            com.dangdang.ddframe.job.api.ShardingContext shardingContext9 = new com.dangdang.ddframe.job.api.ShardingContext(shardingContexts6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str7.equals("aff97160474a056e838c1f721af01edf"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        try {
            com.dangdang.ddframe.job.util.config.ShardingItemParameters shardingItemParameters1 = new com.dangdang.ddframe.job.util.config.ShardingItemParameters("8ce7f23c-889f-40a7-8fab-a9e4d7e8312f");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.exception.JobConfigurationException");
        } catch (com.dangdang.ddframe.job.exception.JobConfigurationException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        java.lang.String str8 = jobCoreConfiguration6.getJobName();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str8.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration0 = null;
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration3 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration0, "ee6144a8-6164-451f-9e3c-e3c85113af90", true);
        com.dangdang.ddframe.job.api.JobType jobType4 = dataflowJobConfiguration3.getJobType();
        java.lang.String str5 = dataflowJobConfiguration3.getJobClass();
        org.junit.Assert.assertTrue("'" + jobType4 + "' != '" + com.dangdang.ddframe.job.api.JobType.DATAFLOW + "'", jobType4.equals(com.dangdang.ddframe.job.api.JobType.DATAFLOW));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ee6144a8-6164-451f-9e3c-e3c85113af90" + "'", str5.equals("ee6144a8-6164-451f-9e3c-e3c85113af90"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource2 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent4 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("3cae38aa-7ef9-49ac-8a03-3fd0876da30e", "18220525-2509-40cc-b0e7-71f957a72c51", executionSource2, (int) (short) -1);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource10 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source17 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType18 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state20 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent22 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source17, executionType18, "aff97160474a056e838c1f721af01edf", state20, "");
        java.lang.String str23 = jobStatusTraceEvent22.getId();
        java.lang.String str24 = jobStatusTraceEvent22.getShardingItems();
        java.util.Date date25 = jobStatusTraceEvent22.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source29 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType30 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state32 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent34 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source29, executionType30, "aff97160474a056e838c1f721af01edf", state32, "");
        java.lang.String str35 = jobStatusTraceEvent34.getId();
        java.lang.String str36 = jobStatusTraceEvent34.getShardingItems();
        java.util.Date date37 = jobStatusTraceEvent34.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics38 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date25, date37);
        java.util.Date date40 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics41 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date40);
        java.util.Date date42 = jobRunningStatistics41.getCreationTime();
        java.lang.Object[] obj_array47 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException48 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array47);
        java.lang.String str49 = appConfigurationException48.toString();
        java.lang.Throwable[] throwable_array50 = appConfigurationException48.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException51 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException48);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable53 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException51, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent54 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource10, (int) (byte) -1, date25, date42, false, jobExecutionEventThrowable53);
        jobExecutionEvent4.setFailureCause(jobExecutionEventThrowable53);
        java.lang.String str56 = jobExecutionEvent4.getJobName();
        org.junit.Assert.assertTrue("'" + executionSource2 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource2.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + executionSource10 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource10.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "b65b7720-8f1b-413e-8d75-4058549b8fb6" + "'", str23.equals("b65b7720-8f1b-413e-8d75-4058549b8fb6"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str24.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "8714bcf5-cbd3-41c8-92cf-55b270aad1a1" + "'", str35.equals("8714bcf5-cbd3-41c8-92cf-55b270aad1a1"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str36.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str49.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array50);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "18220525-2509-40cc-b0e7-71f957a72c51" + "'", str56.equals("18220525-2509-40cc-b0e7-71f957a72c51"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder7.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder11 = builder9.misfire(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException59 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array58);
        java.lang.String str60 = appConfigurationException59.toString();
        java.lang.Throwable[] throwable_array61 = appConfigurationException59.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException62 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent63 = jobExecutionEvent49.executionFailure((java.lang.Throwable) appConfigurationException59);
        java.lang.String str64 = jobExecutionEvent63.getFailureCause();
        boolean b65 = jobExecutionEvent63.isSuccess();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source73 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType74 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state76 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent78 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source73, executionType74, "aff97160474a056e838c1f721af01edf", state76, "");
        java.lang.String str79 = jobStatusTraceEvent78.getId();
        java.lang.String str80 = jobStatusTraceEvent78.getShardingItems();
        java.util.Date date81 = jobStatusTraceEvent78.getCreationTime();
        java.util.Date date82 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj83 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition84 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date81, date82, map_str_obj83);
        jobExecutionEvent63.setCompleteTime(date82);
        java.lang.String str86 = jobExecutionEvent63.getJobName();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "e710505e-02a4-4b7b-800b-6cd3631eb1b7" + "'", str18.equals("e710505e-02a4-4b7b-800b-6cd3631eb1b7"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "9497a946-4fa1-4042-9527-093769b2e736" + "'", str30.equals("9497a946-4fa1-4042-9527-093769b2e736"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str60.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(jobExecutionEvent63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n" + "'", str64.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n"));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "b3c71133-e5fe-45bc-ad0a-ec3e3792c811" + "'", str79.equals("b3c71133-e5fe-45bc-ad0a-ec3e3792c811"));
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str80.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "754a6b00-33cb-4148-ae8d-e84e632e718e" + "'", str86.equals("754a6b00-33cb-4148-ae8d-e84e632e718e"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.Throwable throwable0 = null;
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException1 = new com.dangdang.ddframe.job.exception.JobSystemException(throwable0);
        java.lang.Throwable[] throwable_array2 = jobSystemException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwable_array2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration10 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration6, "3d746adc-0573-435e-b1ec-124d7372fbc5", true);
        boolean b11 = jobCoreConfiguration6.isMisfire();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("10");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder5.description("9a50607d-a4e8-4c75-b7b0-9a37a0bcd871");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder11 = builder9.misfire(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        try {
            com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject executorServiceObject2 = new com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject("0a9b6898-d16e-4f5f-965e-3c3b5fd61834", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("aff97160474a056e838c1f721af01edf", "", (int) (short) -1, "d0be6b2b-9c52-490d-b882-bc3fca29f622", map_i_str4, 0);
        java.lang.String str7 = shardingContexts6.getTaskId();
        java.lang.String str8 = shardingContexts6.getJobName();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str7.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval5 = com.dangdang.ddframe.job.statistics.StatisticInterval.DAY;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source9 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state12 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent14 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source9, executionType10, "aff97160474a056e838c1f721af01edf", state12, "");
        java.lang.String str15 = jobStatusTraceEvent14.getId();
        java.lang.String str16 = jobStatusTraceEvent14.getShardingItems();
        java.util.Date date17 = jobStatusTraceEvent14.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source23 = null;
        java.lang.Integer[] i_array27 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i28 = new java.util.ArrayList<java.lang.Integer>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i28, i_array27);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo30 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i28);
        java.util.List<java.lang.Integer> list_i31 = metaInfo30.getShardingItems();
        java.lang.String str32 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i31);
        com.dangdang.ddframe.job.context.ExecutionType executionType33 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext35 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i31, executionType33, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state37 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source44 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType45 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state47 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent49 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source44, executionType45, "aff97160474a056e838c1f721af01edf", state47, "");
        java.lang.String str50 = jobStatusTraceEvent49.getId();
        java.lang.String str51 = jobStatusTraceEvent49.getShardingItems();
        java.util.Date date52 = jobStatusTraceEvent49.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source56 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType57 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state59 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent61 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source56, executionType57, "aff97160474a056e838c1f721af01edf", state59, "");
        java.lang.String str62 = jobStatusTraceEvent61.getId();
        java.lang.String str63 = jobStatusTraceEvent61.getShardingItems();
        java.util.Date date64 = jobStatusTraceEvent61.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics65 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date52, date64);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent66 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source23, executionType33, "128.208.4.97", state37, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date52);
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics67 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics((long) (byte) 0, 1, 52, statisticInterval5, date17, date52);
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval68 = taskResultStatistics67.getStatisticInterval();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source72 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType73 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state75 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent77 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source72, executionType73, "aff97160474a056e838c1f721af01edf", state75, "");
        java.lang.String str78 = jobStatusTraceEvent77.getId();
        java.lang.String str79 = jobStatusTraceEvent77.getShardingItems();
        java.util.Date date80 = jobStatusTraceEvent77.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics81 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics((int) (short) 1, (-1), statisticInterval68, date80);
        org.junit.Assert.assertTrue("'" + statisticInterval5 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval5.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "37201c77-20d6-4c4e-8ef2-6fd2cd6d5ff9" + "'", str15.equals("37201c77-20d6-4c4e-8ef2-6fd2cd6d5ff9"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str16.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertNotNull(i_array27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(list_i31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "10" + "'", str32.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType33 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType33.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state37 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state37.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "1232bf48-b0ce-4cec-8c72-83408f585fd2" + "'", str50.equals("1232bf48-b0ce-4cec-8c72-83408f585fd2"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str51.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "34e8392b-a3aa-43ba-b05b-70393544b441" + "'", str62.equals("34e8392b-a3aa-43ba-b05b-70393544b441"));
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str63.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertTrue("'" + statisticInterval68 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval68.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "62377eff-8609-4a88-875d-1fd1550e6e4f" + "'", str78.equals("62377eff-8609-4a88-875d-1fd1550e6e4f"));
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str79.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date80);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        try {
            com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject executorServiceObject2 = new com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject("0e04149c-206e-417e-ae5c-93128efc5dcd", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        javax.sql.DataSource dataSource0 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch jobEventRdbSearch1 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch(dataSource0);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source9 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state12 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent14 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source9, executionType10, "aff97160474a056e838c1f721af01edf", state12, "");
        java.lang.String str15 = jobStatusTraceEvent14.getId();
        java.lang.String str16 = jobStatusTraceEvent14.getShardingItems();
        java.util.Date date17 = jobStatusTraceEvent14.getCreationTime();
        java.util.Date date18 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj19 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition20 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date17, date18, map_str_obj19);
        java.lang.String str21 = condition20.getOrder();
        java.lang.String str22 = condition20.getSort();
        try {
            com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<com.dangdang.ddframe.job.event.type.JobStatusTraceEvent> result_jobStatusTraceEvent23 = jobEventRdbSearch1.findJobStatusTraceEvents(condition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "9f8cde95-b6de-405c-9582-a71775118007" + "'", str15.equals("9f8cde95-b6de-405c-9582-a71775118007"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str16.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "ecc20b57-52a5-4026-b6c0-d9395b02f7cf" + "'", str21.equals("ecc20b57-52a5-4026-b6c0-d9395b02f7cf"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str22.equals("76790358-3199-4060-a536-0f953a59b404"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "f2da3452-ca49-4b9e-8e6a-53b0b3ca8c6c", (int) (byte) 10, "-1,1,10", map_i_str4, (int) (short) 1);
        java.lang.String str7 = shardingContexts6.getTaskId();
        try {
            com.dangdang.ddframe.job.api.ShardingContext shardingContext9 = new com.dangdang.ddframe.job.api.ShardingContext(shardingContexts6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source61 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType62 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state64 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent66 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source61, executionType62, "aff97160474a056e838c1f721af01edf", state64, "");
        java.lang.String str67 = jobStatusTraceEvent66.getId();
        java.lang.String str68 = jobStatusTraceEvent66.getShardingItems();
        java.util.Date date69 = jobStatusTraceEvent66.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source73 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType74 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state76 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent78 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source73, executionType74, "aff97160474a056e838c1f721af01edf", state76, "");
        java.lang.String str79 = jobStatusTraceEvent78.getId();
        java.lang.String str80 = jobStatusTraceEvent78.getShardingItems();
        java.util.Date date81 = jobStatusTraceEvent78.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics82 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date69, date81);
        com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics jobRegisterStatistics83 = new com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics(0, date69);
        jobExecutionEvent49.setCompleteTime(date69);
        int i85 = jobExecutionEvent49.getShardingItem();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "87af1f72-3815-406b-8dbf-a37b4010fa9e" + "'", str18.equals("87af1f72-3815-406b-8dbf-a37b4010fa9e"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "12c51850-784c-4a93-a643-f99ae873de06" + "'", str30.equals("12c51850-784c-4a93-a643-f99ae873de06"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "f0b8b4c3-82bd-4535-9f1e-1a40e0df0b70" + "'", str67.equals("f0b8b4c3-82bd-4535-9f1e-1a40e0df0b70"));
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str68.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "f382ec7e-e244-4284-91f9-a223707f9f37" + "'", str79.equals("f382ec7e-e244-4284-91f9-a223707f9f37"));
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str80.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertTrue(i85 == (-1));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Throwable[] throwable_array6 = appConfigurationException4.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException7 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException4);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable9 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException7, "aff97160474a056e838c1f721af01edf");
        java.lang.Throwable throwable10 = jobExecutionEventThrowable9.getThrowable();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array6);
        org.junit.Assert.assertNotNull(throwable10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler defaultJobExceptionHandler1 = new com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler();
        com.dangdang.ddframe.job.executor.handler.JobExceptionHandler[] jobExceptionHandler_array2 = new com.dangdang.ddframe.job.executor.handler.JobExceptionHandler[] { defaultJobExceptionHandler1 };
        java.util.ArrayList<com.dangdang.ddframe.job.executor.handler.JobExceptionHandler> arraylist_jobExceptionHandler3 = new java.util.ArrayList<com.dangdang.ddframe.job.executor.handler.JobExceptionHandler>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<com.dangdang.ddframe.job.executor.handler.JobExceptionHandler>) arraylist_jobExceptionHandler3, jobExceptionHandler_array2);
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<com.dangdang.ddframe.job.executor.handler.JobExceptionHandler> result_jobExceptionHandler5 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<com.dangdang.ddframe.job.executor.handler.JobExceptionHandler>((java.lang.Integer) 1, (java.util.List<com.dangdang.ddframe.job.executor.handler.JobExceptionHandler>) arraylist_jobExceptionHandler3);
        org.junit.Assert.assertNotNull(jobExceptionHandler_array2);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { (-1), 1, 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i5 = new java.util.ArrayList<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i5, i_array4);
        java.lang.String str7 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString((java.util.List<java.lang.Integer>) arraylist_i5);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException12 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array11);
        java.lang.String str13 = appConfigurationException12.toString();
        java.lang.Throwable[] throwable_array14 = appConfigurationException12.getSuppressed();
        java.lang.Cloneable[] cloneable_array15 = new java.lang.Cloneable[] { arraylist_i5, throwable_array14 };
        java.util.ArrayList<java.lang.Cloneable> arraylist_cloneable16 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) arraylist_cloneable16, cloneable_array15);
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<java.lang.Cloneable> result_cloneable18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<java.lang.Cloneable>((java.lang.Integer) 10, (java.util.List<java.lang.Cloneable>) arraylist_cloneable16);
        java.util.List<java.lang.Cloneable> list_cloneable19 = result_cloneable18.getRows();
        java.util.List<java.lang.Cloneable> list_cloneable20 = result_cloneable18.getRows();
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1,1,10" + "'", str7.equals("-1,1,10"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str13.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array14);
        org.junit.Assert.assertNotNull(cloneable_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(list_cloneable19);
        org.junit.Assert.assertNotNull(list_cloneable20);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i5 = new java.util.ArrayList<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i5, i_array4);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo7 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i5);
        java.util.List<java.lang.Integer> list_i8 = metaInfo7.getShardingItems();
        java.lang.Integer[] i_array11 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> arraylist_i12 = new java.util.ArrayList<java.lang.Integer>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i12, i_array11);
        java.lang.Integer[] i_array17 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i18 = new java.util.ArrayList<java.lang.Integer>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i18, i_array17);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo20 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i18);
        java.util.List<java.lang.Integer> list_i21 = metaInfo20.getShardingItems();
        java.lang.String str22 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i21);
        com.dangdang.ddframe.job.context.ExecutionType executionType23 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext25 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i21, executionType23, "128.208.4.97");
        com.dangdang.ddframe.job.context.TaskContext taskContext27 = new com.dangdang.ddframe.job.context.TaskContext("b0ada993-d6e1-4910-ac71-a51c3210b1d9", (java.util.List<java.lang.Integer>) arraylist_i12, executionType23, "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!");
        com.dangdang.ddframe.job.context.TaskContext taskContext28 = new com.dangdang.ddframe.job.context.TaskContext("12fc086e-0066-4ba6-84b6-a1c3fe19e12c", list_i8, executionType23);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo29 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("d69a0ce8-b70a-4c43-8c44-7e59465a3d57", list_i8);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(list_i8);
        org.junit.Assert.assertNotNull(i_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(i_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(list_i21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "10" + "'", str22.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType23 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType23.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        try {
            java.util.List<java.lang.Integer> list_i1 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemList("1232bf48-b0ce-4cec-8c72-83408f585fd2");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b13 = taskContext11.equals((java.lang.Object) '#');
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType14 = com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL;
        boolean b15 = taskContext11.equals((java.lang.Object) databaseType14);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo16 = taskContext11.getMetaInfo();
        java.lang.String str17 = taskContext11.getSlaveId();
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum18 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER;
        boolean b19 = taskContext11.equals((java.lang.Object) jobPropertiesEnum18);
        taskContext11.setSlaveId("3f9fb007-996c-49c4-9278-ea3e55a22875");
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + databaseType14 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL + "'", databaseType14.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(metaInfo16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "128.208.4.97" + "'", str17.equals("128.208.4.97"));
        org.junit.Assert.assertTrue("'" + jobPropertiesEnum18 + "' != '" + com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER + "'", jobPropertiesEnum18.equals(com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER));
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            java.util.List<java.lang.String> list_str7 = zookeeperRegistryCenter5.getChildrenKeys("9dcfbfd7-ce8a-4002-821b-8f5d6ca152dd");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source0 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_EXECUTOR;
        org.junit.Assert.assertTrue("'" + source0 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_EXECUTOR + "'", source0.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_EXECUTOR));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.Integer[] i_array5 = new java.lang.Integer[] { (-1), 1, 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i6 = new java.util.ArrayList<java.lang.Integer>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i6, i_array5);
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString((java.util.List<java.lang.Integer>) arraylist_i6);
        java.lang.Object[] obj_array12 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException13 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array12);
        java.lang.String str14 = appConfigurationException13.toString();
        java.lang.Throwable[] throwable_array15 = appConfigurationException13.getSuppressed();
        java.lang.Cloneable[] cloneable_array16 = new java.lang.Cloneable[] { arraylist_i6, throwable_array15 };
        java.util.ArrayList<java.lang.Cloneable> arraylist_cloneable17 = new java.util.ArrayList<java.lang.Cloneable>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.Cloneable>) arraylist_cloneable17, cloneable_array16);
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<java.lang.Cloneable> result_cloneable19 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<java.lang.Cloneable>((java.lang.Integer) 10, (java.util.List<java.lang.Cloneable>) arraylist_cloneable17);
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<java.lang.Cloneable> result_cloneable20 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Result<java.lang.Cloneable>((java.lang.Integer) 1, (java.util.List<java.lang.Cloneable>) arraylist_cloneable17);
        java.util.List<java.lang.Cloneable> list_cloneable21 = result_cloneable20.getRows();
        java.util.List<java.lang.Cloneable> list_cloneable22 = result_cloneable20.getRows();
        org.junit.Assert.assertNotNull(i_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1,1,10" + "'", str8.equals("-1,1,10"));
        org.junit.Assert.assertNotNull(obj_array12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str14.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array15);
        org.junit.Assert.assertNotNull(cloneable_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(list_cloneable21);
        org.junit.Assert.assertNotNull(list_cloneable22);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        java.lang.String str19 = condition18.getSort();
        java.lang.String str20 = condition18.getSort();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "7720fff8-36b3-4fa7-8372-14e96e1705cd" + "'", str13.equals("7720fff8-36b3-4fa7-8372-14e96e1705cd"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str19.equals("76790358-3199-4060-a536-0f953a59b404"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str20.equals("76790358-3199-4060-a536-0f953a59b404"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.String str1 = com.dangdang.ddframe.job.util.digest.Encryption.md5("f0b8b4c3-82bd-4535-9f1e-1a40e0df0b70");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ad7a36ba148ce2a068dae5f7688ae703" + "'", str1.equals("ad7a36ba148ce2a068dae5f7688ae703"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b13 = taskContext11.equals((java.lang.Object) '#');
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType14 = com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL;
        boolean b15 = taskContext11.equals((java.lang.Object) databaseType14);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo16 = taskContext11.getMetaInfo();
        java.lang.String str17 = taskContext11.getSlaveId();
        java.lang.String str18 = taskContext11.getTaskName();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + databaseType14 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL + "'", databaseType14.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(metaInfo16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "128.208.4.97" + "'", str17.equals("128.208.4.97"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.Object[] obj_array2 = new java.lang.Object[] {};
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException3 = new com.dangdang.ddframe.job.exception.JobSystemException("e4d15e1a-97fe-46bb-b675-2bf9bbd22023", obj_array2);
        com.dangdang.ddframe.job.reg.exception.RegException regException4 = new com.dangdang.ddframe.job.reg.exception.RegException("d0cc04e7-efe9-4167-a154-8b65210ed06d", obj_array2);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable6 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) regException4, "80776411-07da-4b80-be28-b009f2076af9");
        org.junit.Assert.assertNotNull(obj_array2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.io.IOException iOException0 = null;
        com.dangdang.ddframe.job.util.env.HostException hostException1 = new com.dangdang.ddframe.job.util.env.HostException(iOException0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType0 = com.dangdang.ddframe.job.event.rdb.DatabaseType.PostgreSQL;
        org.junit.Assert.assertTrue("'" + databaseType0 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.PostgreSQL + "'", databaseType0.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.PostgreSQL));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval0 = com.dangdang.ddframe.job.statistics.StatisticInterval.MINUTE;
        org.junit.Assert.assertTrue("'" + statisticInterval0 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.MINUTE + "'", statisticInterval0.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.MINUTE));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder8 = builder5.jobProperties("d054d85a-0e61-4164-9b8f-7d5d8268a583", "5153ac74-7541-457e-bef8-c9969e17a79d");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo1 = com.dangdang.ddframe.job.context.TaskContext.MetaInfo.from("ShardingContexts(taskId=-1,1,10, jobName=aff97160474a056e838c1f721af01edf, shardingTotalCount=52, jobParameter=com.dangdang.ddframe.job.exception.AppConfigurationException: hi!, shardingItemParameters=null, jobEventSamplingCount=-1, currentJobEventSamplingCount=0, allowSendJobEvent=false)");
        org.junit.Assert.assertNotNull(metaInfo1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            int i7 = zookeeperRegistryCenter5.getNumChildren("42f86f65-3990-4a20-9483-cda0b7c7332a");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType4 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent8 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source3, executionType4, "aff97160474a056e838c1f721af01edf", state6, "");
        java.lang.String str9 = jobStatusTraceEvent8.getId();
        java.lang.String str10 = jobStatusTraceEvent8.getSlaveId();
        jobStatusTraceEvent8.setOriginalTaskId("9f29874b-7365-4fc9-aa02-e897d5bb5dcb");
        java.lang.String str13 = jobStatusTraceEvent8.getSlaveId();
        jobStatusTraceEvent8.setOriginalTaskId("315bcbb2-3e27-4638-bdf1-9a6a36dbab41");
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ea1fd411-6805-4fbc-9cf6-429c6ebc0e18" + "'", str9.equals("ea1fd411-6805-4fbc-9cf6-429c6ebc0e18"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str10.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str13.equals("aff97160474a056e838c1f721af01edf"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        try {
            java.util.List<java.lang.Integer> list_i1 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemList("261b4e37-64f8-409d-abb0-679f9d7bbb90");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds((int) 'a');
        int i7 = zookeeperConfiguration2.getMaxRetries();
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter8 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            java.lang.String str10 = zookeeperRegistryCenter8.get("9feed3d0-9408-4495-92fe-584b78a57132");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertTrue(i7 == 3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("-1,1,10", "d0be6b2b-9c52-490d-b882-bc3fca29f622");
        int i3 = zookeeperConfiguration2.getSessionTimeoutMilliseconds();
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.curator.framework.CuratorFramework curatorFramework1 = null;
        com.dangdang.ddframe.job.reg.base.ElectionCandidate electionCandidate3 = null;
        try {
            com.dangdang.ddframe.job.reg.zookeeper.ZookeeperElectionService zookeeperElectionService4 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperElectionService("841194b5-baeb-43cf-87a9-c8cecb41be8d", curatorFramework1, "46796b28-a62d-49a4-8b7d-65a8d2db0b30", electionCandidate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n");
        int i3 = zookeeperConfiguration2.getMaxSleepTimeMilliseconds();
        zookeeperConfiguration2.setConnectionTimeoutMilliseconds(3);
        org.junit.Assert.assertTrue(i3 == 3000);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source5 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent10 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source5, executionType6, "aff97160474a056e838c1f721af01edf", state8, "");
        java.lang.String str11 = jobStatusTraceEvent10.getId();
        java.lang.String str12 = jobStatusTraceEvent10.getSlaveId();
        java.lang.String str13 = jobStatusTraceEvent10.getShardingItems();
        java.util.Date date14 = jobStatusTraceEvent10.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source18 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType19 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state21 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent23 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source18, executionType19, "aff97160474a056e838c1f721af01edf", state21, "");
        java.lang.String str24 = jobStatusTraceEvent23.getId();
        java.lang.String str25 = jobStatusTraceEvent23.getSlaveId();
        java.lang.String str26 = jobStatusTraceEvent23.getShardingItems();
        java.util.Date date27 = jobStatusTraceEvent23.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics28 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) (byte) 10, 1, date14, date27);
        long long29 = taskRunningStatistics28.getId();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "7b2d7fea-043e-41ff-b7b9-0f3fbbcffc43" + "'", str11.equals("7b2d7fea-043e-41ff-b7b9-0f3fbbcffc43"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str12.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str13.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "8fafbb6a-b2c5-4294-8e62-568359a0c44f" + "'", str24.equals("8fafbb6a-b2c5-4294-8e62-568359a0c44f"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str25.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str26.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertTrue(long29 == 10L);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        try {
            com.dangdang.ddframe.job.context.TaskContext taskContext1 = com.dangdang.ddframe.job.context.TaskContext.from("8b64bbfc-7070-4f69-82aa-a4f7205a291a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.dangdang.ddframe.job.api.JobType jobType0 = com.dangdang.ddframe.job.api.JobType.DATAFLOW;
        org.junit.Assert.assertTrue("'" + jobType0 + "' != '" + com.dangdang.ddframe.job.api.JobType.DATAFLOW + "'", jobType0.equals(com.dangdang.ddframe.job.api.JobType.DATAFLOW));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException59 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array58);
        java.lang.String str60 = appConfigurationException59.toString();
        java.lang.Throwable[] throwable_array61 = appConfigurationException59.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException62 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent63 = jobExecutionEvent49.executionFailure((java.lang.Throwable) appConfigurationException59);
        java.lang.String str64 = jobExecutionEvent63.getFailureCause();
        boolean b65 = jobExecutionEvent63.isSuccess();
        jobExecutionEvent63.setSuccess(true);
        java.lang.String str68 = jobExecutionEvent63.getTaskId();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "093cb461-2b3d-47ed-b9d1-599c876ee7c2" + "'", str18.equals("093cb461-2b3d-47ed-b9d1-599c876ee7c2"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "d012edab-24ec-4a64-8ec1-697c8e810348" + "'", str30.equals("d012edab-24ec-4a64-8ec1-697c8e810348"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str60.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(jobExecutionEvent63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n" + "'", str64.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n"));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "128.208.4.97" + "'", str68.equals("128.208.4.97"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("-1,1,10", "aff97160474a056e838c1f721af01edf", (int) '4', "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", map_i_str4, (int) (byte) -1);
        int i7 = shardingContexts6.getCurrentJobEventSamplingCount();
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        java.lang.String str7 = jobCoreConfiguration6.getJobName();
        java.lang.String str8 = jobCoreConfiguration6.getJobName();
        java.lang.String str9 = jobCoreConfiguration6.getDescription();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str8.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval3 = com.dangdang.ddframe.job.statistics.StatisticInterval.DAY;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source21 = null;
        java.lang.Integer[] i_array25 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i26 = new java.util.ArrayList<java.lang.Integer>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i26, i_array25);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo28 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i26);
        java.util.List<java.lang.Integer> list_i29 = metaInfo28.getShardingItems();
        java.lang.String str30 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i29);
        com.dangdang.ddframe.job.context.ExecutionType executionType31 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext33 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i29, executionType31, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state35 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source42 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType43 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state45 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent47 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source42, executionType43, "aff97160474a056e838c1f721af01edf", state45, "");
        java.lang.String str48 = jobStatusTraceEvent47.getId();
        java.lang.String str49 = jobStatusTraceEvent47.getShardingItems();
        java.util.Date date50 = jobStatusTraceEvent47.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source54 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType55 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state57 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent59 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source54, executionType55, "aff97160474a056e838c1f721af01edf", state57, "");
        java.lang.String str60 = jobStatusTraceEvent59.getId();
        java.lang.String str61 = jobStatusTraceEvent59.getShardingItems();
        java.util.Date date62 = jobStatusTraceEvent59.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics63 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date50, date62);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent64 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source21, executionType31, "128.208.4.97", state35, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date50);
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics65 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics((long) (byte) 0, 1, 52, statisticInterval3, date15, date50);
        int i66 = taskResultStatistics65.getSuccessCount();
        long long67 = taskResultStatistics65.getId();
        int i68 = taskResultStatistics65.getSuccessCount();
        org.junit.Assert.assertTrue("'" + statisticInterval3 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval3.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "46560e30-998c-4d29-bbc9-454ff0d6bd5a" + "'", str13.equals("46560e30-998c-4d29-bbc9-454ff0d6bd5a"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(list_i29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "10" + "'", str30.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType31 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType31.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state35 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state35.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "acf29d08-4a73-4da2-ad15-d92f37595a50" + "'", str48.equals("acf29d08-4a73-4da2-ad15-d92f37595a50"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str49.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "314bc191-4988-40e5-b8b8-571c85349cdd" + "'", str60.equals("314bc191-4988-40e5-b8b8-571c85349cdd"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str61.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertTrue(i66 == 1);
        org.junit.Assert.assertTrue(long67 == 0L);
        org.junit.Assert.assertTrue(i68 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.curator.framework.CuratorFramework curatorFramework1 = null;
        com.dangdang.ddframe.job.reg.base.ElectionCandidate electionCandidate3 = null;
        try {
            com.dangdang.ddframe.job.reg.zookeeper.ZookeeperElectionService zookeeperElectionService4 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperElectionService("6719d9f5-7bf1-41f8-82a8-b1afe8806d8f", curatorFramework1, "288a53fc-a1d0-4f41-acfd-135a8c33b834", electionCandidate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.dangdang.ddframe.job.executor.handler.impl.DefaultExecutorServiceHandler defaultExecutorServiceHandler0 = new com.dangdang.ddframe.job.executor.handler.impl.DefaultExecutorServiceHandler();
        java.util.concurrent.ExecutorService executorService2 = defaultExecutorServiceHandler0.createExecutorService("4fb57ee2-b949-4848-a03c-776d3ec73697");
        org.junit.Assert.assertNotNull(executorService2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b13 = taskContext11.equals((java.lang.Object) '#');
        com.dangdang.ddframe.job.context.ExecutionType executionType14 = taskContext11.getType();
        com.dangdang.ddframe.job.context.ExecutionType executionType15 = taskContext11.getType();
        taskContext11.setSlaveId("754a6b00-33cb-4148-ae8d-e84e632e718e");
        taskContext11.setSlaveId("7e06ed48-bcd0-44cd-8714-a9d3d69e3401");
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + executionType14 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType14.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + executionType15 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType15.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.Object[] obj_array2 = new java.lang.Object[] {};
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException3 = new com.dangdang.ddframe.job.exception.JobSystemException("e4d15e1a-97fe-46bb-b675-2bf9bbd22023", obj_array2);
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("c7f580c8-6c4b-4c2e-804c-cb22ad84db15", obj_array2);
        com.dangdang.ddframe.job.event.JobEventListenerConfigurationException jobEventListenerConfigurationException5 = new com.dangdang.ddframe.job.event.JobEventListenerConfigurationException((java.lang.Exception) appConfigurationException4);
        java.lang.String str6 = com.dangdang.ddframe.job.exception.ExceptionUtil.transform((java.lang.Throwable) appConfigurationException4);
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: c7f580c8-6c4b-4c2e-804c-cb22ad84db15\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n" + "'", str6.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: c7f580c8-6c4b-4c2e-804c-cb22ad84db15\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.dangdang.ddframe.job.executor.handler.JobProperties jobProperties0 = new com.dangdang.ddframe.job.executor.handler.JobProperties();
        jobProperties0.put("997b25f2-bc17-46f9-86ea-eb52a13f1b83", "5153ac74-7541-457e-bef8-c9969e17a79d");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            zookeeperRegistryCenter5.persistEphemeralSequential("7e7f7ce1-ce32-4b31-9d60-5c9caccd6a40");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval3 = com.dangdang.ddframe.job.statistics.StatisticInterval.DAY;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source21 = null;
        java.lang.Integer[] i_array25 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i26 = new java.util.ArrayList<java.lang.Integer>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i26, i_array25);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo28 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i26);
        java.util.List<java.lang.Integer> list_i29 = metaInfo28.getShardingItems();
        java.lang.String str30 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i29);
        com.dangdang.ddframe.job.context.ExecutionType executionType31 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext33 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i29, executionType31, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state35 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source42 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType43 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state45 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent47 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source42, executionType43, "aff97160474a056e838c1f721af01edf", state45, "");
        java.lang.String str48 = jobStatusTraceEvent47.getId();
        java.lang.String str49 = jobStatusTraceEvent47.getShardingItems();
        java.util.Date date50 = jobStatusTraceEvent47.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source54 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType55 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state57 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent59 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source54, executionType55, "aff97160474a056e838c1f721af01edf", state57, "");
        java.lang.String str60 = jobStatusTraceEvent59.getId();
        java.lang.String str61 = jobStatusTraceEvent59.getShardingItems();
        java.util.Date date62 = jobStatusTraceEvent59.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics63 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date50, date62);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent64 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source21, executionType31, "128.208.4.97", state35, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date50);
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics65 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics((long) (byte) 0, 1, 52, statisticInterval3, date15, date50);
        int i66 = taskResultStatistics65.getSuccessCount();
        long long67 = taskResultStatistics65.getId();
        int i68 = taskResultStatistics65.getFailedCount();
        java.util.Date date69 = taskResultStatistics65.getCreationTime();
        org.junit.Assert.assertTrue("'" + statisticInterval3 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval3.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "07387912-29c6-4b81-8156-660659f22c58" + "'", str13.equals("07387912-29c6-4b81-8156-660659f22c58"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(list_i29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "10" + "'", str30.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType31 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType31.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state35 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state35.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "1bbea2ec-ee06-4188-9486-3286820c6d04" + "'", str48.equals("1bbea2ec-ee06-4188-9486-3286820c6d04"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str49.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "189a2956-d0a1-438d-8de0-3af6c8f2dfac" + "'", str60.equals("189a2956-d0a1-438d-8de0-3af6c8f2dfac"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str61.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertTrue(i66 == 1);
        org.junit.Assert.assertTrue(long67 == 0L);
        org.junit.Assert.assertTrue(i68 == 52);
        org.junit.Assert.assertNotNull(date69);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder7.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration10 = builder9.build();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(jobCoreConfiguration10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b13 = taskContext11.equals((java.lang.Object) '#');
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType14 = com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL;
        boolean b15 = taskContext11.equals((java.lang.Object) databaseType14);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo16 = taskContext11.getMetaInfo();
        java.lang.String str17 = taskContext11.getSlaveId();
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum18 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER;
        boolean b19 = taskContext11.equals((java.lang.Object) jobPropertiesEnum18);
        java.lang.String str21 = taskContext11.getExecutorId("c23640a3-a78d-4aea-b5a1-391070406e83");
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + databaseType14 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL + "'", databaseType14.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(metaInfo16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "128.208.4.97" + "'", str17.equals("128.208.4.97"));
        org.junit.Assert.assertTrue("'" + jobPropertiesEnum18 + "' != '" + com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER + "'", jobPropertiesEnum18.equals(com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER));
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        java.lang.String str12 = taskContext11.getSlaveId();
        taskContext11.setIdle(false);
        java.lang.String str15 = taskContext11.getTaskName();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "128.208.4.97" + "'", str12.equals("128.208.4.97"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.EnumMap<com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum, java.lang.String> enummap_jobPropertiesEnum_str0 = null;
        com.dangdang.ddframe.job.executor.handler.JobProperties jobProperties1 = new com.dangdang.ddframe.job.executor.handler.JobProperties(enummap_jobPropertiesEnum_str0);
        jobProperties1.put("5ec17d8d-269d-47ed-bc76-296e6a4c1269", "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        try {
            java.util.List<java.lang.Integer> list_i1 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemList("0a9b6898-d16e-4f5f-965e-3c3b5fd61834");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration0 = null;
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration3 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration0, "ee6144a8-6164-451f-9e3c-e3c85113af90", true);
        java.lang.String str4 = dataflowJobConfiguration3.getJobClass();
        boolean b5 = dataflowJobConfiguration3.isStreamingProcess();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ee6144a8-6164-451f-9e3c-e3c85113af90" + "'", str4.equals("ee6144a8-6164-451f-9e3c-e3c85113af90"));
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source5 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent10 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source5, executionType6, "aff97160474a056e838c1f721af01edf", state8, "");
        java.lang.String str11 = jobStatusTraceEvent10.getId();
        java.lang.String str12 = jobStatusTraceEvent10.getShardingItems();
        java.util.Date date13 = jobStatusTraceEvent10.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source17 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType18 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state20 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent22 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source17, executionType18, "aff97160474a056e838c1f721af01edf", state20, "");
        java.lang.String str23 = jobStatusTraceEvent22.getId();
        java.lang.String str24 = jobStatusTraceEvent22.getShardingItems();
        java.util.Date date25 = jobStatusTraceEvent22.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics26 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date13, date25);
        long long27 = taskRunningStatistics26.getId();
        java.util.Date date28 = taskRunningStatistics26.getCreationTime();
        java.util.Date date29 = taskRunningStatistics26.getStatisticsTime();
        int i30 = taskRunningStatistics26.getRunningCount();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "babd8d12-7cad-4049-aa79-1faee9cd9960" + "'", str11.equals("babd8d12-7cad-4049-aa79-1faee9cd9960"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str12.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "35fe4110-556e-4c83-aea6-c3e4cd5363f7" + "'", str23.equals("35fe4110-556e-4c83-aea6-c3e4cd5363f7"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str24.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertTrue(long27 == 0L);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertTrue(i30 == 10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        try {
            java.lang.String str1 = com.dangdang.ddframe.job.context.TaskContext.getIdForUnassignedSlave("7720fff8-36b3-4fa7-8372-14e96e1705cd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        java.lang.String str12 = taskContext11.getSlaveId();
        java.lang.String str13 = taskContext11.getId();
        com.dangdang.ddframe.job.context.ExecutionType executionType14 = taskContext11.getType();
        java.lang.String str15 = taskContext11.getSlaveId();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "128.208.4.97" + "'", str12.equals("128.208.4.97"));
        org.junit.Assert.assertTrue("'" + executionType14 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType14.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "128.208.4.97" + "'", str15.equals("128.208.4.97"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.Object[] obj_array1 = new java.lang.Object[] {};
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException2 = new com.dangdang.ddframe.job.exception.JobSystemException("e4d15e1a-97fe-46bb-b675-2bf9bbd22023", obj_array1);
        try {
            com.dangdang.ddframe.job.reg.exception.RegExceptionHandler.handleException((java.lang.Exception) jobSystemException2);
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds((int) 'a');
        int i7 = zookeeperConfiguration2.getMaxRetries();
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter8 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            zookeeperRegistryCenter8.update("", "23b5f2f8-8322-48a7-8663-e88ed80c61f1");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertTrue(i7 == 3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setConnectionTimeoutMilliseconds((int) 'a');
        int i5 = zookeeperConfiguration2.getSessionTimeoutMilliseconds();
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval3 = com.dangdang.ddframe.job.statistics.StatisticInterval.DAY;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source21 = null;
        java.lang.Integer[] i_array25 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i26 = new java.util.ArrayList<java.lang.Integer>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i26, i_array25);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo28 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i26);
        java.util.List<java.lang.Integer> list_i29 = metaInfo28.getShardingItems();
        java.lang.String str30 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i29);
        com.dangdang.ddframe.job.context.ExecutionType executionType31 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext33 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i29, executionType31, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state35 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source42 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType43 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state45 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent47 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source42, executionType43, "aff97160474a056e838c1f721af01edf", state45, "");
        java.lang.String str48 = jobStatusTraceEvent47.getId();
        java.lang.String str49 = jobStatusTraceEvent47.getShardingItems();
        java.util.Date date50 = jobStatusTraceEvent47.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source54 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType55 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state57 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent59 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source54, executionType55, "aff97160474a056e838c1f721af01edf", state57, "");
        java.lang.String str60 = jobStatusTraceEvent59.getId();
        java.lang.String str61 = jobStatusTraceEvent59.getShardingItems();
        java.util.Date date62 = jobStatusTraceEvent59.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics63 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date50, date62);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent64 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source21, executionType31, "128.208.4.97", state35, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date50);
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics65 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics((long) (byte) 0, 1, 52, statisticInterval3, date15, date50);
        java.lang.String str66 = statisticInterval3.getCron();
        org.junit.Assert.assertTrue("'" + statisticInterval3 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval3.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4a518b76-dcbb-4f5d-bd11-01ea0c364140" + "'", str13.equals("4a518b76-dcbb-4f5d-bd11-01ea0c364140"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(list_i29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "10" + "'", str30.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType31 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType31.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state35 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state35.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "a65428b7-dff0-4815-8798-6a9a14a644b4" + "'", str48.equals("a65428b7-dff0-4815-8798-6a9a14a644b4"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str49.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "e96cc1de-1621-42d3-b971-709139d99178" + "'", str60.equals("e96cc1de-1621-42d3-b971-709139d99178"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str61.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "0 0 0 * * ?" + "'", str66.equals("0 0 0 * * ?"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        java.lang.String str8 = jobCoreConfiguration6.getJobParameter();
        java.lang.String str9 = jobCoreConfiguration6.getJobParameter();
        boolean b10 = jobCoreConfiguration6.isFailover();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException5 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array4);
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException6 = new com.dangdang.ddframe.job.exception.AppConfigurationException("aff97160474a056e838c1f721af01edf", obj_array4);
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException7 = new com.dangdang.ddframe.job.exception.AppConfigurationException((java.lang.Throwable) appConfigurationException6);
        org.junit.Assert.assertNotNull(obj_array4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.dangdang.ddframe.job.statistics.type.job.JobExecutionTypeStatistics jobExecutionTypeStatistics2 = new com.dangdang.ddframe.job.statistics.type.job.JobExecutionTypeStatistics((int) (byte) 1, 52);
        int i3 = jobExecutionTypeStatistics2.getTransientJobCount();
        org.junit.Assert.assertTrue(i3 == 1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.dangdang.ddframe.job.statistics.type.job.JobTypeStatistics jobTypeStatistics3 = new com.dangdang.ddframe.job.statistics.type.job.JobTypeStatistics((int) (short) 10, (int) (byte) 100, (int) (short) 10);
        int i4 = jobTypeStatistics3.getDataflowJobCount();
        org.junit.Assert.assertTrue(i4 == 10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException5 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array4);
        java.lang.String str6 = appConfigurationException5.toString();
        java.lang.Throwable[] throwable_array7 = appConfigurationException5.getSuppressed();
        java.lang.String str8 = appConfigurationException5.toString();
        java.lang.Throwable[] throwable_array9 = appConfigurationException5.getSuppressed();
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException10 = new com.dangdang.ddframe.job.exception.AppConfigurationException("efa4b7ea-d147-4a4a-8e76-32043089e7ad", (java.lang.Object[]) throwable_array9);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str6.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str8.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("-1,1,10", "d0be6b2b-9c52-490d-b882-bc3fca29f622");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter3 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            zookeeperRegistryCenter3.update("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n\tSuppressed: com.dangdang.ddframe.job.event.JobEventListenerConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\t\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\t\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\t\t... 6 more\n\tCaused by: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\t\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\t\t... 6 more\n\t\tSuppressed: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\t\t\t... 7 more\n\t\tSuppressed: com.dangdang.ddframe.job.exception.JobSystemException\n\t\t\tat sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\n\t\t\t... 6 more\n", "35fe4110-556e-4c83-aea6-c3e4cd5363f7");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder7.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder11 = builder9.jobParameter("19545f1b-3c8d-4523-a249-3290a856c2e2");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder14 = builder11.jobProperties("ad7a36ba148ce2a068dae5f7688ae703", "f382ec7e-e244-4284-91f9-a223707f9f37");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("ee6144a8-6164-451f-9e3c-e3c85113af90", "", (int) ' ', "b7b819a3-db6c-4320-bc54-2c4af886020f", map_i_str4, (int) (byte) 100);
        java.lang.String str7 = shardingContexts6.getTaskId();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ee6144a8-6164-451f-9e3c-e3c85113af90" + "'", str7.equals("ee6144a8-6164-451f-9e3c-e3c85113af90"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        java.util.Date date19 = condition18.getEndTime();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "b2188844-2836-4d2d-b53a-4da3d50c8c15" + "'", str13.equals("b2188844-2836-4d2d-b53a-4da3d50c8c15"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.String str1 = com.dangdang.ddframe.job.util.digest.Encryption.md5("de4acb46-2438-4bec-b302-7107863ff725");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "955c70d6a939ff811fdd83757cf131fd" + "'", str1.equals("955c70d6a939ff811fdd83757cf131fd"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException59 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array58);
        java.lang.String str60 = appConfigurationException59.toString();
        java.lang.Throwable[] throwable_array61 = appConfigurationException59.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException62 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent63 = jobExecutionEvent49.executionFailure((java.lang.Throwable) appConfigurationException59);
        java.util.Date date64 = jobExecutionEvent63.getStartTime();
        java.lang.String str65 = jobExecutionEvent63.getTaskId();
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent66 = jobExecutionEvent63.executionSuccess();
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable67 = null;
        jobExecutionEvent66.setFailureCause(jobExecutionEventThrowable67);
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "3ac4dab4-c38c-4e76-9091-ddf203009f46" + "'", str18.equals("3ac4dab4-c38c-4e76-9091-ddf203009f46"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "c4561d0b-23eb-420a-b641-97e7f2da4198" + "'", str30.equals("c4561d0b-23eb-420a-b641-97e7f2da4198"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str60.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(jobExecutionEvent63);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "128.208.4.97" + "'", str65.equals("128.208.4.97"));
        org.junit.Assert.assertNotNull(jobExecutionEvent66);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.dangdang.ddframe.job.statistics.type.job.JobExecutionTypeStatistics jobExecutionTypeStatistics2 = new com.dangdang.ddframe.job.statistics.type.job.JobExecutionTypeStatistics((int) (byte) 10, (int) 'a');
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        try {
            com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType1 = com.dangdang.ddframe.job.event.rdb.DatabaseType.valueFrom("5657b433-8322-4f2b-b615-7a9e5cf18d25");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        try {
            com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType1 = com.dangdang.ddframe.job.event.rdb.DatabaseType.valueFrom("b7a8004f-422f-4756-aeec-baa5c0b6c745");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.dangdang.ddframe.job.event.JobEventBus jobEventBus0 = new com.dangdang.ddframe.job.event.JobEventBus();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source4 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType5 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state7 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent9 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source4, executionType5, "aff97160474a056e838c1f721af01edf", state7, "");
        java.lang.String str10 = jobStatusTraceEvent9.getId();
        java.lang.String str11 = jobStatusTraceEvent9.getShardingItems();
        java.lang.String str12 = jobStatusTraceEvent9.getTaskId();
        jobEventBus0.post((com.dangdang.ddframe.job.event.JobEvent) jobStatusTraceEvent9);
        jobStatusTraceEvent9.setOriginalTaskId("10");
        java.lang.String str16 = jobStatusTraceEvent9.getJobName();
        java.lang.String str17 = jobStatusTraceEvent9.getJobName();
        java.lang.String str18 = jobStatusTraceEvent9.getTaskId();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "691c037e-5974-4f6f-9291-8cbbe517e2b3" + "'", str10.equals("691c037e-5974-4f6f-9291-8cbbe517e2b3"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str11.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.curator.framework.CuratorFramework curatorFramework1 = null;
        com.dangdang.ddframe.job.reg.base.ElectionCandidate electionCandidate3 = null;
        try {
            com.dangdang.ddframe.job.reg.zookeeper.ZookeeperElectionService zookeeperElectionService4 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperElectionService("3f9fb007-996c-49c4-9278-ea3e55a22875", curatorFramework1, "c7f580c8-6c4b-4c2e-804c-cb22ad84db15", electionCandidate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source5 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent10 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source5, executionType6, "aff97160474a056e838c1f721af01edf", state8, "");
        java.lang.String str11 = jobStatusTraceEvent10.getId();
        java.lang.String str12 = jobStatusTraceEvent10.getSlaveId();
        java.lang.String str13 = jobStatusTraceEvent10.getShardingItems();
        java.util.Date date14 = jobStatusTraceEvent10.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source21 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType22 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state24 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent26 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source21, executionType22, "aff97160474a056e838c1f721af01edf", state24, "");
        java.lang.String str27 = jobStatusTraceEvent26.getId();
        java.lang.String str28 = jobStatusTraceEvent26.getShardingItems();
        java.util.Date date29 = jobStatusTraceEvent26.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source33 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType34 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state36 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent38 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source33, executionType34, "aff97160474a056e838c1f721af01edf", state36, "");
        java.lang.String str39 = jobStatusTraceEvent38.getId();
        java.lang.String str40 = jobStatusTraceEvent38.getShardingItems();
        java.util.Date date41 = jobStatusTraceEvent38.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics42 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date29, date41);
        com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics jobRegisterStatistics43 = new com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics(0, date29);
        com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics jobRegisterStatistics44 = new com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics((long) (byte) 1, 0, date14, date29);
        java.util.Date date45 = jobRegisterStatistics44.getCreationTime();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "f6f3b157-9ee5-4cf4-acc9-e3acd4229d7b" + "'", str11.equals("f6f3b157-9ee5-4cf4-acc9-e3acd4229d7b"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str12.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str13.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "e80bfbe2-74c2-4403-8f7b-0e88f2faf110" + "'", str27.equals("e80bfbe2-74c2-4403-8f7b-0e88f2faf110"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str28.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "2c59a7e6-c16c-4298-a5b9-24a469a99f27" + "'", str39.equals("2c59a7e6-c16c-4298-a5b9-24a469a99f27"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str40.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertNotNull(date45);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        java.lang.String str8 = jobCoreConfiguration6.getJobParameter();
        java.lang.String str9 = jobCoreConfiguration6.getJobParameter();
        java.lang.String str10 = jobCoreConfiguration6.getJobName();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str10.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("-1,1,10", "aff97160474a056e838c1f721af01edf", (int) '4', "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", map_i_str4, (int) (byte) -1);
        shardingContexts6.setAllowSendJobEvent(false);
        java.lang.String str9 = shardingContexts6.toString();
        boolean b10 = shardingContexts6.isAllowSendJobEvent();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "ShardingContexts(taskId=-1,1,10, jobName=aff97160474a056e838c1f721af01edf, shardingTotalCount=52, jobParameter=com.dangdang.ddframe.job.exception.AppConfigurationException: hi!, shardingItemParameters=null, jobEventSamplingCount=-1, currentJobEventSamplingCount=0, allowSendJobEvent=false)" + "'", str9.equals("ShardingContexts(taskId=-1,1,10, jobName=aff97160474a056e838c1f721af01edf, shardingTotalCount=52, jobParameter=com.dangdang.ddframe.job.exception.AppConfigurationException: hi!, shardingItemParameters=null, jobEventSamplingCount=-1, currentJobEventSamplingCount=0, allowSendJobEvent=false)"));
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException4 = new com.dangdang.ddframe.job.exception.JobSystemException("e4d15e1a-97fe-46bb-b675-2bf9bbd22023", obj_array3);
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException5 = new com.dangdang.ddframe.job.exception.AppConfigurationException("c7f580c8-6c4b-4c2e-804c-cb22ad84db15", obj_array3);
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException6 = new com.dangdang.ddframe.job.exception.JobSystemException("c23640a3-a78d-4aea-b5a1-391070406e83", obj_array3);
        try {
            com.dangdang.ddframe.job.reg.exception.RegExceptionHandler.handleException((java.lang.Exception) jobSystemException6);
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration10 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration6, "3d746adc-0573-435e-b1ec-124d7372fbc5", true);
        java.lang.String str11 = dataflowJobConfiguration10.getJobClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "3d746adc-0573-435e-b1ec-124d7372fbc5" + "'", str11.equals("3d746adc-0573-435e-b1ec-124d7372fbc5"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("-1,1,10", "d0be6b2b-9c52-490d-b882-bc3fca29f622");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter3 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            java.lang.String str6 = zookeeperRegistryCenter3.persistSequential("eced765e-f561-4a4a-981e-06adcd7055da", "5408106b-2c7a-4d4c-967a-c4e2ee419cc6");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        try {
            com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType1 = com.dangdang.ddframe.job.event.rdb.DatabaseType.valueFrom("c4561d0b-23eb-420a-b641-97e7f2da4198");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        java.lang.String str8 = jobCoreConfiguration6.getJobParameter();
        boolean b9 = jobCoreConfiguration6.isMisfire();
        com.dangdang.ddframe.job.config.script.ScriptJobConfiguration scriptJobConfiguration11 = new com.dangdang.ddframe.job.config.script.ScriptJobConfiguration(jobCoreConfiguration6, "1ce254ed-faf6-403e-ad63-b312817ceab9");
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration12 = scriptJobConfiguration11.getCoreConfig();
        java.lang.String str13 = jobCoreConfiguration12.getDescription();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(jobCoreConfiguration12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i3, i_array2);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo5 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i3);
        java.util.List<java.lang.Integer> list_i6 = metaInfo5.getShardingItems();
        java.util.List<java.lang.Integer> list_i7 = metaInfo5.getShardingItems();
        java.lang.String str8 = metaInfo5.getJobName();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(list_i6);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i3, i_array2);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo5 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i3);
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType6 = com.dangdang.ddframe.job.event.rdb.DatabaseType.Oracle;
        boolean b7 = metaInfo5.equals((java.lang.Object) databaseType6);
        boolean b9 = metaInfo5.equals((java.lang.Object) 'a');
        java.lang.String str10 = metaInfo5.toString();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + databaseType6 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.Oracle + "'", databaseType6.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.Oracle));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        java.lang.String str19 = condition18.getOrder();
        java.lang.String str20 = condition18.getSort();
        java.util.Date date21 = condition18.getEndTime();
        java.lang.String str22 = condition18.getSort();
        java.lang.String str23 = condition18.getOrder();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "cff8fc7a-17ea-4710-8568-f8ccfbcac1b5" + "'", str13.equals("cff8fc7a-17ea-4710-8568-f8ccfbcac1b5"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ecc20b57-52a5-4026-b6c0-d9395b02f7cf" + "'", str19.equals("ecc20b57-52a5-4026-b6c0-d9395b02f7cf"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str20.equals("76790358-3199-4060-a536-0f953a59b404"));
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str22.equals("76790358-3199-4060-a536-0f953a59b404"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "ecc20b57-52a5-4026-b6c0-d9395b02f7cf" + "'", str23.equals("ecc20b57-52a5-4026-b6c0-d9395b02f7cf"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        int i19 = condition18.getPage();
        java.util.Date date20 = condition18.getEndTime();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "e92de941-50c3-401b-baf0-b11183ddfccb" + "'", str13.equals("e92de941-50c3-401b-baf0-b11183ddfccb"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue(i19 == 100);
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource2 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent4 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("3cae38aa-7ef9-49ac-8a03-3fd0876da30e", "18220525-2509-40cc-b0e7-71f957a72c51", executionSource2, (int) (short) -1);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource10 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source17 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType18 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state20 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent22 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source17, executionType18, "aff97160474a056e838c1f721af01edf", state20, "");
        java.lang.String str23 = jobStatusTraceEvent22.getId();
        java.lang.String str24 = jobStatusTraceEvent22.getShardingItems();
        java.util.Date date25 = jobStatusTraceEvent22.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source29 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType30 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state32 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent34 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source29, executionType30, "aff97160474a056e838c1f721af01edf", state32, "");
        java.lang.String str35 = jobStatusTraceEvent34.getId();
        java.lang.String str36 = jobStatusTraceEvent34.getShardingItems();
        java.util.Date date37 = jobStatusTraceEvent34.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics38 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date25, date37);
        java.util.Date date40 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics41 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date40);
        java.util.Date date42 = jobRunningStatistics41.getCreationTime();
        java.lang.Object[] obj_array47 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException48 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array47);
        java.lang.String str49 = appConfigurationException48.toString();
        java.lang.Throwable[] throwable_array50 = appConfigurationException48.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException51 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException48);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable53 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException51, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent54 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource10, (int) (byte) -1, date25, date42, false, jobExecutionEventThrowable53);
        jobExecutionEvent4.setFailureCause(jobExecutionEventThrowable53);
        java.lang.String str56 = jobExecutionEventThrowable53.toString();
        java.lang.String str57 = jobExecutionEventThrowable53.toString();
        org.junit.Assert.assertTrue("'" + executionSource2 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource2.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + executionSource10 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource10.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "3ad77797-063b-43c2-8415-9c90f8e2e3c5" + "'", str23.equals("3ad77797-063b-43c2-8415-9c90f8e2e3c5"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str24.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "10722b15-ecd7-4b0c-b352-25bf3c8a8e96" + "'", str35.equals("10722b15-ecd7-4b0c-b352-25bf3c8a8e96"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str36.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str49.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array50);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "JobExecutionEventThrowable(plainText=aff97160474a056e838c1f721af01edf)" + "'", str56.equals("JobExecutionEventThrowable(plainText=aff97160474a056e838c1f721af01edf)"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "JobExecutionEventThrowable(plainText=aff97160474a056e838c1f721af01edf)" + "'", str57.equals("JobExecutionEventThrowable(plainText=aff97160474a056e838c1f721af01edf)"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.Object[] obj_array2 = new java.lang.Object[] {};
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException3 = new com.dangdang.ddframe.job.exception.JobSystemException("e4d15e1a-97fe-46bb-b675-2bf9bbd22023", obj_array2);
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException4 = new com.dangdang.ddframe.job.exception.JobSystemException("", obj_array2);
        org.junit.Assert.assertNotNull(obj_array2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource6 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source13 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType14 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state16 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent18 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source13, executionType14, "aff97160474a056e838c1f721af01edf", state16, "");
        java.lang.String str19 = jobStatusTraceEvent18.getId();
        java.lang.String str20 = jobStatusTraceEvent18.getShardingItems();
        java.util.Date date21 = jobStatusTraceEvent18.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source25 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType26 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state28 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent30 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source25, executionType26, "aff97160474a056e838c1f721af01edf", state28, "");
        java.lang.String str31 = jobStatusTraceEvent30.getId();
        java.lang.String str32 = jobStatusTraceEvent30.getShardingItems();
        java.util.Date date33 = jobStatusTraceEvent30.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics34 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date21, date33);
        java.util.Date date36 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics37 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date36);
        java.util.Date date38 = jobRunningStatistics37.getCreationTime();
        java.lang.Object[] obj_array43 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException44 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array43);
        java.lang.String str45 = appConfigurationException44.toString();
        java.lang.Throwable[] throwable_array46 = appConfigurationException44.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException47 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException44);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable49 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException47, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent50 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource6, (int) (byte) -1, date21, date38, false, jobExecutionEventThrowable49);
        java.util.Date date52 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics53 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date52);
        java.util.Date date54 = jobRunningStatistics53.getCreationTime();
        jobExecutionEvent50.setCompleteTime(date54);
        java.lang.Object[] obj_array59 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException60 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array59);
        java.lang.String str61 = appConfigurationException60.toString();
        java.lang.Throwable[] throwable_array62 = appConfigurationException60.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException63 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException60);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent64 = jobExecutionEvent50.executionFailure((java.lang.Throwable) appConfigurationException60);
        java.util.Date date65 = jobExecutionEvent64.getStartTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics66 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((int) ' ', date65);
        org.junit.Assert.assertTrue("'" + executionSource6 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource6.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "9b393cab-c05f-4b65-99a3-3ebdec1a5a1c" + "'", str19.equals("9b393cab-c05f-4b65-99a3-3ebdec1a5a1c"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str20.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "6f2e3f6c-660f-4da6-a61c-343da5e9dd30" + "'", str31.equals("6f2e3f6c-660f-4da6-a61c-343da5e9dd30"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str32.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertNotNull(obj_array43);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str45.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array46);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertNotNull(obj_array59);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str61.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array62);
        org.junit.Assert.assertNotNull(jobExecutionEvent64);
        org.junit.Assert.assertNotNull(date65);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler defaultJobExceptionHandler0 = new com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException6 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array5);
        java.lang.String str7 = appConfigurationException6.toString();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException12 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array11);
        java.lang.String str13 = appConfigurationException12.toString();
        appConfigurationException6.addSuppressed((java.lang.Throwable) appConfigurationException12);
        com.dangdang.ddframe.job.reg.exception.RegException regException15 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException12);
        defaultJobExceptionHandler0.handleException("47927c57-a9ce-45a6-8297-dfbfc63aa78d", (java.lang.Throwable) appConfigurationException12);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException22 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array21);
        java.lang.String str23 = appConfigurationException22.toString();
        java.lang.Object[] obj_array27 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException28 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array27);
        java.lang.String str29 = appConfigurationException28.toString();
        appConfigurationException22.addSuppressed((java.lang.Throwable) appConfigurationException28);
        java.lang.Throwable throwable31 = null;
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException32 = new com.dangdang.ddframe.job.exception.JobSystemException(throwable31);
        appConfigurationException22.addSuppressed((java.lang.Throwable) jobSystemException32);
        com.dangdang.ddframe.job.event.JobEventListenerConfigurationException jobEventListenerConfigurationException34 = new com.dangdang.ddframe.job.event.JobEventListenerConfigurationException((java.lang.Exception) appConfigurationException22);
        defaultJobExceptionHandler0.handleException("76790358-3199-4060-a536-0f953a59b404", (java.lang.Throwable) appConfigurationException22);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str13.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str23.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str29.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration10 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration6, "3d746adc-0573-435e-b1ec-124d7372fbc5", true);
        java.lang.String str11 = jobCoreConfiguration6.getJobName();
        java.lang.String str12 = jobCoreConfiguration6.getShardingItemParameters();
        int i13 = jobCoreConfiguration6.getShardingTotalCount();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(i13 == 52);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source9 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state12 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent14 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source9, executionType10, "aff97160474a056e838c1f721af01edf", state12, "");
        java.util.Date date15 = jobStatusTraceEvent14.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource18 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent20 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("3cae38aa-7ef9-49ac-8a03-3fd0876da30e", "18220525-2509-40cc-b0e7-71f957a72c51", executionSource18, (int) (short) -1);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource26 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source33 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType34 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state36 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent38 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source33, executionType34, "aff97160474a056e838c1f721af01edf", state36, "");
        java.lang.String str39 = jobStatusTraceEvent38.getId();
        java.lang.String str40 = jobStatusTraceEvent38.getShardingItems();
        java.util.Date date41 = jobStatusTraceEvent38.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source45 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType46 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state48 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent50 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source45, executionType46, "aff97160474a056e838c1f721af01edf", state48, "");
        java.lang.String str51 = jobStatusTraceEvent50.getId();
        java.lang.String str52 = jobStatusTraceEvent50.getShardingItems();
        java.util.Date date53 = jobStatusTraceEvent50.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics54 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date41, date53);
        java.util.Date date56 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics57 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date56);
        java.util.Date date58 = jobRunningStatistics57.getCreationTime();
        java.lang.Object[] obj_array63 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException64 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array63);
        java.lang.String str65 = appConfigurationException64.toString();
        java.lang.Throwable[] throwable_array66 = appConfigurationException64.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException67 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException64);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable69 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException67, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent70 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource26, (int) (byte) -1, date41, date58, false, jobExecutionEventThrowable69);
        jobExecutionEvent20.setFailureCause(jobExecutionEventThrowable69);
        java.util.Date date72 = jobExecutionEvent20.getStartTime();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj73 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition74 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition(52, (int) (byte) 10, "d0cc04e7-efe9-4167-a154-8b65210ed06d", "bicycle.cs.washington.edu", date15, date72, map_str_obj73);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source78 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType79 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state81 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent83 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source78, executionType79, "aff97160474a056e838c1f721af01edf", state81, "");
        java.lang.String str84 = jobStatusTraceEvent83.getId();
        java.lang.String str85 = jobStatusTraceEvent83.getSlaveId();
        java.lang.String str86 = jobStatusTraceEvent83.getShardingItems();
        java.util.Date date87 = jobStatusTraceEvent83.getCreationTime();
        java.util.Date date88 = jobStatusTraceEvent83.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics89 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) (short) 10, (int) (byte) -1, date72, date88);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue("'" + executionSource18 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource18.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + executionSource26 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource26.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "37fac704-539c-4e9d-a6f2-e1d9faed6c54" + "'", str39.equals("37fac704-539c-4e9d-a6f2-e1d9faed6c54"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str40.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "bb5ca96a-c0a9-42bb-ba4a-12c1abc98a56" + "'", str51.equals("bb5ca96a-c0a9-42bb-ba4a-12c1abc98a56"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str52.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertNotNull(obj_array63);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str65.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array66);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "dab2db30-efec-4d69-9730-70caa4f73d05" + "'", str84.equals("dab2db30-efec-4d69-9730-70caa4f73d05"));
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str85.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str86.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertNotNull(date88);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException5 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array4);
        java.lang.String str6 = appConfigurationException5.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException11 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array10);
        java.lang.String str12 = appConfigurationException11.toString();
        appConfigurationException5.addSuppressed((java.lang.Throwable) appConfigurationException11);
        java.lang.Throwable[] throwable_array14 = appConfigurationException11.getSuppressed();
        com.dangdang.ddframe.job.exception.JobConfigurationException jobConfigurationException15 = new com.dangdang.ddframe.job.exception.JobConfigurationException("19545f1b-3c8d-4523-a249-3290a856c2e2", (java.lang.Object[]) throwable_array14);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str6.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str12.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array14);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        org.apache.curator.framework.CuratorFramework curatorFramework6 = zookeeperRegistryCenter5.getClient();
        try {
            zookeeperRegistryCenter5.persist("22f408e9-cb1a-482c-9330-8c6ee4df73b5", "738e59ae-440b-4d0d-b302-7d7b5d191676");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertNull(curatorFramework6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        java.lang.String str19 = condition18.getOrder();
        java.lang.String str20 = condition18.getSort();
        java.lang.String str21 = condition18.getSort();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "13c8bad5-2754-45f1-bbed-1c2a518cba20" + "'", str13.equals("13c8bad5-2754-45f1-bbed-1c2a518cba20"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ecc20b57-52a5-4026-b6c0-d9395b02f7cf" + "'", str19.equals("ecc20b57-52a5-4026-b6c0-d9395b02f7cf"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str20.equals("76790358-3199-4060-a536-0f953a59b404"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str21.equals("76790358-3199-4060-a536-0f953a59b404"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource4 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.FAILOVER;
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent6 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("2ade4a75-2d52-4444-a081-731a4af77674", "9eaaa3b5-8493-4825-8d70-85a402798479", executionSource4, (int) (byte) 1);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent8 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("com.dangdang.ddframe.job.executor.handler.impl.DefaultExecutorServiceHandler", "093cb461-2b3d-47ed-b9d1-599c876ee7c2", executionSource4, 52);
        org.junit.Assert.assertTrue("'" + executionSource4 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.FAILOVER + "'", executionSource4.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.FAILOVER));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.Date date2 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics3 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date2);
        java.util.Date date4 = jobRunningStatistics3.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics5 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(3000, date4);
        java.util.Date date6 = jobRunningStatistics5.getCreationTime();
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertNotNull(date6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        java.lang.String str8 = jobCoreConfiguration6.getJobParameter();
        boolean b9 = jobCoreConfiguration6.isMisfire();
        com.dangdang.ddframe.job.config.script.ScriptJobConfiguration scriptJobConfiguration11 = new com.dangdang.ddframe.job.config.script.ScriptJobConfiguration(jobCoreConfiguration6, "1ce254ed-faf6-403e-ad63-b312817ceab9");
        boolean b12 = jobCoreConfiguration6.isFailover();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.dangdang.ddframe.job.executor.handler.ExecutorServiceHandlerRegistry.remove("ce39fe81-621e-4a34-a654-b28944d02a4f");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException59 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array58);
        java.lang.String str60 = appConfigurationException59.toString();
        java.lang.Throwable[] throwable_array61 = appConfigurationException59.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException62 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent63 = jobExecutionEvent49.executionFailure((java.lang.Throwable) appConfigurationException59);
        java.lang.String str64 = jobExecutionEvent63.getFailureCause();
        java.lang.String str65 = jobExecutionEvent63.getIp();
        java.lang.String str66 = jobExecutionEvent63.getHostname();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "5299d802-b74a-424a-8edc-e5327f3eeb29" + "'", str18.equals("5299d802-b74a-424a-8edc-e5327f3eeb29"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "e00f4eb9-df86-41a7-844f-df3a641d2150" + "'", str30.equals("e00f4eb9-df86-41a7-844f-df3a641d2150"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str60.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(jobExecutionEvent63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n" + "'", str64.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "3ad58490-9ea0-4425-8b19-6ce5272f2ca4" + "'", str65.equals("3ad58490-9ea0-4425-8b19-6ce5272f2ca4"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "-1,1,10" + "'", str66.equals("-1,1,10"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum1 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.from("com.dangdang.ddframe.job.exception.JobSystemException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\nCaused by: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\t... 6 more\n");
        org.junit.Assert.assertNull(jobPropertiesEnum1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType4 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent8 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source3, executionType4, "aff97160474a056e838c1f721af01edf", state6, "");
        java.lang.String str9 = jobStatusTraceEvent8.getId();
        java.lang.String str10 = jobStatusTraceEvent8.getSlaveId();
        jobStatusTraceEvent8.setOriginalTaskId("9f29874b-7365-4fc9-aa02-e897d5bb5dcb");
        java.lang.String str13 = jobStatusTraceEvent8.getTaskId();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state14 = jobStatusTraceEvent8.getState();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "8f059396-8b92-4944-a062-8a265985c3cc" + "'", str9.equals("8f059396-8b92-4944-a062-8a265985c3cc"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str10.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(state14);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b13 = taskContext11.equals((java.lang.Object) '#');
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType14 = com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL;
        boolean b15 = taskContext11.equals((java.lang.Object) databaseType14);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo16 = taskContext11.getMetaInfo();
        java.lang.String str17 = metaInfo16.toString();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + databaseType14 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL + "'", databaseType14.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(metaInfo16);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.util.EnumMap<com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum, java.lang.String> enummap_jobPropertiesEnum_str0 = null;
        com.dangdang.ddframe.job.executor.handler.JobProperties jobProperties1 = new com.dangdang.ddframe.job.executor.handler.JobProperties(enummap_jobPropertiesEnum_str0);
        jobProperties1.put("8d4a5c91-8b38-4f21-ac3a-6f969ca8e9f7", "128.208.4.97");
        jobProperties1.put("c52e5821-cf1e-460b-93cf-d0d4032245e7", "640277ee-2345-423d-ad13-b01f9c37bfdb");
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum8 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER;
        java.lang.String str9 = jobPropertiesEnum8.getDefaultValue();
        try {
            java.lang.String str10 = jobProperties1.get(jobPropertiesEnum8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + jobPropertiesEnum8 + "' != '" + com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER + "'", jobPropertiesEnum8.equals(com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "com.dangdang.ddframe.job.executor.handler.impl.DefaultExecutorServiceHandler" + "'", str9.equals("com.dangdang.ddframe.job.executor.handler.impl.DefaultExecutorServiceHandler"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        java.lang.String str19 = condition18.getOrder();
        java.lang.String str20 = condition18.getSort();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj21 = condition18.getFields();
        java.lang.String str22 = condition18.getOrder();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "f426dc2b-b4aa-41ca-9a9e-a55a2d864ecf" + "'", str13.equals("f426dc2b-b4aa-41ca-9a9e-a55a2d864ecf"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ecc20b57-52a5-4026-b6c0-d9395b02f7cf" + "'", str19.equals("ecc20b57-52a5-4026-b6c0-d9395b02f7cf"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str20.equals("76790358-3199-4060-a536-0f953a59b404"));
        org.junit.Assert.assertNull(map_str_obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "ecc20b57-52a5-4026-b6c0-d9395b02f7cf" + "'", str22.equals("ecc20b57-52a5-4026-b6c0-d9395b02f7cf"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("-1,1,10", "aff97160474a056e838c1f721af01edf", (int) '4', "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", map_i_str4, (int) (byte) -1);
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str7 = shardingContexts6.getShardingItemParameters();
        int i8 = shardingContexts6.getCurrentJobEventSamplingCount();
        org.junit.Assert.assertNull(map_i_str7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b13 = taskContext11.equals((java.lang.Object) '#');
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType14 = com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL;
        boolean b15 = taskContext11.equals((java.lang.Object) databaseType14);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo16 = taskContext11.getMetaInfo();
        java.lang.String str17 = taskContext11.getSlaveId();
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum18 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER;
        boolean b19 = taskContext11.equals((java.lang.Object) jobPropertiesEnum18);
        java.lang.Class<?> cls20 = jobPropertiesEnum18.getClassType();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + databaseType14 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL + "'", databaseType14.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(metaInfo16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "128.208.4.97" + "'", str17.equals("128.208.4.97"));
        org.junit.Assert.assertTrue("'" + jobPropertiesEnum18 + "' != '" + com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER + "'", jobPropertiesEnum18.equals(com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(cls20);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        try {
            java.lang.String str1 = com.dangdang.ddframe.job.context.TaskContext.getIdForUnassignedSlave("c8ef167c-d5e7-4ef6-8114-240ddae59a01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source5 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent10 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source5, executionType6, "aff97160474a056e838c1f721af01edf", state8, "");
        java.lang.String str11 = jobStatusTraceEvent10.getId();
        java.lang.String str12 = jobStatusTraceEvent10.getShardingItems();
        java.util.Date date13 = jobStatusTraceEvent10.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source17 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType18 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state20 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent22 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source17, executionType18, "aff97160474a056e838c1f721af01edf", state20, "");
        java.lang.String str23 = jobStatusTraceEvent22.getId();
        java.lang.String str24 = jobStatusTraceEvent22.getShardingItems();
        java.util.Date date25 = jobStatusTraceEvent22.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics26 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date13, date25);
        java.util.Date date27 = taskRunningStatistics26.getCreationTime();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "cab9419f-0064-4b84-b8b0-22db9706f611" + "'", str11.equals("cab9419f-0064-4b84-b8b0-22db9706f611"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str12.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "5929039b-6d28-419a-93d5-cc0119ce1fb4" + "'", str23.equals("5929039b-6d28-419a-93d5-cc0119ce1fb4"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str24.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertNotNull(date27);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        java.lang.String str19 = condition18.getOrder();
        java.lang.String str20 = condition18.getSort();
        int i21 = condition18.getPerPage();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj22 = condition18.getFields();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "155594de-8e67-4fdd-9871-c7a5295cde4d" + "'", str13.equals("155594de-8e67-4fdd-9871-c7a5295cde4d"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ecc20b57-52a5-4026-b6c0-d9395b02f7cf" + "'", str19.equals("ecc20b57-52a5-4026-b6c0-d9395b02f7cf"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str20.equals("76790358-3199-4060-a536-0f953a59b404"));
        org.junit.Assert.assertTrue(i21 == 100);
        org.junit.Assert.assertNull(map_str_obj22);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        try {
            java.lang.String str1 = com.dangdang.ddframe.job.context.TaskContext.getIdForUnassignedSlave("3cae38aa-7ef9-49ac-8a03-3fd0876da30e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.lang.Throwable throwable50 = jobExecutionEventThrowable48.getThrowable();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "72f9f6f2-f2f9-42b1-a8b7-dc5bab3a0848" + "'", str18.equals("72f9f6f2-f2f9-42b1-a8b7-dc5bab3a0848"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "57ec7ac5-caa0-4290-af0a-3fa092476896" + "'", str30.equals("57ec7ac5-caa0-4290-af0a-3fa092476896"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(throwable50);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        org.apache.curator.framework.CuratorFramework curatorFramework6 = zookeeperRegistryCenter5.getClient();
        java.lang.Object obj8 = zookeeperRegistryCenter5.getRawCache("845a6b89-4321-431d-b9af-62c3463576ab");
        org.junit.Assert.assertNull(curatorFramework6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        try {
            java.util.List<java.lang.Integer> list_i1 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemList("23b5f2f8-8322-48a7-8663-e88ed80c61f1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.Object[] obj_array2 = new java.lang.Object[] {};
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException3 = new com.dangdang.ddframe.job.exception.JobSystemException("e4d15e1a-97fe-46bb-b675-2bf9bbd22023", obj_array2);
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("c7f580c8-6c4b-4c2e-804c-cb22ad84db15", obj_array2);
        com.dangdang.ddframe.job.event.JobEventListenerConfigurationException jobEventListenerConfigurationException5 = new com.dangdang.ddframe.job.event.JobEventListenerConfigurationException((java.lang.Exception) appConfigurationException4);
        java.lang.String str6 = com.dangdang.ddframe.job.exception.ExceptionUtil.transform((java.lang.Throwable) jobEventListenerConfigurationException5);
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.dangdang.ddframe.job.event.JobEventListenerConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: c7f580c8-6c4b-4c2e-804c-cb22ad84db15\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\nCaused by: com.dangdang.ddframe.job.exception.AppConfigurationException: c7f580c8-6c4b-4c2e-804c-cb22ad84db15\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\t... 6 more\n" + "'", str6.equals("com.dangdang.ddframe.job.event.JobEventListenerConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: c7f580c8-6c4b-4c2e-804c-cb22ad84db15\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\nCaused by: com.dangdang.ddframe.job.exception.AppConfigurationException: c7f580c8-6c4b-4c2e-804c-cb22ad84db15\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\t... 6 more\n"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException10 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array9);
        java.lang.String str11 = appConfigurationException10.toString();
        appConfigurationException4.addSuppressed((java.lang.Throwable) appConfigurationException10);
        com.dangdang.ddframe.job.reg.exception.RegException regException13 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException10);
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException14 = new com.dangdang.ddframe.job.exception.AppConfigurationException((java.lang.Throwable) appConfigurationException10);
        try {
            com.dangdang.ddframe.job.reg.exception.RegExceptionHandler.handleException((java.lang.Exception) appConfigurationException14);
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.lang.String str50 = jobExecutionEventThrowable48.getPlainText();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "8833434a-ac64-4c95-b1a7-4678574c5ed7" + "'", str18.equals("8833434a-ac64-4c95-b1a7-4678574c5ed7"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "ad4d5f1c-ab08-4987-be3a-d73378234b14" + "'", str30.equals("ad4d5f1c-ab08-4987-be3a-d73378234b14"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str50.equals("aff97160474a056e838c1f721af01edf"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject executorServiceObject2 = new com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject("e6fbe543-b3f7-45cd-ad16-7a4c8325f2cd", (int) (short) 100);
        int i3 = executorServiceObject2.getActiveThreadCount();
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.misfire(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i10 = new java.util.ArrayList<java.lang.Integer>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i10, i_array9);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo12 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i10);
        java.util.List<java.lang.Integer> list_i13 = metaInfo12.getShardingItems();
        java.lang.String str14 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i13);
        com.dangdang.ddframe.job.context.ExecutionType executionType15 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext17 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i13, executionType15, "128.208.4.97");
        com.dangdang.ddframe.job.context.TaskContext taskContext19 = new com.dangdang.ddframe.job.context.TaskContext("b0ada993-d6e1-4910-ac71-a51c3210b1d9", (java.util.List<java.lang.Integer>) arraylist_i4, executionType15, "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!");
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i24 = new java.util.ArrayList<java.lang.Integer>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i24, i_array23);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo26 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i24);
        java.util.List<java.lang.Integer> list_i27 = metaInfo26.getShardingItems();
        java.lang.String str28 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i27);
        com.dangdang.ddframe.job.context.ExecutionType executionType29 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext31 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i27, executionType29, "128.208.4.97");
        java.lang.String str32 = taskContext31.getSlaveId();
        java.lang.String str33 = taskContext31.getId();
        com.dangdang.ddframe.job.context.ExecutionType executionType34 = taskContext31.getType();
        com.dangdang.ddframe.job.context.TaskContext taskContext35 = new com.dangdang.ddframe.job.context.TaskContext("f3d9c62c-8c49-4724-b388-fb7fcd70f041", (java.util.List<java.lang.Integer>) arraylist_i4, executionType34);
        java.lang.String str36 = taskContext35.getId();
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo37 = taskContext35.getMetaInfo();
        java.lang.String str38 = taskContext35.getId();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(list_i13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10" + "'", str14.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType15 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType15.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(list_i27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10" + "'", str28.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType29 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType29.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "128.208.4.97" + "'", str32.equals("128.208.4.97"));
        org.junit.Assert.assertTrue("'" + executionType34 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType34.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertNotNull(metaInfo37);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType4 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent8 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source3, executionType4, "aff97160474a056e838c1f721af01edf", state6, "");
        java.util.Date date9 = jobStatusTraceEvent8.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = jobStatusTraceEvent8.getState();
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertNull(state10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        java.lang.String str12 = taskContext11.getSlaveId();
        boolean b13 = taskContext11.isIdle();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "128.208.4.97" + "'", str12.equals("128.208.4.97"));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("e4d15e1a-97fe-46bb-b675-2bf9bbd22023", "997b25f2-bc17-46f9-86ea-eb52a13f1b83", (int) (short) 1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("ee6144a8-6164-451f-9e3c-e3c85113af90", "", (int) ' ', "b7b819a3-db6c-4320-bc54-2c4af886020f", map_i_str4, (int) (byte) 100);
        boolean b7 = shardingContexts6.isAllowSendJobEvent();
        shardingContexts6.setAllowSendJobEvent(true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType4 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent8 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source3, executionType4, "aff97160474a056e838c1f721af01edf", state6, "");
        java.lang.String str9 = jobStatusTraceEvent8.getId();
        java.lang.String str10 = jobStatusTraceEvent8.getSlaveId();
        jobStatusTraceEvent8.setOriginalTaskId("9f29874b-7365-4fc9-aa02-e897d5bb5dcb");
        java.lang.String str13 = jobStatusTraceEvent8.getTaskId();
        java.lang.String str14 = jobStatusTraceEvent8.getId();
        jobStatusTraceEvent8.setOriginalTaskId("eb4ba681-f95e-49d5-86f7-19d8803ee954");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source17 = jobStatusTraceEvent8.getSource();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "66763977-fc65-4632-a3ed-f842f7407ec7" + "'", str9.equals("66763977-fc65-4632-a3ed-f842f7407ec7"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str10.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "66763977-fc65-4632-a3ed-f842f7407ec7" + "'", str14.equals("66763977-fc65-4632-a3ed-f842f7407ec7"));
        org.junit.Assert.assertNull(source17);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n");
        java.lang.String str3 = zookeeperConfiguration2.getDigest();
        zookeeperConfiguration2.setDigest("e6fbe543-b3f7-45cd-ad16-7a4c8325f2cd");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds((int) 'a');
        int i7 = zookeeperConfiguration2.getMaxRetries();
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter8 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        zookeeperConfiguration2.setSessionTimeoutMilliseconds((int) (short) 0);
        zookeeperConfiguration2.setSessionTimeoutMilliseconds((int) '4');
        org.junit.Assert.assertTrue(i7 == 3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("6cccc9fb-a442-47eb-a302-6d86b68b40e4", "191e3dba-5219-488f-a542-de472590af14", (int) (byte) 100, "24fc29b5-4adc-41f8-96a8-04607ec1d4cc", map_i_str4, (int) '4');
        boolean b7 = shardingContexts6.isAllowSendJobEvent();
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source4 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType5 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state7 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent9 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source4, executionType5, "aff97160474a056e838c1f721af01edf", state7, "");
        java.lang.String str10 = jobStatusTraceEvent9.getId();
        java.lang.String str11 = jobStatusTraceEvent9.getSlaveId();
        java.lang.String str12 = jobStatusTraceEvent9.getShardingItems();
        java.util.Date date13 = jobStatusTraceEvent9.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics jobRegisterStatistics14 = new com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics((int) (byte) 100, date13);
        long long15 = jobRegisterStatistics14.getId();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "5e0b073e-8e65-401d-8e52-4a02e103175b" + "'", str10.equals("5e0b073e-8e65-401d-8e52-4a02e103175b"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str11.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str12.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertTrue(long15 == 0L);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject executorServiceObject2 = new com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject("e6fbe543-b3f7-45cd-ad16-7a4c8325f2cd", (int) (short) 100);
        int i3 = executorServiceObject2.getWorkQueueSize();
        java.util.concurrent.ExecutorService executorService4 = executorServiceObject2.createExecutorService();
        java.util.concurrent.ExecutorService executorService5 = executorServiceObject2.createExecutorService();
        int i6 = executorServiceObject2.getWorkQueueSize();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(executorService4);
        org.junit.Assert.assertNotNull(executorService5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.dangdang.ddframe.job.statistics.type.job.JobTypeStatistics jobTypeStatistics3 = new com.dangdang.ddframe.job.statistics.type.job.JobTypeStatistics((int) (short) 10, (int) (byte) 100, (int) (short) 10);
        int i4 = jobTypeStatistics3.getSimpleJobCount();
        int i5 = jobTypeStatistics3.getDataflowJobCount();
        org.junit.Assert.assertTrue(i4 == 100);
        org.junit.Assert.assertTrue(i5 == 10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder7.failover(true);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration10 = builder7.build();
        com.dangdang.ddframe.job.executor.handler.JobProperties jobProperties11 = jobCoreConfiguration10.getJobProperties();
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum12 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER;
        java.lang.String str13 = jobPropertiesEnum12.getKey();
        java.lang.String str14 = jobProperties11.get(jobPropertiesEnum12);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(jobCoreConfiguration10);
        org.junit.Assert.assertNotNull(jobProperties11);
        org.junit.Assert.assertTrue("'" + jobPropertiesEnum12 + "' != '" + com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER + "'", jobPropertiesEnum12.equals(com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "job_exception_handler" + "'", str13.equals("job_exception_handler"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler" + "'", str14.equals("com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.dangdang.ddframe.job.executor.handler.JobProperties jobProperties0 = new com.dangdang.ddframe.job.executor.handler.JobProperties();
        jobProperties0.put("ce2c99c6-0acd-4283-a561-0ef1b726da34", "5b0e877d-c398-4f25-b46f-3a03e4ab95a4");
        java.lang.String str4 = jobProperties0.json();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{\"job_exception_handler\":\"com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler\",\"executor_service_handler\":\"com.dangdang.ddframe.job.executor.handler.impl.DefaultExecutorServiceHandler\"}" + "'", str4.equals("{\"job_exception_handler\":\"com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler\",\"executor_service_handler\":\"com.dangdang.ddframe.job.executor.handler.impl.DefaultExecutorServiceHandler\"}"));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds((int) 'a');
        int i7 = zookeeperConfiguration2.getMaxRetries();
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter8 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        zookeeperConfiguration2.setConnectionTimeoutMilliseconds((int) (short) 0);
        org.junit.Assert.assertTrue(i7 == 3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source9 = null;
        java.lang.Integer[] i_array13 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i14 = new java.util.ArrayList<java.lang.Integer>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i14, i_array13);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo16 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i14);
        java.util.List<java.lang.Integer> list_i17 = metaInfo16.getShardingItems();
        java.lang.String str18 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i17);
        com.dangdang.ddframe.job.context.ExecutionType executionType19 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext21 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i17, executionType19, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state23 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source30 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType31 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state33 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent35 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source30, executionType31, "aff97160474a056e838c1f721af01edf", state33, "");
        java.lang.String str36 = jobStatusTraceEvent35.getId();
        java.lang.String str37 = jobStatusTraceEvent35.getShardingItems();
        java.util.Date date38 = jobStatusTraceEvent35.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source42 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType43 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state45 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent47 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source42, executionType43, "aff97160474a056e838c1f721af01edf", state45, "");
        java.lang.String str48 = jobStatusTraceEvent47.getId();
        java.lang.String str49 = jobStatusTraceEvent47.getShardingItems();
        java.util.Date date50 = jobStatusTraceEvent47.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics51 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date38, date50);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent52 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source9, executionType19, "128.208.4.97", state23, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date38);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state54 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent56 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("ee6144a8-6164-451f-9e3c-e3c85113af90", "d41d8cd98f00b204e9800998ecf8427e", "720a31a1-6e31-4409-abe8-90f69964d02f", source3, executionType19, "8d4a5c91-8b38-4f21-ac3a-6f969ca8e9f7", state54, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4");
        java.lang.String str57 = jobStatusTraceEvent56.getId();
        jobStatusTraceEvent56.setOriginalTaskId("7b2d7fea-043e-41ff-b7b9-0f3fbbcffc43");
        org.junit.Assert.assertTrue("'" + source3 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER + "'", source3.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER));
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(list_i17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10" + "'", str18.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType19 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType19.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state23 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state23.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "47cb24ed-ee23-478f-959b-eb84003c6154" + "'", str36.equals("47cb24ed-ee23-478f-959b-eb84003c6154"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str37.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "4d5a8f77-a578-4395-ae2c-9fecec9ed514" + "'", str48.equals("4d5a8f77-a578-4395-ae2c-9fecec9ed514"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str49.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertTrue("'" + state54 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED + "'", state54.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "012beda3-baeb-4c3f-8ed0-11ec001b27b4" + "'", str57.equals("012beda3-baeb-4c3f-8ed0-11ec001b27b4"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("10");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder5.description("9a50607d-a4e8-4c75-b7b0-9a37a0bcd871");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder11 = builder9.failover(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source5 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent10 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source5, executionType6, "aff97160474a056e838c1f721af01edf", state8, "");
        java.lang.String str11 = jobStatusTraceEvent10.getId();
        java.lang.String str12 = jobStatusTraceEvent10.getSlaveId();
        java.lang.String str13 = jobStatusTraceEvent10.getShardingItems();
        java.util.Date date14 = jobStatusTraceEvent10.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source18 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType19 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state21 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent23 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source18, executionType19, "aff97160474a056e838c1f721af01edf", state21, "");
        java.lang.String str24 = jobStatusTraceEvent23.getId();
        java.lang.String str25 = jobStatusTraceEvent23.getSlaveId();
        java.lang.String str26 = jobStatusTraceEvent23.getShardingItems();
        java.util.Date date27 = jobStatusTraceEvent23.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics28 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) (byte) 10, 1, date14, date27);
        int i29 = taskRunningStatistics28.getRunningCount();
        int i30 = taskRunningStatistics28.getRunningCount();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "5d78fb68-9e44-4aba-b0db-d96a339afe5f" + "'", str11.equals("5d78fb68-9e44-4aba-b0db-d96a339afe5f"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str12.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str13.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "a381aa4d-f992-4aa2-a6ab-13319eeb6b56" + "'", str24.equals("a381aa4d-f992-4aa2-a6ab-13319eeb6b56"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str25.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str26.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue(i30 == 1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setConnectionTimeoutMilliseconds((int) 'a');
        java.lang.String str5 = zookeeperConfiguration2.getNamespace();
        int i6 = zookeeperConfiguration2.getConnectionTimeoutMilliseconds();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1,1,10" + "'", str5.equals("-1,1,10"));
        org.junit.Assert.assertTrue(i6 == 97);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval0 = com.dangdang.ddframe.job.statistics.StatisticInterval.HOUR;
        java.lang.String str1 = statisticInterval0.getCron();
        org.junit.Assert.assertTrue("'" + statisticInterval0 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.HOUR + "'", statisticInterval0.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.HOUR));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0 0 * * * ?" + "'", str1.equals("0 0 * * * ?"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.lang.Object[] obj_array4 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException5 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array4);
        java.lang.String str6 = appConfigurationException5.toString();
        java.lang.Object[] obj_array10 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException11 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array10);
        java.lang.String str12 = appConfigurationException11.toString();
        appConfigurationException5.addSuppressed((java.lang.Throwable) appConfigurationException11);
        com.dangdang.ddframe.job.reg.exception.RegException regException14 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException11);
        java.lang.Object[] obj_array18 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException19 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array18);
        java.lang.String str20 = appConfigurationException19.toString();
        java.lang.Object[] obj_array24 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException25 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array24);
        java.lang.String str26 = appConfigurationException25.toString();
        appConfigurationException19.addSuppressed((java.lang.Throwable) appConfigurationException25);
        java.lang.Throwable throwable28 = null;
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException29 = new com.dangdang.ddframe.job.exception.JobSystemException(throwable28);
        appConfigurationException19.addSuppressed((java.lang.Throwable) jobSystemException29);
        com.dangdang.ddframe.job.event.JobEventListenerConfigurationException jobEventListenerConfigurationException31 = new com.dangdang.ddframe.job.event.JobEventListenerConfigurationException((java.lang.Exception) appConfigurationException19);
        appConfigurationException11.addSuppressed((java.lang.Throwable) jobEventListenerConfigurationException31);
        java.lang.Throwable[] throwable_array33 = appConfigurationException11.getSuppressed();
        com.dangdang.ddframe.job.exception.JobConfigurationException jobConfigurationException34 = new com.dangdang.ddframe.job.exception.JobConfigurationException("b7b819a3-db6c-4320-bc54-2c4af886020f", (java.lang.Object[]) throwable_array33);
        org.junit.Assert.assertNotNull(obj_array4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str6.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str12.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str20.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str26.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array33);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval3 = com.dangdang.ddframe.job.statistics.StatisticInterval.HOUR;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source9 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state12 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent14 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source9, executionType10, "aff97160474a056e838c1f721af01edf", state12, "");
        java.lang.String str15 = jobStatusTraceEvent14.getId();
        java.lang.String str16 = jobStatusTraceEvent14.getShardingItems();
        java.util.Date date17 = jobStatusTraceEvent14.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source21 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType22 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state24 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent26 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source21, executionType22, "aff97160474a056e838c1f721af01edf", state24, "");
        java.lang.String str27 = jobStatusTraceEvent26.getId();
        java.lang.String str28 = jobStatusTraceEvent26.getShardingItems();
        java.util.Date date29 = jobStatusTraceEvent26.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics30 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date17, date29);
        long long31 = taskRunningStatistics30.getId();
        java.util.Date date32 = taskRunningStatistics30.getCreationTime();
        java.util.Date date33 = taskRunningStatistics30.getStatisticsTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics34 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics(3, (int) (short) -1, statisticInterval3, date33);
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics35 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((int) (short) 0, date33);
        org.junit.Assert.assertTrue("'" + statisticInterval3 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.HOUR + "'", statisticInterval3.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.HOUR));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "2412762a-473b-48a8-8a40-120aeb98580e" + "'", str15.equals("2412762a-473b-48a8-8a40-120aeb98580e"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str16.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "fc738efc-4c1b-4212-866f-a28e9e05e6e2" + "'", str27.equals("fc738efc-4c1b-4212-866f-a28e9e05e6e2"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str28.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertTrue(long31 == 0L);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date33);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n");
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds((int) (byte) 1);
        int i5 = zookeeperConfiguration2.getConnectionTimeoutMilliseconds();
        java.lang.String str6 = zookeeperConfiguration2.getNamespace();
        int i7 = zookeeperConfiguration2.getMaxRetries();
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n" + "'", str6.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n"));
        org.junit.Assert.assertTrue(i7 == 3);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b12 = taskContext11.isIdle();
        taskContext11.setIdle(true);
        java.lang.String str15 = taskContext11.toString();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b13 = taskContext11.equals((java.lang.Object) '#');
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType14 = com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL;
        boolean b15 = taskContext11.equals((java.lang.Object) databaseType14);
        com.dangdang.ddframe.job.context.ExecutionType executionType16 = taskContext11.getType();
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo17 = taskContext11.getMetaInfo();
        java.lang.String str18 = metaInfo17.getJobName();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + databaseType14 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL + "'", databaseType14.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + executionType16 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType16.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertNotNull(metaInfo17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10" + "'", str18.equals("10"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration10 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration6, "3d746adc-0573-435e-b1ec-124d7372fbc5", true);
        java.lang.String str11 = jobCoreConfiguration6.getJobName();
        com.dangdang.ddframe.job.config.script.ScriptJobConfiguration scriptJobConfiguration13 = new com.dangdang.ddframe.job.config.script.ScriptJobConfiguration(jobCoreConfiguration6, "0e04149c-206e-417e-ae5c-93128efc5dcd");
        com.dangdang.ddframe.job.api.JobType jobType14 = scriptJobConfiguration13.getJobType();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + jobType14 + "' != '" + com.dangdang.ddframe.job.api.JobType.SCRIPT + "'", jobType14.equals(com.dangdang.ddframe.job.api.JobType.SCRIPT));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        int i5 = zookeeperConfiguration2.getMaxSleepTimeMilliseconds();
        zookeeperConfiguration2.setConnectionTimeoutMilliseconds((int) 'a');
        org.junit.Assert.assertTrue(i5 == 3000);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.lang.Object[] obj_array4 = new java.lang.Object[] {};
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException5 = new com.dangdang.ddframe.job.exception.JobSystemException("e4d15e1a-97fe-46bb-b675-2bf9bbd22023", obj_array4);
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException6 = new com.dangdang.ddframe.job.exception.AppConfigurationException("c7f580c8-6c4b-4c2e-804c-cb22ad84db15", obj_array4);
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException7 = new com.dangdang.ddframe.job.exception.JobSystemException("c23640a3-a78d-4aea-b5a1-391070406e83", obj_array4);
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException8 = new com.dangdang.ddframe.job.exception.JobSystemException("-1,1,10", obj_array4);
        org.junit.Assert.assertNotNull(obj_array4);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.dangdang.ddframe.job.statistics.type.job.JobExecutionTypeStatistics jobExecutionTypeStatistics2 = new com.dangdang.ddframe.job.statistics.type.job.JobExecutionTypeStatistics((int) (byte) 10, 100);
        int i3 = jobExecutionTypeStatistics2.getDaemonJobCount();
        int i4 = jobExecutionTypeStatistics2.getTransientJobCount();
        int i5 = jobExecutionTypeStatistics2.getTransientJobCount();
        int i6 = jobExecutionTypeStatistics2.getDaemonJobCount();
        org.junit.Assert.assertTrue(i3 == 100);
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(i5 == 10);
        org.junit.Assert.assertTrue(i6 == 100);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler defaultJobExceptionHandler0 = new com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException6 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array5);
        java.lang.String str7 = appConfigurationException6.toString();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException12 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array11);
        java.lang.String str13 = appConfigurationException12.toString();
        appConfigurationException6.addSuppressed((java.lang.Throwable) appConfigurationException12);
        com.dangdang.ddframe.job.reg.exception.RegException regException15 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException12);
        defaultJobExceptionHandler0.handleException("47927c57-a9ce-45a6-8297-dfbfc63aa78d", (java.lang.Throwable) appConfigurationException12);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException22 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array21);
        java.lang.String str23 = appConfigurationException22.toString();
        java.lang.Object[] obj_array27 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException28 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array27);
        java.lang.String str29 = appConfigurationException28.toString();
        appConfigurationException22.addSuppressed((java.lang.Throwable) appConfigurationException28);
        com.dangdang.ddframe.job.reg.exception.RegException regException31 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException28);
        java.lang.Object[] obj_array35 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException36 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array35);
        java.lang.String str37 = appConfigurationException36.toString();
        java.lang.Object[] obj_array41 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException42 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array41);
        java.lang.String str43 = appConfigurationException42.toString();
        appConfigurationException36.addSuppressed((java.lang.Throwable) appConfigurationException42);
        java.lang.Throwable throwable45 = null;
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException(throwable45);
        appConfigurationException36.addSuppressed((java.lang.Throwable) jobSystemException46);
        com.dangdang.ddframe.job.event.JobEventListenerConfigurationException jobEventListenerConfigurationException48 = new com.dangdang.ddframe.job.event.JobEventListenerConfigurationException((java.lang.Exception) appConfigurationException36);
        appConfigurationException28.addSuppressed((java.lang.Throwable) jobEventListenerConfigurationException48);
        java.lang.Throwable[] throwable_array50 = appConfigurationException28.getSuppressed();
        java.lang.String str51 = com.dangdang.ddframe.job.exception.ExceptionUtil.transform((java.lang.Throwable) appConfigurationException28);
        defaultJobExceptionHandler0.handleException("8833434a-ac64-4c95-b1a7-4678574c5ed7", (java.lang.Throwable) appConfigurationException28);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str13.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str23.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str29.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array35);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str37.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str43.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n\tSuppressed: com.dangdang.ddframe.job.event.JobEventListenerConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\t\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\t\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\t\t... 6 more\n\tCaused by: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\t\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\t\t... 6 more\n\t\tSuppressed: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\t\t\t... 7 more\n\t\tSuppressed: com.dangdang.ddframe.job.exception.JobSystemException\n\t\t\tat sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\n\t\t\t... 6 more\n" + "'", str51.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n\tSuppressed: com.dangdang.ddframe.job.event.JobEventListenerConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\t\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\t\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\t\t... 6 more\n\tCaused by: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\t\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\t\t... 6 more\n\t\tSuppressed: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\t\t\t... 7 more\n\t\tSuppressed: com.dangdang.ddframe.job.exception.JobSystemException\n\t\t\tat sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\n\t\t\t... 6 more\n"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval3 = com.dangdang.ddframe.job.statistics.StatisticInterval.DAY;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source21 = null;
        java.lang.Integer[] i_array25 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i26 = new java.util.ArrayList<java.lang.Integer>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i26, i_array25);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo28 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i26);
        java.util.List<java.lang.Integer> list_i29 = metaInfo28.getShardingItems();
        java.lang.String str30 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i29);
        com.dangdang.ddframe.job.context.ExecutionType executionType31 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext33 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i29, executionType31, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state35 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source42 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType43 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state45 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent47 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source42, executionType43, "aff97160474a056e838c1f721af01edf", state45, "");
        java.lang.String str48 = jobStatusTraceEvent47.getId();
        java.lang.String str49 = jobStatusTraceEvent47.getShardingItems();
        java.util.Date date50 = jobStatusTraceEvent47.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source54 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType55 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state57 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent59 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source54, executionType55, "aff97160474a056e838c1f721af01edf", state57, "");
        java.lang.String str60 = jobStatusTraceEvent59.getId();
        java.lang.String str61 = jobStatusTraceEvent59.getShardingItems();
        java.util.Date date62 = jobStatusTraceEvent59.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics63 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date50, date62);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent64 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source21, executionType31, "128.208.4.97", state35, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date50);
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics65 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics((long) (byte) 0, 1, 52, statisticInterval3, date15, date50);
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval66 = taskResultStatistics65.getStatisticInterval();
        long long67 = taskResultStatistics65.getId();
        java.util.Date date68 = taskResultStatistics65.getCreationTime();
        org.junit.Assert.assertTrue("'" + statisticInterval3 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval3.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "65a919a1-23a1-4051-aa25-b57fe267eba6" + "'", str13.equals("65a919a1-23a1-4051-aa25-b57fe267eba6"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(list_i29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "10" + "'", str30.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType31 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType31.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state35 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state35.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "ce9cd909-2da1-4cb3-842b-15d19b8f01bb" + "'", str48.equals("ce9cd909-2da1-4cb3-842b-15d19b8f01bb"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str49.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "d4b03d63-84c3-4380-b2d5-aeaf56529dfb" + "'", str60.equals("d4b03d63-84c3-4380-b2d5-aeaf56529dfb"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str61.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertTrue("'" + statisticInterval66 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval66.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue(long67 == 0L);
        org.junit.Assert.assertNotNull(date68);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds((int) 'a');
        int i7 = zookeeperConfiguration2.getMaxRetries();
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter8 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            zookeeperRegistryCenter8.init();
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertTrue(i7 == 3);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException59 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array58);
        java.lang.String str60 = appConfigurationException59.toString();
        java.lang.Throwable[] throwable_array61 = appConfigurationException59.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException62 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent63 = jobExecutionEvent49.executionFailure((java.lang.Throwable) appConfigurationException59);
        java.lang.String str64 = jobExecutionEvent63.getFailureCause();
        boolean b65 = jobExecutionEvent63.isSuccess();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source73 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType74 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state76 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent78 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source73, executionType74, "aff97160474a056e838c1f721af01edf", state76, "");
        java.lang.String str79 = jobStatusTraceEvent78.getId();
        java.lang.String str80 = jobStatusTraceEvent78.getShardingItems();
        java.util.Date date81 = jobStatusTraceEvent78.getCreationTime();
        java.util.Date date82 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj83 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition84 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date81, date82, map_str_obj83);
        jobExecutionEvent63.setCompleteTime(date82);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent86 = jobExecutionEvent63.executionSuccess();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "fbbc9a1b-6cf1-48a0-9622-e652935b1535" + "'", str18.equals("fbbc9a1b-6cf1-48a0-9622-e652935b1535"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "33edade9-dd48-46ae-8e50-59cb59650c74" + "'", str30.equals("33edade9-dd48-46ae-8e50-59cb59650c74"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str60.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(jobExecutionEvent63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n" + "'", str64.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n"));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "81760b7e-88e1-44eb-bd85-d1e01751c019" + "'", str79.equals("81760b7e-88e1-44eb-bd85-d1e01751c019"));
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str80.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertNotNull(jobExecutionEvent86);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.lang.Integer[] i_array7 = new java.lang.Integer[] { 0, 100, (-1), 10, 3, 3000 };
        java.util.ArrayList<java.lang.Integer> arraylist_i8 = new java.util.ArrayList<java.lang.Integer>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i8, i_array7);
        java.lang.String str10 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString((java.util.List<java.lang.Integer>) arraylist_i8);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo11 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("d53df2cf-e715-4bef-bb8c-84a20ed0e16a", (java.util.List<java.lang.Integer>) arraylist_i8);
        org.junit.Assert.assertNotNull(i_array7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0,100,-1,10,3,3000" + "'", str10.equals("0,100,-1,10,3,3000"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n");
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds((int) (byte) 1);
        int i5 = zookeeperConfiguration2.getMaxRetries();
        zookeeperConfiguration2.setSessionTimeoutMilliseconds(10);
        java.lang.String str8 = zookeeperConfiguration2.getNamespace();
        org.junit.Assert.assertTrue(i5 == 3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n" + "'", str8.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b13 = taskContext11.equals((java.lang.Object) '#');
        taskContext11.setSlaveId("bicycle.cs.washington.edu");
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.lang.Integer[] i_array4 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> arraylist_i5 = new java.util.ArrayList<java.lang.Integer>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i5, i_array4);
        java.lang.Integer[] i_array10 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i11, i_array10);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo13 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i11);
        java.util.List<java.lang.Integer> list_i14 = metaInfo13.getShardingItems();
        java.lang.String str15 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i14);
        com.dangdang.ddframe.job.context.ExecutionType executionType16 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext18 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i14, executionType16, "128.208.4.97");
        com.dangdang.ddframe.job.context.TaskContext taskContext20 = new com.dangdang.ddframe.job.context.TaskContext("b0ada993-d6e1-4910-ac71-a51c3210b1d9", (java.util.List<java.lang.Integer>) arraylist_i5, executionType16, "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!");
        java.lang.Integer[] i_array24 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i25 = new java.util.ArrayList<java.lang.Integer>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i25, i_array24);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo27 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i25);
        java.util.List<java.lang.Integer> list_i28 = metaInfo27.getShardingItems();
        java.lang.String str29 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i28);
        com.dangdang.ddframe.job.context.ExecutionType executionType30 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext32 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i28, executionType30, "128.208.4.97");
        java.lang.String str33 = taskContext32.getSlaveId();
        java.lang.String str34 = taskContext32.getId();
        com.dangdang.ddframe.job.context.ExecutionType executionType35 = taskContext32.getType();
        com.dangdang.ddframe.job.context.TaskContext taskContext36 = new com.dangdang.ddframe.job.context.TaskContext("f3d9c62c-8c49-4724-b388-fb7fcd70f041", (java.util.List<java.lang.Integer>) arraylist_i5, executionType35);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source40 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source46 = null;
        java.lang.Integer[] i_array50 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i51 = new java.util.ArrayList<java.lang.Integer>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i51, i_array50);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo53 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i51);
        java.util.List<java.lang.Integer> list_i54 = metaInfo53.getShardingItems();
        java.lang.String str55 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i54);
        com.dangdang.ddframe.job.context.ExecutionType executionType56 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext58 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i54, executionType56, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state60 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source67 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType68 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state70 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent72 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source67, executionType68, "aff97160474a056e838c1f721af01edf", state70, "");
        java.lang.String str73 = jobStatusTraceEvent72.getId();
        java.lang.String str74 = jobStatusTraceEvent72.getShardingItems();
        java.util.Date date75 = jobStatusTraceEvent72.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source79 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType80 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state82 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent84 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source79, executionType80, "aff97160474a056e838c1f721af01edf", state82, "");
        java.lang.String str85 = jobStatusTraceEvent84.getId();
        java.lang.String str86 = jobStatusTraceEvent84.getShardingItems();
        java.util.Date date87 = jobStatusTraceEvent84.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics88 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date75, date87);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent89 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source46, executionType56, "128.208.4.97", state60, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date75);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state91 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent93 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("ee6144a8-6164-451f-9e3c-e3c85113af90", "d41d8cd98f00b204e9800998ecf8427e", "720a31a1-6e31-4409-abe8-90f69964d02f", source40, executionType56, "8d4a5c91-8b38-4f21-ac3a-6f969ca8e9f7", state91, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4");
        com.dangdang.ddframe.job.context.TaskContext taskContext94 = new com.dangdang.ddframe.job.context.TaskContext("cb4f3d0d-5bea-46b8-826f-76badbb446f1", (java.util.List<java.lang.Integer>) arraylist_i5, executionType56);
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(list_i14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10" + "'", str15.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType16 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType16.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertNotNull(i_array24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(list_i28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "10" + "'", str29.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType30 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType30.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "128.208.4.97" + "'", str33.equals("128.208.4.97"));
        org.junit.Assert.assertTrue("'" + executionType35 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType35.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + source40 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER + "'", source40.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER));
        org.junit.Assert.assertNotNull(i_array50);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(list_i54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "10" + "'", str55.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType56 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType56.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state60 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state60.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "7740a1bb-9fba-45bf-b5a7-1b4b098a936c" + "'", str73.equals("7740a1bb-9fba-45bf-b5a7-1b4b098a936c"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str74.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "c8aef0e0-e46a-4dc0-90ad-df98f06d0a38" + "'", str85.equals("c8aef0e0-e46a-4dc0-90ad-df98f06d0a38"));
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str86.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertTrue("'" + state91 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED + "'", state91.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.dangdang.ddframe.job.statistics.type.job.JobTypeStatistics jobTypeStatistics3 = new com.dangdang.ddframe.job.statistics.type.job.JobTypeStatistics((int) (short) 10, (int) (byte) 100, (int) (short) 10);
        int i4 = jobTypeStatistics3.getScriptJobCount();
        int i5 = jobTypeStatistics3.getScriptJobCount();
        org.junit.Assert.assertTrue(i4 == 10);
        org.junit.Assert.assertTrue(i5 == 10);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b13 = taskContext11.equals((java.lang.Object) '#');
        com.dangdang.ddframe.job.context.ExecutionType executionType14 = taskContext11.getType();
        com.dangdang.ddframe.job.context.ExecutionType executionType15 = taskContext11.getType();
        taskContext11.setSlaveId("754a6b00-33cb-4148-ae8d-e84e632e718e");
        com.dangdang.ddframe.job.context.ExecutionType executionType18 = taskContext11.getType();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + executionType14 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType14.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + executionType15 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType15.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + executionType18 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType18.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.EnumMap<com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum, java.lang.String> enummap_jobPropertiesEnum_str0 = null;
        com.dangdang.ddframe.job.executor.handler.JobProperties jobProperties1 = new com.dangdang.ddframe.job.executor.handler.JobProperties(enummap_jobPropertiesEnum_str0);
        jobProperties1.put("8d4a5c91-8b38-4f21-ac3a-6f969ca8e9f7", "128.208.4.97");
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum5 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER;
        java.lang.String str6 = jobPropertiesEnum5.getKey();
        try {
            java.lang.String str7 = jobProperties1.get(jobPropertiesEnum5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + jobPropertiesEnum5 + "' != '" + com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER + "'", jobPropertiesEnum5.equals(com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "job_exception_handler" + "'", str6.equals("job_exception_handler"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        try {
            java.util.List<java.lang.Integer> list_i1 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemList("5d78fb68-9e44-4aba-b0db-d96a339afe5f");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval3 = com.dangdang.ddframe.job.statistics.StatisticInterval.DAY;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source21 = null;
        java.lang.Integer[] i_array25 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i26 = new java.util.ArrayList<java.lang.Integer>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i26, i_array25);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo28 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i26);
        java.util.List<java.lang.Integer> list_i29 = metaInfo28.getShardingItems();
        java.lang.String str30 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i29);
        com.dangdang.ddframe.job.context.ExecutionType executionType31 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext33 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i29, executionType31, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state35 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source42 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType43 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state45 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent47 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source42, executionType43, "aff97160474a056e838c1f721af01edf", state45, "");
        java.lang.String str48 = jobStatusTraceEvent47.getId();
        java.lang.String str49 = jobStatusTraceEvent47.getShardingItems();
        java.util.Date date50 = jobStatusTraceEvent47.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source54 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType55 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state57 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent59 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source54, executionType55, "aff97160474a056e838c1f721af01edf", state57, "");
        java.lang.String str60 = jobStatusTraceEvent59.getId();
        java.lang.String str61 = jobStatusTraceEvent59.getShardingItems();
        java.util.Date date62 = jobStatusTraceEvent59.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics63 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date50, date62);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent64 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source21, executionType31, "128.208.4.97", state35, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date50);
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics65 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics((long) (byte) 0, 1, 52, statisticInterval3, date15, date50);
        int i66 = taskResultStatistics65.getSuccessCount();
        long long67 = taskResultStatistics65.getId();
        java.util.Date date68 = taskResultStatistics65.getCreationTime();
        int i69 = taskResultStatistics65.getFailedCount();
        org.junit.Assert.assertTrue("'" + statisticInterval3 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval3.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "f0cac794-726f-47a0-8334-23ffdcb7747a" + "'", str13.equals("f0cac794-726f-47a0-8334-23ffdcb7747a"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(list_i29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "10" + "'", str30.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType31 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType31.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state35 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state35.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "94a2aaec-7393-4a4b-b1cc-add1d3f63351" + "'", str48.equals("94a2aaec-7393-4a4b-b1cc-add1d3f63351"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str49.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "7475e268-201a-4c9e-8a97-7014da588602" + "'", str60.equals("7475e268-201a-4c9e-8a97-7014da588602"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str61.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertTrue(i66 == 1);
        org.junit.Assert.assertTrue(long67 == 0L);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertTrue(i69 == 52);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType4 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent8 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source3, executionType4, "aff97160474a056e838c1f721af01edf", state6, "");
        java.util.Date date9 = jobStatusTraceEvent8.getCreationTime();
        jobStatusTraceEvent8.setOriginalTaskId("af636848-fa0f-44bc-8c02-ed5deab9094d");
        org.junit.Assert.assertNotNull(date9);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.util.Date date1 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics2 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date1);
        java.util.Date date3 = jobRunningStatistics2.getCreationTime();
        java.util.Date date4 = jobRunningStatistics2.getStatisticsTime();
        java.util.Date date5 = jobRunningStatistics2.getCreationTime();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(date5);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.dangdang.ddframe.job.statistics.type.job.JobExecutionTypeStatistics jobExecutionTypeStatistics2 = new com.dangdang.ddframe.job.statistics.type.job.JobExecutionTypeStatistics(0, (-1));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b13 = taskContext11.equals((java.lang.Object) '#');
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType14 = com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL;
        boolean b15 = taskContext11.equals((java.lang.Object) databaseType14);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo16 = taskContext11.getMetaInfo();
        java.lang.String str17 = taskContext11.toString();
        taskContext11.setIdle(true);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + databaseType14 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL + "'", databaseType14.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(metaInfo16);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.util.EnumMap<com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum, java.lang.String> enummap_jobPropertiesEnum_str0 = null;
        com.dangdang.ddframe.job.executor.handler.JobProperties jobProperties1 = new com.dangdang.ddframe.job.executor.handler.JobProperties(enummap_jobPropertiesEnum_str0);
        jobProperties1.put("8d4a5c91-8b38-4f21-ac3a-6f969ca8e9f7", "128.208.4.97");
        jobProperties1.put("08880b9a-31db-4b43-aa02-34cc46998daa", "726205c8-e1c1-494c-a055-32f7b05f3a87");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.util.Date date2 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics3 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date2);
        java.util.Date date4 = jobRunningStatistics3.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics5 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(3000, date4);
        java.util.Date date6 = jobRunningStatistics5.getStatisticsTime();
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertNotNull(date6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource2 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent4 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("3cae38aa-7ef9-49ac-8a03-3fd0876da30e", "18220525-2509-40cc-b0e7-71f957a72c51", executionSource2, (int) (short) -1);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource10 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source17 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType18 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state20 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent22 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source17, executionType18, "aff97160474a056e838c1f721af01edf", state20, "");
        java.lang.String str23 = jobStatusTraceEvent22.getId();
        java.lang.String str24 = jobStatusTraceEvent22.getShardingItems();
        java.util.Date date25 = jobStatusTraceEvent22.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source29 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType30 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state32 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent34 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source29, executionType30, "aff97160474a056e838c1f721af01edf", state32, "");
        java.lang.String str35 = jobStatusTraceEvent34.getId();
        java.lang.String str36 = jobStatusTraceEvent34.getShardingItems();
        java.util.Date date37 = jobStatusTraceEvent34.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics38 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date25, date37);
        java.util.Date date40 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics41 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date40);
        java.util.Date date42 = jobRunningStatistics41.getCreationTime();
        java.lang.Object[] obj_array47 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException48 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array47);
        java.lang.String str49 = appConfigurationException48.toString();
        java.lang.Throwable[] throwable_array50 = appConfigurationException48.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException51 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException48);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable53 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException51, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent54 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource10, (int) (byte) -1, date25, date42, false, jobExecutionEventThrowable53);
        jobExecutionEvent4.setFailureCause(jobExecutionEventThrowable53);
        java.util.Date date56 = jobExecutionEvent4.getStartTime();
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource57 = jobExecutionEvent4.getSource();
        java.lang.String str58 = jobExecutionEvent4.getJobName();
        org.junit.Assert.assertTrue("'" + executionSource2 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource2.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + executionSource10 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource10.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "3826f354-d230-4573-8de5-40daade9ef19" + "'", str23.equals("3826f354-d230-4573-8de5-40daade9ef19"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str24.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "3f088f26-286f-40ed-8362-5e2f3c332fef" + "'", str35.equals("3f088f26-286f-40ed-8362-5e2f3c332fef"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str36.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str49.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array50);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertTrue("'" + executionSource57 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource57.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "18220525-2509-40cc-b0e7-71f957a72c51" + "'", str58.equals("18220525-2509-40cc-b0e7-71f957a72c51"));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException10 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array9);
        java.lang.String str11 = appConfigurationException10.toString();
        appConfigurationException4.addSuppressed((java.lang.Throwable) appConfigurationException10);
        com.dangdang.ddframe.job.reg.exception.RegException regException13 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException10);
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException14 = new com.dangdang.ddframe.job.exception.AppConfigurationException((java.lang.Throwable) appConfigurationException10);
        com.dangdang.ddframe.job.reg.exception.RegException regException15 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException14);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Throwable[] throwable_array6 = appConfigurationException4.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException7 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException4);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException12 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array11);
        java.lang.String str13 = appConfigurationException12.toString();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException18 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array17);
        java.lang.String str19 = appConfigurationException18.toString();
        appConfigurationException12.addSuppressed((java.lang.Throwable) appConfigurationException18);
        com.dangdang.ddframe.job.reg.exception.RegException regException21 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException18);
        appConfigurationException4.addSuppressed((java.lang.Throwable) regException21);
        java.lang.String str23 = regException21.toString();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str13.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str19.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "com.dangdang.ddframe.job.reg.exception.RegException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str23.equals("com.dangdang.ddframe.job.reg.exception.RegException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        int i5 = zookeeperConfiguration2.getMaxSleepTimeMilliseconds();
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds((int) ' ');
        org.junit.Assert.assertTrue(i5 == 3000);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.util.EnumMap<com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum, java.lang.String> enummap_jobPropertiesEnum_str0 = null;
        com.dangdang.ddframe.job.executor.handler.JobProperties jobProperties1 = new com.dangdang.ddframe.job.executor.handler.JobProperties(enummap_jobPropertiesEnum_str0);
        jobProperties1.put("8d4a5c91-8b38-4f21-ac3a-6f969ca8e9f7", "128.208.4.97");
        jobProperties1.put("ecc20b57-52a5-4026-b6c0-d9395b02f7cf", "b5641ed9-7f00-42b8-84fe-ed93ebeac240");
        jobProperties1.put("bicycle.cs.washington.edu", "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum11 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER;
        java.lang.String str12 = jobPropertiesEnum11.getDefaultValue();
        try {
            java.lang.String str13 = jobProperties1.get(jobPropertiesEnum11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + jobPropertiesEnum11 + "' != '" + com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER + "'", jobPropertiesEnum11.equals(com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "com.dangdang.ddframe.job.executor.handler.impl.DefaultExecutorServiceHandler" + "'", str12.equals("com.dangdang.ddframe.job.executor.handler.impl.DefaultExecutorServiceHandler"));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.util.Date date13 = jobStatusTraceEvent12.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource16 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent18 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("3cae38aa-7ef9-49ac-8a03-3fd0876da30e", "18220525-2509-40cc-b0e7-71f957a72c51", executionSource16, (int) (short) -1);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource24 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source31 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType32 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state34 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent36 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source31, executionType32, "aff97160474a056e838c1f721af01edf", state34, "");
        java.lang.String str37 = jobStatusTraceEvent36.getId();
        java.lang.String str38 = jobStatusTraceEvent36.getShardingItems();
        java.util.Date date39 = jobStatusTraceEvent36.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source43 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType44 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state46 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent48 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source43, executionType44, "aff97160474a056e838c1f721af01edf", state46, "");
        java.lang.String str49 = jobStatusTraceEvent48.getId();
        java.lang.String str50 = jobStatusTraceEvent48.getShardingItems();
        java.util.Date date51 = jobStatusTraceEvent48.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date39, date51);
        java.util.Date date54 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics55 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date54);
        java.util.Date date56 = jobRunningStatistics55.getCreationTime();
        java.lang.Object[] obj_array61 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException62 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array61);
        java.lang.String str63 = appConfigurationException62.toString();
        java.lang.Throwable[] throwable_array64 = appConfigurationException62.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException65 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException62);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable67 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException65, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent68 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource24, (int) (byte) -1, date39, date56, false, jobExecutionEventThrowable67);
        jobExecutionEvent18.setFailureCause(jobExecutionEventThrowable67);
        java.util.Date date70 = jobExecutionEvent18.getStartTime();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj71 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition72 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition(52, (int) (byte) 10, "d0cc04e7-efe9-4167-a154-8b65210ed06d", "bicycle.cs.washington.edu", date13, date70, map_str_obj71);
        java.util.Date date73 = condition72.getStartTime();
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertTrue("'" + executionSource16 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource16.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + executionSource24 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource24.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "019b614a-5070-4388-bac8-fa5db7734d0e" + "'", str37.equals("019b614a-5070-4388-bac8-fa5db7734d0e"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str38.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "e051dcf4-8073-44b1-aa8e-85ad7ee35396" + "'", str49.equals("e051dcf4-8073-44b1-aa8e-85ad7ee35396"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str50.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str63.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array64);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertNotNull(date73);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder7.failover(true);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration10 = builder7.build();
        java.lang.String str11 = jobCoreConfiguration10.getCron();
        int i12 = jobCoreConfiguration10.getShardingTotalCount();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(jobCoreConfiguration10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str11.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue(i12 == 52);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("-1,1,10", "d0be6b2b-9c52-490d-b882-bc3fca29f622");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter3 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            long long5 = zookeeperRegistryCenter3.getRegistryCenterTime("c4602f1c-559d-421e-9889-5b0bd8b989f1");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException10 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array9);
        java.lang.String str11 = appConfigurationException10.toString();
        appConfigurationException4.addSuppressed((java.lang.Throwable) appConfigurationException10);
        java.lang.Throwable throwable13 = null;
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException14 = new com.dangdang.ddframe.job.exception.JobSystemException(throwable13);
        appConfigurationException4.addSuppressed((java.lang.Throwable) jobSystemException14);
        java.lang.String str16 = com.dangdang.ddframe.job.exception.ExceptionUtil.transform((java.lang.Throwable) jobSystemException14);
        java.lang.Throwable throwable17 = null;
        try {
            jobSystemException14.addSuppressed(throwable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "com.dangdang.ddframe.job.exception.JobSystemException\n\tat sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n" + "'", str16.equals("com.dangdang.ddframe.job.exception.JobSystemException\n\tat sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n"));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        java.lang.String str19 = condition18.getOrder();
        java.lang.String str20 = condition18.getSort();
        int i21 = condition18.getPage();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "d482b74b-bd4e-454d-b34f-6ceb3d5f9f0d" + "'", str13.equals("d482b74b-bd4e-454d-b34f-6ceb3d5f9f0d"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ecc20b57-52a5-4026-b6c0-d9395b02f7cf" + "'", str19.equals("ecc20b57-52a5-4026-b6c0-d9395b02f7cf"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str20.equals("76790358-3199-4060-a536-0f953a59b404"));
        org.junit.Assert.assertTrue(i21 == 100);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.dangdang.ddframe.job.statistics.type.job.JobExecutionTypeStatistics jobExecutionTypeStatistics2 = new com.dangdang.ddframe.job.statistics.type.job.JobExecutionTypeStatistics((int) 'a', (int) (short) 1);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.lang.Object[] obj_array1 = new java.lang.Object[] {};
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException2 = new com.dangdang.ddframe.job.exception.JobSystemException("e4d15e1a-97fe-46bb-b675-2bf9bbd22023", obj_array1);
        com.dangdang.ddframe.job.exception.JobStatisticException jobStatisticException3 = new com.dangdang.ddframe.job.exception.JobStatisticException((java.lang.Exception) jobSystemException2);
        org.junit.Assert.assertNotNull(obj_array1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.util.List<java.lang.Integer> list_i8 = metaInfo6.getShardingItems();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source18 = null;
        java.lang.Integer[] i_array22 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i23 = new java.util.ArrayList<java.lang.Integer>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i23, i_array22);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo25 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i23);
        java.util.List<java.lang.Integer> list_i26 = metaInfo25.getShardingItems();
        java.lang.String str27 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i26);
        com.dangdang.ddframe.job.context.ExecutionType executionType28 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext30 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i26, executionType28, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state32 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source39 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType40 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state42 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent44 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source39, executionType40, "aff97160474a056e838c1f721af01edf", state42, "");
        java.lang.String str45 = jobStatusTraceEvent44.getId();
        java.lang.String str46 = jobStatusTraceEvent44.getShardingItems();
        java.util.Date date47 = jobStatusTraceEvent44.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source51 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType52 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state54 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent56 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source51, executionType52, "aff97160474a056e838c1f721af01edf", state54, "");
        java.lang.String str57 = jobStatusTraceEvent56.getId();
        java.lang.String str58 = jobStatusTraceEvent56.getShardingItems();
        java.util.Date date59 = jobStatusTraceEvent56.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics60 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date47, date59);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent61 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source18, executionType28, "128.208.4.97", state32, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date47);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state63 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent65 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("ee6144a8-6164-451f-9e3c-e3c85113af90", "d41d8cd98f00b204e9800998ecf8427e", "720a31a1-6e31-4409-abe8-90f69964d02f", source12, executionType28, "8d4a5c91-8b38-4f21-ac3a-6f969ca8e9f7", state63, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4");
        com.dangdang.ddframe.job.context.TaskContext taskContext67 = new com.dangdang.ddframe.job.context.TaskContext("a39dffc1-a1d1-44bb-b4f1-7fadc6c31063", list_i8, executionType28, "25f20532-5037-498d-a89d-07cd1c6006bc");
        taskContext67.setSlaveId("0c9bb7cc-29ec-4797-92df-238f1fe42cce");
        taskContext67.setSlaveId("189a2956-d0a1-438d-8de0-3af6c8f2dfac");
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertNotNull(list_i8);
        org.junit.Assert.assertTrue("'" + source12 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER + "'", source12.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER));
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(list_i26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10" + "'", str27.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType28 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType28.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state32 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state32.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "fccb6138-9ca2-46ae-a885-5127519679fa" + "'", str45.equals("fccb6138-9ca2-46ae-a885-5127519679fa"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str46.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "d60b6f94-a1e8-4258-bd84-bc12871ec14e" + "'", str57.equals("d60b6f94-a1e8-4258-bd84-bc12871ec14e"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str58.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertTrue("'" + state63 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED + "'", state63.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("ee6144a8-6164-451f-9e3c-e3c85113af90", "", (int) ' ', "b7b819a3-db6c-4320-bc54-2c4af886020f", map_i_str4, (int) (byte) 100);
        boolean b7 = shardingContexts6.isAllowSendJobEvent();
        java.lang.String str8 = shardingContexts6.getJobParameter();
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "b7b819a3-db6c-4320-bc54-2c4af886020f" + "'", str8.equals("b7b819a3-db6c-4320-bc54-2c4af886020f"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.dangdang.ddframe.job.executor.handler.ExecutorServiceHandlerRegistry.remove("9a50607d-a4e8-4c75-b7b0-9a37a0bcd871");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException59 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array58);
        java.lang.String str60 = appConfigurationException59.toString();
        java.lang.Throwable[] throwable_array61 = appConfigurationException59.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException62 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent63 = jobExecutionEvent49.executionFailure((java.lang.Throwable) appConfigurationException59);
        java.lang.Object[] obj_array67 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException68 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array67);
        java.lang.String str69 = appConfigurationException68.toString();
        com.dangdang.ddframe.job.exception.JobStatisticException jobStatisticException70 = new com.dangdang.ddframe.job.exception.JobStatisticException((java.lang.Exception) appConfigurationException68);
        java.lang.String str71 = com.dangdang.ddframe.job.exception.ExceptionUtil.transform((java.lang.Throwable) appConfigurationException68);
        appConfigurationException59.addSuppressed((java.lang.Throwable) appConfigurationException68);
        java.lang.Throwable[] throwable_array73 = appConfigurationException68.getSuppressed();
        try {
            com.dangdang.ddframe.job.reg.exception.RegExceptionHandler.handleException((java.lang.Exception) appConfigurationException68);
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "499f339a-96e4-45cc-be6e-c623ac4c8315" + "'", str18.equals("499f339a-96e4-45cc-be6e-c623ac4c8315"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "3777efc6-2236-4aa6-ae82-6dcc9c969726" + "'", str30.equals("3777efc6-2236-4aa6-ae82-6dcc9c969726"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str60.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(jobExecutionEvent63);
        org.junit.Assert.assertNotNull(obj_array67);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str69.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n" + "'", str71.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n"));
        org.junit.Assert.assertNotNull(throwable_array73);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException59 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array58);
        java.lang.String str60 = appConfigurationException59.toString();
        java.lang.Throwable[] throwable_array61 = appConfigurationException59.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException62 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent63 = jobExecutionEvent49.executionFailure((java.lang.Throwable) appConfigurationException59);
        java.lang.String str64 = jobExecutionEvent63.getFailureCause();
        java.lang.String str65 = jobExecutionEvent63.getId();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "e15e1a13-aa33-41d6-9d45-cffd4558c51a" + "'", str18.equals("e15e1a13-aa33-41d6-9d45-cffd4558c51a"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "974d5641-92bd-40ad-bf30-959854075fc7" + "'", str30.equals("974d5641-92bd-40ad-bf30-959854075fc7"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str60.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(jobExecutionEvent63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n" + "'", str64.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "754a6b00-33cb-4148-ae8d-e84e632e718e" + "'", str65.equals("754a6b00-33cb-4148-ae8d-e84e632e718e"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        org.apache.curator.framework.CuratorFramework curatorFramework6 = zookeeperRegistryCenter5.getClient();
        try {
            java.lang.String str9 = zookeeperRegistryCenter5.persistSequential("845a6b89-4321-431d-b9af-62c3463576ab", "7841ca80-4b0f-43e8-b5ef-a398b52d6bf4");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertNull(curatorFramework6);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("22f408e9-cb1a-482c-9330-8c6ee4df73b5", "69633ce5-173d-4a66-8ece-249d445841bd");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.util.Date date4 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics5 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date4);
        java.util.Date date6 = jobRunningStatistics5.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics7 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(3000, date6);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source14 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state17 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent19 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source14, executionType15, "aff97160474a056e838c1f721af01edf", state17, "");
        java.lang.String str20 = jobStatusTraceEvent19.getId();
        java.lang.String str21 = jobStatusTraceEvent19.getShardingItems();
        java.util.Date date22 = jobStatusTraceEvent19.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source26 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state29 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent31 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source26, executionType27, "aff97160474a056e838c1f721af01edf", state29, "");
        java.lang.String str32 = jobStatusTraceEvent31.getId();
        java.lang.String str33 = jobStatusTraceEvent31.getShardingItems();
        java.util.Date date34 = jobStatusTraceEvent31.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics35 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date22, date34);
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics((int) ' ', date34);
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics37 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics((long) (byte) 0, 0, date6, date34);
        int i38 = jobRunningStatistics37.getRunningCount();
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "01c721d0-a754-432f-937e-082597b63045" + "'", str20.equals("01c721d0-a754-432f-937e-082597b63045"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str21.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "774bbf2b-b79d-49ef-8c8f-e0bc053613ee" + "'", str32.equals("774bbf2b-b79d-49ef-8c8f-e0bc053613ee"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str33.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertTrue(i38 == 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.util.Date date2 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics3 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date2);
        java.util.Date date4 = jobRunningStatistics3.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics5 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(10, date4);
        org.junit.Assert.assertNotNull(date4);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "f2da3452-ca49-4b9e-8e6a-53b0b3ca8c6c", (int) (byte) 10, "-1,1,10", map_i_str4, (int) (short) 1);
        java.lang.String str7 = shardingContexts6.getTaskId();
        java.lang.String str8 = shardingContexts6.getJobParameter();
        int i9 = shardingContexts6.getShardingTotalCount();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1,1,10" + "'", str8.equals("-1,1,10"));
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Throwable[] throwable_array6 = appConfigurationException4.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException7 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException4);
        java.lang.Object[] obj_array11 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException12 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array11);
        java.lang.String str13 = appConfigurationException12.toString();
        java.lang.Object[] obj_array17 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException18 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array17);
        java.lang.String str19 = appConfigurationException18.toString();
        appConfigurationException12.addSuppressed((java.lang.Throwable) appConfigurationException18);
        com.dangdang.ddframe.job.reg.exception.RegException regException21 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException18);
        appConfigurationException4.addSuppressed((java.lang.Throwable) regException21);
        com.dangdang.ddframe.job.reg.exception.RegException regException23 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException4);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array6);
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str13.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str19.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException10 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array9);
        java.lang.String str11 = appConfigurationException10.toString();
        appConfigurationException4.addSuppressed((java.lang.Throwable) appConfigurationException10);
        com.dangdang.ddframe.job.reg.exception.RegException regException13 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException10);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException18 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array17);
        java.lang.String str19 = appConfigurationException18.toString();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException24 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array23);
        java.lang.String str25 = appConfigurationException24.toString();
        appConfigurationException18.addSuppressed((java.lang.Throwable) appConfigurationException24);
        java.lang.Throwable throwable27 = null;
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException28 = new com.dangdang.ddframe.job.exception.JobSystemException(throwable27);
        appConfigurationException18.addSuppressed((java.lang.Throwable) jobSystemException28);
        com.dangdang.ddframe.job.event.JobEventListenerConfigurationException jobEventListenerConfigurationException30 = new com.dangdang.ddframe.job.event.JobEventListenerConfigurationException((java.lang.Exception) appConfigurationException18);
        appConfigurationException10.addSuppressed((java.lang.Throwable) jobEventListenerConfigurationException30);
        com.dangdang.ddframe.job.exception.JobStatisticException jobStatisticException32 = new com.dangdang.ddframe.job.exception.JobStatisticException((java.lang.Exception) jobEventListenerConfigurationException30);
        com.dangdang.ddframe.job.reg.exception.RegException regException33 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) jobStatisticException32);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str19.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str25.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("191e3dba-5219-488f-a542-de472590af14", "56cc9c85-36c8-41c8-b44e-0c702201d76e", (int) (short) 10);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("", "42e13076-c83b-423f-b734-65033ace3c11");
        int i3 = zookeeperConfiguration2.getSessionTimeoutMilliseconds();
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n");
        zookeeperConfiguration2.setSessionTimeoutMilliseconds((int) (short) 100);
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds(1);
        int i7 = zookeeperConfiguration2.getMaxRetries();
        org.junit.Assert.assertTrue(i7 == 3);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i10 = new java.util.ArrayList<java.lang.Integer>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i10, i_array9);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo12 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i10);
        java.util.List<java.lang.Integer> list_i13 = metaInfo12.getShardingItems();
        java.lang.String str14 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i13);
        com.dangdang.ddframe.job.context.ExecutionType executionType15 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext17 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i13, executionType15, "128.208.4.97");
        com.dangdang.ddframe.job.context.TaskContext taskContext19 = new com.dangdang.ddframe.job.context.TaskContext("b0ada993-d6e1-4910-ac71-a51c3210b1d9", (java.util.List<java.lang.Integer>) arraylist_i4, executionType15, "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!");
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i24 = new java.util.ArrayList<java.lang.Integer>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i24, i_array23);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo26 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i24);
        java.util.List<java.lang.Integer> list_i27 = metaInfo26.getShardingItems();
        java.lang.String str28 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i27);
        com.dangdang.ddframe.job.context.ExecutionType executionType29 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext31 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i27, executionType29, "128.208.4.97");
        java.lang.String str32 = taskContext31.getSlaveId();
        java.lang.String str33 = taskContext31.getId();
        com.dangdang.ddframe.job.context.ExecutionType executionType34 = taskContext31.getType();
        com.dangdang.ddframe.job.context.TaskContext taskContext35 = new com.dangdang.ddframe.job.context.TaskContext("f3d9c62c-8c49-4724-b388-fb7fcd70f041", (java.util.List<java.lang.Integer>) arraylist_i4, executionType34);
        java.lang.String str36 = taskContext35.getId();
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo37 = taskContext35.getMetaInfo();
        java.util.List<java.lang.Integer> list_i38 = metaInfo37.getShardingItems();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(list_i13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10" + "'", str14.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType15 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType15.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(list_i27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10" + "'", str28.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType29 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType29.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "128.208.4.97" + "'", str32.equals("128.208.4.97"));
        org.junit.Assert.assertTrue("'" + executionType34 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType34.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertNotNull(metaInfo37);
        org.junit.Assert.assertNotNull(list_i38);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        try {
            com.dangdang.ddframe.job.context.TaskContext taskContext1 = com.dangdang.ddframe.job.context.TaskContext.from("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        java.lang.String str6 = zookeeperConfiguration2.getNamespace();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1,1,10" + "'", str6.equals("-1,1,10"));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.lang.String str50 = jobExecutionEvent49.getIp();
        java.lang.String str51 = jobExecutionEvent49.getTaskId();
        java.util.Date date52 = jobExecutionEvent49.getStartTime();
        java.util.Date date53 = jobExecutionEvent49.getStartTime();
        boolean b54 = jobExecutionEvent49.isSuccess();
        java.lang.String str55 = jobExecutionEvent49.getTaskId();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "2bfdff9a-6352-477f-818d-b82e3428edc1" + "'", str18.equals("2bfdff9a-6352-477f-818d-b82e3428edc1"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "f4623c25-7053-4d0f-8f30-d81d9f0b7f6e" + "'", str30.equals("f4623c25-7053-4d0f-8f30-d81d9f0b7f6e"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "3ad58490-9ea0-4425-8b19-6ce5272f2ca4" + "'", str50.equals("3ad58490-9ea0-4425-8b19-6ce5272f2ca4"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "128.208.4.97" + "'", str51.equals("128.208.4.97"));
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "128.208.4.97" + "'", str55.equals("128.208.4.97"));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.lang.Integer[] i_array10 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i11, i_array10);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo13 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i11);
        java.util.List<java.lang.Integer> list_i14 = metaInfo13.getShardingItems();
        java.lang.String str15 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i14);
        com.dangdang.ddframe.job.context.ExecutionType executionType16 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext18 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i14, executionType16, "128.208.4.97");
        java.lang.String str19 = taskContext18.getSlaveId();
        java.lang.String str20 = taskContext18.getId();
        com.dangdang.ddframe.job.context.ExecutionType executionType21 = taskContext18.getType();
        com.dangdang.ddframe.job.context.TaskContext taskContext23 = new com.dangdang.ddframe.job.context.TaskContext("4a518b76-dcbb-4f5d-bd11-01ea0c364140", (java.util.List<java.lang.Integer>) arraylist_i4, executionType21, "ee6144a8-6164-451f-9e3c-e3c85113af90");
        java.lang.String str24 = taskContext23.getSlaveId();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(list_i14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10" + "'", str15.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType16 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType16.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "128.208.4.97" + "'", str19.equals("128.208.4.97"));
        org.junit.Assert.assertTrue("'" + executionType21 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType21.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "ee6144a8-6164-451f-9e3c-e3c85113af90" + "'", str24.equals("ee6144a8-6164-451f-9e3c-e3c85113af90"));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source5 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent10 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source5, executionType6, "aff97160474a056e838c1f721af01edf", state8, "");
        java.lang.String str11 = jobStatusTraceEvent10.getId();
        java.lang.String str12 = jobStatusTraceEvent10.getSlaveId();
        java.lang.String str13 = jobStatusTraceEvent10.getShardingItems();
        java.util.Date date14 = jobStatusTraceEvent10.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source18 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType19 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state21 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent23 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source18, executionType19, "aff97160474a056e838c1f721af01edf", state21, "");
        java.lang.String str24 = jobStatusTraceEvent23.getId();
        java.lang.String str25 = jobStatusTraceEvent23.getSlaveId();
        java.lang.String str26 = jobStatusTraceEvent23.getShardingItems();
        java.util.Date date27 = jobStatusTraceEvent23.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics28 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) (byte) 10, 1, date14, date27);
        java.util.Date date29 = taskRunningStatistics28.getCreationTime();
        int i30 = taskRunningStatistics28.getRunningCount();
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "e79a7b84-d2b1-4d13-9461-78ec3539c241" + "'", str11.equals("e79a7b84-d2b1-4d13-9461-78ec3539c241"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str12.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str13.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "78ace5c9-bcef-4c58-8a9b-3008e26f3c61" + "'", str24.equals("78ace5c9-bcef-4c58-8a9b-3008e26f3c61"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str25.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str26.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertTrue(i30 == 1);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.util.Date date13 = jobStatusTraceEvent12.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource16 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent18 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("3cae38aa-7ef9-49ac-8a03-3fd0876da30e", "18220525-2509-40cc-b0e7-71f957a72c51", executionSource16, (int) (short) -1);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource24 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source31 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType32 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state34 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent36 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source31, executionType32, "aff97160474a056e838c1f721af01edf", state34, "");
        java.lang.String str37 = jobStatusTraceEvent36.getId();
        java.lang.String str38 = jobStatusTraceEvent36.getShardingItems();
        java.util.Date date39 = jobStatusTraceEvent36.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source43 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType44 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state46 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent48 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source43, executionType44, "aff97160474a056e838c1f721af01edf", state46, "");
        java.lang.String str49 = jobStatusTraceEvent48.getId();
        java.lang.String str50 = jobStatusTraceEvent48.getShardingItems();
        java.util.Date date51 = jobStatusTraceEvent48.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date39, date51);
        java.util.Date date54 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics55 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date54);
        java.util.Date date56 = jobRunningStatistics55.getCreationTime();
        java.lang.Object[] obj_array61 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException62 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array61);
        java.lang.String str63 = appConfigurationException62.toString();
        java.lang.Throwable[] throwable_array64 = appConfigurationException62.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException65 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException62);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable67 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException65, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent68 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource24, (int) (byte) -1, date39, date56, false, jobExecutionEventThrowable67);
        jobExecutionEvent18.setFailureCause(jobExecutionEventThrowable67);
        java.util.Date date70 = jobExecutionEvent18.getStartTime();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj71 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition72 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition(52, (int) (byte) 10, "d0cc04e7-efe9-4167-a154-8b65210ed06d", "bicycle.cs.washington.edu", date13, date70, map_str_obj71);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj73 = condition72.getFields();
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertTrue("'" + executionSource16 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource16.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + executionSource24 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource24.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "37fb2e73-cb60-4677-aa1b-435176fc2ed5" + "'", str37.equals("37fb2e73-cb60-4677-aa1b-435176fc2ed5"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str38.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "6fce50af-718e-4ad7-89b0-b7f6939f16bb" + "'", str49.equals("6fce50af-718e-4ad7-89b0-b7f6939f16bb"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str50.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str63.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array64);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertNull(map_str_obj73);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        try {
            com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType1 = com.dangdang.ddframe.job.event.rdb.DatabaseType.valueFrom("42f86f65-3990-4a20-9483-cda0b7c7332a");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        try {
            com.dangdang.ddframe.job.util.config.ShardingItemParameters shardingItemParameters1 = new com.dangdang.ddframe.job.util.config.ShardingItemParameters("3cae38aa-7ef9-49ac-8a03-3fd0876da30e");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.exception.JobConfigurationException");
        } catch (com.dangdang.ddframe.job.exception.JobConfigurationException e) {
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration0 = null;
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration3 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration0, "", true);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration4 = dataflowJobConfiguration3.getCoreConfig();
        org.junit.Assert.assertNull(jobCoreConfiguration4);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("-1,1,10", "d0be6b2b-9c52-490d-b882-bc3fca29f622");
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds((int) (short) 0);
        zookeeperConfiguration2.setSessionTimeoutMilliseconds((int) (short) 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType4 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent8 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source3, executionType4, "aff97160474a056e838c1f721af01edf", state6, "");
        java.lang.String str9 = jobStatusTraceEvent8.getId();
        java.lang.String str10 = jobStatusTraceEvent8.getId();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state11 = jobStatusTraceEvent8.getState();
        java.lang.String str12 = jobStatusTraceEvent8.getTaskId();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "c31f3a82-dddc-47a8-881f-49ae080b8d00" + "'", str9.equals("c31f3a82-dddc-47a8-881f-49ae080b8d00"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "c31f3a82-dddc-47a8-881f-49ae080b8d00" + "'", str10.equals("c31f3a82-dddc-47a8-881f-49ae080b8d00"));
        org.junit.Assert.assertNull(state11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i10 = new java.util.ArrayList<java.lang.Integer>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i10, i_array9);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo12 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i10);
        java.util.List<java.lang.Integer> list_i13 = metaInfo12.getShardingItems();
        java.lang.String str14 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i13);
        com.dangdang.ddframe.job.context.ExecutionType executionType15 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext17 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i13, executionType15, "128.208.4.97");
        com.dangdang.ddframe.job.context.TaskContext taskContext19 = new com.dangdang.ddframe.job.context.TaskContext("b0ada993-d6e1-4910-ac71-a51c3210b1d9", (java.util.List<java.lang.Integer>) arraylist_i4, executionType15, "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!");
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i24 = new java.util.ArrayList<java.lang.Integer>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i24, i_array23);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo26 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i24);
        java.util.List<java.lang.Integer> list_i27 = metaInfo26.getShardingItems();
        java.lang.String str28 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i27);
        com.dangdang.ddframe.job.context.ExecutionType executionType29 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext31 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i27, executionType29, "128.208.4.97");
        java.lang.String str32 = taskContext31.getSlaveId();
        java.lang.String str33 = taskContext31.getId();
        com.dangdang.ddframe.job.context.ExecutionType executionType34 = taskContext31.getType();
        com.dangdang.ddframe.job.context.TaskContext taskContext35 = new com.dangdang.ddframe.job.context.TaskContext("f3d9c62c-8c49-4724-b388-fb7fcd70f041", (java.util.List<java.lang.Integer>) arraylist_i4, executionType34);
        java.lang.String str36 = taskContext35.getTaskName();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(list_i13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10" + "'", str14.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType15 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType15.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(list_i27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10" + "'", str28.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType29 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType29.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "128.208.4.97" + "'", str32.equals("128.208.4.97"));
        org.junit.Assert.assertTrue("'" + executionType34 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType34.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.lang.Object[] obj_array2 = new java.lang.Object[] {};
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException3 = new com.dangdang.ddframe.job.exception.JobSystemException("e4d15e1a-97fe-46bb-b675-2bf9bbd22023", obj_array2);
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("c7f580c8-6c4b-4c2e-804c-cb22ad84db15", obj_array2);
        com.dangdang.ddframe.job.event.JobEventListenerConfigurationException jobEventListenerConfigurationException5 = new com.dangdang.ddframe.job.event.JobEventListenerConfigurationException((java.lang.Exception) appConfigurationException4);
        java.lang.Throwable[] throwable_array6 = jobEventListenerConfigurationException5.getSuppressed();
        org.junit.Assert.assertNotNull(obj_array2);
        org.junit.Assert.assertNotNull(throwable_array6);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.util.Date date2 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics3 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date2);
        java.util.Date date4 = jobRunningStatistics3.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics5 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics(1, date4);
        int i6 = taskRunningStatistics5.getRunningCount();
        java.util.Date date7 = taskRunningStatistics5.getCreationTime();
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(date7);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder7.failover(true);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder12 = builder7.jobProperties("cba65191-7ae2-4f20-a64e-df6a36bea71e", "c0c39b53-c62a-4bca-91af-ffd8f43e1d75");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.util.Date date2 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics3 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date2);
        java.util.Date date4 = jobRunningStatistics3.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics5 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(3000, date4);
        long long6 = jobRunningStatistics5.getId();
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertTrue(long6 == 0L);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        org.apache.curator.framework.CuratorFramework curatorFramework6 = zookeeperRegistryCenter5.getClient();
        zookeeperRegistryCenter5.close();
        org.junit.Assert.assertNull(curatorFramework6);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.dangdang.ddframe.job.event.rdb.JobEventRdbIdentity jobEventRdbIdentity0 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbIdentity();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException59 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array58);
        java.lang.String str60 = appConfigurationException59.toString();
        java.lang.Throwable[] throwable_array61 = appConfigurationException59.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException62 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent63 = jobExecutionEvent49.executionFailure((java.lang.Throwable) appConfigurationException59);
        java.util.Date date64 = jobExecutionEvent63.getStartTime();
        java.lang.String str65 = jobExecutionEvent63.getTaskId();
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent66 = jobExecutionEvent63.executionSuccess();
        java.lang.String str67 = jobExecutionEvent66.getIp();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "034dd3a2-12f0-464b-a6c0-19e17690f584" + "'", str18.equals("034dd3a2-12f0-464b-a6c0-19e17690f584"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "84c79347-e3aa-4814-a72d-875e1208cc22" + "'", str30.equals("84c79347-e3aa-4814-a72d-875e1208cc22"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str60.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(jobExecutionEvent63);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "128.208.4.97" + "'", str65.equals("128.208.4.97"));
        org.junit.Assert.assertNotNull(jobExecutionEvent66);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "3ad58490-9ea0-4425-8b19-6ce5272f2ca4" + "'", str67.equals("3ad58490-9ea0-4425-8b19-6ce5272f2ca4"));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        try {
            java.util.List<java.lang.Integer> list_i1 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemList("5ec17d8d-269d-47ed-bc76-296e6a4c1269");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException10 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array9);
        java.lang.String str11 = appConfigurationException10.toString();
        appConfigurationException4.addSuppressed((java.lang.Throwable) appConfigurationException10);
        com.dangdang.ddframe.job.reg.exception.RegException regException13 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException10);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException18 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array17);
        java.lang.String str19 = appConfigurationException18.toString();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException24 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array23);
        java.lang.String str25 = appConfigurationException24.toString();
        appConfigurationException18.addSuppressed((java.lang.Throwable) appConfigurationException24);
        java.lang.Throwable throwable27 = null;
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException28 = new com.dangdang.ddframe.job.exception.JobSystemException(throwable27);
        appConfigurationException18.addSuppressed((java.lang.Throwable) jobSystemException28);
        com.dangdang.ddframe.job.event.JobEventListenerConfigurationException jobEventListenerConfigurationException30 = new com.dangdang.ddframe.job.event.JobEventListenerConfigurationException((java.lang.Exception) appConfigurationException18);
        appConfigurationException10.addSuppressed((java.lang.Throwable) jobEventListenerConfigurationException30);
        java.lang.Throwable[] throwable_array32 = jobEventListenerConfigurationException30.getSuppressed();
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str19.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str25.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array32);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.util.Date date6 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics7 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date6);
        java.util.Date date8 = jobRunningStatistics7.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics9 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(3000, date8);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source16 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType17 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state19 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent21 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source16, executionType17, "aff97160474a056e838c1f721af01edf", state19, "");
        java.lang.String str22 = jobStatusTraceEvent21.getId();
        java.lang.String str23 = jobStatusTraceEvent21.getShardingItems();
        java.util.Date date24 = jobStatusTraceEvent21.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source28 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType29 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state31 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent33 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source28, executionType29, "aff97160474a056e838c1f721af01edf", state31, "");
        java.lang.String str34 = jobStatusTraceEvent33.getId();
        java.lang.String str35 = jobStatusTraceEvent33.getShardingItems();
        java.util.Date date36 = jobStatusTraceEvent33.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics37 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date24, date36);
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics38 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics((int) ' ', date36);
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics39 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics((long) (byte) 0, 0, date8, date36);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source45 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType46 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state48 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent50 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source45, executionType46, "aff97160474a056e838c1f721af01edf", state48, "");
        java.lang.String str51 = jobStatusTraceEvent50.getId();
        java.lang.String str52 = jobStatusTraceEvent50.getSlaveId();
        java.lang.String str53 = jobStatusTraceEvent50.getShardingItems();
        java.util.Date date54 = jobStatusTraceEvent50.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source58 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType59 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state61 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent63 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source58, executionType59, "aff97160474a056e838c1f721af01edf", state61, "");
        java.lang.String str64 = jobStatusTraceEvent63.getId();
        java.lang.String str65 = jobStatusTraceEvent63.getSlaveId();
        java.lang.String str66 = jobStatusTraceEvent63.getShardingItems();
        java.util.Date date67 = jobStatusTraceEvent63.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics68 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) (byte) 10, 1, date54, date67);
        int i69 = taskRunningStatistics68.getRunningCount();
        java.util.Date date70 = taskRunningStatistics68.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics jobRegisterStatistics71 = new com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics(1524344252013L, (int) (byte) 1, date8, date70);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "889de2aa-8f8e-4bc9-950a-0d0806d830b1" + "'", str22.equals("889de2aa-8f8e-4bc9-950a-0d0806d830b1"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str23.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "7fbc1859-4957-407f-a004-c4094ebd1e47" + "'", str34.equals("7fbc1859-4957-407f-a004-c4094ebd1e47"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str35.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "5174b9c6-e229-43ed-949c-52c244f57e09" + "'", str51.equals("5174b9c6-e229-43ed-949c-52c244f57e09"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str52.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str53.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "4394c184-a66d-45f8-9790-227d4615fa50" + "'", str64.equals("4394c184-a66d-45f8-9790-227d4615fa50"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str65.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str66.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertTrue(i69 == 1);
        org.junit.Assert.assertNotNull(date70);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo1 = com.dangdang.ddframe.job.context.TaskContext.MetaInfo.from("845a6b89-4321-431d-b9af-62c3463576ab");
        org.junit.Assert.assertNotNull(metaInfo1);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        com.dangdang.ddframe.job.event.JobEventListenerConfigurationException jobEventListenerConfigurationException5 = new com.dangdang.ddframe.job.event.JobEventListenerConfigurationException((java.lang.Exception) appConfigurationException4);
        org.junit.Assert.assertNotNull(obj_array3);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder7.failover(true);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration10 = builder7.build();
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder12 = builder7.failover(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(jobCoreConfiguration10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        java.util.Date date19 = condition18.getStartTime();
        java.util.Date date20 = condition18.getStartTime();
        java.util.Date date21 = condition18.getEndTime();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "b69779e5-06ec-481e-8659-f2741e9c78be" + "'", str13.equals("b69779e5-06ec-481e-8659-f2741e9c78be"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval4 = com.dangdang.ddframe.job.statistics.StatisticInterval.DAY;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source8 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state11 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent13 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source8, executionType9, "aff97160474a056e838c1f721af01edf", state11, "");
        java.lang.String str14 = jobStatusTraceEvent13.getId();
        java.lang.String str15 = jobStatusTraceEvent13.getShardingItems();
        java.util.Date date16 = jobStatusTraceEvent13.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source22 = null;
        java.lang.Integer[] i_array26 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i27 = new java.util.ArrayList<java.lang.Integer>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i27, i_array26);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo29 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i27);
        java.util.List<java.lang.Integer> list_i30 = metaInfo29.getShardingItems();
        java.lang.String str31 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i30);
        com.dangdang.ddframe.job.context.ExecutionType executionType32 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext34 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i30, executionType32, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state36 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source43 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType44 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state46 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent48 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source43, executionType44, "aff97160474a056e838c1f721af01edf", state46, "");
        java.lang.String str49 = jobStatusTraceEvent48.getId();
        java.lang.String str50 = jobStatusTraceEvent48.getShardingItems();
        java.util.Date date51 = jobStatusTraceEvent48.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source55 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType56 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state58 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent60 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source55, executionType56, "aff97160474a056e838c1f721af01edf", state58, "");
        java.lang.String str61 = jobStatusTraceEvent60.getId();
        java.lang.String str62 = jobStatusTraceEvent60.getShardingItems();
        java.util.Date date63 = jobStatusTraceEvent60.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics64 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date51, date63);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent65 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source22, executionType32, "128.208.4.97", state36, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date51);
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics66 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics((long) (byte) 0, 1, 52, statisticInterval4, date16, date51);
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics67 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        org.junit.Assert.assertTrue("'" + statisticInterval4 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval4.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "32b89e2f-88b3-46ad-a1ee-32cdba24ee40" + "'", str14.equals("32b89e2f-88b3-46ad-a1ee-32cdba24ee40"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str15.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(list_i30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "10" + "'", str31.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType32 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType32.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state36 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state36.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "d3925b4b-67fc-4b4d-bf24-a0ce628950a5" + "'", str49.equals("d3925b4b-67fc-4b4d-bf24-a0ce628950a5"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str50.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "0ec428f4-78e6-467c-92ab-a4bf08e13970" + "'", str61.equals("0ec428f4-78e6-467c-92ab-a4bf08e13970"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str62.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date63);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource2 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent4 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("3cae38aa-7ef9-49ac-8a03-3fd0876da30e", "18220525-2509-40cc-b0e7-71f957a72c51", executionSource2, (int) (short) -1);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource10 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source17 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType18 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state20 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent22 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source17, executionType18, "aff97160474a056e838c1f721af01edf", state20, "");
        java.lang.String str23 = jobStatusTraceEvent22.getId();
        java.lang.String str24 = jobStatusTraceEvent22.getShardingItems();
        java.util.Date date25 = jobStatusTraceEvent22.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source29 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType30 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state32 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent34 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source29, executionType30, "aff97160474a056e838c1f721af01edf", state32, "");
        java.lang.String str35 = jobStatusTraceEvent34.getId();
        java.lang.String str36 = jobStatusTraceEvent34.getShardingItems();
        java.util.Date date37 = jobStatusTraceEvent34.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics38 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date25, date37);
        java.util.Date date40 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics41 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date40);
        java.util.Date date42 = jobRunningStatistics41.getCreationTime();
        java.lang.Object[] obj_array47 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException48 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array47);
        java.lang.String str49 = appConfigurationException48.toString();
        java.lang.Throwable[] throwable_array50 = appConfigurationException48.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException51 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException48);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable53 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException51, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent54 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource10, (int) (byte) -1, date25, date42, false, jobExecutionEventThrowable53);
        jobExecutionEvent4.setFailureCause(jobExecutionEventThrowable53);
        java.util.Date date56 = jobExecutionEvent4.getStartTime();
        java.lang.String str57 = jobExecutionEvent4.getFailureCause();
        java.util.Date date58 = jobExecutionEvent4.getStartTime();
        org.junit.Assert.assertTrue("'" + executionSource2 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource2.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + executionSource10 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource10.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "b2bc5f81-d121-42bc-b160-690727a1ef86" + "'", str23.equals("b2bc5f81-d121-42bc-b160-690727a1ef86"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str24.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "b01ddc35-a238-4342-898f-bb869c2445bf" + "'", str35.equals("b01ddc35-a238-4342-898f-bb869c2445bf"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str36.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertNotNull(obj_array47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str49.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array50);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "com.dangdang.ddframe.job.exception.JobSystemException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\nCaused by: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\t... 6 more\n" + "'", str57.equals("com.dangdang.ddframe.job.exception.JobSystemException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\nCaused by: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\t... 6 more\n"));
        org.junit.Assert.assertNotNull(date58);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder7.failover(true);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration10 = builder7.build();
        com.dangdang.ddframe.job.config.script.ScriptJobConfiguration scriptJobConfiguration12 = new com.dangdang.ddframe.job.config.script.ScriptJobConfiguration(jobCoreConfiguration10, "314bc191-4988-40e5-b8b8-571c85349cdd");
        java.lang.String str13 = scriptJobConfiguration12.getScriptCommandLine();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(jobCoreConfiguration10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "314bc191-4988-40e5-b8b8-571c85349cdd" + "'", str13.equals("314bc191-4988-40e5-b8b8-571c85349cdd"));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.dangdang.ddframe.job.executor.handler.ExecutorServiceHandlerRegistry.remove("3f088f26-286f-40ed-8362-5e2f3c332fef");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        try {
            com.dangdang.ddframe.job.context.TaskContext taskContext1 = com.dangdang.ddframe.job.context.TaskContext.from("ee6144a8-6164-451f-9e3c-e3c85113af90");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException10 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array9);
        java.lang.String str11 = appConfigurationException10.toString();
        appConfigurationException4.addSuppressed((java.lang.Throwable) appConfigurationException10);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable13 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) appConfigurationException4);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("-1,1,10", "aff97160474a056e838c1f721af01edf", (int) '4', "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", map_i_str4, (int) (byte) -1);
        shardingContexts6.setAllowSendJobEvent(false);
        java.lang.String str9 = shardingContexts6.getJobName();
        int i10 = shardingContexts6.getJobEventSamplingCount();
        shardingContexts6.setCurrentJobEventSamplingCount(3);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str9.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            zookeeperRegistryCenter5.update("b2bc5f81-d121-42bc-b160-690727a1ef86", "9feed3d0-9408-4495-92fe-584b78a57132");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        org.apache.curator.framework.CuratorFramework curatorFramework6 = zookeeperRegistryCenter5.getClient();
        try {
            long long8 = zookeeperRegistryCenter5.getRegistryCenterTime("1bbea2ec-ee06-4188-9486-3286820c6d04");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertNull(curatorFramework6);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        java.lang.String str12 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "10" + "'", str12.equals("10"));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.util.Date date13 = jobStatusTraceEvent12.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource16 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent18 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("3cae38aa-7ef9-49ac-8a03-3fd0876da30e", "18220525-2509-40cc-b0e7-71f957a72c51", executionSource16, (int) (short) -1);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource24 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source31 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType32 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state34 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent36 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source31, executionType32, "aff97160474a056e838c1f721af01edf", state34, "");
        java.lang.String str37 = jobStatusTraceEvent36.getId();
        java.lang.String str38 = jobStatusTraceEvent36.getShardingItems();
        java.util.Date date39 = jobStatusTraceEvent36.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source43 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType44 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state46 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent48 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source43, executionType44, "aff97160474a056e838c1f721af01edf", state46, "");
        java.lang.String str49 = jobStatusTraceEvent48.getId();
        java.lang.String str50 = jobStatusTraceEvent48.getShardingItems();
        java.util.Date date51 = jobStatusTraceEvent48.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date39, date51);
        java.util.Date date54 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics55 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date54);
        java.util.Date date56 = jobRunningStatistics55.getCreationTime();
        java.lang.Object[] obj_array61 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException62 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array61);
        java.lang.String str63 = appConfigurationException62.toString();
        java.lang.Throwable[] throwable_array64 = appConfigurationException62.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException65 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException62);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable67 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException65, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent68 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource24, (int) (byte) -1, date39, date56, false, jobExecutionEventThrowable67);
        jobExecutionEvent18.setFailureCause(jobExecutionEventThrowable67);
        java.util.Date date70 = jobExecutionEvent18.getStartTime();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj71 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition72 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition(52, (int) (byte) 10, "d0cc04e7-efe9-4167-a154-8b65210ed06d", "bicycle.cs.washington.edu", date13, date70, map_str_obj71);
        int i73 = condition72.getPage();
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertTrue("'" + executionSource16 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource16.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + executionSource24 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource24.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "153488c1-29e9-4049-83d5-bc70aeb5ed13" + "'", str37.equals("153488c1-29e9-4049-83d5-bc70aeb5ed13"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str38.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "93aebac4-0c37-4e7c-a62d-fa36e4ffb3b4" + "'", str49.equals("93aebac4-0c37-4e7c-a62d-fa36e4ffb3b4"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str50.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertNotNull(obj_array61);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str63.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array64);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertTrue(i73 == 10);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder7.failover(true);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration10 = builder7.build();
        com.dangdang.ddframe.job.config.script.ScriptJobConfiguration scriptJobConfiguration12 = new com.dangdang.ddframe.job.config.script.ScriptJobConfiguration(jobCoreConfiguration10, "314bc191-4988-40e5-b8b8-571c85349cdd");
        boolean b13 = jobCoreConfiguration10.isMisfire();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(jobCoreConfiguration10);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts5 = new com.dangdang.ddframe.job.executor.ShardingContexts("0e04149c-206e-417e-ae5c-93128efc5dcd", "5299d802-b74a-424a-8edc-e5327f3eeb29", 0, "012beda3-baeb-4c3f-8ed0-11ec001b27b4", map_i_str4);
        try {
            com.dangdang.ddframe.job.api.ShardingContext shardingContext7 = new com.dangdang.ddframe.job.api.ShardingContext(shardingContexts5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b13 = taskContext11.equals((java.lang.Object) '#');
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType14 = com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL;
        boolean b15 = taskContext11.equals((java.lang.Object) databaseType14);
        com.dangdang.ddframe.job.context.ExecutionType executionType16 = taskContext11.getType();
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo17 = taskContext11.getMetaInfo();
        boolean b18 = taskContext11.isIdle();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + databaseType14 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL + "'", databaseType14.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + executionType16 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType16.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertNotNull(metaInfo17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.util.Date date55 = jobExecutionEvent49.getCompleteTime();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "fbd40385-d867-49f2-887a-5688815f6c46" + "'", str18.equals("fbd40385-d867-49f2-887a-5688815f6c46"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "5ca09d42-4b77-47de-b581-c7c972623aa7" + "'", str30.equals("5ca09d42-4b77-47de-b581-c7c972623aa7"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(date55);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval3 = com.dangdang.ddframe.job.statistics.StatisticInterval.DAY;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source21 = null;
        java.lang.Integer[] i_array25 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i26 = new java.util.ArrayList<java.lang.Integer>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i26, i_array25);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo28 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i26);
        java.util.List<java.lang.Integer> list_i29 = metaInfo28.getShardingItems();
        java.lang.String str30 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i29);
        com.dangdang.ddframe.job.context.ExecutionType executionType31 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext33 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i29, executionType31, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state35 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source42 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType43 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state45 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent47 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source42, executionType43, "aff97160474a056e838c1f721af01edf", state45, "");
        java.lang.String str48 = jobStatusTraceEvent47.getId();
        java.lang.String str49 = jobStatusTraceEvent47.getShardingItems();
        java.util.Date date50 = jobStatusTraceEvent47.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source54 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType55 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state57 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent59 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source54, executionType55, "aff97160474a056e838c1f721af01edf", state57, "");
        java.lang.String str60 = jobStatusTraceEvent59.getId();
        java.lang.String str61 = jobStatusTraceEvent59.getShardingItems();
        java.util.Date date62 = jobStatusTraceEvent59.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics63 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date50, date62);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent64 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source21, executionType31, "128.208.4.97", state35, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date50);
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics65 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics((long) (byte) 0, 1, 52, statisticInterval3, date15, date50);
        java.util.Date date66 = taskResultStatistics65.getCreationTime();
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval67 = taskResultStatistics65.getStatisticInterval();
        java.util.Date date68 = taskResultStatistics65.getCreationTime();
        org.junit.Assert.assertTrue("'" + statisticInterval3 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval3.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "120169b2-329a-40cf-814d-2abb23ec5cec" + "'", str13.equals("120169b2-329a-40cf-814d-2abb23ec5cec"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(list_i29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "10" + "'", str30.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType31 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType31.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state35 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state35.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "49c60e14-aa46-416e-83d7-9b6c7d340542" + "'", str48.equals("49c60e14-aa46-416e-83d7-9b6c7d340542"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str49.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "e0728d34-735c-4249-9d19-0e481857645e" + "'", str60.equals("e0728d34-735c-4249-9d19-0e481857645e"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str61.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertTrue("'" + statisticInterval67 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval67.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertNotNull(date68);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        int i6 = zookeeperConfiguration2.getConnectionTimeoutMilliseconds();
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo1 = com.dangdang.ddframe.job.context.TaskContext.MetaInfo.from("5ca71b40-3603-4128-88c2-8d39081e1a10");
        org.junit.Assert.assertNotNull(metaInfo1);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.lang.String str50 = jobExecutionEvent49.getIp();
        java.lang.String str51 = jobExecutionEvent49.getFailureCause();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "c9fd6edb-3ebe-4790-8788-99ce4d308d8e" + "'", str18.equals("c9fd6edb-3ebe-4790-8788-99ce4d308d8e"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "382f1ca9-92a9-4215-8a56-21005d8de8a7" + "'", str30.equals("382f1ca9-92a9-4215-8a56-21005d8de8a7"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "3ad58490-9ea0-4425-8b19-6ce5272f2ca4" + "'", str50.equals("3ad58490-9ea0-4425-8b19-6ce5272f2ca4"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "com.dangdang.ddframe.job.exception.JobSystemException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\nCaused by: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\t... 6 more\n" + "'", str51.equals("com.dangdang.ddframe.job.exception.JobSystemException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\nCaused by: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\t... 6 more\n"));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source9 = null;
        java.lang.Integer[] i_array13 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i14 = new java.util.ArrayList<java.lang.Integer>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i14, i_array13);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo16 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i14);
        java.util.List<java.lang.Integer> list_i17 = metaInfo16.getShardingItems();
        java.lang.String str18 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i17);
        com.dangdang.ddframe.job.context.ExecutionType executionType19 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext21 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i17, executionType19, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state23 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source30 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType31 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state33 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent35 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source30, executionType31, "aff97160474a056e838c1f721af01edf", state33, "");
        java.lang.String str36 = jobStatusTraceEvent35.getId();
        java.lang.String str37 = jobStatusTraceEvent35.getShardingItems();
        java.util.Date date38 = jobStatusTraceEvent35.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source42 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType43 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state45 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent47 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source42, executionType43, "aff97160474a056e838c1f721af01edf", state45, "");
        java.lang.String str48 = jobStatusTraceEvent47.getId();
        java.lang.String str49 = jobStatusTraceEvent47.getShardingItems();
        java.util.Date date50 = jobStatusTraceEvent47.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics51 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date38, date50);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent52 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source9, executionType19, "128.208.4.97", state23, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date38);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state54 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent56 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("ee6144a8-6164-451f-9e3c-e3c85113af90", "d41d8cd98f00b204e9800998ecf8427e", "720a31a1-6e31-4409-abe8-90f69964d02f", source3, executionType19, "8d4a5c91-8b38-4f21-ac3a-6f969ca8e9f7", state54, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state57 = jobStatusTraceEvent56.getState();
        org.junit.Assert.assertTrue("'" + source3 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER + "'", source3.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER));
        org.junit.Assert.assertNotNull(i_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(list_i17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "10" + "'", str18.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType19 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType19.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state23 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state23.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "3513974f-11d6-4b1b-b5ba-8ab10e811451" + "'", str36.equals("3513974f-11d6-4b1b-b5ba-8ab10e811451"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str37.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "69efd63d-507c-48d9-9047-d97672d4e0cf" + "'", str48.equals("69efd63d-507c-48d9-9047-d97672d4e0cf"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str49.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertTrue("'" + state54 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED + "'", state54.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED));
        org.junit.Assert.assertTrue("'" + state57 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED + "'", state57.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource7 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source14 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state17 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent19 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source14, executionType15, "aff97160474a056e838c1f721af01edf", state17, "");
        java.lang.String str20 = jobStatusTraceEvent19.getId();
        java.lang.String str21 = jobStatusTraceEvent19.getShardingItems();
        java.util.Date date22 = jobStatusTraceEvent19.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source26 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state29 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent31 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source26, executionType27, "aff97160474a056e838c1f721af01edf", state29, "");
        java.lang.String str32 = jobStatusTraceEvent31.getId();
        java.lang.String str33 = jobStatusTraceEvent31.getShardingItems();
        java.util.Date date34 = jobStatusTraceEvent31.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics35 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date22, date34);
        java.util.Date date37 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics38 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date37);
        java.util.Date date39 = jobRunningStatistics38.getCreationTime();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException45 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array44);
        java.lang.String str46 = appConfigurationException45.toString();
        java.lang.Throwable[] throwable_array47 = appConfigurationException45.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException48 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException45);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable50 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException48, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent51 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource7, (int) (byte) -1, date22, date39, false, jobExecutionEventThrowable50);
        java.util.Date date53 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics54 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date53);
        java.util.Date date55 = jobRunningStatistics54.getCreationTime();
        jobExecutionEvent51.setCompleteTime(date55);
        java.lang.Object[] obj_array60 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException61 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array60);
        java.lang.String str62 = appConfigurationException61.toString();
        java.lang.Throwable[] throwable_array63 = appConfigurationException61.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException64 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException61);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent65 = jobExecutionEvent51.executionFailure((java.lang.Throwable) appConfigurationException61);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source69 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType70 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state72 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent74 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source69, executionType70, "aff97160474a056e838c1f721af01edf", state72, "");
        java.lang.String str75 = jobStatusTraceEvent74.getId();
        java.lang.String str76 = jobStatusTraceEvent74.getSlaveId();
        java.lang.String str77 = jobStatusTraceEvent74.getShardingItems();
        java.util.Date date78 = jobStatusTraceEvent74.getCreationTime();
        java.util.Date date79 = jobStatusTraceEvent74.getCreationTime();
        jobExecutionEvent51.setCompleteTime(date79);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source85 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType86 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state88 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent90 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source85, executionType86, "aff97160474a056e838c1f721af01edf", state88, "");
        java.lang.String str91 = jobStatusTraceEvent90.getId();
        java.lang.String str92 = jobStatusTraceEvent90.getSlaveId();
        java.lang.String str93 = jobStatusTraceEvent90.getShardingItems();
        java.util.Date date94 = jobStatusTraceEvent90.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics jobRegisterStatistics95 = new com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics((int) (byte) 100, date94);
        com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics jobRegisterStatistics96 = new com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics((long) 0, (-1), date79, date94);
        java.util.Date date97 = jobRegisterStatistics96.getCreationTime();
        org.junit.Assert.assertTrue("'" + executionSource7 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource7.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "56406751-9623-41d1-8a3a-19071cd60076" + "'", str20.equals("56406751-9623-41d1-8a3a-19071cd60076"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str21.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "f72d32cb-2b10-4b89-9cf8-a16175d9efd0" + "'", str32.equals("f72d32cb-2b10-4b89-9cf8-a16175d9efd0"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str33.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str46.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array47);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str62.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array63);
        org.junit.Assert.assertNotNull(jobExecutionEvent65);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "0d7f9ace-83fb-4f97-958b-11bae69b1267" + "'", str75.equals("0d7f9ace-83fb-4f97-958b-11bae69b1267"));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str76.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str77.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "0ccfe18b-7765-4b56-a750-76afff63e55b" + "'", str91.equals("0ccfe18b-7765-4b56-a750-76afff63e55b"));
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str92.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str93.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date94);
        org.junit.Assert.assertNotNull(date97);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.curator.framework.CuratorFramework curatorFramework1 = null;
        com.dangdang.ddframe.job.reg.base.ElectionCandidate electionCandidate3 = null;
        try {
            com.dangdang.ddframe.job.reg.zookeeper.ZookeeperElectionService zookeeperElectionService4 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperElectionService("a344cb85-b843-4751-ac2f-7bd797158ab0", curatorFramework1, "8ce7f23c-889f-40a7-8fab-a9e4d7e8312f", electionCandidate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        java.lang.String str19 = condition18.getSort();
        java.util.Date date20 = condition18.getStartTime();
        java.util.Date date21 = condition18.getStartTime();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "3e6632c8-6756-4241-a56b-66bec52379c6" + "'", str13.equals("3e6632c8-6756-4241-a56b-66bec52379c6"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str19.equals("76790358-3199-4060-a536-0f953a59b404"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertNotNull(date21);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum1 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.from("055574cd-fd86-47c1-9128-704cefe3b80f");
        org.junit.Assert.assertNull(jobPropertiesEnum1);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException59 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array58);
        java.lang.String str60 = appConfigurationException59.toString();
        java.lang.Throwable[] throwable_array61 = appConfigurationException59.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException62 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent63 = jobExecutionEvent49.executionFailure((java.lang.Throwable) appConfigurationException59);
        java.util.Date date64 = jobExecutionEvent63.getStartTime();
        java.lang.Object[] obj_array68 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException69 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array68);
        java.lang.String str70 = appConfigurationException69.toString();
        java.lang.Object[] obj_array74 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException75 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array74);
        java.lang.String str76 = appConfigurationException75.toString();
        appConfigurationException69.addSuppressed((java.lang.Throwable) appConfigurationException75);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent78 = jobExecutionEvent63.executionFailure((java.lang.Throwable) appConfigurationException69);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable80 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) appConfigurationException69, "87346dbb-0e59-4bfe-b06c-eac1e2253cb7");
        com.dangdang.ddframe.job.exception.JobStatisticException jobStatisticException81 = new com.dangdang.ddframe.job.exception.JobStatisticException((java.lang.Exception) appConfigurationException69);
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "6707a3cc-c62a-4552-a3c8-27f39e7ae05b" + "'", str18.equals("6707a3cc-c62a-4552-a3c8-27f39e7ae05b"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "74125e7d-462a-4378-a494-172b96a9d219" + "'", str30.equals("74125e7d-462a-4378-a494-172b96a9d219"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str60.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(jobExecutionEvent63);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertNotNull(obj_array68);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str70.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array74);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str76.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(jobExecutionEvent78);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType4 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent8 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source3, executionType4, "aff97160474a056e838c1f721af01edf", state6, "");
        java.lang.String str9 = jobStatusTraceEvent8.getId();
        java.lang.String str10 = jobStatusTraceEvent8.getSlaveId();
        java.lang.String str11 = jobStatusTraceEvent8.getShardingItems();
        java.lang.String str12 = jobStatusTraceEvent8.getOriginalTaskId();
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = jobStatusTraceEvent8.getExecutionType();
        java.lang.String str14 = jobStatusTraceEvent8.getOriginalTaskId();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "de8acb4e-09a2-458c-a8ee-d7e018f5d7ed" + "'", str9.equals("de8acb4e-09a2-458c-a8ee-d7e018f5d7ed"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str10.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str11.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNull(executionType13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval4 = com.dangdang.ddframe.job.statistics.StatisticInterval.DAY;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source8 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state11 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent13 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source8, executionType9, "aff97160474a056e838c1f721af01edf", state11, "");
        java.lang.String str14 = jobStatusTraceEvent13.getId();
        java.lang.String str15 = jobStatusTraceEvent13.getShardingItems();
        java.util.Date date16 = jobStatusTraceEvent13.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source22 = null;
        java.lang.Integer[] i_array26 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i27 = new java.util.ArrayList<java.lang.Integer>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i27, i_array26);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo29 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i27);
        java.util.List<java.lang.Integer> list_i30 = metaInfo29.getShardingItems();
        java.lang.String str31 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i30);
        com.dangdang.ddframe.job.context.ExecutionType executionType32 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext34 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i30, executionType32, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state36 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source43 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType44 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state46 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent48 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source43, executionType44, "aff97160474a056e838c1f721af01edf", state46, "");
        java.lang.String str49 = jobStatusTraceEvent48.getId();
        java.lang.String str50 = jobStatusTraceEvent48.getShardingItems();
        java.util.Date date51 = jobStatusTraceEvent48.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source55 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType56 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state58 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent60 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source55, executionType56, "aff97160474a056e838c1f721af01edf", state58, "");
        java.lang.String str61 = jobStatusTraceEvent60.getId();
        java.lang.String str62 = jobStatusTraceEvent60.getShardingItems();
        java.util.Date date63 = jobStatusTraceEvent60.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics64 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date51, date63);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent65 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source22, executionType32, "128.208.4.97", state36, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date51);
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics66 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics((long) (byte) 0, 1, 52, statisticInterval4, date16, date51);
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics67 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((int) (byte) 10, date16);
        org.junit.Assert.assertTrue("'" + statisticInterval4 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval4.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ef2fbcd4-d64e-4931-ba8e-9332b260c8f7" + "'", str14.equals("ef2fbcd4-d64e-4931-ba8e-9332b260c8f7"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str15.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertNotNull(i_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(list_i30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "10" + "'", str31.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType32 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType32.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state36 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state36.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "f8153022-3675-49f0-be1d-ab86c33bf1bf" + "'", str49.equals("f8153022-3675-49f0-be1d-ab86c33bf1bf"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str50.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "33cbf7f0-9bbd-4baf-9fee-44fa913cd04f" + "'", str61.equals("33cbf7f0-9bbd-4baf-9fee-44fa913cd04f"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str62.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date63);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject executorServiceObject2 = new com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject("e6fbe543-b3f7-45cd-ad16-7a4c8325f2cd", (int) (short) 100);
        int i3 = executorServiceObject2.getWorkQueueSize();
        java.util.concurrent.ExecutorService executorService4 = executorServiceObject2.createExecutorService();
        java.util.concurrent.ExecutorService executorService5 = executorServiceObject2.createExecutorService();
        java.util.concurrent.ExecutorService executorService6 = executorServiceObject2.createExecutorService();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(executorService4);
        org.junit.Assert.assertNotNull(executorService5);
        org.junit.Assert.assertNotNull(executorService6);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        java.lang.String str19 = condition18.getSort();
        java.util.Date date20 = condition18.getEndTime();
        int i21 = condition18.getPerPage();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "97f10bb6-d60b-4b35-b535-16d3f176ce1a" + "'", str13.equals("97f10bb6-d60b-4b35-b535-16d3f176ce1a"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str19.equals("76790358-3199-4060-a536-0f953a59b404"));
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertTrue(i21 == 100);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.dangdang.ddframe.job.util.concurrent.BlockUtils.sleep((long) (byte) 1);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject executorServiceObject2 = new com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject("e6fbe543-b3f7-45cd-ad16-7a4c8325f2cd", (int) (short) 100);
        int i3 = executorServiceObject2.getWorkQueueSize();
        java.util.concurrent.ExecutorService executorService4 = executorServiceObject2.createExecutorService();
        java.util.concurrent.ExecutorService executorService5 = executorServiceObject2.createExecutorService();
        boolean b6 = executorServiceObject2.isShutdown();
        int i7 = executorServiceObject2.getActiveThreadCount();
        boolean b8 = executorServiceObject2.isShutdown();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(executorService4);
        org.junit.Assert.assertNotNull(executorService5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n");
        java.lang.String str3 = zookeeperConfiguration2.getDigest();
        int i4 = zookeeperConfiguration2.getBaseSleepTimeMilliseconds();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(i4 == 1000);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            boolean b7 = zookeeperRegistryCenter5.isExisted("cb4f3d0d-5bea-46b8-826f-76badbb446f1");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        java.lang.String str8 = jobCoreConfiguration6.getJobParameter();
        boolean b9 = jobCoreConfiguration6.isMisfire();
        com.dangdang.ddframe.job.config.script.ScriptJobConfiguration scriptJobConfiguration11 = new com.dangdang.ddframe.job.config.script.ScriptJobConfiguration(jobCoreConfiguration6, "1ce254ed-faf6-403e-ad63-b312817ceab9");
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration12 = scriptJobConfiguration11.getCoreConfig();
        com.dangdang.ddframe.job.config.script.ScriptJobConfiguration scriptJobConfiguration14 = new com.dangdang.ddframe.job.config.script.ScriptJobConfiguration(jobCoreConfiguration12, "5929039b-6d28-419a-93d5-cc0119ce1fb4");
        java.lang.String str15 = scriptJobConfiguration14.getJobClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(jobCoreConfiguration12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.dangdang.ddframe.job.api.script.ScriptJob" + "'", str15.equals("com.dangdang.ddframe.job.api.script.ScriptJob"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        int i5 = zookeeperConfiguration2.getConnectionTimeoutMilliseconds();
        java.lang.String str6 = zookeeperConfiguration2.getNamespace();
        int i7 = zookeeperConfiguration2.getBaseSleepTimeMilliseconds();
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1,1,10" + "'", str6.equals("-1,1,10"));
        org.junit.Assert.assertTrue(i7 == 1000);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter5 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        org.apache.curator.framework.CuratorFramework curatorFramework6 = zookeeperRegistryCenter5.getClient();
        try {
            int i8 = zookeeperRegistryCenter5.getNumChildren("7475e268-201a-4c9e-8a97-7014da588602");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertNull(curatorFramework6);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder7.failover(true);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration10 = builder7.build();
        java.lang.String str11 = jobCoreConfiguration10.getDescription();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(jobCoreConfiguration10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        java.lang.String str7 = jobCoreConfiguration6.getJobName();
        com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration simpleJobConfiguration9 = new com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration(jobCoreConfiguration6, "81674592-e7c3-4a59-8193-2fadeac4cbd4");
        java.lang.String str10 = simpleJobConfiguration9.getJobClass();
        java.lang.String str11 = simpleJobConfiguration9.getJobClass();
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration12 = simpleJobConfiguration9.getCoreConfig();
        boolean b13 = jobCoreConfiguration12.isMisfire();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "81674592-e7c3-4a59-8193-2fadeac4cbd4" + "'", str10.equals("81674592-e7c3-4a59-8193-2fadeac4cbd4"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "81674592-e7c3-4a59-8193-2fadeac4cbd4" + "'", str11.equals("81674592-e7c3-4a59-8193-2fadeac4cbd4"));
        org.junit.Assert.assertNotNull(jobCoreConfiguration12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval6 = com.dangdang.ddframe.job.statistics.StatisticInterval.DAY;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source10 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType11 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent15 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source10, executionType11, "aff97160474a056e838c1f721af01edf", state13, "");
        java.lang.String str16 = jobStatusTraceEvent15.getId();
        java.lang.String str17 = jobStatusTraceEvent15.getShardingItems();
        java.util.Date date18 = jobStatusTraceEvent15.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        java.lang.Integer[] i_array28 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i29 = new java.util.ArrayList<java.lang.Integer>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i29, i_array28);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo31 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i29);
        java.util.List<java.lang.Integer> list_i32 = metaInfo31.getShardingItems();
        java.lang.String str33 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i32);
        com.dangdang.ddframe.job.context.ExecutionType executionType34 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext36 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i32, executionType34, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state38 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source45 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType46 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state48 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent50 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source45, executionType46, "aff97160474a056e838c1f721af01edf", state48, "");
        java.lang.String str51 = jobStatusTraceEvent50.getId();
        java.lang.String str52 = jobStatusTraceEvent50.getShardingItems();
        java.util.Date date53 = jobStatusTraceEvent50.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source57 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType58 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state60 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent62 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source57, executionType58, "aff97160474a056e838c1f721af01edf", state60, "");
        java.lang.String str63 = jobStatusTraceEvent62.getId();
        java.lang.String str64 = jobStatusTraceEvent62.getShardingItems();
        java.util.Date date65 = jobStatusTraceEvent62.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics66 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date53, date65);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent67 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source24, executionType34, "128.208.4.97", state38, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date53);
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics68 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics((long) (byte) 0, 1, 52, statisticInterval6, date18, date53);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source76 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType77 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state79 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent81 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source76, executionType77, "aff97160474a056e838c1f721af01edf", state79, "");
        java.lang.String str82 = jobStatusTraceEvent81.getId();
        java.lang.String str83 = jobStatusTraceEvent81.getShardingItems();
        java.util.Date date84 = jobStatusTraceEvent81.getCreationTime();
        java.util.Date date85 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj86 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition87 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date84, date85, map_str_obj86);
        com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics jobRegisterStatistics88 = new com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics((long) 52, (int) '#', date53, date85);
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics89 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((int) (short) 10, date85);
        org.junit.Assert.assertTrue("'" + statisticInterval6 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval6.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "fc590954-b05e-40a5-b7b9-bded470439db" + "'", str16.equals("fc590954-b05e-40a5-b7b9-bded470439db"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str17.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertNotNull(i_array28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(list_i32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "10" + "'", str33.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType34 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType34.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state38 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state38.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "648e8380-400e-4d71-952e-00ebf7ddc6bd" + "'", str51.equals("648e8380-400e-4d71-952e-00ebf7ddc6bd"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str52.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "9268d03c-c8ec-4268-b8fa-f279609bdbb6" + "'", str63.equals("9268d03c-c8ec-4268-b8fa-f279609bdbb6"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str64.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "4f24bc7c-dde5-4787-b0b1-8ff28f900bdb" + "'", str82.equals("4f24bc7c-dde5-4787-b0b1-8ff28f900bdb"));
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str83.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date84);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler defaultJobExceptionHandler0 = new com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException6 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array5);
        java.lang.String str7 = appConfigurationException6.toString();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException12 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array11);
        java.lang.String str13 = appConfigurationException12.toString();
        appConfigurationException6.addSuppressed((java.lang.Throwable) appConfigurationException12);
        com.dangdang.ddframe.job.reg.exception.RegException regException15 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException12);
        defaultJobExceptionHandler0.handleException("47927c57-a9ce-45a6-8297-dfbfc63aa78d", (java.lang.Throwable) appConfigurationException12);
        com.dangdang.ddframe.job.exception.JobConfigurationException jobConfigurationException17 = new com.dangdang.ddframe.job.exception.JobConfigurationException((java.lang.Throwable) appConfigurationException12);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str13.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        java.lang.String str8 = jobCoreConfiguration6.getJobParameter();
        java.lang.String str9 = jobCoreConfiguration6.getJobParameter();
        com.dangdang.ddframe.job.config.script.ScriptJobConfiguration scriptJobConfiguration11 = new com.dangdang.ddframe.job.config.script.ScriptJobConfiguration(jobCoreConfiguration6, "bb5ca96a-c0a9-42bb-ba4a-12c1abc98a56");
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration12 = scriptJobConfiguration11.getCoreConfig();
        java.lang.String str13 = scriptJobConfiguration11.getJobClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(jobCoreConfiguration12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "com.dangdang.ddframe.job.api.script.ScriptJob" + "'", str13.equals("com.dangdang.ddframe.job.api.script.ScriptJob"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType4 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent8 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source3, executionType4, "aff97160474a056e838c1f721af01edf", state6, "");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state9 = jobStatusTraceEvent8.getState();
        org.junit.Assert.assertNull(state9);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        java.lang.String str19 = condition18.getSort();
        java.util.Date date20 = condition18.getStartTime();
        java.util.Date date21 = condition18.getEndTime();
        java.util.Date date22 = condition18.getStartTime();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "c50e4711-ac8d-45ff-8ba2-e225c3a2f251" + "'", str13.equals("c50e4711-ac8d-45ff-8ba2-e225c3a2f251"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str19.equals("76790358-3199-4060-a536-0f953a59b404"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertNotNull(date22);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException59 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array58);
        java.lang.String str60 = appConfigurationException59.toString();
        java.lang.Throwable[] throwable_array61 = appConfigurationException59.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException62 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent63 = jobExecutionEvent49.executionFailure((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source67 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType68 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state70 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent72 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source67, executionType68, "aff97160474a056e838c1f721af01edf", state70, "");
        java.lang.String str73 = jobStatusTraceEvent72.getId();
        java.lang.String str74 = jobStatusTraceEvent72.getSlaveId();
        java.lang.String str75 = jobStatusTraceEvent72.getShardingItems();
        java.util.Date date76 = jobStatusTraceEvent72.getCreationTime();
        java.util.Date date77 = jobStatusTraceEvent72.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date77);
        java.util.Date date79 = jobExecutionEvent49.getStartTime();
        java.lang.String str80 = jobExecutionEvent49.getFailureCause();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "72d78809-605f-47dd-8cb3-9faf6984ec09" + "'", str18.equals("72d78809-605f-47dd-8cb3-9faf6984ec09"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "769ea900-4f6d-4c95-80fa-e15e6f794d56" + "'", str30.equals("769ea900-4f6d-4c95-80fa-e15e6f794d56"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str60.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(jobExecutionEvent63);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "b5784a5d-b558-4ee8-a4b6-a6ba4b13dc8d" + "'", str73.equals("b5784a5d-b558-4ee8-a4b6-a6ba4b13dc8d"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str74.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str75.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "com.dangdang.ddframe.job.exception.JobSystemException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\nCaused by: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\t... 6 more\n" + "'", str80.equals("com.dangdang.ddframe.job.exception.JobSystemException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor9.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\nCaused by: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\t... 6 more\n"));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("-1,1,10", "d0be6b2b-9c52-490d-b882-bc3fca29f622");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter3 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        java.lang.Object obj5 = zookeeperRegistryCenter3.getRawCache("556363af-3fb8-4f8b-9e5e-a03b07439c6d");
        try {
            java.lang.String str7 = zookeeperRegistryCenter3.getDirectly("f0b8b4c3-82bd-4535-9f1e-1a40e0df0b70");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "f2da3452-ca49-4b9e-8e6a-53b0b3ca8c6c", (int) (byte) 10, "-1,1,10", map_i_str4, (int) (short) 1);
        java.lang.String str7 = shardingContexts6.getTaskId();
        java.lang.String str8 = shardingContexts6.getTaskId();
        java.lang.String str9 = shardingContexts6.getJobParameter();
        java.lang.String str10 = shardingContexts6.getTaskId();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str8.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1,1,10" + "'", str9.equals("-1,1,10"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str10.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        int i5 = zookeeperConfiguration2.getMaxSleepTimeMilliseconds();
        zookeeperConfiguration2.setDigest("a3b7aa19-b9a0-4733-bb43-4985e57cda75");
        org.junit.Assert.assertTrue(i5 == 3000);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("-1,1,10", "d0be6b2b-9c52-490d-b882-bc3fca29f622");
        zookeeperConfiguration2.setConnectionTimeoutMilliseconds(100);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.dangdang.ddframe.job.util.env.TimeService timeService0 = new com.dangdang.ddframe.job.util.env.TimeService();
        long long1 = timeService0.getCurrentMillis();
        long long2 = timeService0.getCurrentMillis();
        long long3 = timeService0.getCurrentMillis();
        org.junit.Assert.assertTrue(long1 == 1524344296571L);
        org.junit.Assert.assertTrue(long2 == 1524344296576L);
        org.junit.Assert.assertTrue(long3 == 1524344296596L);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source3 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType4 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state6 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent8 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source3, executionType4, "aff97160474a056e838c1f721af01edf", state6, "");
        java.lang.String str9 = jobStatusTraceEvent8.getId();
        java.util.Date date10 = jobStatusTraceEvent8.getCreationTime();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "bc68e9ee-ad65-4699-8e63-782f3fac55cc" + "'", str9.equals("bc68e9ee-ad65-4699-8e63-782f3fac55cc"));
        org.junit.Assert.assertNotNull(date10);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        try {
            com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType1 = com.dangdang.ddframe.job.event.rdb.DatabaseType.valueFrom("8833434a-ac64-4c95-b1a7-4678574c5ed7");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler defaultJobExceptionHandler0 = new com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException6 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array5);
        java.lang.String str7 = appConfigurationException6.toString();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException12 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array11);
        java.lang.String str13 = appConfigurationException12.toString();
        appConfigurationException6.addSuppressed((java.lang.Throwable) appConfigurationException12);
        com.dangdang.ddframe.job.reg.exception.RegException regException15 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException12);
        defaultJobExceptionHandler0.handleException("47927c57-a9ce-45a6-8297-dfbfc63aa78d", (java.lang.Throwable) appConfigurationException12);
        java.lang.Object[] obj_array21 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException22 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array21);
        java.lang.String str23 = appConfigurationException22.toString();
        java.lang.Object[] obj_array27 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException28 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array27);
        java.lang.String str29 = appConfigurationException28.toString();
        appConfigurationException22.addSuppressed((java.lang.Throwable) appConfigurationException28);
        com.dangdang.ddframe.job.reg.exception.RegException regException31 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException28);
        defaultJobExceptionHandler0.handleException("07387912-29c6-4b81-8156-660659f22c58", (java.lang.Throwable) appConfigurationException28);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str13.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array21);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str23.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str29.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("aff97160474a056e838c1f721af01edf", "", (int) (short) -1, "d0be6b2b-9c52-490d-b882-bc3fca29f622", map_i_str4, 0);
        java.lang.String str7 = shardingContexts6.getJobParameter();
        java.lang.String str8 = shardingContexts6.getJobParameter();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d0be6b2b-9c52-490d-b882-bc3fca29f622" + "'", str7.equals("d0be6b2b-9c52-490d-b882-bc3fca29f622"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "d0be6b2b-9c52-490d-b882-bc3fca29f622" + "'", str8.equals("d0be6b2b-9c52-490d-b882-bc3fca29f622"));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds((int) 'a');
        int i7 = zookeeperConfiguration2.getMaxRetries();
        zookeeperConfiguration2.setMaxRetries(52);
        org.junit.Assert.assertTrue(i7 == 3);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.lang.Object[] obj_array5 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException6 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array5);
        java.lang.String str7 = appConfigurationException6.toString();
        java.lang.Object[] obj_array11 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException12 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array11);
        java.lang.String str13 = appConfigurationException12.toString();
        appConfigurationException6.addSuppressed((java.lang.Throwable) appConfigurationException12);
        com.dangdang.ddframe.job.reg.exception.RegException regException15 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException12);
        java.lang.Object[] obj_array19 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException20 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array19);
        java.lang.String str21 = appConfigurationException20.toString();
        java.lang.Object[] obj_array25 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException26 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array25);
        java.lang.String str27 = appConfigurationException26.toString();
        appConfigurationException20.addSuppressed((java.lang.Throwable) appConfigurationException26);
        java.lang.Throwable throwable29 = null;
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException30 = new com.dangdang.ddframe.job.exception.JobSystemException(throwable29);
        appConfigurationException20.addSuppressed((java.lang.Throwable) jobSystemException30);
        com.dangdang.ddframe.job.event.JobEventListenerConfigurationException jobEventListenerConfigurationException32 = new com.dangdang.ddframe.job.event.JobEventListenerConfigurationException((java.lang.Exception) appConfigurationException20);
        appConfigurationException12.addSuppressed((java.lang.Throwable) jobEventListenerConfigurationException32);
        java.lang.Throwable[] throwable_array34 = appConfigurationException12.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException35 = new com.dangdang.ddframe.job.exception.JobSystemException("7335fd5f-996d-4d4c-bc3d-2dde43e3b82d", (java.lang.Object[]) throwable_array34);
        com.dangdang.ddframe.job.reg.exception.RegException regException36 = new com.dangdang.ddframe.job.reg.exception.RegException("155594de-8e67-4fdd-9871-c7a5295cde4d", (java.lang.Object[]) throwable_array34);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str13.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str21.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array25);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str27.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array34);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("d0cc04e7-efe9-4167-a154-8b65210ed06d", "9f29874b-7365-4fc9-aa02-e897d5bb5dcb");
        int i3 = zookeeperConfiguration2.getMaxSleepTimeMilliseconds();
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds((int) (byte) -1);
        zookeeperConfiguration2.setBaseSleepTimeMilliseconds((int) (byte) 100);
        org.junit.Assert.assertTrue(i3 == 3000);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.lang.String str50 = jobExecutionEvent49.getIp();
        java.lang.String str51 = jobExecutionEvent49.getTaskId();
        java.util.Date date52 = jobExecutionEvent49.getStartTime();
        boolean b53 = jobExecutionEvent49.isSuccess();
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable54 = null;
        jobExecutionEvent49.setFailureCause(jobExecutionEventThrowable54);
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "19998dee-e21b-4d73-8b15-bd4e707ebfa1" + "'", str18.equals("19998dee-e21b-4d73-8b15-bd4e707ebfa1"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "f2e38590-d01e-4612-a42e-eebf879cf9c7" + "'", str30.equals("f2e38590-d01e-4612-a42e-eebf879cf9c7"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "3ad58490-9ea0-4425-8b19-6ce5272f2ca4" + "'", str50.equals("3ad58490-9ea0-4425-8b19-6ce5272f2ca4"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "128.208.4.97" + "'", str51.equals("128.208.4.97"));
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource7 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source14 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state17 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent19 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source14, executionType15, "aff97160474a056e838c1f721af01edf", state17, "");
        java.lang.String str20 = jobStatusTraceEvent19.getId();
        java.lang.String str21 = jobStatusTraceEvent19.getShardingItems();
        java.util.Date date22 = jobStatusTraceEvent19.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source26 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state29 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent31 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source26, executionType27, "aff97160474a056e838c1f721af01edf", state29, "");
        java.lang.String str32 = jobStatusTraceEvent31.getId();
        java.lang.String str33 = jobStatusTraceEvent31.getShardingItems();
        java.util.Date date34 = jobStatusTraceEvent31.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics35 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date22, date34);
        java.util.Date date37 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics38 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date37);
        java.util.Date date39 = jobRunningStatistics38.getCreationTime();
        java.lang.Object[] obj_array44 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException45 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array44);
        java.lang.String str46 = appConfigurationException45.toString();
        java.lang.Throwable[] throwable_array47 = appConfigurationException45.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException48 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException45);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable50 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException48, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent51 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource7, (int) (byte) -1, date22, date39, false, jobExecutionEventThrowable50);
        java.util.Date date53 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics54 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date53);
        java.util.Date date55 = jobRunningStatistics54.getCreationTime();
        jobExecutionEvent51.setCompleteTime(date55);
        java.lang.Object[] obj_array60 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException61 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array60);
        java.lang.String str62 = appConfigurationException61.toString();
        java.lang.Throwable[] throwable_array63 = appConfigurationException61.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException64 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException61);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent65 = jobExecutionEvent51.executionFailure((java.lang.Throwable) appConfigurationException61);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source69 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType70 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state72 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent74 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source69, executionType70, "aff97160474a056e838c1f721af01edf", state72, "");
        java.lang.String str75 = jobStatusTraceEvent74.getId();
        java.lang.String str76 = jobStatusTraceEvent74.getSlaveId();
        java.lang.String str77 = jobStatusTraceEvent74.getShardingItems();
        java.util.Date date78 = jobStatusTraceEvent74.getCreationTime();
        java.util.Date date79 = jobStatusTraceEvent74.getCreationTime();
        jobExecutionEvent51.setCompleteTime(date79);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source85 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType86 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state88 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent90 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source85, executionType86, "aff97160474a056e838c1f721af01edf", state88, "");
        java.lang.String str91 = jobStatusTraceEvent90.getId();
        java.lang.String str92 = jobStatusTraceEvent90.getSlaveId();
        java.lang.String str93 = jobStatusTraceEvent90.getShardingItems();
        java.util.Date date94 = jobStatusTraceEvent90.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics jobRegisterStatistics95 = new com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics((int) (byte) 100, date94);
        com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics jobRegisterStatistics96 = new com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics((long) 0, (-1), date79, date94);
        java.util.Date date97 = jobRegisterStatistics96.getStatisticsTime();
        org.junit.Assert.assertTrue("'" + executionSource7 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource7.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "a014cd91-b117-4111-a469-0b7d41f12bc3" + "'", str20.equals("a014cd91-b117-4111-a469-0b7d41f12bc3"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str21.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "27b5f4b6-a3c7-424f-a23c-5a4a061a0235" + "'", str32.equals("27b5f4b6-a3c7-424f-a23c-5a4a061a0235"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str33.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertNotNull(obj_array44);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str46.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array47);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertNotNull(obj_array60);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str62.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array63);
        org.junit.Assert.assertNotNull(jobExecutionEvent65);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "9700eb06-5881-47df-91eb-632a2eb188b2" + "'", str75.equals("9700eb06-5881-47df-91eb-632a2eb188b2"));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str76.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str77.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "b808f5db-2705-4071-a19e-14483b88a37a" + "'", str91.equals("b808f5db-2705-4071-a19e-14483b88a37a"));
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str92.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str93.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date94);
        org.junit.Assert.assertNotNull(date97);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "f2da3452-ca49-4b9e-8e6a-53b0b3ca8c6c", (int) (byte) 10, "-1,1,10", map_i_str4, (int) (short) 1);
        java.lang.String str7 = shardingContexts6.getTaskId();
        java.lang.String str8 = shardingContexts6.getTaskId();
        int i9 = shardingContexts6.getCurrentJobEventSamplingCount();
        int i10 = shardingContexts6.getCurrentJobEventSamplingCount();
        java.lang.String str11 = shardingContexts6.toString();
        java.lang.String str12 = shardingContexts6.toString();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str8.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ShardingContexts(taskId=com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!, jobName=f2da3452-ca49-4b9e-8e6a-53b0b3ca8c6c, shardingTotalCount=10, jobParameter=-1,1,10, shardingItemParameters=null, jobEventSamplingCount=1, currentJobEventSamplingCount=0, allowSendJobEvent=true)" + "'", str11.equals("ShardingContexts(taskId=com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!, jobName=f2da3452-ca49-4b9e-8e6a-53b0b3ca8c6c, shardingTotalCount=10, jobParameter=-1,1,10, shardingItemParameters=null, jobEventSamplingCount=1, currentJobEventSamplingCount=0, allowSendJobEvent=true)"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ShardingContexts(taskId=com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!, jobName=f2da3452-ca49-4b9e-8e6a-53b0b3ca8c6c, shardingTotalCount=10, jobParameter=-1,1,10, shardingItemParameters=null, jobEventSamplingCount=1, currentJobEventSamplingCount=0, allowSendJobEvent=true)" + "'", str12.equals("ShardingContexts(taskId=com.dangdang.ddframe.job.exception.AppConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!, jobName=f2da3452-ca49-4b9e-8e6a-53b0b3ca8c6c, shardingTotalCount=10, jobParameter=-1,1,10, shardingItemParameters=null, jobEventSamplingCount=1, currentJobEventSamplingCount=0, allowSendJobEvent=true)"));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setConnectionTimeoutMilliseconds((int) 'a');
        zookeeperConfiguration2.setSessionTimeoutMilliseconds(97);
        zookeeperConfiguration2.setSessionTimeoutMilliseconds((int) (byte) 10);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder7.failover(true);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration10 = builder7.build();
        com.dangdang.ddframe.job.config.script.ScriptJobConfiguration scriptJobConfiguration12 = new com.dangdang.ddframe.job.config.script.ScriptJobConfiguration(jobCoreConfiguration10, "314bc191-4988-40e5-b8b8-571c85349cdd");
        java.lang.String str13 = jobCoreConfiguration10.getJobParameter();
        java.lang.String str14 = jobCoreConfiguration10.getShardingItemParameters();
        java.lang.String str15 = jobCoreConfiguration10.getJobName();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(jobCoreConfiguration10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str15.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration10 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration6, "3d746adc-0573-435e-b1ec-124d7372fbc5", true);
        java.lang.String str11 = jobCoreConfiguration6.getJobName();
        java.lang.String str12 = jobCoreConfiguration6.getShardingItemParameters();
        com.dangdang.ddframe.job.executor.handler.JobProperties jobProperties13 = jobCoreConfiguration6.getJobProperties();
        com.dangdang.ddframe.job.config.script.ScriptJobConfiguration scriptJobConfiguration15 = new com.dangdang.ddframe.job.config.script.ScriptJobConfiguration(jobCoreConfiguration6, "2412762a-473b-48a8-8a40-120aeb98580e");
        java.lang.String str16 = jobCoreConfiguration6.getJobName();
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration19 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration6, "c5677780-ccce-45f3-8da2-142e27654f2d", false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(jobProperties13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str16.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource2 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.FAILOVER;
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent4 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("2ade4a75-2d52-4444-a081-731a4af77674", "9eaaa3b5-8493-4825-8d70-85a402798479", executionSource2, (int) (byte) 1);
        java.lang.String str5 = jobExecutionEvent4.getHostname();
        org.junit.Assert.assertTrue("'" + executionSource2 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.FAILOVER + "'", executionSource2.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.FAILOVER));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "bicycle.cs.washington.edu" + "'", str5.equals("bicycle.cs.washington.edu"));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts5 = new com.dangdang.ddframe.job.executor.ShardingContexts("128.208.4.97", "315bcbb2-3e27-4638-bdf1-9a6a36dbab41", 3000, "c8ef167c-d5e7-4ef6-8114-240ddae59a01", map_i_str4);
        int i6 = shardingContexts5.getShardingTotalCount();
        org.junit.Assert.assertTrue(i6 == 3000);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        java.lang.String str7 = jobCoreConfiguration6.getJobName();
        java.lang.String str8 = jobCoreConfiguration6.getJobName();
        int i9 = jobCoreConfiguration6.getShardingTotalCount();
        java.lang.String str10 = jobCoreConfiguration6.getShardingItemParameters();
        boolean b11 = jobCoreConfiguration6.isFailover();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str8.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        java.lang.String str12 = taskContext11.getSlaveId();
        boolean b14 = taskContext11.equals((java.lang.Object) "caca01be-67a2-4bf3-8c3c-ce17d9494590");
        boolean b15 = taskContext11.isIdle();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "128.208.4.97" + "'", str12.equals("128.208.4.97"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.dangdang.ddframe.job.statistics.type.job.JobTypeStatistics jobTypeStatistics3 = new com.dangdang.ddframe.job.statistics.type.job.JobTypeStatistics(3000, 3000, 0);
        int i4 = jobTypeStatistics3.getDataflowJobCount();
        int i5 = jobTypeStatistics3.getScriptJobCount();
        int i6 = jobTypeStatistics3.getSimpleJobCount();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 3000);
        org.junit.Assert.assertTrue(i6 == 3000);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration0 = null;
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration3 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration0, "ee6144a8-6164-451f-9e3c-e3c85113af90", true);
        java.lang.String str4 = dataflowJobConfiguration3.getJobClass();
        java.lang.String str5 = dataflowJobConfiguration3.getJobClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ee6144a8-6164-451f-9e3c-e3c85113af90" + "'", str4.equals("ee6144a8-6164-451f-9e3c-e3c85113af90"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ee6144a8-6164-451f-9e3c-e3c85113af90" + "'", str5.equals("ee6144a8-6164-451f-9e3c-e3c85113af90"));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        boolean b13 = taskContext11.equals((java.lang.Object) '#');
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType14 = com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL;
        boolean b15 = taskContext11.equals((java.lang.Object) databaseType14);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo16 = taskContext11.getMetaInfo();
        java.lang.String str17 = taskContext11.getSlaveId();
        taskContext11.setSlaveId("df8fe0e7-4a95-446e-b208-09d46cd60388");
        java.lang.String str20 = taskContext11.getSlaveId();
        java.lang.String str21 = taskContext11.getSlaveId();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + databaseType14 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL + "'", databaseType14.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.MySQL));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(metaInfo16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "128.208.4.97" + "'", str17.equals("128.208.4.97"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "df8fe0e7-4a95-446e-b208-09d46cd60388" + "'", str20.equals("df8fe0e7-4a95-446e-b208-09d46cd60388"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "df8fe0e7-4a95-446e-b208-09d46cd60388" + "'", str21.equals("df8fe0e7-4a95-446e-b208-09d46cd60388"));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i10 = new java.util.ArrayList<java.lang.Integer>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i10, i_array9);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo12 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i10);
        java.util.List<java.lang.Integer> list_i13 = metaInfo12.getShardingItems();
        java.lang.String str14 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i13);
        com.dangdang.ddframe.job.context.ExecutionType executionType15 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext17 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i13, executionType15, "128.208.4.97");
        com.dangdang.ddframe.job.context.TaskContext taskContext19 = new com.dangdang.ddframe.job.context.TaskContext("b0ada993-d6e1-4910-ac71-a51c3210b1d9", (java.util.List<java.lang.Integer>) arraylist_i4, executionType15, "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!");
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i24 = new java.util.ArrayList<java.lang.Integer>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i24, i_array23);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo26 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i24);
        java.util.List<java.lang.Integer> list_i27 = metaInfo26.getShardingItems();
        java.lang.String str28 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i27);
        com.dangdang.ddframe.job.context.ExecutionType executionType29 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext31 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i27, executionType29, "128.208.4.97");
        java.lang.String str32 = taskContext31.getSlaveId();
        java.lang.String str33 = taskContext31.getId();
        com.dangdang.ddframe.job.context.ExecutionType executionType34 = taskContext31.getType();
        com.dangdang.ddframe.job.context.TaskContext taskContext35 = new com.dangdang.ddframe.job.context.TaskContext("f3d9c62c-8c49-4724-b388-fb7fcd70f041", (java.util.List<java.lang.Integer>) arraylist_i4, executionType34);
        java.lang.String str36 = taskContext35.getId();
        taskContext35.setSlaveId("0c9bb7cc-29ec-4797-92df-238f1fe42cce");
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(list_i13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10" + "'", str14.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType15 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType15.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(list_i27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10" + "'", str28.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType29 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType29.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "128.208.4.97" + "'", str32.equals("128.208.4.97"));
        org.junit.Assert.assertTrue("'" + executionType34 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType34.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 52 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source9 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source15 = null;
        java.lang.Integer[] i_array19 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i20 = new java.util.ArrayList<java.lang.Integer>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i20, i_array19);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo22 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i20);
        java.util.List<java.lang.Integer> list_i23 = metaInfo22.getShardingItems();
        java.lang.String str24 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i23);
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext27 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i23, executionType25, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state29 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source36 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType37 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state39 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent41 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source36, executionType37, "aff97160474a056e838c1f721af01edf", state39, "");
        java.lang.String str42 = jobStatusTraceEvent41.getId();
        java.lang.String str43 = jobStatusTraceEvent41.getShardingItems();
        java.util.Date date44 = jobStatusTraceEvent41.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source48 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType49 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state51 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent53 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source48, executionType49, "aff97160474a056e838c1f721af01edf", state51, "");
        java.lang.String str54 = jobStatusTraceEvent53.getId();
        java.lang.String str55 = jobStatusTraceEvent53.getShardingItems();
        java.util.Date date56 = jobStatusTraceEvent53.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics57 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date44, date56);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent58 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source15, executionType25, "128.208.4.97", state29, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date44);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state60 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent62 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("ee6144a8-6164-451f-9e3c-e3c85113af90", "d41d8cd98f00b204e9800998ecf8427e", "720a31a1-6e31-4409-abe8-90f69964d02f", source9, executionType25, "8d4a5c91-8b38-4f21-ac3a-6f969ca8e9f7", state60, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4");
        com.dangdang.ddframe.job.context.TaskContext taskContext64 = new com.dangdang.ddframe.job.context.TaskContext("738e59ae-440b-4d0d-b302-7d7b5d191676", (java.util.List<java.lang.Integer>) arraylist_i4, executionType25, "8ee51d76-184c-4da8-93f2-731fbd1db162");
        java.lang.Integer[] i_array68 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i69 = new java.util.ArrayList<java.lang.Integer>();
        boolean b70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i69, i_array68);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo71 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i69);
        java.util.List<java.lang.Integer> list_i72 = metaInfo71.getShardingItems();
        java.lang.String str73 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i72);
        com.dangdang.ddframe.job.context.ExecutionType executionType74 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext76 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i72, executionType74, "128.208.4.97");
        java.lang.String str77 = taskContext76.getSlaveId();
        boolean b79 = taskContext76.equals((java.lang.Object) "caca01be-67a2-4bf3-8c3c-ce17d9494590");
        com.dangdang.ddframe.job.context.ExecutionType executionType80 = taskContext76.getType();
        com.dangdang.ddframe.job.context.TaskContext taskContext81 = new com.dangdang.ddframe.job.context.TaskContext("691c037e-5974-4f6f-9291-8cbbe517e2b3", (java.util.List<java.lang.Integer>) arraylist_i4, executionType80);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + source9 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER + "'", source9.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER));
        org.junit.Assert.assertNotNull(i_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(list_i23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "10" + "'", str24.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType25 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType25.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state29 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state29.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "6239bbac-4a18-43f5-8b0f-65e7504770ca" + "'", str42.equals("6239bbac-4a18-43f5-8b0f-65e7504770ca"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str43.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "8a1f4846-820d-4b9c-80df-dd3e49ef1271" + "'", str54.equals("8a1f4846-820d-4b9c-80df-dd3e49ef1271"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str55.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertTrue("'" + state60 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED + "'", state60.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED));
        org.junit.Assert.assertNotNull(i_array68);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(list_i72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "10" + "'", str73.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType74 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType74.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "128.208.4.97" + "'", str77.equals("128.208.4.97"));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue("'" + executionType80 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType80.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        try {
            java.lang.String str1 = com.dangdang.ddframe.job.context.TaskContext.getIdForUnassignedSlave("84c79347-e3aa-4814-a72d-875e1208cc22");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject executorServiceObject2 = new com.dangdang.ddframe.job.util.concurrent.ExecutorServiceObject("e6fbe543-b3f7-45cd-ad16-7a4c8325f2cd", (int) (short) 100);
        int i3 = executorServiceObject2.getWorkQueueSize();
        int i4 = executorServiceObject2.getActiveThreadCount();
        boolean b5 = executorServiceObject2.isShutdown();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        java.lang.String str7 = jobCoreConfiguration6.getJobName();
        com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration simpleJobConfiguration9 = new com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration(jobCoreConfiguration6, "81674592-e7c3-4a59-8193-2fadeac4cbd4");
        java.lang.String str10 = simpleJobConfiguration9.getJobClass();
        com.dangdang.ddframe.job.api.JobType jobType11 = simpleJobConfiguration9.getJobType();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "81674592-e7c3-4a59-8193-2fadeac4cbd4" + "'", str10.equals("81674592-e7c3-4a59-8193-2fadeac4cbd4"));
        org.junit.Assert.assertTrue("'" + jobType11 + "' != '" + com.dangdang.ddframe.job.api.JobType.SIMPLE + "'", jobType11.equals(com.dangdang.ddframe.job.api.JobType.SIMPLE));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("d0cc04e7-efe9-4167-a154-8b65210ed06d", "9f29874b-7365-4fc9-aa02-e897d5bb5dcb");
        int i3 = zookeeperConfiguration2.getMaxSleepTimeMilliseconds();
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds((int) (byte) -1);
        java.lang.String str6 = zookeeperConfiguration2.getNamespace();
        org.junit.Assert.assertTrue(i3 == 3000);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9f29874b-7365-4fc9-aa02-e897d5bb5dcb" + "'", str6.equals("9f29874b-7365-4fc9-aa02-e897d5bb5dcb"));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        try {
            com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType1 = com.dangdang.ddframe.job.event.rdb.DatabaseType.valueFrom("7e7f7ce1-ce32-4b31-9d60-5c9caccd6a40");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        java.lang.String str19 = condition18.getOrder();
        java.lang.String str20 = condition18.getSort();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj21 = condition18.getFields();
        int i22 = condition18.getPage();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "a78813ac-459e-4ad1-8874-0d8de32f3ee0" + "'", str13.equals("a78813ac-459e-4ad1-8874-0d8de32f3ee0"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ecc20b57-52a5-4026-b6c0-d9395b02f7cf" + "'", str19.equals("ecc20b57-52a5-4026-b6c0-d9395b02f7cf"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str20.equals("76790358-3199-4060-a536-0f953a59b404"));
        org.junit.Assert.assertNull(map_str_obj21);
        org.junit.Assert.assertTrue(i22 == 100);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration dataflowJobConfiguration10 = new com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration(jobCoreConfiguration6, "3d746adc-0573-435e-b1ec-124d7372fbc5", true);
        java.lang.String str11 = jobCoreConfiguration6.getJobName();
        java.lang.String str12 = jobCoreConfiguration6.getShardingItemParameters();
        com.dangdang.ddframe.job.executor.handler.JobProperties jobProperties13 = jobCoreConfiguration6.getJobProperties();
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum14 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER;
        java.lang.String str15 = jobPropertiesEnum14.getKey();
        java.lang.String str16 = jobProperties13.get(jobPropertiesEnum14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(jobProperties13);
        org.junit.Assert.assertTrue("'" + jobPropertiesEnum14 + "' != '" + com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER + "'", jobPropertiesEnum14.equals(com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "job_exception_handler" + "'", str15.equals("job_exception_handler"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler" + "'", str16.equals("com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler"));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("aff97160474a056e838c1f721af01edf", "", (int) (short) -1, "d0be6b2b-9c52-490d-b882-bc3fca29f622", map_i_str4, 0);
        java.lang.String str7 = shardingContexts6.getJobParameter();
        java.lang.String str8 = shardingContexts6.getTaskId();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "d0be6b2b-9c52-490d-b882-bc3fca29f622" + "'", str7.equals("d0be6b2b-9c52-490d-b882-bc3fca29f622"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str8.equals("aff97160474a056e838c1f721af01edf"));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable6 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) appConfigurationException4, "8f0e9b3e-3dfb-4d65-bfaa-40f368c4e0e8");
        java.lang.String str7 = com.dangdang.ddframe.job.exception.ExceptionUtil.transform((java.lang.Throwable) appConfigurationException4);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.GeneratedConstructorAccessor2.newInstance(Unknown Source)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n"));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        taskContext11.setSlaveId("ad834bbb-98e2-4ac3-a06e-cbb95d037e47");
        taskContext11.setIdle(false);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException10 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array9);
        java.lang.String str11 = appConfigurationException10.toString();
        appConfigurationException4.addSuppressed((java.lang.Throwable) appConfigurationException10);
        java.lang.String str13 = appConfigurationException10.toString();
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable15 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) appConfigurationException10, "e9f096bf-eccd-48e7-9815-8e742ae30a5d");
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str13.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("d0cc04e7-efe9-4167-a154-8b65210ed06d", "9f29874b-7365-4fc9-aa02-e897d5bb5dcb");
        int i3 = zookeeperConfiguration2.getMaxSleepTimeMilliseconds();
        zookeeperConfiguration2.setDigest("");
        org.junit.Assert.assertTrue(i3 == 3000);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.curator.framework.CuratorFramework curatorFramework1 = null;
        com.dangdang.ddframe.job.reg.base.ElectionCandidate electionCandidate3 = null;
        try {
            com.dangdang.ddframe.job.reg.zookeeper.ZookeeperElectionService zookeeperElectionService4 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperElectionService("b65b7720-8f1b-413e-8d75-4058549b8fb6", curatorFramework1, "3e6632c8-6756-4241-a56b-66bec52379c6", electionCandidate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.lang.Integer[] i_array2 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i3 = new java.util.ArrayList<java.lang.Integer>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i3, i_array2);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo5 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i3);
        com.dangdang.ddframe.job.event.rdb.DatabaseType databaseType6 = com.dangdang.ddframe.job.event.rdb.DatabaseType.Oracle;
        boolean b7 = metaInfo5.equals((java.lang.Object) databaseType6);
        boolean b9 = metaInfo5.equals((java.lang.Object) 'a');
        java.util.List<java.lang.Integer> list_i10 = metaInfo5.getShardingItems();
        java.lang.String str11 = metaInfo5.toString();
        java.lang.String str12 = metaInfo5.toString();
        java.util.List<java.lang.Integer> list_i13 = metaInfo5.getShardingItems();
        org.junit.Assert.assertNotNull(i_array2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + databaseType6 + "' != '" + com.dangdang.ddframe.job.event.rdb.DatabaseType.Oracle + "'", databaseType6.equals(com.dangdang.ddframe.job.event.rdb.DatabaseType.Oracle));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_i10);
        org.junit.Assert.assertNotNull(list_i13);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        java.lang.String str7 = jobCoreConfiguration6.getJobName();
        java.lang.String str8 = jobCoreConfiguration6.getJobName();
        int i9 = jobCoreConfiguration6.getShardingTotalCount();
        java.lang.String str10 = jobCoreConfiguration6.getShardingItemParameters();
        java.lang.String str11 = jobCoreConfiguration6.getDescription();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str7.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str8.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        java.lang.String str8 = jobCoreConfiguration6.getJobParameter();
        boolean b9 = jobCoreConfiguration6.isMisfire();
        com.dangdang.ddframe.job.config.script.ScriptJobConfiguration scriptJobConfiguration11 = new com.dangdang.ddframe.job.config.script.ScriptJobConfiguration(jobCoreConfiguration6, "1ce254ed-faf6-403e-ad63-b312817ceab9");
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration12 = scriptJobConfiguration11.getCoreConfig();
        java.lang.String str13 = scriptJobConfiguration11.getJobClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(jobCoreConfiguration12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "com.dangdang.ddframe.job.api.script.ScriptJob" + "'", str13.equals("com.dangdang.ddframe.job.api.script.ScriptJob"));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str4 = null;
        com.dangdang.ddframe.job.executor.ShardingContexts shardingContexts6 = new com.dangdang.ddframe.job.executor.ShardingContexts("-1,1,10", "aff97160474a056e838c1f721af01edf", (int) '4', "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", map_i_str4, (int) (byte) -1);
        shardingContexts6.setCurrentJobEventSamplingCount(3);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder7.failover(true);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration10 = builder7.build();
        com.dangdang.ddframe.job.config.script.ScriptJobConfiguration scriptJobConfiguration12 = new com.dangdang.ddframe.job.config.script.ScriptJobConfiguration(jobCoreConfiguration10, "314bc191-4988-40e5-b8b8-571c85349cdd");
        boolean b13 = jobCoreConfiguration10.isFailover();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(jobCoreConfiguration10);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 100 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        java.lang.Integer[] i_array9 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i10 = new java.util.ArrayList<java.lang.Integer>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i10, i_array9);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo12 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i10);
        java.util.List<java.lang.Integer> list_i13 = metaInfo12.getShardingItems();
        java.lang.String str14 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i13);
        com.dangdang.ddframe.job.context.ExecutionType executionType15 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext17 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i13, executionType15, "128.208.4.97");
        com.dangdang.ddframe.job.context.TaskContext taskContext19 = new com.dangdang.ddframe.job.context.TaskContext("b0ada993-d6e1-4910-ac71-a51c3210b1d9", (java.util.List<java.lang.Integer>) arraylist_i4, executionType15, "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!");
        java.lang.Integer[] i_array23 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i24 = new java.util.ArrayList<java.lang.Integer>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i24, i_array23);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo26 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i24);
        java.util.List<java.lang.Integer> list_i27 = metaInfo26.getShardingItems();
        java.lang.String str28 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i27);
        com.dangdang.ddframe.job.context.ExecutionType executionType29 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext31 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i27, executionType29, "128.208.4.97");
        java.lang.String str32 = taskContext31.getSlaveId();
        java.lang.String str33 = taskContext31.getId();
        com.dangdang.ddframe.job.context.ExecutionType executionType34 = taskContext31.getType();
        com.dangdang.ddframe.job.context.TaskContext taskContext35 = new com.dangdang.ddframe.job.context.TaskContext("f3d9c62c-8c49-4724-b388-fb7fcd70f041", (java.util.List<java.lang.Integer>) arraylist_i4, executionType34);
        java.lang.String str36 = taskContext35.getId();
        taskContext35.setIdle(false);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(i_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(list_i13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "10" + "'", str14.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType15 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType15.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertNotNull(i_array23);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(list_i27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "10" + "'", str28.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType29 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType29.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "128.208.4.97" + "'", str32.equals("128.208.4.97"));
        org.junit.Assert.assertTrue("'" + executionType34 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType34.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException7 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array6);
        com.dangdang.ddframe.job.exception.JobExecutionEnvironmentException jobExecutionEnvironmentException8 = new com.dangdang.ddframe.job.exception.JobExecutionEnvironmentException("368c90ac-7598-478d-b2c9-bb000e21e780", obj_array6);
        com.dangdang.ddframe.job.exception.JobExecutionEnvironmentException jobExecutionEnvironmentException9 = new com.dangdang.ddframe.job.exception.JobExecutionEnvironmentException("5b0e877d-c398-4f25-b46f-3a03e4ab95a4", obj_array6);
        com.dangdang.ddframe.job.exception.JobConfigurationException jobConfigurationException10 = new com.dangdang.ddframe.job.exception.JobConfigurationException("bb5ca96a-c0a9-42bb-ba4a-12c1abc98a56", obj_array6);
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException11 = new com.dangdang.ddframe.job.exception.AppConfigurationException((java.lang.Throwable) jobConfigurationException10);
        org.junit.Assert.assertNotNull(obj_array6);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.util.Date date1 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics2 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date1);
        java.util.Date date3 = jobRunningStatistics2.getStatisticsTime();
        org.junit.Assert.assertNull(date3);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.lang.Object[] obj_array3 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException4 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array3);
        java.lang.String str5 = appConfigurationException4.toString();
        java.lang.Object[] obj_array9 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException10 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array9);
        java.lang.String str11 = appConfigurationException10.toString();
        appConfigurationException4.addSuppressed((java.lang.Throwable) appConfigurationException10);
        com.dangdang.ddframe.job.reg.exception.RegException regException13 = new com.dangdang.ddframe.job.reg.exception.RegException((java.lang.Exception) appConfigurationException10);
        java.lang.Object[] obj_array17 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException18 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array17);
        java.lang.String str19 = appConfigurationException18.toString();
        java.lang.Object[] obj_array23 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException24 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array23);
        java.lang.String str25 = appConfigurationException24.toString();
        appConfigurationException18.addSuppressed((java.lang.Throwable) appConfigurationException24);
        java.lang.Throwable throwable27 = null;
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException28 = new com.dangdang.ddframe.job.exception.JobSystemException(throwable27);
        appConfigurationException18.addSuppressed((java.lang.Throwable) jobSystemException28);
        com.dangdang.ddframe.job.event.JobEventListenerConfigurationException jobEventListenerConfigurationException30 = new com.dangdang.ddframe.job.event.JobEventListenerConfigurationException((java.lang.Exception) appConfigurationException18);
        appConfigurationException10.addSuppressed((java.lang.Throwable) jobEventListenerConfigurationException30);
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException32 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) jobEventListenerConfigurationException30);
        java.lang.String str33 = jobSystemException32.toString();
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException34 = new com.dangdang.ddframe.job.exception.AppConfigurationException((java.lang.Throwable) jobSystemException32);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str5.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str11.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str19.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(obj_array23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str25.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "com.dangdang.ddframe.job.exception.JobSystemException: com.dangdang.ddframe.job.event.JobEventListenerConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str33.equals("com.dangdang.ddframe.job.exception.JobSystemException: com.dangdang.ddframe.job.event.JobEventListenerConfigurationException: com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.util.List<java.lang.Integer> list_i8 = metaInfo6.getShardingItems();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source18 = null;
        java.lang.Integer[] i_array22 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i23 = new java.util.ArrayList<java.lang.Integer>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i23, i_array22);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo25 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i23);
        java.util.List<java.lang.Integer> list_i26 = metaInfo25.getShardingItems();
        java.lang.String str27 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i26);
        com.dangdang.ddframe.job.context.ExecutionType executionType28 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext30 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i26, executionType28, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state32 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source39 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType40 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state42 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent44 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source39, executionType40, "aff97160474a056e838c1f721af01edf", state42, "");
        java.lang.String str45 = jobStatusTraceEvent44.getId();
        java.lang.String str46 = jobStatusTraceEvent44.getShardingItems();
        java.util.Date date47 = jobStatusTraceEvent44.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source51 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType52 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state54 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent56 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source51, executionType52, "aff97160474a056e838c1f721af01edf", state54, "");
        java.lang.String str57 = jobStatusTraceEvent56.getId();
        java.lang.String str58 = jobStatusTraceEvent56.getShardingItems();
        java.util.Date date59 = jobStatusTraceEvent56.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics60 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date47, date59);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent61 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source18, executionType28, "128.208.4.97", state32, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date47);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state63 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent65 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("ee6144a8-6164-451f-9e3c-e3c85113af90", "d41d8cd98f00b204e9800998ecf8427e", "720a31a1-6e31-4409-abe8-90f69964d02f", source12, executionType28, "8d4a5c91-8b38-4f21-ac3a-6f969ca8e9f7", state63, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4");
        com.dangdang.ddframe.job.context.TaskContext taskContext67 = new com.dangdang.ddframe.job.context.TaskContext("a39dffc1-a1d1-44bb-b4f1-7fadc6c31063", list_i8, executionType28, "25f20532-5037-498d-a89d-07cd1c6006bc");
        taskContext67.setSlaveId("0c9bb7cc-29ec-4797-92df-238f1fe42cce");
        taskContext67.setSlaveId("4d5a8f77-a578-4395-ae2c-9fecec9ed514");
        java.lang.String str72 = taskContext67.getTaskName();
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertNotNull(list_i8);
        org.junit.Assert.assertTrue("'" + source12 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER + "'", source12.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source.CLOUD_SCHEDULER));
        org.junit.Assert.assertNotNull(i_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(list_i26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "10" + "'", str27.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType28 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType28.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state32 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state32.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "20a6df94-2225-4cdf-863f-54b728a56edd" + "'", str45.equals("20a6df94-2225-4cdf-863f-54b728a56edd"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str46.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "779a36a5-e507-4545-8f48-715fe6c18288" + "'", str57.equals("779a36a5-e507-4545-8f48-715fe6c18288"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str58.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertTrue("'" + state63 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED + "'", state63.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FAILED));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval3 = com.dangdang.ddframe.job.statistics.StatisticInterval.DAY;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source21 = null;
        java.lang.Integer[] i_array25 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i26 = new java.util.ArrayList<java.lang.Integer>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i26, i_array25);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo28 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i26);
        java.util.List<java.lang.Integer> list_i29 = metaInfo28.getShardingItems();
        java.lang.String str30 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i29);
        com.dangdang.ddframe.job.context.ExecutionType executionType31 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext33 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i29, executionType31, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state35 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source42 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType43 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state45 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent47 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source42, executionType43, "aff97160474a056e838c1f721af01edf", state45, "");
        java.lang.String str48 = jobStatusTraceEvent47.getId();
        java.lang.String str49 = jobStatusTraceEvent47.getShardingItems();
        java.util.Date date50 = jobStatusTraceEvent47.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source54 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType55 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state57 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent59 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source54, executionType55, "aff97160474a056e838c1f721af01edf", state57, "");
        java.lang.String str60 = jobStatusTraceEvent59.getId();
        java.lang.String str61 = jobStatusTraceEvent59.getShardingItems();
        java.util.Date date62 = jobStatusTraceEvent59.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics63 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date50, date62);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent64 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source21, executionType31, "128.208.4.97", state35, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date50);
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics65 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics((long) (byte) 0, 1, 52, statisticInterval3, date15, date50);
        java.util.Date date66 = taskResultStatistics65.getCreationTime();
        java.util.Date date67 = taskResultStatistics65.getStatisticsTime();
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval68 = taskResultStatistics65.getStatisticInterval();
        java.lang.String str69 = statisticInterval68.getCron();
        org.junit.Assert.assertTrue("'" + statisticInterval3 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval3.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "9056419e-da20-4fd2-b981-de8ea9239435" + "'", str13.equals("9056419e-da20-4fd2-b981-de8ea9239435"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertNotNull(i_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(list_i29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "10" + "'", str30.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType31 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType31.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state35 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state35.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "9b087d6b-1652-4326-8f4c-4949158ae7b3" + "'", str48.equals("9b087d6b-1652-4326-8f4c-4949158ae7b3"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str49.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "d0974512-1a28-4ce9-b0b9-2ba0d8e8322e" + "'", str60.equals("d0974512-1a28-4ce9-b0b9-2ba0d8e8322e"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str61.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertTrue("'" + statisticInterval68 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval68.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "0 0 0 * * ?" + "'", str69.equals("0 0 0 * * ?"));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source6 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType7 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state9 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent11 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source6, executionType7, "aff97160474a056e838c1f721af01edf", state9, "");
        java.lang.String str12 = jobStatusTraceEvent11.getId();
        java.lang.String str13 = jobStatusTraceEvent11.getShardingItems();
        java.util.Date date14 = jobStatusTraceEvent11.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source18 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType19 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state21 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent23 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source18, executionType19, "aff97160474a056e838c1f721af01edf", state21, "");
        java.lang.String str24 = jobStatusTraceEvent23.getId();
        java.lang.String str25 = jobStatusTraceEvent23.getShardingItems();
        java.util.Date date26 = jobStatusTraceEvent23.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics27 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date14, date26);
        com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics jobRegisterStatistics28 = new com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics(0, date14);
        int i29 = jobRegisterStatistics28.getRegisteredCount();
        java.util.Date date30 = jobRegisterStatistics28.getStatisticsTime();
        long long31 = jobRegisterStatistics28.getId();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "13b67b31-1c86-4bbc-b36b-308883b91549" + "'", str12.equals("13b67b31-1c86-4bbc-b36b-308883b91549"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str13.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "8fc8faad-9c98-4e94-aaa2-7eb34e8bee3e" + "'", str24.equals("8fc8faad-9c98-4e94-aaa2-7eb34e8bee3e"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str25.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertTrue(long31 == 0L);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n");
        zookeeperConfiguration2.setSessionTimeoutMilliseconds((int) (short) 100);
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds(1);
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter7 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        zookeeperConfiguration2.setBaseSleepTimeMilliseconds((int) (short) -1);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration zookeeperConfiguration2 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration("128.208.4.97", "-1,1,10");
        zookeeperConfiguration2.setDigest("aff97160474a056e838c1f721af01edf");
        zookeeperConfiguration2.setMaxSleepTimeMilliseconds((int) 'a');
        int i7 = zookeeperConfiguration2.getMaxRetries();
        com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter zookeeperRegistryCenter8 = new com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter(zookeeperConfiguration2);
        try {
            zookeeperRegistryCenter8.persistEphemeralSequential("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n");
            org.junit.Assert.fail("Expected exception of type com.dangdang.ddframe.job.reg.exception.RegException");
        } catch (com.dangdang.ddframe.job.reg.exception.RegException e) {
        }
        org.junit.Assert.assertTrue(i7 == 3);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource executionSource5 = com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source12 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType13 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state15 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent17 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source12, executionType13, "aff97160474a056e838c1f721af01edf", state15, "");
        java.lang.String str18 = jobStatusTraceEvent17.getId();
        java.lang.String str19 = jobStatusTraceEvent17.getShardingItems();
        java.util.Date date20 = jobStatusTraceEvent17.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics33 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date20, date32);
        java.util.Date date35 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics36 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date35);
        java.util.Date date37 = jobRunningStatistics36.getCreationTime();
        java.lang.Object[] obj_array42 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException43 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array42);
        java.lang.String str44 = appConfigurationException43.toString();
        java.lang.Throwable[] throwable_array45 = appConfigurationException43.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException46 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException43);
        com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable jobExecutionEventThrowable48 = new com.dangdang.ddframe.job.event.type.JobExecutionEventThrowable((java.lang.Throwable) jobSystemException46, "aff97160474a056e838c1f721af01edf");
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent49 = new com.dangdang.ddframe.job.event.type.JobExecutionEvent("754a6b00-33cb-4148-ae8d-e84e632e718e", "-1,1,10", "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", "128.208.4.97", "754a6b00-33cb-4148-ae8d-e84e632e718e", executionSource5, (int) (byte) -1, date20, date37, false, jobExecutionEventThrowable48);
        java.util.Date date51 = null;
        com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics jobRunningStatistics52 = new com.dangdang.ddframe.job.statistics.type.job.JobRunningStatistics(0, date51);
        java.util.Date date53 = jobRunningStatistics52.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date53);
        java.lang.Object[] obj_array58 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException59 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array58);
        java.lang.String str60 = appConfigurationException59.toString();
        java.lang.Throwable[] throwable_array61 = appConfigurationException59.getSuppressed();
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException62 = new com.dangdang.ddframe.job.exception.JobSystemException((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobExecutionEvent jobExecutionEvent63 = jobExecutionEvent49.executionFailure((java.lang.Throwable) appConfigurationException59);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source67 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType68 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state70 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent72 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source67, executionType68, "aff97160474a056e838c1f721af01edf", state70, "");
        java.lang.String str73 = jobStatusTraceEvent72.getId();
        java.lang.String str74 = jobStatusTraceEvent72.getSlaveId();
        java.lang.String str75 = jobStatusTraceEvent72.getShardingItems();
        java.util.Date date76 = jobStatusTraceEvent72.getCreationTime();
        java.util.Date date77 = jobStatusTraceEvent72.getCreationTime();
        jobExecutionEvent49.setCompleteTime(date77);
        boolean b79 = jobExecutionEvent49.isSuccess();
        org.junit.Assert.assertTrue("'" + executionSource5 + "' != '" + com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE + "'", executionSource5.equals(com.dangdang.ddframe.job.event.type.JobExecutionEvent.ExecutionSource.MISFIRE));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "9c104fe8-bf51-4b2a-ac21-ee3d1d3d35a9" + "'", str18.equals("9c104fe8-bf51-4b2a-ac21-ee3d1d3d35a9"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str19.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "b5fefcaa-7a4b-47ff-9d3b-ff9f3a07cb39" + "'", str30.equals("b5fefcaa-7a4b-47ff-9d3b-ff9f3a07cb39"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertNotNull(obj_array42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str44.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array45);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertNotNull(obj_array58);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!" + "'", str60.equals("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!"));
        org.junit.Assert.assertNotNull(throwable_array61);
        org.junit.Assert.assertNotNull(jobExecutionEvent63);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "4b3a0218-fd4e-4b98-9566-9beac359911b" + "'", str73.equals("4b3a0218-fd4e-4b98-9566-9beac359911b"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str74.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str75.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum0 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER;
        java.lang.String str1 = jobPropertiesEnum0.getKey();
        java.lang.String str2 = jobPropertiesEnum0.getDefaultValue();
        org.junit.Assert.assertTrue("'" + jobPropertiesEnum0 + "' != '" + com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER + "'", jobPropertiesEnum0.equals(com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "job_exception_handler" + "'", str1.equals("job_exception_handler"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler" + "'", str2.equals("com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler"));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        java.lang.String str7 = jobCoreConfiguration6.getDescription();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.lang.Object[] obj_array6 = new java.lang.Object[] { '4', 0.0f };
        com.dangdang.ddframe.job.exception.AppConfigurationException appConfigurationException7 = new com.dangdang.ddframe.job.exception.AppConfigurationException("hi!", obj_array6);
        com.dangdang.ddframe.job.exception.JobExecutionEnvironmentException jobExecutionEnvironmentException8 = new com.dangdang.ddframe.job.exception.JobExecutionEnvironmentException("368c90ac-7598-478d-b2c9-bb000e21e780", obj_array6);
        com.dangdang.ddframe.job.exception.JobConfigurationException jobConfigurationException9 = new com.dangdang.ddframe.job.exception.JobConfigurationException("e9f096bf-eccd-48e7-9815-8e742ae30a5d", obj_array6);
        com.dangdang.ddframe.job.exception.JobSystemException jobSystemException10 = new com.dangdang.ddframe.job.exception.JobSystemException("3ad77797-063b-43c2-8415-9c90f8e2e3c5", obj_array6);
        org.junit.Assert.assertNotNull(obj_array6);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder7 = builder5.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder9 = builder7.jobParameter("");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder11 = builder7.description("5153ac74-7541-457e-bef8-c9969e17a79d");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder13 = builder7.jobParameter("76790358-3199-4060-a536-0f953a59b404");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.dangdang.ddframe.job.executor.handler.JobProperties jobProperties0 = new com.dangdang.ddframe.job.executor.handler.JobProperties();
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum1 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER;
        java.lang.String str2 = jobPropertiesEnum1.getKey();
        java.lang.String str3 = jobProperties0.get(jobPropertiesEnum1);
        com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum jobPropertiesEnum4 = com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER;
        java.lang.Class<?> cls5 = jobPropertiesEnum4.getClassType();
        java.lang.String str6 = jobPropertiesEnum4.getDefaultValue();
        java.lang.String str7 = jobProperties0.get(jobPropertiesEnum4);
        org.junit.Assert.assertTrue("'" + jobPropertiesEnum1 + "' != '" + com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER + "'", jobPropertiesEnum1.equals(com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.JOB_EXCEPTION_HANDLER));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "job_exception_handler" + "'", str2.equals("job_exception_handler"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler" + "'", str3.equals("com.dangdang.ddframe.job.executor.handler.impl.DefaultJobExceptionHandler"));
        org.junit.Assert.assertTrue("'" + jobPropertiesEnum4 + "' != '" + com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER + "'", jobPropertiesEnum4.equals(com.dangdang.ddframe.job.executor.handler.JobProperties.JobPropertiesEnum.EXECUTOR_SERVICE_HANDLER));
        org.junit.Assert.assertNotNull(cls5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.dangdang.ddframe.job.executor.handler.impl.DefaultExecutorServiceHandler" + "'", str6.equals("com.dangdang.ddframe.job.executor.handler.impl.DefaultExecutorServiceHandler"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.dangdang.ddframe.job.executor.handler.impl.DefaultExecutorServiceHandler" + "'", str7.equals("com.dangdang.ddframe.job.executor.handler.impl.DefaultExecutorServiceHandler"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder3 = com.dangdang.ddframe.job.config.JobCoreConfiguration.newBuilder("com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "aff97160474a056e838c1f721af01edf", (int) '4');
        com.dangdang.ddframe.job.config.JobCoreConfiguration.Builder builder5 = builder3.misfire(false);
        com.dangdang.ddframe.job.config.JobCoreConfiguration jobCoreConfiguration6 = builder3.build();
        boolean b7 = jobCoreConfiguration6.isFailover();
        java.lang.String str8 = jobCoreConfiguration6.getShardingItemParameters();
        java.lang.String str9 = jobCoreConfiguration6.getDescription();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(jobCoreConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source7 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType8 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state10 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent12 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source7, executionType8, "aff97160474a056e838c1f721af01edf", state10, "");
        java.lang.String str13 = jobStatusTraceEvent12.getId();
        java.lang.String str14 = jobStatusTraceEvent12.getShardingItems();
        java.util.Date date15 = jobStatusTraceEvent12.getCreationTime();
        java.util.Date date16 = null;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition condition18 = new com.dangdang.ddframe.job.event.rdb.JobEventRdbSearch.Condition((int) (byte) 100, (int) (byte) 100, "76790358-3199-4060-a536-0f953a59b404", "ecc20b57-52a5-4026-b6c0-d9395b02f7cf", date15, date16, map_str_obj17);
        java.lang.String str19 = condition18.getSort();
        java.util.Date date20 = condition18.getStartTime();
        java.util.Date date21 = condition18.getEndTime();
        java.lang.String str22 = condition18.getSort();
        java.lang.String str23 = condition18.getOrder();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "4cb0a421-b7c6-4d95-a2aa-653b167876ee" + "'", str13.equals("4cb0a421-b7c6-4d95-a2aa-653b167876ee"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str14.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str19.equals("76790358-3199-4060-a536-0f953a59b404"));
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "76790358-3199-4060-a536-0f953a59b404" + "'", str22.equals("76790358-3199-4060-a536-0f953a59b404"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "ecc20b57-52a5-4026-b6c0-d9395b02f7cf" + "'", str23.equals("ecc20b57-52a5-4026-b6c0-d9395b02f7cf"));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source6 = null;
        java.lang.Integer[] i_array10 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i11 = new java.util.ArrayList<java.lang.Integer>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i11, i_array10);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo13 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i11);
        java.util.List<java.lang.Integer> list_i14 = metaInfo13.getShardingItems();
        java.lang.String str15 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i14);
        com.dangdang.ddframe.job.context.ExecutionType executionType16 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext18 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i14, executionType16, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state20 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source27 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType28 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state30 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent32 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source27, executionType28, "aff97160474a056e838c1f721af01edf", state30, "");
        java.lang.String str33 = jobStatusTraceEvent32.getId();
        java.lang.String str34 = jobStatusTraceEvent32.getShardingItems();
        java.util.Date date35 = jobStatusTraceEvent32.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source39 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType40 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state42 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent44 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source39, executionType40, "aff97160474a056e838c1f721af01edf", state42, "");
        java.lang.String str45 = jobStatusTraceEvent44.getId();
        java.lang.String str46 = jobStatusTraceEvent44.getShardingItems();
        java.util.Date date47 = jobStatusTraceEvent44.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics48 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date35, date47);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent49 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source6, executionType16, "128.208.4.97", state20, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date35);
        com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics jobRegisterStatistics50 = new com.dangdang.ddframe.job.statistics.type.job.JobRegisterStatistics((int) (short) 10, date35);
        long long51 = jobRegisterStatistics50.getId();
        java.util.Date date52 = jobRegisterStatistics50.getStatisticsTime();
        org.junit.Assert.assertNotNull(i_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(list_i14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "10" + "'", str15.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType16 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType16.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state20 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state20.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "b77e6ca4-fd33-495d-aab8-da1fdb1bc8ce" + "'", str33.equals("b77e6ca4-fd33-495d-aab8-da1fdb1bc8ce"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str34.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "afa188fa-f91a-4e8c-bf07-21fc6446352b" + "'", str45.equals("afa188fa-f91a-4e8c-bf07-21fc6446352b"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str46.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertTrue(long51 == 0L);
        org.junit.Assert.assertNotNull(date52);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        java.lang.Integer[] i_array3 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i4 = new java.util.ArrayList<java.lang.Integer>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i4, i_array3);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo6 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i4);
        java.util.List<java.lang.Integer> list_i7 = metaInfo6.getShardingItems();
        java.lang.String str8 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i7);
        com.dangdang.ddframe.job.context.ExecutionType executionType9 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext11 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i7, executionType9, "128.208.4.97");
        java.lang.String str12 = taskContext11.getSlaveId();
        taskContext11.setIdle(false);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo15 = taskContext11.getMetaInfo();
        java.lang.String str16 = metaInfo15.toString();
        com.dangdang.ddframe.job.statistics.StatisticInterval statisticInterval20 = com.dangdang.ddframe.job.statistics.StatisticInterval.DAY;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source24 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType25 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state27 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent29 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source24, executionType25, "aff97160474a056e838c1f721af01edf", state27, "");
        java.lang.String str30 = jobStatusTraceEvent29.getId();
        java.lang.String str31 = jobStatusTraceEvent29.getShardingItems();
        java.util.Date date32 = jobStatusTraceEvent29.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source38 = null;
        java.lang.Integer[] i_array42 = new java.lang.Integer[] { 10 };
        java.util.ArrayList<java.lang.Integer> arraylist_i43 = new java.util.ArrayList<java.lang.Integer>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) arraylist_i43, i_array42);
        com.dangdang.ddframe.job.context.TaskContext.MetaInfo metaInfo45 = new com.dangdang.ddframe.job.context.TaskContext.MetaInfo("hi!", (java.util.List<java.lang.Integer>) arraylist_i43);
        java.util.List<java.lang.Integer> list_i46 = metaInfo45.getShardingItems();
        java.lang.String str47 = com.dangdang.ddframe.job.util.config.ShardingItems.toItemsString(list_i46);
        com.dangdang.ddframe.job.context.ExecutionType executionType48 = com.dangdang.ddframe.job.context.ExecutionType.FAILOVER;
        com.dangdang.ddframe.job.context.TaskContext taskContext50 = new com.dangdang.ddframe.job.context.TaskContext("10", list_i46, executionType48, "128.208.4.97");
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state52 = com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source59 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType60 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state62 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent64 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source59, executionType60, "aff97160474a056e838c1f721af01edf", state62, "");
        java.lang.String str65 = jobStatusTraceEvent64.getId();
        java.lang.String str66 = jobStatusTraceEvent64.getShardingItems();
        java.util.Date date67 = jobStatusTraceEvent64.getCreationTime();
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.Source source71 = null;
        com.dangdang.ddframe.job.context.ExecutionType executionType72 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State state74 = null;
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent76 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("hi!", "", "aff97160474a056e838c1f721af01edf", source71, executionType72, "aff97160474a056e838c1f721af01edf", state74, "");
        java.lang.String str77 = jobStatusTraceEvent76.getId();
        java.lang.String str78 = jobStatusTraceEvent76.getShardingItems();
        java.util.Date date79 = jobStatusTraceEvent76.getCreationTime();
        com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics taskRunningStatistics80 = new com.dangdang.ddframe.job.statistics.type.task.TaskRunningStatistics((long) 0, 10, date67, date79);
        com.dangdang.ddframe.job.event.type.JobStatusTraceEvent jobStatusTraceEvent81 = new com.dangdang.ddframe.job.event.type.JobStatusTraceEvent("d0be6b2b-9c52-490d-b882-bc3fca29f622", "aff97160474a056e838c1f721af01edf", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!", "com.dangdang.ddframe.job.exception.AppConfigurationException: hi!\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat randoop.util.ConstructorReflectionCode.runReflectionCodeRaw(ConstructorReflectionCode.java:45)\n\tat randoop.util.ReflectionCode.runReflectionCode(ReflectionCode.java:44)\n\tat randoop.util.RunnerThread.executeReflectionCode(RunnerThread.java:52)\n\tat randoop.util.RunnerThread.run(RunnerThread.java:45)\n", "d41d8cd98f00b204e9800998ecf8427e", source38, executionType48, "128.208.4.97", state52, "3ad58490-9ea0-4425-8b19-6ce5272f2ca4", date67);
        com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics taskResultStatistics82 = new com.dangdang.ddframe.job.statistics.type.task.TaskResultStatistics((long) (byte) 0, 1, 52, statisticInterval20, date32, date67);
        java.util.Date date83 = taskResultStatistics82.getStatisticsTime();
        boolean b84 = metaInfo15.equals((java.lang.Object) taskResultStatistics82);
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType9 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType9.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "128.208.4.97" + "'", str12.equals("128.208.4.97"));
        org.junit.Assert.assertNotNull(metaInfo15);
        org.junit.Assert.assertTrue("'" + statisticInterval20 + "' != '" + com.dangdang.ddframe.job.statistics.StatisticInterval.DAY + "'", statisticInterval20.equals(com.dangdang.ddframe.job.statistics.StatisticInterval.DAY));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "b3ee5c46-8b92-47ce-a6c7-585a4884f597" + "'", str30.equals("b3ee5c46-8b92-47ce-a6c7-585a4884f597"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str31.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertNotNull(i_array42);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(list_i46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "10" + "'", str47.equals("10"));
        org.junit.Assert.assertTrue("'" + executionType48 + "' != '" + com.dangdang.ddframe.job.context.ExecutionType.FAILOVER + "'", executionType48.equals(com.dangdang.ddframe.job.context.ExecutionType.FAILOVER));
        org.junit.Assert.assertTrue("'" + state52 + "' != '" + com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED + "'", state52.equals(com.dangdang.ddframe.job.event.type.JobStatusTraceEvent.State.TASK_FINISHED));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "341a6cc0-b296-4036-a804-a63e459f3880" + "'", str65.equals("341a6cc0-b296-4036-a804-a63e459f3880"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str66.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "26455ed0-27d0-4404-866c-876f76b7f231" + "'", str77.equals("26455ed0-27d0-4404-866c-876f76b7f231"));
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "aff97160474a056e838c1f721af01edf" + "'", str78.equals("aff97160474a056e838c1f721af01edf"));
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertTrue(b84 == false);
    }
}
