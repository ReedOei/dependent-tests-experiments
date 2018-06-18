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
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils dataStoreCacheUpgradeUtils0 = new org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.datastore.AbstractDataStoreService.PROP_CACHE_SIZE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "cacheSizeInMB" + "'", str0.equals("cacheSizeInMB"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration.OP_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Blob migration" + "'", str0.equals("Blob migration"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.File file0 = null;
        java.io.File file1 = null;
        try {
            org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file0, file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.jackrabbit.oak.spi.blob.BlobStore blobStore0 = null;
        boolean b1 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.isShared(blobStore0);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStoreService.FS_BACKEND_PATH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "fsBackendPath" + "'", str0.equals("fsBackendPath"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker.ActiveDeletionTracker.DELIM;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "," + "'", str0.equals(","));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = org.apache.jackrabbit.oak.spi.blob.stats.BlobStoreStatsMBean.TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "BlobStoreStats" + "'", str0.equals("BlobStoreStats"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.jackrabbit.oak.stats.StatisticsProvider statisticsProvider0 = null;
        try {
            org.apache.jackrabbit.oak.plugins.blob.BlobStoreStats blobStoreStats1 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreStats(statisticsProvider0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.slf4j.Logger logger0 = org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore.LOG;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        try {
            dataStoreBlobStore2.init("Blob migration");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        try {
            int i4 = dataStoreBlobStore2.deleteAllOlderThan((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        try {
            dataStoreBlobStore2.init("fsBackendPath");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType0 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.BLOBREFERENCES;
        try {
            java.lang.String str2 = sharedStoreRecordType0.getIdFromName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType0 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.BLOBREFERENCES + "'", sharedStoreRecordType0.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.BLOBREFERENCES));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int i0 = org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.DEFAULT_CACHE_SIZE;
        org.junit.Assert.assertTrue(i0 == 16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        try {
            long long13 = markSweepGarbageCollector12.checkConsistency();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStoreService.CACHE_SIZE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "cacheSize" + "'", str0.equals("cacheSize"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord4 = dataStoreBlobStore2.getRecordFromReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        try {
            java.lang.String str7 = dataStoreBlobStore2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.slf4j.Logger logger0 = org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector.LOG;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStoreService fileDataStoreService0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStoreService();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        try {
            int i3 = dataStoreBlobStore2.getMinRecordLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.io.InputStream inputStream3 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions4 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord5 = dataStoreBlobStore2.addRecord(inputStream3, blobOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        java.io.InputStream inputStream13 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions14 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord15 = dataStoreBlobStore3.addRecord(inputStream13, blobOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Class<?> cls1 = blobMigration0.getMBeanInterface();
        java.lang.Object[] obj_array3 = new java.lang.Object[] {};
        java.lang.String[] str_array6 = new java.lang.String[] { "fsBackendPath", "BlobStoreStats" };
        try {
            java.lang.Object obj7 = blobMigration0.invoke("Blob migration", obj_array3, str_array6);
            org.junit.Assert.fail("Expected exception of type javax.management.ReflectionException");
        } catch (javax.management.ReflectionException e) {
        }
        org.junit.Assert.assertNotNull(cls1);
        org.junit.Assert.assertNotNull(obj_array3);
        org.junit.Assert.assertNotNull(str_array6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str0 = org.apache.jackrabbit.oak.api.jmx.ConsolidatedDataStoreCacheStatsMBean.TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ConsolidatedDataStoreCacheStats" + "'", str0.equals("ConsolidatedDataStoreCacheStats"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend.FS_BACKEND_PATH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "fsBackendPath" + "'", str0.equals("fsBackendPath"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        try {
            dataStoreBlobStore2.updateModifiedDateOnAccess((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array0 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord1 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, dataRecord_array0);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array3 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord4 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord4, dataRecord_array3);
        java.util.Set<java.lang.String> set_str6 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord4);
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord7 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.getEarliestRecord((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(dataRecord_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(dataRecord_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set_str6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        dataStoreBlobStore2.clearCache();
        try {
            java.lang.String str11 = dataStoreBlobStore2.getBlobId("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        try {
            java.util.Iterator<java.lang.String> iterator_str4 = dataStoreBlobStore2.getAllChunkIds((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        try {
            dataStoreBlobStore3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        try {
            java.io.InputStream inputStream14 = dataStoreBlobStore3.getInputStream("ConsolidatedDataStoreCacheStats");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord5 = dataStoreBlobStore2.getAllRecords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.jackrabbit.oak.api.Blob blob0 = null;
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob2 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob0, "BlobStoreStats");
        org.apache.jackrabbit.oak.api.Blob blob3 = null;
        referencedBlob2.setBlob(blob3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore7 = dataStoreBlobStore2.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore8 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore8, false);
        dataStoreBlobStore10.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore10.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str19, str_array18);
        long long22 = dataStoreBlobStore10.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) (byte) 0);
        long long24 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) 1);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier25 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord26 = dataStoreBlobStore2.getRecordForId(dataIdentifier25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataStore7);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(long22 == 0L);
        org.junit.Assert.assertTrue(long24 == 0L);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Class<?> cls1 = blobMigration0.getMBeanInterface();
        javax.management.Attribute attribute2 = null;
        try {
            blobMigration0.setAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cls1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        try {
            dataStoreBlobStore2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils sharedDataStoreUtils0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        try {
            dataStoreBlobStore3.clearInUse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStoreService dbDataStoreService0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStoreService();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector7 = null;
        dataStoreBlobStore2.setBlobStatsCollector(blobStatsCollector7);
        try {
            java.lang.String str10 = dataStoreBlobStore2.writeBlob("cacheSizeInMB");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        java.io.InputStream inputStream9 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord10 = dataStoreBlobStore2.addRecord(inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier5 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord6 = dataStoreBlobStore2.getRecordForId(dataIdentifier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStoreService.CACHE_PATH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "cachePath" + "'", str0.equals("cachePath"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector.TEMP_DIR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "/tmp" + "'", str0.equals("/tmp"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        java.util.concurrent.Executor executor13 = null;
        try {
            org.apache.jackrabbit.oak.plugins.blob.BlobGC blobGC14 = new org.apache.jackrabbit.oak.plugins.blob.BlobGC((org.apache.jackrabbit.oak.plugins.blob.BlobGarbageCollector) markSweepGarbageCollector12, executor13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.MEM_CACHE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "BlobStore-MemCache" + "'", str0.equals("BlobStore-MemCache"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState0 = null;
        try {
            org.apache.jackrabbit.oak.plugins.blob.migration.DepthFirstNodeIterator depthFirstNodeIterator1 = new org.apache.jackrabbit.oak.plugins.blob.migration.DepthFirstNodeIterator(nodeState0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker15 = null;
        dataStoreBlobStore2.addTracker(blobTracker15);
        try {
            dataStoreBlobStore2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStoreService.PATH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "path" + "'", str0.equals("path"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier1 = null;
        try {
            fSBackend0.deleteRecord(dataIdentifier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore7 = dataStoreBlobStore2.getDataStore();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier8 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord9 = dataStoreBlobStore2.getRecordIfStored(dataIdentifier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataStore7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        dataStoreBlobStore3.setBlockSize((int) (byte) -1);
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier15 = dataStoreBlobStore3.getAllIdentifiers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        boolean b11 = dataStoreBlobStore3.deleteMetadataRecord("");
        try {
            dataStoreBlobStore3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int i0 = org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector.DEFAULT_BATCH_COUNT;
        org.junit.Assert.assertTrue(i0 == 1024);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStoreService.NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore" + "'", str0.equals("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        dataStoreBlobStore2.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer10 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2);
        org.apache.jackrabbit.oak.api.Blob blob11 = null;
        try {
            java.lang.String str12 = blobIdSerializer10.serialize(blob11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord12 = dataStoreBlobStore3.getAllMetadataRecords("markedTimestamp");
        try {
            dataStoreBlobStore3.clearInUse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        boolean b1 = org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord.isInstance("cacheSize");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        boolean b1 = org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord.isInstance("BlobStore-MemCache");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        try {
            int i12 = dataStoreBlobStore3.deleteAllOlderThan((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        dataStoreBlobStore2.deleteAllMetadataRecords("BlobStore-MemCache");
        try {
            dataStoreBlobStore2.clearInUse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        dataStoreBlobStore2.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer10 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2);
        try {
            int i12 = dataStoreBlobStore2.deleteAllOlderThan((long) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        java.io.File file2 = null;
        java.io.File file3 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file2);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file3);
        java.io.File file6 = null;
        java.io.File file7 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file7);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file3, file7, false, false);
        java.io.File file13 = null;
        java.io.File file14 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file3, file14, false);
        try {
            fSBackend0.addMetadataRecord(file14, "BlobStoreStats");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.BlobGC.OP_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Blob garbage collection" + "'", str0.equals("Blob garbage collection"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.jackrabbit.oak.spi.blob.split.SplitBlobStore splitBlobStore0 = null;
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator blobMigrator2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator(splitBlobStore0, nodeStore1);
        try {
            boolean b3 = blobMigrator2.migrate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.File file1 = null;
        java.io.File file2 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file1);
        try {
            org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer4 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(file2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier1 = null;
        try {
            boolean b2 = fSBackend0.exists(dataIdentifier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        java.io.InputStream inputStream5 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions6 = null;
        try {
            java.lang.String str7 = dataStoreBlobStore2.writeBlob(inputStream5, blobOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier2 = null;
        java.io.File file4 = null;
        java.io.File file5 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file4);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file5);
        java.io.File file8 = null;
        java.io.File file9 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file8);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file9);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file5, file9, false, false);
        try {
            fSBackend0.write(dataIdentifier2, file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNotNull(file9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore7 = dataStoreBlobStore2.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore8 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore8, false);
        dataStoreBlobStore10.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore10.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str19, str_array18);
        long long22 = dataStoreBlobStore10.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) (byte) 0);
        long long24 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector25 = null;
        dataStoreBlobStore2.setBlobStatsCollector(blobStatsCollector25);
        try {
            int i28 = dataStoreBlobStore2.deleteAllOlderThan((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataStore7);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(long22 == 0L);
        org.junit.Assert.assertTrue(long24 == 0L);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        try {
            java.lang.String str15 = dataStoreBlobStore2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = oakFileDataStore0.getType();
        try {
            oakFileDataStore0.setReferenceKeyEncoded("fsBackendPath");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type1.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        boolean b1 = org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord.isInstance("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier2 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever3 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore4 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore6 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore4, false);
        java.util.concurrent.Executor executor7 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever3, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore6, executor7, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore13 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore6);
        java.io.File file15 = null;
        java.io.File file16 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file15);
        dataStoreBlobStore13.addMetadataRecord(file16, "BlobStore-MemCache");
        try {
            fSBackend0.write(dataIdentifier2, file16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(file16);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.jackrabbit.oak.spi.blob.split.SplitBlobStore splitBlobStore0 = null;
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator blobMigrator2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator(splitBlobStore0, nodeStore1);
        blobMigrator2.stop();
        try {
            boolean b4 = blobMigrator2.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier2 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord3 = fSBackend0.getRecord(dataIdentifier2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord12 = dataStoreBlobStore3.getAllMetadataRecords("markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer13 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore3);
        java.io.InputStream inputStream14 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions15 = null;
        try {
            java.lang.String str16 = dataStoreBlobStore3.writeBlob(inputStream14, blobOptions15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier3 = dataStoreBlobStore2.getAllIdentifiers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj1 = blobMigration0.getImplementation();
        try {
            java.lang.Object obj3 = blobMigration0.getAttribute("Blob garbage collection");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException");
        } catch (javax.management.AttributeNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.CachingBlobStore.MEM_CACHE_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "BlobStore-MemCache" + "'", str0.equals("BlobStore-MemCache"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        try {
            dataStoreBlobStore3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        dataStoreBlobStore2.deleteAllMetadataRecords("BlobStore-MemCache");
        try {
            dataStoreBlobStore2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array8 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList9 = blobMigration0.getAttributes(str_array8);
        java.lang.String[] str_array10 = null;
        try {
            javax.management.AttributeList attributeList11 = blobMigration0.getAttributes(str_array10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(attributeList9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.io.InputStream inputStream5 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions6 = null;
        try {
            java.lang.String str7 = dataStoreBlobStore2.writeBlob(inputStream5, blobOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier13 = dataStoreBlobStore3.getAllIdentifiers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord10 = dataStoreBlobStore3.getAllRecords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord12 = dataStoreBlobStore3.getAllMetadataRecords("markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer13 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore3);
        org.apache.jackrabbit.oak.api.Blob blob14 = null;
        try {
            java.lang.String str15 = blobIdSerializer13.serialize(blob14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        dataStoreBlobStore3.setBlockSize((int) (byte) -1);
        try {
            java.lang.String str16 = dataStoreBlobStore3.getReference("BlobStore-MemCache");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier2 = null;
        try {
            java.io.InputStream inputStream3 = fSBackend0.read(dataIdentifier2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector7 = null;
        dataStoreBlobStore2.setBlobStatsCollector(blobStatsCollector7);
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier9 = dataStoreBlobStore2.getAllIdentifiers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.io.InputStream inputStream5 = null;
        try {
            java.lang.String str6 = dataStoreBlobStore2.writeBlob(inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        dataStoreBlobStore2.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer10 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord12 = dataStoreBlobStore2.getAllMetadataRecords("path");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array16 = fSBackend15.getOrCreateReferenceKey();
        try {
            int i19 = dataStoreBlobStore2.readBlob("/tmp", (long) (short) 0, byte_array16, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNull(list_dataRecord12);
        org.junit.Assert.assertNotNull(byte_array16);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setEndTime((long) (short) -1);
        garbageCollectionRepoStats0.setStartTime(1L);
        garbageCollectionRepoStats0.setNumLines(0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        garbageCollectionRepoStats0.setNumLines((int) '4');
        long long5 = garbageCollectionRepoStats0.getStartTime();
        org.junit.Assert.assertTrue(long5 == 0L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        dataStoreBlobStore2.deleteAllMetadataRecords("BlobStore-MemCache");
        try {
            java.util.Iterator<java.lang.String> iterator_str18 = dataStoreBlobStore2.getAllChunkIds(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        try {
            long long3 = cloudBlobStore0.getBlobLength("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(long1 == 4096L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord13 = dataStoreBlobStore4.getAllMetadataRecords("markedTimestamp");
        java.util.concurrent.Executor executor14 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard19 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector20 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor14, "hi!", (int) ' ', (long) ' ', "ConsolidatedDataStoreCacheStats", whiteboard19);
        try {
            markSweepGarbageCollector20.collectGarbage(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker15 = null;
        dataStoreBlobStore2.addTracker(blobTracker15);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker17 = dataStoreBlobStore2.getTracker();
        try {
            dataStoreBlobStore2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
        org.junit.Assert.assertNull(blobTracker17);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<java.lang.String> list_str3 = null;
        try {
            boolean b5 = dataStoreBlobStore2.deleteChunks(list_str3, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        java.io.File file12 = null;
        java.io.File file13 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file12);
        dataStoreBlobStore10.addMetadataRecord(file13, "BlobStore-MemCache");
        try {
            java.lang.String str17 = dataStoreBlobStore10.getBlobId("ConsolidatedDataStoreCacheStats");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(file13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        dataStoreBlobStore3.setMaxCachedBinarySize((int) (short) 0);
        try {
            int i13 = dataStoreBlobStore3.getMinRecordLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration4 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo5 = blobMigration4.getMBeanInfo();
        blobMigration4.preDeregister();
        blobMigration4.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array12 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList13 = blobMigration4.getAttributes(str_array12);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration14 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo15 = blobMigration14.getMBeanInfo();
        blobMigration14.preDeregister();
        blobMigration14.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array22 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList23 = blobMigration14.getAttributes(str_array22);
        try {
            java.lang.Object obj24 = blobMigration0.invoke("/tmp", (java.lang.Object[]) str_array12, str_array22);
            org.junit.Assert.fail("Expected exception of type javax.management.ReflectionException");
        } catch (javax.management.ReflectionException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(mBeanInfo5);
        org.junit.Assert.assertNotNull(str_array12);
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertNotNull(mBeanInfo15);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertNotNull(attributeList23);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        try {
            java.lang.String str10 = dataStoreBlobStore2.getBlobId("cacheSize");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        dataStoreBlobStore2.clearCache();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier10 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore2.getRecordIfStored(dataIdentifier10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        try {
            markSweepGarbageCollector10.collectGarbage(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj1 = blobMigration0.getImplementation();
        java.lang.Class<?> cls2 = blobMigration0.getImplementationClass();
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever3 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore4 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore6 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore4, false);
        java.util.concurrent.Executor executor7 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard12 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector13 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever3, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore6, executor7, ",", (int) (byte) 10, (long) 10, "", whiteboard12);
        java.util.List<org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats> list_garbageCollectionRepoStats14 = markSweepGarbageCollector13.getStats();
        try {
            blobMigration0.setImplementation((java.lang.Object) markSweepGarbageCollector13);
            org.junit.Assert.fail("Expected exception of type javax.management.NotCompliantMBeanException");
        } catch (javax.management.NotCompliantMBeanException e) {
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(cls2);
        org.junit.Assert.assertNotNull(list_garbageCollectionRepoStats14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.preDeregister();
        try {
            java.lang.Object obj5 = blobMigration0.getAttribute("");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException");
        } catch (javax.management.AttributeNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        dataStoreBlobStore3.setBlockSize(16);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier13 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord14 = dataStoreBlobStore3.getRecordForId(dataIdentifier13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker15 = null;
        dataStoreBlobStore2.addTracker(blobTracker15);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker17 = dataStoreBlobStore2.getTracker();
        try {
            java.lang.String str19 = dataStoreBlobStore2.writeBlob("ConsolidatedDataStoreCacheStats");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
        org.junit.Assert.assertNull(blobTracker17);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        dataStoreBlobStore2.deleteAllMetadataRecords("BlobStore-MemCache");
        dataStoreBlobStore2.deleteAllMetadataRecords("BlobStore-MemCache");
        try {
            dataStoreBlobStore2.updateModifiedDateOnAccess((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore1 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore2 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.junit.Assert.assertNull(abstractSharedCachingDataStore1);
        org.junit.Assert.assertNull(abstractSharedCachingDataStore2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.jackrabbit.oak.api.Blob blob0 = null;
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob2 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob0, "BlobStoreStats");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever3 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore4 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore6 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore4, false);
        java.util.concurrent.Executor executor7 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard12 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector13 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever3, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore6, executor7, ",", (int) (byte) 10, (long) 10, "", whiteboard12);
        boolean b14 = referencedBlob2.equals((java.lang.Object) 10);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier1 = null;
        try {
            java.io.InputStream inputStream2 = fSBackend0.read(dataIdentifier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore7 = dataStoreBlobStore2.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore8 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore8, false);
        dataStoreBlobStore10.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore10.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str19, str_array18);
        long long22 = dataStoreBlobStore10.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) (byte) 0);
        long long24 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector25 = null;
        dataStoreBlobStore2.setBlobStatsCollector(blobStatsCollector25);
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord27 = dataStoreBlobStore2.getAllRecords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataStore7);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(long22 == 0L);
        org.junit.Assert.assertTrue(long24 == 0L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend6 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array7 = fSBackend6.getOrCreateReferenceKey();
        byte[] byte_array8 = fSBackend6.getOrCreateReferenceKey();
        try {
            int i11 = cloudBlobStore0.readBlob("markedTimestamp-,", (long) '#', byte_array8, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        java.io.InputStream inputStream13 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions14 = null;
        try {
            java.lang.String str15 = dataStoreBlobStore3.writeBlob(inputStream13, blobOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        try {
            dataStoreBlobStore2.clearInUse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        try {
            cloudBlobStore0.setBlockSize((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(long1 == 4096L);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        byte[] byte_array4 = new byte[] { (byte) 100 };
        try {
            int i7 = cloudBlobStore0.readBlob("Blob garbage collection", (long) 1, byte_array4, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(byte_array4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector.DELIM;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "," + "'", str0.equals(","));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = oakFileDataStore0.getType();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier2 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord3 = oakFileDataStore0.getRecordForId(dataIdentifier2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type1.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        try {
            java.io.File file14 = blobIdTracker12.get("BlobStoreStats");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord13 = dataStoreBlobStore4.getAllMetadataRecords("markedTimestamp");
        java.util.concurrent.Executor executor14 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard19 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector20 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor14, "hi!", (int) ' ', (long) ' ', "ConsolidatedDataStoreCacheStats", whiteboard19);
        org.apache.jackrabbit.core.data.DataRecord dataRecord22 = dataStoreBlobStore4.getMetadataRecord("");
        org.junit.Assert.assertNull(list_dataRecord13);
        org.junit.Assert.assertNull(dataRecord22);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        java.io.File file14 = null;
        java.io.File file15 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file14);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file15);
        java.io.File file18 = null;
        java.io.File file19 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file18);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file19);
        java.io.File file22 = null;
        java.io.File file23 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file22);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file23);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file19, file23, false, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file15, file23);
        try {
            blobIdTracker12.add(file15);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertNotNull(file23);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        try {
            long long4 = cloudBlobStore0.getBlobLength("markedTimestamp-,");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        try {
            java.lang.String str5 = cloudBlobStore0.writeBlob("cachePath");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.io.InputStream inputStream2 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions3 = null;
        try {
            java.lang.String str4 = cloudBlobStore0.writeBlob(inputStream2, blobOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        java.lang.String str4 = cloudBlobStore0.getAccessKey();
        org.apache.jackrabbit.oak.spi.blob.AbstractBlobStore.BlockId blockId5 = null;
        try {
            org.apache.jackrabbit.oak.spi.blob.AbstractBlobStore.Data data6 = cloudBlobStore0.load(blockId5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord13 = dataStoreBlobStore4.getAllMetadataRecords("markedTimestamp");
        java.util.concurrent.Executor executor14 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard19 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector20 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor14, "hi!", (int) ' ', (long) ' ', "ConsolidatedDataStoreCacheStats", whiteboard19);
        try {
            dataStoreBlobStore4.init("ConsolidatedDataStoreCacheStats");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        javax.management.MBeanServer mBeanServer5 = null;
        javax.management.ObjectName objectName6 = null;
        javax.management.ObjectName objectName7 = blobMigration0.preRegister(mBeanServer5, objectName6);
        java.lang.String str9 = blobMigration0.startBlobMigration(false);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration11 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo12 = blobMigration11.getMBeanInfo();
        blobMigration11.preDeregister();
        blobMigration11.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array19 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList20 = blobMigration11.getAttributes(str_array19);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration21 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo22 = blobMigration21.getMBeanInfo();
        blobMigration21.preDeregister();
        blobMigration21.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array29 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList30 = blobMigration21.getAttributes(str_array29);
        try {
            java.lang.Object obj31 = blobMigration0.invoke("BlobStore-MemCache", (java.lang.Object[]) str_array19, str_array29);
            org.junit.Assert.fail("Expected exception of type javax.management.ReflectionException");
        } catch (javax.management.ReflectionException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNull(objectName7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Migration started" + "'", str9.equals("Migration started"));
        org.junit.Assert.assertNotNull(mBeanInfo12);
        org.junit.Assert.assertNotNull(str_array19);
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertNotNull(mBeanInfo22);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertNotNull(attributeList30);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        dataStoreBlobStore3.setBlockSize((int) (byte) -1);
        dataStoreBlobStore3.setBlockSize((int) '4');
        try {
            java.util.Iterator<java.lang.String> iterator_str18 = dataStoreBlobStore3.getAllChunkIds((long) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        blobIdTracker12.close();
        java.io.File file15 = null;
        java.io.File file16 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file15);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file16);
        java.io.File file19 = null;
        java.io.File file20 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file19);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file16, file20, false, false);
        try {
            blobIdTracker12.remove(file16);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNotNull(file20);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.io.File file1 = null;
        java.io.File file2 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file1);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file2);
        java.io.File file5 = null;
        java.io.File file6 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file5);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file2, file6, false, false);
        java.io.File file12 = null;
        java.io.File file13 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file12);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file2, file13, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer17 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file13);
        fSBlobSerializer17.close();
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNotNull(file13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier5 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord6 = oakFileDataStore0.getRecord(dataIdentifier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord13 = dataStoreBlobStore4.getAllMetadataRecords("markedTimestamp");
        java.util.concurrent.Executor executor14 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard19 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector20 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor14, "hi!", (int) ' ', (long) ' ', "ConsolidatedDataStoreCacheStats", whiteboard19);
        try {
            java.lang.String str22 = dataStoreBlobStore4.writeBlob("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        java.io.InputStream inputStream5 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord6 = oakFileDataStore0.addRecord(inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier2 = null;
        try {
            boolean b3 = fSBackend0.exists(dataIdentifier2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord("cacheSize");
        try {
            java.lang.String str10 = dataStoreBlobStore2.getReference("cachePath");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        try {
            java.io.File file14 = blobIdTracker12.get("ConsolidatedDataStoreCacheStats");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.jackrabbit.oak.api.Blob blob0 = null;
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob2 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob0, "BlobStoreStats");
        org.apache.jackrabbit.oak.api.Blob blob3 = referencedBlob2.getBlob();
        java.lang.String str4 = referencedBlob2.toString();
        java.io.File file6 = null;
        java.io.File file7 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file7);
        java.io.File file10 = null;
        java.io.File file11 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file10);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file11);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file7, file11, false, false);
        java.io.File file17 = null;
        java.io.File file18 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file17);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file18);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file7, file18, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer22 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file18);
        org.apache.jackrabbit.oak.api.Blob blob24 = fSBlobSerializer22.deserialize("markedTimestamp");
        referencedBlob2.setBlob(blob24);
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob27 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob24, "markedTimestamp-/tmp");
        org.junit.Assert.assertNull(blob3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ReferencedBlob{blob=null, id='BlobStoreStats'}" + "'", str4.equals("ReferencedBlob{blob=null, id='BlobStoreStats'}"));
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertNotNull(blob24);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        org.apache.jackrabbit.core.data.DataStore dataStore15 = dataStoreBlobStore2.getDataStore();
        java.io.InputStream inputStream16 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions17 = null;
        try {
            java.lang.String str18 = dataStoreBlobStore2.writeBlob(inputStream16, blobOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
        org.junit.Assert.assertNull(dataStore15);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.jackrabbit.oak.spi.blob.split.SplitBlobStore splitBlobStore0 = null;
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator blobMigrator2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator(splitBlobStore0, nodeStore1);
        blobMigrator2.stop();
        blobMigrator2.stop();
        java.lang.String str5 = blobMigrator2.getLastProcessedPath();
        blobMigrator2.stop();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier11 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord12 = oakFileDataStore0.getRecord(dataIdentifier11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.datastore.AbstractDataStoreService.PROP_ENCODE_LENGTH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "encodeLengthInId" + "'", str0.equals("encodeLengthInId"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        try {
            java.lang.String str10 = dataStoreBlobStore2.writeBlob("Migration started");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.concurrent.Executor executor6 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor6, "markedTimestamp-,", (int) (short) 0, 10L, "/tmp");
        try {
            markSweepGarbageCollector11.collectGarbage(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        blobIdTracker12.close();
        try {
            blobIdTracker12.add("BlobStoreStats");
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier2 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever3 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore4 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore6 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore4, false);
        dataStoreBlobStore6.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str10 = dataStoreBlobStore6.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor11 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard14 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector15 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever3, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore6, executor11, 0L, "fsBackendPath", whiteboard14);
        dataStoreBlobStore6.setBlockSize((int) (byte) -1);
        java.io.InputStream inputStream18 = null;
        dataStoreBlobStore6.addMetadataRecord(inputStream18, "markedTimestamp");
        java.io.File file22 = null;
        java.io.File file23 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file22);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file23);
        java.io.File file26 = null;
        java.io.File file27 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file26);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file27);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file23, file27, false, false);
        dataStoreBlobStore6.addMetadataRecord(file27, "ReferencedBlob{blob=null, id='BlobStoreStats'}");
        try {
            fSBackend0.write(dataIdentifier2, file27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(iterator_str10);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertNotNull(file27);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        try {
            int i2 = cachingFileDataStore0.deleteAllOlderThan((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        blobIdTracker12.close();
        try {
            java.util.Iterator<java.lang.String> iterator_str14 = blobIdTracker12.get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        org.apache.jackrabbit.core.data.DataStore dataStore15 = dataStoreBlobStore2.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore16 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore18 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore16, false);
        dataStoreBlobStore18.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore18.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array26 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str27, str_array26);
        long long30 = dataStoreBlobStore18.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str27, (long) (byte) 0);
        boolean b32 = dataStoreBlobStore2.deleteChunks((java.util.List<java.lang.String>) arraylist_str27, (long) ' ');
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer33 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
        org.junit.Assert.assertNull(dataStore15);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(long30 == 0L);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.jackrabbit.oak.api.Blob blob0 = null;
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob2 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob0, "BlobStoreStats");
        org.apache.jackrabbit.oak.api.Blob blob3 = referencedBlob2.getBlob();
        java.lang.String str4 = referencedBlob2.toString();
        referencedBlob2.setId("Blob migration");
        org.junit.Assert.assertNull(blob3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ReferencedBlob{blob=null, id='BlobStoreStats'}" + "'", str4.equals("ReferencedBlob{blob=null, id='BlobStoreStats'}"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array0 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord1 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, dataRecord_array0);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array3 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord4 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord4, dataRecord_array3);
        java.util.Set<java.lang.String> set_str6 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord4);
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord7 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.getEarliestRecord((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord4);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(dataRecord_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(dataRecord_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set_str6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        try {
            int i4 = cachingFileDataStore0.deleteAllOlderThan(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.jackrabbit.oak.spi.blob.split.SplitBlobStore splitBlobStore0 = null;
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator blobMigrator2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator(splitBlobStore0, nodeStore1);
        try {
            boolean b3 = blobMigrator2.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        try {
            int i2 = cachingFileDataStore0.deleteAllOlderThan((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        dataStoreBlobStore2.deleteAllMetadataRecords("BlobStore-MemCache");
        dataStoreBlobStore2.deleteAllMetadataRecords("BlobStore-MemCache");
        java.io.InputStream inputStream19 = null;
        try {
            java.lang.String str20 = dataStoreBlobStore2.writeBlob(inputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        javax.management.MBeanServer mBeanServer5 = null;
        javax.management.ObjectName objectName6 = null;
        javax.management.ObjectName objectName7 = blobMigration0.preRegister(mBeanServer5, objectName6);
        java.lang.Class<?> cls8 = blobMigration0.getMBeanInterface();
        try {
            java.lang.Object obj10 = blobMigration0.getAttribute("fsBackendPath");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException");
        } catch (javax.management.AttributeNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNull(objectName7);
        org.junit.Assert.assertNotNull(cls8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType0 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.REPOSITORY;
        try {
            java.lang.String str2 = sharedStoreRecordType0.getIdFromName("encodeLengthInId");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType0 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.REPOSITORY + "'", sharedStoreRecordType0.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.REPOSITORY));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        try {
            cachingFileDataStore0.updateModifiedDateOnAccess((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        javax.management.MBeanServer mBeanServer5 = null;
        javax.management.ObjectName objectName6 = null;
        javax.management.ObjectName objectName7 = blobMigration0.preRegister(mBeanServer5, objectName6);
        java.lang.String str9 = blobMigration0.startBlobMigration(false);
        java.lang.Object[] obj_array11 = null;
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration12 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo13 = blobMigration12.getMBeanInfo();
        blobMigration12.preDeregister();
        blobMigration12.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array20 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList21 = blobMigration12.getAttributes(str_array20);
        try {
            java.lang.Object obj22 = blobMigration0.invoke("fsBackendPath", obj_array11, str_array20);
            org.junit.Assert.fail("Expected exception of type javax.management.ReflectionException");
        } catch (javax.management.ReflectionException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNull(objectName7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Migration started" + "'", str9.equals("Migration started"));
        org.junit.Assert.assertNotNull(mBeanInfo13);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertNotNull(attributeList21);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord12 = dataStoreBlobStore3.getAllMetadataRecords("markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer13 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore3);
        try {
            java.lang.String str15 = dataStoreBlobStore3.getBlobId("cachePath");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        long long3 = garbageCollectionRepoStats0.getLength();
        garbageCollectionRepoStats0.setLocal(false);
        java.lang.String str6 = garbageCollectionRepoStats0.getRepositoryId();
        garbageCollectionRepoStats0.setRepositoryId("cacheSizeInMB");
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        dataStoreBlobStore2.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer10 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2);
        org.apache.jackrabbit.oak.api.Blob blob12 = blobIdSerializer10.deserialize("Migration started");
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNotNull(blob12);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats1 = cloudBlobStore0.getCacheStats();
        try {
            cloudBlobStore0.setBlockSize((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cacheStats1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        dataStoreBlobStore2.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer10 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2);
        java.io.InputStream inputStream11 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions12 = null;
        try {
            java.lang.String str13 = dataStoreBlobStore2.writeBlob(inputStream11, blobOptions12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType0 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER;
        java.lang.String str1 = sharedStoreRecordType0.getType();
        java.lang.String str3 = sharedStoreRecordType0.getNameFromId(",");
        java.lang.String str4 = sharedStoreRecordType0.getType();
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType0 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER + "'", sharedStoreRecordType0.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "markedTimestamp" + "'", str1.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "markedTimestamp-," + "'", str3.equals("markedTimestamp-,"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "markedTimestamp" + "'", str4.equals("markedTimestamp"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker15 = null;
        dataStoreBlobStore2.addTracker(blobTracker15);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker17 = dataStoreBlobStore2.getTracker();
        java.io.InputStream inputStream18 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions19 = null;
        try {
            java.lang.String str20 = dataStoreBlobStore2.writeBlob(inputStream18, blobOptions19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
        org.junit.Assert.assertNull(blobTracker17);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector7 = null;
        dataStoreBlobStore2.setBlobStatsCollector(blobStatsCollector7);
        java.io.InputStream inputStream9 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord10 = dataStoreBlobStore2.addRecord(inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        java.io.InputStream inputStream2 = null;
        try {
            fSBackend0.addMetadataRecord(inputStream2, "BlobStore-MemCache");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.io.InputStream inputStream3 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions4 = null;
        try {
            java.lang.String str5 = dataStoreBlobStore2.writeBlob(inputStream3, blobOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.jackrabbit.oak.api.Blob blob0 = null;
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob2 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob0, "");
        java.lang.String str3 = referencedBlob2.getId();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        long long2 = cloudBlobStore0.getBlockSizeMin();
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str14, str_array13);
        long long17 = dataStoreBlobStore5.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str14, (long) (byte) 0);
        try {
            boolean b19 = cloudBlobStore0.deleteChunks((java.util.List<java.lang.String>) arraylist_str14, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long2 == 4096L);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(long17 == 0L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector11 = null;
        dataStoreBlobStore10.setBlobStatsCollector(blobStatsCollector11);
        try {
            java.util.Iterator<java.lang.String> iterator_str14 = dataStoreBlobStore10.getAllChunkIds((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        long long7 = dataStoreBlobStore2.getBlockSizeMin();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier8 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord9 = dataStoreBlobStore2.getRecordIfStored(dataIdentifier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertTrue(long7 == 0L);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStoreService.NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore" + "'", str0.equals("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        long long3 = garbageCollectionRepoStats0.getLength();
        int i4 = garbageCollectionRepoStats0.getNumLines();
        garbageCollectionRepoStats0.setStartTime((long) (byte) 1);
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        boolean b1 = org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord.isInstance("");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier1 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord2 = cachingFileDataStore0.getRecordIfStored(dataIdentifier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker15 = null;
        dataStoreBlobStore2.addTracker(blobTracker15);
        try {
            dataStoreBlobStore2.clearInUse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore11 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore11.close();
        oakFileDataStore11.clearInUse();
        byte[] byte_array18 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore11.setReferenceKey(byte_array18);
        try {
            int i22 = dataStoreBlobStore2.readBlob("cacheSizeInMB", (long) 1024, byte_array18, 16, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNotNull(byte_array18);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier3 = null;
        try {
            cachingFileDataStore0.deleteRecord(dataIdentifier3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        java.io.InputStream inputStream11 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord12 = dataStoreBlobStore10.addRecord(inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array0 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord1 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, dataRecord_array0);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array3 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord4 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord4, dataRecord_array3);
        java.util.Set<java.lang.String> set_str6 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord4);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array7 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord8 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord8, dataRecord_array7);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array10 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord11 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord11, dataRecord_array10);
        java.util.Set<java.lang.String> set_str13 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord8, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord11);
        java.util.Set<java.lang.String> set_str14 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord11);
        org.junit.Assert.assertNotNull(dataRecord_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(dataRecord_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set_str6);
        org.junit.Assert.assertNotNull(dataRecord_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(dataRecord_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set_str13);
        org.junit.Assert.assertNotNull(set_str14);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        dataStoreBlobStore3.setBlockSize((int) (byte) -1);
        try {
            dataStoreBlobStore3.init("Blob migration");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        java.lang.String str4 = cloudBlobStore0.getAccessKey();
        try {
            java.lang.String str6 = cloudBlobStore0.writeBlob("markedTimestamp-/tmp");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore7 = dataStoreBlobStore2.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore8 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore8, false);
        dataStoreBlobStore10.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore10.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str19, str_array18);
        long long22 = dataStoreBlobStore10.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) (byte) 0);
        long long24 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector25 = null;
        dataStoreBlobStore2.setBlobStatsCollector(blobStatsCollector25);
        long long27 = dataStoreBlobStore2.getBlockSizeMin();
        java.io.InputStream inputStream28 = null;
        dataStoreBlobStore2.addMetadataRecord(inputStream28, "markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob32 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2, "Migration started");
        try {
            long long33 = blobStoreBlob32.length();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataStore7);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(long22 == 0L);
        org.junit.Assert.assertTrue(long24 == 0L);
        org.junit.Assert.assertTrue(long27 == 0L);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.jackrabbit.oak.api.Blob blob0 = null;
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob2 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob0, "BlobStoreStats");
        org.apache.jackrabbit.oak.api.Blob blob3 = referencedBlob2.getBlob();
        referencedBlob2.setId("markedTimestamp-/tmp");
        org.junit.Assert.assertNull(blob3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker15 = null;
        dataStoreBlobStore2.addTracker(blobTracker15);
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord17 = dataStoreBlobStore2.getAllRecords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord13 = dataStoreBlobStore4.getAllMetadataRecords("markedTimestamp");
        java.util.concurrent.Executor executor14 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard19 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector20 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor14, "hi!", (int) ' ', (long) ' ', "ConsolidatedDataStoreCacheStats", whiteboard19);
        try {
            markSweepGarbageCollector20.collectGarbage(false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats1 = cloudBlobStore0.getCacheStats();
        cloudBlobStore0.setCloudProvider("Blob garbage collection");
        org.apache.jackrabbit.core.data.DataStore dataStore4 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore6 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore4, false);
        dataStoreBlobStore6.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore6.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str15 = new java.util.ArrayList<java.lang.String>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str15, str_array14);
        long long18 = dataStoreBlobStore6.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str15, (long) (byte) 0);
        org.apache.jackrabbit.core.data.DataStore dataStore19 = dataStoreBlobStore6.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore20 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore22 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore20, false);
        dataStoreBlobStore22.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore22.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array30 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<java.lang.String>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str31, str_array30);
        long long34 = dataStoreBlobStore22.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str31, (long) (byte) 0);
        boolean b36 = dataStoreBlobStore6.deleteChunks((java.util.List<java.lang.String>) arraylist_str31, (long) ' ');
        java.lang.String[] str_array47 = new java.lang.String[] { "/tmp", "markedTimestamp-,", "BlobStoreStats", "", "markedTimestamp", "BlobStore-MemCache", "Blob migration", "markedTimestamp", "BlobStoreStats", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore" };
        java.util.ArrayList<java.lang.String> arraylist_str48 = new java.util.ArrayList<java.lang.String>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str48, str_array47);
        long long51 = dataStoreBlobStore6.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str48, 1L);
        try {
            long long53 = cloudBlobStore0.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str48, (long) 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cacheStats1);
        org.junit.Assert.assertNotNull(str_array14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(long18 == 0L);
        org.junit.Assert.assertNull(dataStore19);
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(long34 == 0L);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(str_array47);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(long51 == 0L);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setCloudContainer("markedTimestamp-,");
        try {
            java.util.Iterator<java.lang.String> iterator_str7 = cloudBlobStore0.resolveChunks("Blob migration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        dataStoreBlobStore3.setMaxCachedBinarySize((int) (short) 0);
        java.io.InputStream inputStream13 = null;
        try {
            java.lang.String str14 = dataStoreBlobStore3.writeBlob(inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.clearCache();
        java.io.InputStream inputStream5 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions6 = null;
        try {
            java.lang.String str7 = cloudBlobStore0.writeBlob(inputStream5, blobOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        try {
            java.lang.String str4 = cloudBlobStore0.writeBlob("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.apache.jackrabbit.core.data.DataStore dataStore13 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore13, false);
        dataStoreBlobStore15.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str19 = dataStoreBlobStore15.resolveChunks("BlobStoreStats");
        long long20 = dataStoreBlobStore15.getBlockSizeMin();
        java.util.Iterator<java.lang.String> iterator_str22 = dataStoreBlobStore15.resolveChunks("fsBackendPath");
        blobIdTracker12.add(iterator_str22);
        try {
            java.io.File file25 = blobIdTracker12.get("encodeLengthInId");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str19);
        org.junit.Assert.assertTrue(long20 == 0L);
        org.junit.Assert.assertNotNull(iterator_str22);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever13 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever14 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore15 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore17 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore15, false);
        java.util.concurrent.Executor executor18 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard23 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector24 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever14, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore17, executor18, ",", (int) (byte) 10, (long) 10, "", whiteboard23);
        java.util.concurrent.Executor executor25 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard28 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector29 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever13, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore17, executor25, 4096L, "Blob migration", whiteboard28);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        java.io.File file35 = null;
        java.io.File file36 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file35);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file36);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file32, file36, false, false);
        dataStoreBlobStore17.addMetadataRecord(file36, "fsBackendPath");
        try {
            blobIdTracker12.remove(file36);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(file36);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier15 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord16 = dataStoreBlobStore2.getRecordIfStored(dataIdentifier15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker5 = dataStoreBlobStore2.getTracker();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier6 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord7 = dataStoreBlobStore2.getRecordIfStored(dataIdentifier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
        org.junit.Assert.assertNull(blobTracker5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.apache.jackrabbit.core.data.DataStore dataStore13 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore13, false);
        dataStoreBlobStore15.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str19 = dataStoreBlobStore15.resolveChunks("BlobStoreStats");
        long long20 = dataStoreBlobStore15.getBlockSizeMin();
        java.util.Iterator<java.lang.String> iterator_str22 = dataStoreBlobStore15.resolveChunks("fsBackendPath");
        blobIdTracker12.add(iterator_str22);
        java.io.File file25 = null;
        java.io.File file26 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file25);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file26);
        java.io.File file29 = null;
        java.io.File file30 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file29);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file30);
        java.io.File file33 = null;
        java.io.File file34 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file33);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file34);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file30, file34, false, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file26, file34);
        java.io.File file41 = null;
        java.io.File file42 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file41);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file42);
        java.io.File file45 = null;
        java.io.File file46 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file45);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file46);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file42, file46, false, false);
        java.io.File file52 = null;
        java.io.File file53 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file52);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file53);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file42, file53, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file26, file53, false, false);
        try {
            blobIdTracker12.remove(file26);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str19);
        org.junit.Assert.assertTrue(long20 == 0L);
        org.junit.Assert.assertNotNull(iterator_str22);
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertNotNull(file30);
        org.junit.Assert.assertNotNull(file34);
        org.junit.Assert.assertNotNull(file42);
        org.junit.Assert.assertNotNull(file46);
        org.junit.Assert.assertNotNull(file53);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        java.util.Properties properties1 = null;
        cachingFileDataStore0.setProperties(properties1);
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type3 = cachingFileDataStore0.getType();
        try {
            cachingFileDataStore0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type3.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        java.io.InputStream inputStream6 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions7 = null;
        try {
            java.lang.String str8 = cloudBlobStore0.writeBlob(inputStream6, blobOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker5 = dataStoreBlobStore2.getTracker();
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker6 = null;
        dataStoreBlobStore2.addTracker(blobTracker6);
        try {
            java.lang.String str9 = dataStoreBlobStore2.getReference("blob");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
        org.junit.Assert.assertNull(blobTracker5);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        long long3 = garbageCollectionRepoStats0.getLength();
        garbageCollectionRepoStats0.setLocal(false);
        boolean b6 = garbageCollectionRepoStats0.isLocal();
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        long long3 = garbageCollectionRepoStats0.getLength();
        garbageCollectionRepoStats0.setNumLines((int) (byte) -1);
        garbageCollectionRepoStats0.setNumLines((int) '4');
        garbageCollectionRepoStats0.setRepositoryId("ConsolidatedDataStoreCacheStats");
        org.junit.Assert.assertTrue(long3 == 0L);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.concurrent.Executor executor12 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard15 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector16 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor12, 4096L, "Blob migration", whiteboard15);
        java.io.File file18 = null;
        java.io.File file19 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file18);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file19);
        java.io.File file22 = null;
        java.io.File file23 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file22);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file23);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file19, file23, false, false);
        dataStoreBlobStore4.addMetadataRecord(file23, "fsBackendPath");
        java.io.InputStream inputStream30 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions31 = null;
        try {
            java.lang.String str32 = dataStoreBlobStore4.writeBlob(inputStream30, blobOptions31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertNotNull(file23);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker5 = dataStoreBlobStore2.getTracker();
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker6 = null;
        dataStoreBlobStore2.addTracker(blobTracker6);
        org.apache.jackrabbit.core.data.DataRecord dataRecord9 = dataStoreBlobStore2.getMetadataRecord("ConsolidatedDataStoreCacheStats");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier10 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore2.getRecordIfStored(dataIdentifier10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
        org.junit.Assert.assertNull(blobTracker5);
        org.junit.Assert.assertNull(dataRecord9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        dataStoreBlobStore2.startMark();
        java.io.InputStream inputStream6 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions7 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.addRecord(inputStream6, blobOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        java.util.Properties properties1 = null;
        fSBackend0.setProperties(properties1);
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord4 = fSBackend0.getMetadataRecord("BlobStoreStats");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.jackrabbit.oak.spi.blob.split.SplitBlobStore splitBlobStore0 = null;
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator blobMigrator2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator(splitBlobStore0, nodeStore1);
        blobMigrator2.stop();
        blobMigrator2.stop();
        try {
            boolean b5 = blobMigrator2.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        java.util.Properties properties1 = null;
        cachingFileDataStore0.setProperties(properties1);
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type3 = cachingFileDataStore0.getType();
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord4 = cachingFileDataStore0.getAllRecords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type3.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.startMark();
        try {
            long long6 = cloudBlobStore0.getBlobLength("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        try {
            markSweepGarbageCollector10.collectGarbage(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long4 = cloudBlobStore3.getBlockSizeMin();
        int i5 = cloudBlobStore3.getBlockSize();
        try {
            blobMigration0.setImplementation((java.lang.Object) i5);
            org.junit.Assert.fail("Expected exception of type javax.management.NotCompliantMBeanException");
        } catch (javax.management.NotCompliantMBeanException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertTrue(long4 == 4096L);
        org.junit.Assert.assertTrue(i5 == 2097152);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState1 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("cachePath");
        garbageCollectorFileState1.close();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        try {
            cloudBlobStore0.setReferenceKeyEncoded("fsBackendPath");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker5 = dataStoreBlobStore2.getTracker();
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier6 = dataStoreBlobStore2.getAllIdentifiers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
        org.junit.Assert.assertNull(blobTracker5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        java.util.Properties properties1 = null;
        cachingFileDataStore0.setProperties(properties1);
        try {
            cachingFileDataStore0.deleteAllMetadataRecords("Blob garbage collection");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj1 = blobMigration0.getImplementation();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration3 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo4 = blobMigration3.getMBeanInfo();
        blobMigration3.preDeregister();
        blobMigration3.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array11 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList12 = blobMigration3.getAttributes(str_array11);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration13 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo14 = blobMigration13.getMBeanInfo();
        blobMigration13.preDeregister();
        blobMigration13.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array21 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList22 = blobMigration13.getAttributes(str_array21);
        try {
            java.lang.Object obj23 = blobMigration0.invoke("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (java.lang.Object[]) str_array11, str_array21);
            org.junit.Assert.fail("Expected exception of type javax.management.ReflectionException");
        } catch (javax.management.ReflectionException e) {
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(mBeanInfo4);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertNotNull(mBeanInfo14);
        org.junit.Assert.assertNotNull(str_array21);
        org.junit.Assert.assertNotNull(attributeList22);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        java.io.InputStream inputStream7 = null;
        try {
            cachingFileDataStore0.addMetadataRecord(inputStream7, "Migration started");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        java.io.File file15 = null;
        java.io.File file16 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file15);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file16);
        java.io.File file19 = null;
        java.io.File file20 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file19);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file16, file20, false, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer25 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file16);
        java.io.File file26 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("cachePath", file16);
        try {
            oakFileDataStore0.addMetadataRecord(file16, "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertNotNull(file26);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        try {
            cachingFileDataStore0.updateModifiedDateOnAccess((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.startMark();
        try {
            java.lang.String str7 = dataStoreBlobStore2.writeBlob("cachePath");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = cachingFileDataStore0.getType();
        java.io.InputStream inputStream2 = null;
        try {
            cachingFileDataStore0.addMetadataRecord(inputStream2, "markedTimestamp-/tmp");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type1.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.apache.jackrabbit.core.data.DataStore dataStore13 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore13, false);
        dataStoreBlobStore15.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str19 = dataStoreBlobStore15.resolveChunks("BlobStoreStats");
        long long20 = dataStoreBlobStore15.getBlockSizeMin();
        java.util.Iterator<java.lang.String> iterator_str22 = dataStoreBlobStore15.resolveChunks("fsBackendPath");
        blobIdTracker12.add(iterator_str22);
        try {
            java.util.Iterator<java.lang.String> iterator_str24 = blobIdTracker12.get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str19);
        org.junit.Assert.assertTrue(long20 == 0L);
        org.junit.Assert.assertNotNull(iterator_str22);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        java.io.InputStream inputStream3 = null;
        try {
            fSBackend0.addMetadataRecord(inputStream3, "fsBackendPath");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        dataStoreBlobStore2.deleteAllMetadataRecords("BlobStore-MemCache");
        try {
            java.lang.String str18 = dataStoreBlobStore2.getReference("encodeLengthInId");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever5 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore6 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore8 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore6, false);
        dataStoreBlobStore8.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str12 = dataStoreBlobStore8.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor13 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard16 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector17 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever5, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore8, executor13, 0L, "fsBackendPath", whiteboard16);
        dataStoreBlobStore8.setBlockSize((int) (byte) -1);
        java.util.Iterator<java.lang.String> iterator_str21 = dataStoreBlobStore8.resolveChunks("markedTimestamp-,");
        try {
            org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker22 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("cachePath", "org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore", scheduledExecutorService2, (long) '#', 10L, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str12);
        org.junit.Assert.assertNotNull(iterator_str21);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore5.setStagingSplitPercentage(100);
        int i8 = cachingFileDataStore5.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type9 = cachingFileDataStore5.getType();
        try {
            org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore", "org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore", scheduledExecutorService2, (long) (short) 1, (long) 16384, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) cachingFileDataStore5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i8 == 16384);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type9.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier3 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord4 = fSBackend0.getRecord(dataIdentifier3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats1 = cloudBlobStore0.getCacheStats();
        cloudBlobStore0.setCloudProvider("Blob garbage collection");
        org.apache.jackrabbit.oak.spi.blob.AbstractBlobStore.BlockId blockId4 = null;
        try {
            org.apache.jackrabbit.oak.spi.blob.AbstractBlobStore.Data data5 = cloudBlobStore0.load(blockId4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(cacheStats1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        java.io.InputStream inputStream5 = null;
        dataStoreBlobStore2.addMetadataRecord(inputStream5, "blob");
        try {
            int i9 = dataStoreBlobStore2.deleteAllOlderThan((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array8 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList9 = blobMigration0.getAttributes(str_array8);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration10 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj11 = blobMigration10.getImplementation();
        java.lang.Class<?> cls12 = blobMigration10.getImplementationClass();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration13 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo14 = blobMigration13.getMBeanInfo();
        blobMigration13.preDeregister();
        blobMigration13.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array21 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList22 = blobMigration13.getAttributes(str_array21);
        javax.management.AttributeList attributeList23 = blobMigration10.setAttributes(attributeList22);
        javax.management.AttributeList attributeList24 = blobMigration0.setAttributes(attributeList22);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration26 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration26.preDeregister();
        java.lang.Class<?> cls28 = blobMigration26.getMBeanInterface();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration29 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo30 = blobMigration29.getMBeanInfo();
        blobMigration29.preDeregister();
        blobMigration29.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array37 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList38 = blobMigration29.getAttributes(str_array37);
        javax.management.AttributeList attributeList39 = blobMigration26.getAttributes(str_array37);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration40 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo41 = blobMigration40.getMBeanInfo();
        blobMigration40.preDeregister();
        blobMigration40.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array48 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList49 = blobMigration40.getAttributes(str_array48);
        try {
            java.lang.Object obj50 = blobMigration0.invoke("hi!", (java.lang.Object[]) str_array37, str_array48);
            org.junit.Assert.fail("Expected exception of type javax.management.ReflectionException");
        } catch (javax.management.ReflectionException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(cls12);
        org.junit.Assert.assertNotNull(mBeanInfo14);
        org.junit.Assert.assertNotNull(str_array21);
        org.junit.Assert.assertNotNull(attributeList22);
        org.junit.Assert.assertNotNull(attributeList23);
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNotNull(cls28);
        org.junit.Assert.assertNotNull(mBeanInfo30);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertNotNull(attributeList38);
        org.junit.Assert.assertNotNull(attributeList39);
        org.junit.Assert.assertNotNull(mBeanInfo41);
        org.junit.Assert.assertNotNull(str_array48);
        org.junit.Assert.assertNotNull(attributeList49);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        try {
            java.util.Iterator<java.lang.String> iterator_str16 = dataStoreBlobStore2.getAllChunkIds(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.startMark();
        java.io.InputStream inputStream6 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions7 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.addRecord(inputStream6, blobOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        java.io.InputStream inputStream5 = null;
        try {
            java.lang.String str6 = dataStoreBlobStore2.writeBlob(inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        try {
            int i14 = dataStoreBlobStore5.deleteAllOlderThan(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array8 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList9 = blobMigration0.getAttributes(str_array8);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration10 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj11 = blobMigration10.getImplementation();
        java.lang.Class<?> cls12 = blobMigration10.getImplementationClass();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration13 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo14 = blobMigration13.getMBeanInfo();
        blobMigration13.preDeregister();
        blobMigration13.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array21 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList22 = blobMigration13.getAttributes(str_array21);
        javax.management.AttributeList attributeList23 = blobMigration10.setAttributes(attributeList22);
        javax.management.AttributeList attributeList24 = blobMigration0.setAttributes(attributeList22);
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore26 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str28 = cloudBlobStore26.getBlobId("markedTimestamp");
        java.lang.String str29 = cloudBlobStore26.getSecretKey();
        cloudBlobStore26.setSecretKey(",");
        cloudBlobStore26.clearCache();
        java.util.Iterator<java.lang.String> iterator_str34 = cloudBlobStore26.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend35 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array36 = fSBackend35.getOrCreateReferenceKey();
        byte[] byte_array37 = fSBackend35.getOrCreateReferenceKey();
        cloudBlobStore26.setReferenceKey(byte_array37);
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore39 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats40 = cloudBlobStore39.getCacheStats();
        long long41 = cloudBlobStore39.getBlobCacheSize();
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore42 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore42.close();
        oakFileDataStore42.clearInUse();
        byte[] byte_array49 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore42.setReferenceKey(byte_array49);
        oakFileDataStore42.init("cachePath");
        java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier53 = oakFileDataStore42.getAllIdentifiers();
        java.lang.Object[] obj_array54 = new java.lang.Object[] { byte_array37, long41, iterator_dataIdentifier53 };
        java.lang.String[] str_array56 = new java.lang.String[] { "cacheSizeInMB" };
        try {
            java.lang.Object obj57 = blobMigration0.invoke("BlobStoreStats", obj_array54, str_array56);
            org.junit.Assert.fail("Expected exception of type javax.management.ReflectionException");
        } catch (javax.management.ReflectionException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(cls12);
        org.junit.Assert.assertNotNull(mBeanInfo14);
        org.junit.Assert.assertNotNull(str_array21);
        org.junit.Assert.assertNotNull(attributeList22);
        org.junit.Assert.assertNotNull(attributeList23);
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(iterator_str34);
        org.junit.Assert.assertNotNull(byte_array36);
        org.junit.Assert.assertNotNull(byte_array37);
        org.junit.Assert.assertNotNull(cacheStats40);
        org.junit.Assert.assertTrue(long41 == 16777216L);
        org.junit.Assert.assertNotNull(byte_array49);
        org.junit.Assert.assertNotNull(iterator_dataIdentifier53);
        org.junit.Assert.assertNotNull(obj_array54);
        org.junit.Assert.assertNotNull(str_array56);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        dataStoreBlobStore3.setMaxCachedBinarySize((int) (short) 0);
        dataStoreBlobStore3.startMark();
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3, true);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier16 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord17 = dataStoreBlobStore15.getRecordIfStored(dataIdentifier16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.clearCache();
        cloudBlobStore0.setCloudContainer("ReferencedBlob{blob=null, id='BlobStoreStats'}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        java.io.File file12 = null;
        java.io.File file13 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file12);
        dataStoreBlobStore10.addMetadataRecord(file13, "BlobStore-MemCache");
        try {
            dataStoreBlobStore10.updateModifiedDateOnAccess(4096L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(file13);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore1 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        consolidatedDataStoreCacheStats0.cachingDataStore = cachingFileDataStore2;
        try {
            cachingFileDataStore2.clearInUse();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(abstractSharedCachingDataStore1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType0 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.REFERENCES;
        try {
            java.lang.String str2 = sharedStoreRecordType0.getIdFromName("encodeLengthInId");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType0 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.REFERENCES + "'", sharedStoreRecordType0.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.REFERENCES));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setEndTime((long) (short) -1);
        garbageCollectionRepoStats0.setRepositoryId("ConsolidatedDataStoreCacheStats");
        garbageCollectionRepoStats0.setLocal(false);
        int i7 = garbageCollectionRepoStats0.getNumLines();
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        long long7 = dataStoreBlobStore2.getBlockSizeMin();
        java.util.Iterator<java.lang.String> iterator_str9 = dataStoreBlobStore2.resolveChunks("fsBackendPath");
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore2.getRecordFromReference("cacheSizeInMB");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertTrue(long7 == 0L);
        org.junit.Assert.assertNotNull(iterator_str9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.apache.jackrabbit.core.data.DataStore dataStore13 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore13, false);
        dataStoreBlobStore15.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str19 = dataStoreBlobStore15.resolveChunks("BlobStoreStats");
        blobIdTracker12.remove(iterator_str19);
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState22 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("cachePath");
        java.io.File file23 = garbageCollectorFileState22.getMarkedRefs();
        garbageCollectorFileState22.close();
        java.io.File file25 = garbageCollectorFileState22.getGarbage();
        try {
            blobIdTracker12.add(file25);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str19);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertNotNull(file25);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration0.preDeregister();
        java.lang.Class<?> cls2 = blobMigration0.getMBeanInterface();
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord7 = dataStoreBlobStore5.getAllMetadataRecords("hi!");
        dataStoreBlobStore5.startMark();
        try {
            blobMigration0.setImplementation((java.lang.Object) dataStoreBlobStore5);
            org.junit.Assert.fail("Expected exception of type javax.management.NotCompliantMBeanException");
        } catch (javax.management.NotCompliantMBeanException e) {
        }
        org.junit.Assert.assertNotNull(cls2);
        org.junit.Assert.assertNull(list_dataRecord7);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.clearInUse();
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str4 = cloudBlobStore2.getBlobId("markedTimestamp");
        java.lang.String str5 = cloudBlobStore2.getSecretKey();
        cloudBlobStore2.setSecretKey(",");
        cloudBlobStore2.clearCache();
        java.util.Iterator<java.lang.String> iterator_str10 = cloudBlobStore2.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend11 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array12 = fSBackend11.getOrCreateReferenceKey();
        byte[] byte_array13 = fSBackend11.getOrCreateReferenceKey();
        cloudBlobStore2.setReferenceKey(byte_array13);
        oakFileDataStore0.setReferenceKey(byte_array13);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier16 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord17 = oakFileDataStore0.getRecordForId(dataIdentifier16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(iterator_str10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        java.lang.String str3 = cloudBlobStore0.getCloudProvider();
        try {
            long long5 = cloudBlobStore0.getBlobLength("BlobStoreStats");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 2097152);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        dataStoreBlobStore3.setBlockSize((int) (byte) -1);
        java.io.InputStream inputStream15 = null;
        dataStoreBlobStore3.addMetadataRecord(inputStream15, "markedTimestamp");
        java.io.InputStream inputStream18 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord19 = dataStoreBlobStore3.addRecord(inputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.concurrent.Executor executor6 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor6, "markedTimestamp-,", (int) (short) 0, 10L, "/tmp");
        try {
            int i13 = dataStoreBlobStore3.deleteAllOlderThan((long) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier7 = null;
        boolean b8 = cachingFileDataStore0.exists(dataIdentifier7);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier9 = null;
        try {
            cachingFileDataStore0.deleteRecord(dataIdentifier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.jackrabbit.oak.spi.blob.split.SplitBlobStore splitBlobStore0 = null;
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator blobMigrator2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator(splitBlobStore0, nodeStore1);
        blobMigrator2.stop();
        blobMigrator2.stop();
        try {
            boolean b5 = blobMigrator2.migrate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array8 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList9 = blobMigration0.getAttributes(str_array8);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration10 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj11 = blobMigration10.getImplementation();
        java.lang.Class<?> cls12 = blobMigration10.getImplementationClass();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration13 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo14 = blobMigration13.getMBeanInfo();
        blobMigration13.preDeregister();
        blobMigration13.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array21 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList22 = blobMigration13.getAttributes(str_array21);
        javax.management.AttributeList attributeList23 = blobMigration10.setAttributes(attributeList22);
        javax.management.AttributeList attributeList24 = blobMigration0.setAttributes(attributeList22);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration25 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj26 = blobMigration25.getImplementation();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration27 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj28 = blobMigration27.getImplementation();
        java.lang.Class<?> cls29 = blobMigration27.getImplementationClass();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration30 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo31 = blobMigration30.getMBeanInfo();
        blobMigration30.preDeregister();
        blobMigration30.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array38 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList39 = blobMigration30.getAttributes(str_array38);
        javax.management.AttributeList attributeList40 = blobMigration27.setAttributes(attributeList39);
        javax.management.AttributeList attributeList41 = blobMigration25.setAttributes(attributeList39);
        javax.management.AttributeList attributeList42 = blobMigration0.setAttributes(attributeList39);
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(cls12);
        org.junit.Assert.assertNotNull(mBeanInfo14);
        org.junit.Assert.assertNotNull(str_array21);
        org.junit.Assert.assertNotNull(attributeList22);
        org.junit.Assert.assertNotNull(attributeList23);
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(cls29);
        org.junit.Assert.assertNotNull(mBeanInfo31);
        org.junit.Assert.assertNotNull(str_array38);
        org.junit.Assert.assertNotNull(attributeList39);
        org.junit.Assert.assertNotNull(attributeList40);
        org.junit.Assert.assertNotNull(attributeList41);
        org.junit.Assert.assertNotNull(attributeList42);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = consolidatedDataStoreCacheStats0.nodeStore;
        javax.management.openmbean.TabularData tabularData2 = consolidatedDataStoreCacheStats0.getCacheStats();
        javax.management.openmbean.TabularData tabularData3 = consolidatedDataStoreCacheStats0.getCacheStats();
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertNotNull(tabularData2);
        org.junit.Assert.assertNotNull(tabularData3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker15 = null;
        dataStoreBlobStore2.addTracker(blobTracker15);
        boolean b18 = dataStoreBlobStore2.deleteMetadataRecord("markedTimestamp-/tmp");
        try {
            java.lang.String str20 = dataStoreBlobStore2.writeBlob("Blob migration:5BLDB1SVB7VKPR3D9TL90A4EEHT79NKP");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        javax.management.MBeanInfo mBeanInfo2 = blobMigration0.getMBeanInfo();
        java.lang.Object[] obj_array5 = new java.lang.Object[] { 1 };
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration6 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration6.preDeregister();
        java.lang.Class<?> cls8 = blobMigration6.getMBeanInterface();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration9 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo10 = blobMigration9.getMBeanInfo();
        blobMigration9.preDeregister();
        blobMigration9.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array17 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList18 = blobMigration9.getAttributes(str_array17);
        javax.management.AttributeList attributeList19 = blobMigration6.getAttributes(str_array17);
        try {
            java.lang.Object obj20 = blobMigration0.invoke("hi!", obj_array5, str_array17);
            org.junit.Assert.fail("Expected exception of type javax.management.ReflectionException");
        } catch (javax.management.ReflectionException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(mBeanInfo2);
        org.junit.Assert.assertNotNull(obj_array5);
        org.junit.Assert.assertNotNull(cls8);
        org.junit.Assert.assertNotNull(mBeanInfo10);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertNotNull(attributeList18);
        org.junit.Assert.assertNotNull(attributeList19);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.io.File file1 = null;
        java.io.File file2 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file1);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file2);
        java.io.File file5 = null;
        java.io.File file6 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file5);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file6);
        java.io.File file9 = null;
        java.io.File file10 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file9);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file10);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file6, file10, false, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file2, file10);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever16 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever17 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore18 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore20 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore18, false);
        java.util.concurrent.Executor executor21 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard26 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector27 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever17, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore20, executor21, ",", (int) (byte) 10, (long) 10, "", whiteboard26);
        java.util.concurrent.Executor executor28 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard31 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector32 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever16, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore20, executor28, 4096L, "Blob migration", whiteboard31);
        java.io.File file34 = null;
        java.io.File file35 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file34);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file35);
        java.io.File file38 = null;
        java.io.File file39 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file38);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file39);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file35, file39, false, false);
        dataStoreBlobStore20.addMetadataRecord(file39, "fsBackendPath");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file10, file39, true, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer50 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file10, 16);
        fSBlobSerializer50.close();
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertNotNull(file39);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord13 = dataStoreBlobStore4.getAllMetadataRecords("markedTimestamp");
        java.util.concurrent.Executor executor14 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard19 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector20 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor14, "hi!", (int) ' ', (long) ' ', "ConsolidatedDataStoreCacheStats", whiteboard19);
        try {
            int i22 = dataStoreBlobStore4.deleteAllOlderThan((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        blobIdTracker12.close();
        blobIdTracker12.close();
        org.apache.jackrabbit.core.data.DataStore dataStore15 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore17 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore15, false);
        dataStoreBlobStore17.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str21 = dataStoreBlobStore17.resolveChunks("BlobStoreStats");
        long long22 = dataStoreBlobStore17.getBlockSizeMin();
        java.util.Iterator<java.lang.String> iterator_str24 = dataStoreBlobStore17.resolveChunks("fsBackendPath");
        blobIdTracker12.remove(iterator_str24);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever26 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore27 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore29 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore27, false);
        dataStoreBlobStore29.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str33 = dataStoreBlobStore29.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor34 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard37 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector38 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever26, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore29, executor34, 0L, "fsBackendPath", whiteboard37);
        dataStoreBlobStore29.setBlockSize((int) (byte) -1);
        java.io.InputStream inputStream41 = null;
        dataStoreBlobStore29.addMetadataRecord(inputStream41, "markedTimestamp");
        java.io.File file45 = null;
        java.io.File file46 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file45);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file46);
        java.io.File file49 = null;
        java.io.File file50 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file49);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file50);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file46, file50, false, false);
        dataStoreBlobStore29.addMetadataRecord(file50, "ReferencedBlob{blob=null, id='BlobStoreStats'}");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker.Options options57 = null;
        try {
            blobIdTracker12.remove(file50, options57);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str21);
        org.junit.Assert.assertTrue(long22 == 0L);
        org.junit.Assert.assertNotNull(iterator_str24);
        org.junit.Assert.assertNotNull(iterator_str33);
        org.junit.Assert.assertNotNull(file46);
        org.junit.Assert.assertNotNull(file50);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.jackrabbit.oak.spi.blob.split.SplitBlobStore splitBlobStore0 = null;
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator blobMigrator2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator(splitBlobStore0, nodeStore1);
        blobMigrator2.stop();
        blobMigrator2.stop();
        java.lang.String str5 = blobMigrator2.getLastProcessedPath();
        try {
            boolean b6 = blobMigrator2.migrate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord("cacheSize");
        java.lang.String[] str_array22 = new java.lang.String[] { "cachePath", "ReferencedBlob{blob=null, id='BlobStoreStats'}", "ConsolidatedDataStoreCacheStats", "*ERROR*-cachePath", ",", "BlobStoreStats", "path", "BlobStoreStats", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", "cacheSize", "markedTimestamp", "org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore", "," };
        java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<java.lang.String>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str23, str_array22);
        boolean b26 = dataStoreBlobStore2.deleteChunks((java.util.List<java.lang.String>) arraylist_str23, 16777216L);
        java.io.InputStream inputStream27 = null;
        dataStoreBlobStore2.addMetadataRecord(inputStream27, "markedTimestamp");
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        dataStoreBlobStore3.setMaxCachedBinarySize((int) (short) 0);
        dataStoreBlobStore3.startMark();
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob15 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore3, ",");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier16 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord17 = dataStoreBlobStore3.getRecord(dataIdentifier16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Class<?> cls1 = blobMigration0.getMBeanInterface();
        javax.management.MBeanServer mBeanServer2 = null;
        javax.management.ObjectName objectName3 = null;
        javax.management.ObjectName objectName4 = blobMigration0.preRegister(mBeanServer2, objectName3);
        org.junit.Assert.assertNotNull(cls1);
        org.junit.Assert.assertNull(objectName4);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        blobIdTracker12.close();
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever14 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore15 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore17 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore15, false);
        dataStoreBlobStore17.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str21 = dataStoreBlobStore17.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor22 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard25 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector26 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever14, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore17, executor22, 0L, "fsBackendPath", whiteboard25);
        dataStoreBlobStore17.setBlockSize((int) (byte) -1);
        java.io.InputStream inputStream29 = null;
        dataStoreBlobStore17.addMetadataRecord(inputStream29, "markedTimestamp");
        java.io.File file33 = null;
        java.io.File file34 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file33);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file34);
        java.io.File file37 = null;
        java.io.File file38 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file37);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file38);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file34, file38, false, false);
        dataStoreBlobStore17.addMetadataRecord(file38, "ReferencedBlob{blob=null, id='BlobStoreStats'}");
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer46 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file38, (int) (byte) 0);
        java.io.File file48 = null;
        java.io.File file49 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file48);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file49);
        java.io.File file52 = null;
        java.io.File file53 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file52);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file53);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file49, file53, false, false);
        java.io.File file59 = null;
        java.io.File file60 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file59);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file60);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file49, file60, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer65 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file60, (int) 'a');
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file38, file60, true);
        try {
            blobIdTracker12.remove(file60);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str21);
        org.junit.Assert.assertNotNull(file34);
        org.junit.Assert.assertNotNull(file38);
        org.junit.Assert.assertNotNull(file49);
        org.junit.Assert.assertNotNull(file53);
        org.junit.Assert.assertNotNull(file60);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        try {
            dataStoreBlobStore2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, true, 16384);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        dataStoreBlobStore2.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer10 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2);
        org.apache.jackrabbit.core.data.DataStore dataStore11 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore13 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore11, false);
        dataStoreBlobStore13.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore13.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore18 = dataStoreBlobStore13.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore19 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore21 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore19, false);
        dataStoreBlobStore21.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore21.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str30, str_array29);
        long long33 = dataStoreBlobStore21.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str30, (long) (byte) 0);
        long long35 = dataStoreBlobStore13.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str30, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector36 = null;
        dataStoreBlobStore13.setBlobStatsCollector(blobStatsCollector36);
        long long38 = dataStoreBlobStore13.getBlockSizeMin();
        java.io.InputStream inputStream39 = null;
        dataStoreBlobStore13.addMetadataRecord(inputStream39, "markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob43 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore13, "Migration started");
        java.lang.String str44 = blobIdSerializer10.serialize((org.apache.jackrabbit.oak.api.Blob) blobStoreBlob43);
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType45 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.BLOBREFERENCES;
        boolean b46 = blobStoreBlob43.equals((java.lang.Object) sharedStoreRecordType45);
        java.lang.String str47 = sharedStoreRecordType45.getType();
        try {
            java.lang.String str49 = sharedStoreRecordType45.getIdFromName("ConsolidatedDataStoreCacheStats");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNull(dataStore18);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(long33 == 0L);
        org.junit.Assert.assertTrue(long35 == 0L);
        org.junit.Assert.assertTrue(long38 == 0L);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Migration started" + "'", str44.equals("Migration started"));
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType45 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.BLOBREFERENCES + "'", sharedStoreRecordType45.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.BLOBREFERENCES));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "blob" + "'", str47.equals("blob"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array0 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord1 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, dataRecord_array0);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array3 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord4 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord4, dataRecord_array3);
        java.util.Set<java.lang.String> set_str6 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord4);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array7 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord8 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord8, dataRecord_array7);
        java.util.Set<java.lang.String> set_str10 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord8);
        org.junit.Assert.assertNotNull(dataRecord_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(dataRecord_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set_str6);
        org.junit.Assert.assertNotNull(dataRecord_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set_str10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        blobIdTracker12.close();
        blobIdTracker12.close();
        org.apache.jackrabbit.core.data.DataStore dataStore15 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore17 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore15, false);
        dataStoreBlobStore17.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str21 = dataStoreBlobStore17.resolveChunks("BlobStoreStats");
        long long22 = dataStoreBlobStore17.getBlockSizeMin();
        java.util.Iterator<java.lang.String> iterator_str24 = dataStoreBlobStore17.resolveChunks("fsBackendPath");
        blobIdTracker12.remove(iterator_str24);
        try {
            java.io.File file27 = blobIdTracker12.get("Blob migration:5BLDB1SVB7VKPR3D9TL90A4EEHT79NKP");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str21);
        org.junit.Assert.assertTrue(long22 == 0L);
        org.junit.Assert.assertNotNull(iterator_str24);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        java.lang.String str5 = cloudBlobStore0.getBlobId("Blob garbage collection");
        cloudBlobStore0.setCloudContainer("encodeLengthInId");
        cloudBlobStore0.setReferenceKeyPlainText("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        cloudBlobStore0.setBlockSizeMin(100);
        long long12 = cloudBlobStore0.getBlobCacheSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(long12 == 16777216L);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0);
        java.lang.String str11 = dataStoreBlobStore9.getBlobId("markedTimestamp-/tmp");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier12 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord13 = dataStoreBlobStore9.getRecordForId(dataIdentifier12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        java.lang.String str3 = cloudBlobStore0.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer4 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore0);
        java.io.InputStream inputStream5 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions6 = null;
        try {
            java.lang.String str7 = cloudBlobStore0.writeBlob(inputStream5, blobOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 2097152);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setEndTime((long) (short) -1);
        garbageCollectionRepoStats0.setStartTime(0L);
        int i5 = garbageCollectionRepoStats0.getNumLines();
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore6 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str8 = cloudBlobStore6.getBlobId("markedTimestamp");
        java.lang.String str9 = cloudBlobStore6.getSecretKey();
        cloudBlobStore6.setSecretKey(",");
        cloudBlobStore6.clearCache();
        java.util.Iterator<java.lang.String> iterator_str14 = cloudBlobStore6.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array16 = fSBackend15.getOrCreateReferenceKey();
        byte[] byte_array17 = fSBackend15.getOrCreateReferenceKey();
        cloudBlobStore6.setReferenceKey(byte_array17);
        try {
            int i21 = cloudBlobStore0.readBlob("markedTimestamp", 0L, byte_array17, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator_str14);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertNotNull(byte_array17);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        boolean b11 = dataStoreBlobStore3.deleteMetadataRecord("");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier12 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord13 = dataStoreBlobStore3.getRecordForId(dataIdentifier12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.clearInUse();
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str4 = cloudBlobStore2.getBlobId("markedTimestamp");
        java.lang.String str5 = cloudBlobStore2.getSecretKey();
        cloudBlobStore2.setSecretKey(",");
        cloudBlobStore2.clearCache();
        java.util.Iterator<java.lang.String> iterator_str10 = cloudBlobStore2.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend11 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array12 = fSBackend11.getOrCreateReferenceKey();
        byte[] byte_array13 = fSBackend11.getOrCreateReferenceKey();
        cloudBlobStore2.setReferenceKey(byte_array13);
        oakFileDataStore0.setReferenceKey(byte_array13);
        oakFileDataStore0.close();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier17 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord18 = oakFileDataStore0.getRecordIfStored(dataIdentifier17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(iterator_str10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore7 = dataStoreBlobStore2.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore8 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore8, false);
        dataStoreBlobStore10.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore10.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str19, str_array18);
        long long22 = dataStoreBlobStore10.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) (byte) 0);
        long long24 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector25 = null;
        dataStoreBlobStore2.setBlobStatsCollector(blobStatsCollector25);
        long long27 = dataStoreBlobStore2.getBlockSizeMin();
        java.io.InputStream inputStream28 = null;
        dataStoreBlobStore2.addMetadataRecord(inputStream28, "markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob32 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2, "Migration started");
        try {
            java.io.InputStream inputStream33 = blobStoreBlob32.getNewStream();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataStore7);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(long22 == 0L);
        org.junit.Assert.assertTrue(long24 == 0L);
        org.junit.Assert.assertTrue(long27 == 0L);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        java.lang.String str5 = cloudBlobStore0.getBlobId("Blob garbage collection");
        cloudBlobStore0.setCloudContainer("encodeLengthInId");
        cloudBlobStore0.setReferenceKeyPlainText("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        cloudBlobStore0.setBlockSizeMin(100);
        java.io.InputStream inputStream12 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions13 = null;
        try {
            java.lang.String str14 = cloudBlobStore0.writeBlob(inputStream12, blobOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.jackrabbit.oak.api.Blob blob0 = null;
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob2 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob0, "");
        org.apache.jackrabbit.oak.api.Blob blob3 = referencedBlob2.getBlob();
        java.lang.String str4 = referencedBlob2.getId();
        org.junit.Assert.assertNull(blob3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        dataStoreBlobStore2.deleteAllMetadataRecords("BlobStore-MemCache");
        dataStoreBlobStore2.setBlockSize((int) (byte) 1);
        dataStoreBlobStore2.startMark();
        try {
            int i20 = dataStoreBlobStore2.getMinRecordLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState1 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("*ERROR*-cachePath");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = consolidatedDataStoreCacheStats0.nodeStore;
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore2 = null;
        consolidatedDataStoreCacheStats0.cachingDataStore = abstractSharedCachingDataStore2;
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore4 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertNull(abstractSharedCachingDataStore4);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord13 = dataStoreBlobStore4.getAllMetadataRecords("markedTimestamp");
        java.util.concurrent.Executor executor14 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard17 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector18 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor14, (long) 'a', "", whiteboard17);
        int i19 = dataStoreBlobStore4.sweep();
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord21 = dataStoreBlobStore4.getRecordFromReference("markedTimestamp");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        boolean b14 = oakFileDataStore0.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord16 = oakFileDataStore0.getAllMetadataRecords("Blob garbage collection");
        java.lang.String str17 = oakFileDataStore0.getPath();
        oakFileDataStore0.close();
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_dataRecord16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "cachePath/repository/datastore" + "'", str17.equals("cachePath/repository/datastore"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        java.util.Properties properties1 = null;
        fSBackend0.setProperties(properties1);
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord4 = fSBackend0.getMetadataRecord("cacheSizeInMB");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        org.apache.jackrabbit.core.data.DataRecord dataRecord14 = oakFileDataStore0.getMetadataRecord("");
        int i15 = oakFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier16 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord17 = oakFileDataStore0.getRecordIfStored(dataIdentifier16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNull(dataRecord14);
        org.junit.Assert.assertTrue(i15 == 4096);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        cloudBlobStore0.clearInUse();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj1 = blobMigration0.getImplementation();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration3 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration3.preDeregister();
        java.lang.Class<?> cls5 = blobMigration3.getMBeanInterface();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration6 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo7 = blobMigration6.getMBeanInfo();
        blobMigration6.preDeregister();
        blobMigration6.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array14 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList15 = blobMigration6.getAttributes(str_array14);
        javax.management.AttributeList attributeList16 = blobMigration3.getAttributes(str_array14);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration17 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo18 = blobMigration17.getMBeanInfo();
        blobMigration17.preDeregister();
        blobMigration17.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array25 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList26 = blobMigration17.getAttributes(str_array25);
        try {
            java.lang.Object obj27 = blobMigration0.invoke("path", (java.lang.Object[]) str_array14, str_array25);
            org.junit.Assert.fail("Expected exception of type javax.management.ReflectionException");
        } catch (javax.management.ReflectionException e) {
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(cls5);
        org.junit.Assert.assertNotNull(mBeanInfo7);
        org.junit.Assert.assertNotNull(str_array14);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertNotNull(mBeanInfo18);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertNotNull(attributeList26);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.concurrent.Executor executor12 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard15 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector16 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor12, 4096L, "Blob migration", whiteboard15);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore18 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore4, true);
        java.util.Iterator<java.lang.String> iterator_str20 = dataStoreBlobStore4.resolveChunks("fsBackendPath");
        java.io.InputStream inputStream21 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions22 = null;
        try {
            java.lang.String str23 = dataStoreBlobStore4.writeBlob(inputStream21, blobOptions22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str20);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = oakFileDataStore0.getType();
        oakFileDataStore0.close();
        java.io.InputStream inputStream3 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord4 = oakFileDataStore0.addRecord(inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type1.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        java.util.Properties properties7 = null;
        cachingFileDataStore0.setProperties(properties7);
        java.io.InputStream inputStream9 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions10 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord11 = cachingFileDataStore0.addRecord(inputStream9, blobOptions10);
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier7 = null;
        boolean b8 = cachingFileDataStore0.exists(dataIdentifier7);
        try {
            cachingFileDataStore0.init("cachePath/repository/datastore");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore3.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str12 = new java.util.ArrayList<java.lang.String>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str12, str_array11);
        long long15 = dataStoreBlobStore3.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str12, (long) (byte) 0);
        org.apache.jackrabbit.core.data.DataStore dataStore16 = dataStoreBlobStore3.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore17 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore19 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore17, false);
        dataStoreBlobStore19.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore19.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str28, str_array27);
        long long31 = dataStoreBlobStore19.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str28, (long) (byte) 0);
        boolean b33 = dataStoreBlobStore3.deleteChunks((java.util.List<java.lang.String>) arraylist_str28, (long) ' ');
        java.lang.String[] str_array44 = new java.lang.String[] { "/tmp", "markedTimestamp-,", "BlobStoreStats", "", "markedTimestamp", "BlobStore-MemCache", "Blob migration", "markedTimestamp", "BlobStoreStats", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore" };
        java.util.ArrayList<java.lang.String> arraylist_str45 = new java.util.ArrayList<java.lang.String>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str45, str_array44);
        long long48 = dataStoreBlobStore3.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str45, 1L);
        java.util.concurrent.Executor executor49 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector54 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor49, "cachePath", 10, (long) (short) -1, "markedTimestamp-/tmp");
        try {
            long long55 = markSweepGarbageCollector54.checkConsistency();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(long15 == 0L);
        org.junit.Assert.assertNull(dataStore16);
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(long31 == 0L);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(str_array44);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(long48 == 0L);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        org.apache.jackrabbit.core.data.DataRecord dataRecord14 = oakFileDataStore0.getMetadataRecord("");
        int i15 = oakFileDataStore0.getMinRecordLength();
        oakFileDataStore0.setMinRecordLength((int) '4');
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNull(dataRecord14);
        org.junit.Assert.assertTrue(i15 == 4096);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.lang.String str0 = org.apache.jackrabbit.oak.plugins.blob.BlobGC.CONSISTENCY_OP_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Blob consistency check" + "'", str0.equals("Blob consistency check"));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        org.apache.jackrabbit.oak.spi.blob.AbstractBlobStore.BlockId blockId3 = null;
        try {
            org.apache.jackrabbit.oak.spi.blob.AbstractBlobStore.Data data4 = cloudBlobStore0.load(blockId3);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        try {
            java.util.Iterator<java.lang.String> iterator_str5 = cloudBlobStore0.resolveChunks("cachePath/repository/datastore");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord12 = dataStoreBlobStore3.getAllMetadataRecords("markedTimestamp");
        boolean b14 = dataStoreBlobStore3.deleteMetadataRecord("");
        org.junit.Assert.assertNull(list_dataRecord12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingRetryInterval(16);
        cachingFileDataStore0.setStagingPurgeInterval((int) (short) 10);
        try {
            int i10 = cachingFileDataStore0.deleteAllOlderThan(4096L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setCloudContainer("markedTimestamp-,");
        java.io.InputStream inputStream6 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions7 = null;
        try {
            java.lang.String str8 = cloudBlobStore0.writeBlob(inputStream6, blobOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        java.io.InputStream inputStream1 = null;
        try {
            fSBackend0.addMetadataRecord(inputStream1, "Blob migration:5BLDB1SVB7VKPR3D9TL90A4EEHT79NKP");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.clearCache();
        java.lang.String str5 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setCloudContainer("Blob migration");
        cloudBlobStore0.setSecretKey("Migration started");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array13 = fSBackend12.getOrCreateReferenceKey();
        byte[] byte_array14 = fSBackend12.getOrCreateReferenceKey();
        try {
            int i17 = cloudBlobStore0.readBlob("Blob consistency check", (long) (byte) 10, byte_array14, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore7 = dataStoreBlobStore2.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore8 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore8, false);
        dataStoreBlobStore10.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore10.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str19, str_array18);
        long long22 = dataStoreBlobStore10.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) (byte) 0);
        long long24 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector25 = null;
        dataStoreBlobStore2.setBlobStatsCollector(blobStatsCollector25);
        long long27 = dataStoreBlobStore2.getBlockSizeMin();
        java.io.InputStream inputStream28 = null;
        dataStoreBlobStore2.addMetadataRecord(inputStream28, "markedTimestamp");
        java.io.InputStream inputStream31 = null;
        dataStoreBlobStore2.addMetadataRecord(inputStream31, "ConsolidatedDataStoreCacheStats");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend36 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array37 = fSBackend36.getOrCreateReferenceKey();
        byte[] byte_array38 = fSBackend36.getOrCreateReferenceKey();
        try {
            int i41 = dataStoreBlobStore2.readBlob("cachePath/repository/datastore", (long) (byte) 0, byte_array38, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataStore7);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(long22 == 0L);
        org.junit.Assert.assertTrue(long24 == 0L);
        org.junit.Assert.assertTrue(long27 == 0L);
        org.junit.Assert.assertNotNull(byte_array37);
        org.junit.Assert.assertNotNull(byte_array38);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore7 = dataStoreBlobStore2.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore8 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore8, false);
        dataStoreBlobStore10.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore10.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str19, str_array18);
        long long22 = dataStoreBlobStore10.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) (byte) 0);
        long long24 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector25 = null;
        dataStoreBlobStore2.setBlobStatsCollector(blobStatsCollector25);
        long long27 = dataStoreBlobStore2.getBlockSizeMin();
        java.io.InputStream inputStream28 = null;
        dataStoreBlobStore2.addMetadataRecord(inputStream28, "markedTimestamp");
        java.io.InputStream inputStream31 = null;
        dataStoreBlobStore2.addMetadataRecord(inputStream31, "ConsolidatedDataStoreCacheStats");
        try {
            int i35 = dataStoreBlobStore2.deleteAllOlderThan((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataStore7);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(long22 == 0L);
        org.junit.Assert.assertTrue(long24 == 0L);
        org.junit.Assert.assertTrue(long27 == 0L);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        dataStoreBlobStore3.setMaxCachedBinarySize((int) (short) 0);
        dataStoreBlobStore3.startMark();
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob15 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore3, ",");
        try {
            long long16 = blobStoreBlob15.length();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        org.apache.jackrabbit.oak.spi.blob.AbstractBlobStore.BlockId blockId9 = null;
        try {
            org.apache.jackrabbit.oak.spi.blob.AbstractBlobStore.Data data10 = cloudBlobStore0.load(blockId9);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator_str8);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        java.io.InputStream inputStream1 = null;
        try {
            fSBackend0.addMetadataRecord(inputStream1, "*ERROR*-ConsolidatedDataStoreCacheStats");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.clearInUse();
        java.lang.String str4 = oakFileDataStore0.getPath();
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever5 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever6 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore7 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore7, false);
        java.util.concurrent.Executor executor10 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard15 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector16 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever6, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore9, executor10, ",", (int) (byte) 10, (long) 10, "", whiteboard15);
        java.util.concurrent.Executor executor17 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard20 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector21 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever5, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore9, executor17, 4096L, "Blob migration", whiteboard20);
        java.io.File file23 = null;
        java.io.File file24 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file23);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file24);
        java.io.File file27 = null;
        java.io.File file28 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file27);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file28);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file24, file28, false, false);
        dataStoreBlobStore9.addMetadataRecord(file28, "fsBackendPath");
        try {
            oakFileDataStore0.addMetadataRecord(file28, "markedTimestamp-,");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertNotNull(file28);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        dataStoreBlobStore3.setBlockSize((int) (byte) -1);
        java.io.InputStream inputStream15 = null;
        dataStoreBlobStore3.addMetadataRecord(inputStream15, "markedTimestamp");
        java.io.File file19 = null;
        java.io.File file20 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file19);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file20);
        java.io.File file23 = null;
        java.io.File file24 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file23);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file24);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file20, file24, false, false);
        dataStoreBlobStore3.addMetadataRecord(file24, "ReferencedBlob{blob=null, id='BlobStoreStats'}");
        try {
            long long32 = dataStoreBlobStore3.getBlobLength("Blob migration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertNotNull(file24);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        int i3 = cloudBlobStore0.sweep();
        cloudBlobStore0.startMark();
        java.io.InputStream inputStream5 = null;
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions6 = null;
        try {
            java.lang.String str7 = cloudBlobStore0.writeBlob(inputStream5, blobOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 2097152);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        try {
            java.io.File file14 = blobIdTracker12.get("cachePath");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever13 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore14 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore16 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore14, false);
        dataStoreBlobStore16.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str20 = dataStoreBlobStore16.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor21 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard24 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector25 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever13, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore16, executor21, 0L, "fsBackendPath", whiteboard24);
        dataStoreBlobStore16.setBlockSize((int) (byte) -1);
        java.util.Iterator<java.lang.String> iterator_str29 = dataStoreBlobStore16.resolveChunks("markedTimestamp-,");
        blobIdTracker12.remove(iterator_str29);
        blobIdTracker12.add("ConsolidatedDataStoreCacheStats");
        java.io.File file34 = null;
        java.io.File file35 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file34);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file35);
        java.io.File file38 = null;
        java.io.File file39 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file38);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file39);
        java.io.File file42 = null;
        java.io.File file43 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file42);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file43);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file39, file43, false, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file35, file43);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever49 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever50 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore51 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore53 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore51, false);
        java.util.concurrent.Executor executor54 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard59 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector60 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever50, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore53, executor54, ",", (int) (byte) 10, (long) 10, "", whiteboard59);
        java.util.concurrent.Executor executor61 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard64 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector65 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever49, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore53, executor61, 4096L, "Blob migration", whiteboard64);
        java.io.File file67 = null;
        java.io.File file68 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file67);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file68);
        java.io.File file71 = null;
        java.io.File file72 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file71);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file72);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file68, file72, false, false);
        dataStoreBlobStore53.addMetadataRecord(file72, "fsBackendPath");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file43, file72, true, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer82 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file43);
        try {
            blobIdTracker12.add(file43);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str20);
        org.junit.Assert.assertNotNull(iterator_str29);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertNotNull(file68);
        org.junit.Assert.assertNotNull(file72);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = consolidatedDataStoreCacheStats0.nodeStore;
        javax.management.openmbean.TabularData tabularData2 = consolidatedDataStoreCacheStats0.getCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore3 = null;
        consolidatedDataStoreCacheStats0.nodeStore = nodeStore3;
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore5 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertNotNull(tabularData2);
        org.junit.Assert.assertNull(abstractSharedCachingDataStore5);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj1 = blobMigration0.getImplementation();
        java.lang.Class<?> cls2 = blobMigration0.getImplementationClass();
        try {
            java.lang.Object obj4 = blobMigration0.getAttribute("BlobStoreStats");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException");
        } catch (javax.management.AttributeNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(cls2);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier11 = oakFileDataStore0.getAllIdentifiers();
        int i12 = oakFileDataStore0.getMinRecordLength();
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(iterator_dataIdentifier11);
        org.junit.Assert.assertTrue(i12 == 4096);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType0 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER;
        java.lang.String str1 = sharedStoreRecordType0.getType();
        java.lang.String str2 = sharedStoreRecordType0.getType();
        java.lang.String str3 = sharedStoreRecordType0.getType();
        java.lang.String str4 = sharedStoreRecordType0.getType();
        java.lang.String str6 = sharedStoreRecordType0.getNameFromId("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType0 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER + "'", sharedStoreRecordType0.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "markedTimestamp" + "'", str1.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "markedTimestamp" + "'", str2.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "markedTimestamp" + "'", str3.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "markedTimestamp" + "'", str4.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "markedTimestamp-org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore" + "'", str6.equals("markedTimestamp-org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        java.util.Properties properties1 = null;
        cachingFileDataStore0.setProperties(properties1);
        cachingFileDataStore0.setPath("cachePath");
        try {
            java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord6 = cachingFileDataStore0.getAllMetadataRecords("markedTimestamp-/tmp");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        javax.management.MBeanServer mBeanServer5 = null;
        javax.management.ObjectName objectName6 = null;
        javax.management.ObjectName objectName7 = blobMigration0.preRegister(mBeanServer5, objectName6);
        java.lang.Class<?> cls8 = blobMigration0.getMBeanInterface();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration9 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj10 = blobMigration9.getImplementation();
        java.lang.Class<?> cls11 = blobMigration9.getImplementationClass();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration12 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo13 = blobMigration12.getMBeanInfo();
        blobMigration12.preDeregister();
        blobMigration12.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array20 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList21 = blobMigration12.getAttributes(str_array20);
        javax.management.AttributeList attributeList22 = blobMigration9.setAttributes(attributeList21);
        javax.management.AttributeList attributeList23 = blobMigration0.setAttributes(attributeList21);
        try {
            java.lang.String str24 = blobMigration0.stopBlobMigration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNull(objectName7);
        org.junit.Assert.assertNotNull(cls8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(cls11);
        org.junit.Assert.assertNotNull(mBeanInfo13);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertNotNull(attributeList21);
        org.junit.Assert.assertNotNull(attributeList22);
        org.junit.Assert.assertNotNull(attributeList23);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.io.File file1 = null;
        java.io.File file2 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file1);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file2);
        java.io.File file5 = null;
        java.io.File file6 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file5);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file6);
        java.io.File file9 = null;
        java.io.File file10 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file9);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file10);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file6, file10, false, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file2, file10);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever16 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever17 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore18 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore20 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore18, false);
        java.util.concurrent.Executor executor21 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard26 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector27 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever17, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore20, executor21, ",", (int) (byte) 10, (long) 10, "", whiteboard26);
        java.util.concurrent.Executor executor28 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard31 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector32 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever16, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore20, executor28, 4096L, "Blob migration", whiteboard31);
        java.io.File file34 = null;
        java.io.File file35 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file34);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file35);
        java.io.File file38 = null;
        java.io.File file39 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file38);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file39);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file35, file39, false, false);
        dataStoreBlobStore20.addMetadataRecord(file39, "fsBackendPath");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file10, file39, true, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file10);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertNotNull(file39);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        java.io.File file12 = null;
        java.io.File file13 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file12);
        dataStoreBlobStore10.addMetadataRecord(file13, "BlobStore-MemCache");
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer17 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file13, (int) (byte) 10);
        org.junit.Assert.assertNotNull(file13);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        blobIdTracker12.close();
        java.io.File file14 = null;
        try {
            blobIdTracker12.add(file14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        java.lang.Object obj5 = blobMigration0.getImplementation();
        java.lang.Class<?> cls6 = blobMigration0.getMBeanInterface();
        try {
            java.lang.Object obj8 = blobMigration0.getAttribute("");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException");
        } catch (javax.management.AttributeNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(cls6);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setCacheSize((long) 'a');
        org.apache.jackrabbit.oak.stats.StatisticsProvider statisticsProvider6 = null;
        cachingFileDataStore0.setStatisticsProvider(statisticsProvider6);
        org.junit.Assert.assertTrue(i3 == 16384);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore5.close();
        oakFileDataStore5.clearInUse();
        oakFileDataStore5.clearInUse();
        java.lang.String str9 = oakFileDataStore5.getPath();
        try {
            org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("hi!", "Blob garbage collection", scheduledExecutorService2, 0L, (long) ' ', (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) oakFileDataStore5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        try {
            java.lang.String str12 = dataStoreBlobStore3.getReference("markedTimestamp");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        try {
            java.lang.Object obj3 = blobMigration0.getAttribute("*ERROR*-cachePath");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException");
        } catch (javax.management.AttributeNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier3 = null;
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState5 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("cachePath");
        java.io.File file6 = garbageCollectorFileState5.getMarkedRefs();
        garbageCollectorFileState5.close();
        java.io.File file8 = garbageCollectorFileState5.getGcCandidates();
        try {
            fSBackend0.write(dataIdentifier3, file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNotNull(file8);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        java.io.InputStream inputStream1 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord2 = cachingFileDataStore0.addRecord(inputStream1);
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingRetryInterval(16);
        cachingFileDataStore0.setStagingPurgeInterval((int) (short) 10);
        try {
            cachingFileDataStore0.clearInUse();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        java.io.InputStream inputStream3 = null;
        try {
            fSBackend0.addMetadataRecord(inputStream3, "Blob consistency check");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        boolean b14 = oakFileDataStore0.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier15 = oakFileDataStore0.getAllIdentifiers();
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_dataIdentifier15);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore7 = dataStoreBlobStore2.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore8 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore8, false);
        dataStoreBlobStore10.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore10.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str19, str_array18);
        long long22 = dataStoreBlobStore10.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) (byte) 0);
        long long24 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector25 = null;
        dataStoreBlobStore2.setBlobStatsCollector(blobStatsCollector25);
        long long27 = dataStoreBlobStore2.getBlockSizeMin();
        java.io.InputStream inputStream28 = null;
        dataStoreBlobStore2.addMetadataRecord(inputStream28, "markedTimestamp");
        java.io.InputStream inputStream31 = null;
        dataStoreBlobStore2.addMetadataRecord(inputStream31, "ConsolidatedDataStoreCacheStats");
        try {
            java.lang.String str34 = dataStoreBlobStore2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataStore7);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(long22 == 0L);
        org.junit.Assert.assertTrue(long24 == 0L);
        org.junit.Assert.assertTrue(long27 == 0L);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        dataStoreBlobStore2.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer10 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2);
        org.apache.jackrabbit.core.data.DataStore dataStore11 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore13 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore11, false);
        dataStoreBlobStore13.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore13.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore18 = dataStoreBlobStore13.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore19 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore21 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore19, false);
        dataStoreBlobStore21.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore21.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str30, str_array29);
        long long33 = dataStoreBlobStore21.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str30, (long) (byte) 0);
        long long35 = dataStoreBlobStore13.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str30, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector36 = null;
        dataStoreBlobStore13.setBlobStatsCollector(blobStatsCollector36);
        long long38 = dataStoreBlobStore13.getBlockSizeMin();
        java.io.InputStream inputStream39 = null;
        dataStoreBlobStore13.addMetadataRecord(inputStream39, "markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob43 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore13, "Migration started");
        java.lang.String str44 = blobIdSerializer10.serialize((org.apache.jackrabbit.oak.api.Blob) blobStoreBlob43);
        java.lang.String str45 = blobStoreBlob43.getContentIdentity();
        java.lang.String str46 = blobStoreBlob43.getContentIdentity();
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNull(dataStore18);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(long33 == 0L);
        org.junit.Assert.assertTrue(long35 == 0L);
        org.junit.Assert.assertTrue(long38 == 0L);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Migration started" + "'", str44.equals("Migration started"));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Migration started" + "'", str45.equals("Migration started"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Migration started" + "'", str46.equals("Migration started"));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever5 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever6 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore7 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore7, false);
        java.util.concurrent.Executor executor10 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard15 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector16 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever6, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore9, executor10, ",", (int) (byte) 10, (long) 10, "", whiteboard15);
        java.util.concurrent.Executor executor17 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard20 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector21 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever5, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore9, executor17, 4096L, "Blob migration", whiteboard20);
        try {
            org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker22 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("Blob consistency check", "encodeLengthInId", scheduledExecutorService2, (long) (short) 100, (long) 16384, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        javax.management.MBeanServer mBeanServer5 = null;
        javax.management.ObjectName objectName6 = null;
        javax.management.ObjectName objectName7 = blobMigration0.preRegister(mBeanServer5, objectName6);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration9 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration9.preDeregister();
        java.lang.Class<?> cls11 = blobMigration9.getMBeanInterface();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration12 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo13 = blobMigration12.getMBeanInfo();
        blobMigration12.preDeregister();
        blobMigration12.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array20 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList21 = blobMigration12.getAttributes(str_array20);
        javax.management.AttributeList attributeList22 = blobMigration9.getAttributes(str_array20);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration23 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo24 = blobMigration23.getMBeanInfo();
        blobMigration23.preDeregister();
        blobMigration23.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array31 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList32 = blobMigration23.getAttributes(str_array31);
        try {
            java.lang.Object obj33 = blobMigration0.invoke("Blob consistency check", (java.lang.Object[]) str_array20, str_array31);
            org.junit.Assert.fail("Expected exception of type javax.management.ReflectionException");
        } catch (javax.management.ReflectionException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNull(objectName7);
        org.junit.Assert.assertNotNull(cls11);
        org.junit.Assert.assertNotNull(mBeanInfo13);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertNotNull(attributeList21);
        org.junit.Assert.assertNotNull(attributeList22);
        org.junit.Assert.assertNotNull(mBeanInfo24);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertNotNull(attributeList32);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.setBlockSize(4096);
        try {
            java.lang.String str6 = dataStoreBlobStore2.writeBlob("BlobStoreStats");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        org.apache.jackrabbit.core.data.DataRecord dataRecord14 = oakFileDataStore0.getMetadataRecord("");
        java.io.File file16 = null;
        java.io.File file17 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file16);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file17);
        java.io.File file20 = null;
        java.io.File file21 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file21);
        java.io.File file24 = null;
        java.io.File file25 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file24);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file25);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file21, file25, false, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file17, file25);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever31 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever32 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore33 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore35 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore33, false);
        java.util.concurrent.Executor executor36 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard41 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector42 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever32, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore35, executor36, ",", (int) (byte) 10, (long) 10, "", whiteboard41);
        java.util.concurrent.Executor executor43 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard46 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector47 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever31, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore35, executor43, 4096L, "Blob migration", whiteboard46);
        java.io.File file49 = null;
        java.io.File file50 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file49);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file50);
        java.io.File file53 = null;
        java.io.File file54 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file53);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file54);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file50, file54, false, false);
        dataStoreBlobStore35.addMetadataRecord(file54, "fsBackendPath");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file25, file54, true, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer64 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file25);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever65 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever66 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore67 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore69 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore67, false);
        java.util.concurrent.Executor executor70 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard75 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector76 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever66, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore69, executor70, ",", (int) (byte) 10, (long) 10, "", whiteboard75);
        java.util.concurrent.Executor executor77 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard80 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector81 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever65, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore69, executor77, 4096L, "Blob migration", whiteboard80);
        java.io.File file83 = null;
        java.io.File file84 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file83);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file84);
        java.io.File file87 = null;
        java.io.File file88 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file87);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file88);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file84, file88, false, false);
        dataStoreBlobStore69.addMetadataRecord(file88, "fsBackendPath");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file25, file88, true, true);
        try {
            oakFileDataStore0.addMetadataRecord(file25, "BlobStore-MemCache");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNull(dataRecord14);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file50);
        org.junit.Assert.assertNotNull(file54);
        org.junit.Assert.assertNotNull(file84);
        org.junit.Assert.assertNotNull(file88);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker15 = null;
        dataStoreBlobStore2.addTracker(blobTracker15);
        try {
            java.io.InputStream inputStream18 = dataStoreBlobStore2.getInputStream("ReferencedBlob{blob=null, id='BlobStoreStats'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        java.util.Properties properties7 = null;
        cachingFileDataStore0.setProperties(properties7);
        cachingFileDataStore0.setStagingRetryInterval((int) 'a');
        try {
            cachingFileDataStore0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats1 = cloudBlobStore0.getCacheStats();
        try {
            java.util.Iterator<java.lang.String> iterator_str3 = cloudBlobStore0.resolveChunks("ReferencedBlob{blob=null, id='BlobStoreStats'}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cacheStats1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        dataStoreBlobStore4.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str8 = dataStoreBlobStore4.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor9 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard12 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector13 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor9, 0L, "fsBackendPath", whiteboard12);
        dataStoreBlobStore4.setBlockSize((int) (byte) -1);
        java.io.InputStream inputStream16 = null;
        dataStoreBlobStore4.addMetadataRecord(inputStream16, "markedTimestamp");
        java.io.File file20 = null;
        java.io.File file21 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file21);
        java.io.File file24 = null;
        java.io.File file25 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file24);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file25);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file21, file25, false, false);
        dataStoreBlobStore4.addMetadataRecord(file25, "ReferencedBlob{blob=null, id='BlobStoreStats'}");
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer33 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file25, (int) (byte) 0);
        try {
            java.io.File file34 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("", file25);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore7 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long8 = cloudBlobStore7.getBlockSizeMin();
        int i9 = cloudBlobStore7.getBlockSize();
        int i10 = cloudBlobStore7.sweep();
        java.io.InputStream inputStream12 = cloudBlobStore7.getInputStream("*ERROR*-cachePath");
        try {
            java.lang.String str13 = cloudBlobStore0.writeBlob(inputStream12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(long8 == 4096L);
        org.junit.Assert.assertTrue(i9 == 2097152);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(inputStream12);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        long long7 = dataStoreBlobStore2.getBlockSizeMin();
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore8 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long9 = cloudBlobStore8.getBlockSizeMin();
        int i10 = cloudBlobStore8.getBlockSize();
        int i11 = cloudBlobStore8.sweep();
        java.io.InputStream inputStream13 = cloudBlobStore8.getInputStream("*ERROR*-cachePath");
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions14 = null;
        try {
            java.lang.String str15 = dataStoreBlobStore2.writeBlob(inputStream13, blobOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertTrue(long7 == 0L);
        org.junit.Assert.assertTrue(long9 == 4096L);
        org.junit.Assert.assertTrue(i10 == 2097152);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(inputStream13);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setEndTime((long) (short) -1);
        garbageCollectionRepoStats0.setRepositoryId("ConsolidatedDataStoreCacheStats");
        garbageCollectionRepoStats0.setEndTime(4096L);
        garbageCollectionRepoStats0.setLocal(false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats10 = dataStoreBlobStore3.getCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore11 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long12 = cloudBlobStore11.getBlockSizeMin();
        int i13 = cloudBlobStore11.getBlockSize();
        int i14 = cloudBlobStore11.sweep();
        java.io.InputStream inputStream16 = cloudBlobStore11.getInputStream("*ERROR*-cachePath");
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions17 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord18 = dataStoreBlobStore3.addRecord(inputStream16, blobOptions17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cacheStats10);
        org.junit.Assert.assertTrue(long12 == 4096L);
        org.junit.Assert.assertTrue(i13 == 2097152);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(inputStream16);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        try {
            cloudBlobStore0.setBlockSizeMin(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        try {
            long long11 = markSweepGarbageCollector10.checkConsistency();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        boolean b1 = org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord.isInstance("ConsolidatedDataStoreCacheStats");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = consolidatedDataStoreCacheStats0.nodeStore;
        javax.management.openmbean.TabularData tabularData2 = consolidatedDataStoreCacheStats0.getCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore3 = null;
        consolidatedDataStoreCacheStats0.nodeStore = nodeStore3;
        boolean b6 = consolidatedDataStoreCacheStats0.isFileSynced("markedTimestamp-/tmp");
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertNotNull(tabularData2);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState6 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("cachePath");
        java.io.File file7 = garbageCollectorFileState6.getMarkedRefs();
        try {
            oakFileDataStore0.addMetadataRecord(file7, "blob");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(file7);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        try {
            markSweepGarbageCollector9.collectGarbage(false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        garbageCollectionRepoStats0.setNumLines((int) '4');
        long long5 = garbageCollectionRepoStats0.getEndTime();
        int i6 = garbageCollectionRepoStats0.getNumLines();
        org.junit.Assert.assertTrue(long5 == 0L);
        org.junit.Assert.assertTrue(i6 == 52);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        int i3 = oakFileDataStore0.getMinRecordLength();
        org.junit.Assert.assertTrue(i3 == 4096);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore3.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore8 = dataStoreBlobStore3.getDataStore();
        boolean b10 = dataStoreBlobStore3.deleteMetadataRecord("ConsolidatedDataStoreCacheStats");
        java.util.concurrent.Executor executor11 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard14 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector15 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor11, (long) (byte) 1, "BlobStoreStats", whiteboard14);
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer16 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore3);
        org.junit.Assert.assertNull(dataStore8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        dataStoreBlobStore2.deleteAllMetadataRecords("BlobStore-MemCache");
        try {
            int i17 = dataStoreBlobStore2.getMinRecordLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array0 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord1 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, dataRecord_array0);
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord3 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.getEarliestRecord((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(dataRecord_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType0 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER;
        java.lang.String str1 = sharedStoreRecordType0.getType();
        java.lang.String str3 = sharedStoreRecordType0.getNameFromId(",");
        java.lang.String str5 = sharedStoreRecordType0.getNameFromId("/tmp");
        try {
            java.lang.String str7 = sharedStoreRecordType0.getIdFromName("Migration started");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType0 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER + "'", sharedStoreRecordType0.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "markedTimestamp" + "'", str1.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "markedTimestamp-," + "'", str3.equals("markedTimestamp-,"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "markedTimestamp-/tmp" + "'", str5.equals("markedTimestamp-/tmp"));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlobCacheSize();
        cloudBlobStore0.setReferenceKeyEncoded("ConsolidatedDataStoreCacheStats");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long5 = cloudBlobStore4.getBlockSizeMin();
        int i6 = cloudBlobStore4.getBlockSize();
        int i7 = cloudBlobStore4.sweep();
        java.io.InputStream inputStream9 = cloudBlobStore4.getInputStream("*ERROR*-cachePath");
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions10 = null;
        try {
            java.lang.String str11 = cloudBlobStore0.writeBlob(inputStream9, blobOptions10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertTrue(long1 == 16777216L);
        org.junit.Assert.assertTrue(long5 == 4096L);
        org.junit.Assert.assertTrue(i6 == 2097152);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(inputStream9);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker5 = dataStoreBlobStore2.getTracker();
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker6 = null;
        dataStoreBlobStore2.addTracker(blobTracker6);
        int i8 = dataStoreBlobStore2.sweep();
        try {
            java.lang.String str10 = dataStoreBlobStore2.writeBlob(",");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
        org.junit.Assert.assertNull(blobTracker5);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.jackrabbit.oak.api.Blob blob0 = null;
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob2 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob0, "BlobStoreStats");
        org.apache.jackrabbit.oak.api.Blob blob3 = referencedBlob2.getBlob();
        java.lang.String str4 = referencedBlob2.toString();
        org.apache.jackrabbit.oak.api.Blob blob5 = referencedBlob2.getBlob();
        boolean b7 = referencedBlob2.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNull(blob3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ReferencedBlob{blob=null, id='BlobStoreStats'}" + "'", str4.equals("ReferencedBlob{blob=null, id='BlobStoreStats'}"));
        org.junit.Assert.assertNull(blob5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord12 = dataStoreBlobStore3.getAllMetadataRecords("markedTimestamp");
        try {
            org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3, true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord12);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.apache.jackrabbit.core.data.DataStore dataStore13 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore13, false);
        dataStoreBlobStore15.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str19 = dataStoreBlobStore15.resolveChunks("BlobStoreStats");
        long long20 = dataStoreBlobStore15.getBlockSizeMin();
        java.util.Iterator<java.lang.String> iterator_str22 = dataStoreBlobStore15.resolveChunks("fsBackendPath");
        blobIdTracker12.add(iterator_str22);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker.ActiveDeletionTracker activeDeletionTracker24 = blobIdTracker12.getDeleteTracker();
        java.io.File file26 = null;
        java.io.File file27 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file26);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file27);
        java.io.File file30 = null;
        java.io.File file31 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file30);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file27, file31, false, false);
        java.io.File file36 = null;
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file31, file36);
        try {
            activeDeletionTracker24.reconcile(file31);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str19);
        org.junit.Assert.assertTrue(long20 == 0L);
        org.junit.Assert.assertNotNull(iterator_str22);
        org.junit.Assert.assertNotNull(activeDeletionTracker24);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertNotNull(file31);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        boolean b14 = oakFileDataStore0.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord16 = oakFileDataStore0.getAllMetadataRecords("Blob garbage collection");
        oakFileDataStore0.init("");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier19 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord20 = oakFileDataStore0.getRecordForId(dataIdentifier19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_dataRecord16);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Class<?> cls1 = blobMigration0.getMBeanInterface();
        java.lang.Class<?> cls2 = blobMigration0.getImplementationClass();
        try {
            java.lang.Object obj4 = blobMigration0.getAttribute("Blob migration");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException");
        } catch (javax.management.AttributeNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(cls1);
        org.junit.Assert.assertNotNull(cls2);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setUploadThreads((int) '4');
        cachingFileDataStore0.setCacheSize(10L);
        cachingFileDataStore0.setStagingSplitPercentage(100);
        org.junit.Assert.assertTrue(i3 == 16384);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        java.util.Properties properties1 = null;
        cachingFileDataStore0.setProperties(properties1);
        cachingFileDataStore0.setPath("cachePath");
        cachingFileDataStore0.setStagingSplitPercentage((int) (short) -1);
        try {
            java.util.List<org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheStatsMBean> list_dataStoreCacheStatsMBean7 = cachingFileDataStore0.getStats();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector11 = null;
        dataStoreBlobStore10.setBlobStatsCollector(blobStatsCollector11);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord14 = dataStoreBlobStore10.getAllMetadataRecords("BlobStoreStats");
        boolean b16 = dataStoreBlobStore10.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        org.junit.Assert.assertNull(list_dataRecord14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        java.lang.String str3 = cloudBlobStore0.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer4 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore0);
        java.io.InputStream inputStream6 = cloudBlobStore0.getInputStream("Blob consistency check");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore7 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long8 = cloudBlobStore7.getBlockSizeMin();
        int i9 = cloudBlobStore7.getBlockSize();
        java.lang.String str10 = cloudBlobStore7.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer11 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore7);
        java.io.InputStream inputStream13 = cloudBlobStore7.getInputStream("Blob consistency check");
        try {
            java.lang.String str14 = cloudBlobStore0.writeBlob(inputStream13);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 2097152);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(inputStream6);
        org.junit.Assert.assertTrue(long8 == 4096L);
        org.junit.Assert.assertTrue(i9 == 2097152);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(inputStream13);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker5 = dataStoreBlobStore2.getTracker();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier6 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord7 = dataStoreBlobStore2.getRecordForId(dataIdentifier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
        org.junit.Assert.assertNull(blobTracker5);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord13 = dataStoreBlobStore4.getAllMetadataRecords("markedTimestamp");
        java.util.concurrent.Executor executor14 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard19 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector20 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor14, "hi!", (int) ' ', (long) ' ', "ConsolidatedDataStoreCacheStats", whiteboard19);
        java.util.List<org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats> list_garbageCollectionRepoStats21 = markSweepGarbageCollector20.getStats();
        try {
            long long22 = markSweepGarbageCollector20.checkConsistency();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
        org.junit.Assert.assertNotNull(list_garbageCollectionRepoStats21);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.io.File file1 = null;
        java.io.File file2 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file1);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file2);
        java.io.File file5 = null;
        java.io.File file6 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file5);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file2, file6, false, false);
        java.io.File file12 = null;
        java.io.File file13 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file12);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file2, file13, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer18 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file13, (int) 'a');
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever19 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore20 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore22 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore20, false);
        dataStoreBlobStore22.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str26 = dataStoreBlobStore22.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor27 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard30 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector31 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever19, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore22, executor27, 0L, "fsBackendPath", whiteboard30);
        dataStoreBlobStore22.setBlockSize((int) (byte) -1);
        java.io.InputStream inputStream34 = null;
        dataStoreBlobStore22.addMetadataRecord(inputStream34, "markedTimestamp");
        java.io.File file38 = null;
        java.io.File file39 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file38);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file39);
        java.io.File file42 = null;
        java.io.File file43 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file42);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file43);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file39, file43, false, false);
        dataStoreBlobStore22.addMetadataRecord(file43, "ReferencedBlob{blob=null, id='BlobStoreStats'}");
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer51 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file43, (int) (byte) 0);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever52 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore53 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore55 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore53, false);
        java.util.concurrent.Executor executor56 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector61 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever52, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore55, executor56, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore62 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore55);
        java.io.File file64 = null;
        java.io.File file65 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file64);
        dataStoreBlobStore62.addMetadataRecord(file65, "BlobStore-MemCache");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file43, file65, true);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file13, file65, true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNotNull(iterator_str26);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertNotNull(file65);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = consolidatedDataStoreCacheStats0.nodeStore;
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore2 = null;
        consolidatedDataStoreCacheStats0.cachingDataStore = abstractSharedCachingDataStore2;
        boolean b5 = consolidatedDataStoreCacheStats0.isFileSynced("BlobStoreStats");
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore6 = null;
        consolidatedDataStoreCacheStats0.nodeStore = nodeStore6;
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore8 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore8.setStagingSplitPercentage(100);
        int i11 = cachingFileDataStore8.getMinRecordLength();
        cachingFileDataStore8.setMinRecordLength(0);
        consolidatedDataStoreCacheStats0.cachingDataStore = cachingFileDataStore8;
        cachingFileDataStore8.setUploadThreads(1);
        try {
            cachingFileDataStore8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i11 == 16384);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        java.util.Properties properties7 = null;
        cachingFileDataStore0.setProperties(properties7);
        try {
            cachingFileDataStore0.clearInUse();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier10 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord11 = cachingFileDataStore0.getRecordForId(dataIdentifier10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.apache.jackrabbit.core.data.DataStore dataStore13 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore13, false);
        dataStoreBlobStore15.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str19 = dataStoreBlobStore15.resolveChunks("BlobStoreStats");
        long long20 = dataStoreBlobStore15.getBlockSizeMin();
        java.util.Iterator<java.lang.String> iterator_str22 = dataStoreBlobStore15.resolveChunks("fsBackendPath");
        blobIdTracker12.add(iterator_str22);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker.ActiveDeletionTracker activeDeletionTracker24 = blobIdTracker12.getDeleteTracker();
        java.io.File file27 = null;
        java.io.File file28 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file27);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file28);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file28, file32, false, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer37 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file28);
        java.io.File file38 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("cachePath", file28);
        try {
            activeDeletionTracker24.track(file28);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str19);
        org.junit.Assert.assertTrue(long20 == 0L);
        org.junit.Assert.assertNotNull(iterator_str22);
        org.junit.Assert.assertNotNull(activeDeletionTracker24);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(file38);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        java.util.Properties properties1 = null;
        cachingFileDataStore0.setProperties(properties1);
        try {
            java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = cachingFileDataStore0.getAllMetadataRecords("fsBackendPath");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        int i3 = cloudBlobStore0.sweep();
        cloudBlobStore0.startMark();
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector5 = org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector.NOOP;
        cloudBlobStore0.setStatsCollector(blobStatsCollector5);
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 2097152);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(blobStatsCollector5);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.updateModifiedDateOnAccess((long) (byte) -1);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier5 = null;
        try {
            oakFileDataStore0.deleteRecord(dataIdentifier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore7 = dataStoreBlobStore2.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore8 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore8, false);
        dataStoreBlobStore10.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore10.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str19, str_array18);
        long long22 = dataStoreBlobStore10.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) (byte) 0);
        long long24 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector25 = null;
        dataStoreBlobStore2.setBlobStatsCollector(blobStatsCollector25);
        long long27 = dataStoreBlobStore2.getBlockSizeMin();
        java.io.InputStream inputStream28 = null;
        dataStoreBlobStore2.addMetadataRecord(inputStream28, "markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob32 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2, "Migration started");
        java.lang.String str33 = blobStoreBlob32.getBlobId();
        try {
            java.io.InputStream inputStream34 = blobStoreBlob32.getNewStream();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataStore7);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(long22 == 0L);
        org.junit.Assert.assertTrue(long24 == 0L);
        org.junit.Assert.assertTrue(long27 == 0L);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Migration started" + "'", str33.equals("Migration started"));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.io.File file2 = null;
        java.io.File file3 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file2);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file3);
        java.io.File file6 = null;
        java.io.File file7 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file7);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file3, file7, false, false);
        java.io.File file13 = null;
        java.io.File file14 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file3, file14, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        java.io.File file20 = null;
        java.io.File file21 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file21);
        java.io.File file24 = null;
        java.io.File file25 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file24);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file25);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file21, file25, false, false);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file21, file32, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file14, file32, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream38 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache40 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(4096L, file14, cacheloader_str_inputStream38, executorService39);
        try {
            java.io.File file42 = fileCache40.getIfPresent((java.lang.Object) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(fileCache40);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.jackrabbit.oak.api.Blob blob0 = null;
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob2 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob0, "BlobStoreStats");
        org.apache.jackrabbit.oak.api.Blob blob3 = referencedBlob2.getBlob();
        java.lang.String str4 = referencedBlob2.toString();
        org.apache.jackrabbit.oak.api.Blob blob5 = null;
        referencedBlob2.setBlob(blob5);
        java.lang.String str7 = referencedBlob2.toString();
        org.junit.Assert.assertNull(blob3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ReferencedBlob{blob=null, id='BlobStoreStats'}" + "'", str4.equals("ReferencedBlob{blob=null, id='BlobStoreStats'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ReferencedBlob{blob=null, id='BlobStoreStats'}" + "'", str7.equals("ReferencedBlob{blob=null, id='BlobStoreStats'}"));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        dataStoreBlobStore3.setMaxCachedBinarySize((int) (short) 0);
        dataStoreBlobStore3.startMark();
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob15 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore3, ",");
        org.apache.jackrabbit.oak.spi.blob.BlobStore blobStore16 = blobStoreBlob15.getBlobStore();
        try {
            java.lang.String str17 = blobStoreBlob15.getReference();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(blobStore16);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        blobIdTracker12.close();
        blobIdTracker12.close();
        blobIdTracker12.close();
        java.io.File file17 = null;
        java.io.File file18 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file17);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file18);
        java.io.File file21 = null;
        java.io.File file22 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file21);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file22);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file18, file22, false, false);
        java.io.File file28 = null;
        java.io.File file29 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file28);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file29);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file18, file29, false);
        try {
            blobIdTracker12.remove(file18);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertNotNull(file29);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        javax.management.MBeanServer mBeanServer5 = null;
        javax.management.ObjectName objectName6 = null;
        javax.management.ObjectName objectName7 = blobMigration0.preRegister(mBeanServer5, objectName6);
        try {
            java.lang.Object obj9 = blobMigration0.getAttribute("*ERROR*-cachePath");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException");
        } catch (javax.management.AttributeNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNull(objectName7);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        cloudBlobStore0.setSecretKey("markedTimestamp");
        cloudBlobStore0.clearInUse();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        java.lang.String str5 = cloudBlobStore0.getBlobId("Blob garbage collection");
        cloudBlobStore0.setCloudContainer("encodeLengthInId");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore8 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long9 = cloudBlobStore8.getBlockSizeMin();
        int i10 = cloudBlobStore8.getBlockSize();
        java.lang.String str11 = cloudBlobStore8.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer12 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore8);
        java.io.InputStream inputStream14 = cloudBlobStore8.getInputStream("Blob consistency check");
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions15 = null;
        try {
            java.lang.String str16 = cloudBlobStore0.writeBlob(inputStream14, blobOptions15);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(long9 == 4096L);
        org.junit.Assert.assertTrue(i10 == 2097152);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(inputStream14);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array8 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList9 = blobMigration0.getAttributes(str_array8);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration10 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj11 = blobMigration10.getImplementation();
        java.lang.Class<?> cls12 = blobMigration10.getImplementationClass();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration13 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo14 = blobMigration13.getMBeanInfo();
        blobMigration13.preDeregister();
        blobMigration13.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array21 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList22 = blobMigration13.getAttributes(str_array21);
        javax.management.AttributeList attributeList23 = blobMigration10.setAttributes(attributeList22);
        javax.management.AttributeList attributeList24 = blobMigration0.setAttributes(attributeList22);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration25 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo26 = blobMigration25.getMBeanInfo();
        blobMigration25.preDeregister();
        blobMigration25.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array33 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList34 = blobMigration25.getAttributes(str_array33);
        javax.management.AttributeList attributeList35 = blobMigration0.setAttributes(attributeList34);
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(cls12);
        org.junit.Assert.assertNotNull(mBeanInfo14);
        org.junit.Assert.assertNotNull(str_array21);
        org.junit.Assert.assertNotNull(attributeList22);
        org.junit.Assert.assertNotNull(attributeList23);
        org.junit.Assert.assertNotNull(attributeList24);
        org.junit.Assert.assertNotNull(mBeanInfo26);
        org.junit.Assert.assertNotNull(str_array33);
        org.junit.Assert.assertNotNull(attributeList34);
        org.junit.Assert.assertNotNull(attributeList35);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.io.File file2 = null;
        java.io.File file3 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file2);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file3);
        java.io.File file6 = null;
        java.io.File file7 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file7);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file3, file7, false, false);
        java.io.File file13 = null;
        java.io.File file14 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file3, file14, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        java.io.File file20 = null;
        java.io.File file21 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file21);
        java.io.File file24 = null;
        java.io.File file25 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file24);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file25);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file21, file25, false, false);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file21, file32, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file14, file32, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream38 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache40 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(4096L, file14, cacheloader_str_inputStream38, executorService39);
        try {
            long long41 = fileCache40.size();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(fileCache40);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.updateModifiedDateOnAccess((long) (short) -1);
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore11 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long12 = cloudBlobStore11.getBlockSizeMin();
        int i13 = cloudBlobStore11.getBlockSize();
        java.lang.String str14 = cloudBlobStore11.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer15 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore11);
        java.io.InputStream inputStream17 = cloudBlobStore11.getInputStream("Blob consistency check");
        try {
            oakFileDataStore0.addMetadataRecord(inputStream17, "*ERROR*-cachePath:D7HRFQQIO3566IETTFV5K16NAUPUR5E0");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(long12 == 4096L);
        org.junit.Assert.assertTrue(i13 == 2097152);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(inputStream17);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.io.File file2 = null;
        java.io.File file3 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file2);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file3);
        java.io.File file6 = null;
        java.io.File file7 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file7);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file3, file7, false, false);
        java.io.File file13 = null;
        java.io.File file14 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file3, file14, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        java.io.File file20 = null;
        java.io.File file21 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file21);
        java.io.File file24 = null;
        java.io.File file25 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file24);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file25);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file21, file25, false, false);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file21, file32, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file14, file32, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream38 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache40 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(4096L, file14, cacheloader_str_inputStream38, executorService39);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever41 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever42 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever43 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore44 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore46 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore44, false);
        java.util.concurrent.Executor executor47 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector52 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever43, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore46, executor47, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore53 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore46);
        dataStoreBlobStore46.setBlockSize(16);
        java.util.concurrent.Executor executor56 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard61 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector62 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever42, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore46, executor56, "markedTimestamp-,", (int) (short) 100, (long) (byte) 100, "Blob garbage collection", whiteboard61);
        java.util.concurrent.Executor executor63 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector68 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever41, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore46, executor63, "", 16, (long) (short) 1, "Blob migration");
        try {
            java.io.File file69 = fileCache40.getIfPresent((java.lang.Object) markSweepGarbageCollector68);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(fileCache40);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        java.io.File file12 = null;
        java.io.File file13 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file12);
        dataStoreBlobStore10.addMetadataRecord(file13, "BlobStore-MemCache");
        java.io.File file17 = null;
        java.io.File file18 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file17);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file18);
        java.io.File file21 = null;
        java.io.File file22 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file21);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file22);
        java.io.File file25 = null;
        java.io.File file26 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file25);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file26);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file22, file26, false, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file18, file26);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever32 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever33 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore34 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore36 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore34, false);
        java.util.concurrent.Executor executor37 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard42 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector43 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever33, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore36, executor37, ",", (int) (byte) 10, (long) 10, "", whiteboard42);
        java.util.concurrent.Executor executor44 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard47 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector48 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever32, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore36, executor44, 4096L, "Blob migration", whiteboard47);
        java.io.File file50 = null;
        java.io.File file51 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file50);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file51);
        java.io.File file54 = null;
        java.io.File file55 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file54);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file55);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file51, file55, false, false);
        dataStoreBlobStore36.addMetadataRecord(file55, "fsBackendPath");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file26, file55, true, false);
        java.io.File file66 = null;
        java.io.File file67 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file66);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file67);
        java.io.File file70 = null;
        java.io.File file71 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file70);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file71);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file67, file71, false, false);
        java.io.File file77 = null;
        java.io.File file78 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file77);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file78);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file67, file78, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer82 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file78);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file26, file78);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file13, file26);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file26);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertNotNull(file51);
        org.junit.Assert.assertNotNull(file55);
        org.junit.Assert.assertNotNull(file67);
        org.junit.Assert.assertNotNull(file71);
        org.junit.Assert.assertNotNull(file78);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils dataStoreCacheUtils0 = new org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.apache.jackrabbit.core.data.DataStore dataStore13 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore13, false);
        dataStoreBlobStore15.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str19 = dataStoreBlobStore15.resolveChunks("BlobStoreStats");
        long long20 = dataStoreBlobStore15.getBlockSizeMin();
        java.util.Iterator<java.lang.String> iterator_str22 = dataStoreBlobStore15.resolveChunks("fsBackendPath");
        blobIdTracker12.add(iterator_str22);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker.ActiveDeletionTracker activeDeletionTracker24 = blobIdTracker12.getDeleteTracker();
        try {
            java.io.File file26 = activeDeletionTracker24.retrieve("cacheSize");
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str19);
        org.junit.Assert.assertTrue(long20 == 0L);
        org.junit.Assert.assertNotNull(iterator_str22);
        org.junit.Assert.assertNotNull(activeDeletionTracker24);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        java.lang.String str9 = oakFileDataStore0.getPath();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier10 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord11 = oakFileDataStore0.getRecord(dataIdentifier10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever5 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore6 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore8 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore6, false);
        java.util.concurrent.Executor executor9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector14 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever5, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore8, executor9, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore8);
        dataStoreBlobStore8.setMaxCachedBinarySize((int) (short) 0);
        dataStoreBlobStore8.startMark();
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore20 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore8, true);
        try {
            org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker21 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E", "repository-*ERROR*-cachePath", scheduledExecutorService2, (long) (short) -1, (long) 10, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker5 = dataStoreBlobStore2.getTracker();
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker6 = null;
        dataStoreBlobStore2.addTracker(blobTracker6);
        int i8 = dataStoreBlobStore2.sweep();
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier9 = dataStoreBlobStore2.getAllIdentifiers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
        org.junit.Assert.assertNull(blobTracker5);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.io.File file2 = null;
        java.io.File file3 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file2);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file3);
        java.io.File file6 = null;
        java.io.File file7 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file7);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file3, file7, false, false);
        java.io.File file13 = null;
        java.io.File file14 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file3, file14, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        java.io.File file20 = null;
        java.io.File file21 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file21);
        java.io.File file24 = null;
        java.io.File file25 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file24);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file25);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file21, file25, false, false);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file21, file32, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file14, file32, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream38 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache40 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(4096L, file14, cacheloader_str_inputStream38, executorService39);
        org.apache.jackrabbit.core.data.DataStore dataStore41 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore43 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore41, false);
        dataStoreBlobStore43.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore43.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array51 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str52 = new java.util.ArrayList<java.lang.String>();
        boolean b53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str52, str_array51);
        long long55 = dataStoreBlobStore43.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str52, (long) (byte) 0);
        try {
            com.google.common.collect.ImmutableMap<java.lang.String, java.io.File> immutablemap_str_file56 = fileCache40.getAllPresent((java.lang.Iterable<java.lang.String>) arraylist_str52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(fileCache40);
        org.junit.Assert.assertNotNull(str_array51);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(long55 == 0L);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        java.util.Properties properties3 = null;
        fSBackend0.setProperties(properties3);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier5 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord6 = fSBackend0.getRecord(dataIdentifier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState1 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("cachePath");
        java.io.File file2 = garbageCollectorFileState1.getMarkedRefs();
        java.io.File file3 = garbageCollectorFileState1.getGcCandidates();
        java.io.File file4 = garbageCollectorFileState1.getGarbage();
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file4);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.io.File file2 = null;
        java.io.File file3 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file2);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file3);
        java.io.File file6 = null;
        java.io.File file7 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file7);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file3, file7, false, false);
        java.io.File file13 = null;
        java.io.File file14 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file3, file14, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        java.io.File file20 = null;
        java.io.File file21 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file21);
        java.io.File file24 = null;
        java.io.File file25 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file24);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file25);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file21, file25, false, false);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file21, file32, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file14, file32, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream38 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache40 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(4096L, file14, cacheloader_str_inputStream38, executorService39);
        fileCache40.close();
        try {
            com.google.common.cache.CacheStats cacheStats42 = fileCache40.stats();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(fileCache40);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        java.io.File file12 = null;
        java.io.File file13 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file12);
        dataStoreBlobStore10.addMetadataRecord(file13, "BlobStore-MemCache");
        try {
            java.util.Iterator<java.lang.String> iterator_str17 = dataStoreBlobStore10.getAllChunkIds((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(file13);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        long long3 = cloudBlobStore0.getBlockSizeMin();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(long3 == 4096L);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore7 = dataStoreBlobStore2.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore8 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore8, false);
        dataStoreBlobStore10.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore10.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str19 = new java.util.ArrayList<java.lang.String>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str19, str_array18);
        long long22 = dataStoreBlobStore10.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) (byte) 0);
        long long24 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str19, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector25 = null;
        dataStoreBlobStore2.setBlobStatsCollector(blobStatsCollector25);
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore27 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long28 = cloudBlobStore27.getBlockSizeMin();
        int i29 = cloudBlobStore27.getBlockSize();
        java.lang.String str30 = cloudBlobStore27.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer31 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore27);
        java.io.InputStream inputStream33 = cloudBlobStore27.getInputStream("Blob consistency check");
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions34 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord35 = dataStoreBlobStore2.addRecord(inputStream33, blobOptions34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataStore7);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(long22 == 0L);
        org.junit.Assert.assertTrue(long24 == 0L);
        org.junit.Assert.assertTrue(long28 == 4096L);
        org.junit.Assert.assertTrue(i29 == 2097152);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(inputStream33);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        boolean b14 = oakFileDataStore0.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord16 = oakFileDataStore0.getAllMetadataRecords("Blob garbage collection");
        oakFileDataStore0.init("");
        oakFileDataStore0.deleteAllMetadataRecords("Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_dataRecord16);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        dataStoreBlobStore5.clearCache();
        java.util.Iterator<java.lang.String> iterator_str15 = dataStoreBlobStore5.resolveChunks("");
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str15);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord12 = dataStoreBlobStore3.getAllMetadataRecords("markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer13 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore3);
        org.apache.jackrabbit.oak.api.Blob blob15 = blobIdSerializer13.deserialize("cachePath");
        org.apache.jackrabbit.oak.api.Blob blob17 = blobIdSerializer13.deserialize("");
        org.junit.Assert.assertNull(list_dataRecord12);
        org.junit.Assert.assertNotNull(blob15);
        org.junit.Assert.assertNotNull(blob17);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.clearInUse();
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str4 = cloudBlobStore2.getBlobId("markedTimestamp");
        java.lang.String str5 = cloudBlobStore2.getSecretKey();
        cloudBlobStore2.setSecretKey(",");
        cloudBlobStore2.clearCache();
        java.util.Iterator<java.lang.String> iterator_str10 = cloudBlobStore2.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend11 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array12 = fSBackend11.getOrCreateReferenceKey();
        byte[] byte_array13 = fSBackend11.getOrCreateReferenceKey();
        cloudBlobStore2.setReferenceKey(byte_array13);
        oakFileDataStore0.setReferenceKey(byte_array13);
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.init(",");
        int i21 = oakFileDataStore0.deleteAllOlderThan((long) 52);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(iterator_str10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = consolidatedDataStoreCacheStats0.nodeStore;
        boolean b3 = consolidatedDataStoreCacheStats0.isFileSynced("BlobStore-MemCache");
        javax.management.openmbean.TabularData tabularData4 = consolidatedDataStoreCacheStats0.getCacheStats();
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(tabularData4);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array3 = fSBackend0.getOrCreateReferenceKey();
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore4.clearCache();
        java.lang.String str6 = cloudBlobStore4.getAccessKey();
        java.lang.String str7 = cloudBlobStore4.getAccessKey();
        cloudBlobStore4.setCloudProvider("*ERROR*-cachePath");
        cloudBlobStore4.setReferenceKeyPlainText("markedTimestamp-/tmp");
        java.io.InputStream inputStream13 = cloudBlobStore4.getInputStream("cachePath");
        try {
            fSBackend0.addMetadataRecord(inputStream13, "ConsolidatedDataStoreCacheStats");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(inputStream13);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.concurrent.Executor executor12 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard15 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector16 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor12, 4096L, "Blob migration", whiteboard15);
        try {
            long long17 = markSweepGarbageCollector16.checkConsistency();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        try {
            cloudBlobStore0.setReferenceKeyEncoded("Migration started");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        java.util.List<org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats> list_garbageCollectionRepoStats13 = markSweepGarbageCollector12.getStats();
        org.junit.Assert.assertNotNull(iterator_str7);
        org.junit.Assert.assertNotNull(list_garbageCollectionRepoStats13);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingPurgeInterval(16);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier4 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord5 = cachingFileDataStore0.getRecord(dataIdentifier4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type1.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord13 = dataStoreBlobStore4.getAllMetadataRecords("markedTimestamp");
        java.util.concurrent.Executor executor14 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard17 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector18 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor14, (long) 'a', "", whiteboard17);
        int i19 = dataStoreBlobStore4.sweep();
        org.apache.jackrabbit.core.data.DataStore dataStore20 = dataStoreBlobStore4.getDataStore();
        long long21 = dataStoreBlobStore4.getBlockSizeMin();
        try {
            java.lang.String str22 = dataStoreBlobStore4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(dataStore20);
        org.junit.Assert.assertTrue(long21 == 0L);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats1 = cloudBlobStore0.getCacheStats();
        cloudBlobStore0.setCloudProvider("Blob garbage collection");
        byte[] byte_array7 = new byte[] { (byte) 1 };
        int i10 = cloudBlobStore0.readBlob("", (long) 52, byte_array7, (int) (byte) -1, 1024);
        org.junit.Assert.assertNotNull(cacheStats1);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        java.util.Properties properties7 = null;
        cachingFileDataStore0.setProperties(properties7);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier9 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord10 = cachingFileDataStore0.getRecordForId(dataIdentifier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        try {
            java.util.Iterator<java.lang.String> iterator_str4 = cloudBlobStore0.resolveChunks("Migration started");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 2097152);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        oakFileDataStore0.setReferenceKeyPlainText("Blob garbage collection");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore7 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore7.clearCache();
        java.lang.String str9 = cloudBlobStore7.getAccessKey();
        java.lang.String str10 = cloudBlobStore7.getAccessKey();
        java.lang.String str12 = cloudBlobStore7.getBlobId("Blob garbage collection");
        cloudBlobStore7.setCloudContainer("encodeLengthInId");
        java.io.InputStream inputStream16 = cloudBlobStore7.getInputStream("cachePath");
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord17 = oakFileDataStore0.addRecord(inputStream16);
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(inputStream16);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        oakFileDataStore0.setReferenceKeyPlainText("Blob garbage collection");
        java.io.File file8 = null;
        java.io.File file9 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file8);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file9);
        java.io.File file12 = null;
        java.io.File file13 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file12);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file9, file13, false, false);
        java.io.File file19 = null;
        java.io.File file20 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file19);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file9, file20, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer24 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file20);
        try {
            oakFileDataStore0.addMetadataRecord(file20, "");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNotNull(file20);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        try {
            int i11 = dataStoreBlobStore3.getMinRecordLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj1 = blobMigration0.getImplementation();
        javax.management.Attribute attribute2 = null;
        try {
            blobMigration0.setAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setMinRecordLength(0);
        try {
            int i7 = cachingFileDataStore0.deleteAllOlderThan((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        java.lang.String str5 = cloudBlobStore0.getBlobId("Blob garbage collection");
        cloudBlobStore0.clearCache();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.io.File file2 = null;
        java.io.File file3 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file2);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file3);
        java.io.File file6 = null;
        java.io.File file7 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file7);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file3, file7, false, false);
        java.io.File file13 = null;
        java.io.File file14 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file3, file14, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        java.io.File file20 = null;
        java.io.File file21 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file21);
        java.io.File file24 = null;
        java.io.File file25 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file24);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file25);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file21, file25, false, false);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file21, file32, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file14, file32, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream38 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache40 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(4096L, file14, cacheloader_str_inputStream38, executorService39);
        fileCache40.close();
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array42 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord43 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord43, dataRecord_array42);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array45 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord46 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord46, dataRecord_array45);
        java.util.Set<java.lang.String> set_str48 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord43, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord46);
        com.google.common.collect.ImmutableMap<java.lang.String, java.io.File> immutablemap_str_file49 = fileCache40.getAllPresent((java.lang.Iterable<java.lang.String>) set_str48);
        try {
            com.google.common.cache.CacheStats cacheStats50 = fileCache40.stats();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(fileCache40);
        org.junit.Assert.assertNotNull(dataRecord_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(dataRecord_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set_str48);
        org.junit.Assert.assertNotNull(immutablemap_str_file49);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType0 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER;
        java.lang.String str1 = sharedStoreRecordType0.getType();
        java.lang.String str2 = sharedStoreRecordType0.getType();
        java.lang.String str3 = sharedStoreRecordType0.getType();
        java.lang.String str5 = sharedStoreRecordType0.getNameFromId("Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType0 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER + "'", sharedStoreRecordType0.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "markedTimestamp" + "'", str1.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "markedTimestamp" + "'", str2.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "markedTimestamp" + "'", str3.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E" + "'", str5.equals("markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E"));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 2097152);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        java.lang.String str3 = cloudBlobStore0.getCloudProvider();
        long long4 = cloudBlobStore0.getBlockSizeMin();
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 2097152);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(long4 == 4096L);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        java.util.Properties properties1 = null;
        cachingFileDataStore0.setProperties(properties1);
        cachingFileDataStore0.setPath("cachePath");
        try {
            cachingFileDataStore0.deleteAllMetadataRecords("*ERROR*-cachePath:0G2AAFROSC4I6B1US3JSJ8ORELIMI5RQ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        try {
            dataStoreBlobStore5.clearInUse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        try {
            java.lang.String str12 = dataStoreBlobStore3.getBlobId("Migration started");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        java.lang.String str5 = cloudBlobStore0.getBlobId("Blob garbage collection");
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector6 = org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector.NOOP;
        cloudBlobStore0.setStatsCollector(blobStatsCollector6);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(blobStatsCollector6);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState1 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("cachePath");
        java.io.File file2 = garbageCollectorFileState1.getMarkedRefs();
        garbageCollectorFileState1.close();
        java.io.File file4 = garbageCollectorFileState1.getMarkedRefs();
        garbageCollectorFileState1.close();
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file4);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        java.util.Properties properties7 = null;
        cachingFileDataStore0.setProperties(properties7);
        try {
            cachingFileDataStore0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlobCacheSize();
        long long2 = cloudBlobStore0.getBlobCacheSize();
        org.junit.Assert.assertTrue(long1 == 16777216L);
        org.junit.Assert.assertTrue(long2 == 16777216L);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.apache.jackrabbit.core.data.DataStore dataStore13 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore13, false);
        dataStoreBlobStore15.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str19 = dataStoreBlobStore15.resolveChunks("BlobStoreStats");
        blobIdTracker12.remove(iterator_str19);
        try {
            java.util.Iterator<java.lang.String> iterator_str21 = blobIdTracker12.get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str19);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = consolidatedDataStoreCacheStats0.nodeStore;
        javax.management.openmbean.TabularData tabularData2 = consolidatedDataStoreCacheStats0.getCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore3 = consolidatedDataStoreCacheStats0.nodeStore;
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertNotNull(tabularData2);
        org.junit.Assert.assertNull(nodeStore3);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever13 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore14 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore16 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore14, false);
        dataStoreBlobStore16.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str20 = dataStoreBlobStore16.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor21 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard24 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector25 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever13, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore16, executor21, 0L, "fsBackendPath", whiteboard24);
        dataStoreBlobStore16.setBlockSize((int) (byte) -1);
        java.util.Iterator<java.lang.String> iterator_str29 = dataStoreBlobStore16.resolveChunks("markedTimestamp-,");
        blobIdTracker12.remove(iterator_str29);
        blobIdTracker12.add("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        try {
            java.util.Iterator<java.lang.String> iterator_str33 = blobIdTracker12.get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str20);
        org.junit.Assert.assertNotNull(iterator_str29);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        try {
            java.io.InputStream inputStream6 = dataStoreBlobStore2.getInputStream("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long10 = cloudBlobStore9.getBlockSizeMin();
        int i11 = cloudBlobStore9.getBlockSize();
        java.lang.String str12 = cloudBlobStore9.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer13 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore9);
        java.io.InputStream inputStream15 = cloudBlobStore9.getInputStream("Blob consistency check");
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions16 = null;
        try {
            java.lang.String str17 = dataStoreBlobStore2.writeBlob(inputStream15, blobOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertTrue(long10 == 4096L);
        org.junit.Assert.assertTrue(i11 == 2097152);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(inputStream15);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads(100);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier9 = null;
        boolean b10 = cachingFileDataStore0.exists(dataIdentifier9);
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        java.lang.String str10 = cloudBlobStore0.getReference("*ERROR*-cachePath");
        java.lang.String str11 = cloudBlobStore0.getSecretKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "*ERROR*-cachePath:R7K2O1QNMPUUDB64F6QSN07F4U2RFK9S" + "'", str10.equals("*ERROR*-cachePath:R7K2O1QNMPUUDB64F6QSN07F4U2RFK9S"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "," + "'", str11.equals(","));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        boolean b12 = oakFileDataStore0.deleteMetadataRecord("markedTimestamp");
        int i14 = oakFileDataStore0.deleteAllOlderThan((long) 16384);
        oakFileDataStore0.setReferenceKeyPlainText("markedTimestamp-org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.concurrent.Executor executor12 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard15 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector16 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor12, 4096L, "Blob migration", whiteboard15);
        java.io.File file18 = null;
        java.io.File file19 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file18);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file19);
        java.io.File file22 = null;
        java.io.File file23 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file22);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file23);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file19, file23, false, false);
        dataStoreBlobStore4.addMetadataRecord(file23, "fsBackendPath");
        dataStoreBlobStore4.startMark();
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertNotNull(file23);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        dataStoreBlobStore2.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer10 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2);
        org.apache.jackrabbit.core.data.DataStore dataStore11 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore13 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore11, false);
        dataStoreBlobStore13.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore13.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore18 = dataStoreBlobStore13.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore19 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore21 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore19, false);
        dataStoreBlobStore21.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore21.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array29 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str30 = new java.util.ArrayList<java.lang.String>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str30, str_array29);
        long long33 = dataStoreBlobStore21.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str30, (long) (byte) 0);
        long long35 = dataStoreBlobStore13.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str30, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector36 = null;
        dataStoreBlobStore13.setBlobStatsCollector(blobStatsCollector36);
        long long38 = dataStoreBlobStore13.getBlockSizeMin();
        java.io.InputStream inputStream39 = null;
        dataStoreBlobStore13.addMetadataRecord(inputStream39, "markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob43 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore13, "Migration started");
        java.lang.String str44 = blobIdSerializer10.serialize((org.apache.jackrabbit.oak.api.Blob) blobStoreBlob43);
        try {
            java.io.InputStream inputStream45 = blobStoreBlob43.getNewStream();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNull(dataStore18);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(long33 == 0L);
        org.junit.Assert.assertTrue(long35 == 0L);
        org.junit.Assert.assertTrue(long38 == 0L);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Migration started" + "'", str44.equals("Migration started"));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord7 = dataStoreBlobStore5.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker8 = dataStoreBlobStore5.getTracker();
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("MemCache", "blob", (long) 16384, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.junit.Assert.assertNull(list_dataRecord7);
        org.junit.Assert.assertNull(blobTracker8);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        int i3 = cloudBlobStore0.sweep();
        try {
            cloudBlobStore0.setBlockSizeMin((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 2097152);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        dataStoreBlobStore5.clearCache();
        try {
            int i15 = dataStoreBlobStore5.deleteAllOlderThan(16777216L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        long long3 = garbageCollectionRepoStats0.getStartTime();
        long long4 = garbageCollectionRepoStats0.getEndTime();
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertTrue(long4 == 0L);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        boolean b14 = oakFileDataStore0.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord16 = oakFileDataStore0.getAllMetadataRecords("Blob garbage collection");
        oakFileDataStore0.init("");
        oakFileDataStore0.setMinRecordLength((int) '#');
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_dataRecord16);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long6 = cloudBlobStore5.getBlockSizeMin();
        int i7 = cloudBlobStore5.getBlockSize();
        java.lang.String str8 = cloudBlobStore5.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer9 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore5);
        java.io.InputStream inputStream11 = cloudBlobStore5.getInputStream("Blob consistency check");
        dataStoreBlobStore2.addMetadataRecord(inputStream11, "markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        try {
            java.lang.String str15 = dataStoreBlobStore2.getBlobId("Blob consistency check");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
        org.junit.Assert.assertTrue(long6 == 4096L);
        org.junit.Assert.assertTrue(i7 == 2097152);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(inputStream11);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.clearInUse();
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str4 = cloudBlobStore2.getBlobId("markedTimestamp");
        java.lang.String str5 = cloudBlobStore2.getSecretKey();
        cloudBlobStore2.setSecretKey(",");
        cloudBlobStore2.clearCache();
        java.util.Iterator<java.lang.String> iterator_str10 = cloudBlobStore2.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend11 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array12 = fSBackend11.getOrCreateReferenceKey();
        byte[] byte_array13 = fSBackend11.getOrCreateReferenceKey();
        cloudBlobStore2.setReferenceKey(byte_array13);
        oakFileDataStore0.setReferenceKey(byte_array13);
        oakFileDataStore0.close();
        oakFileDataStore0.setPath("cacheSize");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(iterator_str10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord12 = dataStoreBlobStore3.getAllMetadataRecords("markedTimestamp");
        try {
            java.lang.String str14 = dataStoreBlobStore3.getBlobId(",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord12);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        org.apache.jackrabbit.core.data.DataRecord dataRecord12 = dataStoreBlobStore3.getMetadataRecord("Migration started");
        try {
            dataStoreBlobStore3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord12);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingPurgeInterval(2097152);
        try {
            int i8 = cachingFileDataStore0.deleteAllOlderThan((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.io.File file2 = null;
        java.io.File file3 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file2);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file3);
        java.io.File file6 = null;
        java.io.File file7 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file7);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file3, file7, false, false);
        java.io.File file12 = null;
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file7, file12);
        try {
            java.io.File file14 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("path", file12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        boolean b14 = oakFileDataStore0.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type15 = oakFileDataStore0.getType();
        int i16 = oakFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore17 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str19 = cloudBlobStore17.getBlobId("markedTimestamp");
        java.lang.String str20 = cloudBlobStore17.getSecretKey();
        cloudBlobStore17.setSecretKey(",");
        cloudBlobStore17.clearCache();
        java.util.Iterator<java.lang.String> iterator_str25 = cloudBlobStore17.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend26 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array27 = fSBackend26.getOrCreateReferenceKey();
        byte[] byte_array28 = fSBackend26.getOrCreateReferenceKey();
        cloudBlobStore17.setReferenceKey(byte_array28);
        oakFileDataStore0.setReferenceKey(byte_array28);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type15.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertTrue(i16 == 4096);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(iterator_str25);
        org.junit.Assert.assertNotNull(byte_array27);
        org.junit.Assert.assertNotNull(byte_array28);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = cachingFileDataStore0.getType();
        try {
            int i3 = cachingFileDataStore0.deleteAllOlderThan((long) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type1.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord("cacheSize");
        java.lang.String[] str_array22 = new java.lang.String[] { "cachePath", "ReferencedBlob{blob=null, id='BlobStoreStats'}", "ConsolidatedDataStoreCacheStats", "*ERROR*-cachePath", ",", "BlobStoreStats", "path", "BlobStoreStats", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", "cacheSize", "markedTimestamp", "org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore", "," };
        java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<java.lang.String>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str23, str_array22);
        boolean b26 = dataStoreBlobStore2.deleteChunks((java.util.List<java.lang.String>) arraylist_str23, 16777216L);
        try {
            java.lang.String str28 = dataStoreBlobStore2.writeBlob("fsBackendPath");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        dataStoreBlobStore3.setBlockSize((int) (byte) -1);
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord15 = dataStoreBlobStore3.getAllRecords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore3.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord9 = dataStoreBlobStore3.getMetadataRecord("cacheSize");
        java.util.concurrent.Executor executor10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector15 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor10, "", (int) (byte) 10, 1L, "Blob migration");
        try {
            java.lang.String str17 = dataStoreBlobStore3.getReference("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord9);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord13 = dataStoreBlobStore4.getAllMetadataRecords("markedTimestamp");
        java.util.concurrent.Executor executor14 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard17 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector18 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor14, (long) 'a', "", whiteboard17);
        int i19 = dataStoreBlobStore4.sweep();
        org.apache.jackrabbit.core.data.DataStore dataStore20 = dataStoreBlobStore4.getDataStore();
        long long21 = dataStoreBlobStore4.getBlockSizeMin();
        try {
            int i23 = dataStoreBlobStore4.deleteAllOlderThan((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(dataStore20);
        org.junit.Assert.assertTrue(long21 == 0L);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker5 = dataStoreBlobStore2.getTracker();
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker6 = null;
        dataStoreBlobStore2.addTracker(blobTracker6);
        int i8 = dataStoreBlobStore2.sweep();
        try {
            java.lang.String str10 = dataStoreBlobStore2.getReference("*ERROR*-cachePath:R7K2O1QNMPUUDB64F6QSN07F4U2RFK9S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
        org.junit.Assert.assertNull(blobTracker5);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType0 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER;
        java.lang.String str1 = sharedStoreRecordType0.getType();
        java.lang.String str3 = sharedStoreRecordType0.getNameFromId(",");
        java.lang.String str5 = sharedStoreRecordType0.getIdFromName("BlobStore-MemCache");
        java.lang.String str7 = sharedStoreRecordType0.getNameFromId("Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType0 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER + "'", sharedStoreRecordType0.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "markedTimestamp" + "'", str1.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "markedTimestamp-," + "'", str3.equals("markedTimestamp-,"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MemCache" + "'", str5.equals("MemCache"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E" + "'", str7.equals("markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E"));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setStartTime((long) '4');
        long long3 = garbageCollectionRepoStats0.getStartTime();
        org.junit.Assert.assertTrue(long3 == 52L);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.io.File file2 = null;
        java.io.File file3 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file2);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file3);
        java.io.File file6 = null;
        java.io.File file7 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file7);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file3, file7, false, false);
        java.io.File file13 = null;
        java.io.File file14 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file3, file14, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        java.io.File file20 = null;
        java.io.File file21 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file21);
        java.io.File file24 = null;
        java.io.File file25 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file24);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file25);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file21, file25, false, false);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file21, file32, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file14, file32, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream38 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache40 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(4096L, file14, cacheloader_str_inputStream38, executorService39);
        fileCache40.close();
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array42 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord43 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord43, dataRecord_array42);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array45 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord46 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord46, dataRecord_array45);
        java.util.Set<java.lang.String> set_str48 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord43, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord46);
        com.google.common.collect.ImmutableMap<java.lang.String, java.io.File> immutablemap_str_file49 = fileCache40.getAllPresent((java.lang.Iterable<java.lang.String>) set_str48);
        try {
            java.io.File file51 = fileCache40.get("*ERROR*-ConsolidatedDataStoreCacheStats");
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(fileCache40);
        org.junit.Assert.assertNotNull(dataRecord_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(dataRecord_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set_str48);
        org.junit.Assert.assertNotNull(immutablemap_str_file49);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setEndTime((long) (short) -1);
        garbageCollectionRepoStats0.setRepositoryId("ConsolidatedDataStoreCacheStats");
        java.lang.String str5 = garbageCollectionRepoStats0.getRepositoryId();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ConsolidatedDataStoreCacheStats" + "'", str5.equals("ConsolidatedDataStoreCacheStats"));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.concurrent.Executor executor12 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard15 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector16 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor12, 4096L, "Blob migration", whiteboard15);
        try {
            dataStoreBlobStore4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setUploadThreads((int) '4');
        cachingFileDataStore0.setCacheSize(10L);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier8 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord9 = cachingFileDataStore0.getRecordForId(dataIdentifier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType0 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER;
        java.lang.String str1 = sharedStoreRecordType0.getType();
        java.lang.String str3 = sharedStoreRecordType0.getNameFromId("*ERROR*-cachePath:D7HRFQQIO3566IETTFV5K16NAUPUR5E0");
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType0 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER + "'", sharedStoreRecordType0.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "markedTimestamp" + "'", str1.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "markedTimestamp-*ERROR*-cachePath:D7HRFQQIO3566IETTFV5K16NAUPUR5E0" + "'", str3.equals("markedTimestamp-*ERROR*-cachePath:D7HRFQQIO3566IETTFV5K16NAUPUR5E0"));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.concurrent.Executor executor12 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard15 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector16 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor12, 4096L, "Blob migration", whiteboard15);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore18 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore4, true);
        java.util.Iterator<java.lang.String> iterator_str20 = dataStoreBlobStore4.resolveChunks("fsBackendPath");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier21 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord22 = dataStoreBlobStore4.getRecordForId(dataIdentifier21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str20);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState1 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("cacheSizeInMB");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        java.util.concurrent.Executor executor10 = null;
        try {
            org.apache.jackrabbit.oak.plugins.blob.BlobGC blobGC11 = new org.apache.jackrabbit.oak.plugins.blob.BlobGC((org.apache.jackrabbit.oak.plugins.blob.BlobGarbageCollector) markSweepGarbageCollector9, executor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        java.lang.Object obj5 = blobMigration0.getImplementation();
        try {
            java.lang.Object obj7 = blobMigration0.getAttribute("cacheSizeInMB");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException");
        } catch (javax.management.AttributeNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0);
        java.lang.String str11 = dataStoreBlobStore9.getBlobId("markedTimestamp-/tmp");
        java.lang.String str12 = dataStoreBlobStore9.toString();
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "DataStore backed BlobStore [org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore]" + "'", str12.equals("DataStore backed BlobStore [org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore]"));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        java.io.File file2 = null;
        java.io.File file3 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file2);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file3);
        java.io.File file6 = null;
        java.io.File file7 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file7);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file3, file7, false, false);
        java.io.File file13 = null;
        java.io.File file14 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file3, file14, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        java.io.File file20 = null;
        java.io.File file21 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file21);
        java.io.File file24 = null;
        java.io.File file25 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file24);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file25);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file21, file25, false, false);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file21, file32, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file14, file32, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream38 = null;
        java.util.concurrent.ExecutorService executorService39 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache40 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(4096L, file14, cacheloader_str_inputStream38, executorService39);
        java.io.File file42 = null;
        try {
            fileCache40.put("Blob garbage collection", file42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(fileCache40);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.clearCache();
        java.lang.String str5 = cloudBlobStore0.getSecretKey();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats6 = cloudBlobStore0.getCacheStats();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats7 = cloudBlobStore0.getCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever8 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore9 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore11 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore9, false);
        java.util.concurrent.Executor executor12 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector17 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever8, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore11, executor12, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats18 = dataStoreBlobStore11.getCacheStats();
        java.lang.String[] str_array24 = new java.lang.String[] { "*ERROR*-cachePath:D7HRFQQIO3566IETTFV5K16NAUPUR5E0", "Blob migration", "hi!", "Blob migration:5BLDB1SVB7VKPR3D9TL90A4EEHT79NKP", "Migration started" };
        javax.management.AttributeList attributeList25 = cacheStats18.getAttributes(str_array24);
        javax.management.AttributeList attributeList26 = cacheStats7.getAttributes(str_array24);
        javax.management.MBeanInfo mBeanInfo27 = cacheStats7.getMBeanInfo();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cacheStats6);
        org.junit.Assert.assertNotNull(cacheStats7);
        org.junit.Assert.assertNotNull(cacheStats18);
        org.junit.Assert.assertNotNull(str_array24);
        org.junit.Assert.assertNotNull(attributeList25);
        org.junit.Assert.assertNotNull(attributeList26);
        org.junit.Assert.assertNotNull(mBeanInfo27);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        dataStoreBlobStore4.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore4.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord10 = dataStoreBlobStore4.getMetadataRecord("cacheSize");
        java.util.concurrent.Executor executor11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector16 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor11, "", (int) (byte) 10, 1L, "Blob migration");
        dataStoreBlobStore4.setBlockSize((int) (short) 10);
        java.util.concurrent.Executor executor19 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector24 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor19, "DataStore backed BlobStore [org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore]", (int) '4', (long) (byte) 100, "BlobStoreStats");
        org.junit.Assert.assertNull(dataRecord10);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = oakFileDataStore0.getType();
        java.lang.String str2 = oakFileDataStore0.getPath();
        java.lang.String str3 = oakFileDataStore0.getPath();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type1.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array0 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord1 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, dataRecord_array0);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array3 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord4 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord4, dataRecord_array3);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array6 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord7 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord7, dataRecord_array6);
        java.util.Set<java.lang.String> set_str9 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord4, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord7);
        java.util.Set<java.lang.String> set_str10 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord4);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array11 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord12 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord12, dataRecord_array11);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array14 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord15 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord15, dataRecord_array14);
        java.util.Set<java.lang.String> set_str17 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord12, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord15);
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore18 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore18.close();
        oakFileDataStore18.clearInUse();
        byte[] byte_array25 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore18.setReferenceKey(byte_array25);
        oakFileDataStore18.init("cachePath");
        oakFileDataStore18.deleteAllMetadataRecords("cachePath");
        boolean b32 = oakFileDataStore18.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord34 = oakFileDataStore18.getAllMetadataRecords("Blob garbage collection");
        java.util.Set<java.lang.String> set_str35 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord12, list_dataRecord34);
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore36 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore36.close();
        oakFileDataStore36.clearInUse();
        byte[] byte_array43 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore36.setReferenceKey(byte_array43);
        oakFileDataStore36.init("cachePath");
        oakFileDataStore36.deleteAllMetadataRecords("cachePath");
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord50 = oakFileDataStore36.getAllMetadataRecords("fsBackendPath");
        java.util.Set<java.lang.String> set_str51 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos(list_dataRecord34, list_dataRecord50);
        java.util.Set<java.lang.String> set_str52 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1, list_dataRecord34);
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord53 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.getEarliestRecord((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord1);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(dataRecord_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(dataRecord_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(dataRecord_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set_str9);
        org.junit.Assert.assertNotNull(set_str10);
        org.junit.Assert.assertNotNull(dataRecord_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(dataRecord_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set_str17);
        org.junit.Assert.assertNotNull(byte_array25);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(list_dataRecord34);
        org.junit.Assert.assertNotNull(set_str35);
        org.junit.Assert.assertNotNull(byte_array43);
        org.junit.Assert.assertNotNull(list_dataRecord50);
        org.junit.Assert.assertNotNull(set_str51);
        org.junit.Assert.assertNotNull(set_str52);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId blobId1 = org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId.of("Blob garbage collection");
        java.lang.String str2 = blobId1.getBlobId();
        org.junit.Assert.assertNotNull(blobId1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Blob garbage collection" + "'", str2.equals("Blob garbage collection"));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        java.util.Properties properties1 = null;
        cachingFileDataStore0.setProperties(properties1);
        cachingFileDataStore0.setPath("cachePath");
        cachingFileDataStore0.setStagingSplitPercentage((int) (short) -1);
        cachingFileDataStore0.setStagingPurgeInterval(100);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.jackrabbit.oak.api.Blob blob0 = null;
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob2 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob0, "BlobStoreStats");
        org.apache.jackrabbit.oak.api.Blob blob3 = referencedBlob2.getBlob();
        java.lang.String str4 = referencedBlob2.toString();
        org.apache.jackrabbit.oak.api.Blob blob5 = null;
        referencedBlob2.setBlob(blob5);
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats7 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats7.setLocal(false);
        long long10 = garbageCollectionRepoStats7.getStartTime();
        boolean b11 = referencedBlob2.equals((java.lang.Object) long10);
        java.lang.String str12 = referencedBlob2.toString();
        org.junit.Assert.assertNull(blob3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ReferencedBlob{blob=null, id='BlobStoreStats'}" + "'", str4.equals("ReferencedBlob{blob=null, id='BlobStoreStats'}"));
        org.junit.Assert.assertTrue(long10 == 0L);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ReferencedBlob{blob=null, id='BlobStoreStats'}" + "'", str12.equals("ReferencedBlob{blob=null, id='BlobStoreStats'}"));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        long long3 = garbageCollectionRepoStats0.getLength();
        java.lang.String str4 = garbageCollectionRepoStats0.getRepositoryId();
        boolean b5 = garbageCollectionRepoStats0.isLocal();
        java.lang.String str6 = garbageCollectionRepoStats0.getRepositoryId();
        long long7 = garbageCollectionRepoStats0.getEndTime();
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(long7 == 0L);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.concurrent.Executor executor12 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard15 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector16 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor12, 4096L, "Blob migration", whiteboard15);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier17 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord18 = dataStoreBlobStore4.getRecord(dataIdentifier17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        java.io.File file1 = null;
        java.io.File file2 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file1);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file2);
        java.io.File file5 = null;
        java.io.File file6 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file5);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file2, file6, false, false);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever11 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever12 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore13 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore13, false);
        java.util.concurrent.Executor executor16 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard21 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector22 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever12, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore15, executor16, ",", (int) (byte) 10, (long) 10, "", whiteboard21);
        java.util.concurrent.Executor executor23 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard26 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector27 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever11, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore15, executor23, 4096L, "Blob migration", whiteboard26);
        java.io.File file29 = null;
        java.io.File file30 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file29);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file30);
        java.io.File file33 = null;
        java.io.File file34 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file33);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file34);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file30, file34, false, false);
        dataStoreBlobStore15.addMetadataRecord(file34, "fsBackendPath");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file6, file34, false, false);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNotNull(file30);
        org.junit.Assert.assertNotNull(file34);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setCacheSize((long) 'a');
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type6 = cachingFileDataStore0.getType();
        java.io.File file8 = null;
        java.io.File file9 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file8);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file9);
        java.io.File file12 = null;
        java.io.File file13 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file12);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file9, file13, false, false);
        java.io.File file18 = null;
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file13, file18);
        try {
            cachingFileDataStore0.addMetadataRecord(file18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type6.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNotNull(file13);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord14 = oakFileDataStore0.getAllMetadataRecords("fsBackendPath");
        int i15 = oakFileDataStore0.getMinRecordLength();
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(list_dataRecord14);
        org.junit.Assert.assertTrue(i15 == 4096);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState1 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("cachePath");
        java.io.File file2 = garbageCollectorFileState1.getMarkedRefs();
        garbageCollectorFileState1.close();
        java.io.File file4 = garbageCollectorFileState1.getAvailableRefs();
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file4);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        java.util.Properties properties7 = null;
        cachingFileDataStore0.setProperties(properties7);
        cachingFileDataStore0.setPath("BlobStore-MemCache");
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long6 = cloudBlobStore5.getBlockSizeMin();
        int i7 = cloudBlobStore5.getBlockSize();
        java.lang.String str8 = cloudBlobStore5.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer9 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore5);
        java.io.InputStream inputStream11 = cloudBlobStore5.getInputStream("Blob consistency check");
        dataStoreBlobStore2.addMetadataRecord(inputStream11, "markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore14 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long15 = cloudBlobStore14.getBlockSizeMin();
        int i16 = cloudBlobStore14.getBlockSize();
        java.lang.String str17 = cloudBlobStore14.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer18 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore14);
        java.io.InputStream inputStream20 = cloudBlobStore14.getInputStream("Blob consistency check");
        try {
            java.lang.String str21 = dataStoreBlobStore2.writeBlob(inputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord4);
        org.junit.Assert.assertTrue(long6 == 4096L);
        org.junit.Assert.assertTrue(i7 == 2097152);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue(long15 == 4096L);
        org.junit.Assert.assertTrue(i16 == 2097152);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(inputStream20);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.apache.jackrabbit.core.data.DataStore dataStore13 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore13, false);
        dataStoreBlobStore15.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str19 = dataStoreBlobStore15.resolveChunks("BlobStoreStats");
        long long20 = dataStoreBlobStore15.getBlockSizeMin();
        java.util.Iterator<java.lang.String> iterator_str22 = dataStoreBlobStore15.resolveChunks("fsBackendPath");
        blobIdTracker12.add(iterator_str22);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker.ActiveDeletionTracker activeDeletionTracker24 = blobIdTracker12.getDeleteTracker();
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker.ActiveDeletionTracker activeDeletionTracker25 = blobIdTracker12.getDeleteTracker();
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str19);
        org.junit.Assert.assertTrue(long20 == 0L);
        org.junit.Assert.assertNotNull(iterator_str22);
        org.junit.Assert.assertNotNull(activeDeletionTracker24);
        org.junit.Assert.assertNotNull(activeDeletionTracker25);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, ",", (int) (byte) 10, (long) 10, "", whiteboard10);
        java.util.concurrent.Executor executor12 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard15 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector16 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor12, 4096L, "Blob migration", whiteboard15);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore18 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore4, true);
        java.util.Iterator<java.lang.String> iterator_str20 = dataStoreBlobStore4.resolveChunks("fsBackendPath");
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier21 = dataStoreBlobStore4.getAllIdentifiers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str20);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId blobId1 = org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId.of("repository-*ERROR*-cachePath");
        org.junit.Assert.assertNotNull(blobId1);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        try {
            java.util.Iterator<java.lang.String> iterator_str13 = blobIdTracker12.get();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        dataStoreBlobStore2.deleteAllMetadataRecords("BlobStore-MemCache");
        dataStoreBlobStore2.deleteAllMetadataRecords("Migration started");
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        dataStoreBlobStore3.setMaxCachedBinarySize((int) (short) 0);
        dataStoreBlobStore3.startMark();
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob15 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore3, ",");
        org.apache.jackrabbit.oak.spi.blob.BlobStore blobStore16 = blobStoreBlob15.getBlobStore();
        try {
            java.io.InputStream inputStream17 = blobStoreBlob15.getNewStream();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(blobStore16);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        long long3 = garbageCollectionRepoStats0.getLength();
        garbageCollectionRepoStats0.setLocal(false);
        garbageCollectionRepoStats0.setLength((long) (short) 100);
        long long8 = garbageCollectionRepoStats0.getLength();
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertTrue(long8 == 100L);
    }
}

