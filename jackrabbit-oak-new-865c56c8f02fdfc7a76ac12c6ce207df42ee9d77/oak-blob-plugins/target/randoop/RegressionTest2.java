import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        garbageCollectionRepoStats0.setNumLines((int) '4');
        long long5 = garbageCollectionRepoStats0.getEndTime();
        garbageCollectionRepoStats0.setLocal(true);
        garbageCollectionRepoStats0.setRepositoryId("");
        org.junit.Assert.assertTrue(long5 == 0L);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test02");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector11 = null;
        dataStoreBlobStore10.setBlobStatsCollector(blobStatsCollector11);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord14 = dataStoreBlobStore10.getAllMetadataRecords("path");
        org.apache.jackrabbit.core.data.DataStore dataStore15 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore17 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore15, false);
        dataStoreBlobStore17.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore17.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array25 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str26 = new java.util.ArrayList<java.lang.String>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str26, str_array25);
        long long29 = dataStoreBlobStore17.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str26, (long) (byte) 0);
        long long31 = dataStoreBlobStore10.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str26, (long) 2097152);
        org.apache.jackrabbit.core.data.DataRecord dataRecord33 = dataStoreBlobStore10.getMetadataRecord("");
        try {
            java.util.Iterator<java.lang.String> iterator_str35 = dataStoreBlobStore10.getAllChunkIds((long) 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord14);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(long29 == 0L);
        org.junit.Assert.assertTrue(long31 == 0L);
        org.junit.Assert.assertNull(dataRecord33);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test03");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0, false);
        cachingFileDataStore0.setUploadThreads((int) (byte) 100);
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test04");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.clearCache();
        java.lang.String str5 = cloudBlobStore0.getSecretKey();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats6 = cloudBlobStore0.getCacheStats();
        javax.management.MBeanInfo mBeanInfo7 = cacheStats6.getMBeanInfo();
        javax.management.Attribute attribute8 = null;
        try {
            cacheStats6.setAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cacheStats6);
        org.junit.Assert.assertNotNull(mBeanInfo7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test05");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord("cacheSize");
        try {
            java.util.Iterator<java.lang.String> iterator_str10 = dataStoreBlobStore2.getAllChunkIds((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test06");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId blobId1 = org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId.of("Blob migration:BMGP6P4II1MSH5EP7HF76HUI2MVE2TR7");
        long long2 = blobId1.getLength();
        org.junit.Assert.assertNotNull(blobId1);
        org.junit.Assert.assertTrue(long2 == (-1L));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test07");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId blobId1 = org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId.of("Blob garbage collection");
        long long2 = blobId1.getLength();
        java.lang.String str3 = blobId1.getBlobId();
        long long4 = blobId1.getLength();
        org.junit.Assert.assertNotNull(blobId1);
        org.junit.Assert.assertTrue(long2 == (-1L));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Blob garbage collection" + "'", str3.equals("Blob garbage collection"));
        org.junit.Assert.assertTrue(long4 == (-1L));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test08");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        org.apache.jackrabbit.core.data.DataRecord dataRecord14 = oakFileDataStore0.getMetadataRecord("");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str17 = cloudBlobStore15.getBlobId("markedTimestamp");
        java.lang.String str18 = cloudBlobStore15.getSecretKey();
        cloudBlobStore15.setSecretKey(",");
        cloudBlobStore15.clearCache();
        java.util.Iterator<java.lang.String> iterator_str23 = cloudBlobStore15.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend24 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array25 = fSBackend24.getOrCreateReferenceKey();
        byte[] byte_array26 = fSBackend24.getOrCreateReferenceKey();
        cloudBlobStore15.setReferenceKey(byte_array26);
        java.lang.String str28 = cloudBlobStore15.getCloudProvider();
        byte[] byte_array31 = new byte[] { (byte) 1, (byte) 10 };
        cloudBlobStore15.setReferenceKey(byte_array31);
        oakFileDataStore0.setReferenceKey(byte_array31);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever34 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever35 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore36 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore38 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore36, false);
        java.util.concurrent.Executor executor39 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard44 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector45 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever35, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore38, executor39, ",", (int) (byte) 10, (long) 10, "", whiteboard44);
        java.util.concurrent.Executor executor46 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector51 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever34, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore38, executor46, "path", (int) 'a', (long) (short) -1, "markedTimestamp-org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        org.apache.jackrabbit.core.data.DataStore dataStore52 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore54 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore52, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord56 = dataStoreBlobStore54.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore57 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long58 = cloudBlobStore57.getBlockSizeMin();
        int i59 = cloudBlobStore57.getBlockSize();
        java.lang.String str60 = cloudBlobStore57.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer61 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore57);
        java.io.InputStream inputStream63 = cloudBlobStore57.getInputStream("Blob consistency check");
        dataStoreBlobStore54.addMetadataRecord(inputStream63, "markedTimestamp-Blob migration:H1NBQUTBUMA1JQ3R1PNU6SBTCN5CLE11");
        dataStoreBlobStore38.addMetadataRecord(inputStream63, "ReferencedBlob{blob=null, id='BlobStoreStats'}");
        try {
            oakFileDataStore0.addMetadataRecord(inputStream63, "Migration started");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNull(dataRecord14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(iterator_str23);
        org.junit.Assert.assertNotNull(byte_array25);
        org.junit.Assert.assertNotNull(byte_array26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertNull(list_dataRecord56);
        org.junit.Assert.assertTrue(long58 == 4096L);
        org.junit.Assert.assertTrue(i59 == 2097152);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(inputStream63);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test09");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        java.util.Properties properties7 = null;
        cachingFileDataStore0.setProperties(properties7);
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier9 = cachingFileDataStore0.getAllIdentifiers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test10");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0);
        org.apache.jackrabbit.oak.stats.StatisticsProvider statisticsProvider10 = null;
        cachingFileDataStore0.setStatisticsProvider(statisticsProvider10);
        cachingFileDataStore0.setUploadThreads((int) (byte) 100);
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState15 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("cachePath");
        java.io.File file16 = garbageCollectorFileState15.getMarkedRefs();
        garbageCollectorFileState15.close();
        java.io.File file18 = garbageCollectorFileState15.getAvailableRefs();
        try {
            cachingFileDataStore0.addMetadataRecord(file18, "Blob migration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNotNull(file18);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test11");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration0.preDeregister();
        java.lang.String str3 = blobMigration0.startBlobMigration(false);
        blobMigration0.postDeregister();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Migration started" + "'", str3.equals("Migration started"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test12");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore3.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord9 = dataStoreBlobStore3.getMetadataRecord("cacheSize");
        java.util.concurrent.Executor executor10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector15 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor10, "", (int) (byte) 10, 1L, "Blob migration");
        dataStoreBlobStore3.deleteAllMetadataRecords("Blob migration:06FKPNT6V1CD3DKF7A3L2HJ3L7I8DRJR");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore18 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore18.setStagingSplitPercentage(100);
        int i21 = cachingFileDataStore18.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type22 = cachingFileDataStore18.getType();
        cachingFileDataStore18.setPath("markedTimestamp-,");
        cachingFileDataStore18.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore28 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore18, false);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore30 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore28, false);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever31 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore32 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore34 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore32, false);
        java.util.concurrent.Executor executor35 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard40 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector41 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever31, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore34, executor35, ",", (int) (byte) 10, (long) 10, "", whiteboard40);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever42 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever43 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore44 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore46 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore44, false);
        java.util.concurrent.Executor executor47 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard52 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector53 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever43, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore46, executor47, ",", (int) (byte) 10, (long) 10, "", whiteboard52);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord55 = dataStoreBlobStore46.getAllMetadataRecords("markedTimestamp");
        java.util.concurrent.Executor executor56 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard61 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector62 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever42, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore46, executor56, "hi!", (int) ' ', (long) ' ', "ConsolidatedDataStoreCacheStats", whiteboard61);
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type63 = dataStoreBlobStore46.getType();
        org.apache.jackrabbit.core.data.DataStore dataStore64 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore66 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore64, false);
        dataStoreBlobStore66.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore66.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore71 = dataStoreBlobStore66.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore72 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore74 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore72, false);
        dataStoreBlobStore74.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore74.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array82 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str83 = new java.util.ArrayList<java.lang.String>();
        boolean b84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str83, str_array82);
        long long86 = dataStoreBlobStore74.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str83, (long) (byte) 0);
        long long88 = dataStoreBlobStore66.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str83, (long) 1);
        boolean b90 = dataStoreBlobStore46.deleteChunks((java.util.List<java.lang.String>) arraylist_str83, (long) (short) -1);
        long long92 = dataStoreBlobStore34.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str83, 52L);
        boolean b94 = dataStoreBlobStore30.deleteChunks((java.util.List<java.lang.String>) arraylist_str83, 0L);
        boolean b96 = dataStoreBlobStore3.deleteChunks((java.util.List<java.lang.String>) arraylist_str83, (-1L));
        try {
            int i98 = dataStoreBlobStore3.deleteAllOlderThan((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord9);
        org.junit.Assert.assertTrue(i21 == 16384);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type22.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertNull(list_dataRecord55);
        org.junit.Assert.assertTrue("'" + type63 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.DEFAULT + "'", type63.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.DEFAULT));
        org.junit.Assert.assertNull(dataStore71);
        org.junit.Assert.assertNotNull(str_array82);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(long86 == 0L);
        org.junit.Assert.assertTrue(long88 == 0L);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(long92 == 0L);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue(b96 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test13");
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
        java.util.Properties properties17 = null;
        cachingFileDataStore8.setProperties(properties17);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier19 = null;
        boolean b20 = cachingFileDataStore8.exists(dataIdentifier19);
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i11 == 16384);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test14");
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
        java.lang.String str21 = oakFileDataStore0.getPath();
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_dataRecord16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "cachePath/repository/datastore" + "'", str21.equals("cachePath/repository/datastore"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test15");
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
        try {
            dataStoreBlobStore4.init("ReferencedBlob{blob=null, id='BlobStoreStats'}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertNotNull(file23);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test16");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = consolidatedDataStoreCacheStats0.nodeStore;
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore2 = null;
        consolidatedDataStoreCacheStats0.cachingDataStore = abstractSharedCachingDataStore2;
        boolean b5 = consolidatedDataStoreCacheStats0.isFileSynced("BlobStoreStats");
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore6 = null;
        consolidatedDataStoreCacheStats0.nodeStore = nodeStore6;
        boolean b9 = consolidatedDataStoreCacheStats0.isFileSynced("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore10 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore11 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(abstractSharedCachingDataStore10);
        org.junit.Assert.assertNull(abstractSharedCachingDataStore11);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test17");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0);
        int i10 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever11 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore12 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore14 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore12, false);
        dataStoreBlobStore14.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str18 = dataStoreBlobStore14.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor19 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard22 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector23 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever11, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore14, executor19, 0L, "fsBackendPath", whiteboard22);
        dataStoreBlobStore14.setBlockSize((int) (byte) -1);
        java.io.InputStream inputStream26 = null;
        dataStoreBlobStore14.addMetadataRecord(inputStream26, "markedTimestamp");
        java.io.File file30 = null;
        java.io.File file31 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file30);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file31);
        java.io.File file34 = null;
        java.io.File file35 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file34);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file35);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file31, file35, false, false);
        dataStoreBlobStore14.addMetadataRecord(file35, "ReferencedBlob{blob=null, id='BlobStoreStats'}");
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer43 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file35, (int) (byte) 0);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever44 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore45 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore47 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore45, false);
        java.util.concurrent.Executor executor48 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector53 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever44, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore47, executor48, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore54 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore47);
        java.io.File file56 = null;
        java.io.File file57 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file56);
        dataStoreBlobStore54.addMetadataRecord(file57, "BlobStore-MemCache");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file35, file57, true);
        try {
            cachingFileDataStore0.addMetadataRecord(file35, "cacheSize");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertTrue(i10 == 16384);
        org.junit.Assert.assertNotNull(iterator_str18);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertNotNull(file57);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test18");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        dataStoreBlobStore3.setBlockSize((int) (byte) -1);
        java.util.Iterator<java.lang.String> iterator_str16 = dataStoreBlobStore3.resolveChunks("markedTimestamp-,");
        dataStoreBlobStore3.startMark();
        org.junit.Assert.assertNotNull(iterator_str7);
        org.junit.Assert.assertNotNull(iterator_str16);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test19");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        java.util.Properties properties3 = null;
        fSBackend0.setProperties(properties3);
        java.util.Properties properties5 = null;
        fSBackend0.setProperties(properties5);
        fSBackend0.close();
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test20");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        java.util.Properties properties1 = null;
        cachingFileDataStore0.setProperties(properties1);
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type3 = cachingFileDataStore0.getType();
        try {
            cachingFileDataStore0.deleteAllMetadataRecords("Blob migration:H1NBQUTBUMA1JQ3R1PNU6SBTCN5CLE11:9LMODER0V5OEUHT3NE4KGKL38A88PRJ1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type3.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test21");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.startMark();
        java.lang.String str6 = cloudBlobStore0.getBlobId("*ERROR*-ConsolidatedDataStoreCacheStats");
        java.lang.String str7 = cloudBlobStore0.getSecretKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test22");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        long long3 = garbageCollectionRepoStats0.getLength();
        java.lang.String str4 = garbageCollectionRepoStats0.getRepositoryId();
        boolean b5 = garbageCollectionRepoStats0.isLocal();
        java.lang.String str6 = garbageCollectionRepoStats0.getRepositoryId();
        garbageCollectionRepoStats0.setRepositoryId("");
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test23");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        dataStoreBlobStore3.setBlockSize(16);
        org.apache.jackrabbit.core.data.DataStore dataStore16 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore18 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore16, false);
        dataStoreBlobStore18.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore18.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord24 = dataStoreBlobStore18.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker25 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore18);
        dataStoreBlobStore3.addTracker((org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker) blobIdTracker25);
        org.apache.jackrabbit.core.data.DataStore dataStore30 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore32 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore30, false);
        dataStoreBlobStore32.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore32.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord38 = dataStoreBlobStore32.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker39 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore32);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever40 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore41 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore43 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore41, false);
        dataStoreBlobStore43.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str47 = dataStoreBlobStore43.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor48 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard51 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector52 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever40, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore43, executor48, 0L, "fsBackendPath", whiteboard51);
        dataStoreBlobStore43.setBlockSize((int) (byte) -1);
        java.util.Iterator<java.lang.String> iterator_str56 = dataStoreBlobStore43.resolveChunks("markedTimestamp-,");
        blobIdTracker39.remove(iterator_str56);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker.ActiveDeletionTracker activeDeletionTracker58 = blobIdTracker39.getDeleteTracker();
        dataStoreBlobStore3.addTracker((org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker) blobIdTracker39);
        org.junit.Assert.assertNull(dataRecord24);
        org.junit.Assert.assertNull(dataRecord38);
        org.junit.Assert.assertNotNull(iterator_str47);
        org.junit.Assert.assertNotNull(iterator_str56);
        org.junit.Assert.assertNotNull(activeDeletionTracker58);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test24");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0);
        int i10 = cachingFileDataStore0.getMinRecordLength();
        int i11 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore12 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long13 = cloudBlobStore12.getBlockSizeMin();
        int i14 = cloudBlobStore12.getBlockSize();
        int i15 = cloudBlobStore12.sweep();
        java.io.InputStream inputStream17 = cloudBlobStore12.getInputStream("*ERROR*-cachePath");
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions18 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord19 = cachingFileDataStore0.addRecord(inputStream17, blobOptions18);
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertTrue(i10 == 16384);
        org.junit.Assert.assertTrue(i11 == 16384);
        org.junit.Assert.assertTrue(long13 == 4096L);
        org.junit.Assert.assertTrue(i14 == 2097152);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(inputStream17);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test25");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        long long3 = garbageCollectionRepoStats0.getLength();
        java.lang.String str4 = garbageCollectionRepoStats0.getRepositoryId();
        long long5 = garbageCollectionRepoStats0.getEndTime();
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(long5 == 0L);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test26");
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
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore15.setStagingSplitPercentage(100);
        int i18 = cachingFileDataStore15.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type19 = cachingFileDataStore15.getType();
        cachingFileDataStore15.setStagingRetryInterval(16);
        consolidatedDataStoreCacheStats0.cachingDataStore = cachingFileDataStore15;
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore23 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.apache.jackrabbit.oak.stats.StatisticsProvider statisticsProvider24 = null;
        abstractSharedCachingDataStore23.setStatisticsProvider(statisticsProvider24);
        abstractSharedCachingDataStore23.setCacheSize((long) (short) -1);
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i11 == 16384);
        org.junit.Assert.assertTrue(i18 == 16384);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type19.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertNotNull(abstractSharedCachingDataStore23);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test27");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = oakFileDataStore0.getType();
        oakFileDataStore0.setPath("markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore4.clearCache();
        java.lang.String str6 = cloudBlobStore4.getAccessKey();
        java.lang.String str7 = cloudBlobStore4.getAccessKey();
        cloudBlobStore4.setSecretKey("markedTimestamp");
        cloudBlobStore4.clearInUse();
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend11 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        fSBackend11.close();
        byte[] byte_array13 = fSBackend11.getOrCreateReferenceKey();
        cloudBlobStore4.setReferenceKey(byte_array13);
        oakFileDataStore0.setReferenceKey(byte_array13);
        oakFileDataStore0.setMinRecordLength((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type1.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byte_array13);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test28");
        java.io.File file0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        dataStoreBlobStore4.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str8 = dataStoreBlobStore4.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor9 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard12 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector13 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor9, 0L, "fsBackendPath", whiteboard12);
        java.io.File file15 = null;
        java.io.File file16 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file15);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file16);
        java.io.File file19 = null;
        java.io.File file20 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file19);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file16, file20, false, false);
        java.io.File file25 = null;
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file20, file25);
        dataStoreBlobStore4.addMetadataRecord(file20, "Blob garbage collection");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file0, file20, false, true);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNotNull(file20);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test29");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        boolean b14 = oakFileDataStore0.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type15 = oakFileDataStore0.getType();
        int i17 = oakFileDataStore0.deleteAllOlderThan((long) (-1));
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type15.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test30");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = consolidatedDataStoreCacheStats0.nodeStore;
        boolean b3 = consolidatedDataStoreCacheStats0.isFileSynced("BlobStore-MemCache");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats4 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore5 = consolidatedDataStoreCacheStats4.nodeStore;
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore6 = null;
        consolidatedDataStoreCacheStats4.cachingDataStore = abstractSharedCachingDataStore6;
        boolean b9 = consolidatedDataStoreCacheStats4.isFileSynced("BlobStoreStats");
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore10 = null;
        consolidatedDataStoreCacheStats4.nodeStore = nodeStore10;
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore12.setStagingSplitPercentage(100);
        int i15 = cachingFileDataStore12.getMinRecordLength();
        cachingFileDataStore12.setMinRecordLength(0);
        consolidatedDataStoreCacheStats4.cachingDataStore = cachingFileDataStore12;
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore19 = consolidatedDataStoreCacheStats4.cachingDataStore;
        consolidatedDataStoreCacheStats0.cachingDataStore = abstractSharedCachingDataStore19;
        abstractSharedCachingDataStore19.setUploadThreads((int) (byte) 0);
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(nodeStore5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i15 == 16384);
        org.junit.Assert.assertNotNull(abstractSharedCachingDataStore19);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test31");
        org.apache.jackrabbit.oak.api.Blob blob0 = null;
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob2 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob0, "BlobStoreStats");
        org.apache.jackrabbit.oak.api.Blob blob3 = null;
        referencedBlob2.setBlob(blob3);
        org.apache.jackrabbit.core.data.DataStore dataStore5 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore7 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore5, false);
        dataStoreBlobStore7.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str11 = dataStoreBlobStore7.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord13 = dataStoreBlobStore7.getMetadataRecord(",");
        dataStoreBlobStore7.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer15 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore7);
        org.apache.jackrabbit.core.data.DataStore dataStore16 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore18 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore16, false);
        dataStoreBlobStore18.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore18.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore23 = dataStoreBlobStore18.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore24 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore26 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore24, false);
        dataStoreBlobStore26.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore26.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array34 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str35, str_array34);
        long long38 = dataStoreBlobStore26.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str35, (long) (byte) 0);
        long long40 = dataStoreBlobStore18.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str35, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector41 = null;
        dataStoreBlobStore18.setBlobStatsCollector(blobStatsCollector41);
        long long43 = dataStoreBlobStore18.getBlockSizeMin();
        java.io.InputStream inputStream44 = null;
        dataStoreBlobStore18.addMetadataRecord(inputStream44, "markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob48 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore18, "Migration started");
        java.lang.String str49 = blobIdSerializer15.serialize((org.apache.jackrabbit.oak.api.Blob) blobStoreBlob48);
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType50 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.BLOBREFERENCES;
        boolean b51 = blobStoreBlob48.equals((java.lang.Object) sharedStoreRecordType50);
        referencedBlob2.setBlob((org.apache.jackrabbit.oak.api.Blob) blobStoreBlob48);
        org.junit.Assert.assertNotNull(iterator_str11);
        org.junit.Assert.assertNull(dataRecord13);
        org.junit.Assert.assertNull(dataStore23);
        org.junit.Assert.assertNotNull(str_array34);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(long38 == 0L);
        org.junit.Assert.assertTrue(long40 == 0L);
        org.junit.Assert.assertTrue(long43 == 0L);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "Migration started" + "'", str49.equals("Migration started"));
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType50 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.BLOBREFERENCES + "'", sharedStoreRecordType50.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.BLOBREFERENCES));
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test32");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats10 = dataStoreBlobStore3.getCacheStats();
        long long11 = dataStoreBlobStore3.getBlockSizeMin();
        org.junit.Assert.assertNotNull(cacheStats10);
        org.junit.Assert.assertTrue(long11 == 0L);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test33");
        java.io.File file0 = null;
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
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer19 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file14, (int) 'a');
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever20 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore21 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore23 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore21, false);
        dataStoreBlobStore23.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str27 = dataStoreBlobStore23.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor28 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard31 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector32 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever20, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore23, executor28, 0L, "fsBackendPath", whiteboard31);
        dataStoreBlobStore23.setBlockSize((int) (byte) -1);
        java.io.InputStream inputStream35 = null;
        dataStoreBlobStore23.addMetadataRecord(inputStream35, "markedTimestamp");
        java.io.File file39 = null;
        java.io.File file40 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file39);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file40);
        java.io.File file43 = null;
        java.io.File file44 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file43);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file44);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file40, file44, false, false);
        dataStoreBlobStore23.addMetadataRecord(file44, "ReferencedBlob{blob=null, id='BlobStoreStats'}");
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer52 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file44, (int) (byte) 0);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever53 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore54 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore56 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore54, false);
        java.util.concurrent.Executor executor57 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector62 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever53, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore56, executor57, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore63 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore56);
        java.io.File file65 = null;
        java.io.File file66 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file65);
        dataStoreBlobStore63.addMetadataRecord(file66, "BlobStore-MemCache");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file44, file66, true);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file14, file66, true);
        try {
            org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file0, file66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(iterator_str27);
        org.junit.Assert.assertNotNull(file40);
        org.junit.Assert.assertNotNull(file44);
        org.junit.Assert.assertNotNull(file66);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test34");
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
        oakFileDataStore0.deleteAllMetadataRecords("Blob migration:H1NBQUTBUMA1JQ3R1PNU6SBTCN5CLE11");
        java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord21 = oakFileDataStore0.getAllRecords();
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_dataRecord16);
        org.junit.Assert.assertNotNull(iterator_dataRecord21);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test35");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        org.apache.jackrabbit.core.data.DataRecord dataRecord12 = dataStoreBlobStore3.getMetadataRecord("Migration started");
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats13 = dataStoreBlobStore3.getCacheStats();
        javax.management.Attribute attribute14 = null;
        try {
            cacheStats13.setAttribute(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord12);
        org.junit.Assert.assertNotNull(cacheStats13);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test36");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore1 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore1.setStagingSplitPercentage(100);
        int i4 = cachingFileDataStore1.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type5 = cachingFileDataStore1.getType();
        cachingFileDataStore1.setPath("markedTimestamp-,");
        cachingFileDataStore1.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore11 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore1, false);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore13 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore11, false);
        java.util.concurrent.Executor executor14 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard19 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector20 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore13, executor14, "markedTimestamp", (int) '4', (long) '4', "markedTimestamp", whiteboard19);
        org.junit.Assert.assertTrue(i4 == 16384);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type5.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test37");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard9 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, ",", (int) (byte) 10, (long) 10, "", whiteboard9);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord12 = dataStoreBlobStore3.getAllMetadataRecords("markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer13 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore3);
        org.apache.jackrabbit.core.data.DataStore dataStore14 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore16 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore14, false);
        dataStoreBlobStore16.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str20 = dataStoreBlobStore16.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord22 = dataStoreBlobStore16.getMetadataRecord(",");
        dataStoreBlobStore16.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer24 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore16);
        org.apache.jackrabbit.core.data.DataStore dataStore25 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore27 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore25, false);
        dataStoreBlobStore27.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore27.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore32 = dataStoreBlobStore27.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore33 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore35 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore33, false);
        dataStoreBlobStore35.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore35.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array43 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<java.lang.String>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str44, str_array43);
        long long47 = dataStoreBlobStore35.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str44, (long) (byte) 0);
        long long49 = dataStoreBlobStore27.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str44, (long) 1);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector50 = null;
        dataStoreBlobStore27.setBlobStatsCollector(blobStatsCollector50);
        long long52 = dataStoreBlobStore27.getBlockSizeMin();
        java.io.InputStream inputStream53 = null;
        dataStoreBlobStore27.addMetadataRecord(inputStream53, "markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob57 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore27, "Migration started");
        java.lang.String str58 = blobIdSerializer24.serialize((org.apache.jackrabbit.oak.api.Blob) blobStoreBlob57);
        java.lang.String str59 = blobStoreBlob57.getContentIdentity();
        java.lang.String str60 = blobIdSerializer13.serialize((org.apache.jackrabbit.oak.api.Blob) blobStoreBlob57);
        try {
            long long61 = blobStoreBlob57.length();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord12);
        org.junit.Assert.assertNotNull(iterator_str20);
        org.junit.Assert.assertNull(dataRecord22);
        org.junit.Assert.assertNull(dataStore32);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(long47 == 0L);
        org.junit.Assert.assertTrue(long49 == 0L);
        org.junit.Assert.assertTrue(long52 == 0L);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Migration started" + "'", str58.equals("Migration started"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "Migration started" + "'", str59.equals("Migration started"));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "Migration started" + "'", str60.equals("Migration started"));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test38");
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
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever34 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore35 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore37 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore35, false);
        java.util.concurrent.Executor executor38 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector43 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever34, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore37, executor38, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore44 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore37);
        java.io.File file46 = null;
        java.io.File file47 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file46);
        dataStoreBlobStore44.addMetadataRecord(file47, "BlobStore-MemCache");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file25, file47, true);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream52 = null;
        java.util.concurrent.ExecutorService executorService53 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache54 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build((long) 1, file25, cacheloader_str_inputStream52, executorService53);
        fileCache54.close();
        java.io.File file57 = fileCache54.getIfPresent("cacheSizeInMB");
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertNotNull(fileCache54);
        org.junit.Assert.assertNull(file57);
    }
}
