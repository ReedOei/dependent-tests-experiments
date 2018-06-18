import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord inMemoryDataRecord1 = org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord.getInstance("BlobStoreStats");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord1 = oakFileDataStore0.getAllRecords();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord2 = fSBackend0.getAllMetadataRecords("/tmp");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord inMemoryDataRecord1 = org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord.getInstance("Blob migration");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord inMemoryDataRecord1 = org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord.getInstance("markedTimestamp-,");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier1 = oakFileDataStore0.getAllIdentifiers();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        fSBackend0.deleteAllMetadataRecords("fsBackendPath");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.deleteAllMetadataRecords("markedTimestamp");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        fSBackend0.init();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        org.apache.jackrabbit.core.data.DataRecord dataRecord10 = oakFileDataStore0.getMetadataRecord("BlobStore-MemCache");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord inMemoryDataRecord1 = org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord.getInstance("fsBackendPath");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        int i4 = oakFileDataStore0.deleteAllOlderThan((long) 1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = oakFileDataStore0.getType();
        org.apache.jackrabbit.core.data.DataRecord dataRecord3 = oakFileDataStore0.getMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.deleteAllMetadataRecords("");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        javax.management.MBeanInfo mBeanInfo2 = blobMigration0.getMBeanInfo();
        java.lang.String str3 = blobMigration0.stopBlobMigration();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        fSBackend0.deleteAllMetadataRecords("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.deleteAllMetadataRecords("/tmp");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.init();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        fSBackend0.deleteAllMetadataRecords("fsBackendPath");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = oakFileDataStore0.getType();
        java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier2 = oakFileDataStore0.getAllIdentifiers();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        cloudBlobStore0.init();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        fSBackend0.init();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        cloudBlobStore0.init();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.startMark();
        java.lang.String[] str_array17 = new java.lang.String[] { "path", "cacheSize", "/tmp", "org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", "path", "path", "markedTimestamp-,", "markedTimestamp-/tmp", "cachePath", "cacheSize", "fsBackendPath", "cachePath" };
        java.util.ArrayList<java.lang.String> arraylist_str18 = new java.util.ArrayList<java.lang.String>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str18, str_array17);
        boolean b21 = cloudBlobStore0.deleteChunks((java.util.List<java.lang.String>) arraylist_str18, (long) (byte) 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier2 = oakFileDataStore0.getAllIdentifiers();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.core.data.DataRecord dataRecord5 = cachingFileDataStore0.getMetadataRecord("encodeLengthInId");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        oakFileDataStore0.setReferenceKeyPlainText("Blob garbage collection");
        boolean b8 = oakFileDataStore0.deleteMetadataRecord(",");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        boolean b5 = cachingFileDataStore0.deleteMetadataRecord("BlobStore-MemCache");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord5 = oakFileDataStore0.getAllRecords();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        org.apache.jackrabbit.core.data.DataRecord dataRecord2 = fSBackend0.getMetadataRecord("BlobStore-MemCache");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        oakFileDataStore0.setReferenceKeyPlainText("Blob garbage collection");
        org.apache.jackrabbit.core.data.DataRecord dataRecord8 = oakFileDataStore0.getMetadataRecord("Migration started");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.clearInUse();
        boolean b5 = oakFileDataStore0.deleteMetadataRecord("Migration started");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore1 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        consolidatedDataStoreCacheStats0.cachingDataStore = cachingFileDataStore2;
        cachingFileDataStore2.close();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats1 = cloudBlobStore0.getCacheStats();
        long long2 = cloudBlobStore0.getBlobCacheSize();
        java.lang.String[] str_array6 = new java.lang.String[] { "cachePath", "hi!", "markedTimestamp-/tmp" };
        java.util.ArrayList<java.lang.String> arraylist_str7 = new java.util.ArrayList<java.lang.String>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str7, str_array6);
        long long10 = cloudBlobStore0.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str7, (long) ' ');
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats1 = cloudBlobStore0.getCacheStats();
        cloudBlobStore0.init();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        cloudBlobStore0.init();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState garbageCollectorFileState5 = new org.apache.jackrabbit.oak.plugins.blob.GarbageCollectorFileState("cachePath");
        java.io.File file6 = garbageCollectorFileState5.getMarkedRefs();
        java.io.File file7 = garbageCollectorFileState5.getGcCandidates();
        cachingFileDataStore0.addMetadataRecord(file7, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord inMemoryDataRecord1 = org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord.getInstance(",");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        java.util.Iterator<java.lang.String> iterator_str3 = cloudBlobStore0.getAllChunkIds((long) ' ');
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        boolean b3 = fSBackend0.deleteMetadataRecord("markedTimestamp-,");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.deleteAllMetadataRecords("Migration started");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setMinRecordLength(0);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord7 = cachingFileDataStore0.getAllMetadataRecords("BlobStore-MemCache");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        boolean b2 = fSBackend0.deleteMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.clearCache();
        java.lang.String str5 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.deleteBucket();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration0.preDeregister();
        java.lang.String str3 = blobMigration0.startBlobMigration(false);
        java.lang.Class<?> cls4 = blobMigration0.getMBeanInterface();
        javax.management.openmbean.CompositeData compositeData5 = blobMigration0.getBlobMigrationStatus();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        byte[] byte_array7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        oakFileDataStore0.setReferenceKey(byte_array7);
        java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier9 = oakFileDataStore0.getAllIdentifiers();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Object obj1 = blobMigration0.getImplementation();
        java.lang.Class<?> cls2 = blobMigration0.getImplementationClass();
        javax.management.openmbean.CompositeData compositeData3 = blobMigration0.getBlobMigrationStatus();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = cachingFileDataStore0.getType();
        java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier2 = cachingFileDataStore0.getAllIdentifiers();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        org.apache.jackrabbit.core.data.DataRecord dataRecord4 = fSBackend0.getMetadataRecord("markedTimestamp-/tmp");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        java.util.List<org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheStatsMBean> list_dataStoreCacheStatsMBean5 = cachingFileDataStore0.getStats();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier3 = fSBackend0.getAllIdentifiers();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        fSBackend0.deleteAllMetadataRecords("*ERROR*-cachePath");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        cloudBlobStore0.deleteBucket();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.clearInUse();
        java.lang.String str4 = oakFileDataStore0.getPath();
        java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord5 = oakFileDataStore0.getAllRecords();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        boolean b2 = fSBackend0.deleteMetadataRecord("/tmp");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        oakFileDataStore0.setReferenceKeyPlainText("Blob garbage collection");
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.deleteAllMetadataRecords("repository-*ERROR*-cachePath");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = cachingFileDataStore0.getType();
        cachingFileDataStore0.init(",");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        int i2 = cloudBlobStore0.getBlockSize();
        cloudBlobStore0.clearCache();
        java.lang.String[] str_array30 = new java.lang.String[] { "path", "ConsolidatedDataStoreCacheStats", "hi!", "encodeLengthInId", "path", "markedTimestamp-,", "markedTimestamp", "markedTimestamp-,", "hi!", "repository-*ERROR*-cachePath", "", "blob", "MemCache", "", ",", "Migration started", "fsBackendPath", "cachePath", "ReferencedBlob{blob=null, id='BlobStoreStats'}", "Migration started", "encodeLengthInId", "markedTimestamp-,", "cacheSizeInMB", "cacheSizeInMB", "BlobStoreStats", "*ERROR*-cachePath" };
        java.util.ArrayList<java.lang.String> arraylist_str31 = new java.util.ArrayList<java.lang.String>();
        boolean b32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str31, str_array30);
        boolean b34 = cloudBlobStore0.deleteChunks((java.util.List<java.lang.String>) arraylist_str31, (long) (short) 10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration0.preDeregister();
        java.lang.String str3 = blobMigration0.startBlobMigration(false);
        java.lang.String str4 = blobMigration0.stopBlobMigration();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        org.apache.jackrabbit.core.data.DataRecord dataRecord4 = oakFileDataStore0.getMetadataRecord("hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        cloudBlobStore0.setSecretKey("markedTimestamp");
        cloudBlobStore0.setSecretKey("*ERROR*-ConsolidatedDataStoreCacheStats");
        cloudBlobStore0.deleteBucket();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingRetryInterval(16);
        cachingFileDataStore0.setStagingPurgeInterval((int) (short) 10);
        java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord9 = cachingFileDataStore0.getAllRecords();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        cachingFileDataStore0.setCacheSize((long) 'a');
        boolean b7 = cachingFileDataStore0.deleteMetadataRecord("/tmp");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord17 = oakFileDataStore0.getAllMetadataRecords("MemCache");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        cloudBlobStore0.init();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        long long1 = cloudBlobStore0.getBlockSizeMin();
        int i2 = cloudBlobStore0.getBlockSize();
        int i3 = cloudBlobStore0.sweep();
        java.io.InputStream inputStream5 = cloudBlobStore0.getInputStream("*ERROR*-cachePath");
        java.util.Iterator<java.lang.String> iterator_str7 = cloudBlobStore0.getAllChunkIds((long) 16);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        blobMigration0.preDeregister();
        java.lang.String str3 = blobMigration0.startBlobMigration(false);
        javax.management.openmbean.CompositeData compositeData4 = blobMigration0.getBlobMigrationStatus();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore1 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        consolidatedDataStoreCacheStats0.cachingDataStore = cachingFileDataStore2;
        org.apache.jackrabbit.core.data.DataRecord dataRecord5 = cachingFileDataStore2.getMetadataRecord("cachePath");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        fSBackend0.deleteAllMetadataRecords("BlobStore-MemCache");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.clearInUse();
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord5 = oakFileDataStore0.getAllMetadataRecords("cachePath/repository/datastore");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array3 = fSBackend0.getOrCreateReferenceKey();
        fSBackend0.deleteAllMetadataRecords("markedTimestamp");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array3 = fSBackend0.getOrCreateReferenceKey();
        fSBackend0.close();
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord6 = fSBackend0.getAllMetadataRecords("blob");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.postDeregister();
        javax.management.openmbean.CompositeData compositeData3 = blobMigration0.getBlobMigrationStatus();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingPurgeInterval(16);
        java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord4 = cachingFileDataStore0.getAllRecords();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array3 = fSBackend0.getOrCreateReferenceKey();
        fSBackend0.init();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        java.lang.Class<?> cls1 = blobMigration0.getMBeanInterface();
        java.lang.String str3 = blobMigration0.startBlobMigration(false);
        javax.management.openmbean.CompositeData compositeData4 = blobMigration0.getBlobMigrationStatus();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array3 = fSBackend0.getOrCreateReferenceKey();
        fSBackend0.close();
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord6 = fSBackend0.getAllMetadataRecords("markedTimestamp-/tmp");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore9 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0);
        java.util.List<org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheStatsMBean> list_dataStoreCacheStatsMBean10 = cachingFileDataStore0.getStats();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        org.apache.jackrabbit.core.data.DataRecord dataRecord2 = fSBackend0.getMetadataRecord("cacheSizeInMB");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        oakFileDataStore0.updateModifiedDateOnAccess((long) 10);
        int i8 = oakFileDataStore0.deleteAllOlderThan((long) '4');
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        cloudBlobStore0.clearCache();
        java.lang.String str2 = cloudBlobStore0.getAccessKey();
        java.lang.String str3 = cloudBlobStore0.getAccessKey();
        cloudBlobStore0.setCloudProvider("*ERROR*-cachePath");
        cloudBlobStore0.setReferenceKeyPlainText("markedTimestamp-/tmp");
        java.io.InputStream inputStream9 = cloudBlobStore0.getInputStream("cachePath");
        java.lang.String[] str_array46 = new java.lang.String[] { "", "Migration started", "BlobStoreStats", "Migration started", "Blob migration:5BLDB1SVB7VKPR3D9TL90A4EEHT79NKP", "ReferencedBlob{blob=null, id='BlobStoreStats'}", "ConsolidatedDataStoreCacheStats", "DataStore backed BlobStore [org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore]", "markedTimestamp-markedTimestamp-,", "Blob migration:E4AC6S9M3MKKG06J55T7HB9QS08CIT69", "*ERROR*-cachePath", "*ERROR*-hi!", "hi!", "repository-*ERROR*-cachePath", "markedTimestamp-/tmp", "MemCache", "Blob migration:E4AC6S9M3MKKG06J55T7HB9QS08CIT69", "*ERROR*-cachePath", "Blob garbage collection", "markedTimestamp-,", "ReferencedBlob{blob=null, id='BlobStoreStats'}", "ConsolidatedDataStoreCacheStats", "markedTimestamp-*ERROR*-cachePath:D7HRFQQIO3566IETTFV5K16NAUPUR5E0", "", "markedTimestamp", "Blob migration:E4AC6S9M3MKKG06J55T7HB9QS08CIT69", "/tmp", "", "cachePath/repository/datastore", "BlobStoreStats", "Blob migration:SMUN4UIN3QPVCVFKCNQDS3EI48VKS74E", "*ERROR*-cachePath:R7K2O1QNMPUUDB64F6QSN07F4U2RFK9S", "markedTimestamp-,", "*ERROR*-cachePath:R7K2O1QNMPUUDB64F6QSN07F4U2RFK9S", "*ERROR*-cachePath:D7HRFQQIO3566IETTFV5K16NAUPUR5E0", "*ERROR*-cachePath:D7HRFQQIO3566IETTFV5K16NAUPUR5E0" };
        java.util.ArrayList<java.lang.String> arraylist_str47 = new java.util.ArrayList<java.lang.String>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str47, str_array46);
        long long50 = cloudBlobStore0.countDeleteChunks((java.util.List<java.lang.String>) arraylist_str47, 0L);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.deleteAllMetadataRecords("Blob garbage collection");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats1 = cloudBlobStore0.getCacheStats();
        long long2 = cloudBlobStore0.getBlobCacheSize();
        java.lang.String str4 = cloudBlobStore0.getReference("Blob migration");
        java.lang.String str5 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.startMark();
        cloudBlobStore0.init();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration blobMigration0 = new org.apache.jackrabbit.oak.plugins.blob.migration.BlobMigration();
        javax.management.MBeanInfo mBeanInfo1 = blobMigration0.getMBeanInfo();
        blobMigration0.preDeregister();
        blobMigration0.preDeregister();
        java.lang.String str5 = blobMigration0.startBlobMigration(true);
        java.lang.String str6 = blobMigration0.stopBlobMigration();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier7 = cachingFileDataStore0.getAllIdentifiers();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingRetryInterval(16);
        cachingFileDataStore0.setMinRecordLength((-1));
        org.apache.jackrabbit.core.data.DataRecord dataRecord10 = cachingFileDataStore0.getMetadataRecord("/tmp");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setPath("markedTimestamp-,");
        cachingFileDataStore0.setUploadThreads((int) (byte) -1);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore10 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0, false);
        java.util.Iterator<org.apache.jackrabbit.core.data.DataRecord> iterator_dataRecord11 = cachingFileDataStore0.getAllRecords();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.setSecretKey(",");
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str8 = cloudBlobStore0.resolveChunks("");
        java.util.Iterator<java.lang.String> iterator_str10 = cloudBlobStore0.getAllChunkIds((long) 10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = cachingFileDataStore0.getType();
        cachingFileDataStore0.init("MemCache");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        oakFileDataStore0.setReferenceKeyPlainText("Blob garbage collection");
        oakFileDataStore0.clearInUse();
        org.apache.jackrabbit.core.data.DataRecord dataRecord9 = oakFileDataStore0.getMetadataRecord("cacheSizeInMB");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array3 = fSBackend0.getOrCreateReferenceKey();
        org.apache.jackrabbit.core.data.DataRecord dataRecord5 = fSBackend0.getMetadataRecord("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend fSBackend0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.FSBackend();
        byte[] byte_array1 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array2 = fSBackend0.getOrCreateReferenceKey();
        byte[] byte_array3 = fSBackend0.getOrCreateReferenceKey();
        boolean b5 = fSBackend0.deleteMetadataRecord("encodeLengthInId");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.clearCache();
        java.lang.String str5 = cloudBlobStore0.getSecretKey();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats6 = cloudBlobStore0.getCacheStats();
        org.apache.jackrabbit.oak.cache.CacheStats cacheStats7 = cloudBlobStore0.getCacheStats();
        cloudBlobStore0.setSecretKey("org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore");
        org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer blobIdSerializer10 = new org.apache.jackrabbit.oak.plugins.blob.serializer.BlobIdSerializer((org.apache.jackrabbit.oak.spi.blob.BlobStore) cloudBlobStore0);
        cloudBlobStore0.init();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type1 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingPurgeInterval(16);
        org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore dataStoreBlobStore6 = new org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreBlobStore((org.apache.jackrabbit.core.data.DataStore) cachingFileDataStore0, false, (int) (byte) 0);
        java.util.List<org.apache.jackrabbit.core.data.DataRecord> list_dataRecord8 = cachingFileDataStore0.getAllMetadataRecords("cachePath");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord inMemoryDataRecord1 = org.apache.jackrabbit.oak.plugins.blob.datastore.InMemoryDataRecord.getInstance("ReferencedBlob{blob=null, id='BlobStoreStats'}");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats consolidatedDataStoreCacheStats0 = new org.apache.jackrabbit.oak.plugins.blob.ConsolidatedDataStoreCacheStats();
        org.apache.jackrabbit.oak.plugins.blob.AbstractSharedCachingDataStore abstractSharedCachingDataStore1 = consolidatedDataStoreCacheStats0.cachingDataStore;
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore2 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        consolidatedDataStoreCacheStats0.cachingDataStore = cachingFileDataStore2;
        java.util.List<org.apache.jackrabbit.oak.plugins.blob.DataStoreCacheStatsMBean> list_dataStoreCacheStatsMBean4 = cachingFileDataStore2.getStats();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore cloudBlobStore0 = new org.apache.jackrabbit.oak.plugins.blob.cloud.CloudBlobStore();
        java.lang.String str2 = cloudBlobStore0.getBlobId("markedTimestamp");
        java.lang.String str3 = cloudBlobStore0.getSecretKey();
        cloudBlobStore0.clearCache();
        java.util.Iterator<java.lang.String> iterator_str6 = cloudBlobStore0.getAllChunkIds((long) (short) 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        boolean b2 = oakFileDataStore0.deleteMetadataRecord("*ERROR*-ConsolidatedDataStoreCacheStats");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingRetryInterval(16);
        cachingFileDataStore0.setStagingPurgeInterval((int) (short) 10);
        cachingFileDataStore0.setMinRecordLength(52);
        java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier11 = cachingFileDataStore0.getAllIdentifiers();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore oakFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.OakFileDataStore();
        oakFileDataStore0.close();
        oakFileDataStore0.clearInUse();
        oakFileDataStore0.setMinRecordLength(100);
        oakFileDataStore0.setReferenceKeyPlainText("Blob garbage collection");
        oakFileDataStore0.setMinRecordLength((int) (byte) 10);
        org.apache.jackrabbit.core.data.DataRecord dataRecord10 = oakFileDataStore0.getMetadataRecord(",");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore cachingFileDataStore0 = new org.apache.jackrabbit.oak.plugins.blob.datastore.CachingFileDataStore();
        cachingFileDataStore0.setStagingSplitPercentage(100);
        int i3 = cachingFileDataStore0.getMinRecordLength();
        org.apache.jackrabbit.oak.plugins.blob.SharedDataStore.Type type4 = cachingFileDataStore0.getType();
        cachingFileDataStore0.setStagingRetryInterval(16);
        java.util.Iterator<org.apache.jackrabbit.core.data.DataIdentifier> iterator_dataIdentifier7 = cachingFileDataStore0.getAllIdentifiers();
    }
}
