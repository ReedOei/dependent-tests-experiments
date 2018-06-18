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
        try {
            markSweepGarbageCollector18.collectGarbage(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
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
        java.io.File file86 = null;
        java.io.File file87 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file86);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file87);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file13, file87);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertNotNull(file51);
        org.junit.Assert.assertNotNull(file55);
        org.junit.Assert.assertNotNull(file67);
        org.junit.Assert.assertNotNull(file71);
        org.junit.Assert.assertNotNull(file78);
        org.junit.Assert.assertNotNull(file87);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord("cacheSize");
        java.lang.String[] str_array22 = new java.lang.String[] { "cachePath", "ReferencedBlob{blob=null, id='BlobStoreStats'}", "ConsolidatedDataStoreCacheStats", "*ERROR*-cachePath", ",", "BlobStoreStats", "path", "BlobStoreStats", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", "cacheSize", "markedTimestamp", "org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore", "," };
        java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<java.lang.String>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str23, str_array22);
        boolean b26 = dataStoreBlobStore2.deleteChunks((java.util.List<java.lang.String>) arraylist_str23, 16777216L);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier27 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord28 = dataStoreBlobStore2.getRecordForId(dataIdentifier27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        dataStoreBlobStore2.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer10 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2);
        org.apache.jackrabbit.oak.api.Blob blob12 = blobIdSerializer10.deserialize("ConsolidatedDataStoreCacheStats");
        org.apache.jackrabbit.oak.api.Blob blob14 = blobIdSerializer10.deserialize("Migration started");
        org.apache.jackrabbit.oak.api.Blob blob16 = blobIdSerializer10.deserialize("*ERROR*-cachePath:0G2AAFROSC4I6B1US3JSJ8ORELIMI5RQ");
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNotNull(blob12);
        org.junit.Assert.assertNotNull(blob14);
        org.junit.Assert.assertNotNull(blob16);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
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
        java.io.File file27 = null;
        java.io.File file28 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file27);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file28);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file28, file32, false, false);
        java.io.File file38 = null;
        java.io.File file39 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file38);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file39);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file28, file39, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer43 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file39);
        org.apache.jackrabbit.oak.api.Blob blob45 = fSBlobSerializer43.deserialize("markedTimestamp");
        org.apache.jackrabbit.core.data.DataStore dataStore46 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore48 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore46, false);
        dataStoreBlobStore48.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str52 = dataStoreBlobStore48.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord54 = dataStoreBlobStore48.getMetadataRecord(",");
        dataStoreBlobStore48.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer56 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore48);
        org.apache.jackrabbit.oak.api.Blob blob58 = blobIdSerializer56.deserialize("ConsolidatedDataStoreCacheStats");
        java.lang.String str59 = fSBlobSerializer43.serialize(blob58);
        referencedBlob2.setBlob(blob58);
        org.apache.jackrabbit.core.data.DataStore dataStore64 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore66 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore64, false);
        dataStoreBlobStore66.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore66.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord72 = dataStoreBlobStore66.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker73 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore66);
        org.apache.jackrabbit.core.data.DataStore dataStore74 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore76 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore74, false);
        dataStoreBlobStore76.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str80 = dataStoreBlobStore76.resolveChunks("BlobStoreStats");
        long long81 = dataStoreBlobStore76.getBlockSizeMin();
        java.util.Iterator<java.lang.String> iterator_str83 = dataStoreBlobStore76.resolveChunks("fsBackendPath");
        blobIdTracker73.add(iterator_str83);
        boolean b85 = referencedBlob2.equals((java.lang.Object) blobIdTracker73);
        org.apache.jackrabbit.core.data.DataStore dataStore86 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore88 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore86, false);
        dataStoreBlobStore88.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str92 = dataStoreBlobStore88.resolveChunks("BlobStoreStats");
        long long93 = dataStoreBlobStore88.getBlockSizeMin();
        java.util.Iterator<java.lang.String> iterator_str95 = dataStoreBlobStore88.resolveChunks("fsBackendPath");
        blobIdTracker73.remove(iterator_str95);
        org.junit.Assert.assertNull(blob3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ReferencedBlob{blob=null, id='BlobStoreStats'}" + "'", str4.equals("ReferencedBlob{blob=null, id='BlobStoreStats'}"));
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertNotNull(blob24);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertNotNull(blob45);
        org.junit.Assert.assertNotNull(iterator_str52);
        org.junit.Assert.assertNull(dataRecord54);
        org.junit.Assert.assertNotNull(blob58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "*ERROR*-ConsolidatedDataStoreCacheStats" + "'", str59.equals("*ERROR*-ConsolidatedDataStoreCacheStats"));
        org.junit.Assert.assertNull(dataRecord72);
        org.junit.Assert.assertNotNull(iterator_str80);
        org.junit.Assert.assertTrue(long81 == 0L);
        org.junit.Assert.assertNotNull(iterator_str83);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(iterator_str92);
        org.junit.Assert.assertTrue(long93 == 0L);
        org.junit.Assert.assertNotNull(iterator_str95);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        int i1 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setMinRecordLength((int) (byte) 100);
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore4.clearCache();
        java.lang.String str6 = cloudBlobStore4.getAccessKey();
        java.lang.String str7 = cloudBlobStore4.getAccessKey();
        java.lang.String str9 = cloudBlobStore4.getBlobId("Blob garbage collection");
        cloudBlobStore4.setCloudContainer("encodeLengthInId");
        java.io.InputStream inputStream13 = cloudBlobStore4.getInputStream("cachePath");
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions14 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord15 = cachingFileDataStore0.addRecord(inputStream13, blobOptions14);
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertTrue(i1 == 16384);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(inputStream13);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
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
        org.junit.Assert.assertNull(list_dataRecord14);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(long29 == 0L);
        org.junit.Assert.assertTrue(long31 == 0L);
        org.junit.Assert.assertNull(dataRecord33);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore3.getMetadataRecord("markedTimestamp");
        org.junit.Assert.assertNull(dataRecord11);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        org.apache.jackrabbit.oak.api.Blob blob0 = null;
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob2 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob0, "BlobStoreStats");
        org.apache.jackrabbit.oak.api.Blob blob3 = referencedBlob2.getBlob();
        referencedBlob2.setId("");
        org.junit.Assert.assertNull(blob3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
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
        oakFileDataStore0.setReferenceKeyPlainText("BlobStore-MemCache");
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_dataRecord16);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        java.lang.Object obj5 = blobMigration0.getImplementation();
        java.lang.Class<?> cls6 = blobMigration0.getMBeanInterface();
        javax.management.MBeanServer mBeanServer7 = null;
        javax.management.ObjectName objectName8 = null;
        javax.management.ObjectName objectName9 = blobMigration0.preRegister(mBeanServer7, objectName8);
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(cls6);
        org.junit.Assert.assertNull(objectName9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration0.preDeregister();
        java.lang.Class<?> cls2 = blobMigration0.getMBeanInterface();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration3 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo4 = blobMigration3.getMBeanInfo();
        blobMigration3.preDeregister();
        blobMigration3.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array11 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList12 = blobMigration3.getAttributes(str_array11);
        javax.management.AttributeList attributeList13 = blobMigration0.getAttributes(str_array11);
        java.lang.String str15 = blobMigration0.startBlobMigration(true);
        try {
            java.lang.Object obj17 = blobMigration0.getAttribute("BlobStoreStats");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException");
        } catch (javax.management.AttributeNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(cls2);
        org.junit.Assert.assertNotNull(mBeanInfo4);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertNotNull(attributeList12);
        org.junit.Assert.assertNotNull(attributeList13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Migration started" + "'", str15.equals("Migration started"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        cloudBlobStore0.setCloudProvider("cacheSizeInMB");
        try {
            long long7 = cloudBlobStore0.getBlobLength(",");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
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
        org.apache.jackrabbit.core.data.DataStore dataStore31 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore33 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore31, false);
        dataStoreBlobStore33.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str37 = dataStoreBlobStore33.resolveChunks("BlobStoreStats");
        blobIdTracker12.remove(iterator_str37);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever39 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore40 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore42 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore40, false);
        dataStoreBlobStore42.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str46 = dataStoreBlobStore42.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor47 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard50 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector51 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever39, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore42, executor47, 0L, "fsBackendPath", whiteboard50);
        dataStoreBlobStore42.setBlockSize((int) (byte) -1);
        java.util.Iterator<java.lang.String> iterator_str55 = dataStoreBlobStore42.resolveChunks("markedTimestamp-,");
        blobIdTracker12.remove(iterator_str55);
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker.ActiveDeletionTracker activeDeletionTracker57 = blobIdTracker12.getDeleteTracker();
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str20);
        org.junit.Assert.assertNotNull(iterator_str29);
        org.junit.Assert.assertNotNull(iterator_str37);
        org.junit.Assert.assertNotNull(iterator_str46);
        org.junit.Assert.assertNotNull(iterator_str55);
        org.junit.Assert.assertNotNull(activeDeletionTracker57);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        cloudBlobStore0.setSecretKey(",");
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 2097152);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.clearCache();
        java.lang.String str5 = cloudBlobStore0.getSecretKey();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats6 = cloudBlobStore0.getCacheStats();
        javax.management.MBeanInfo mBeanInfo7 = cacheStats6.getMBeanInfo();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cacheStats6);
        org.junit.Assert.assertNotNull(mBeanInfo7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = oakFileDataStore0.getType();
        oakFileDataStore0.setPath("markedTimestamp");
        boolean b5 = oakFileDataStore0.deleteMetadataRecord("fsBackendPath");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier6 = null;
        try {
            oakFileDataStore0.deleteRecord(dataIdentifier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type1.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        java.io.File file1 = null;
        java.io.File file2 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file1);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file2);
        java.io.File file5 = null;
        java.io.File file6 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file5);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file2, file6, false, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer11 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file2);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer13 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file2, (-1));
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord12 = oakFileDataStore0.getAllMetadataRecords("Blob migration");
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(list_dataRecord12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        javax.management.MBeanInfo mBeanInfo2 = blobMigration0.getMBeanInfo();
        javax.management.MBeanServer mBeanServer3 = null;
        javax.management.ObjectName objectName4 = null;
        javax.management.ObjectName objectName5 = blobMigration0.preRegister(mBeanServer3, objectName4);
        java.lang.Class<?> cls6 = blobMigration0.getMBeanInterface();
        blobMigration0.postRegister((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(mBeanInfo2);
        org.junit.Assert.assertNull(objectName5);
        org.junit.Assert.assertNotNull(cls6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
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
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer32 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file24, (int) (byte) 0);
        java.io.File file34 = null;
        java.io.File file35 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file34);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file35);
        java.io.File file38 = null;
        java.io.File file39 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file38);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file39);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file35, file39, false, false);
        java.io.File file45 = null;
        java.io.File file46 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file45);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file46);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file35, file46, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer51 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file46, (int) 'a');
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file24, file46, true);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer55 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file24, (int) (byte) 100);
        org.junit.Assert.assertNotNull(iterator_str7);
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertNotNull(file46);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingRetryInterval(16);
        cachingFileDataStore0.setCacheSize(10L);
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.startMark();
        dataStoreBlobStore2.startMark();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj1 = blobMigration0.getImplementation();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj3 = blobMigration2.getImplementation();
        java.lang.Class<?> cls4 = blobMigration2.getImplementationClass();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration5 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo6 = blobMigration5.getMBeanInfo();
        blobMigration5.preDeregister();
        blobMigration5.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array13 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList14 = blobMigration5.getAttributes(str_array13);
        javax.management.AttributeList attributeList15 = blobMigration2.setAttributes(attributeList14);
        javax.management.AttributeList attributeList16 = blobMigration0.setAttributes(attributeList14);
        javax.management.MBeanServer mBeanServer17 = null;
        javax.management.ObjectName objectName18 = null;
        javax.management.ObjectName objectName19 = blobMigration0.preRegister(mBeanServer17, objectName18);
        java.lang.String str21 = blobMigration0.startBlobMigration(true);
        javax.management.MBeanInfo mBeanInfo22 = blobMigration0.getMBeanInfo();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(cls4);
        org.junit.Assert.assertNotNull(mBeanInfo6);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertNull(objectName19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Migration started" + "'", str21.equals("Migration started"));
        org.junit.Assert.assertNotNull(mBeanInfo22);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
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
            java.lang.String str16 = blobStoreBlob15.getReference();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
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
        fileCache40.close();
        org.apache.jackrabbit.core.data.DataStore dataStore51 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore53 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore51, false);
        dataStoreBlobStore53.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore53.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord59 = dataStoreBlobStore53.getMetadataRecord("cacheSize");
        java.lang.String[] str_array73 = new java.lang.String[] { "cachePath", "ReferencedBlob{blob=null, id='BlobStoreStats'}", "ConsolidatedDataStoreCacheStats", "*ERROR*-cachePath", ",", "BlobStoreStats", "path", "BlobStoreStats", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", "cacheSize", "markedTimestamp", "org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore", "," };
        java.util.ArrayList<java.lang.String> arraylist_str74 = new java.util.ArrayList<java.lang.String>();
        boolean b75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str74, str_array73);
        boolean b77 = dataStoreBlobStore53.deleteChunks((java.util.List<java.lang.String>) arraylist_str74, 16777216L);
        try {
            com.google.common.collect.ImmutableMap<java.lang.String, java.io.File> immutablemap_str_file78 = fileCache40.getAllPresent((java.lang.Iterable<java.lang.String>) arraylist_str74);
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
        org.junit.Assert.assertNotNull(dataRecord_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(dataRecord_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set_str48);
        org.junit.Assert.assertNotNull(immutablemap_str_file49);
        org.junit.Assert.assertNull(dataRecord59);
        org.junit.Assert.assertNotNull(str_array73);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState1 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("markedTimestamp-org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        boolean b14 = oakFileDataStore0.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord16 = oakFileDataStore0.getAllMetadataRecords("Blob garbage collection");
        oakFileDataStore0.setPath("repository-*ERROR*-cachePath");
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type19 = oakFileDataStore0.getType();
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_dataRecord16);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type19.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord(",");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier9 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord10 = dataStoreBlobStore2.getRecordForId(dataIdentifier9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore3.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord9 = dataStoreBlobStore3.getMetadataRecord("cacheSize");
        java.util.concurrent.Executor executor10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector15 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor10, "", (int) (byte) 10, 1L, "Blob migration");
        dataStoreBlobStore3.setBlockSize((int) (short) 10);
        dataStoreBlobStore3.setBlockSize((int) '4');
        org.junit.Assert.assertNull(dataRecord9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array10 = fSBackend9.getOrCreateReferenceKey();
        byte[] byte_array11 = fSBackend9.getOrCreateReferenceKey();
        cloudBlobStore0.setReferenceKey(byte_array11);
        long long13 = cloudBlobStore0.getBlockSizeMin();
        java.lang.String str14 = cloudBlobStore0.getSecretKey();
        java.lang.String str15 = cloudBlobStore0.getAccessKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertTrue(long13 == 4096L);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "," + "'", str14.equals(","));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
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
        java.io.InputStream inputStream21 = null;
        try {
            java.lang.String str22 = dataStoreBlobStore4.writeBlob(inputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(dataStore20);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
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
            java.io.File file18 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("", file14);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend13 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array14 = fSBackend13.getOrCreateReferenceKey();
        byte[] byte_array15 = fSBackend13.getOrCreateReferenceKey();
        oakFileDataStore0.setReferenceKey(byte_array15);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array15);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
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
            long long50 = fileCache40.size();
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        org.apache.jackrabbit.core.data.DataRecord dataRecord14 = oakFileDataStore0.getMetadataRecord("");
        oakFileDataStore0.updateModifiedDateOnAccess((long) 100);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNull(dataRecord14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        dataStoreBlobStore2.deleteAllMetadataRecords("BlobStore-MemCache");
        dataStoreBlobStore2.startMark();
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        long long4 = cloudBlobStore0.getBlobCacheSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(long4 == 16777216L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        java.io.File file0 = null;
        try {
            org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingPurgeInterval(16);
        try {
            cachingFileDataStore0.updateModifiedDateOnAccess((long) 2097152);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type1.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0);
        org.apache.jackrabbit.oak.stats.StatisticsProvider statisticsProvider10 = null;
        cachingFileDataStore0.setStatisticsProvider(statisticsProvider10);
        try {
            java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord13 = cachingFileDataStore0.getAllMetadataRecords("ConsolidatedDataStoreCacheStats");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        long long3 = garbageCollectionRepoStats0.getLength();
        garbageCollectionRepoStats0.setLocal(false);
        garbageCollectionRepoStats0.setLength((long) (short) 100);
        garbageCollectionRepoStats0.setLength((long) (byte) -1);
        garbageCollectionRepoStats0.setStartTime((long) (byte) 0);
        int i12 = garbageCollectionRepoStats0.getNumLines();
        garbageCollectionRepoStats0.setLength((long) (byte) 100);
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
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
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier27 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord28 = dataStoreBlobStore3.getRecordForId(dataIdentifier27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord24);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector11 = null;
        dataStoreBlobStore10.setBlobStatsCollector(blobStatsCollector11);
        boolean b13 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.isShared((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore10);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
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
        fileCache40.close();
        fileCache40.close();
        boolean b53 = fileCache40.containsKey("markedTimestamp-markedTimestamp-,");
        try {
            long long54 = fileCache40.size();
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
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        cloudBlobStore0.setAccessKey("ConsolidatedDataStoreCacheStats");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
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
        java.util.Iterator<java.lang.String> iterator_str18 = dataStoreBlobStore3.resolveChunks("");
        org.junit.Assert.assertNotNull(iterator_str7);
        org.junit.Assert.assertNotNull(iterator_str18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        blobIdTracker12.close();
        blobIdTracker12.close();
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever15 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore16 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore18 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore16, false);
        dataStoreBlobStore18.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str22 = dataStoreBlobStore18.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor23 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard26 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector27 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever15, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore18, executor23, 0L, "fsBackendPath", whiteboard26);
        dataStoreBlobStore18.setBlockSize((int) (byte) -1);
        java.util.Iterator<java.lang.String> iterator_str31 = dataStoreBlobStore18.resolveChunks("markedTimestamp-,");
        blobIdTracker12.remove(iterator_str31);
        org.apache.jackrabbit.core.data.DataStore dataStore36 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore38 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore36, false);
        dataStoreBlobStore38.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore38.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord44 = dataStoreBlobStore38.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker45 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore38);
        blobIdTracker45.close();
        blobIdTracker45.close();
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever48 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore49 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore51 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore49, false);
        dataStoreBlobStore51.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str55 = dataStoreBlobStore51.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor56 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard59 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector60 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever48, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore51, executor56, 0L, "fsBackendPath", whiteboard59);
        dataStoreBlobStore51.setBlockSize((int) (byte) -1);
        java.util.Iterator<java.lang.String> iterator_str64 = dataStoreBlobStore51.resolveChunks("markedTimestamp-,");
        blobIdTracker45.remove(iterator_str64);
        blobIdTracker12.remove(iterator_str64);
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str22);
        org.junit.Assert.assertNotNull(iterator_str31);
        org.junit.Assert.assertNull(dataRecord44);
        org.junit.Assert.assertNotNull(iterator_str55);
        org.junit.Assert.assertNotNull(iterator_str64);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        java.lang.String str5 = cloudBlobStore0.getBlobId("Blob garbage collection");
        cloudBlobStore0.setCloudContainer("encodeLengthInId");
        cloudBlobStore0.setReferenceKeyPlainText("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        try {
            java.util.Iterator<java.lang.String> iterator_str11 = cloudBlobStore0.resolveChunks("fsBackendPath");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
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
        org.apache.jackrabbit.core.data.DataStore dataStore19 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore21 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore19, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord23 = dataStoreBlobStore21.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore24 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long25 = cloudBlobStore24.getBlockSizeMin();
        int i26 = cloudBlobStore24.getBlockSize();
        java.lang.String str27 = cloudBlobStore24.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer28 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore24);
        java.io.InputStream inputStream30 = cloudBlobStore24.getInputStream("Blob consistency check");
        dataStoreBlobStore21.addMetadataRecord(inputStream30, "markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions33 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord34 = dataStoreBlobStore2.addRecord(inputStream30, blobOptions33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
        org.junit.Assert.assertNull(list_dataRecord23);
        org.junit.Assert.assertTrue(long25 == 4096L);
        org.junit.Assert.assertTrue(i26 == 2097152);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(inputStream30);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType0 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER;
        java.lang.String str1 = sharedStoreRecordType0.getType();
        java.lang.String str3 = sharedStoreRecordType0.getNameFromId(",");
        java.lang.String str5 = sharedStoreRecordType0.getIdFromName("BlobStore-MemCache");
        java.lang.String str7 = sharedStoreRecordType0.getNameFromId("*ERROR*-cachePath:0G2AAFROSC4I6B1US3JSJ8ORELIMI5RQ");
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType0 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER + "'", sharedStoreRecordType0.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "markedTimestamp" + "'", str1.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "markedTimestamp-," + "'", str3.equals("markedTimestamp-,"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MemCache" + "'", str5.equals("MemCache"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "markedTimestamp-*ERROR*-cachePath:0G2AAFROSC4I6B1US3JSJ8ORELIMI5RQ" + "'", str7.equals("markedTimestamp-*ERROR*-cachePath:0G2AAFROSC4I6B1US3JSJ8ORELIMI5RQ"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
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
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker.ActiveDeletionTracker activeDeletionTracker31 = blobIdTracker12.getDeleteTracker();
        java.io.File file33 = null;
        java.io.File file34 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file33);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file34);
        java.io.File file37 = null;
        java.io.File file38 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file37);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file38);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file34, file38, false, false);
        java.io.File file44 = null;
        java.io.File file45 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file44);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file45);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file34, file45, false);
        try {
            activeDeletionTracker31.reconcile(file45);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str20);
        org.junit.Assert.assertNotNull(iterator_str29);
        org.junit.Assert.assertNotNull(activeDeletionTracker31);
        org.junit.Assert.assertNotNull(file34);
        org.junit.Assert.assertNotNull(file38);
        org.junit.Assert.assertNotNull(file45);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        try {
            long long16 = dataStoreBlobStore2.getBlobLength("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
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
        fileCache40.close();
        fileCache40.close();
        org.apache.jackrabbit.core.data.DataStore dataStore55 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore57 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore55, false);
        dataStoreBlobStore57.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore57.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord63 = dataStoreBlobStore57.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker64 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore57);
        blobIdTracker64.close();
        blobIdTracker64.close();
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever67 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore68 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore70 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore68, false);
        dataStoreBlobStore70.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str74 = dataStoreBlobStore70.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor75 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard78 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector79 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever67, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore70, executor75, 0L, "fsBackendPath", whiteboard78);
        dataStoreBlobStore70.setBlockSize((int) (byte) -1);
        java.util.Iterator<java.lang.String> iterator_str83 = dataStoreBlobStore70.resolveChunks("markedTimestamp-,");
        blobIdTracker64.remove(iterator_str83);
        fileCache40.invalidate((java.lang.Object) iterator_str83);
        try {
            java.util.concurrent.ConcurrentMap<java.lang.String, java.io.File> concurrentmap_str_file86 = fileCache40.asMap();
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
        org.junit.Assert.assertNull(dataRecord63);
        org.junit.Assert.assertNotNull(iterator_str74);
        org.junit.Assert.assertNotNull(iterator_str83);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setReferenceKeyPlainText("path");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever6 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever7 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore8 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore8, false);
        java.util.concurrent.Executor executor11 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard16 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector17 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever7, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore10, executor11, ",", (int) (byte) 10, (long) 10, "", whiteboard16);
        java.util.concurrent.Executor executor18 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard21 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector22 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever6, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore10, executor18, 4096L, "Blob migration", whiteboard21);
        java.io.File file24 = null;
        java.io.File file25 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file24);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file25);
        java.io.File file28 = null;
        java.io.File file29 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file28);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file29);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file25, file29, false, false);
        dataStoreBlobStore10.addMetadataRecord(file29, "fsBackendPath");
        try {
            oakFileDataStore0.addMetadataRecord(file29, "markedTimestamp-/tmp");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file29);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        javax.management.MBeanServer mBeanServer5 = null;
        javax.management.ObjectName objectName6 = null;
        javax.management.ObjectName objectName7 = blobMigration0.preRegister(mBeanServer5, objectName6);
        java.lang.Class<?> cls8 = blobMigration0.getImplementationClass();
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNull(objectName7);
        org.junit.Assert.assertNotNull(cls8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        garbageCollectionRepoStats0.setNumLines((int) '4');
        long long5 = garbageCollectionRepoStats0.getEndTime();
        garbageCollectionRepoStats0.setLocal(true);
        org.junit.Assert.assertTrue(long5 == 0L);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        org.apache.jackrabbit.oak.spi.blob.split.SplitBlobStore splitBlobStore0 = null;
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator blobMigrator2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator(splitBlobStore0, nodeStore1);
        blobMigrator2.stop();
        blobMigrator2.stop();
        java.lang.String str5 = blobMigrator2.getLastProcessedPath();
        java.lang.String str6 = blobMigrator2.getLastProcessedPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        java.io.File file14 = null;
        java.io.File file15 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file14);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file15);
        java.io.File file18 = null;
        java.io.File file19 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file18);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file19);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file15, file19, false, false);
        java.io.File file24 = null;
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file19, file24);
        dataStoreBlobStore3.addMetadataRecord(file19, "Blob garbage collection");
        org.junit.Assert.assertNotNull(iterator_str7);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNotNull(file19);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
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
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob46 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob((org.apache.jackrabbit.oak.api.Blob) blobStoreBlob43, "encodeLengthInId");
        java.lang.String str47 = blobStoreBlob43.toString();
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNull(dataStore18);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(long33 == 0L);
        org.junit.Assert.assertTrue(long35 == 0L);
        org.junit.Assert.assertTrue(long38 == 0L);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Migration started" + "'", str44.equals("Migration started"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Migration started" + "'", str47.equals("Migration started"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array10 = fSBackend9.getOrCreateReferenceKey();
        byte[] byte_array11 = fSBackend9.getOrCreateReferenceKey();
        cloudBlobStore0.setReferenceKey(byte_array11);
        java.lang.String str13 = cloudBlobStore0.getCloudProvider();
        byte[] byte_array16 = new byte[] { (byte) 1, (byte) 10 };
        cloudBlobStore0.setReferenceKey(byte_array16);
        java.lang.String str18 = cloudBlobStore0.getSecretKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(byte_array16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "," + "'", str18.equals(","));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
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
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker.Options options49 = null;
        try {
            blobIdTracker12.remove(file43, options49);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str20);
        org.junit.Assert.assertNotNull(iterator_str29);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertNotNull(file43);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array3 = fSBackend0.getOrCreateReferenceKey();
        fSBackend0.close();
        java.util.Properties properties5 = null;
        fSBackend0.setProperties(properties5);
        java.util.Properties properties7 = null;
        fSBackend0.setProperties(properties7);
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier9 = fSBackend0.getAllIdentifiers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
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
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever50 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore51 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore53 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore51, false);
        java.util.concurrent.Executor executor54 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector59 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever50, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore53, executor54, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore60 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore53);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector61 = null;
        dataStoreBlobStore60.setBlobStatsCollector(blobStatsCollector61);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord64 = dataStoreBlobStore60.getAllMetadataRecords("path");
        org.apache.jackrabbit.core.data.DataStore dataStore65 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore67 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore65, false);
        dataStoreBlobStore67.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore67.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array75 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str76 = new java.util.ArrayList<java.lang.String>();
        boolean b77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str76, str_array75);
        long long79 = dataStoreBlobStore67.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str76, (long) (byte) 0);
        long long81 = dataStoreBlobStore60.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str76, (long) 2097152);
        try {
            com.google.common.collect.ImmutableMap<java.lang.String, java.io.File> immutablemap_str_file82 = fileCache40.getAllPresent((java.lang.Iterable<java.lang.String>) arraylist_str76);
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
        org.junit.Assert.assertNotNull(dataRecord_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(dataRecord_array45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set_str48);
        org.junit.Assert.assertNotNull(immutablemap_str_file49);
        org.junit.Assert.assertNull(list_dataRecord64);
        org.junit.Assert.assertNotNull(str_array75);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(long79 == 0L);
        org.junit.Assert.assertTrue(long81 == 0L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
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
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer32 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file24, (int) (byte) 0);
        org.apache.jackrabbit.oak.api.Blob blob34 = fSBlobSerializer32.deserialize("markedTimestamp-markedTimestamp-,");
        org.junit.Assert.assertNotNull(iterator_str7);
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertNotNull(blob34);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        oakFileDataStore0.init("path");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend7 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array8 = fSBackend7.getOrCreateReferenceKey();
        byte[] byte_array9 = fSBackend7.getOrCreateReferenceKey();
        byte[] byte_array10 = fSBackend7.getOrCreateReferenceKey();
        oakFileDataStore0.setReferenceKey(byte_array10);
        oakFileDataStore0.setMinRecordLength(0);
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        org.apache.jackrabbit.oak.spi.blob.BlobStore blobStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob2 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob(blobStore0, "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        try {
            java.lang.String str3 = blobStoreBlob2.getReference();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        try {
            long long10 = cloudBlobStore0.getBlobLength(",");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator_str8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads(100);
        try {
            int i10 = cachingFileDataStore0.deleteAllOlderThan((long) 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
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
        org.apache.jackrabbit.oak.api.Blob blob19 = fSBlobSerializer17.deserialize("markedTimestamp");
        org.apache.jackrabbit.core.data.DataStore dataStore20 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore22 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore20, false);
        dataStoreBlobStore22.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str26 = dataStoreBlobStore22.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord28 = dataStoreBlobStore22.getMetadataRecord(",");
        dataStoreBlobStore22.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer30 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore22);
        org.apache.jackrabbit.oak.api.Blob blob32 = blobIdSerializer30.deserialize("ConsolidatedDataStoreCacheStats");
        java.lang.String str33 = fSBlobSerializer17.serialize(blob32);
        java.io.File file35 = null;
        java.io.File file36 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file35);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file36);
        java.io.File file39 = null;
        java.io.File file40 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file39);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file40);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file36, file40, false, false);
        java.io.File file46 = null;
        java.io.File file47 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file46);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file47);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file36, file47, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer51 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file47);
        org.apache.jackrabbit.oak.api.Blob blob53 = fSBlobSerializer51.deserialize("markedTimestamp");
        org.apache.jackrabbit.oak.api.Blob blob55 = fSBlobSerializer51.deserialize("ReferencedBlob{blob=null, id='BlobStoreStats'}");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever56 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore57 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore59 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore57, false);
        java.util.concurrent.Executor executor60 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard65 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector66 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever56, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore59, executor60, ",", (int) (byte) 10, (long) 10, "", whiteboard65);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord68 = dataStoreBlobStore59.getAllMetadataRecords("markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer69 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore59);
        org.apache.jackrabbit.oak.api.Blob blob71 = blobIdSerializer69.deserialize("cachePath");
        java.lang.String str72 = fSBlobSerializer51.serialize(blob71);
        java.lang.String str73 = fSBlobSerializer17.serialize(blob71);
        fSBlobSerializer17.close();
        fSBlobSerializer17.close();
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNotNull(blob19);
        org.junit.Assert.assertNotNull(iterator_str26);
        org.junit.Assert.assertNull(dataRecord28);
        org.junit.Assert.assertNotNull(blob32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "*ERROR*-ConsolidatedDataStoreCacheStats" + "'", str33.equals("*ERROR*-ConsolidatedDataStoreCacheStats"));
        org.junit.Assert.assertNotNull(file36);
        org.junit.Assert.assertNotNull(file40);
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertNotNull(blob53);
        org.junit.Assert.assertNotNull(blob55);
        org.junit.Assert.assertNull(list_dataRecord68);
        org.junit.Assert.assertNotNull(blob71);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "*ERROR*-cachePath" + "'", str72.equals("*ERROR*-cachePath"));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "*ERROR*-cachePath" + "'", str73.equals("*ERROR*-cachePath"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array3 = fSBackend0.getOrCreateReferenceKey();
        fSBackend0.close();
        java.util.Properties properties5 = null;
        fSBackend0.setProperties(properties5);
        java.util.Properties properties7 = null;
        fSBackend0.setProperties(properties7);
        java.util.Properties properties9 = null;
        fSBackend0.setProperties(properties9);
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore7 = dataStoreBlobStore2.getDataStore();
        try {
            dataStoreBlobStore2.init("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(dataStore7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
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
        try {
            java.lang.String str33 = dataStoreBlobStore10.getBlobId("Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord14);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(long29 == 0L);
        org.junit.Assert.assertTrue(long31 == 0L);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        long long2 = cloudBlobStore0.getBlockSizeMin();
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array6 = fSBackend5.getOrCreateReferenceKey();
        byte[] byte_array7 = fSBackend5.getOrCreateReferenceKey();
        try {
            int i10 = cloudBlobStore0.readBlob("markedTimestamp-,", (long) (byte) 10, byte_array7, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(long2 == 4096L);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
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
        org.apache.jackrabbit.core.data.DataStore dataStore31 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore33 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore31, false);
        dataStoreBlobStore33.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str37 = dataStoreBlobStore33.resolveChunks("BlobStoreStats");
        blobIdTracker12.remove(iterator_str37);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever39 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore40 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore42 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore40, false);
        dataStoreBlobStore42.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str46 = dataStoreBlobStore42.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor47 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard50 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector51 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever39, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore42, executor47, 0L, "fsBackendPath", whiteboard50);
        dataStoreBlobStore42.setBlockSize((int) (byte) -1);
        java.util.Iterator<java.lang.String> iterator_str55 = dataStoreBlobStore42.resolveChunks("markedTimestamp-,");
        blobIdTracker12.remove(iterator_str55);
        java.io.File file58 = null;
        java.io.File file59 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file58);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file59);
        java.io.File file62 = null;
        java.io.File file63 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file62);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file63);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file59, file63, false, false);
        java.io.File file69 = null;
        java.io.File file70 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file69);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file70);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file59, file70, false);
        try {
            blobIdTracker12.remove(file59);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str20);
        org.junit.Assert.assertNotNull(iterator_str29);
        org.junit.Assert.assertNotNull(iterator_str37);
        org.junit.Assert.assertNotNull(iterator_str46);
        org.junit.Assert.assertNotNull(iterator_str55);
        org.junit.Assert.assertNotNull(file59);
        org.junit.Assert.assertNotNull(file63);
        org.junit.Assert.assertNotNull(file70);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.updateModifiedDateOnAccess((long) ' ');
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        java.io.File file1 = null;
        java.io.File file2 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file1);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file2);
        java.io.File file5 = null;
        java.io.File file6 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file5);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file2, file6, false, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer11 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file2);
        fSBlobSerializer11.close();
        org.apache.jackrabbit.oak.api.Blob blob14 = fSBlobSerializer11.deserialize("*ERROR*-cachePath:0G2AAFROSC4I6B1US3JSJ8ORELIMI5RQ");
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNotNull(blob14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        garbageCollectionRepoStats0.setNumLines((int) '4');
        garbageCollectionRepoStats0.setStartTime((-1L));
        garbageCollectionRepoStats0.setEndTime(0L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingRetryInterval(16);
        try {
            cachingFileDataStore0.updateModifiedDateOnAccess(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        dataStoreBlobStore5.clearCache();
        try {
            java.lang.String str15 = dataStoreBlobStore5.writeBlob("encodeLengthInId");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord("cacheSize");
        java.lang.String[] str_array22 = new java.lang.String[] { "cachePath", "ReferencedBlob{blob=null, id='BlobStoreStats'}", "ConsolidatedDataStoreCacheStats", "*ERROR*-cachePath", ",", "BlobStoreStats", "path", "BlobStoreStats", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", "cacheSize", "markedTimestamp", "org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore", "," };
        java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<java.lang.String>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str23, str_array22);
        boolean b26 = dataStoreBlobStore2.deleteChunks((java.util.List<java.lang.String>) arraylist_str23, 16777216L);
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend29 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array30 = fSBackend29.getOrCreateReferenceKey();
        byte[] byte_array31 = fSBackend29.getOrCreateReferenceKey();
        try {
            int i34 = dataStoreBlobStore2.readBlob("Blob consistency check", (long) (byte) -1, byte_array31, 16, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(byte_array30);
        org.junit.Assert.assertNotNull(byte_array31);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.startMark();
        java.lang.String str6 = cloudBlobStore0.getBlobId("*ERROR*-ConsolidatedDataStoreCacheStats");
        java.lang.String str8 = cloudBlobStore0.getBlobId("Migration started");
        org.apache.jackrabbit.core.data.DataStore dataStore9 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore11 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore9, false);
        dataStoreBlobStore11.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore11.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array19 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str20 = new java.util.ArrayList<java.lang.String>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str20, str_array19);
        long long23 = dataStoreBlobStore11.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str20, (long) (byte) 0);
        try {
            boolean b25 = cloudBlobStore0.deleteChunks((java.util.List<java.lang.String>) arraylist_str20, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(str_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(long23 == 0L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
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
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore15 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i11 == 16384);
        org.junit.Assert.assertNotNull(abstractSharedCachingDataStore15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType0 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.REPOSITORY;
        java.lang.String str2 = sharedStoreRecordType0.getNameFromId("*ERROR*-cachePath");
        java.lang.String str4 = sharedStoreRecordType0.getNameFromId("Migration started");
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType0 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.REPOSITORY + "'", sharedStoreRecordType0.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.REPOSITORY));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "repository-*ERROR*-cachePath" + "'", str2.equals("repository-*ERROR*-cachePath"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "repository-Migration started" + "'", str4.equals("repository-Migration started"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array10 = fSBackend9.getOrCreateReferenceKey();
        byte[] byte_array11 = fSBackend9.getOrCreateReferenceKey();
        cloudBlobStore0.setReferenceKey(byte_array11);
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob14 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore0, "hi!");
        cloudBlobStore0.startMark();
        try {
            long long17 = cloudBlobStore0.getBlobLength("DataStore backed BlobStore [org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        fSBackend0.close();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore1 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str3 = cloudBlobStore1.getBlobId("markedTimestamp");
        java.lang.String str4 = cloudBlobStore1.getSecretKey();
        cloudBlobStore1.setSecretKey(",");
        cloudBlobStore1.clearCache();
        java.util.Iterator<java.lang.String> iterator_str9 = cloudBlobStore1.resolveChunks("");
        java.lang.String str11 = cloudBlobStore1.getReference("*ERROR*-cachePath");
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector12 = org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector.NOOP;
        cloudBlobStore1.setStatsCollector(blobStatsCollector12);
        cloudBlobStore1.clearInUse();
        java.util.concurrent.Executor executor15 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard18 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector19 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) cloudBlobStore1, executor15, (long) (byte) 100, "/tmp", whiteboard18);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(iterator_str9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "*ERROR*-cachePath:R16CDRDVI7KQ8P5UBQ7QHRJE4VL661RK" + "'", str11.equals("*ERROR*-cachePath:R16CDRDVI7KQ8P5UBQ7QHRJE4VL661RK"));
        org.junit.Assert.assertNotNull(blobStatsCollector12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        long long3 = garbageCollectionRepoStats0.getLength();
        garbageCollectionRepoStats0.setLocal(false);
        garbageCollectionRepoStats0.setLength((long) (short) 100);
        garbageCollectionRepoStats0.setLength((long) (byte) -1);
        boolean b10 = garbageCollectionRepoStats0.isLocal();
        long long11 = garbageCollectionRepoStats0.getEndTime();
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(long11 == 0L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
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
        fileCache40.close();
        fileCache40.close();
        org.apache.jackrabbit.core.data.DataStore dataStore55 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore57 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore55, false);
        dataStoreBlobStore57.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore57.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord63 = dataStoreBlobStore57.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker64 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore57);
        blobIdTracker64.close();
        blobIdTracker64.close();
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever67 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore68 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore70 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore68, false);
        dataStoreBlobStore70.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str74 = dataStoreBlobStore70.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor75 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard78 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector79 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever67, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore70, executor75, 0L, "fsBackendPath", whiteboard78);
        dataStoreBlobStore70.setBlockSize((int) (byte) -1);
        java.util.Iterator<java.lang.String> iterator_str83 = dataStoreBlobStore70.resolveChunks("markedTimestamp-,");
        blobIdTracker64.remove(iterator_str83);
        fileCache40.invalidate((java.lang.Object) iterator_str83);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheStatsMBean dataStoreCacheStatsMBean86 = fileCache40.getStats();
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
        org.junit.Assert.assertNull(dataRecord63);
        org.junit.Assert.assertNotNull(iterator_str74);
        org.junit.Assert.assertNotNull(iterator_str83);
        org.junit.Assert.assertNotNull(dataStoreCacheStatsMBean86);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.clearCache();
        java.lang.String str5 = cloudBlobStore0.getSecretKey();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats6 = cloudBlobStore0.getCacheStats();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats7 = cloudBlobStore0.getCacheStats();
        cloudBlobStore0.setSecretKey("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        try {
            java.lang.String str11 = cloudBlobStore0.writeBlob("markedTimestamp-/tmp");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cacheStats6);
        org.junit.Assert.assertNotNull(cacheStats7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
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
            org.apache.jackrabbit.core.data.DataRecord dataRecord17 = dataStoreBlobStore3.getRecordIfStored(dataIdentifier16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
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
        org.apache.jackrabbit.core.data.DataStore dataStore31 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore33 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore31, false);
        dataStoreBlobStore33.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str37 = dataStoreBlobStore33.resolveChunks("BlobStoreStats");
        blobIdTracker12.remove(iterator_str37);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever39 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore40 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore42 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore40, false);
        dataStoreBlobStore42.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str46 = dataStoreBlobStore42.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor47 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard50 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector51 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever39, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore42, executor47, 0L, "fsBackendPath", whiteboard50);
        dataStoreBlobStore42.setBlockSize((int) (byte) -1);
        java.util.Iterator<java.lang.String> iterator_str55 = dataStoreBlobStore42.resolveChunks("markedTimestamp-,");
        blobIdTracker12.remove(iterator_str55);
        java.io.File file58 = null;
        java.io.File file59 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file58);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file59);
        java.io.File file62 = null;
        java.io.File file63 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file62);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file63);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file59, file63, false, false);
        java.io.File file68 = null;
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file63, file68);
        try {
            blobIdTracker12.add(file68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str20);
        org.junit.Assert.assertNotNull(iterator_str29);
        org.junit.Assert.assertNotNull(iterator_str37);
        org.junit.Assert.assertNotNull(iterator_str46);
        org.junit.Assert.assertNotNull(iterator_str55);
        org.junit.Assert.assertNotNull(file59);
        org.junit.Assert.assertNotNull(file63);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
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
            oakFileDataStore0.addMetadataRecord(file27, "cacheSize");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str10);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertNotNull(file27);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
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
        try {
            java.lang.String str28 = dataStoreBlobStore2.toString();
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        dataStoreBlobStore3.setMaxCachedBinarySize(100);
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats12 = dataStoreBlobStore3.getCacheStats();
        org.junit.Assert.assertNotNull(cacheStats12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj1 = blobMigration0.getImplementation();
        java.lang.Class<?> cls2 = blobMigration0.getImplementationClass();
        java.lang.Class<?> cls3 = blobMigration0.getImplementationClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(cls2);
        org.junit.Assert.assertNotNull(cls3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setCacheSize((long) 'a');
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type6 = cachingFileDataStore0.getType();
        java.util.Properties properties7 = null;
        cachingFileDataStore0.setProperties(properties7);
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type6.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
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
        try {
            long long19 = markSweepGarbageCollector18.checkConsistency();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        java.lang.String str3 = cloudBlobStore0.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer4 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore0);
        cloudBlobStore0.setCloudContainer("*ERROR*-ConsolidatedDataStoreCacheStats");
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 2097152);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = dataStoreBlobStore2.getMetadataRecord("cacheSize");
        java.lang.String[] str_array22 = new java.lang.String[] { "cachePath", "ReferencedBlob{blob=null, id='BlobStoreStats'}", "ConsolidatedDataStoreCacheStats", "*ERROR*-cachePath", ",", "BlobStoreStats", "path", "BlobStoreStats", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", "cacheSize", "markedTimestamp", "org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore", "," };
        java.util.ArrayList<java.lang.String> arraylist_str23 = new java.util.ArrayList<java.lang.String>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str23, str_array22);
        boolean b26 = dataStoreBlobStore2.deleteChunks((java.util.List<java.lang.String>) arraylist_str23, 16777216L);
        int i27 = dataStoreBlobStore2.sweep();
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord28 = dataStoreBlobStore2.getAllRecords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
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
        java.io.File file44 = null;
        java.io.File file45 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file44);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file45);
        java.io.File file48 = null;
        java.io.File file49 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file48);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file49);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file45, file49, false, false);
        java.io.File file55 = null;
        java.io.File file56 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file55);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file56);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file45, file56, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file56);
        java.io.File file62 = null;
        java.io.File file63 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file62);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file63);
        java.io.File file66 = null;
        java.io.File file67 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file66);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file67);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file63, file67, false, false);
        java.io.File file73 = null;
        java.io.File file74 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file73);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file74);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file63, file74, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file56, file74, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream80 = null;
        java.util.concurrent.ExecutorService executorService81 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache82 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(4096L, file56, cacheloader_str_inputStream80, executorService81);
        fileCache82.close();
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array84 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord85 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b86 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord85, dataRecord_array84);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array87 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord88 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b89 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord88, dataRecord_array87);
        java.util.Set<java.lang.String> set_str90 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord85, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord88);
        com.google.common.collect.ImmutableMap<java.lang.String, java.io.File> immutablemap_str_file91 = fileCache82.getAllPresent((java.lang.Iterable<java.lang.String>) set_str90);
        fileCache40.putAll((java.util.Map<java.lang.String, java.io.File>) immutablemap_str_file91);
        boolean b94 = fileCache40.containsKey("MemCache");
        try {
            com.google.common.cache.CacheStats cacheStats95 = fileCache40.stats();
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
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertNotNull(file49);
        org.junit.Assert.assertNotNull(file56);
        org.junit.Assert.assertNotNull(file63);
        org.junit.Assert.assertNotNull(file67);
        org.junit.Assert.assertNotNull(file74);
        org.junit.Assert.assertNotNull(fileCache82);
        org.junit.Assert.assertNotNull(dataRecord_array84);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(dataRecord_array87);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(set_str90);
        org.junit.Assert.assertNotNull(immutablemap_str_file91);
        org.junit.Assert.assertTrue(b94 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
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
        boolean b20 = dataStoreBlobStore2.deleteMetadataRecord("");
        dataStoreBlobStore2.setMaxCachedBinarySize(1024);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        dataStoreBlobStore4.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore4.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str13 = new java.util.ArrayList<java.lang.String>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str13, str_array12);
        long long16 = dataStoreBlobStore4.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str13, (long) (byte) 0);
        org.apache.jackrabbit.core.data.DataStore dataStore17 = dataStoreBlobStore4.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore18 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore20 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore18, false);
        dataStoreBlobStore20.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore20.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array28 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str29 = new java.util.ArrayList<java.lang.String>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str29, str_array28);
        long long32 = dataStoreBlobStore20.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str29, (long) (byte) 0);
        boolean b34 = dataStoreBlobStore4.deleteChunks((java.util.List<java.lang.String>) arraylist_str29, (long) ' ');
        java.lang.String[] str_array45 = new java.lang.String[] { "/tmp", "markedTimestamp-,", "BlobStoreStats", "", "markedTimestamp", "BlobStore-MemCache", "Blob migration", "markedTimestamp", "BlobStoreStats", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore" };
        java.util.ArrayList<java.lang.String> arraylist_str46 = new java.util.ArrayList<java.lang.String>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str46, str_array45);
        long long49 = dataStoreBlobStore4.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str46, 1L);
        java.util.concurrent.Executor executor50 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector55 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor50, "cachePath", 10, (long) (short) -1, "markedTimestamp-/tmp");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker56 = null;
        dataStoreBlobStore4.addTracker(blobTracker56);
        java.util.concurrent.Executor executor58 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard63 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector64 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor58, "markedTimestamp-/tmp", (int) (byte) 0, (long) '4', "", whiteboard63);
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type65 = dataStoreBlobStore4.getType();
        org.junit.Assert.assertNotNull(str_array12);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(long16 == 0L);
        org.junit.Assert.assertNull(dataStore17);
        org.junit.Assert.assertNotNull(str_array28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(long32 == 0L);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(str_array45);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(long49 == 0L);
        org.junit.Assert.assertTrue("'" + type65 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.DEFAULT + "'", type65.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.DEFAULT));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
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
        java.io.File file13 = null;
        java.io.File file14 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file13);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file14);
        java.io.File file17 = null;
        java.io.File file18 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file17);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file18);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file14, file18, false, false);
        java.io.File file24 = null;
        java.io.File file25 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file24);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file25);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file14, file25, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer30 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file25, (int) 'a');
        org.apache.jackrabbit.oak.api.Blob blob32 = fSBlobSerializer30.deserialize("path");
        referencedBlob2.setBlob(blob32);
        org.junit.Assert.assertNull(blob3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ReferencedBlob{blob=null, id='BlobStoreStats'}" + "'", str4.equals("ReferencedBlob{blob=null, id='BlobStoreStats'}"));
        org.junit.Assert.assertTrue(long10 == 0L);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(blob32);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
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
        java.lang.String str46 = blobStoreBlob43.getBlobId();
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str14, str_array13);
        long long17 = dataStoreBlobStore5.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str14, (long) (byte) 0);
        try {
            boolean b19 = cloudBlobStore0.deleteChunks((java.util.List<java.lang.String>) arraylist_str14, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(long17 == 0L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array10 = fSBackend9.getOrCreateReferenceKey();
        byte[] byte_array11 = fSBackend9.getOrCreateReferenceKey();
        cloudBlobStore0.setReferenceKey(byte_array11);
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob14 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore0, "hi!");
        cloudBlobStore0.startMark();
        org.apache.jackrabbit.core.data.DataStore dataStore16 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore18 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore16, false);
        dataStoreBlobStore18.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore18.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array26 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str27, str_array26);
        long long30 = dataStoreBlobStore18.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str27, (long) (byte) 0);
        org.apache.jackrabbit.core.data.DataStore dataStore31 = dataStoreBlobStore18.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore32 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore34 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore32, false);
        dataStoreBlobStore34.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore34.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array42 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str43 = new java.util.ArrayList<java.lang.String>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str43, str_array42);
        long long46 = dataStoreBlobStore34.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str43, (long) (byte) 0);
        boolean b48 = dataStoreBlobStore18.deleteChunks((java.util.List<java.lang.String>) arraylist_str43, (long) ' ');
        try {
            long long50 = cloudBlobStore0.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str43, (long) 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(long30 == 0L);
        org.junit.Assert.assertNull(dataStore31);
        org.junit.Assert.assertNotNull(str_array42);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(long46 == 0L);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        org.apache.jackrabbit.oak.spi.blob.split.SplitBlobStore splitBlobStore0 = null;
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator blobMigrator2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator(splitBlobStore0, nodeStore1);
        blobMigrator2.stop();
        try {
            boolean b4 = blobMigrator2.migrate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
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
            dataStoreBlobStore10.clearInUse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(file13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration0.preDeregister();
        java.lang.String str3 = blobMigration0.startBlobMigration(false);
        java.lang.Class<?> cls4 = blobMigration0.getImplementationClass();
        javax.management.MBeanServer mBeanServer5 = null;
        javax.management.ObjectName objectName6 = null;
        javax.management.ObjectName objectName7 = blobMigration0.preRegister(mBeanServer5, objectName6);
        try {
            java.lang.Object obj9 = blobMigration0.getAttribute("Blob migration:5BLDB1SVB7VKPR3D9TL90A4EEHT79NKP");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException");
        } catch (javax.management.AttributeNotFoundException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Migration started" + "'", str3.equals("Migration started"));
        org.junit.Assert.assertNotNull(cls4);
        org.junit.Assert.assertNull(objectName7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore1 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        consolidatedDataStoreCacheStats0.cachingDataStore = cachingFileDataStore2;
        cachingFileDataStore2.setStagingPurgeInterval((int) (byte) 10);
        org.apache.jackrabbit.oak.stats.StatisticsProvider statisticsProvider6 = null;
        cachingFileDataStore2.setStatisticsProvider(statisticsProvider6);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier8 = null;
        boolean b9 = cachingFileDataStore2.exists(dataIdentifier8);
        org.junit.Assert.assertNull(abstractSharedCachingDataStore1);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array10 = fSBackend9.getOrCreateReferenceKey();
        byte[] byte_array11 = fSBackend9.getOrCreateReferenceKey();
        cloudBlobStore0.setReferenceKey(byte_array11);
        java.lang.String str13 = cloudBlobStore0.getCloudProvider();
        java.lang.String str15 = cloudBlobStore0.getBlobId("cachePath");
        java.lang.String str17 = cloudBlobStore0.getReference("MemCache");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "MemCache:R5VHLTDIDM1OPHUR8BMO0R4SQQQSHLFM" + "'", str17.equals("MemCache:R5VHLTDIDM1OPHUR8BMO0R4SQQQSHLFM"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        boolean b12 = oakFileDataStore0.deleteMetadataRecord("markedTimestamp");
        int i14 = oakFileDataStore0.deleteAllOlderThan((long) 16384);
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type15 = oakFileDataStore0.getType();
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type15.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore7 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore7.clearCache();
        java.lang.String str9 = cloudBlobStore7.getAccessKey();
        java.lang.String str10 = cloudBlobStore7.getAccessKey();
        java.lang.String str12 = cloudBlobStore7.getBlobId("Blob garbage collection");
        cloudBlobStore7.setCloudContainer("encodeLengthInId");
        java.io.InputStream inputStream16 = cloudBlobStore7.getInputStream("cachePath");
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord17 = cachingFileDataStore0.addRecord(inputStream16);
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(inputStream16);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        org.apache.jackrabbit.oak.spi.blob.split.SplitBlobStore splitBlobStore0 = null;
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator blobMigrator2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator(splitBlobStore0, nodeStore1);
        blobMigrator2.stop();
        blobMigrator2.stop();
        blobMigrator2.stop();
        java.lang.String str6 = blobMigrator2.getLastProcessedPath();
        int i7 = blobMigrator2.getTotalMigratedNodes();
        int i8 = blobMigrator2.getTotalMigratedNodes();
        blobMigrator2.stop();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
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
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i11 == 16384);
        org.junit.Assert.assertTrue(i18 == 16384);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type19.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingRetryInterval(16);
        cachingFileDataStore0.setMinRecordLength((-1));
        org.apache.jackrabbit.oak.stats.StatisticsProvider statisticsProvider9 = null;
        cachingFileDataStore0.setStatisticsProvider(statisticsProvider9);
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
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
        try {
            markSweepGarbageCollector15.collectGarbage(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataStore8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
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
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
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
        org.apache.jackrabbit.oak.api.Blob blob19 = fSBlobSerializer17.deserialize("markedTimestamp");
        org.apache.jackrabbit.oak.api.Blob blob21 = fSBlobSerializer17.deserialize("ReferencedBlob{blob=null, id='BlobStoreStats'}");
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob23 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob21, "BlobStoreStats");
        org.apache.jackrabbit.oak.api.Blob blob24 = referencedBlob23.getBlob();
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNotNull(blob19);
        org.junit.Assert.assertNotNull(blob21);
        org.junit.Assert.assertNotNull(blob24);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever2 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        java.util.concurrent.Executor executor6 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever2, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore5, executor6, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats12 = dataStoreBlobStore5.getCacheStats();
        try {
            blobMigration0.setImplementation((java.lang.Object) dataStoreBlobStore5);
            org.junit.Assert.fail("Expected exception of type javax.management.NotCompliantMBeanException");
        } catch (javax.management.NotCompliantMBeanException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(cacheStats12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever2 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        java.util.concurrent.Executor executor6 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever2, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore5, executor6, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore5);
        dataStoreBlobStore5.setBlockSize(16);
        java.util.concurrent.Executor executor15 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard20 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector21 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore5, executor15, "markedTimestamp-,", (int) (short) 100, (long) (byte) 100, "Blob garbage collection", whiteboard20);
        java.util.concurrent.Executor executor22 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector27 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore5, executor22, "", 16, (long) (short) 1, "Blob migration");
        try {
            markSweepGarbageCollector27.collectGarbage(true);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore5 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore7 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore5, false);
        dataStoreBlobStore7.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore7.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore12 = dataStoreBlobStore7.getDataStore();
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob14 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore7, "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord16 = dataStoreBlobStore7.getAllMetadataRecords("BlobStore-MemCache");
        try {
            org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker17 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("", "*ERROR*-cachePath:D7HRFQQIO3566IETTFV5K16NAUPUR5E0", scheduledExecutorService2, (long) (byte) 10, (-1L), (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataStore12);
        org.junit.Assert.assertNull(list_dataRecord16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = consolidatedDataStoreCacheStats0.nodeStore;
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore2 = null;
        consolidatedDataStoreCacheStats0.cachingDataStore = abstractSharedCachingDataStore2;
        boolean b5 = consolidatedDataStoreCacheStats0.isFileSynced("BlobStoreStats");
        javax.management.openmbean.TabularData tabularData6 = consolidatedDataStoreCacheStats0.getCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore7 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(tabularData6);
        org.junit.Assert.assertNull(abstractSharedCachingDataStore7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        javax.management.MBeanInfo mBeanInfo2 = blobMigration0.getMBeanInfo();
        try {
            java.lang.Object obj4 = blobMigration0.getAttribute("cacheSizeInMB");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException");
        } catch (javax.management.AttributeNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(mBeanInfo2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj1 = blobMigration0.getImplementation();
        java.lang.Class<?> cls2 = blobMigration0.getImplementationClass();
        try {
            java.lang.Object obj4 = blobMigration0.getAttribute("*ERROR*-cachePath:R7K2O1QNMPUUDB64F6QSN07F4U2RFK9S");
            org.junit.Assert.fail("Expected exception of type javax.management.AttributeNotFoundException");
        } catch (javax.management.AttributeNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(cls2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.close();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0);
        int i10 = cachingFileDataStore0.getMinRecordLength();
        int i11 = cachingFileDataStore0.getMinRecordLength();
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertTrue(i10 == 16384);
        org.junit.Assert.assertTrue(i11 == 16384);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration0.postRegister((java.lang.Boolean) true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord4 = dataStoreBlobStore2.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer5 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore2);
        org.junit.Assert.assertNull(list_dataRecord4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
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
        boolean b20 = dataStoreBlobStore2.deleteMetadataRecord("");
        try {
            org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore23 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore2, true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore3.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord9 = dataStoreBlobStore3.getMetadataRecord("cacheSize");
        java.util.concurrent.Executor executor10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector15 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor10, "", (int) (byte) 10, 1L, "Blob migration");
        dataStoreBlobStore3.deleteAllMetadataRecords("Blob migration:5BLDB1SVB7VKPR3D9TL90A4EEHT79NKP");
        org.junit.Assert.assertNull(dataRecord9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = consolidatedDataStoreCacheStats0.nodeStore;
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore2 = null;
        consolidatedDataStoreCacheStats0.cachingDataStore = abstractSharedCachingDataStore2;
        boolean b5 = consolidatedDataStoreCacheStats0.isFileSynced("BlobStoreStats");
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore6 = null;
        consolidatedDataStoreCacheStats0.nodeStore = nodeStore6;
        boolean b9 = consolidatedDataStoreCacheStats0.isFileSynced("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore10.setStagingSplitPercentage(100);
        int i13 = cachingFileDataStore10.getMinRecordLength();
        cachingFileDataStore10.setMinRecordLength(0);
        cachingFileDataStore10.setPath("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        consolidatedDataStoreCacheStats0.cachingDataStore = cachingFileDataStore10;
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i13 == 16384);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        boolean b1 = garbageCollectionRepoStats0.isLocal();
        garbageCollectionRepoStats0.setStartTime(16777216L);
        garbageCollectionRepoStats0.setStartTime((long) 10);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore5.setStagingSplitPercentage(100);
        int i8 = cachingFileDataStore5.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type9 = cachingFileDataStore5.getType();
        cachingFileDataStore5.setPath("markedTimestamp-,");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier12 = null;
        boolean b13 = cachingFileDataStore5.exists(dataIdentifier12);
        try {
            blobMigration0.setImplementation((java.lang.Object) cachingFileDataStore5);
            org.junit.Assert.fail("Expected exception of type javax.management.NotCompliantMBeanException");
        } catch (javax.management.NotCompliantMBeanException e) {
        }
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertTrue(i8 == 16384);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type9.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore13 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore13.clearCache();
        java.lang.String str15 = cloudBlobStore13.getAccessKey();
        java.lang.String str16 = cloudBlobStore13.getAccessKey();
        java.lang.String str18 = cloudBlobStore13.getBlobId("Blob garbage collection");
        cloudBlobStore13.setCloudContainer("encodeLengthInId");
        java.io.InputStream inputStream22 = cloudBlobStore13.getInputStream("cachePath");
        dataStoreBlobStore3.addMetadataRecord(inputStream22, "markedTimestamp-/tmp");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier25 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord26 = dataStoreBlobStore3.getRecordIfStored(dataIdentifier25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(inputStream22);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        dataStoreBlobStore3.setMaxCachedBinarySize((int) (short) 0);
        dataStoreBlobStore3.startMark();
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob15 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore3, ",");
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector16 = org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector.NOOP;
        dataStoreBlobStore3.setBlobStatsCollector(blobStatsCollector16);
        org.junit.Assert.assertNotNull(blobStatsCollector16);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
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
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob46 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob((org.apache.jackrabbit.oak.api.Blob) blobStoreBlob43, "encodeLengthInId");
        org.apache.jackrabbit.oak.api.Blob blob47 = null;
        referencedBlob46.setBlob(blob47);
        java.io.File file50 = null;
        java.io.File file51 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file50);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file51);
        java.io.File file54 = null;
        java.io.File file55 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file54);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file55);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file51, file55, false, false);
        java.io.File file61 = null;
        java.io.File file62 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file61);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file62);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file51, file62, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer66 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file62);
        org.apache.jackrabbit.oak.api.Blob blob68 = fSBlobSerializer66.deserialize("markedTimestamp");
        referencedBlob46.setBlob(blob68);
        org.junit.Assert.assertNotNull(iterator_str6);
        org.junit.Assert.assertNull(dataRecord8);
        org.junit.Assert.assertNull(dataStore18);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(long33 == 0L);
        org.junit.Assert.assertTrue(long35 == 0L);
        org.junit.Assert.assertTrue(long38 == 0L);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Migration started" + "'", str44.equals("Migration started"));
        org.junit.Assert.assertNotNull(file51);
        org.junit.Assert.assertNotNull(file55);
        org.junit.Assert.assertNotNull(file62);
        org.junit.Assert.assertNotNull(blob68);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
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
        org.apache.jackrabbit.oak.api.Blob blob20 = fSBlobSerializer18.deserialize(",");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore21 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str23 = cloudBlobStore21.getBlobId("markedTimestamp");
        java.lang.String str24 = cloudBlobStore21.getSecretKey();
        cloudBlobStore21.setSecretKey(",");
        cloudBlobStore21.clearCache();
        java.util.Iterator<java.lang.String> iterator_str29 = cloudBlobStore21.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend30 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array31 = fSBackend30.getOrCreateReferenceKey();
        byte[] byte_array32 = fSBackend30.getOrCreateReferenceKey();
        cloudBlobStore21.setReferenceKey(byte_array32);
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob35 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore21, "hi!");
        java.lang.String str36 = fSBlobSerializer18.serialize((org.apache.jackrabbit.oak.api.Blob) blobStoreBlob35);
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend37 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array38 = fSBackend37.getOrCreateReferenceKey();
        boolean b39 = blobStoreBlob35.equals((java.lang.Object) fSBackend37);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNotNull(blob20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(iterator_str29);
        org.junit.Assert.assertNotNull(byte_array31);
        org.junit.Assert.assertNotNull(byte_array32);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "*ERROR*-hi!" + "'", str36.equals("*ERROR*-hi!"));
        org.junit.Assert.assertNotNull(byte_array38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier7 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord8 = cachingFileDataStore0.getRecord(dataIdentifier7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
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
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType sharedStoreRecordType0 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER;
        java.lang.String str1 = sharedStoreRecordType0.getType();
        java.lang.String str2 = sharedStoreRecordType0.getType();
        java.lang.String str4 = sharedStoreRecordType0.getNameFromId("markedTimestamp-,");
        java.lang.String str6 = sharedStoreRecordType0.getIdFromName("markedTimestamp-,");
        org.junit.Assert.assertTrue("'" + sharedStoreRecordType0 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER + "'", sharedStoreRecordType0.equals(org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.SharedStoreRecordType.MARKED_START_MARKER));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "markedTimestamp" + "'", str1.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "markedTimestamp" + "'", str2.equals("markedTimestamp"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "markedTimestamp-markedTimestamp-," + "'", str4.equals("markedTimestamp-markedTimestamp-,"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "," + "'", str6.equals(","));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        java.lang.String str10 = cloudBlobStore0.getReference("*ERROR*-cachePath");
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector11 = org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector.NOOP;
        cloudBlobStore0.setStatsCollector(blobStatsCollector11);
        cloudBlobStore0.clearInUse();
        try {
            java.lang.String str15 = cloudBlobStore0.writeBlob("Migration started");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "*ERROR*-cachePath:MCT2B84H84AMPSG8FH182H90PHEDLAAD" + "'", str10.equals("*ERROR*-cachePath:MCT2B84H84AMPSG8FH182H90PHEDLAAD"));
        org.junit.Assert.assertNotNull(blobStatsCollector11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
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
        dataStoreBlobStore2.startMark();
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
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
            dataStoreBlobStore4.init("*ERROR*-cachePath:BLCAOOI7O571OEHF49DE88F431E7SJ8V");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str20);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
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
        int i19 = oakFileDataStore0.getMinRecordLength();
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_dataRecord16);
        org.junit.Assert.assertTrue(i19 == 4096);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        org.apache.jackrabbit.oak.spi.blob.split.SplitBlobStore splitBlobStore0 = null;
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator blobMigrator2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator(splitBlobStore0, nodeStore1);
        blobMigrator2.stop();
        blobMigrator2.stop();
        java.lang.String str5 = blobMigrator2.getLastProcessedPath();
        int i6 = blobMigrator2.getTotalMigratedNodes();
        java.lang.String str7 = blobMigrator2.getLastProcessedPath();
        try {
            boolean b8 = blobMigrator2.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        blobIdTracker12.close();
        blobIdTracker12.close();
        blobIdTracker12.close();
        try {
            blobIdTracker12.add("Blob migration:5BLDB1SVB7VKPR3D9TL90A4EEHT79NKP");
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector11 = null;
        dataStoreBlobStore10.setBlobStatsCollector(blobStatsCollector11);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord14 = dataStoreBlobStore10.getAllMetadataRecords("BlobStoreStats");
        long long15 = dataStoreBlobStore10.getBlockSizeMin();
        java.io.InputStream inputStream16 = null;
        dataStoreBlobStore10.addMetadataRecord(inputStream16, "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        org.junit.Assert.assertNull(list_dataRecord14);
        org.junit.Assert.assertTrue(long15 == 0L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId blobId1 = org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId.of("blob");
        org.junit.Assert.assertNotNull(blobId1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
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
        cachingFileDataStore8.setUploadThreads((int) 'a');
        cachingFileDataStore8.setStagingSplitPercentage((int) (short) 10);
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i11 == 16384);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        long long15 = dataStoreBlobStore2.getBlockSizeMin();
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
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore34 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore20, true);
        org.apache.jackrabbit.core.data.DataStore dataStore35 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore37 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore35, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord39 = dataStoreBlobStore37.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore40 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long41 = cloudBlobStore40.getBlockSizeMin();
        int i42 = cloudBlobStore40.getBlockSize();
        java.lang.String str43 = cloudBlobStore40.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer44 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore40);
        java.io.InputStream inputStream46 = cloudBlobStore40.getInputStream("Blob consistency check");
        dataStoreBlobStore37.addMetadataRecord(inputStream46, "markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        dataStoreBlobStore34.addMetadataRecord(inputStream46, "Blob consistency check");
        try {
            java.lang.String str51 = dataStoreBlobStore2.writeBlob(inputStream46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
        org.junit.Assert.assertTrue(long15 == 0L);
        org.junit.Assert.assertNull(list_dataRecord39);
        org.junit.Assert.assertTrue(long41 == 4096L);
        org.junit.Assert.assertTrue(i42 == 2097152);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(inputStream46);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
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
        oakFileDataStore0.clearInUse();
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever17 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore18 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore20 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore18, false);
        dataStoreBlobStore20.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str24 = dataStoreBlobStore20.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor25 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard28 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector29 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever17, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore20, executor25, 0L, "fsBackendPath", whiteboard28);
        org.apache.jackrabbit.core.data.DataStore dataStore30 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore32 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore30, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord34 = dataStoreBlobStore32.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore35 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long36 = cloudBlobStore35.getBlockSizeMin();
        int i37 = cloudBlobStore35.getBlockSize();
        java.lang.String str38 = cloudBlobStore35.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer39 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore35);
        java.io.InputStream inputStream41 = cloudBlobStore35.getInputStream("Blob consistency check");
        dataStoreBlobStore32.addMetadataRecord(inputStream41, "markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        dataStoreBlobStore20.addMetadataRecord(inputStream41, "ConsolidatedDataStoreCacheStats");
        try {
            oakFileDataStore0.addMetadataRecord(inputStream41, "/tmp");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(iterator_str10);
        org.junit.Assert.assertNotNull(byte_array12);
        org.junit.Assert.assertNotNull(byte_array13);
        org.junit.Assert.assertNotNull(iterator_str24);
        org.junit.Assert.assertNull(list_dataRecord34);
        org.junit.Assert.assertTrue(long36 == 4096L);
        org.junit.Assert.assertTrue(i37 == 2097152);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(inputStream41);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
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
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore18 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore4, false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        garbageCollectionRepoStats0.setNumLines((int) '4');
        garbageCollectionRepoStats0.setStartTime((-1L));
        garbageCollectionRepoStats0.setLength((long) (short) 100);
        long long9 = garbageCollectionRepoStats0.getLength();
        org.junit.Assert.assertTrue(long9 == 100L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
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
        java.io.File file27 = null;
        java.io.File file28 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file27);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file28);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file28, file32, false, false);
        java.io.File file38 = null;
        java.io.File file39 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file38);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file39);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file28, file39, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer43 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file39);
        org.apache.jackrabbit.oak.api.Blob blob45 = fSBlobSerializer43.deserialize("markedTimestamp");
        org.apache.jackrabbit.oak.api.Blob blob47 = fSBlobSerializer43.deserialize("ReferencedBlob{blob=null, id='BlobStoreStats'}");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever48 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore49 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore51 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore49, false);
        java.util.concurrent.Executor executor52 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard57 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector58 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever48, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore51, executor52, ",", (int) (byte) 10, (long) 10, "", whiteboard57);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord60 = dataStoreBlobStore51.getAllMetadataRecords("markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer61 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore51);
        org.apache.jackrabbit.oak.api.Blob blob63 = blobIdSerializer61.deserialize("cachePath");
        java.lang.String str64 = fSBlobSerializer43.serialize(blob63);
        referencedBlob2.setBlob(blob63);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever66 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore67 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore69 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore67, false);
        java.util.concurrent.Executor executor70 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard75 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector76 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever66, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore69, executor70, ",", (int) (byte) 10, (long) 10, "", whiteboard75);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord78 = dataStoreBlobStore69.getAllMetadataRecords("markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer79 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore69);
        org.apache.jackrabbit.oak.api.Blob blob81 = blobIdSerializer79.deserialize("fsBackendPath");
        referencedBlob2.setBlob(blob81);
        org.junit.Assert.assertNull(blob3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ReferencedBlob{blob=null, id='BlobStoreStats'}" + "'", str4.equals("ReferencedBlob{blob=null, id='BlobStoreStats'}"));
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertNotNull(blob24);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertNotNull(blob45);
        org.junit.Assert.assertNotNull(blob47);
        org.junit.Assert.assertNull(list_dataRecord60);
        org.junit.Assert.assertNotNull(blob63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "*ERROR*-cachePath" + "'", str64.equals("*ERROR*-cachePath"));
        org.junit.Assert.assertNull(list_dataRecord78);
        org.junit.Assert.assertNotNull(blob81);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array10 = fSBackend9.getOrCreateReferenceKey();
        byte[] byte_array11 = fSBackend9.getOrCreateReferenceKey();
        cloudBlobStore0.setReferenceKey(byte_array11);
        cloudBlobStore0.setCloudProvider("markedTimestamp-org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertNotNull(byte_array11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingRetryInterval(16);
        cachingFileDataStore0.setStagingPurgeInterval((int) (short) 10);
        cachingFileDataStore0.setMinRecordLength(52);
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
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore29 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore15, true);
        org.apache.jackrabbit.core.data.DataStore dataStore30 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore32 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore30, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord34 = dataStoreBlobStore32.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore35 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long36 = cloudBlobStore35.getBlockSizeMin();
        int i37 = cloudBlobStore35.getBlockSize();
        java.lang.String str38 = cloudBlobStore35.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer39 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore35);
        java.io.InputStream inputStream41 = cloudBlobStore35.getInputStream("Blob consistency check");
        dataStoreBlobStore32.addMetadataRecord(inputStream41, "markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        dataStoreBlobStore29.addMetadataRecord(inputStream41, "Blob consistency check");
        try {
            cachingFileDataStore0.addMetadataRecord(inputStream41, "fsBackendPath");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertNull(list_dataRecord34);
        org.junit.Assert.assertTrue(long36 == 4096L);
        org.junit.Assert.assertTrue(i37 == 2097152);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(inputStream41);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore7 = dataStoreBlobStore2.getDataStore();
        boolean b9 = dataStoreBlobStore2.deleteMetadataRecord("ConsolidatedDataStoreCacheStats");
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats10 = dataStoreBlobStore2.getCacheStats();
        org.junit.Assert.assertNull(dataStore7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(cacheStats10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        org.apache.jackrabbit.core.data.DataStore dataStore13 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore15 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore13, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord17 = dataStoreBlobStore15.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore18 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long19 = cloudBlobStore18.getBlockSizeMin();
        int i20 = cloudBlobStore18.getBlockSize();
        java.lang.String str21 = cloudBlobStore18.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer22 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore18);
        java.io.InputStream inputStream24 = cloudBlobStore18.getInputStream("Blob consistency check");
        dataStoreBlobStore15.addMetadataRecord(inputStream24, "markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        dataStoreBlobStore3.addMetadataRecord(inputStream24, "ConsolidatedDataStoreCacheStats");
        org.apache.jackrabbit.core.data.DataStore dataStore29 = dataStoreBlobStore3.getDataStore();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier30 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord31 = dataStoreBlobStore3.getRecordIfStored(dataIdentifier30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str7);
        org.junit.Assert.assertNull(list_dataRecord17);
        org.junit.Assert.assertTrue(long19 == 4096L);
        org.junit.Assert.assertTrue(i20 == 2097152);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNull(dataStore29);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats1 = cloudBlobStore0.getCacheStats();
        cloudBlobStore0.setCloudProvider("Blob garbage collection");
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats4 = cloudBlobStore0.getCacheStats();
        java.lang.String str6 = cloudBlobStore0.getReference("markedTimestamp-,");
        org.junit.Assert.assertNotNull(cacheStats1);
        org.junit.Assert.assertNotNull(cacheStats4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "markedTimestamp-,:4I5TOAJ3IMFUOUU0BK6TDD0CL4LV30J5" + "'", str6.equals("markedTimestamp-,:4I5TOAJ3IMFUOUU0BK6TDD0CL4LV30J5"));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
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
        java.lang.String[] str_array43 = new java.lang.String[] { "/tmp", "markedTimestamp-,", "BlobStoreStats", "", "markedTimestamp", "BlobStore-MemCache", "Blob migration", "markedTimestamp", "BlobStoreStats", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore" };
        java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<java.lang.String>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str44, str_array43);
        long long47 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str44, 1L);
        dataStoreBlobStore2.clearCache();
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord49 = dataStoreBlobStore2.getAllRecords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
        org.junit.Assert.assertNull(dataStore15);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(long30 == 0L);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(long47 == 0L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        try {
            cachingFileDataStore0.updateModifiedDateOnAccess((long) 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
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
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState26 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("cachePath");
        java.io.File file27 = garbageCollectorFileState26.getMarkedRefs();
        try {
            activeDeletionTracker24.track(file27);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str19);
        org.junit.Assert.assertTrue(long20 == 0L);
        org.junit.Assert.assertNotNull(iterator_str22);
        org.junit.Assert.assertNotNull(activeDeletionTracker24);
        org.junit.Assert.assertNotNull(file27);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
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
        oakFileDataStore0.clearInUse();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier17 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord18 = oakFileDataStore0.getRecord(dataIdentifier17);
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
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingPurgeInterval(16);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore6 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0, false, (int) (byte) 0);
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore7 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long8 = cloudBlobStore7.getBlockSizeMin();
        int i9 = cloudBlobStore7.getBlockSize();
        java.lang.String str10 = cloudBlobStore7.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer11 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore7);
        java.io.InputStream inputStream13 = cloudBlobStore7.getInputStream("Blob consistency check");
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions14 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord15 = cachingFileDataStore0.addRecord(inputStream13, blobOptions14);
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type1.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertTrue(long8 == 4096L);
        org.junit.Assert.assertTrue(i9 == 2097152);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(inputStream13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats1 = cloudBlobStore0.getCacheStats();
        cloudBlobStore0.setCloudProvider("Blob garbage collection");
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats4 = cloudBlobStore0.getCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration5 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration5.preDeregister();
        java.lang.Class<?> cls7 = blobMigration5.getMBeanInterface();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration8 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo9 = blobMigration8.getMBeanInfo();
        blobMigration8.preDeregister();
        blobMigration8.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array16 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList17 = blobMigration8.getAttributes(str_array16);
        javax.management.AttributeList attributeList18 = blobMigration5.getAttributes(str_array16);
        javax.management.AttributeList attributeList19 = cacheStats4.setAttributes(attributeList18);
        org.junit.Assert.assertNotNull(cacheStats1);
        org.junit.Assert.assertNotNull(cacheStats4);
        org.junit.Assert.assertNotNull(cls7);
        org.junit.Assert.assertNotNull(mBeanInfo9);
        org.junit.Assert.assertNotNull(str_array16);
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertNotNull(attributeList18);
        org.junit.Assert.assertNotNull(attributeList19);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0);
        org.apache.jackrabbit.oak.stats.StatisticsProvider statisticsProvider10 = null;
        cachingFileDataStore0.setStatisticsProvider(statisticsProvider10);
        java.util.Properties properties12 = null;
        cachingFileDataStore0.setProperties(properties12);
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState1 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("MemCache:R5VHLTDIDM1OPHUR8BMO0R4SQQQSHLFM");
        java.io.File file2 = garbageCollectorFileState1.getAvailableRefs();
        org.junit.Assert.assertNotNull(file2);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        java.io.File file0 = null;
        java.io.File file3 = null;
        java.io.File file4 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file3);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file4);
        java.io.File file7 = null;
        java.io.File file8 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file7);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file8);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file4, file8, false, false);
        java.io.File file14 = null;
        java.io.File file15 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file14);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file15);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file4, file15, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream19 = null;
        java.util.concurrent.ExecutorService executorService20 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache21 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build((long) 'a', file15, cacheloader_str_inputStream19, executorService20);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file0, file15, false);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNotNull(fileCache21);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setMinRecordLength(0);
        cachingFileDataStore0.setPath("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0, true);
        org.junit.Assert.assertTrue(i3 == 16384);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        dataStoreBlobStore3.setMaxCachedBinarySize((int) (short) 0);
        dataStoreBlobStore3.startMark();
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob15 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore3, ",");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore17 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3, false);
        boolean b19 = dataStoreBlobStore3.deleteMetadataRecord("");
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord21 = dataStoreBlobStore3.getRecordFromReference("Blob migration:E4AC6S9M3MKKG06J55T7HB9QS08CIT69");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        try {
            java.lang.String str7 = dataStoreBlobStore2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        blobIdTracker12.close();
        blobIdTracker12.close();
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever15 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore16 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore18 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore16, false);
        dataStoreBlobStore18.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str22 = dataStoreBlobStore18.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor23 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard26 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector27 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever15, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore18, executor23, 0L, "fsBackendPath", whiteboard26);
        dataStoreBlobStore18.setBlockSize((int) (byte) -1);
        java.util.Iterator<java.lang.String> iterator_str31 = dataStoreBlobStore18.resolveChunks("markedTimestamp-,");
        blobIdTracker12.remove(iterator_str31);
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore33 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str35 = cloudBlobStore33.getBlobId("markedTimestamp");
        java.lang.String str36 = cloudBlobStore33.getSecretKey();
        cloudBlobStore33.setSecretKey(",");
        cloudBlobStore33.clearCache();
        java.util.Iterator<java.lang.String> iterator_str41 = cloudBlobStore33.resolveChunks("");
        blobIdTracker12.remove(iterator_str41);
        org.apache.jackrabbit.core.data.DataStore dataStore43 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore45 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore43, false);
        dataStoreBlobStore45.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str49 = dataStoreBlobStore45.resolveChunks("BlobStoreStats");
        blobIdTracker12.remove(iterator_str49);
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str22);
        org.junit.Assert.assertNotNull(iterator_str31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(iterator_str41);
        org.junit.Assert.assertNotNull(iterator_str49);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array3 = fSBackend0.getOrCreateReferenceKey();
        java.util.Properties properties4 = null;
        fSBackend0.setProperties(properties4);
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier6 = fSBackend0.getAllIdentifiers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
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
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertNotNull(fileCache54);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        dataStoreBlobStore3.setMaxCachedBinarySize((int) (short) 0);
        dataStoreBlobStore3.startMark();
        org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob blobStoreBlob15 = new org.apache.jackrabbit.oak.plugins.blob.BlobStoreBlob((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore3, ",");
        java.lang.String str16 = blobStoreBlob15.toString();
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats17 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore18 = consolidatedDataStoreCacheStats17.cachingDataStore;
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore19 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        consolidatedDataStoreCacheStats17.cachingDataStore = cachingFileDataStore19;
        cachingFileDataStore19.setStagingPurgeInterval((int) (byte) 10);
        cachingFileDataStore19.setStagingSplitPercentage((int) (byte) 100);
        boolean b25 = blobStoreBlob15.equals((java.lang.Object) cachingFileDataStore19);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "," + "'", str16.equals(","));
        org.junit.Assert.assertNull(abstractSharedCachingDataStore18);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
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
        org.apache.jackrabbit.core.data.DataStore dataStore31 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore33 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore31, false);
        dataStoreBlobStore33.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str37 = dataStoreBlobStore33.resolveChunks("BlobStoreStats");
        blobIdTracker12.remove(iterator_str37);
        java.io.File file43 = null;
        java.io.File file44 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file43);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file44);
        java.io.File file47 = null;
        java.io.File file48 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file47);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file48);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file44, file48, false, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer53 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file44);
        java.io.File file54 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("cachePath", file44);
        java.io.File file55 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("DataStore backed BlobStore [org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore]", file54);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream56 = null;
        java.util.concurrent.ExecutorService executorService57 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache58 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build((long) '#', file54, cacheloader_str_inputStream56, executorService57);
        try {
            blobIdTracker12.add(file54);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str20);
        org.junit.Assert.assertNotNull(iterator_str29);
        org.junit.Assert.assertNotNull(iterator_str37);
        org.junit.Assert.assertNotNull(file44);
        org.junit.Assert.assertNotNull(file48);
        org.junit.Assert.assertNotNull(file54);
        org.junit.Assert.assertNotNull(file55);
        org.junit.Assert.assertNotNull(fileCache58);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore11 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore4);
        java.io.File file13 = null;
        java.io.File file14 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file13);
        dataStoreBlobStore11.addMetadataRecord(file14, "BlobStore-MemCache");
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream17 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache19 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build((long) 100, file14, cacheloader_str_inputStream17, executorService18);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheStatsMBean dataStoreCacheStatsMBean20 = fileCache19.getStats();
        java.io.File file23 = null;
        java.io.File file24 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file23);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file24);
        java.io.File file27 = null;
        java.io.File file28 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file27);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file28);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file24, file28, false, false);
        java.io.File file34 = null;
        java.io.File file35 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file34);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file35);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file24, file35, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file35);
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
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file35, file53, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream59 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache61 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(4096L, file35, cacheloader_str_inputStream59, executorService60);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever62 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore63 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore65 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore63, false);
        java.util.concurrent.Executor executor66 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector71 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever62, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore65, executor66, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore72 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore65);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector73 = null;
        dataStoreBlobStore72.setBlobStatsCollector(blobStatsCollector73);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord76 = dataStoreBlobStore72.getAllMetadataRecords("path");
        org.apache.jackrabbit.core.data.DataStore dataStore77 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore79 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore77, false);
        dataStoreBlobStore79.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore79.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array87 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str88 = new java.util.ArrayList<java.lang.String>();
        boolean b89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str88, str_array87);
        long long91 = dataStoreBlobStore79.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str88, (long) (byte) 0);
        long long93 = dataStoreBlobStore72.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str88, (long) 2097152);
        fileCache61.invalidateAll((java.lang.Iterable<java.lang.String>) arraylist_str88);
        try {
            com.google.common.collect.ImmutableMap<java.lang.String, java.io.File> immutablemap_str_file95 = fileCache19.getAllPresent((java.lang.Iterable<java.lang.String>) arraylist_str88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(fileCache19);
        org.junit.Assert.assertNotNull(dataStoreCacheStatsMBean20);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertNotNull(file42);
        org.junit.Assert.assertNotNull(file46);
        org.junit.Assert.assertNotNull(file53);
        org.junit.Assert.assertNotNull(fileCache61);
        org.junit.Assert.assertNull(list_dataRecord76);
        org.junit.Assert.assertNotNull(str_array87);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(long91 == 0L);
        org.junit.Assert.assertTrue(long93 == 0L);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        boolean b1 = garbageCollectionRepoStats0.isLocal();
        boolean b2 = garbageCollectionRepoStats0.isLocal();
        java.lang.String str3 = garbageCollectionRepoStats0.getRepositoryId();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
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
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore42 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore42.close();
        oakFileDataStore42.clearInUse();
        oakFileDataStore42.clearInUse();
        java.lang.String str46 = oakFileDataStore42.getPath();
        fileCache40.invalidate((java.lang.Object) oakFileDataStore42);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(fileCache40);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        boolean b14 = oakFileDataStore0.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord16 = oakFileDataStore0.getAllMetadataRecords("Blob garbage collection");
        oakFileDataStore0.setPath("repository-*ERROR*-cachePath");
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
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        int i3 = cloudBlobStore0.sweep();
        cloudBlobStore0.clearInUse();
        java.lang.String str6 = cloudBlobStore0.getBlobId("Blob garbage collection");
        try {
            java.lang.String str8 = cloudBlobStore0.writeBlob("MemCache");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 2097152);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore1 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore1.clearCache();
        int i3 = cloudBlobStore1.getBlockSize();
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) cloudBlobStore1, executor4, "org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore", 2097152, (long) 52, "cacheSize");
        try {
            markSweepGarbageCollector9.collectGarbage(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 2097152);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingRetryInterval(16);
        cachingFileDataStore0.setStagingPurgeInterval((int) (short) 10);
        java.io.File file11 = null;
        java.io.File file12 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file11);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file12);
        java.io.File file15 = null;
        java.io.File file16 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file15);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file16);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file12, file16, false, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer21 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file12);
        java.io.File file22 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("cachePath", file12);
        try {
            cachingFileDataStore0.addMetadataRecord(file22, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNotNull(file22);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        java.io.File file2 = null;
        java.io.File file3 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file2);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file3);
        java.io.File file6 = null;
        java.io.File file7 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file7);
        java.io.File file10 = null;
        java.io.File file11 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file10);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file11);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file7, file11, false, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file3, file11);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever17 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever18 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore19 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore21 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore19, false);
        java.util.concurrent.Executor executor22 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard27 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector28 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever18, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore21, executor22, ",", (int) (byte) 10, (long) 10, "", whiteboard27);
        java.util.concurrent.Executor executor29 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard32 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector33 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever17, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore21, executor29, 4096L, "Blob migration", whiteboard32);
        java.io.File file35 = null;
        java.io.File file36 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file35);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file36);
        java.io.File file39 = null;
        java.io.File file40 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file39);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file40);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file36, file40, false, false);
        dataStoreBlobStore21.addMetadataRecord(file40, "fsBackendPath");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file11, file40, true, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer51 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file11, 16);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream52 = null;
        java.util.concurrent.ExecutorService executorService53 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache54 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(100L, file11, cacheloader_str_inputStream52, executorService53);
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState57 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("cachePath");
        java.io.File file58 = garbageCollectorFileState57.getMarkedRefs();
        java.io.File file59 = garbageCollectorFileState57.getGcCandidates();
        java.io.File file60 = garbageCollectorFileState57.getGcCandidates();
        fileCache54.put("markedTimestamp-/tmp", file60);
        try {
            java.io.File file63 = fileCache54.get("markedTimestamp-/tmp");
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNotNull(file36);
        org.junit.Assert.assertNotNull(file40);
        org.junit.Assert.assertNotNull(fileCache54);
        org.junit.Assert.assertNotNull(file58);
        org.junit.Assert.assertNotNull(file59);
        org.junit.Assert.assertNotNull(file60);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
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
        java.io.File file43 = null;
        java.io.File file44 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file43);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file44);
        java.io.File file47 = null;
        java.io.File file48 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file47);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file48);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file44, file48, false, false);
        java.io.File file54 = null;
        java.io.File file55 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file54);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file55);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file44, file55, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file55);
        java.io.File file61 = null;
        java.io.File file62 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file61);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file62);
        java.io.File file65 = null;
        java.io.File file66 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file65);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file66);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file62, file66, false, false);
        java.io.File file72 = null;
        java.io.File file73 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file72);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file73);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file62, file73, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file55, file73, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream79 = null;
        java.util.concurrent.ExecutorService executorService80 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache81 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(4096L, file55, cacheloader_str_inputStream79, executorService80);
        fileCache81.close();
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array83 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord84 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b85 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord84, dataRecord_array83);
        org.apache.jackrabbit.core.data.DataRecord[] dataRecord_array86 = new org.apache.jackrabbit.core.data.DataRecord[] {};
        java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord> arraylist_dataRecord87 = new java.util.ArrayList<org.apache.jackrabbit.core.data.DataRecord>();
        boolean b88 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord87, dataRecord_array86);
        java.util.Set<java.lang.String> set_str89 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.refsNotAvailableFromRepos((java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord84, (java.util.List<org.apache.jackrabbit.core.data.DataRecord>) arraylist_dataRecord87);
        com.google.common.collect.ImmutableMap<java.lang.String, java.io.File> immutablemap_str_file90 = fileCache81.getAllPresent((java.lang.Iterable<java.lang.String>) set_str89);
        fileCache40.putAll((java.util.Map<java.lang.String, java.io.File>) immutablemap_str_file90);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(fileCache40);
        org.junit.Assert.assertNotNull(file44);
        org.junit.Assert.assertNotNull(file48);
        org.junit.Assert.assertNotNull(file55);
        org.junit.Assert.assertNotNull(file62);
        org.junit.Assert.assertNotNull(file66);
        org.junit.Assert.assertNotNull(file73);
        org.junit.Assert.assertNotNull(fileCache81);
        org.junit.Assert.assertNotNull(dataRecord_array83);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(dataRecord_array86);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(set_str89);
        org.junit.Assert.assertNotNull(immutablemap_str_file90);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        java.lang.String str5 = cloudBlobStore0.getBlobId("Blob garbage collection");
        long long7 = cloudBlobStore0.getBlobLength("");
        java.lang.String str9 = cloudBlobStore0.getReference("Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(long7 == 0L);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E:E5LTLPI37IVMKATAQ8ALEH76O4Q3G3MO" + "'", str9.equals("Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E:E5LTLPI37IVMKATAQ8ALEH76O4Q3G3MO"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        dataStoreBlobStore4.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore4.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str13 = new java.util.ArrayList<java.lang.String>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str13, str_array12);
        long long16 = dataStoreBlobStore4.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str13, (long) (byte) 0);
        org.apache.jackrabbit.core.data.DataStore dataStore17 = dataStoreBlobStore4.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore18 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore20 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore18, false);
        dataStoreBlobStore20.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore20.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array28 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str29 = new java.util.ArrayList<java.lang.String>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str29, str_array28);
        long long32 = dataStoreBlobStore20.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str29, (long) (byte) 0);
        boolean b34 = dataStoreBlobStore4.deleteChunks((java.util.List<java.lang.String>) arraylist_str29, (long) ' ');
        java.lang.String[] str_array45 = new java.lang.String[] { "/tmp", "markedTimestamp-,", "BlobStoreStats", "", "markedTimestamp", "BlobStore-MemCache", "Blob migration", "markedTimestamp", "BlobStoreStats", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore" };
        java.util.ArrayList<java.lang.String> arraylist_str46 = new java.util.ArrayList<java.lang.String>();
        boolean b47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str46, str_array45);
        long long49 = dataStoreBlobStore4.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str46, 1L);
        java.util.concurrent.Executor executor50 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector55 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor50, "cachePath", 10, (long) (short) -1, "markedTimestamp-/tmp");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker blobTracker56 = null;
        dataStoreBlobStore4.addTracker(blobTracker56);
        java.util.concurrent.Executor executor58 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard63 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector64 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor58, "markedTimestamp-/tmp", (int) (byte) 0, (long) '4', "", whiteboard63);
        try {
            java.lang.String str65 = dataStoreBlobStore4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array12);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(long16 == 0L);
        org.junit.Assert.assertNull(dataStore17);
        org.junit.Assert.assertNotNull(str_array28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(long32 == 0L);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(str_array45);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(long49 == 0L);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0, false);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore10, false);
        long long13 = dataStoreBlobStore10.getBlockSizeMin();
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertTrue(long13 == 0L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        oakFileDataStore0.init("path");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend7 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array8 = fSBackend7.getOrCreateReferenceKey();
        byte[] byte_array9 = fSBackend7.getOrCreateReferenceKey();
        byte[] byte_array10 = fSBackend7.getOrCreateReferenceKey();
        oakFileDataStore0.setReferenceKey(byte_array10);
        boolean b13 = oakFileDataStore0.deleteMetadataRecord("/tmp");
        org.junit.Assert.assertNotNull(byte_array8);
        org.junit.Assert.assertNotNull(byte_array9);
        org.junit.Assert.assertNotNull(byte_array10);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        java.lang.String str10 = cloudBlobStore0.getReference("*ERROR*-cachePath");
        java.io.InputStream inputStream12 = cloudBlobStore0.getInputStream("*ERROR*-cachePath:0G2AAFROSC4I6B1US3JSJ8ORELIMI5RQ");
        cloudBlobStore0.clearInUse();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "*ERROR*-cachePath:EM0GNF38BL8VMIGMBPJAP4NN9BB6RFHB" + "'", str10.equals("*ERROR*-cachePath:EM0GNF38BL8VMIGMBPJAP4NN9BB6RFHB"));
        org.junit.Assert.assertNotNull(inputStream12);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj1 = blobMigration0.getImplementation();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj3 = blobMigration2.getImplementation();
        java.lang.Class<?> cls4 = blobMigration2.getImplementationClass();
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration5 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo6 = blobMigration5.getMBeanInfo();
        blobMigration5.preDeregister();
        blobMigration5.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array13 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList14 = blobMigration5.getAttributes(str_array13);
        javax.management.AttributeList attributeList15 = blobMigration2.setAttributes(attributeList14);
        javax.management.AttributeList attributeList16 = blobMigration0.setAttributes(attributeList14);
        javax.management.MBeanServer mBeanServer17 = null;
        javax.management.ObjectName objectName18 = null;
        javax.management.ObjectName objectName19 = blobMigration0.preRegister(mBeanServer17, objectName18);
        javax.management.MBeanServer mBeanServer20 = null;
        javax.management.ObjectName objectName21 = null;
        javax.management.ObjectName objectName22 = blobMigration0.preRegister(mBeanServer20, objectName21);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(cls4);
        org.junit.Assert.assertNotNull(mBeanInfo6);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertNotNull(attributeList14);
        org.junit.Assert.assertNotNull(attributeList15);
        org.junit.Assert.assertNotNull(attributeList16);
        org.junit.Assert.assertNull(objectName19);
        org.junit.Assert.assertNull(objectName22);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setEndTime((long) (short) -1);
        garbageCollectionRepoStats0.setRepositoryId("ConsolidatedDataStoreCacheStats");
        garbageCollectionRepoStats0.setEndTime(4096L);
        long long7 = garbageCollectionRepoStats0.getEndTime();
        long long8 = garbageCollectionRepoStats0.getEndTime();
        garbageCollectionRepoStats0.setLength((long) (-1));
        org.junit.Assert.assertTrue(long7 == 4096L);
        org.junit.Assert.assertTrue(long8 == 4096L);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        java.io.File file4 = null;
        java.io.File file5 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file4);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file5);
        java.io.File file8 = null;
        java.io.File file9 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file8);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file9);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file5, file9, false, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer14 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file5);
        java.io.File file15 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("cachePath", file5);
        java.io.File file16 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("DataStore backed BlobStore [org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore]", file15);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream17 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache19 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build((long) '#', file15, cacheloader_str_inputStream17, executorService18);
        java.io.File file22 = null;
        java.io.File file23 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file22);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file23);
        java.io.File file26 = null;
        java.io.File file27 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file26);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file27);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file23, file27, false, false);
        java.io.File file33 = null;
        java.io.File file34 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file33);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file34);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file23, file34, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file34);
        java.io.File file40 = null;
        java.io.File file41 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file40);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file41);
        java.io.File file44 = null;
        java.io.File file45 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file44);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file45);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file41, file45, false, false);
        java.io.File file51 = null;
        java.io.File file52 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file51);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file52);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file41, file52, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file34, file52, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream58 = null;
        java.util.concurrent.ExecutorService executorService59 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache60 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(4096L, file34, cacheloader_str_inputStream58, executorService59);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever61 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore62 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore64 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore62, false);
        java.util.concurrent.Executor executor65 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector70 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever61, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore64, executor65, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore71 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore64);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector72 = null;
        dataStoreBlobStore71.setBlobStatsCollector(blobStatsCollector72);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord75 = dataStoreBlobStore71.getAllMetadataRecords("path");
        org.apache.jackrabbit.core.data.DataStore dataStore76 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore78 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore76, false);
        dataStoreBlobStore78.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore78.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array86 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str87 = new java.util.ArrayList<java.lang.String>();
        boolean b88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str87, str_array86);
        long long90 = dataStoreBlobStore78.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str87, (long) (byte) 0);
        long long92 = dataStoreBlobStore71.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str87, (long) 2097152);
        fileCache60.invalidateAll((java.lang.Iterable<java.lang.String>) arraylist_str87);
        try {
            com.google.common.collect.ImmutableMap<java.lang.String, java.io.File> immutablemap_str_file94 = fileCache19.getAllPresent((java.lang.Iterable<java.lang.String>) arraylist_str87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNotNull(fileCache19);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertNotNull(file34);
        org.junit.Assert.assertNotNull(file41);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertNotNull(file52);
        org.junit.Assert.assertNotNull(fileCache60);
        org.junit.Assert.assertNull(list_dataRecord75);
        org.junit.Assert.assertNotNull(str_array86);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(long90 == 0L);
        org.junit.Assert.assertTrue(long92 == 0L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
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
        java.io.File file27 = null;
        java.io.File file28 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file27);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file28);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file28, file32, false, false);
        java.io.File file38 = null;
        java.io.File file39 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file38);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file39);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file28, file39, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer43 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file39);
        org.apache.jackrabbit.oak.api.Blob blob45 = fSBlobSerializer43.deserialize("markedTimestamp");
        org.apache.jackrabbit.core.data.DataStore dataStore46 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore48 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore46, false);
        dataStoreBlobStore48.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str52 = dataStoreBlobStore48.resolveChunks("BlobStoreStats");
        org.apache.jackrabbit.core.data.DataRecord dataRecord54 = dataStoreBlobStore48.getMetadataRecord(",");
        dataStoreBlobStore48.clearCache();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer56 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore48);
        org.apache.jackrabbit.oak.api.Blob blob58 = blobIdSerializer56.deserialize("ConsolidatedDataStoreCacheStats");
        java.lang.String str59 = fSBlobSerializer43.serialize(blob58);
        referencedBlob2.setBlob(blob58);
        org.apache.jackrabbit.oak.api.Blob blob61 = referencedBlob2.getBlob();
        referencedBlob2.setId("markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        java.lang.String str64 = referencedBlob2.toString();
        org.junit.Assert.assertNull(blob3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ReferencedBlob{blob=null, id='BlobStoreStats'}" + "'", str4.equals("ReferencedBlob{blob=null, id='BlobStoreStats'}"));
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertNotNull(blob24);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertNotNull(blob45);
        org.junit.Assert.assertNotNull(iterator_str52);
        org.junit.Assert.assertNull(dataRecord54);
        org.junit.Assert.assertNotNull(blob58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "*ERROR*-ConsolidatedDataStoreCacheStats" + "'", str59.equals("*ERROR*-ConsolidatedDataStoreCacheStats"));
        org.junit.Assert.assertNotNull(blob61);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "ReferencedBlob{blob=ConsolidatedDataStoreCacheStats, id='markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E'}" + "'", str64.equals("ReferencedBlob{blob=ConsolidatedDataStoreCacheStats, id='markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E'}"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState1 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("markedTimestamp-,");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
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
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer49 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file10);
        java.io.File file51 = null;
        java.io.File file52 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file51);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file52);
        java.io.File file55 = null;
        java.io.File file56 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file55);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file56);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file52, file56, false, false);
        java.io.File file62 = null;
        java.io.File file63 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file62);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file63);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file52, file63, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file10, file63, false, true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertNotNull(file52);
        org.junit.Assert.assertNotNull(file56);
        org.junit.Assert.assertNotNull(file63);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector7 = null;
        dataStoreBlobStore2.setBlobStatsCollector(blobStatsCollector7);
        org.apache.jackrabbit.core.data.DataStore dataStore9 = dataStoreBlobStore2.getDataStore();
        org.junit.Assert.assertNull(dataStore9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str6 = dataStoreBlobStore2.resolveChunks("BlobStoreStats");
        try {
            java.util.Iterator<java.lang.String> iterator_str8 = dataStoreBlobStore2.getAllChunkIds((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setUploadThreads((int) '4');
        cachingFileDataStore0.setCacheSize(10L);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier8 = null;
        boolean b9 = cachingFileDataStore0.exists(dataIdentifier8);
        cachingFileDataStore0.setPath("");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever12 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever13 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore14 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore16 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore14, false);
        java.util.concurrent.Executor executor17 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard22 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector23 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever13, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore16, executor17, ",", (int) (byte) 10, (long) 10, "", whiteboard22);
        java.util.concurrent.Executor executor24 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector29 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever12, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore16, executor24, "path", (int) 'a', (long) (short) -1, "markedTimestamp-org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        org.apache.jackrabbit.core.data.DataStore dataStore30 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore32 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore30, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord34 = dataStoreBlobStore32.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore35 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long36 = cloudBlobStore35.getBlockSizeMin();
        int i37 = cloudBlobStore35.getBlockSize();
        java.lang.String str38 = cloudBlobStore35.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer39 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore35);
        java.io.InputStream inputStream41 = cloudBlobStore35.getInputStream("Blob consistency check");
        dataStoreBlobStore32.addMetadataRecord(inputStream41, "markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        dataStoreBlobStore16.addMetadataRecord(inputStream41, "ReferencedBlob{blob=null, id='BlobStoreStats'}");
        try {
            cachingFileDataStore0.addMetadataRecord(inputStream41, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(list_dataRecord34);
        org.junit.Assert.assertTrue(long36 == 4096L);
        org.junit.Assert.assertTrue(i37 == 2097152);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(inputStream41);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore1 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        consolidatedDataStoreCacheStats0.cachingDataStore = cachingFileDataStore2;
        cachingFileDataStore2.setStagingPurgeInterval((int) (byte) 10);
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore6 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long7 = cloudBlobStore6.getBlockSizeMin();
        int i8 = cloudBlobStore6.getBlockSize();
        int i9 = cloudBlobStore6.sweep();
        java.io.InputStream inputStream11 = cloudBlobStore6.getInputStream("*ERROR*-cachePath");
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord12 = cachingFileDataStore2.addRecord(inputStream11);
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNull(abstractSharedCachingDataStore1);
        org.junit.Assert.assertTrue(long7 == 4096L);
        org.junit.Assert.assertTrue(i8 == 2097152);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(inputStream11);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState1 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("markedTimestamp-*ERROR*-cachePath:0G2AAFROSC4I6B1US3JSJ8ORELIMI5RQ");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        java.io.InputStream inputStream5 = cloudBlobStore0.getInputStream("DataStore backed BlobStore [org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(inputStream5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        javax.management.MBeanInfo mBeanInfo2 = blobMigration0.getMBeanInfo();
        java.lang.Object obj3 = blobMigration0.getImplementation();
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(mBeanInfo2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.postRegister((java.lang.Boolean) true);
        java.lang.String[] str_array8 = new java.lang.String[] { "BlobStoreStats", "cachePath", "cacheSize" };
        javax.management.AttributeList attributeList9 = blobMigration0.getAttributes(str_array8);
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration10 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore11 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str13 = cloudBlobStore11.getBlobId("markedTimestamp");
        java.lang.String str14 = cloudBlobStore11.getSecretKey();
        cloudBlobStore11.clearCache();
        java.lang.String str16 = cloudBlobStore11.getSecretKey();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats17 = cloudBlobStore11.getCacheStats();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats18 = cloudBlobStore11.getCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever19 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore20 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore22 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore20, false);
        java.util.concurrent.Executor executor23 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector28 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever19, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore22, executor23, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats29 = dataStoreBlobStore22.getCacheStats();
        java.lang.String[] str_array35 = new java.lang.String[] { "*ERROR*-cachePath:D7HRFQQIO3566IETTFV5K16NAUPUR5E0", "Blob migration", "hi!", "Blob migration:5BLDB1SVB7VKPR3D9TL90A4EEHT79NKP", "Migration started" };
        javax.management.AttributeList attributeList36 = cacheStats29.getAttributes(str_array35);
        javax.management.AttributeList attributeList37 = cacheStats18.getAttributes(str_array35);
        javax.management.AttributeList attributeList38 = blobMigration10.getAttributes(str_array35);
        javax.management.AttributeList attributeList39 = blobMigration0.getAttributes(str_array35);
        org.junit.Assert.assertNotNull(mBeanInfo1);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(cacheStats17);
        org.junit.Assert.assertNotNull(cacheStats18);
        org.junit.Assert.assertNotNull(cacheStats29);
        org.junit.Assert.assertNotNull(str_array35);
        org.junit.Assert.assertNotNull(attributeList36);
        org.junit.Assert.assertNotNull(attributeList37);
        org.junit.Assert.assertNotNull(attributeList38);
        org.junit.Assert.assertNotNull(attributeList39);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
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
            long long21 = markSweepGarbageCollector20.checkConsistency();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        cloudBlobStore0.setSecretKey("markedTimestamp");
        cloudBlobStore0.setReferenceKeyPlainText("ReferencedBlob{blob=ConsolidatedDataStoreCacheStats, id='markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E'}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
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
        try {
            java.lang.String str20 = dataStoreBlobStore4.getBlobId("Blob consistency check");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setUploadThreads((int) '4');
        cachingFileDataStore0.setCacheSize(10L);
        cachingFileDataStore0.setStagingRetryInterval((int) (byte) -1);
        int i10 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier11 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord12 = cachingFileDataStore0.getRecordForId(dataIdentifier11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue(i10 == 16384);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
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
        java.lang.String str45 = blobStoreBlob43.getBlobId();
        java.lang.String str46 = blobStoreBlob43.getBlobId();
        try {
            java.io.InputStream inputStream47 = blobStoreBlob43.getNewStream();
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
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Migration started" + "'", str45.equals("Migration started"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Migration started" + "'", str46.equals("Migration started"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array3 = fSBackend0.getOrCreateReferenceKey();
        java.util.Properties properties4 = null;
        fSBackend0.setProperties(properties4);
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier6 = null;
        try {
            boolean b7 = fSBackend0.exists(dataIdentifier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        java.io.File file2 = null;
        java.io.File file3 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file2);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file3);
        java.io.File file6 = null;
        java.io.File file7 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file6);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file7);
        java.io.File file10 = null;
        java.io.File file11 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file10);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file11);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file7, file11, false, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file3, file11);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever17 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever18 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore19 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore21 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore19, false);
        java.util.concurrent.Executor executor22 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard27 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector28 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever18, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore21, executor22, ",", (int) (byte) 10, (long) 10, "", whiteboard27);
        java.util.concurrent.Executor executor29 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard32 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector33 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever17, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore21, executor29, 4096L, "Blob migration", whiteboard32);
        java.io.File file35 = null;
        java.io.File file36 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file35);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file36);
        java.io.File file39 = null;
        java.io.File file40 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file39);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file40);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file36, file40, false, false);
        dataStoreBlobStore21.addMetadataRecord(file40, "fsBackendPath");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file11, file40, true, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer51 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file11, 16);
        java.io.File file52 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("cacheSizeInMB", file11);
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNotNull(file36);
        org.junit.Assert.assertNotNull(file40);
        org.junit.Assert.assertNotNull(file52);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId blobId1 = org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId.of("Blob migration:E4AC6S9M3MKKG06J55T7HB9QS08CIT69");
        org.junit.Assert.assertNotNull(blobId1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
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
        cachingFileDataStore8.setStagingRetryInterval((int) (byte) 100);
        cachingFileDataStore8.setStagingPurgeInterval((int) '4');
        org.junit.Assert.assertNull(nodeStore1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i11 == 16384);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats1 = cloudBlobStore0.getCacheStats();
        long long2 = cloudBlobStore0.getBlobCacheSize();
        java.lang.String str4 = cloudBlobStore0.getReference("Blob migration");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever5 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore6 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore8 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore6, false);
        dataStoreBlobStore8.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str12 = dataStoreBlobStore8.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor13 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard16 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector17 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever5, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore8, executor13, 0L, "fsBackendPath", whiteboard16);
        org.apache.jackrabbit.core.data.DataStore dataStore18 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore20 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore18, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord22 = dataStoreBlobStore20.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore23 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long24 = cloudBlobStore23.getBlockSizeMin();
        int i25 = cloudBlobStore23.getBlockSize();
        java.lang.String str26 = cloudBlobStore23.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer27 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore23);
        java.io.InputStream inputStream29 = cloudBlobStore23.getInputStream("Blob consistency check");
        dataStoreBlobStore20.addMetadataRecord(inputStream29, "markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        dataStoreBlobStore8.addMetadataRecord(inputStream29, "ConsolidatedDataStoreCacheStats");
        org.apache.jackrabbit.oak.spi.blob.BlobOptions blobOptions34 = null;
        try {
            java.lang.String str35 = cloudBlobStore0.writeBlob(inputStream29, blobOptions34);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cacheStats1);
        org.junit.Assert.assertTrue(long2 == 16777216L);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Blob migration:KQANE653A2C3ME3ICFBNK2QO5TEE6625" + "'", str4.equals("Blob migration:KQANE653A2C3ME3ICFBNK2QO5TEE6625"));
        org.junit.Assert.assertNotNull(iterator_str12);
        org.junit.Assert.assertNull(list_dataRecord22);
        org.junit.Assert.assertTrue(long24 == 4096L);
        org.junit.Assert.assertTrue(i25 == 2097152);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(inputStream29);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore3.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord9 = dataStoreBlobStore3.getMetadataRecord("cacheSize");
        java.util.concurrent.Executor executor10 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector15 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor10, "", (int) (byte) 10, 1L, "Blob migration");
        dataStoreBlobStore3.setBlockSize((int) (short) 10);
        try {
            java.lang.String str19 = dataStoreBlobStore3.getBlobId("*ERROR*-cachePath");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(dataRecord9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration0.postRegister((java.lang.Boolean) false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId blobId1 = org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore.BlobId.of("Blob garbage collection");
        long long2 = blobId1.getLength();
        java.lang.String str3 = blobId1.getBlobId();
        org.junit.Assert.assertNotNull(blobId1);
        org.junit.Assert.assertTrue(long2 == (-1L));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Blob garbage collection" + "'", str3.equals("Blob garbage collection"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore1 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long2 = cloudBlobStore1.getBlockSizeMin();
        int i3 = cloudBlobStore1.getBlockSize();
        java.lang.String str4 = cloudBlobStore1.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer5 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore1);
        java.io.InputStream inputStream7 = cloudBlobStore1.getInputStream("Blob consistency check");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard13 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector14 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) cloudBlobStore1, executor8, "ConsolidatedDataStoreCacheStats", (int) (byte) 100, 4096L, "markedTimestamp-/tmp", whiteboard13);
        try {
            markSweepGarbageCollector14.collectGarbage(false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertTrue(long2 == 4096L);
        org.junit.Assert.assertTrue(i3 == 2097152);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(inputStream7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
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
        org.apache.jackrabbit.oak.api.Blob blob19 = fSBlobSerializer17.deserialize("markedTimestamp");
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob21 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob19, "BlobStoreStats");
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNotNull(blob19);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
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
        java.io.File file36 = null;
        java.io.File file37 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file36);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file37);
        java.io.File file40 = null;
        java.io.File file41 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file40);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file41);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file37, file41, false, false);
        java.io.File file47 = null;
        java.io.File file48 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file47);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file48);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file37, file48, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream52 = null;
        java.util.concurrent.ExecutorService executorService53 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache54 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build((long) 'a', file48, cacheloader_str_inputStream52, executorService53);
        try {
            oakFileDataStore0.addMetadataRecord(file48, "Blob garbage collection");
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
        org.junit.Assert.assertNotNull(file37);
        org.junit.Assert.assertNotNull(file41);
        org.junit.Assert.assertNotNull(file48);
        org.junit.Assert.assertNotNull(fileCache54);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        dataStoreBlobStore3.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str7 = dataStoreBlobStore3.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor8 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor8, 0L, "fsBackendPath", whiteboard11);
        int i13 = dataStoreBlobStore3.sweep();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type14 = dataStoreBlobStore3.getType();
        org.junit.Assert.assertNotNull(iterator_str7);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.DEFAULT + "'", type14.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.DEFAULT));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
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
        java.lang.String str19 = oakFileDataStore0.getPath();
        java.io.File file22 = null;
        java.io.File file23 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file22);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file23);
        java.io.File file26 = null;
        java.io.File file27 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file26);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file27);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file23, file27, false, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer32 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file23);
        java.io.File file33 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("cachePath", file23);
        try {
            oakFileDataStore0.addMetadataRecord(file23, "Blob garbage collection");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_dataRecord16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "cachePath/repository/datastore" + "'", str19.equals("cachePath/repository/datastore"));
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertNotNull(file33);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0);
        try {
            java.lang.String str11 = dataStoreBlobStore9.writeBlob("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertTrue(i3 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        org.apache.jackrabbit.core.data.DataStore dataStore0 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore0, false);
        dataStoreBlobStore2.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore2.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        long long14 = dataStoreBlobStore2.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str11, (long) (byte) 0);
        org.apache.jackrabbit.core.data.DataStore dataStore15 = dataStoreBlobStore2.getDataStore();
        dataStoreBlobStore2.clearCache();
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord18 = dataStoreBlobStore2.getAllMetadataRecords("*ERROR*-hi!");
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(long14 == 0L);
        org.junit.Assert.assertNull(dataStore15);
        org.junit.Assert.assertNull(list_dataRecord18);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        org.apache.jackrabbit.oak.api.Blob blob0 = null;
        org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob referencedBlob2 = new org.apache.jackrabbit.oak.plugins.blob.ReferencedBlob(blob0, "BlobStoreStats");
        org.apache.jackrabbit.oak.api.Blob blob3 = referencedBlob2.getBlob();
        java.lang.String str4 = referencedBlob2.toString();
        referencedBlob2.setId("markedTimestamp-,");
        java.lang.String str7 = referencedBlob2.getId();
        java.io.File file10 = null;
        java.io.File file11 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file10);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file11);
        java.io.File file14 = null;
        java.io.File file15 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file14);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file15);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file11, file15, false, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer20 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file11);
        java.io.File file21 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("cachePath", file11);
        java.io.File file23 = null;
        java.io.File file24 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file23);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file24);
        java.io.File file27 = null;
        java.io.File file28 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file27);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file28);
        java.io.File file31 = null;
        java.io.File file32 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file31);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file32);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file28, file32, false, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file24, file32);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever38 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever39 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore40 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore42 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore40, false);
        java.util.concurrent.Executor executor43 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard48 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector49 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever39, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore42, executor43, ",", (int) (byte) 10, (long) 10, "", whiteboard48);
        java.util.concurrent.Executor executor50 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard53 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector54 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever38, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore42, executor50, 4096L, "Blob migration", whiteboard53);
        java.io.File file56 = null;
        java.io.File file57 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file56);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file57);
        java.io.File file60 = null;
        java.io.File file61 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file60);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file61);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file57, file61, false, false);
        dataStoreBlobStore42.addMetadataRecord(file61, "fsBackendPath");
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file32, file61, true, false);
        java.io.File file72 = null;
        java.io.File file73 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file72);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file73);
        java.io.File file76 = null;
        java.io.File file77 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file76);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file77);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file73, file77, false, false);
        java.io.File file83 = null;
        java.io.File file84 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file83);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file84);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file73, file84, false);
        org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer fSBlobSerializer88 = new org.apache.jackrabbit.oak.plugins.blob.serializer.FSBlobSerializer(file84);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.recursiveDelete(file32, file84);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file21, file32, true, false);
        boolean b93 = referencedBlob2.equals((java.lang.Object) true);
        org.junit.Assert.assertNull(blob3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ReferencedBlob{blob=null, id='BlobStoreStats'}" + "'", str4.equals("ReferencedBlob{blob=null, id='BlobStoreStats'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "markedTimestamp-," + "'", str7.equals("markedTimestamp-,"));
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertNotNull(file57);
        org.junit.Assert.assertNotNull(file61);
        org.junit.Assert.assertNotNull(file73);
        org.junit.Assert.assertNotNull(file77);
        org.junit.Assert.assertNotNull(file84);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        boolean b14 = oakFileDataStore0.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier15 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord16 = oakFileDataStore0.getRecordForId(dataIdentifier15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        int i1 = garbageCollectionRepoStats0.getNumLines();
        garbageCollectionRepoStats0.setEndTime((long) 16384);
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
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
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type21 = dataStoreBlobStore4.getType();
        org.apache.jackrabbit.core.data.DataStore dataStore22 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore24 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore22, false);
        dataStoreBlobStore24.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore24.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataStore dataStore29 = dataStoreBlobStore24.getDataStore();
        org.apache.jackrabbit.core.data.DataStore dataStore30 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore32 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore30, false);
        dataStoreBlobStore32.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore32.deleteAllMetadataRecords("Blob migration");
        java.lang.String[] str_array40 = new java.lang.String[] { "hi!", "cacheSizeInMB", "Blob migration" };
        java.util.ArrayList<java.lang.String> arraylist_str41 = new java.util.ArrayList<java.lang.String>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str41, str_array40);
        long long44 = dataStoreBlobStore32.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str41, (long) (byte) 0);
        long long46 = dataStoreBlobStore24.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str41, (long) 1);
        boolean b48 = dataStoreBlobStore4.deleteChunks((java.util.List<java.lang.String>) arraylist_str41, (long) (short) -1);
        try {
            java.lang.String str50 = dataStoreBlobStore4.writeBlob("DataStore backed BlobStore [org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore]");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord13);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.DEFAULT + "'", type21.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.DEFAULT));
        org.junit.Assert.assertNull(dataStore29);
        org.junit.Assert.assertNotNull(str_array40);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(long44 == 0L);
        org.junit.Assert.assertTrue(long46 == 0L);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore1 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        consolidatedDataStoreCacheStats0.cachingDataStore = cachingFileDataStore2;
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore4 = null;
        consolidatedDataStoreCacheStats0.nodeStore = nodeStore4;
        org.junit.Assert.assertNull(abstractSharedCachingDataStore1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
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
        org.apache.jackrabbit.core.data.DataRecord dataRecord20 = dataStoreBlobStore4.getMetadataRecord("*ERROR*-cachePath:EM0GNF38BL8VMIGMBPJAP4NN9BB6RFHB");
        org.junit.Assert.assertNull(dataRecord20);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str1 = cloudBlobStore0.getSecretKey();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setUploadThreads((int) 'a');
        org.junit.Assert.assertTrue(i3 == 16384);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.clearCache();
        java.lang.String str5 = cloudBlobStore0.getSecretKey();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats6 = cloudBlobStore0.getCacheStats();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats7 = cloudBlobStore0.getCacheStats();
        java.lang.Class<?> cls8 = cacheStats7.getMBeanInterface();
        javax.management.MBeanInfo mBeanInfo9 = cacheStats7.getMBeanInfo();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cacheStats6);
        org.junit.Assert.assertNotNull(cacheStats7);
        org.junit.Assert.assertNotNull(cls8);
        org.junit.Assert.assertNotNull(mBeanInfo9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.sweep();
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore1 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats2 = cloudBlobStore1.getCacheStats();
        cloudBlobStore1.setCloudProvider("Blob garbage collection");
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats5 = cloudBlobStore1.getCacheStats();
        java.util.concurrent.Executor executor6 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard11 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector12 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) cloudBlobStore1, executor6, "cacheSize", 4096, (long) (byte) 100, "cacheSizeInMB", whiteboard11);
        org.junit.Assert.assertNotNull(cacheStats2);
        org.junit.Assert.assertNotNull(cacheStats5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        java.util.Properties properties1 = null;
        cachingFileDataStore0.setProperties(properties1);
        cachingFileDataStore0.setPath("cachePath");
        cachingFileDataStore0.setStagingRetryInterval((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever7 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore8 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore8, false);
        dataStoreBlobStore10.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str14 = dataStoreBlobStore10.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor15 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard18 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector19 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever7, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore10, executor15, 0L, "fsBackendPath", whiteboard18);
        org.apache.jackrabbit.core.data.DataStore dataStore20 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore22 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore20, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord24 = dataStoreBlobStore22.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore25 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long26 = cloudBlobStore25.getBlockSizeMin();
        int i27 = cloudBlobStore25.getBlockSize();
        java.lang.String str28 = cloudBlobStore25.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer29 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore25);
        java.io.InputStream inputStream31 = cloudBlobStore25.getInputStream("Blob consistency check");
        dataStoreBlobStore22.addMetadataRecord(inputStream31, "markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        dataStoreBlobStore10.addMetadataRecord(inputStream31, "ConsolidatedDataStoreCacheStats");
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord36 = cachingFileDataStore0.addRecord(inputStream31);
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(iterator_str14);
        org.junit.Assert.assertNull(list_dataRecord24);
        org.junit.Assert.assertTrue(long26 == 4096L);
        org.junit.Assert.assertTrue(i27 == 2097152);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(inputStream31);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState1 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("path");
        java.io.File file2 = garbageCollectorFileState1.getAvailableRefs();
        org.junit.Assert.assertNotNull(file2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setReferenceKeyPlainText("path");
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier6 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord7 = oakFileDataStore0.getRecordForId(dataIdentifier6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        long long3 = garbageCollectionRepoStats0.getLength();
        garbageCollectionRepoStats0.setLocal(false);
        garbageCollectionRepoStats0.setLength((long) (short) 100);
        garbageCollectionRepoStats0.setLocal(false);
        garbageCollectionRepoStats0.setLength(0L);
        org.junit.Assert.assertTrue(long3 == 0L);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        cloudBlobStore0.setCloudProvider("*ERROR*-cachePath");
        cloudBlobStore0.setCloudContainer("markedTimestamp-org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        java.lang.String str10 = cloudBlobStore0.getReference("*ERROR*-cachePath");
        java.lang.String str12 = cloudBlobStore0.getBlobId("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "*ERROR*-cachePath:M249SD2R4NPBQH34CAOQ2PV7O0AAV7I1" + "'", str10.equals("*ERROR*-cachePath:M249SD2R4NPBQH34CAOQ2PV7O0AAV7I1"));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.clearCache();
        java.lang.String str5 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setAccessKey("Migration started");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore1 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        consolidatedDataStoreCacheStats0.cachingDataStore = cachingFileDataStore2;
        cachingFileDataStore2.setStagingPurgeInterval((int) (byte) 10);
        org.apache.jackrabbit.oak.stats.StatisticsProvider statisticsProvider6 = null;
        cachingFileDataStore2.setStatisticsProvider(statisticsProvider6);
        try {
            boolean b9 = cachingFileDataStore2.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(abstractSharedCachingDataStore1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        org.apache.jackrabbit.core.data.DataRecord dataRecord12 = oakFileDataStore0.getMetadataRecord("*ERROR*-cachePath:OL3ULMSCRRDJSJ7JT3BJBVDECSOR2F7G");
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNull(dataRecord12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration0.preDeregister();
        java.lang.String str3 = blobMigration0.startBlobMigration(false);
        java.lang.Class<?> cls4 = blobMigration0.getImplementationClass();
        javax.management.MBeanServer mBeanServer5 = null;
        javax.management.ObjectName objectName6 = null;
        javax.management.ObjectName objectName7 = blobMigration0.preRegister(mBeanServer5, objectName6);
        java.lang.Object obj8 = blobMigration0.getImplementation();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Migration started" + "'", str3.equals("Migration started"));
        org.junit.Assert.assertNotNull(cls4);
        org.junit.Assert.assertNull(objectName7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
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
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream18 = null;
        java.util.concurrent.ExecutorService executorService19 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache20 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build((long) 'a', file14, cacheloader_str_inputStream18, executorService19);
        try {
            long long21 = fileCache20.size();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(fileCache20);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        org.apache.jackrabbit.oak.spi.blob.split.SplitBlobStore splitBlobStore0 = null;
        org.apache.jackrabbit.oak.spi.state.NodeStore nodeStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator blobMigrator2 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigrator(splitBlobStore0, nodeStore1);
        blobMigrator2.stop();
        blobMigrator2.stop();
        blobMigrator2.stop();
        java.lang.String str6 = blobMigrator2.getLastProcessedPath();
        java.lang.String str7 = blobMigrator2.getLastProcessedPath();
        blobMigrator2.stop();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever2 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        java.util.concurrent.Executor executor6 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector11 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever2, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore5, executor6, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore5);
        dataStoreBlobStore5.setBlockSize(16);
        java.util.concurrent.Executor executor15 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard20 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector21 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore5, executor15, "markedTimestamp-,", (int) (short) 100, (long) (byte) 100, "Blob garbage collection", whiteboard20);
        java.util.concurrent.Executor executor22 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector27 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore5, executor22, "", 16, (long) (short) 1, "Blob migration");
        try {
            long long28 = markSweepGarbageCollector27.checkConsistency();
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        org.apache.jackrabbit.core.data.DataStore dataStore3 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore5 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore3, false);
        dataStoreBlobStore5.deleteAllMetadataRecords("hi!");
        dataStoreBlobStore5.deleteAllMetadataRecords("Blob migration");
        org.apache.jackrabbit.core.data.DataRecord dataRecord11 = dataStoreBlobStore5.getMetadataRecord("cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker blobIdTracker12 = new org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker("/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", (long) (short) 1, (org.apache.jackrabbit.oak.plugins.blob.SharedDataStore) dataStoreBlobStore5);
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState14 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("cachePath");
        java.io.File file15 = garbageCollectorFileState14.getMarkedRefs();
        java.io.File file16 = garbageCollectorFileState14.getGcCandidates();
        java.io.File file17 = garbageCollectorFileState14.getGcCandidates();
        java.io.File file18 = garbageCollectorFileState14.getGarbage();
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobTracker.Options options19 = null;
        try {
            blobIdTracker12.remove(file18, options19);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertNotNull(file18);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setCloudContainer("markedTimestamp-,");
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats6 = cloudBlobStore0.getCacheStats();
        cloudBlobStore0.setCloudProvider("path");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cacheStats6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector11 = null;
        dataStoreBlobStore10.setBlobStatsCollector(blobStatsCollector11);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord14 = dataStoreBlobStore10.getAllMetadataRecords("BlobStoreStats");
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer15 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore10);
        org.junit.Assert.assertNull(list_dataRecord14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState1 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("path");
        java.io.File file2 = garbageCollectorFileState1.getMarkedRefs();
        org.junit.Assert.assertNotNull(file2);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        boolean b14 = oakFileDataStore0.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.DbDataStore");
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type15 = oakFileDataStore0.getType();
        int i17 = oakFileDataStore0.deleteAllOlderThan(10L);
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever18 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore19 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore21 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore19, false);
        dataStoreBlobStore21.deleteAllMetadataRecords("hi!");
        java.util.Iterator<java.lang.String> iterator_str25 = dataStoreBlobStore21.resolveChunks("BlobStoreStats");
        java.util.concurrent.Executor executor26 = null;
        org.apache.jackrabbit.oak.spi.whiteboard.Whiteboard whiteboard29 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector30 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever18, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore21, executor26, 0L, "fsBackendPath", whiteboard29);
        org.apache.jackrabbit.core.data.DataStore dataStore31 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore33 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore31, false);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord35 = dataStoreBlobStore33.getAllMetadataRecords("hi!");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore36 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long37 = cloudBlobStore36.getBlockSizeMin();
        int i38 = cloudBlobStore36.getBlockSize();
        java.lang.String str39 = cloudBlobStore36.getCloudProvider();
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer40 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore36);
        java.io.InputStream inputStream42 = cloudBlobStore36.getInputStream("Blob consistency check");
        dataStoreBlobStore33.addMetadataRecord(inputStream42, "markedTimestamp-Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        dataStoreBlobStore21.addMetadataRecord(inputStream42, "ConsolidatedDataStoreCacheStats");
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord47 = oakFileDataStore0.addRecord(inputStream42);
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type15.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(iterator_str25);
        org.junit.Assert.assertNull(list_dataRecord35);
        org.junit.Assert.assertTrue(long37 == 4096L);
        org.junit.Assert.assertTrue(i38 == 2097152);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(inputStream42);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        long long9 = cloudBlobStore0.getBlockSizeMin();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertTrue(long9 == 4096L);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        java.lang.String str1 = oakFileDataStore0.getPath();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier2 = null;
        try {
            org.apache.jackrabbit.core.data.DataRecord dataRecord3 = oakFileDataStore0.getRecordForId(dataIdentifier2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
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
        try {
            long long32 = dataStoreBlobStore2.getBlobLength("");
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
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
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
            java.io.InputStream inputStream35 = dataStoreBlobStore2.getInputStream("Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E:E5LTLPI37IVMKATAQ8ALEH76O4Q3G3MO");
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
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever1 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore2 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore4 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore2, false);
        java.util.concurrent.Executor executor5 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector10 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever1, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore4, executor5, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore11 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore4);
        java.io.File file13 = null;
        java.io.File file14 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file13);
        dataStoreBlobStore11.addMetadataRecord(file14, "BlobStore-MemCache");
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream17 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache19 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build((long) 100, file14, cacheloader_str_inputStream17, executorService18);
        java.io.File file23 = null;
        java.io.File file24 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file23);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file24);
        java.io.File file27 = null;
        java.io.File file28 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file27);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file28);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.upgrade(file24, file28, false, false);
        java.io.File file34 = null;
        java.io.File file35 = org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUtils.getFile("ConsolidatedDataStoreCacheStats", file34);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file35);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file24, file35, false);
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.moveDownloadCache(file35);
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
        org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheUpgradeUtils.movePendingUploadsToStaging(file35, file53, false);
        com.google.common.cache.CacheLoader<java.lang.String, java.io.InputStream> cacheloader_str_inputStream59 = null;
        java.util.concurrent.ExecutorService executorService60 = null;
        org.apache.jackrabbit.oak.plugins.blob.FileCache fileCache61 = org.apache.jackrabbit.oak.plugins.blob.FileCache.build(4096L, file35, cacheloader_str_inputStream59, executorService60);
        fileCache19.put("markedTimestamp-*ERROR*-cachePath:0G2AAFROSC4I6B1US3JSJ8ORELIMI5RQ", file35);
        try {
            java.util.concurrent.ConcurrentMap<java.lang.String, java.io.File> concurrentmap_str_file63 = fileCache19.asMap();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNotNull(fileCache19);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertNotNull(file42);
        org.junit.Assert.assertNotNull(file46);
        org.junit.Assert.assertNotNull(file53);
        org.junit.Assert.assertNotNull(fileCache61);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        java.util.Properties properties1 = null;
        cachingFileDataStore0.setProperties(properties1);
        cachingFileDataStore0.setPath("cachePath");
        org.apache.jackrabbit.oak.stats.StatisticsProvider statisticsProvider5 = null;
        cachingFileDataStore0.setStatisticsProvider(statisticsProvider5);
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord7 = cachingFileDataStore0.getAllRecords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats garbageCollectionRepoStats0 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectionRepoStats();
        garbageCollectionRepoStats0.setLocal(false);
        long long3 = garbageCollectionRepoStats0.getLength();
        garbageCollectionRepoStats0.setLocal(false);
        garbageCollectionRepoStats0.setLength((long) (short) 100);
        garbageCollectionRepoStats0.setLocal(false);
        long long10 = garbageCollectionRepoStats0.getStartTime();
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertTrue(long10 == 0L);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
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
        org.apache.jackrabbit.oak.plugins.blob.datastore.BlobIdTracker.ActiveDeletionTracker activeDeletionTracker21 = blobIdTracker12.getDeleteTracker();
        java.io.File file23 = activeDeletionTracker21.retrieve("*ERROR*-cachePath:BLCAOOI7O571OEHF49DE88F431E7SJ8V");
        org.junit.Assert.assertNull(dataRecord11);
        org.junit.Assert.assertNotNull(iterator_str19);
        org.junit.Assert.assertNotNull(activeDeletionTracker21);
        org.junit.Assert.assertNotNull(file23);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        boolean b11 = dataStoreBlobStore3.deleteMetadataRecord("");
        try {
            java.io.InputStream inputStream13 = dataStoreBlobStore3.getInputStream("markedTimestamp-*ERROR*-cachePath:D7HRFQQIO3566IETTFV5K16NAUPUR5E0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector11 = null;
        dataStoreBlobStore10.setBlobStatsCollector(blobStatsCollector11);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord14 = dataStoreBlobStore10.getAllMetadataRecords("BlobStoreStats");
        try {
            java.lang.String str16 = dataStoreBlobStore10.getReference("*ERROR*-cachePath:D7HRFQQIO3566IETTFV5K16NAUPUR5E0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_dataRecord14);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        org.apache.jackrabbit.core.data.DataIdentifier dataIdentifier3 = null;
        try {
            fSBackend0.deleteRecord(dataIdentifier3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        java.lang.String str3 = cloudBlobStore0.getCloudProvider();
        try {
            java.lang.String str5 = cloudBlobStore0.writeBlob("*ERROR*-cachePath");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertTrue(long1 == 4096L);
        org.junit.Assert.assertTrue(i2 == 2097152);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        java.util.Properties properties1 = null;
        fSBackend0.setProperties(properties1);
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord3 = fSBackend0.getAllRecords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        org.apache.jackrabbit.oak.plugins.blob.BlobGarbageCollector blobGarbageCollector0 = null;
        java.util.concurrent.Executor executor1 = null;
        try {
            org.apache.jackrabbit.oak.plugins.blob.BlobGC blobGC2 = new org.apache.jackrabbit.oak.plugins.blob.BlobGC(blobGarbageCollector0, executor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        oakFileDataStore0.init("cachePath");
        oakFileDataStore0.deleteAllMetadataRecords("cachePath");
        org.apache.jackrabbit.core.data.DataRecord dataRecord14 = oakFileDataStore0.getMetadataRecord("");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore17 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) oakFileDataStore0, false, 100);
        boolean b18 = org.apache.jackrabbit.oak.plugins.blob.datastore.SharedDataStoreUtils.isShared((org.apache.jackrabbit.oak.spi.blob.BlobStore) dataStoreBlobStore17);
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNull(dataRecord14);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        org.apache.jackrabbit.oak.plugins.blob.BlobReferenceRetriever blobReferenceRetriever0 = null;
        org.apache.jackrabbit.core.data.DataStore dataStore1 = null;
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore3 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore(dataStore1, false);
        java.util.concurrent.Executor executor4 = null;
        org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector markSweepGarbageCollector9 = new org.apache.jackrabbit.oak.plugins.blob.MarkSweepGarbageCollector(blobReferenceRetriever0, (org.apache.jackrabbit.oak.spi.blob.GarbageCollectableBlobStore) dataStoreBlobStore3, executor4, "cacheSize", 100, (long) '#', "cacheSize");
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) dataStoreBlobStore3);
        org.apache.jackrabbit.oak.spi.blob.stats.BlobStatsCollector blobStatsCollector11 = null;
        dataStoreBlobStore10.setBlobStatsCollector(blobStatsCollector11);
        boolean b14 = dataStoreBlobStore10.deleteMetadataRecord("Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E");
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        java.util.Properties properties3 = null;
        fSBackend0.setProperties(properties3);
        try {
            java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord5 = fSBackend0.getAllRecords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array3 = fSBackend0.getOrCreateReferenceKey();
        java.util.Properties properties4 = null;
        fSBackend0.setProperties(properties4);
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore6 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore6.clearCache();
        java.lang.String str8 = cloudBlobStore6.getAccessKey();
        java.lang.String str9 = cloudBlobStore6.getAccessKey();
        java.lang.String str11 = cloudBlobStore6.getBlobId("Blob garbage collection");
        cloudBlobStore6.setCloudContainer("encodeLengthInId");
        java.io.InputStream inputStream15 = cloudBlobStore6.getInputStream("cachePath");
        try {
            fSBackend0.addMetadataRecord(inputStream15, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.jackrabbit.core.data.DataStoreException");
        } catch (org.apache.jackrabbit.core.data.DataStoreException e) {
        }
        org.junit.Assert.assertNotNull(byte_array1);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(byte_array3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(inputStream15);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState1 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("path");
        java.io.File file2 = garbageCollectorFileState1.getGarbage();
        garbageCollectorFileState1.close();
        org.junit.Assert.assertNotNull(file2);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        int i1 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setMinRecordLength((int) (byte) 100);
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setCacheSize((long) 10);
        org.junit.Assert.assertTrue(i1 == 16384);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED + "'", type4.equals(org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type.SHARED));
    }
}

