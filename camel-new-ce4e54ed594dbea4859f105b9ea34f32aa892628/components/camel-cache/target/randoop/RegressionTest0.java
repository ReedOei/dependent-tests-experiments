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
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory2 = cacheComponent1.getCacheManagerFactory();
        try {
            org.apache.camel.EndpointConfiguration endpointConfiguration4 = cacheComponent1.createConfiguration("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(cacheManagerFactory2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory2 = cacheComponent1.getCacheManagerFactory();
        try {
            boolean b3 = cacheManagerFactory2.isSuspended();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(cacheManagerFactory2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus3 = cacheComponent1.getStatus();
        try {
            org.apache.camel.Endpoint endpoint5 = cacheComponent1.createEndpoint("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertTrue("'" + serviceStatus3 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus3.equals(org.apache.camel.ServiceStatus.Stopped));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.camel.processor.cache.CacheValidate cacheValidate0 = new org.apache.camel.processor.cache.CacheValidate();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        try {
            org.apache.camel.Endpoint endpoint4 = cacheComponent1.createEndpoint("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(componentConfiguration2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        boolean b3 = cacheComponent1.isStopped();
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        boolean b2 = cacheComponent1.useRawUri();
        java.util.Collection<java.lang.Class<? extends org.apache.camel.component.extension.ComponentExtension>> collection_cls3 = cacheComponent1.getSupportedExtensions();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(collection_cls3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        java.lang.Object obj4 = cacheEventListener1.clone();
        net.sf.ehcache.Ehcache ehcache5 = null;
        try {
            cacheEventListener1.notifyRemoveAll(ehcache5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        net.sf.ehcache.Ehcache ehcache4 = null;
        try {
            cacheEventListener1.notifyRemoveAll(ehcache4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        boolean b14 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.CamelContext camelContext15 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent16 = new org.apache.camel.component.cache.CacheComponent(camelContext15);
        org.apache.camel.ComponentConfiguration componentConfiguration17 = cacheComponent16.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus18 = cacheComponent16.getStatus();
        boolean b19 = cacheComponent16.isStarted();
        boolean b20 = cacheComponent16.useRawUri();
        boolean b21 = cacheEndpoint12.equals((java.lang.Object) b20);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(componentConfiguration17);
        org.junit.Assert.assertTrue("'" + serviceStatus18 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus18.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.io.InputStream inputStream0 = null;
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory2 = new org.apache.camel.component.cache.DefaultCacheManagerFactory(inputStream0, "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        net.sf.ehcache.Ehcache ehcache3 = null;
        net.sf.ehcache.Element element4 = null;
        try {
            cacheEventListener1.notifyElementUpdated(ehcache3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        net.sf.ehcache.Ehcache ehcache4 = null;
        net.sf.ehcache.Element element5 = null;
        try {
            cacheEventListener1.notifyElementUpdated(ehcache4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression3 = cacheBasedMessageBodyReplacer2.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer6 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression7 = cacheBasedMessageBodyReplacer6.getKey();
        cacheBasedMessageBodyReplacer2.setKey(expression7);
        org.apache.camel.Exchange exchange9 = null;
        try {
            cacheBasedMessageBodyReplacer2.process(exchange9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(expression3);
        org.junit.Assert.assertNotNull(expression7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy5 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy5);
        cacheConfiguration0.setCacheName("");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory2 = cacheComponent1.getCacheManagerFactory();
        java.util.Collection<java.lang.Class<? extends org.apache.camel.component.extension.ComponentExtension>> collection_cls3 = cacheComponent1.getSupportedExtensions();
        boolean b4 = cacheComponent1.isSuspending();
        try {
            org.apache.camel.Endpoint endpoint6 = cacheComponent1.createEndpoint("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(cacheManagerFactory2);
        org.junit.Assert.assertNotNull(collection_cls3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.camel.component.cache.CacheEventListener cacheEventListener0 = new org.apache.camel.component.cache.CacheEventListener();
        net.sf.ehcache.Ehcache ehcache1 = null;
        net.sf.ehcache.Element element2 = null;
        try {
            cacheEventListener0.notifyElementRemoved(ehcache1, element2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer3 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint4 = cacheProducer3.getEndpoint();
        try {
            boolean b5 = cacheProducer3.isSingleton();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertNull(cacheEndpoint4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj14 = null;
        try {
            cacheEndpoint12.configureProperties(map_str_obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression3 = cacheBasedMessageBodyReplacer2.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer6 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression7 = cacheBasedMessageBodyReplacer6.getKey();
        cacheBasedMessageBodyReplacer2.setKey(expression7);
        cacheBasedMessageBodyReplacer2.setCacheName("");
        org.junit.Assert.assertNotNull(expression3);
        org.junit.Assert.assertNotNull(expression7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry0 = new org.apache.camel.component.cache.CacheLoaderRegistry();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory2 = cacheComponent1.getCacheManagerFactory();
        java.util.Collection<java.lang.Class<? extends org.apache.camel.component.extension.ComponentExtension>> collection_cls3 = cacheComponent1.getSupportedExtensions();
        boolean b4 = cacheComponent1.isSuspending();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory5 = cacheComponent1.getCacheManagerFactory();
        org.junit.Assert.assertNull(cacheManagerFactory2);
        org.junit.Assert.assertNotNull(collection_cls3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(cacheManagerFactory5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        boolean b14 = cacheEndpoint12.isBridgeErrorHandler();
        int i15 = cacheEndpoint12.getPollingConsumerQueueSize();
        cacheEndpoint12.shutdown();
        int i17 = cacheEndpoint12.getPollingConsumerQueueSize();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1000);
        org.junit.Assert.assertTrue(i17 == 1000);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        cacheComponent1.setResolvePropertyPlaceholders(false);
        try {
            org.apache.camel.EndpointConfiguration endpointConfiguration5 = cacheComponent1.createConfiguration("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        java.util.List<net.sf.ehcache.event.CacheEventListener> list_cacheEventListener1 = cacheEventListenerRegistry0.getEventListeners();
        org.junit.Assert.assertNotNull(list_cacheEventListener1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.camel.component.cache.CacheConsumer cacheConsumer0 = null;
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer0);
        net.sf.ehcache.Ehcache ehcache2 = null;
        try {
            cacheEventListener1.notifyRemoveAll(ehcache2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        java.lang.Object obj4 = cacheEventListener1.clone();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer5 = cacheEventListener1.getCacheConsumer();
        net.sf.ehcache.Ehcache ehcache6 = null;
        net.sf.ehcache.Element element7 = null;
        try {
            cacheEventListener1.notifyElementExpired(ehcache6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(cacheConsumer5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        java.lang.Object obj4 = cacheEventListener1.clone();
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        try {
            cacheEventListener1.notifyElementRemoved(ehcache5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory2 = cacheComponent1.getCacheManagerFactory();
        try {
            boolean b3 = cacheManagerFactory2.isStarting();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(cacheManagerFactory2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression3 = cacheBasedMessageBodyReplacer2.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer7 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression8 = cacheBasedMessageBodyReplacer7.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer10 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression8, "");
        cacheBasedMessageBodyReplacer2.setKey(expression8);
        cacheBasedMessageBodyReplacer2.stop();
        org.junit.Assert.assertNotNull(expression3);
        org.junit.Assert.assertNotNull(expression8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        try {
            org.apache.camel.Endpoint endpoint4 = cacheComponent1.createEndpoint("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(componentConfiguration2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer4 = cacheEventListener1.getCacheConsumer();
        net.sf.ehcache.Ehcache ehcache5 = null;
        try {
            cacheEventListener1.notifyRemoveAll(ehcache5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(cacheConsumer4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        org.apache.camel.Processor processor14 = null;
        org.apache.camel.Consumer consumer15 = cacheEndpoint12.createConsumer(processor14);
        org.apache.camel.PollingConsumer pollingConsumer16 = cacheEndpoint12.createPollingConsumer();
        cacheEndpoint12.stop();
        int i18 = cacheEndpoint12.getPollingConsumerQueueSize();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration21 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration21.setOverflowToDisk(true);
        cacheConfiguration21.setTimeToLiveSeconds((long) (short) -1);
        boolean b26 = cacheConfiguration21.isOverflowToDisk();
        try {
            org.apache.camel.Exchange exchange27 = cacheEndpoint12.createCacheExchange("", "", (java.lang.Object) b26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertNotNull(consumer15);
        org.junit.Assert.assertNotNull(pollingConsumer16);
        org.junit.Assert.assertTrue(i18 == 1000);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy5 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy5);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry7 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry7);
        int i9 = cacheConfiguration0.getMaxElementsInMemory();
        java.lang.String str10 = cacheConfiguration0.getCacheName();
        boolean b11 = cacheConfiguration0.isObjectCache();
        org.junit.Assert.assertTrue(i9 == 1000);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy1 = org.apache.camel.component.cache.CacheConverter.toPolicy("hi!");
        org.junit.Assert.assertNotNull(memoryStoreEvictionPolicy1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer6 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression4, "");
        org.apache.camel.Expression expression7 = cacheBasedTokenReplacer6.getKey();
        java.lang.String str8 = cacheBasedTokenReplacer6.getReplacementToken();
        org.apache.camel.CamelContext camelContext10 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent11 = new org.apache.camel.component.cache.CacheComponent(camelContext10);
        boolean b12 = cacheComponent11.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory13 = cacheComponent11.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint14 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration15 = new org.apache.camel.component.cache.CacheConfiguration();
        long long16 = cacheConfiguration15.getTimeToIdleSeconds();
        cacheConfiguration15.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer19 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint14, cacheConfiguration15);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory20 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint21 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent11, cacheConfiguration15, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory20);
        org.apache.camel.CamelContext camelContext22 = cacheEndpoint21.getCamelContext();
        org.apache.camel.EndpointConfiguration endpointConfiguration23 = null;
        cacheEndpoint21.setEndpointConfiguration(endpointConfiguration23);
        cacheEndpoint21.setEndpointUriIfNotSpecified("");
        org.apache.camel.ExchangePattern exchangePattern27 = null;
        org.apache.camel.Exchange exchange28 = cacheEndpoint21.createExchange(exchangePattern27);
        try {
            cacheBasedTokenReplacer6.process(exchange28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertNotNull(expression7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(cacheManagerFactory13);
        org.junit.Assert.assertTrue(long16 == 300L);
        org.junit.Assert.assertNull(camelContext22);
        org.junit.Assert.assertNotNull(exchange28);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.EndpointConfiguration endpointConfiguration14 = null;
        cacheEndpoint12.setEndpointConfiguration(endpointConfiguration14);
        boolean b16 = cacheEndpoint12.isBridgeErrorHandler();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        cacheComponent2.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration5 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration5.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = null;
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry8);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory10 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint11 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration5, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory10);
        cacheConfiguration5.setTimeToLiveSeconds((long) 100);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        boolean b14 = cacheEndpoint12.isBridgeErrorHandler();
        int i15 = cacheEndpoint12.getPollingConsumerQueueSize();
        cacheEndpoint12.shutdown();
        boolean b17 = cacheEndpoint12.isSuspending();
        try {
            org.apache.camel.EndpointConfiguration endpointConfiguration18 = cacheEndpoint12.getEndpointConfiguration();
            org.junit.Assert.fail("Expected exception of type org.apache.camel.RuntimeCamelException");
        } catch (org.apache.camel.RuntimeCamelException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1000);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        java.lang.Class<? extends org.apache.camel.Endpoint> cls3 = cacheComponent1.getEndpointClass();
        boolean b4 = cacheComponent1.isSuspended();
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertNotNull(cls3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.Producer producer14 = cacheEndpoint12.createProducer();
        boolean b15 = cacheEndpoint12.isStarted();
        org.apache.camel.PollingConsumer pollingConsumer16 = cacheEndpoint12.createPollingConsumer();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(producer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(pollingConsumer16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        boolean b14 = cacheEndpoint12.isLenientProperties();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        boolean b14 = cacheEndpoint12.isStarting();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        java.lang.Class<? extends org.apache.camel.Endpoint> cls3 = cacheComponent1.getEndpointClass();
        try {
            org.apache.camel.Endpoint endpoint5 = cacheComponent1.createEndpoint("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertNotNull(cls3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj15 = null;
        cacheEndpoint12.setConsumerProperties(map_str_obj15);
        cacheEndpoint12.shutdown();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory13 = cacheComponent2.getCacheManagerFactory();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(cacheManagerFactory13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        long long1 = cacheConfiguration0.getTimeToIdleSeconds();
        long long2 = cacheConfiguration0.getTimeToIdleSeconds();
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy3 = cacheConfiguration0.getMemoryStoreEvictionPolicy();
        long long4 = cacheConfiguration0.getTimeToIdleSeconds();
        org.junit.Assert.assertTrue(long1 == 300L);
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertNotNull(memoryStoreEvictionPolicy3);
        org.junit.Assert.assertTrue(long4 == 300L);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        java.lang.Object obj4 = cacheEventListener1.clone();
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        try {
            cacheEventListener1.notifyElementPut(ehcache5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.camel.component.cache.CacheComponent cacheComponent0 = new org.apache.camel.component.cache.CacheComponent();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = null;
        org.apache.camel.component.cache.CacheProducer cacheProducer2 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        boolean b3 = cacheProducer2.isStopping();
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setDiskStorePath("hi!");
        cacheConfiguration0.setDiskStorePath("hi!");
        long long5 = cacheConfiguration0.getTimeToIdleSeconds();
        org.junit.Assert.assertTrue(long5 == 300L);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        boolean b2 = cacheComponent1.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory3 = cacheComponent1.getCacheManagerFactory();
        cacheComponent1.resume();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(cacheManagerFactory3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        cacheConfiguration1.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer5 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        org.apache.camel.CamelContext camelContext7 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent8 = new org.apache.camel.component.cache.CacheComponent(camelContext7);
        boolean b9 = cacheComponent8.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory10 = cacheComponent8.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint11 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration12 = new org.apache.camel.component.cache.CacheConfiguration();
        long long13 = cacheConfiguration12.getTimeToIdleSeconds();
        cacheConfiguration12.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer16 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint11, cacheConfiguration12);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory17 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint18 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent8, cacheConfiguration12, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory17);
        org.apache.camel.CamelContext camelContext19 = cacheEndpoint18.getCamelContext();
        org.apache.camel.EndpointConfiguration endpointConfiguration20 = null;
        cacheEndpoint18.setEndpointConfiguration(endpointConfiguration20);
        cacheEndpoint18.setEndpointUriIfNotSpecified("");
        org.apache.camel.ExchangePattern exchangePattern24 = null;
        org.apache.camel.Exchange exchange25 = cacheEndpoint18.createExchange(exchangePattern24);
        try {
            org.apache.camel.Exchange exchange26 = cacheProducer5.createExchange(exchange25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(cacheManagerFactory10);
        org.junit.Assert.assertTrue(long13 == 300L);
        org.junit.Assert.assertNull(camelContext19);
        org.junit.Assert.assertNotNull(exchange25);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        long long1 = cacheConfiguration0.getTimeToIdleSeconds();
        cacheConfiguration0.setObjectCache(true);
        org.junit.Assert.assertTrue(long1 == 300L);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer3 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("hi!", "", "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.CamelContext camelContext14 = null;
        cacheEndpoint12.setCamelContext(camelContext14);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration13 = new org.apache.camel.component.cache.CacheConfiguration();
        long long14 = cacheConfiguration13.getTimeToIdleSeconds();
        long long15 = cacheConfiguration13.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer16 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration13);
        cacheEndpoint12.setBridgeErrorHandler(false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long14 == 300L);
        org.junit.Assert.assertTrue(long15 == 300L);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        cacheComponent1.setResolvePropertyPlaceholders(false);
        cacheComponent1.suspend();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory5 = cacheComponent1.getCacheManagerFactory();
        try {
            boolean b6 = cacheManagerFactory5.isSuspendingOrSuspended();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(cacheManagerFactory5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy5 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy5);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry7 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry7);
        int i9 = cacheConfiguration0.getMaxElementsInMemory();
        long long10 = cacheConfiguration0.getTimeToLiveSeconds();
        long long11 = cacheConfiguration0.getTimeToLiveSeconds();
        org.junit.Assert.assertTrue(i9 == 1000);
        org.junit.Assert.assertTrue(long10 == 300L);
        org.junit.Assert.assertTrue(long11 == 300L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer8 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression9 = cacheBasedMessageBodyReplacer8.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer11 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression9, "");
        cacheBasedMessageBodyReplacer3.setKey(expression9);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer14 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression9, "");
        cacheBasedXPathReplacer14.setCacheName("");
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertNotNull(expression9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        boolean b14 = cacheEndpoint12.isBridgeErrorHandler();
        int i15 = cacheEndpoint12.getPollingConsumerQueueSize();
        cacheEndpoint12.shutdown();
        cacheEndpoint12.setOperation("");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1000);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        java.lang.Class<? extends org.apache.camel.Endpoint> cls3 = cacheComponent1.getEndpointClass();
        boolean b4 = cacheComponent1.isStoppingOrStopped();
        cacheComponent1.stop();
        boolean b6 = cacheComponent1.isResolvePropertyPlaceholders();
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertNotNull(cls3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        java.lang.String str14 = cacheEndpoint12.getKey();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory15 = cacheEndpoint12.getCacheManagerFactory();
        java.lang.String str16 = cacheEndpoint12.getId();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(cacheManagerFactory15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "endpoint74" + "'", str16.equals("endpoint74"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer6 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression4, "");
        org.apache.camel.Expression expression7 = cacheBasedTokenReplacer6.getKey();
        org.apache.camel.Expression expression8 = cacheBasedTokenReplacer6.getKey();
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertNotNull(expression7);
        org.junit.Assert.assertNotNull(expression8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        long long1 = cacheConfiguration0.getTimeToIdleSeconds();
        long long2 = cacheConfiguration0.getTimeToIdleSeconds();
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy3 = cacheConfiguration0.getMemoryStoreEvictionPolicy();
        cacheConfiguration0.setMaxElementsInMemory((-1));
        org.junit.Assert.assertTrue(long1 == 300L);
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertNotNull(memoryStoreEvictionPolicy3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer6 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression4, "");
        cacheBasedTokenReplacer6.setKey("");
        org.junit.Assert.assertNotNull(expression4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression3 = cacheBasedMessageBodyReplacer2.getKey();
        cacheBasedMessageBodyReplacer2.setKey("hi!");
        org.junit.Assert.assertNotNull(expression3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        cacheConfiguration0.setTimeToLiveSeconds((long) (short) -1);
        long long5 = cacheConfiguration0.getTimeToIdleSeconds();
        org.junit.Assert.assertTrue(long5 == 300L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = null;
        org.apache.camel.component.cache.CacheProducer cacheProducer2 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        boolean b3 = cacheProducer2.isStopped();
        try {
            java.lang.String str4 = cacheProducer2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.ServiceStatus serviceStatus15 = cacheEndpoint12.getStatus();
        java.lang.String str16 = cacheEndpoint12.getEndpointUri();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = cacheEndpoint12.getConfig();
        boolean b18 = cacheEndpoint12.isStopped();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue("'" + serviceStatus15 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus15.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(cacheConfiguration17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.PollingConsumer pollingConsumer15 = cacheEndpoint12.createPollingConsumer();
        try {
            org.apache.camel.EndpointConfiguration endpointConfiguration16 = cacheEndpoint12.getEndpointConfiguration();
            org.junit.Assert.fail("Expected exception of type org.apache.camel.RuntimeCamelException");
        } catch (org.apache.camel.RuntimeCamelException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertNotNull(pollingConsumer15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy5 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy5);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry7 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry7);
        int i9 = cacheConfiguration0.getMaxElementsInMemory();
        int i10 = cacheConfiguration0.getMaxElementsInMemory();
        org.junit.Assert.assertTrue(i9 == 1000);
        org.junit.Assert.assertTrue(i10 == 1000);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.ServiceStatus serviceStatus15 = cacheEndpoint12.getStatus();
        java.lang.String str16 = cacheEndpoint12.getEndpointUri();
        boolean b17 = cacheEndpoint12.isLenientProperties();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue("'" + serviceStatus15 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus15.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory2 = cacheComponent1.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory3 = cacheComponent1.getCacheManagerFactory();
        org.junit.Assert.assertNull(cacheManagerFactory2);
        org.junit.Assert.assertNull(cacheManagerFactory3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.Producer producer14 = cacheEndpoint12.createProducer();
        boolean b15 = cacheEndpoint12.isStarted();
        cacheEndpoint12.setPollingConsumerBlockWhenFull(false);
        java.lang.String str18 = cacheEndpoint12.getEndpointKey();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(producer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer6 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression4, "");
        org.apache.camel.Expression expression7 = cacheBasedTokenReplacer6.getKey();
        java.lang.String str8 = cacheBasedTokenReplacer6.getReplacementToken();
        cacheBasedTokenReplacer6.stop();
        java.lang.String str10 = cacheBasedTokenReplacer6.getCacheName();
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertNotNull(expression7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        cacheConfiguration0.setEternal(true);
        java.lang.String str5 = cacheConfiguration0.getDiskStorePath();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        boolean b31 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer35 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression36 = cacheBasedMessageBodyReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer43 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression41, "");
        cacheBasedMessageBodyReplacer35.setKey(expression41);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer46 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression41, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration47 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer48 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint12, (org.apache.camel.Processor) cacheBasedXPathReplacer46, cacheConfiguration47);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener49 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer48);
        org.apache.camel.CamelContext camelContext51 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent52 = new org.apache.camel.component.cache.CacheComponent(camelContext51);
        boolean b53 = cacheComponent52.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory54 = cacheComponent52.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint55 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration56 = new org.apache.camel.component.cache.CacheConfiguration();
        long long57 = cacheConfiguration56.getTimeToIdleSeconds();
        cacheConfiguration56.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer60 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint55, cacheConfiguration56);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory61 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint62 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent52, cacheConfiguration56, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory61);
        org.apache.camel.CamelContext camelContext63 = cacheEndpoint62.getCamelContext();
        org.apache.camel.EndpointConfiguration endpointConfiguration64 = null;
        cacheEndpoint62.setEndpointConfiguration(endpointConfiguration64);
        cacheEndpoint62.setEndpointUriIfNotSpecified("");
        org.apache.camel.ExchangePattern exchangePattern68 = null;
        org.apache.camel.Exchange exchange69 = cacheEndpoint62.createExchange(exchangePattern68);
        try {
            org.apache.camel.spi.UnitOfWork unitOfWork70 = cacheConsumer48.createUoW(exchange69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(expression36);
        org.junit.Assert.assertNotNull(expression41);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(cacheManagerFactory54);
        org.junit.Assert.assertTrue(long57 == 300L);
        org.junit.Assert.assertNull(camelContext63);
        org.junit.Assert.assertNotNull(exchange69);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        boolean b2 = cacheComponent1.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory3 = cacheComponent1.getCacheManagerFactory();
        try {
            cacheManagerFactory3.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(cacheManagerFactory3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setDiskStorePath("hi!");
        boolean b3 = cacheConfiguration0.isEternal();
        cacheConfiguration0.setMaxElementsInMemory(10);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        java.lang.String str15 = cacheConfiguration14.getDiskStorePath();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        java.lang.Class<? extends org.apache.camel.Endpoint> cls3 = cacheComponent1.getEndpointClass();
        boolean b4 = cacheComponent1.isStoppingOrStopped();
        cacheComponent1.stop();
        org.apache.camel.ComponentConfiguration componentConfiguration6 = cacheComponent1.createComponentConfiguration();
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertNotNull(cls3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(componentConfiguration6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer6 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression4, "");
        org.apache.camel.CamelContext camelContext8 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent9 = new org.apache.camel.component.cache.CacheComponent(camelContext8);
        boolean b10 = cacheComponent9.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory11 = cacheComponent9.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration13 = new org.apache.camel.component.cache.CacheConfiguration();
        long long14 = cacheConfiguration13.getTimeToIdleSeconds();
        cacheConfiguration13.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer17 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration13);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory18 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint19 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent9, cacheConfiguration13, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory18);
        org.apache.camel.CamelContext camelContext20 = cacheEndpoint19.getCamelContext();
        org.apache.camel.EndpointConfiguration endpointConfiguration21 = null;
        cacheEndpoint19.setEndpointConfiguration(endpointConfiguration21);
        cacheEndpoint19.setEndpointUriIfNotSpecified("");
        org.apache.camel.ExchangePattern exchangePattern25 = null;
        org.apache.camel.Exchange exchange26 = cacheEndpoint19.createExchange(exchangePattern25);
        try {
            cacheBasedTokenReplacer6.process(exchange26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(cacheManagerFactory11);
        org.junit.Assert.assertTrue(long14 == 300L);
        org.junit.Assert.assertNull(camelContext20);
        org.junit.Assert.assertNotNull(exchange26);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        org.apache.camel.Processor processor14 = null;
        org.apache.camel.Consumer consumer15 = cacheEndpoint12.createConsumer(processor14);
        org.apache.camel.PollingConsumer pollingConsumer16 = cacheEndpoint12.createPollingConsumer();
        cacheEndpoint12.stop();
        org.apache.camel.spi.ExceptionHandler exceptionHandler18 = cacheEndpoint12.getExceptionHandler();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertNotNull(consumer15);
        org.junit.Assert.assertNotNull(pollingConsumer16);
        org.junit.Assert.assertNull(exceptionHandler18);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        boolean b15 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = new org.apache.camel.component.cache.CacheConfiguration();
        long long18 = cacheConfiguration17.getTimeToIdleSeconds();
        cacheConfiguration17.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer21 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint16, cacheConfiguration17);
        org.apache.camel.component.cache.CacheProducer cacheProducer22 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration17);
        boolean b23 = cacheProducer22.isSingleton();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(long18 == 300L);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        boolean b31 = cacheEndpoint12.isBridgeErrorHandler();
        java.lang.String str32 = cacheEndpoint12.getKey();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.EndpointConfiguration endpointConfiguration14 = null;
        cacheEndpoint12.setEndpointConfiguration(endpointConfiguration14);
        cacheEndpoint12.setEndpointUriIfNotSpecified("");
        org.apache.camel.ExchangePattern exchangePattern18 = null;
        cacheEndpoint12.setExchangePattern(exchangePattern18);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration20 = cacheEndpoint12.getConfig();
        cacheConfiguration20.setObjectCache(true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(cacheConfiguration20);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer3 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint4 = cacheProducer3.getEndpoint();
        try {
            org.apache.camel.Exchange exchange5 = cacheProducer3.createExchange();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertNull(cacheEndpoint4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        cacheComponent1.setResolvePropertyPlaceholders(false);
        cacheComponent1.suspend();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory5 = cacheComponent1.getCacheManagerFactory();
        try {
            org.apache.camel.EndpointConfiguration endpointConfiguration7 = cacheComponent1.createConfiguration("endpoint74");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(cacheManagerFactory5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str3 = cacheBasedMessageBodyReplacer2.getCacheName();
        cacheBasedMessageBodyReplacer2.setCacheName("");
        cacheBasedMessageBodyReplacer2.stop();
        cacheBasedMessageBodyReplacer2.setCacheName("Producer[]");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        cacheConfiguration0.setEternal(false);
        long long5 = cacheConfiguration0.getTimeToLiveSeconds();
        cacheConfiguration0.setDiskStorePath("hi!");
        boolean b8 = cacheConfiguration0.isOverflowToDisk();
        org.junit.Assert.assertTrue(long5 == 300L);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer6 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression4, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer10 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression11 = cacheBasedMessageBodyReplacer10.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer13 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression11, "");
        cacheBasedTokenReplacer6.setKey(expression11);
        org.apache.camel.CamelContext camelContext16 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent17 = new org.apache.camel.component.cache.CacheComponent(camelContext16);
        boolean b18 = cacheComponent17.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory19 = cacheComponent17.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint20 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration21 = new org.apache.camel.component.cache.CacheConfiguration();
        long long22 = cacheConfiguration21.getTimeToIdleSeconds();
        cacheConfiguration21.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer25 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint20, cacheConfiguration21);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory26 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint27 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent17, cacheConfiguration21, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory26);
        org.apache.camel.CamelContext camelContext28 = cacheEndpoint27.getCamelContext();
        org.apache.camel.EndpointConfiguration endpointConfiguration29 = null;
        cacheEndpoint27.setEndpointConfiguration(endpointConfiguration29);
        cacheEndpoint27.setEndpointUriIfNotSpecified("");
        org.apache.camel.ExchangePattern exchangePattern33 = null;
        org.apache.camel.Exchange exchange34 = cacheEndpoint27.createExchange(exchangePattern33);
        try {
            cacheBasedTokenReplacer6.process(exchange34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertNotNull(expression11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(cacheManagerFactory19);
        org.junit.Assert.assertTrue(long22 == 300L);
        org.junit.Assert.assertNull(camelContext28);
        org.junit.Assert.assertNotNull(exchange34);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus3 = cacheComponent1.getStatus();
        boolean b4 = cacheComponent1.isStarted();
        cacheComponent1.setConfigurationFile("Producer[]");
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertTrue("'" + serviceStatus3 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus3.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        boolean b14 = cacheEndpoint12.isSuspended();
        cacheEndpoint12.setKey("");
        org.apache.camel.CamelContext camelContext18 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent19 = new org.apache.camel.component.cache.CacheComponent(camelContext18);
        boolean b20 = cacheComponent19.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory21 = cacheComponent19.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint22 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration23 = new org.apache.camel.component.cache.CacheConfiguration();
        long long24 = cacheConfiguration23.getTimeToIdleSeconds();
        cacheConfiguration23.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer27 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint22, cacheConfiguration23);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory28 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint29 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent19, cacheConfiguration23, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory28);
        cacheEndpoint12.setCacheManagerFactory((org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory28);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(cacheManagerFactory21);
        org.junit.Assert.assertTrue(long24 == 300L);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        boolean b15 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.CamelContext camelContext16 = null;
        cacheEndpoint12.setCamelContext(camelContext16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        cacheConfiguration1.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer5 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        cacheConfiguration1.setObjectCache(false);
        org.junit.Assert.assertTrue(long2 == 300L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        long long1 = cacheConfiguration0.getTimeToIdleSeconds();
        long long2 = cacheConfiguration0.getTimeToIdleSeconds();
        cacheConfiguration0.setDiskExpiryThreadIntervalSeconds((long) '#');
        org.junit.Assert.assertTrue(long1 == 300L);
        org.junit.Assert.assertTrue(long2 == 300L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        cacheEndpoint12.setEndpointUriIfNotSpecified("");
        boolean b16 = cacheEndpoint12.isLenientProperties();
        boolean b17 = cacheEndpoint12.isSingleton();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        boolean b15 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = new org.apache.camel.component.cache.CacheConfiguration();
        long long18 = cacheConfiguration17.getTimeToIdleSeconds();
        cacheConfiguration17.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer21 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint16, cacheConfiguration17);
        org.apache.camel.component.cache.CacheProducer cacheProducer22 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration17);
        cacheEndpoint12.stop();
        org.apache.camel.Component component24 = cacheEndpoint12.getComponent();
        boolean b25 = cacheEndpoint12.isStoppingOrStopped();
        cacheEndpoint12.stop();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(long18 == 300L);
        org.junit.Assert.assertNotNull(component24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer3 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        cacheConfiguration1.setTimeToLiveSeconds((long) ' ');
        org.junit.Assert.assertTrue(long2 == 300L);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.camel.component.cache.FileCacheManagerFactory fileCacheManagerFactory1 = new org.apache.camel.component.cache.FileCacheManagerFactory("");
        fileCacheManagerFactory1.setFileName("Producer[]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        cacheComponent2.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration5 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration5.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = null;
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry8);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory10 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint11 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration5, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory10);
        java.lang.Class<? extends org.apache.camel.Endpoint> cls12 = cacheComponent2.getEndpointClass();
        org.junit.Assert.assertNotNull(cls12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        boolean b2 = cacheComponent1.isRunAllowed();
        boolean b3 = cacheComponent1.useRawUri();
        boolean b4 = cacheComponent1.useRawUri();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        cacheComponent2.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration5 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration5.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = null;
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry8);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory10 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint11 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration5, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory10);
        boolean b12 = cacheEndpoint11.isSingleton();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory13 = cacheEndpoint11.getCacheManagerFactory();
        try {
            org.apache.camel.EndpointConfiguration endpointConfiguration14 = cacheEndpoint11.getEndpointConfiguration();
            org.junit.Assert.fail("Expected exception of type org.apache.camel.RuntimeCamelException");
        } catch (org.apache.camel.RuntimeCamelException e) {
        }
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(cacheManagerFactory13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        long long1 = cacheConfiguration0.getTimeToIdleSeconds();
        long long2 = cacheConfiguration0.getTimeToIdleSeconds();
        cacheConfiguration0.setMaxElementsInMemory(1);
        cacheConfiguration0.setDiskExpiryThreadIntervalSeconds((long) ' ');
        org.junit.Assert.assertTrue(long1 == 300L);
        org.junit.Assert.assertTrue(long2 == 300L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.ServiceStatus serviceStatus15 = cacheEndpoint12.getStatus();
        org.apache.camel.CamelContext camelContext17 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent18 = new org.apache.camel.component.cache.CacheComponent(camelContext17);
        boolean b19 = cacheComponent18.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory20 = cacheComponent18.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint21 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration22 = new org.apache.camel.component.cache.CacheConfiguration();
        long long23 = cacheConfiguration22.getTimeToIdleSeconds();
        cacheConfiguration22.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer26 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint21, cacheConfiguration22);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory27 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint28 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent18, cacheConfiguration22, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory27);
        org.apache.camel.CamelContext camelContext29 = cacheEndpoint28.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer30 = cacheEndpoint28.createPollingConsumer();
        boolean b31 = cacheEndpoint28.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint32 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration33 = new org.apache.camel.component.cache.CacheConfiguration();
        long long34 = cacheConfiguration33.getTimeToIdleSeconds();
        cacheConfiguration33.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer37 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint32, cacheConfiguration33);
        org.apache.camel.component.cache.CacheProducer cacheProducer38 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint28, cacheConfiguration33);
        java.lang.String str39 = cacheProducer38.toString();
        org.apache.camel.Exchange exchange40 = cacheProducer38.createExchange();
        try {
            org.apache.camel.Exchange exchange41 = cacheEndpoint12.createExchange(exchange40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue("'" + serviceStatus15 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus15.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(cacheManagerFactory20);
        org.junit.Assert.assertTrue(long23 == 300L);
        org.junit.Assert.assertNull(camelContext29);
        org.junit.Assert.assertNotNull(pollingConsumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(long34 == 300L);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Producer[]" + "'", str39.equals("Producer[]"));
        org.junit.Assert.assertNotNull(exchange40);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression3 = cacheBasedMessageBodyReplacer2.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer7 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression8 = cacheBasedMessageBodyReplacer7.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer12 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression13 = cacheBasedMessageBodyReplacer12.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer15 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression13, "");
        cacheBasedMessageBodyReplacer7.setKey(expression13);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer18 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression13, "");
        cacheBasedMessageBodyReplacer2.setKey(expression13);
        cacheBasedMessageBodyReplacer2.stop();
        org.junit.Assert.assertNotNull(expression3);
        org.junit.Assert.assertNotNull(expression8);
        org.junit.Assert.assertNotNull(expression13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer3 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint4 = cacheProducer3.getEndpoint();
        org.apache.camel.CamelContext camelContext6 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent7 = new org.apache.camel.component.cache.CacheComponent(camelContext6);
        boolean b8 = cacheComponent7.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory9 = cacheComponent7.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint10 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration11 = new org.apache.camel.component.cache.CacheConfiguration();
        long long12 = cacheConfiguration11.getTimeToIdleSeconds();
        cacheConfiguration11.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer15 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint10, cacheConfiguration11);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory16 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint17 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent7, cacheConfiguration11, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory16);
        org.apache.camel.CamelContext camelContext18 = cacheEndpoint17.getCamelContext();
        org.apache.camel.EndpointConfiguration endpointConfiguration19 = null;
        cacheEndpoint17.setEndpointConfiguration(endpointConfiguration19);
        cacheEndpoint17.setEndpointUriIfNotSpecified("");
        org.apache.camel.ExchangePattern exchangePattern23 = null;
        org.apache.camel.Exchange exchange24 = cacheEndpoint17.createExchange(exchangePattern23);
        try {
            org.apache.camel.Exchange exchange25 = cacheProducer3.createExchange(exchange24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertNull(cacheEndpoint4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(cacheManagerFactory9);
        org.junit.Assert.assertTrue(long12 == 300L);
        org.junit.Assert.assertNull(camelContext18);
        org.junit.Assert.assertNotNull(exchange24);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        java.lang.String str13 = cacheEndpoint12.toString();
        boolean b14 = cacheEndpoint12.isStoppingOrStopped();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer4 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression5 = cacheBasedMessageBodyReplacer4.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer7 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression5, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer11 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression12 = cacheBasedMessageBodyReplacer11.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer14 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression12, "");
        cacheBasedTokenReplacer7.setKey(expression12);
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer16 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", expression12);
        cacheBasedMessageBodyReplacer16.setKey("Producer[]");
        cacheBasedMessageBodyReplacer16.setKey("Producer[]");
        org.junit.Assert.assertNotNull(expression5);
        org.junit.Assert.assertNotNull(expression12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str3 = cacheBasedMessageBodyReplacer2.getCacheName();
        cacheBasedMessageBodyReplacer2.start();
        cacheBasedMessageBodyReplacer2.start();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.camel.component.cache.CacheEventListener cacheEventListener0 = new org.apache.camel.component.cache.CacheEventListener();
        net.sf.ehcache.Ehcache ehcache1 = null;
        net.sf.ehcache.Element element2 = null;
        try {
            cacheEventListener0.notifyElementUpdated(ehcache1, element2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        boolean b15 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = new org.apache.camel.component.cache.CacheConfiguration();
        long long18 = cacheConfiguration17.getTimeToIdleSeconds();
        cacheConfiguration17.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer21 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint16, cacheConfiguration17);
        org.apache.camel.component.cache.CacheProducer cacheProducer22 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration17);
        cacheEndpoint12.suspend();
        cacheEndpoint12.setEndpointUriIfNotSpecified("Producer[]");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(long18 == 300L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy5 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy5);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry7 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry7);
        int i9 = cacheConfiguration0.getMaxElementsInMemory();
        boolean b10 = cacheConfiguration0.isObjectCache();
        cacheConfiguration0.setEternal(true);
        cacheConfiguration0.setObjectCache(false);
        org.junit.Assert.assertTrue(i9 == 1000);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression3 = cacheBasedMessageBodyReplacer2.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer7 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression8 = cacheBasedMessageBodyReplacer7.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer12 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression13 = cacheBasedMessageBodyReplacer12.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer15 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression13, "");
        cacheBasedMessageBodyReplacer7.setKey(expression13);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer18 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression13, "");
        cacheBasedMessageBodyReplacer2.setKey(expression13);
        cacheBasedMessageBodyReplacer2.setCacheName("");
        org.junit.Assert.assertNotNull(expression3);
        org.junit.Assert.assertNotNull(expression8);
        org.junit.Assert.assertNotNull(expression13);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        boolean b2 = cacheComponent1.isRunAllowed();
        cacheComponent1.suspend();
        java.lang.Class<? extends org.apache.camel.Endpoint> cls4 = cacheComponent1.getEndpointClass();
        org.apache.camel.CamelContext camelContext5 = null;
        cacheComponent1.setCamelContext(camelContext5);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(cls4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str3 = cacheBasedMessageBodyReplacer2.getCacheName();
        cacheBasedMessageBodyReplacer2.setKey("hi!");
        java.lang.String str6 = cacheBasedMessageBodyReplacer2.getCacheName();
        cacheBasedMessageBodyReplacer2.stop();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer3 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", "endpoint74", "endpoint74");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = null;
        org.apache.camel.component.cache.CacheProducer cacheProducer2 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        org.apache.camel.CamelContext camelContext4 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent5 = new org.apache.camel.component.cache.CacheComponent(camelContext4);
        boolean b6 = cacheComponent5.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory7 = cacheComponent5.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint8 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration9 = new org.apache.camel.component.cache.CacheConfiguration();
        long long10 = cacheConfiguration9.getTimeToIdleSeconds();
        cacheConfiguration9.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer13 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint8, cacheConfiguration9);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory14 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint15 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent5, cacheConfiguration9, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory14);
        org.apache.camel.CamelContext camelContext16 = cacheEndpoint15.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer17 = cacheEndpoint15.createPollingConsumer();
        boolean b18 = cacheEndpoint15.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint19 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration20 = new org.apache.camel.component.cache.CacheConfiguration();
        long long21 = cacheConfiguration20.getTimeToIdleSeconds();
        cacheConfiguration20.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer24 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint19, cacheConfiguration20);
        org.apache.camel.component.cache.CacheProducer cacheProducer25 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint15, cacheConfiguration20);
        java.lang.String str26 = cacheProducer25.toString();
        org.apache.camel.Exchange exchange27 = cacheProducer25.createExchange();
        try {
            cacheProducer2.process(exchange27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(cacheManagerFactory7);
        org.junit.Assert.assertTrue(long10 == 300L);
        org.junit.Assert.assertNull(camelContext16);
        org.junit.Assert.assertNotNull(pollingConsumer17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(long21 == 300L);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Producer[]" + "'", str26.equals("Producer[]"));
        org.junit.Assert.assertNotNull(exchange27);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj14 = null;
        cacheEndpoint12.setConsumerProperties(map_str_obj14);
        java.lang.String str16 = cacheEndpoint12.getId();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "endpoint131" + "'", str16.equals("endpoint131"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        cacheComponent1.setResolvePropertyPlaceholders(false);
        cacheComponent1.suspend();
        boolean b5 = cacheComponent1.isResolvePropertyPlaceholders();
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy1 = org.apache.camel.component.cache.CacheConverter.toPolicy("endpoint131");
        org.junit.Assert.assertNotNull(memoryStoreEvictionPolicy1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer3 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint4 = cacheProducer3.getEndpoint();
        org.apache.camel.CamelContext camelContext6 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent7 = new org.apache.camel.component.cache.CacheComponent(camelContext6);
        boolean b8 = cacheComponent7.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory9 = cacheComponent7.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint10 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration11 = new org.apache.camel.component.cache.CacheConfiguration();
        long long12 = cacheConfiguration11.getTimeToIdleSeconds();
        cacheConfiguration11.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer15 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint10, cacheConfiguration11);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory16 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint17 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent7, cacheConfiguration11, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory16);
        org.apache.camel.Producer producer18 = cacheEndpoint17.createProducer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj19 = null;
        cacheEndpoint17.setConsumerProperties(map_str_obj19);
        org.apache.camel.ExchangePattern exchangePattern21 = cacheEndpoint17.getExchangePattern();
        try {
            org.apache.camel.Exchange exchange22 = cacheProducer3.createExchange(exchangePattern21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertNull(cacheEndpoint4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(cacheManagerFactory9);
        org.junit.Assert.assertTrue(long12 == 300L);
        org.junit.Assert.assertNotNull(producer18);
        org.junit.Assert.assertTrue("'" + exchangePattern21 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern21.equals(org.apache.camel.ExchangePattern.InOnly));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = null;
        org.apache.camel.component.cache.CacheProducer cacheProducer2 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        org.apache.camel.CamelContext camelContext4 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent5 = new org.apache.camel.component.cache.CacheComponent(camelContext4);
        boolean b6 = cacheComponent5.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory7 = cacheComponent5.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint8 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration9 = new org.apache.camel.component.cache.CacheConfiguration();
        long long10 = cacheConfiguration9.getTimeToIdleSeconds();
        cacheConfiguration9.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer13 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint8, cacheConfiguration9);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory14 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint15 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent5, cacheConfiguration9, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory14);
        org.apache.camel.CamelContext camelContext16 = cacheEndpoint15.getCamelContext();
        org.apache.camel.EndpointConfiguration endpointConfiguration17 = null;
        cacheEndpoint15.setEndpointConfiguration(endpointConfiguration17);
        cacheEndpoint15.setEndpointUriIfNotSpecified("");
        org.apache.camel.ExchangePattern exchangePattern21 = null;
        org.apache.camel.Exchange exchange22 = cacheEndpoint15.createExchange(exchangePattern21);
        try {
            org.apache.camel.Exchange exchange23 = cacheProducer2.createExchange(exchange22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(cacheManagerFactory7);
        org.junit.Assert.assertTrue(long10 == 300L);
        org.junit.Assert.assertNull(camelContext16);
        org.junit.Assert.assertNotNull(exchange22);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory2 = cacheComponent1.getCacheManagerFactory();
        java.util.Collection<java.lang.Class<? extends org.apache.camel.component.extension.ComponentExtension>> collection_cls3 = cacheComponent1.getSupportedExtensions();
        cacheComponent1.setConfigurationFile("");
        org.junit.Assert.assertNull(cacheManagerFactory2);
        org.junit.Assert.assertNotNull(collection_cls3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression3 = cacheBasedMessageBodyReplacer2.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer7 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression8 = cacheBasedMessageBodyReplacer7.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer12 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression13 = cacheBasedMessageBodyReplacer12.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer15 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression13, "");
        cacheBasedMessageBodyReplacer7.setKey(expression13);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer18 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression13, "");
        cacheBasedMessageBodyReplacer2.setKey(expression13);
        org.apache.camel.Expression expression20 = cacheBasedMessageBodyReplacer2.getKey();
        cacheBasedMessageBodyReplacer2.setCacheName("hi!");
        org.junit.Assert.assertNotNull(expression3);
        org.junit.Assert.assertNotNull(expression8);
        org.junit.Assert.assertNotNull(expression13);
        org.junit.Assert.assertNotNull(expression20);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        boolean b31 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer35 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression36 = cacheBasedMessageBodyReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer43 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression41, "");
        cacheBasedMessageBodyReplacer35.setKey(expression41);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer46 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression41, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration47 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer48 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint12, (org.apache.camel.Processor) cacheBasedXPathReplacer46, cacheConfiguration47);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener49 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer48);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener50 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer48);
        net.sf.ehcache.Ehcache ehcache51 = null;
        net.sf.ehcache.Element element52 = null;
        try {
            cacheEventListener50.notifyElementUpdated(ehcache51, element52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(expression36);
        org.junit.Assert.assertNotNull(expression41);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        java.lang.Class<? extends org.apache.camel.Endpoint> cls3 = cacheComponent1.getEndpointClass();
        boolean b4 = cacheComponent1.isStoppingOrStopped();
        org.apache.camel.CamelContext camelContext5 = null;
        cacheComponent1.setCamelContext(camelContext5);
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertNotNull(cls3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        org.apache.camel.Expression expression15 = null;
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer16 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("", expression15);
        cacheBasedMessageBodyReplacer16.setCacheName("endpoint74");
        org.apache.camel.Consumer consumer19 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedMessageBodyReplacer16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertNotNull(consumer19);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus3 = cacheComponent1.getStatus();
        boolean b4 = cacheComponent1.isStarting();
        boolean b5 = cacheComponent1.isResolvePropertyPlaceholders();
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertTrue("'" + serviceStatus3 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus3.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy5 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy5);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry7 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry7);
        int i9 = cacheConfiguration0.getMaxElementsInMemory();
        boolean b10 = cacheConfiguration0.isObjectCache();
        cacheConfiguration0.setOverflowToDisk(true);
        org.junit.Assert.assertTrue(i9 == 1000);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        boolean b15 = cacheEndpoint12.isBridgeErrorHandler();
        boolean b16 = cacheEndpoint12.isStopping();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        cacheConfiguration1.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer5 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        long long6 = cacheConfiguration1.getDiskExpiryThreadIntervalSeconds();
        boolean b7 = cacheConfiguration1.isOverflowToDisk();
        boolean b8 = cacheConfiguration1.isEternal();
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        cacheConfiguration0.setEternal(false);
        long long5 = cacheConfiguration0.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheLoaderWrapper[] cacheLoaderWrapper_array6 = new org.apache.camel.component.cache.CacheLoaderWrapper[] {};
        java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper> arraylist_cacheLoaderWrapper7 = new java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper7, cacheLoaderWrapper_array6);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry9 = new org.apache.camel.component.cache.CacheLoaderRegistry((java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper7);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry10 = new org.apache.camel.component.cache.CacheLoaderRegistry((java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper7);
        java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper> list_cacheLoaderWrapper11 = cacheLoaderRegistry10.getCacheLoaders();
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry10);
        org.apache.camel.component.cache.CacheLoaderWrapper cacheLoaderWrapper13 = null;
        cacheLoaderRegistry10.addCacheLoader(cacheLoaderWrapper13);
        org.junit.Assert.assertTrue(long5 == 300L);
        org.junit.Assert.assertNotNull(cacheLoaderWrapper_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_cacheLoaderWrapper11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.camel.component.cache.CacheConsumer cacheConsumer0 = null;
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer0);
        net.sf.ehcache.Ehcache ehcache2 = null;
        net.sf.ehcache.Element element3 = null;
        try {
            cacheEventListener1.notifyElementEvicted(ehcache2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.ExchangePattern exchangePattern15 = null;
        cacheEndpoint12.setExchangePattern(exchangePattern15);
        boolean b17 = cacheEndpoint12.isStarted();
        java.lang.String str18 = cacheEndpoint12.getOperation();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy5 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy5);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry7 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry7);
        int i9 = cacheConfiguration0.getMaxElementsInMemory();
        java.lang.String str10 = cacheConfiguration0.getCacheName();
        cacheConfiguration0.setDiskStorePath("");
        org.junit.Assert.assertTrue(i9 == 1000);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer5 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression6 = cacheBasedMessageBodyReplacer5.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer10 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression11 = cacheBasedMessageBodyReplacer10.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer13 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression11, "");
        cacheBasedMessageBodyReplacer5.setKey(expression11);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer16 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression11, "");
        java.lang.String str17 = cacheBasedXPathReplacer16.getXpath();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer20 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str21 = cacheBasedMessageBodyReplacer20.getCacheName();
        cacheBasedMessageBodyReplacer20.stop();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer26 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression27 = cacheBasedMessageBodyReplacer26.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer29 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression27, "");
        org.apache.camel.Expression expression30 = cacheBasedTokenReplacer29.getKey();
        cacheBasedMessageBodyReplacer20.setKey(expression30);
        cacheBasedXPathReplacer16.setKey(expression30);
        org.apache.camel.Expression expression33 = cacheBasedXPathReplacer16.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer34 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", expression33);
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer36 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("endpoint74", expression33, "hi!");
        org.junit.Assert.assertNotNull(expression6);
        org.junit.Assert.assertNotNull(expression11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(expression27);
        org.junit.Assert.assertNotNull(expression30);
        org.junit.Assert.assertNotNull(expression33);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        long long1 = cacheConfiguration0.getTimeToIdleSeconds();
        long long2 = cacheConfiguration0.getTimeToIdleSeconds();
        cacheConfiguration0.setMaxElementsInMemory(1);
        int i5 = cacheConfiguration0.getMaxElementsInMemory();
        cacheConfiguration0.setOverflowToDisk(false);
        boolean b8 = cacheConfiguration0.isEternal();
        cacheConfiguration0.setDiskPersistent(false);
        boolean b11 = cacheConfiguration0.isDiskPersistent();
        org.junit.Assert.assertTrue(long1 == 300L);
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        org.apache.camel.Processor processor14 = null;
        org.apache.camel.Consumer consumer15 = cacheEndpoint12.createConsumer(processor14);
        org.apache.camel.PollingConsumer pollingConsumer16 = cacheEndpoint12.createPollingConsumer();
        cacheEndpoint12.stop();
        int i18 = cacheEndpoint12.getPollingConsumerQueueSize();
        cacheEndpoint12.setEndpointUriIfNotSpecified("Producer[]");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertNotNull(consumer15);
        org.junit.Assert.assertNotNull(pollingConsumer16);
        org.junit.Assert.assertTrue(i18 == 1000);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        boolean b15 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = new org.apache.camel.component.cache.CacheConfiguration();
        long long18 = cacheConfiguration17.getTimeToIdleSeconds();
        cacheConfiguration17.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer21 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint16, cacheConfiguration17);
        org.apache.camel.component.cache.CacheProducer cacheProducer22 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration17);
        long long23 = cacheConfiguration17.getTimeToIdleSeconds();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(long18 == 300L);
        org.junit.Assert.assertTrue(long23 == 300L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration13 = new org.apache.camel.component.cache.CacheConfiguration();
        long long14 = cacheConfiguration13.getTimeToIdleSeconds();
        long long15 = cacheConfiguration13.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer16 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration13);
        cacheEndpoint12.suspend();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long14 == 300L);
        org.junit.Assert.assertTrue(long15 == 300L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression3 = cacheBasedMessageBodyReplacer2.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer6 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression7 = cacheBasedMessageBodyReplacer6.getKey();
        cacheBasedMessageBodyReplacer2.setKey(expression7);
        org.apache.camel.CamelContext camelContext10 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent11 = new org.apache.camel.component.cache.CacheComponent(camelContext10);
        boolean b12 = cacheComponent11.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory13 = cacheComponent11.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint14 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration15 = new org.apache.camel.component.cache.CacheConfiguration();
        long long16 = cacheConfiguration15.getTimeToIdleSeconds();
        cacheConfiguration15.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer19 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint14, cacheConfiguration15);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory20 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint21 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent11, cacheConfiguration15, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory20);
        long long22 = cacheEndpoint21.getPollingConsumerBlockTimeout();
        boolean b23 = cacheEndpoint21.isSuspended();
        org.apache.camel.Component component24 = cacheEndpoint21.getComponent();
        org.apache.camel.CamelContext camelContext26 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent27 = new org.apache.camel.component.cache.CacheComponent(camelContext26);
        boolean b28 = cacheComponent27.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory29 = cacheComponent27.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint30 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration31 = new org.apache.camel.component.cache.CacheConfiguration();
        long long32 = cacheConfiguration31.getTimeToIdleSeconds();
        cacheConfiguration31.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer35 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint30, cacheConfiguration31);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory36 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint37 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent27, cacheConfiguration31, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory36);
        org.apache.camel.Producer producer38 = cacheEndpoint37.createProducer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj39 = null;
        cacheEndpoint37.setConsumerProperties(map_str_obj39);
        org.apache.camel.ExchangePattern exchangePattern41 = cacheEndpoint37.getExchangePattern();
        org.apache.camel.Exchange exchange42 = cacheEndpoint21.createExchange(exchangePattern41);
        try {
            cacheBasedMessageBodyReplacer2.process(exchange42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(expression3);
        org.junit.Assert.assertNotNull(expression7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(cacheManagerFactory13);
        org.junit.Assert.assertTrue(long16 == 300L);
        org.junit.Assert.assertTrue(long22 == 0L);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(component24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(cacheManagerFactory29);
        org.junit.Assert.assertTrue(long32 == 300L);
        org.junit.Assert.assertNotNull(producer38);
        org.junit.Assert.assertTrue("'" + exchangePattern41 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern41.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange42);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.List<net.sf.ehcache.event.CacheEventListener> list_cacheEventListener0 = null;
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry1 = new org.apache.camel.component.cache.CacheEventListenerRegistry(list_cacheEventListener0);
        java.util.List<net.sf.ehcache.event.CacheEventListener> list_cacheEventListener2 = cacheEventListenerRegistry1.getEventListeners();
        java.util.List<net.sf.ehcache.event.CacheEventListener> list_cacheEventListener3 = cacheEventListenerRegistry1.getEventListeners();
        org.junit.Assert.assertNotNull(list_cacheEventListener2);
        org.junit.Assert.assertNotNull(list_cacheEventListener3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy5 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy5);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry7 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry7);
        int i9 = cacheConfiguration0.getMaxElementsInMemory();
        long long10 = cacheConfiguration0.getTimeToLiveSeconds();
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry11 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        cacheConfiguration0.setEventListenerRegistry(cacheEventListenerRegistry11);
        try {
            int i13 = cacheEventListenerRegistry11.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i9 == 1000);
        org.junit.Assert.assertTrue(long10 == 300L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer3 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        org.apache.camel.CamelContext camelContext5 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent6 = new org.apache.camel.component.cache.CacheComponent(camelContext5);
        boolean b7 = cacheComponent6.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory8 = cacheComponent6.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint9 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration10 = new org.apache.camel.component.cache.CacheConfiguration();
        long long11 = cacheConfiguration10.getTimeToIdleSeconds();
        cacheConfiguration10.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer14 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint9, cacheConfiguration10);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory15 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent6, cacheConfiguration10, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory15);
        long long17 = cacheEndpoint16.getPollingConsumerBlockTimeout();
        boolean b18 = cacheEndpoint16.isSuspended();
        org.apache.camel.Component component19 = cacheEndpoint16.getComponent();
        org.apache.camel.CamelContext camelContext21 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent22 = new org.apache.camel.component.cache.CacheComponent(camelContext21);
        boolean b23 = cacheComponent22.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory24 = cacheComponent22.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint25 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration26 = new org.apache.camel.component.cache.CacheConfiguration();
        long long27 = cacheConfiguration26.getTimeToIdleSeconds();
        cacheConfiguration26.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer30 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint25, cacheConfiguration26);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory31 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint32 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent22, cacheConfiguration26, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory31);
        org.apache.camel.Producer producer33 = cacheEndpoint32.createProducer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj34 = null;
        cacheEndpoint32.setConsumerProperties(map_str_obj34);
        org.apache.camel.ExchangePattern exchangePattern36 = cacheEndpoint32.getExchangePattern();
        org.apache.camel.Exchange exchange37 = cacheEndpoint16.createExchange(exchangePattern36);
        try {
            cacheProducer3.process(exchange37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(cacheManagerFactory8);
        org.junit.Assert.assertTrue(long11 == 300L);
        org.junit.Assert.assertTrue(long17 == 0L);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(cacheManagerFactory24);
        org.junit.Assert.assertTrue(long27 == 300L);
        org.junit.Assert.assertNotNull(producer33);
        org.junit.Assert.assertTrue("'" + exchangePattern36 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern36.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange37);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        cacheBasedTokenReplacer21.setCacheName("");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        java.lang.String str14 = cacheEndpoint12.getKey();
        org.apache.camel.PollingConsumer pollingConsumer15 = cacheEndpoint12.createPollingConsumer();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(pollingConsumer15);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        org.apache.camel.Processor processor14 = null;
        org.apache.camel.Consumer consumer15 = cacheEndpoint12.createConsumer(processor14);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration16 = cacheEndpoint12.getConfig();
        org.apache.camel.spi.ExceptionHandler exceptionHandler17 = null;
        cacheEndpoint12.setExceptionHandler(exceptionHandler17);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertNotNull(consumer15);
        org.junit.Assert.assertNotNull(cacheConfiguration16);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        boolean b15 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = new org.apache.camel.component.cache.CacheConfiguration();
        long long18 = cacheConfiguration17.getTimeToIdleSeconds();
        cacheConfiguration17.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer21 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint16, cacheConfiguration17);
        org.apache.camel.component.cache.CacheProducer cacheProducer22 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration17);
        cacheEndpoint12.stop();
        org.apache.camel.Component component24 = cacheEndpoint12.getComponent();
        boolean b25 = cacheEndpoint12.isStoppingOrStopped();
        cacheEndpoint12.setPollingConsumerBlockTimeout((long) 'a');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(long18 == 300L);
        org.junit.Assert.assertNotNull(component24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.camel.component.cache.CacheConsumer cacheConsumer0 = null;
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer0);
        net.sf.ehcache.Ehcache ehcache2 = null;
        net.sf.ehcache.Element element3 = null;
        try {
            cacheEventListener1.notifyElementExpired(ehcache2, element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer8 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression9 = cacheBasedMessageBodyReplacer8.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer11 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression9, "");
        cacheBasedMessageBodyReplacer3.setKey(expression9);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer14 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression9, "");
        java.lang.String str15 = cacheBasedXPathReplacer14.getXpath();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str19 = cacheBasedMessageBodyReplacer18.getCacheName();
        cacheBasedMessageBodyReplacer18.stop();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer24 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression25 = cacheBasedMessageBodyReplacer24.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer27 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression25, "");
        org.apache.camel.Expression expression28 = cacheBasedTokenReplacer27.getKey();
        cacheBasedMessageBodyReplacer18.setKey(expression28);
        cacheBasedXPathReplacer14.setKey(expression28);
        org.apache.camel.CamelContext camelContext32 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent33 = new org.apache.camel.component.cache.CacheComponent(camelContext32);
        boolean b34 = cacheComponent33.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory35 = cacheComponent33.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint36 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration37 = new org.apache.camel.component.cache.CacheConfiguration();
        long long38 = cacheConfiguration37.getTimeToIdleSeconds();
        cacheConfiguration37.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer41 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint36, cacheConfiguration37);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory42 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint43 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent33, cacheConfiguration37, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory42);
        org.apache.camel.CamelContext camelContext44 = cacheEndpoint43.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer45 = cacheEndpoint43.createPollingConsumer();
        boolean b46 = cacheEndpoint43.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint47 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration48 = new org.apache.camel.component.cache.CacheConfiguration();
        long long49 = cacheConfiguration48.getTimeToIdleSeconds();
        cacheConfiguration48.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer52 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint47, cacheConfiguration48);
        org.apache.camel.component.cache.CacheProducer cacheProducer53 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint43, cacheConfiguration48);
        java.lang.String str54 = cacheProducer53.toString();
        org.apache.camel.Exchange exchange55 = cacheProducer53.createExchange();
        try {
            cacheBasedXPathReplacer14.process(exchange55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertNotNull(expression9);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(expression25);
        org.junit.Assert.assertNotNull(expression28);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(cacheManagerFactory35);
        org.junit.Assert.assertTrue(long38 == 300L);
        org.junit.Assert.assertNull(camelContext44);
        org.junit.Assert.assertNotNull(pollingConsumer45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(long49 == 300L);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "Producer[]" + "'", str54.equals("Producer[]"));
        org.junit.Assert.assertNotNull(exchange55);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer4 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression5 = cacheBasedMessageBodyReplacer4.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer9 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression10 = cacheBasedMessageBodyReplacer9.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer12 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression10, "");
        cacheBasedMessageBodyReplacer4.setKey(expression10);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer15 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression10, "");
        java.lang.String str16 = cacheBasedXPathReplacer15.getXpath();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer19 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str20 = cacheBasedMessageBodyReplacer19.getCacheName();
        cacheBasedMessageBodyReplacer19.stop();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        org.apache.camel.Expression expression29 = cacheBasedTokenReplacer28.getKey();
        cacheBasedMessageBodyReplacer19.setKey(expression29);
        cacheBasedXPathReplacer15.setKey(expression29);
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer32 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("endpoint74", expression29);
        org.junit.Assert.assertNotNull(expression5);
        org.junit.Assert.assertNotNull(expression10);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(expression29);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus3 = cacheComponent1.getStatus();
        boolean b4 = cacheComponent1.isStarted();
        boolean b5 = cacheComponent1.isSuspendingOrSuspended();
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertTrue("'" + serviceStatus3 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus3.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        java.lang.String str14 = cacheEndpoint12.getKey();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory15 = cacheEndpoint12.getCacheManagerFactory();
        org.apache.camel.CamelContext camelContext17 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent18 = new org.apache.camel.component.cache.CacheComponent(camelContext17);
        boolean b19 = cacheComponent18.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory20 = cacheComponent18.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint21 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration22 = new org.apache.camel.component.cache.CacheConfiguration();
        long long23 = cacheConfiguration22.getTimeToIdleSeconds();
        cacheConfiguration22.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer26 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint21, cacheConfiguration22);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory27 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint28 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent18, cacheConfiguration22, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory27);
        org.apache.camel.CamelContext camelContext29 = cacheEndpoint28.getCamelContext();
        org.apache.camel.EndpointConfiguration endpointConfiguration30 = null;
        cacheEndpoint28.setEndpointConfiguration(endpointConfiguration30);
        cacheEndpoint28.setEndpointUriIfNotSpecified("");
        org.apache.camel.ExchangePattern exchangePattern34 = null;
        org.apache.camel.Exchange exchange35 = cacheEndpoint28.createExchange(exchangePattern34);
        try {
            org.apache.camel.Exchange exchange36 = cacheEndpoint12.createExchange(exchange35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(cacheManagerFactory15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(cacheManagerFactory20);
        org.junit.Assert.assertTrue(long23 == 300L);
        org.junit.Assert.assertNull(camelContext29);
        org.junit.Assert.assertNotNull(exchange35);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration13 = new org.apache.camel.component.cache.CacheConfiguration();
        long long14 = cacheConfiguration13.getTimeToIdleSeconds();
        long long15 = cacheConfiguration13.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer16 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration13);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = cacheEndpoint12.getConfig();
        boolean b18 = cacheConfiguration17.isObjectCache();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long14 == 300L);
        org.junit.Assert.assertTrue(long15 == 300L);
        org.junit.Assert.assertNotNull(cacheConfiguration17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        long long1 = cacheConfiguration0.getTimeToIdleSeconds();
        long long2 = cacheConfiguration0.getTimeToIdleSeconds();
        cacheConfiguration0.setMaxElementsInMemory(1);
        java.lang.String str5 = cacheConfiguration0.getDiskStorePath();
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry6 = cacheConfiguration0.getEventListenerRegistry();
        org.junit.Assert.assertTrue(long1 == 300L);
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cacheEventListenerRegistry6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.EndpointConfiguration endpointConfiguration14 = null;
        cacheEndpoint12.setEndpointConfiguration(endpointConfiguration14);
        cacheEndpoint12.setEndpointUriIfNotSpecified("");
        org.apache.camel.ExchangePattern exchangePattern18 = null;
        org.apache.camel.Exchange exchange19 = cacheEndpoint12.createExchange(exchangePattern18);
        cacheEndpoint12.setOperation("");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration22 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration22.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry25 = null;
        cacheConfiguration22.setCacheLoaderRegistry(cacheLoaderRegistry25);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy27 = null;
        cacheConfiguration22.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy27);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry29 = null;
        cacheConfiguration22.setCacheLoaderRegistry(cacheLoaderRegistry29);
        int i31 = cacheConfiguration22.getMaxElementsInMemory();
        java.lang.String str32 = cacheConfiguration22.getCacheName();
        cacheEndpoint12.setConfig(cacheConfiguration22);
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry36 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener37 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry36.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener37);
        java.lang.Object obj39 = cacheEventListener37.clone();
        org.apache.camel.CamelContext camelContext41 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent42 = new org.apache.camel.component.cache.CacheComponent(camelContext41);
        boolean b43 = cacheComponent42.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory44 = cacheComponent42.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint45 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration46 = new org.apache.camel.component.cache.CacheConfiguration();
        long long47 = cacheConfiguration46.getTimeToIdleSeconds();
        cacheConfiguration46.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer50 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint45, cacheConfiguration46);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory51 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint52 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent42, cacheConfiguration46, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory51);
        org.apache.camel.Producer producer53 = cacheEndpoint52.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration54 = cacheEndpoint52.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer58 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression59 = cacheBasedMessageBodyReplacer58.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer61 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression59, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer65 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression66 = cacheBasedMessageBodyReplacer65.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer68 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression66, "");
        cacheBasedTokenReplacer61.setKey(expression66);
        org.apache.camel.Consumer consumer70 = cacheEndpoint52.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer61);
        boolean b71 = cacheEndpoint52.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer75 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression76 = cacheBasedMessageBodyReplacer75.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer80 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression81 = cacheBasedMessageBodyReplacer80.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer83 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression81, "");
        cacheBasedMessageBodyReplacer75.setKey(expression81);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer86 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression81, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration87 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer88 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint52, (org.apache.camel.Processor) cacheBasedXPathReplacer86, cacheConfiguration87);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener89 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer88);
        org.apache.camel.AsyncProcessor asyncProcessor90 = cacheConsumer88.getAsyncProcessor();
        cacheEventListener37.setCacheConsumer(cacheConsumer88);
        try {
            org.apache.camel.Exchange exchange92 = cacheEndpoint12.createCacheExchange("", "hi!", (java.lang.Object) cacheEventListener37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(exchange19);
        org.junit.Assert.assertTrue(i31 == 1000);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(cacheManagerFactory44);
        org.junit.Assert.assertTrue(long47 == 300L);
        org.junit.Assert.assertNotNull(producer53);
        org.junit.Assert.assertNotNull(cacheConfiguration54);
        org.junit.Assert.assertNotNull(expression59);
        org.junit.Assert.assertNotNull(expression66);
        org.junit.Assert.assertNotNull(consumer70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(expression76);
        org.junit.Assert.assertNotNull(expression81);
        org.junit.Assert.assertNotNull(asyncProcessor90);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus3 = cacheComponent1.getStatus();
        boolean b4 = cacheComponent1.isStarting();
        boolean b5 = cacheComponent1.isSuspended();
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertTrue("'" + serviceStatus3 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus3.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        boolean b15 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = new org.apache.camel.component.cache.CacheConfiguration();
        long long18 = cacheConfiguration17.getTimeToIdleSeconds();
        cacheConfiguration17.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer21 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint16, cacheConfiguration17);
        org.apache.camel.component.cache.CacheProducer cacheProducer22 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration17);
        cacheEndpoint12.suspend();
        java.lang.String str24 = cacheEndpoint12.toString();
        boolean b25 = cacheEndpoint12.isStarted();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(long18 == 300L);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        cacheConfiguration1.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer5 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        long long6 = cacheConfiguration1.getDiskExpiryThreadIntervalSeconds();
        boolean b7 = cacheConfiguration1.isOverflowToDisk();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration8 = new org.apache.camel.component.cache.CacheConfiguration();
        long long9 = cacheConfiguration8.getTimeToIdleSeconds();
        long long10 = cacheConfiguration8.getTimeToIdleSeconds();
        cacheConfiguration8.setMaxElementsInMemory(1);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry13 = cacheConfiguration8.getCacheLoaderRegistry();
        cacheConfiguration1.setCacheLoaderRegistry(cacheLoaderRegistry13);
        java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper> list_cacheLoaderWrapper15 = cacheLoaderRegistry13.getCacheLoaders();
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(long9 == 300L);
        org.junit.Assert.assertTrue(long10 == 300L);
        org.junit.Assert.assertNotNull(cacheLoaderRegistry13);
        org.junit.Assert.assertNotNull(list_cacheLoaderWrapper15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        cacheConfiguration1.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer5 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        try {
            boolean b6 = cacheProducer5.isSingleton();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long2 == 300L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.camel.Expression expression1 = null;
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("", expression1);
        cacheBasedMessageBodyReplacer2.start();
        cacheBasedMessageBodyReplacer2.start();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy1 = org.apache.camel.component.cache.CacheConverter.toPolicy("");
        org.junit.Assert.assertNotNull(memoryStoreEvictionPolicy1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration13 = new org.apache.camel.component.cache.CacheConfiguration();
        long long14 = cacheConfiguration13.getTimeToIdleSeconds();
        long long15 = cacheConfiguration13.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer16 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration13);
        cacheEndpoint12.setSynchronous(true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long14 == 300L);
        org.junit.Assert.assertTrue(long15 == 300L);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        cacheComponent2.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration5 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration5.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = null;
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry8);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory10 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint11 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration5, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory10);
        org.apache.camel.component.cache.FileCacheManagerFactory fileCacheManagerFactory13 = new org.apache.camel.component.cache.FileCacheManagerFactory("");
        fileCacheManagerFactory13.setFileName("");
        cacheEndpoint11.setCacheManagerFactory((org.apache.camel.component.cache.CacheManagerFactory) fileCacheManagerFactory13);
        fileCacheManagerFactory13.setFileName("");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer4 = cacheEventListener1.getCacheConsumer();
        java.lang.Object obj5 = cacheEventListener1.clone();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer6 = cacheEventListener1.getCacheConsumer();
        net.sf.ehcache.Ehcache ehcache7 = null;
        net.sf.ehcache.Element element8 = null;
        try {
            cacheEventListener1.notifyElementExpired(ehcache7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(cacheConsumer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(cacheConsumer6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        boolean b31 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer35 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression36 = cacheBasedMessageBodyReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer43 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression41, "");
        cacheBasedMessageBodyReplacer35.setKey(expression41);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer46 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression41, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration47 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer48 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint12, (org.apache.camel.Processor) cacheBasedXPathReplacer46, cacheConfiguration47);
        org.apache.camel.Expression expression49 = cacheBasedXPathReplacer46.getKey();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(expression36);
        org.junit.Assert.assertNotNull(expression41);
        org.junit.Assert.assertNotNull(expression49);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory2 = cacheComponent1.getCacheManagerFactory();
        java.util.Collection<java.lang.Class<? extends org.apache.camel.component.extension.ComponentExtension>> collection_cls3 = cacheComponent1.getSupportedExtensions();
        boolean b4 = cacheComponent1.isStopped();
        java.util.Collection<java.lang.Class<? extends org.apache.camel.component.extension.ComponentExtension>> collection_cls5 = cacheComponent1.getSupportedExtensions();
        boolean b6 = cacheComponent1.isSuspending();
        org.junit.Assert.assertNull(cacheManagerFactory2);
        org.junit.Assert.assertNotNull(collection_cls3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection_cls5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.List<net.sf.ehcache.event.CacheEventListener> list_cacheEventListener0 = null;
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry1 = new org.apache.camel.component.cache.CacheEventListenerRegistry(list_cacheEventListener0);
        org.apache.camel.CamelContext camelContext3 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent4 = new org.apache.camel.component.cache.CacheComponent(camelContext3);
        boolean b5 = cacheComponent4.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory6 = cacheComponent4.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint7 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration8 = new org.apache.camel.component.cache.CacheConfiguration();
        long long9 = cacheConfiguration8.getTimeToIdleSeconds();
        cacheConfiguration8.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer12 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint7, cacheConfiguration8);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory13 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint14 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent4, cacheConfiguration8, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory13);
        org.apache.camel.Producer producer15 = cacheEndpoint14.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration16 = cacheEndpoint14.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer20 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression21 = cacheBasedMessageBodyReplacer20.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer23 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression21, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer27 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression28 = cacheBasedMessageBodyReplacer27.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer30 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression28, "");
        cacheBasedTokenReplacer23.setKey(expression28);
        org.apache.camel.Consumer consumer32 = cacheEndpoint14.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer23);
        boolean b33 = cacheEndpoint14.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer37 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression38 = cacheBasedMessageBodyReplacer37.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer42 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression43 = cacheBasedMessageBodyReplacer42.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer45 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression43, "");
        cacheBasedMessageBodyReplacer37.setKey(expression43);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer48 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression43, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration49 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer50 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint14, (org.apache.camel.Processor) cacheBasedXPathReplacer48, cacheConfiguration49);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener51 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer50);
        org.apache.camel.component.cache.CacheConsumer cacheConsumer52 = cacheEventListener51.getCacheConsumer();
        cacheEventListenerRegistry1.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener51);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(cacheManagerFactory6);
        org.junit.Assert.assertTrue(long9 == 300L);
        org.junit.Assert.assertNotNull(producer15);
        org.junit.Assert.assertNotNull(cacheConfiguration16);
        org.junit.Assert.assertNotNull(expression21);
        org.junit.Assert.assertNotNull(expression28);
        org.junit.Assert.assertNotNull(consumer32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(expression38);
        org.junit.Assert.assertNotNull(expression43);
        org.junit.Assert.assertNotNull(cacheConsumer52);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.camel.component.cache.CacheLoaderWrapper[] cacheLoaderWrapper_array0 = new org.apache.camel.component.cache.CacheLoaderWrapper[] {};
        java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper> arraylist_cacheLoaderWrapper1 = new java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper1, cacheLoaderWrapper_array0);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = new org.apache.camel.component.cache.CacheLoaderRegistry((java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper1);
        int i4 = cacheLoaderRegistry3.size();
        java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper> list_cacheLoaderWrapper5 = cacheLoaderRegistry3.getCacheLoaders();
        org.junit.Assert.assertNotNull(cacheLoaderWrapper_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(list_cacheLoaderWrapper5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        boolean b14 = cacheEndpoint12.isBridgeErrorHandler();
        int i15 = cacheEndpoint12.getPollingConsumerQueueSize();
        cacheEndpoint12.shutdown();
        java.lang.String str17 = cacheEndpoint12.getOperation();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1000);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        boolean b14 = cacheEndpoint12.isSuspended();
        cacheEndpoint12.setPollingConsumerBlockWhenFull(false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.Producer producer14 = cacheEndpoint12.createProducer();
        boolean b15 = cacheEndpoint12.isStarted();
        org.apache.camel.spi.ExceptionHandler exceptionHandler16 = null;
        cacheEndpoint12.setExceptionHandler(exceptionHandler16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(producer14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        long long1 = cacheConfiguration0.getTimeToIdleSeconds();
        java.lang.String str2 = cacheConfiguration0.getCacheName();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration3 = cacheConfiguration0.copy();
        boolean b4 = cacheConfiguration3.isEternal();
        org.junit.Assert.assertTrue(long1 == 300L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(cacheConfiguration3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.Producer producer14 = cacheEndpoint12.createProducer();
        boolean b15 = cacheEndpoint12.isStarted();
        cacheEndpoint12.setPollingConsumerBlockWhenFull(false);
        org.apache.camel.Producer producer18 = cacheEndpoint12.createProducer();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(producer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(producer18);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        cacheConfiguration0.setEternal(false);
        long long5 = cacheConfiguration0.getTimeToLiveSeconds();
        cacheConfiguration0.setCacheName("endpoint131");
        org.junit.Assert.assertTrue(long5 == 300L);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        org.apache.camel.ComponentConfiguration componentConfiguration3 = cacheComponent2.createComponentConfiguration();
        java.lang.Class<? extends org.apache.camel.Endpoint> cls4 = cacheComponent2.getEndpointClass();
        boolean b5 = cacheComponent2.isStoppingOrStopped();
        cacheComponent2.stop();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration7 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration7.setOverflowToDisk(true);
        cacheConfiguration7.setTimeToLiveSeconds((long) (short) -1);
        cacheConfiguration7.setEternal(false);
        java.lang.String str14 = cacheConfiguration7.getCacheName();
        cacheConfiguration7.setDiskPersistent(true);
        org.apache.camel.CamelContext camelContext18 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent19 = new org.apache.camel.component.cache.CacheComponent(camelContext18);
        cacheComponent19.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration22 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration22.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry25 = null;
        cacheConfiguration22.setCacheLoaderRegistry(cacheLoaderRegistry25);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory27 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint28 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent19, cacheConfiguration22, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory27);
        net.sf.ehcache.CacheManager cacheManager29 = defaultCacheManagerFactory27.getInstance();
        boolean b30 = defaultCacheManagerFactory27.isStoppingOrStopped();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint31 = new org.apache.camel.component.cache.CacheEndpoint("2.21.0-SNAPSHOT", (org.apache.camel.Component) cacheComponent2, cacheConfiguration7, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory27);
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer35 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression36 = cacheBasedMessageBodyReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer43 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression41, "");
        cacheBasedMessageBodyReplacer35.setKey(expression41);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer46 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression41, "");
        cacheBasedXPathReplacer46.setXpath("");
        org.apache.camel.Expression expression49 = cacheBasedXPathReplacer46.getKey();
        cacheBasedXPathReplacer46.setKey("endpoint74");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration52 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration52.setDiskStorePath("hi!");
        cacheConfiguration52.setDiskStorePath("hi!");
        int i57 = cacheConfiguration52.getMaxElementsInMemory();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer58 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint31, (org.apache.camel.Processor) cacheBasedXPathReplacer46, cacheConfiguration52);
        org.junit.Assert.assertNotNull(componentConfiguration3);
        org.junit.Assert.assertNotNull(cls4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(cacheManager29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(expression36);
        org.junit.Assert.assertNotNull(expression41);
        org.junit.Assert.assertNotNull(expression49);
        org.junit.Assert.assertTrue(i57 == 1000);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.camel.component.cache.CacheLoaderWrapper[] cacheLoaderWrapper_array0 = new org.apache.camel.component.cache.CacheLoaderWrapper[] {};
        java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper> arraylist_cacheLoaderWrapper1 = new java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper1, cacheLoaderWrapper_array0);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = new org.apache.camel.component.cache.CacheLoaderRegistry((java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper1);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry4 = new org.apache.camel.component.cache.CacheLoaderRegistry((java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper1);
        java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper> list_cacheLoaderWrapper5 = cacheLoaderRegistry4.getCacheLoaders();
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry6 = new org.apache.camel.component.cache.CacheLoaderRegistry(list_cacheLoaderWrapper5);
        java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper> list_cacheLoaderWrapper7 = cacheLoaderRegistry6.getCacheLoaders();
        java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper> list_cacheLoaderWrapper8 = cacheLoaderRegistry6.getCacheLoaders();
        org.junit.Assert.assertNotNull(cacheLoaderWrapper_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_cacheLoaderWrapper5);
        org.junit.Assert.assertNotNull(list_cacheLoaderWrapper7);
        org.junit.Assert.assertNotNull(list_cacheLoaderWrapper8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        java.lang.Object obj4 = cacheEventListener1.clone();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer5 = cacheEventListener1.getCacheConsumer();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer6 = null;
        cacheEventListener1.setCacheConsumer(cacheConsumer6);
        net.sf.ehcache.Ehcache ehcache8 = null;
        net.sf.ehcache.Element element9 = null;
        try {
            cacheEventListener1.notifyElementPut(ehcache8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(cacheConsumer5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        cacheComponent2.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration5 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration5.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = null;
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry8);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory10 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint11 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration5, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory10);
        boolean b12 = cacheEndpoint11.isSingleton();
        java.lang.String str13 = cacheEndpoint11.getVersion();
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "2.21.0-SNAPSHOT" + "'", str13.equals("2.21.0-SNAPSHOT"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.camel.component.cache.FileCacheManagerFactory fileCacheManagerFactory1 = new org.apache.camel.component.cache.FileCacheManagerFactory("2.21.0-SNAPSHOT");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory2 = cacheComponent1.getCacheManagerFactory();
        java.util.Collection<java.lang.Class<? extends org.apache.camel.component.extension.ComponentExtension>> collection_cls3 = cacheComponent1.getSupportedExtensions();
        boolean b4 = cacheComponent1.isStopped();
        cacheComponent1.setConfigurationFile("");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration7 = null;
        try {
            cacheComponent1.setConfiguration(cacheConfiguration7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(cacheManagerFactory2);
        org.junit.Assert.assertNotNull(collection_cls3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        cacheConfiguration0.setEternal(true);
        long long5 = cacheConfiguration0.getTimeToIdleSeconds();
        cacheConfiguration0.setEternal(true);
        org.junit.Assert.assertTrue(long5 == 300L);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.EndpointConfiguration endpointConfiguration14 = null;
        cacheEndpoint12.setEndpointConfiguration(endpointConfiguration14);
        cacheEndpoint12.setEndpointUriIfNotSpecified("");
        org.apache.camel.ExchangePattern exchangePattern18 = null;
        org.apache.camel.Exchange exchange19 = cacheEndpoint12.createExchange(exchangePattern18);
        cacheEndpoint12.setOperation("");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration22 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration22.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry25 = null;
        cacheConfiguration22.setCacheLoaderRegistry(cacheLoaderRegistry25);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy27 = null;
        cacheConfiguration22.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy27);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry29 = null;
        cacheConfiguration22.setCacheLoaderRegistry(cacheLoaderRegistry29);
        int i31 = cacheConfiguration22.getMaxElementsInMemory();
        java.lang.String str32 = cacheConfiguration22.getCacheName();
        cacheEndpoint12.setConfig(cacheConfiguration22);
        org.apache.camel.CamelContext camelContext34 = null;
        cacheEndpoint12.setCamelContext(camelContext34);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(exchange19);
        org.junit.Assert.assertTrue(i31 == 1000);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj15 = cacheEndpoint12.getConsumerProperties();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertNotNull(map_str_obj15);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer8 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression9 = cacheBasedMessageBodyReplacer8.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer11 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression9, "");
        cacheBasedMessageBodyReplacer3.setKey(expression9);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer14 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression9, "");
        org.apache.camel.Expression expression15 = cacheBasedXPathReplacer14.getKey();
        java.lang.String str16 = cacheBasedXPathReplacer14.getXpath();
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertNotNull(expression9);
        org.junit.Assert.assertNotNull(expression15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj15 = null;
        cacheEndpoint12.setConsumerProperties(map_str_obj15);
        cacheEndpoint12.suspend();
        cacheEndpoint12.stop();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        cacheConfiguration0.setTimeToLiveSeconds((long) (short) -1);
        boolean b5 = cacheConfiguration0.isDiskPersistent();
        cacheConfiguration0.setMaxElementsInMemory((int) (short) 100);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration8 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration8.setDiskStorePath("hi!");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry11 = cacheConfiguration8.getEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry12 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        cacheConfiguration8.setEventListenerRegistry(cacheEventListenerRegistry12);
        cacheConfiguration0.setEventListenerRegistry(cacheEventListenerRegistry12);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(cacheEventListenerRegistry11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj14 = null;
        cacheEndpoint12.setConsumerProperties(map_str_obj14);
        org.apache.camel.ExchangePattern exchangePattern16 = cacheEndpoint12.getExchangePattern();
        org.apache.camel.CamelContext camelContext17 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent18 = new org.apache.camel.component.cache.CacheComponent(camelContext17);
        org.apache.camel.ComponentConfiguration componentConfiguration19 = cacheComponent18.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus20 = cacheComponent18.getStatus();
        boolean b21 = cacheComponent18.isStarted();
        boolean b22 = cacheComponent18.useRawUri();
        org.apache.camel.CamelContext camelContext23 = cacheComponent18.getCamelContext();
        org.apache.camel.CamelContext camelContext25 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent26 = new org.apache.camel.component.cache.CacheComponent(camelContext25);
        cacheComponent26.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration29 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration29.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry32 = null;
        cacheConfiguration29.setCacheLoaderRegistry(cacheLoaderRegistry32);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory34 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint35 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent26, cacheConfiguration29, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory34);
        cacheComponent18.setCacheManagerFactory((org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory34);
        cacheEndpoint12.setCacheManagerFactory((org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory34);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertTrue("'" + exchangePattern16 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern16.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(componentConfiguration19);
        org.junit.Assert.assertTrue("'" + serviceStatus20 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus20.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(camelContext23);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        boolean b31 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer35 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression36 = cacheBasedMessageBodyReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer43 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression41, "");
        cacheBasedMessageBodyReplacer35.setKey(expression41);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer46 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression41, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration47 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer48 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint12, (org.apache.camel.Processor) cacheBasedXPathReplacer46, cacheConfiguration47);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener49 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer48);
        org.apache.camel.AsyncProcessor asyncProcessor50 = cacheConsumer48.getAsyncProcessor();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint51 = cacheConsumer48.getEndpoint();
        org.apache.camel.Route route52 = cacheConsumer48.getRoute();
        org.apache.camel.spi.ExceptionHandler exceptionHandler53 = null;
        cacheConsumer48.setExceptionHandler(exceptionHandler53);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(expression36);
        org.junit.Assert.assertNotNull(expression41);
        org.junit.Assert.assertNotNull(asyncProcessor50);
        org.junit.Assert.assertNotNull(cacheEndpoint51);
        org.junit.Assert.assertNull(route52);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.camel.component.cache.CacheEventListener cacheEventListener0 = new org.apache.camel.component.cache.CacheEventListener();
        net.sf.ehcache.Ehcache ehcache1 = null;
        net.sf.ehcache.Element element2 = null;
        try {
            cacheEventListener0.notifyElementEvicted(ehcache1, element2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.List<net.sf.ehcache.event.CacheEventListener> list_cacheEventListener0 = null;
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry1 = new org.apache.camel.component.cache.CacheEventListenerRegistry(list_cacheEventListener0);
        java.util.List<net.sf.ehcache.event.CacheEventListener> list_cacheEventListener2 = cacheEventListenerRegistry1.getEventListeners();
        int i3 = cacheEventListenerRegistry1.size();
        org.junit.Assert.assertNotNull(list_cacheEventListener2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        cacheConfiguration1.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer5 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy7 = org.apache.camel.component.cache.CacheConverter.toPolicy("2.21.0-SNAPSHOT");
        cacheConfiguration1.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy7);
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertNotNull(memoryStoreEvictionPolicy7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = null;
        cacheEndpoint12.setCamelContext(camelContext13);
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer17 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str18 = cacheBasedMessageBodyReplacer17.getCacheName();
        cacheBasedMessageBodyReplacer17.stop();
        org.apache.camel.Consumer consumer20 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedMessageBodyReplacer17);
        boolean b21 = cacheEndpoint12.isBridgeErrorHandler();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(consumer20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        boolean b2 = cacheComponent1.useRawUri();
        cacheComponent1.setResolvePropertyPlaceholders(true);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        boolean b15 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = new org.apache.camel.component.cache.CacheConfiguration();
        long long18 = cacheConfiguration17.getTimeToIdleSeconds();
        cacheConfiguration17.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer21 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint16, cacheConfiguration17);
        org.apache.camel.component.cache.CacheProducer cacheProducer22 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration17);
        boolean b23 = cacheConfiguration17.isDiskPersistent();
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry24 = cacheConfiguration17.getEventListenerRegistry();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(long18 == 300L);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(cacheEventListenerRegistry24);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        cacheComponent2.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration5 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration5.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = null;
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry8);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory10 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint11 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration5, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory10);
        boolean b12 = cacheEndpoint11.isSingleton();
        cacheEndpoint11.setOperation("hi!");
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        cacheConfiguration1.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer5 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        long long6 = cacheConfiguration1.getDiskExpiryThreadIntervalSeconds();
        boolean b7 = cacheConfiguration1.isOverflowToDisk();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration8 = new org.apache.camel.component.cache.CacheConfiguration();
        long long9 = cacheConfiguration8.getTimeToIdleSeconds();
        long long10 = cacheConfiguration8.getTimeToIdleSeconds();
        cacheConfiguration8.setMaxElementsInMemory(1);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry13 = cacheConfiguration8.getCacheLoaderRegistry();
        cacheConfiguration1.setCacheLoaderRegistry(cacheLoaderRegistry13);
        cacheConfiguration1.setDiskExpiryThreadIntervalSeconds((long) (short) -1);
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(long9 == 300L);
        org.junit.Assert.assertTrue(long10 == 300L);
        org.junit.Assert.assertNotNull(cacheLoaderRegistry13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        boolean b14 = cacheEndpoint12.isSuspended();
        org.apache.camel.CamelContext camelContext16 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent17 = new org.apache.camel.component.cache.CacheComponent(camelContext16);
        cacheComponent17.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration20 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration20.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry23 = null;
        cacheConfiguration20.setCacheLoaderRegistry(cacheLoaderRegistry23);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory25 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint26 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent17, cacheConfiguration20, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory25);
        cacheEndpoint12.setCacheManagerFactory((org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory25);
        java.lang.String str28 = cacheEndpoint12.getEndpointUri();
        org.apache.camel.CamelContext camelContext31 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent32 = new org.apache.camel.component.cache.CacheComponent(camelContext31);
        org.apache.camel.ComponentConfiguration componentConfiguration33 = cacheComponent32.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus34 = cacheComponent32.getStatus();
        boolean b35 = cacheComponent32.isStarted();
        boolean b36 = cacheComponent32.useRawUri();
        org.apache.camel.CamelContext camelContext37 = cacheComponent32.getCamelContext();
        org.apache.camel.ServiceStatus serviceStatus38 = cacheComponent32.getStatus();
        try {
            org.apache.camel.Exchange exchange39 = cacheEndpoint12.createCacheExchange("hi!", "", (java.lang.Object) serviceStatus38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertNotNull(componentConfiguration33);
        org.junit.Assert.assertTrue("'" + serviceStatus34 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus34.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(camelContext37);
        org.junit.Assert.assertTrue("'" + serviceStatus38 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus38.equals(org.apache.camel.ServiceStatus.Stopped));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        cacheComponent2.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration5 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration5.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = null;
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry8);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory10 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint11 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration5, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory10);
        cacheConfiguration5.setDiskPersistent(false);
        cacheConfiguration5.setTimeToIdleSeconds((long) '#');
        cacheConfiguration5.setObjectCache(false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = null;
        cacheEndpoint12.setCamelContext(camelContext13);
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer17 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str18 = cacheBasedMessageBodyReplacer17.getCacheName();
        cacheBasedMessageBodyReplacer17.stop();
        org.apache.camel.Consumer consumer20 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedMessageBodyReplacer17);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration21 = cacheEndpoint12.getConfig();
        org.apache.camel.CamelContext camelContext23 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent24 = new org.apache.camel.component.cache.CacheComponent(camelContext23);
        boolean b25 = cacheComponent24.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory26 = cacheComponent24.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint27 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration28 = new org.apache.camel.component.cache.CacheConfiguration();
        long long29 = cacheConfiguration28.getTimeToIdleSeconds();
        cacheConfiguration28.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer32 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint27, cacheConfiguration28);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory33 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint34 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent24, cacheConfiguration28, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory33);
        long long35 = cacheEndpoint34.getPollingConsumerBlockTimeout();
        cacheEndpoint34.setEndpointUriIfNotSpecified("");
        boolean b38 = cacheEndpoint34.isLenientProperties();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory39 = cacheEndpoint34.getCacheManagerFactory();
        cacheEndpoint12.setCacheManagerFactory(cacheManagerFactory39);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(consumer20);
        org.junit.Assert.assertNotNull(cacheConfiguration21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(cacheManagerFactory26);
        org.junit.Assert.assertTrue(long29 == 300L);
        org.junit.Assert.assertTrue(long35 == 0L);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(cacheManagerFactory39);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer8 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression9 = cacheBasedMessageBodyReplacer8.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer11 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression9, "");
        cacheBasedMessageBodyReplacer3.setKey(expression9);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer14 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression9, "");
        java.lang.String str15 = cacheBasedXPathReplacer14.getXpath();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str19 = cacheBasedMessageBodyReplacer18.getCacheName();
        cacheBasedMessageBodyReplacer18.stop();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer24 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression25 = cacheBasedMessageBodyReplacer24.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer27 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression25, "");
        org.apache.camel.Expression expression28 = cacheBasedTokenReplacer27.getKey();
        cacheBasedMessageBodyReplacer18.setKey(expression28);
        cacheBasedXPathReplacer14.setKey(expression28);
        cacheBasedXPathReplacer14.setXpath("");
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertNotNull(expression9);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(expression25);
        org.junit.Assert.assertNotNull(expression28);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.camel.Expression expression1 = null;
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("", expression1);
        cacheBasedMessageBodyReplacer2.setCacheName("endpoint74");
        cacheBasedMessageBodyReplacer2.setCacheName("");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration13 = new org.apache.camel.component.cache.CacheConfiguration();
        long long14 = cacheConfiguration13.getTimeToIdleSeconds();
        long long15 = cacheConfiguration13.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer16 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration13);
        org.apache.camel.ServiceStatus serviceStatus17 = cacheEndpoint12.getStatus();
        cacheEndpoint12.setOperation("endpoint131");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long14 == 300L);
        org.junit.Assert.assertTrue(long15 == 300L);
        org.junit.Assert.assertTrue("'" + serviceStatus17 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus17.equals(org.apache.camel.ServiceStatus.Stopped));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj15 = null;
        cacheEndpoint12.setConsumerProperties(map_str_obj15);
        cacheEndpoint12.suspend();
        org.apache.camel.EndpointConfiguration endpointConfiguration18 = null;
        cacheEndpoint12.setEndpointConfiguration(endpointConfiguration18);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus3 = cacheComponent1.getStatus();
        org.apache.camel.CamelContext camelContext4 = null;
        cacheComponent1.setCamelContext(camelContext4);
        org.apache.camel.CamelContext camelContext6 = null;
        cacheComponent1.setCamelContext(camelContext6);
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertTrue("'" + serviceStatus3 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus3.equals(org.apache.camel.ServiceStatus.Stopped));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        org.apache.camel.CamelContext camelContext5 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent6 = new org.apache.camel.component.cache.CacheComponent(camelContext5);
        boolean b7 = cacheComponent6.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory8 = cacheComponent6.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint9 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration10 = new org.apache.camel.component.cache.CacheConfiguration();
        long long11 = cacheConfiguration10.getTimeToIdleSeconds();
        cacheConfiguration10.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer14 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint9, cacheConfiguration10);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory15 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent6, cacheConfiguration10, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory15);
        org.apache.camel.Producer producer17 = cacheEndpoint16.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration18 = cacheEndpoint16.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer22 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression23 = cacheBasedMessageBodyReplacer22.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer25 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression23, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer29 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression30 = cacheBasedMessageBodyReplacer29.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer32 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression30, "");
        cacheBasedTokenReplacer25.setKey(expression30);
        org.apache.camel.Consumer consumer34 = cacheEndpoint16.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer25);
        boolean b35 = cacheEndpoint16.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer39 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression40 = cacheBasedMessageBodyReplacer39.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer44 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression45 = cacheBasedMessageBodyReplacer44.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer47 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression45, "");
        cacheBasedMessageBodyReplacer39.setKey(expression45);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer50 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression45, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration51 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer52 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint16, (org.apache.camel.Processor) cacheBasedXPathReplacer50, cacheConfiguration51);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener53 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer52);
        org.apache.camel.AsyncProcessor asyncProcessor54 = cacheConsumer52.getAsyncProcessor();
        cacheEventListener1.setCacheConsumer(cacheConsumer52);
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint56 = cacheConsumer52.getEndpoint();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener57 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer52);
        java.lang.Object obj58 = cacheEventListener57.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(cacheManagerFactory8);
        org.junit.Assert.assertTrue(long11 == 300L);
        org.junit.Assert.assertNotNull(producer17);
        org.junit.Assert.assertNotNull(cacheConfiguration18);
        org.junit.Assert.assertNotNull(expression23);
        org.junit.Assert.assertNotNull(expression30);
        org.junit.Assert.assertNotNull(consumer34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(expression40);
        org.junit.Assert.assertNotNull(expression45);
        org.junit.Assert.assertNotNull(asyncProcessor54);
        org.junit.Assert.assertNotNull(cacheEndpoint56);
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        cacheConfiguration0.setTimeToLiveSeconds((long) (short) -1);
        org.apache.camel.component.cache.CacheLoaderWrapper[] cacheLoaderWrapper_array5 = new org.apache.camel.component.cache.CacheLoaderWrapper[] {};
        java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper> arraylist_cacheLoaderWrapper6 = new java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper6, cacheLoaderWrapper_array5);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = new org.apache.camel.component.cache.CacheLoaderRegistry((java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper6);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry9 = new org.apache.camel.component.cache.CacheLoaderRegistry((java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper6);
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry9);
        org.junit.Assert.assertNotNull(cacheLoaderWrapper_array5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        org.apache.camel.Processor processor14 = null;
        org.apache.camel.Consumer consumer15 = cacheEndpoint12.createConsumer(processor14);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration16 = cacheEndpoint12.getConfig();
        cacheConfiguration16.setDiskExpiryThreadIntervalSeconds((long) '#');
        cacheConfiguration16.setMaxElementsInMemory((int) (byte) 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertNotNull(consumer15);
        org.junit.Assert.assertNotNull(cacheConfiguration16);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        boolean b31 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer35 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression36 = cacheBasedMessageBodyReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer43 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression41, "");
        cacheBasedMessageBodyReplacer35.setKey(expression41);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer46 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression41, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration47 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer48 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint12, (org.apache.camel.Processor) cacheBasedXPathReplacer46, cacheConfiguration47);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener49 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer48);
        java.lang.String str50 = cacheConsumer48.toString();
        org.apache.camel.ServiceStatus serviceStatus51 = cacheConsumer48.getStatus();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(expression36);
        org.junit.Assert.assertNotNull(expression41);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Consumer[]" + "'", str50.equals("Consumer[]"));
        org.junit.Assert.assertTrue("'" + serviceStatus51 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus51.equals(org.apache.camel.ServiceStatus.Stopped));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer4 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression5 = cacheBasedMessageBodyReplacer4.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer7 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression5, "");
        org.apache.camel.Expression expression8 = cacheBasedTokenReplacer7.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer10 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("hi!", expression8, "endpoint131");
        org.apache.camel.CamelContext camelContext12 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent13 = new org.apache.camel.component.cache.CacheComponent(camelContext12);
        boolean b14 = cacheComponent13.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory15 = cacheComponent13.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = new org.apache.camel.component.cache.CacheConfiguration();
        long long18 = cacheConfiguration17.getTimeToIdleSeconds();
        cacheConfiguration17.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer21 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint16, cacheConfiguration17);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory22 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint23 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent13, cacheConfiguration17, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory22);
        org.apache.camel.CamelContext camelContext24 = cacheEndpoint23.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer25 = cacheEndpoint23.createPollingConsumer();
        boolean b26 = cacheEndpoint23.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint27 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration28 = new org.apache.camel.component.cache.CacheConfiguration();
        long long29 = cacheConfiguration28.getTimeToIdleSeconds();
        cacheConfiguration28.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer32 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint27, cacheConfiguration28);
        org.apache.camel.component.cache.CacheProducer cacheProducer33 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint23, cacheConfiguration28);
        java.lang.String str34 = cacheProducer33.toString();
        org.apache.camel.Exchange exchange35 = cacheProducer33.createExchange();
        try {
            cacheBasedTokenReplacer10.process(exchange35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(expression5);
        org.junit.Assert.assertNotNull(expression8);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(cacheManagerFactory15);
        org.junit.Assert.assertTrue(long18 == 300L);
        org.junit.Assert.assertNull(camelContext24);
        org.junit.Assert.assertNotNull(pollingConsumer25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(long29 == 300L);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Producer[]" + "'", str34.equals("Producer[]"));
        org.junit.Assert.assertNotNull(exchange35);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        org.apache.camel.Processor processor14 = null;
        org.apache.camel.Consumer consumer15 = cacheEndpoint12.createConsumer(processor14);
        org.apache.camel.PollingConsumer pollingConsumer16 = cacheEndpoint12.createPollingConsumer();
        cacheEndpoint12.stop();
        int i18 = cacheEndpoint12.getPollingConsumerQueueSize();
        cacheEndpoint12.setPollingConsumerBlockWhenFull(false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertNotNull(consumer15);
        org.junit.Assert.assertNotNull(pollingConsumer16);
        org.junit.Assert.assertTrue(i18 == 1000);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        cacheConfiguration1.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer5 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        long long6 = cacheConfiguration1.getDiskExpiryThreadIntervalSeconds();
        boolean b7 = cacheConfiguration1.isOverflowToDisk();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration8 = cacheConfiguration1.copy();
        cacheConfiguration8.setObjectCache(false);
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(cacheConfiguration8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        boolean b31 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer35 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression36 = cacheBasedMessageBodyReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer43 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression41, "");
        cacheBasedMessageBodyReplacer35.setKey(expression41);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer46 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression41, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration47 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer48 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint12, (org.apache.camel.Processor) cacheBasedXPathReplacer46, cacheConfiguration47);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener49 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer48);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener50 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer48);
        boolean b51 = cacheConsumer48.isStoppingOrStopped();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(expression36);
        org.junit.Assert.assertNotNull(expression41);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        boolean b15 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = new org.apache.camel.component.cache.CacheConfiguration();
        long long18 = cacheConfiguration17.getTimeToIdleSeconds();
        cacheConfiguration17.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer21 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint16, cacheConfiguration17);
        org.apache.camel.component.cache.CacheProducer cacheProducer22 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration17);
        cacheEndpoint12.suspend();
        boolean b24 = cacheEndpoint12.isPollingConsumerBlockWhenFull();
        cacheEndpoint12.setOperation("endpoint131");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(long18 == 300L);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        cacheComponent2.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration5 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration5.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = null;
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry8);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory10 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint11 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration5, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory10);
        defaultCacheManagerFactory10.start();
        boolean b13 = defaultCacheManagerFactory10.isSuspended();
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer5 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression6 = cacheBasedMessageBodyReplacer5.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer8 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression6, "");
        org.apache.camel.Expression expression9 = cacheBasedTokenReplacer8.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer10 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("Producer[]", expression9);
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer12 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression9, "hi!");
        org.apache.camel.Expression expression13 = cacheBasedTokenReplacer12.getKey();
        org.junit.Assert.assertNotNull(expression6);
        org.junit.Assert.assertNotNull(expression9);
        org.junit.Assert.assertNotNull(expression13);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory2 = cacheComponent1.getCacheManagerFactory();
        java.util.Collection<java.lang.Class<? extends org.apache.camel.component.extension.ComponentExtension>> collection_cls3 = cacheComponent1.getSupportedExtensions();
        boolean b4 = cacheComponent1.isSuspending();
        java.lang.String str5 = cacheComponent1.getVersion();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        java.lang.String str8 = cacheConfiguration6.getCacheName();
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry9 = cacheConfiguration6.getEventListenerRegistry();
        cacheComponent1.setConfiguration(cacheConfiguration6);
        org.junit.Assert.assertNull(cacheManagerFactory2);
        org.junit.Assert.assertNotNull(collection_cls3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2.21.0-SNAPSHOT" + "'", str5.equals("2.21.0-SNAPSHOT"));
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cacheEventListenerRegistry9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        java.lang.String str14 = cacheEndpoint12.getKey();
        cacheEndpoint12.stop();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        cacheConfiguration0.setEternal(true);
        cacheConfiguration0.setOverflowToDisk(false);
        cacheConfiguration0.setMaxElementsInMemory((int) (byte) 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus3 = cacheComponent1.getStatus();
        boolean b4 = cacheComponent1.isStarted();
        boolean b5 = cacheComponent1.useRawUri();
        org.apache.camel.CamelContext camelContext6 = cacheComponent1.getCamelContext();
        org.apache.camel.ServiceStatus serviceStatus7 = cacheComponent1.getStatus();
        java.util.Collection<java.lang.Class<? extends org.apache.camel.component.extension.ComponentExtension>> collection_cls8 = cacheComponent1.getSupportedExtensions();
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertTrue("'" + serviceStatus3 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus3.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(camelContext6);
        org.junit.Assert.assertTrue("'" + serviceStatus7 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus7.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertNotNull(collection_cls8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer8 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression9 = cacheBasedMessageBodyReplacer8.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer11 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression9, "");
        cacheBasedMessageBodyReplacer3.setKey(expression9);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer14 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression9, "");
        cacheBasedXPathReplacer14.setXpath("");
        org.apache.camel.Expression expression17 = cacheBasedXPathReplacer14.getKey();
        cacheBasedXPathReplacer14.setKey("endpoint74");
        org.apache.camel.CamelContext camelContext21 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent22 = new org.apache.camel.component.cache.CacheComponent(camelContext21);
        boolean b23 = cacheComponent22.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory24 = cacheComponent22.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint25 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration26 = new org.apache.camel.component.cache.CacheConfiguration();
        long long27 = cacheConfiguration26.getTimeToIdleSeconds();
        cacheConfiguration26.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer30 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint25, cacheConfiguration26);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory31 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint32 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent22, cacheConfiguration26, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory31);
        org.apache.camel.CamelContext camelContext33 = cacheEndpoint32.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer34 = cacheEndpoint32.createPollingConsumer();
        boolean b35 = cacheEndpoint32.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint36 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration37 = new org.apache.camel.component.cache.CacheConfiguration();
        long long38 = cacheConfiguration37.getTimeToIdleSeconds();
        cacheConfiguration37.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer41 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint36, cacheConfiguration37);
        org.apache.camel.component.cache.CacheProducer cacheProducer42 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint32, cacheConfiguration37);
        java.lang.String str43 = cacheProducer42.toString();
        org.apache.camel.Exchange exchange44 = cacheProducer42.createExchange();
        try {
            cacheBasedXPathReplacer14.process(exchange44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertNotNull(expression9);
        org.junit.Assert.assertNotNull(expression17);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(cacheManagerFactory24);
        org.junit.Assert.assertTrue(long27 == 300L);
        org.junit.Assert.assertNull(camelContext33);
        org.junit.Assert.assertNotNull(pollingConsumer34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(long38 == 300L);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Producer[]" + "'", str43.equals("Producer[]"));
        org.junit.Assert.assertNotNull(exchange44);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        boolean b15 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = new org.apache.camel.component.cache.CacheConfiguration();
        long long18 = cacheConfiguration17.getTimeToIdleSeconds();
        cacheConfiguration17.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer21 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint16, cacheConfiguration17);
        org.apache.camel.component.cache.CacheProducer cacheProducer22 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration17);
        cacheEndpoint12.stop();
        org.apache.camel.Component component24 = cacheEndpoint12.getComponent();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory25 = cacheEndpoint12.getCacheManagerFactory();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(long18 == 300L);
        org.junit.Assert.assertNotNull(component24);
        org.junit.Assert.assertNotNull(cacheManagerFactory25);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.io.InputStream inputStream0 = null;
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory2 = new org.apache.camel.component.cache.DefaultCacheManagerFactory(inputStream0, "endpoint131");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        boolean b31 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer35 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression36 = cacheBasedMessageBodyReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer43 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression41, "");
        cacheBasedMessageBodyReplacer35.setKey(expression41);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer46 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression41, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration47 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer48 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint12, (org.apache.camel.Processor) cacheBasedXPathReplacer46, cacheConfiguration47);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener49 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer48);
        org.apache.camel.AsyncProcessor asyncProcessor50 = cacheConsumer48.getAsyncProcessor();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint51 = cacheConsumer48.getEndpoint();
        org.apache.camel.Route route52 = cacheConsumer48.getRoute();
        org.apache.camel.Route route53 = null;
        cacheConsumer48.setRoute(route53);
        org.apache.camel.spi.ExceptionHandler exceptionHandler55 = cacheConsumer48.getExceptionHandler();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(expression36);
        org.junit.Assert.assertNotNull(expression41);
        org.junit.Assert.assertNotNull(asyncProcessor50);
        org.junit.Assert.assertNotNull(cacheEndpoint51);
        org.junit.Assert.assertNull(route52);
        org.junit.Assert.assertNotNull(exceptionHandler55);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        cacheComponent1.setResolvePropertyPlaceholders(false);
        org.apache.camel.ComponentConfiguration componentConfiguration4 = cacheComponent1.createComponentConfiguration();
        java.util.Collection<java.lang.Class<? extends org.apache.camel.component.extension.ComponentExtension>> collection_cls5 = cacheComponent1.getSupportedExtensions();
        org.junit.Assert.assertNotNull(componentConfiguration4);
        org.junit.Assert.assertNotNull(collection_cls5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        boolean b14 = cacheEndpoint12.isSuspended();
        org.apache.camel.CamelContext camelContext16 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent17 = new org.apache.camel.component.cache.CacheComponent(camelContext16);
        cacheComponent17.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration20 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration20.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry23 = null;
        cacheConfiguration20.setCacheLoaderRegistry(cacheLoaderRegistry23);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory25 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint26 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent17, cacheConfiguration20, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory25);
        cacheEndpoint12.setCacheManagerFactory((org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory25);
        java.lang.String str28 = cacheEndpoint12.getEndpointUri();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration31 = new org.apache.camel.component.cache.CacheConfiguration();
        long long32 = cacheConfiguration31.getTimeToIdleSeconds();
        long long33 = cacheConfiguration31.getTimeToIdleSeconds();
        cacheConfiguration31.setMaxElementsInMemory(1);
        try {
            org.apache.camel.Exchange exchange36 = cacheEndpoint12.createCacheExchange("endpoint131", "2.21.0-SNAPSHOT", (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue(long32 == 300L);
        org.junit.Assert.assertTrue(long33 == 300L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer5 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression6 = cacheBasedMessageBodyReplacer5.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer10 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression11 = cacheBasedMessageBodyReplacer10.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer13 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression11, "");
        cacheBasedMessageBodyReplacer5.setKey(expression11);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer16 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression11, "");
        java.lang.String str17 = cacheBasedXPathReplacer16.getXpath();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer20 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str21 = cacheBasedMessageBodyReplacer20.getCacheName();
        cacheBasedMessageBodyReplacer20.stop();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer26 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression27 = cacheBasedMessageBodyReplacer26.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer29 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression27, "");
        org.apache.camel.Expression expression30 = cacheBasedTokenReplacer29.getKey();
        cacheBasedMessageBodyReplacer20.setKey(expression30);
        cacheBasedXPathReplacer16.setKey(expression30);
        org.apache.camel.Expression expression33 = cacheBasedXPathReplacer16.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer34 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", expression33);
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer39 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression40 = cacheBasedMessageBodyReplacer39.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer42 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression40, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer46 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression47 = cacheBasedMessageBodyReplacer46.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer49 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression47, "");
        cacheBasedTokenReplacer42.setKey(expression47);
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer51 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", expression47);
        cacheBasedMessageBodyReplacer34.setKey(expression47);
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer54 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("endpoint131", expression47, "");
        cacheBasedTokenReplacer54.setReplacementToken("");
        org.junit.Assert.assertNotNull(expression6);
        org.junit.Assert.assertNotNull(expression11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(expression27);
        org.junit.Assert.assertNotNull(expression30);
        org.junit.Assert.assertNotNull(expression33);
        org.junit.Assert.assertNotNull(expression40);
        org.junit.Assert.assertNotNull(expression47);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        java.lang.Class<? extends org.apache.camel.Endpoint> cls3 = cacheComponent1.getEndpointClass();
        boolean b4 = cacheComponent1.isStoppingOrStopped();
        boolean b5 = cacheComponent1.isSuspending();
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertNotNull(cls3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy5 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy5);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry7 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry7);
        int i9 = cacheConfiguration0.getMaxElementsInMemory();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration10 = cacheConfiguration0.copy();
        boolean b11 = cacheConfiguration10.isOverflowToDisk();
        org.junit.Assert.assertTrue(i9 == 1000);
        org.junit.Assert.assertNotNull(cacheConfiguration10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        boolean b31 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer35 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression36 = cacheBasedMessageBodyReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer43 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression41, "");
        cacheBasedMessageBodyReplacer35.setKey(expression41);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer46 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression41, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration47 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer48 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint12, (org.apache.camel.Processor) cacheBasedXPathReplacer46, cacheConfiguration47);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener49 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer48);
        org.apache.camel.AsyncProcessor asyncProcessor50 = cacheConsumer48.getAsyncProcessor();
        org.apache.camel.spi.ExceptionHandler exceptionHandler51 = cacheConsumer48.getExceptionHandler();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(expression36);
        org.junit.Assert.assertNotNull(expression41);
        org.junit.Assert.assertNotNull(asyncProcessor50);
        org.junit.Assert.assertNotNull(exceptionHandler51);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer8 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression9 = cacheBasedMessageBodyReplacer8.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer11 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression9, "");
        cacheBasedMessageBodyReplacer3.setKey(expression9);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer14 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression9, "");
        cacheBasedXPathReplacer14.setXpath("");
        cacheBasedXPathReplacer14.stop();
        cacheBasedXPathReplacer14.setXpath("Consumer[]");
        cacheBasedXPathReplacer14.setKey("");
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertNotNull(expression9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        boolean b14 = cacheEndpoint12.isSuspended();
        org.apache.camel.CamelContext camelContext16 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent17 = new org.apache.camel.component.cache.CacheComponent(camelContext16);
        cacheComponent17.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration20 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration20.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry23 = null;
        cacheConfiguration20.setCacheLoaderRegistry(cacheLoaderRegistry23);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory25 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint26 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent17, cacheConfiguration20, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory25);
        cacheEndpoint12.setCacheManagerFactory((org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory25);
        java.lang.String str28 = cacheEndpoint12.getEndpointUri();
        org.apache.camel.Component component29 = cacheEndpoint12.getComponent();
        cacheEndpoint12.stop();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertNotNull(component29);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = null;
        cacheEndpoint12.setCamelContext(camelContext13);
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer17 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str18 = cacheBasedMessageBodyReplacer17.getCacheName();
        cacheBasedMessageBodyReplacer17.stop();
        org.apache.camel.Consumer consumer20 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedMessageBodyReplacer17);
        cacheEndpoint12.shutdown();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(consumer20);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        cacheConfiguration1.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer5 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint6 = cacheProducer5.getEndpoint();
        try {
            java.lang.String str7 = cacheProducer5.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertNull(cacheEndpoint6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        org.apache.camel.Processor processor14 = null;
        org.apache.camel.Consumer consumer15 = cacheEndpoint12.createConsumer(processor14);
        org.apache.camel.PollingConsumer pollingConsumer16 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.EndpointConfiguration endpointConfiguration17 = null;
        cacheEndpoint12.setEndpointConfiguration(endpointConfiguration17);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertNotNull(consumer15);
        org.junit.Assert.assertNotNull(pollingConsumer16);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str3 = cacheBasedMessageBodyReplacer2.getCacheName();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer7 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression8 = cacheBasedMessageBodyReplacer7.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer12 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression13 = cacheBasedMessageBodyReplacer12.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer15 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression13, "");
        cacheBasedMessageBodyReplacer7.setKey(expression13);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer18 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression13, "");
        cacheBasedMessageBodyReplacer2.setKey(expression13);
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer24 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression25 = cacheBasedMessageBodyReplacer24.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer29 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression30 = cacheBasedMessageBodyReplacer29.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer32 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression30, "");
        cacheBasedMessageBodyReplacer24.setKey(expression30);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer35 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression30, "");
        java.lang.String str36 = cacheBasedXPathReplacer35.getXpath();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer39 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str40 = cacheBasedMessageBodyReplacer39.getCacheName();
        cacheBasedMessageBodyReplacer39.stop();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer45 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression46 = cacheBasedMessageBodyReplacer45.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer48 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression46, "");
        org.apache.camel.Expression expression49 = cacheBasedTokenReplacer48.getKey();
        cacheBasedMessageBodyReplacer39.setKey(expression49);
        cacheBasedXPathReplacer35.setKey(expression49);
        org.apache.camel.Expression expression52 = cacheBasedXPathReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer53 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", expression52);
        cacheBasedMessageBodyReplacer2.setKey(expression52);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(expression8);
        org.junit.Assert.assertNotNull(expression13);
        org.junit.Assert.assertNotNull(expression25);
        org.junit.Assert.assertNotNull(expression30);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        org.junit.Assert.assertNotNull(expression46);
        org.junit.Assert.assertNotNull(expression49);
        org.junit.Assert.assertNotNull(expression52);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        cacheEndpoint12.setEndpointUriIfNotSpecified("");
        boolean b16 = cacheEndpoint12.isLenientProperties();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory17 = cacheEndpoint12.getCacheManagerFactory();
        boolean b18 = cacheEndpoint12.isRunAllowed();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(cacheManagerFactory17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        cacheBasedMessageBodyReplacer2.start();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = null;
        cacheEndpoint12.setCamelContext(camelContext13);
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer17 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str18 = cacheBasedMessageBodyReplacer17.getCacheName();
        cacheBasedMessageBodyReplacer17.stop();
        org.apache.camel.Consumer consumer20 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedMessageBodyReplacer17);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration21 = cacheEndpoint12.getConfig();
        boolean b22 = cacheEndpoint12.isStopped();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(consumer20);
        org.junit.Assert.assertNotNull(cacheConfiguration21);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.ExchangePattern exchangePattern15 = null;
        cacheEndpoint12.setExchangePattern(exchangePattern15);
        boolean b17 = cacheEndpoint12.isStarted();
        cacheEndpoint12.setEndpointUriIfNotSpecified("hi!");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        java.lang.Object obj4 = cacheEventListener1.clone();
        org.apache.camel.CamelContext camelContext6 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent7 = new org.apache.camel.component.cache.CacheComponent(camelContext6);
        boolean b8 = cacheComponent7.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory9 = cacheComponent7.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint10 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration11 = new org.apache.camel.component.cache.CacheConfiguration();
        long long12 = cacheConfiguration11.getTimeToIdleSeconds();
        cacheConfiguration11.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer15 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint10, cacheConfiguration11);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory16 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint17 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent7, cacheConfiguration11, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory16);
        org.apache.camel.Producer producer18 = cacheEndpoint17.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration19 = cacheEndpoint17.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer23 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression24 = cacheBasedMessageBodyReplacer23.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer26 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression24, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer30 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression31 = cacheBasedMessageBodyReplacer30.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer33 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression31, "");
        cacheBasedTokenReplacer26.setKey(expression31);
        org.apache.camel.Consumer consumer35 = cacheEndpoint17.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer26);
        boolean b36 = cacheEndpoint17.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer45 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression46 = cacheBasedMessageBodyReplacer45.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer48 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression46, "");
        cacheBasedMessageBodyReplacer40.setKey(expression46);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer51 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression46, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration52 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer53 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint17, (org.apache.camel.Processor) cacheBasedXPathReplacer51, cacheConfiguration52);
        cacheEventListener1.setCacheConsumer(cacheConsumer53);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(cacheManagerFactory9);
        org.junit.Assert.assertTrue(long12 == 300L);
        org.junit.Assert.assertNotNull(producer18);
        org.junit.Assert.assertNotNull(cacheConfiguration19);
        org.junit.Assert.assertNotNull(expression24);
        org.junit.Assert.assertNotNull(expression31);
        org.junit.Assert.assertNotNull(consumer35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(expression41);
        org.junit.Assert.assertNotNull(expression46);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration1 = new org.apache.camel.component.cache.CacheConfiguration();
        long long2 = cacheConfiguration1.getTimeToIdleSeconds();
        cacheConfiguration1.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer5 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint0, cacheConfiguration1);
        long long6 = cacheConfiguration1.getDiskExpiryThreadIntervalSeconds();
        boolean b7 = cacheConfiguration1.isOverflowToDisk();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration8 = new org.apache.camel.component.cache.CacheConfiguration();
        long long9 = cacheConfiguration8.getTimeToIdleSeconds();
        long long10 = cacheConfiguration8.getTimeToIdleSeconds();
        cacheConfiguration8.setMaxElementsInMemory(1);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry13 = cacheConfiguration8.getCacheLoaderRegistry();
        cacheConfiguration1.setCacheLoaderRegistry(cacheLoaderRegistry13);
        boolean b15 = cacheConfiguration1.isOverflowToDisk();
        int i16 = cacheConfiguration1.getMaxElementsInMemory();
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(long9 == 300L);
        org.junit.Assert.assertTrue(long10 == 300L);
        org.junit.Assert.assertNotNull(cacheLoaderRegistry13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1000);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus3 = cacheComponent1.getStatus();
        boolean b4 = cacheComponent1.isStarted();
        boolean b5 = cacheComponent1.isResolvePropertyPlaceholders();
        boolean b6 = cacheComponent1.isStarting();
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertTrue("'" + serviceStatus3 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus3.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus3 = cacheComponent1.getStatus();
        boolean b4 = cacheComponent1.isStarted();
        boolean b5 = cacheComponent1.isResolvePropertyPlaceholders();
        cacheComponent1.setResolvePropertyPlaceholders(false);
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertTrue("'" + serviceStatus3 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus3.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        cacheConfiguration0.setDiskPersistent(false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer4 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("endpoint74", "hi!", "");
        org.apache.camel.Expression expression5 = cacheBasedXPathReplacer4.getKey();
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer7 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("endpoint74", expression5, "Producer[]");
        org.junit.Assert.assertNotNull(expression5);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus3 = cacheComponent1.getStatus();
        org.apache.camel.CamelContext camelContext4 = null;
        cacheComponent1.setCamelContext(camelContext4);
        cacheComponent1.setConfigurationFile("hi!");
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertTrue("'" + serviceStatus3 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus3.equals(org.apache.camel.ServiceStatus.Stopped));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        boolean b2 = cacheComponent1.isRunAllowed();
        cacheComponent1.suspend();
        org.apache.camel.component.cache.FileCacheManagerFactory fileCacheManagerFactory5 = new org.apache.camel.component.cache.FileCacheManagerFactory("");
        cacheComponent1.setCacheManagerFactory((org.apache.camel.component.cache.CacheManagerFactory) fileCacheManagerFactory5);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        boolean b2 = cacheComponent1.isRunAllowed();
        cacheComponent1.suspend();
        java.lang.Class<? extends org.apache.camel.Endpoint> cls4 = cacheComponent1.getEndpointClass();
        boolean b5 = cacheComponent1.isStarted();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(cls4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        boolean b15 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = new org.apache.camel.component.cache.CacheConfiguration();
        long long18 = cacheConfiguration17.getTimeToIdleSeconds();
        cacheConfiguration17.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer21 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint16, cacheConfiguration17);
        org.apache.camel.component.cache.CacheProducer cacheProducer22 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration17);
        cacheEndpoint12.stop();
        org.apache.camel.Component component24 = cacheEndpoint12.getComponent();
        boolean b25 = cacheEndpoint12.isStoppingOrStopped();
        org.apache.camel.CamelContext camelContext27 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent28 = new org.apache.camel.component.cache.CacheComponent(camelContext27);
        boolean b29 = cacheComponent28.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory30 = cacheComponent28.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint31 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration32 = new org.apache.camel.component.cache.CacheConfiguration();
        long long33 = cacheConfiguration32.getTimeToIdleSeconds();
        cacheConfiguration32.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer36 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint31, cacheConfiguration32);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory37 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint38 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent28, cacheConfiguration32, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory37);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration39 = new org.apache.camel.component.cache.CacheConfiguration();
        long long40 = cacheConfiguration39.getTimeToIdleSeconds();
        long long41 = cacheConfiguration39.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer42 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint38, cacheConfiguration39);
        boolean b43 = cacheProducer42.isSingleton();
        org.apache.camel.CamelContext camelContext45 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent46 = new org.apache.camel.component.cache.CacheComponent(camelContext45);
        boolean b47 = cacheComponent46.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory48 = cacheComponent46.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint49 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration50 = new org.apache.camel.component.cache.CacheConfiguration();
        long long51 = cacheConfiguration50.getTimeToIdleSeconds();
        cacheConfiguration50.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer54 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint49, cacheConfiguration50);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory55 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint56 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent46, cacheConfiguration50, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory55);
        long long57 = cacheEndpoint56.getPollingConsumerBlockTimeout();
        boolean b58 = cacheEndpoint56.isSuspended();
        org.apache.camel.Component component59 = cacheEndpoint56.getComponent();
        org.apache.camel.CamelContext camelContext61 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent62 = new org.apache.camel.component.cache.CacheComponent(camelContext61);
        boolean b63 = cacheComponent62.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory64 = cacheComponent62.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint65 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration66 = new org.apache.camel.component.cache.CacheConfiguration();
        long long67 = cacheConfiguration66.getTimeToIdleSeconds();
        cacheConfiguration66.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer70 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint65, cacheConfiguration66);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory71 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint72 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent62, cacheConfiguration66, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory71);
        org.apache.camel.Producer producer73 = cacheEndpoint72.createProducer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj74 = null;
        cacheEndpoint72.setConsumerProperties(map_str_obj74);
        org.apache.camel.ExchangePattern exchangePattern76 = cacheEndpoint72.getExchangePattern();
        org.apache.camel.Exchange exchange77 = cacheEndpoint56.createExchange(exchangePattern76);
        org.apache.camel.Exchange exchange78 = cacheProducer42.createExchange(exchangePattern76);
        cacheEndpoint12.setExchangePattern(exchangePattern76);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(long18 == 300L);
        org.junit.Assert.assertNotNull(component24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(cacheManagerFactory30);
        org.junit.Assert.assertTrue(long33 == 300L);
        org.junit.Assert.assertTrue(long40 == 300L);
        org.junit.Assert.assertTrue(long41 == 300L);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(cacheManagerFactory48);
        org.junit.Assert.assertTrue(long51 == 300L);
        org.junit.Assert.assertTrue(long57 == 0L);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(component59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNull(cacheManagerFactory64);
        org.junit.Assert.assertTrue(long67 == 300L);
        org.junit.Assert.assertNotNull(producer73);
        org.junit.Assert.assertTrue("'" + exchangePattern76 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern76.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange77);
        org.junit.Assert.assertNotNull(exchange78);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj15 = null;
        cacheEndpoint12.setConsumerProperties(map_str_obj15);
        cacheEndpoint12.suspend();
        cacheEndpoint12.setOperation("endpoint131");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        org.apache.camel.Processor processor14 = null;
        org.apache.camel.Consumer consumer15 = cacheEndpoint12.createConsumer(processor14);
        cacheEndpoint12.setPollingConsumerBlockWhenFull(false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertNotNull(consumer15);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        cacheEndpoint12.setEndpointUriIfNotSpecified("");
        org.apache.camel.spi.ExceptionHandler exceptionHandler16 = cacheEndpoint12.getExceptionHandler();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertNull(exceptionHandler16);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer4 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("endpoint74", "hi!", "");
        org.apache.camel.Expression expression5 = cacheBasedXPathReplacer4.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer7 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("Consumer[]", expression5, "Producer[]");
        org.junit.Assert.assertNotNull(expression5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.ServiceStatus serviceStatus15 = cacheEndpoint12.getStatus();
        boolean b16 = cacheEndpoint12.isStarting();
        boolean b17 = cacheEndpoint12.isStarting();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue("'" + serviceStatus15 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus15.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        boolean b14 = cacheEndpoint12.isBridgeErrorHandler();
        java.lang.String str15 = cacheEndpoint12.getEndpointKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer20 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        cacheBasedMessageBodyReplacer20.setCacheName("2.21.0-SNAPSHOT");
        org.apache.camel.Expression expression23 = cacheBasedMessageBodyReplacer20.getKey();
        try {
            org.apache.camel.Exchange exchange24 = cacheEndpoint12.createCacheExchange("endpoint131", "2.21.0-SNAPSHOT", (java.lang.Object) cacheBasedMessageBodyReplacer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(expression23);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        cacheConfiguration0.setEternal(false);
        long long5 = cacheConfiguration0.getTimeToLiveSeconds();
        java.lang.String str6 = cacheConfiguration0.getDiskStorePath();
        cacheConfiguration0.setTimeToLiveSeconds((long) (short) 10);
        org.junit.Assert.assertTrue(long5 == 300L);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.ServiceStatus serviceStatus15 = cacheEndpoint12.getStatus();
        java.lang.String str16 = cacheEndpoint12.getEndpointUri();
        boolean b17 = cacheEndpoint12.isRunAllowed();
        cacheEndpoint12.setPollingConsumerQueueSize((int) (byte) 100);
        org.apache.camel.CamelContext camelContext21 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent22 = new org.apache.camel.component.cache.CacheComponent(camelContext21);
        boolean b23 = cacheComponent22.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory24 = cacheComponent22.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint25 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration26 = new org.apache.camel.component.cache.CacheConfiguration();
        long long27 = cacheConfiguration26.getTimeToIdleSeconds();
        cacheConfiguration26.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer30 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint25, cacheConfiguration26);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory31 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint32 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent22, cacheConfiguration26, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory31);
        org.apache.camel.Producer producer33 = cacheEndpoint32.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration34 = cacheEndpoint32.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer38 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression39 = cacheBasedMessageBodyReplacer38.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer41 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression39, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer45 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression46 = cacheBasedMessageBodyReplacer45.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer48 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression46, "");
        cacheBasedTokenReplacer41.setKey(expression46);
        org.apache.camel.Consumer consumer50 = cacheEndpoint32.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer41);
        org.apache.camel.Consumer consumer51 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer41);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue("'" + serviceStatus15 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus15.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(cacheManagerFactory24);
        org.junit.Assert.assertTrue(long27 == 300L);
        org.junit.Assert.assertNotNull(producer33);
        org.junit.Assert.assertNotNull(cacheConfiguration34);
        org.junit.Assert.assertNotNull(expression39);
        org.junit.Assert.assertNotNull(expression46);
        org.junit.Assert.assertNotNull(consumer50);
        org.junit.Assert.assertNotNull(consumer51);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration13 = new org.apache.camel.component.cache.CacheConfiguration();
        long long14 = cacheConfiguration13.getTimeToIdleSeconds();
        long long15 = cacheConfiguration13.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer16 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration13);
        cacheEndpoint12.stop();
        boolean b18 = cacheEndpoint12.isStoppingOrStopped();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long14 == 300L);
        org.junit.Assert.assertTrue(long15 == 300L);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory3 = cacheComponent1.getCacheManagerFactory();
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertNull(cacheManagerFactory3);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy5 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy5);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry7 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry7);
        int i9 = cacheConfiguration0.getMaxElementsInMemory();
        java.lang.String str10 = cacheConfiguration0.getCacheName();
        int i11 = cacheConfiguration0.getMaxElementsInMemory();
        boolean b12 = cacheConfiguration0.isEternal();
        org.junit.Assert.assertTrue(i9 == 1000);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(i11 == 1000);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy5 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy5);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry7 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry7);
        int i9 = cacheConfiguration0.getMaxElementsInMemory();
        java.lang.String str10 = cacheConfiguration0.getCacheName();
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy11 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy11);
        org.junit.Assert.assertTrue(i9 == 1000);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        cacheComponent2.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration5 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration5.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = null;
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry8);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory10 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint11 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration5, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory10);
        try {
            net.sf.ehcache.Ehcache ehcache12 = cacheEndpoint11.initializeCache();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.ServiceStatus serviceStatus15 = cacheEndpoint12.getStatus();
        java.lang.String str16 = cacheEndpoint12.getEndpointUri();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer21 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression22 = cacheBasedMessageBodyReplacer21.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer24 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression22, "");
        org.apache.camel.Expression expression25 = cacheBasedTokenReplacer24.getKey();
        cacheBasedTokenReplacer24.setKey("Consumer[]");
        cacheBasedTokenReplacer24.stop();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration29 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration29.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry32 = null;
        cacheConfiguration29.setCacheLoaderRegistry(cacheLoaderRegistry32);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy34 = null;
        cacheConfiguration29.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy34);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry36 = null;
        cacheConfiguration29.setCacheLoaderRegistry(cacheLoaderRegistry36);
        int i38 = cacheConfiguration29.getMaxElementsInMemory();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer39 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint12, (org.apache.camel.Processor) cacheBasedTokenReplacer24, cacheConfiguration29);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue("'" + serviceStatus15 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus15.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(cacheConfiguration17);
        org.junit.Assert.assertNotNull(expression22);
        org.junit.Assert.assertNotNull(expression25);
        org.junit.Assert.assertTrue(i38 == 1000);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.camel.component.cache.CacheLoaderWrapper[] cacheLoaderWrapper_array0 = new org.apache.camel.component.cache.CacheLoaderWrapper[] {};
        java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper> arraylist_cacheLoaderWrapper1 = new java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper1, cacheLoaderWrapper_array0);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = new org.apache.camel.component.cache.CacheLoaderRegistry((java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper1);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry4 = new org.apache.camel.component.cache.CacheLoaderRegistry((java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper1);
        int i5 = cacheLoaderRegistry4.size();
        org.junit.Assert.assertNotNull(cacheLoaderWrapper_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.camel.component.cache.CacheLoaderWrapper[] cacheLoaderWrapper_array0 = new org.apache.camel.component.cache.CacheLoaderWrapper[] {};
        java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper> arraylist_cacheLoaderWrapper1 = new java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper1, cacheLoaderWrapper_array0);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = new org.apache.camel.component.cache.CacheLoaderRegistry((java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper1);
        org.apache.camel.component.cache.CacheLoaderWrapper cacheLoaderWrapper4 = null;
        cacheLoaderRegistry3.addCacheLoader(cacheLoaderWrapper4);
        org.junit.Assert.assertNotNull(cacheLoaderWrapper_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        boolean b31 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer35 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression36 = cacheBasedMessageBodyReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer43 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression41, "");
        cacheBasedMessageBodyReplacer35.setKey(expression41);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer46 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression41, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration47 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer48 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint12, (org.apache.camel.Processor) cacheBasedXPathReplacer46, cacheConfiguration47);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener49 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer48);
        boolean b50 = cacheConsumer48.isRunAllowed();
        org.apache.camel.spi.ExceptionHandler exceptionHandler51 = null;
        cacheConsumer48.setExceptionHandler(exceptionHandler51);
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint53 = cacheConsumer48.getEndpoint();
        java.lang.String str54 = cacheConsumer48.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(expression36);
        org.junit.Assert.assertNotNull(expression41);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(cacheEndpoint53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "Consumer[]" + "'", str54.equals("Consumer[]"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str3 = cacheBasedMessageBodyReplacer2.getCacheName();
        cacheBasedMessageBodyReplacer2.stop();
        org.apache.camel.CamelContext camelContext6 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent7 = new org.apache.camel.component.cache.CacheComponent(camelContext6);
        cacheComponent7.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration10 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration10.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry13 = null;
        cacheConfiguration10.setCacheLoaderRegistry(cacheLoaderRegistry13);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory15 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent7, cacheConfiguration10, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory15);
        net.sf.ehcache.CacheManager cacheManager17 = defaultCacheManagerFactory15.getInstance();
        boolean b20 = cacheBasedMessageBodyReplacer2.isValid(cacheManager17, "endpoint74", "Consumer[]");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(cacheManager17);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        boolean b14 = cacheEndpoint12.isBridgeErrorHandler();
        int i15 = cacheEndpoint12.getPollingConsumerQueueSize();
        java.lang.String str16 = cacheEndpoint12.getKey();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1000);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        cacheBasedTokenReplacer21.setCacheName("endpoint131");
        java.lang.String str33 = cacheBasedTokenReplacer21.getReplacementToken();
        cacheBasedTokenReplacer21.stop();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer4 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression5 = cacheBasedMessageBodyReplacer4.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer7 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression5, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer11 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression12 = cacheBasedMessageBodyReplacer11.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer14 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression12, "");
        cacheBasedTokenReplacer7.setKey(expression12);
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer16 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", expression12);
        org.apache.camel.CamelContext camelContext18 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent19 = new org.apache.camel.component.cache.CacheComponent(camelContext18);
        cacheComponent19.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration22 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration22.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry25 = null;
        cacheConfiguration22.setCacheLoaderRegistry(cacheLoaderRegistry25);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory27 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint28 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent19, cacheConfiguration22, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory27);
        net.sf.ehcache.CacheManager cacheManager29 = defaultCacheManagerFactory27.getInstance();
        boolean b32 = cacheBasedMessageBodyReplacer16.isValid(cacheManager29, "endpoint131", "Producer[]");
        org.junit.Assert.assertNotNull(expression5);
        org.junit.Assert.assertNotNull(expression12);
        org.junit.Assert.assertNotNull(cacheManager29);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        cacheConfiguration0.setTimeToLiveSeconds((long) (short) -1);
        boolean b5 = cacheConfiguration0.isOverflowToDisk();
        cacheConfiguration0.setTimeToIdleSeconds(0L);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        cacheConfiguration0.setEternal(true);
        cacheConfiguration0.setOverflowToDisk(false);
        int i7 = cacheConfiguration0.getMaxElementsInMemory();
        org.junit.Assert.assertTrue(i7 == 1000);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str4 = cacheBasedMessageBodyReplacer3.getCacheName();
        cacheBasedMessageBodyReplacer3.setCacheName("");
        cacheBasedMessageBodyReplacer3.stop();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer11 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression12 = cacheBasedMessageBodyReplacer11.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer16 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression17 = cacheBasedMessageBodyReplacer16.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer19 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression17, "");
        cacheBasedMessageBodyReplacer11.setKey(expression17);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer22 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression17, "");
        java.lang.String str23 = cacheBasedXPathReplacer22.getXpath();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer26 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str27 = cacheBasedMessageBodyReplacer26.getCacheName();
        cacheBasedMessageBodyReplacer26.stop();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer32 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression33 = cacheBasedMessageBodyReplacer32.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer35 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression33, "");
        org.apache.camel.Expression expression36 = cacheBasedTokenReplacer35.getKey();
        cacheBasedMessageBodyReplacer26.setKey(expression36);
        cacheBasedXPathReplacer22.setKey(expression36);
        cacheBasedMessageBodyReplacer3.setKey(expression36);
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer41 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression36, "2.21.0-SNAPSHOT");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(expression12);
        org.junit.Assert.assertNotNull(expression17);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(expression33);
        org.junit.Assert.assertNotNull(expression36);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer2 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression3 = cacheBasedMessageBodyReplacer2.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer7 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression8 = cacheBasedMessageBodyReplacer7.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer10 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression8, "");
        cacheBasedMessageBodyReplacer2.setKey(expression8);
        cacheBasedMessageBodyReplacer2.start();
        org.junit.Assert.assertNotNull(expression3);
        org.junit.Assert.assertNotNull(expression8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        java.lang.Object obj4 = cacheEventListener1.clone();
        net.sf.ehcache.Ehcache ehcache5 = null;
        net.sf.ehcache.Element element6 = null;
        try {
            cacheEventListener1.notifyElementExpired(ehcache5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.ServiceStatus serviceStatus15 = cacheEndpoint12.getStatus();
        boolean b16 = cacheEndpoint12.isStarting();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = cacheEndpoint12.getConfig();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue("'" + serviceStatus15 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus15.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(cacheConfiguration17);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        cacheComponent2.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration5 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration5.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = null;
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry8);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory10 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint11 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration5, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory10);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj12 = cacheEndpoint11.getConsumerProperties();
        org.junit.Assert.assertNotNull(map_str_obj12);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        boolean b31 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer35 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression36 = cacheBasedMessageBodyReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer43 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression41, "");
        cacheBasedMessageBodyReplacer35.setKey(expression41);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer46 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression41, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration47 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer48 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint12, (org.apache.camel.Processor) cacheBasedXPathReplacer46, cacheConfiguration47);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener49 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer48);
        org.apache.camel.AsyncProcessor asyncProcessor50 = cacheConsumer48.getAsyncProcessor();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint51 = cacheConsumer48.getEndpoint();
        org.apache.camel.Route route52 = cacheConsumer48.getRoute();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener53 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer48);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(expression36);
        org.junit.Assert.assertNotNull(expression41);
        org.junit.Assert.assertNotNull(asyncProcessor50);
        org.junit.Assert.assertNotNull(cacheEndpoint51);
        org.junit.Assert.assertNull(route52);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        org.apache.camel.CamelContext camelContext5 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent6 = new org.apache.camel.component.cache.CacheComponent(camelContext5);
        boolean b7 = cacheComponent6.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory8 = cacheComponent6.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint9 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration10 = new org.apache.camel.component.cache.CacheConfiguration();
        long long11 = cacheConfiguration10.getTimeToIdleSeconds();
        cacheConfiguration10.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer14 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint9, cacheConfiguration10);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory15 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent6, cacheConfiguration10, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory15);
        org.apache.camel.Producer producer17 = cacheEndpoint16.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration18 = cacheEndpoint16.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer22 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression23 = cacheBasedMessageBodyReplacer22.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer25 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression23, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer29 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression30 = cacheBasedMessageBodyReplacer29.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer32 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression30, "");
        cacheBasedTokenReplacer25.setKey(expression30);
        org.apache.camel.Consumer consumer34 = cacheEndpoint16.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer25);
        boolean b35 = cacheEndpoint16.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer39 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression40 = cacheBasedMessageBodyReplacer39.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer44 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression45 = cacheBasedMessageBodyReplacer44.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer47 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression45, "");
        cacheBasedMessageBodyReplacer39.setKey(expression45);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer50 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression45, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration51 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer52 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint16, (org.apache.camel.Processor) cacheBasedXPathReplacer50, cacheConfiguration51);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener53 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer52);
        org.apache.camel.AsyncProcessor asyncProcessor54 = cacheConsumer52.getAsyncProcessor();
        cacheEventListener1.setCacheConsumer(cacheConsumer52);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener56 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer52);
        cacheEventListener56.dispose();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(cacheManagerFactory8);
        org.junit.Assert.assertTrue(long11 == 300L);
        org.junit.Assert.assertNotNull(producer17);
        org.junit.Assert.assertNotNull(cacheConfiguration18);
        org.junit.Assert.assertNotNull(expression23);
        org.junit.Assert.assertNotNull(expression30);
        org.junit.Assert.assertNotNull(consumer34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(expression40);
        org.junit.Assert.assertNotNull(expression45);
        org.junit.Assert.assertNotNull(asyncProcessor54);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        boolean b31 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer35 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression36 = cacheBasedMessageBodyReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer43 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression41, "");
        cacheBasedMessageBodyReplacer35.setKey(expression41);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer46 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression41, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration47 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer48 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint12, (org.apache.camel.Processor) cacheBasedXPathReplacer46, cacheConfiguration47);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener49 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer48);
        net.sf.ehcache.Ehcache ehcache50 = null;
        net.sf.ehcache.Element element51 = null;
        try {
            cacheEventListener49.notifyElementUpdated(ehcache50, element51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(expression36);
        org.junit.Assert.assertNotNull(expression41);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory2 = cacheComponent1.getCacheManagerFactory();
        java.util.Collection<java.lang.Class<? extends org.apache.camel.component.extension.ComponentExtension>> collection_cls3 = cacheComponent1.getSupportedExtensions();
        try {
            cacheComponent1.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(cacheManagerFactory2);
        org.junit.Assert.assertNotNull(collection_cls3);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        boolean b14 = cacheEndpoint12.isSuspended();
        org.apache.camel.Component component15 = cacheEndpoint12.getComponent();
        org.apache.camel.CamelContext camelContext17 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent18 = new org.apache.camel.component.cache.CacheComponent(camelContext17);
        boolean b19 = cacheComponent18.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory20 = cacheComponent18.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint21 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration22 = new org.apache.camel.component.cache.CacheConfiguration();
        long long23 = cacheConfiguration22.getTimeToIdleSeconds();
        cacheConfiguration22.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer26 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint21, cacheConfiguration22);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory27 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint28 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent18, cacheConfiguration22, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory27);
        org.apache.camel.Producer producer29 = cacheEndpoint28.createProducer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj30 = null;
        cacheEndpoint28.setConsumerProperties(map_str_obj30);
        org.apache.camel.ExchangePattern exchangePattern32 = cacheEndpoint28.getExchangePattern();
        org.apache.camel.Exchange exchange33 = cacheEndpoint12.createExchange(exchangePattern32);
        org.apache.camel.Producer producer34 = cacheEndpoint12.createProducer();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(component15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(cacheManagerFactory20);
        org.junit.Assert.assertTrue(long23 == 300L);
        org.junit.Assert.assertNotNull(producer29);
        org.junit.Assert.assertTrue("'" + exchangePattern32 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern32.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange33);
        org.junit.Assert.assertNotNull(producer34);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer6 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression4, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer10 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression11 = cacheBasedMessageBodyReplacer10.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer13 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression11, "");
        cacheBasedTokenReplacer6.setKey(expression11);
        cacheBasedTokenReplacer6.setCacheName("2.21.0-SNAPSHOT");
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertNotNull(expression11);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.ServiceStatus serviceStatus15 = cacheEndpoint12.getStatus();
        java.lang.String str16 = cacheEndpoint12.getEndpointUri();
        boolean b17 = cacheEndpoint12.isRunAllowed();
        org.apache.camel.CamelContext camelContext19 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent20 = new org.apache.camel.component.cache.CacheComponent(camelContext19);
        boolean b21 = cacheComponent20.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory22 = cacheComponent20.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint23 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration24 = new org.apache.camel.component.cache.CacheConfiguration();
        long long25 = cacheConfiguration24.getTimeToIdleSeconds();
        cacheConfiguration24.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer28 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint23, cacheConfiguration24);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory29 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint30 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent20, cacheConfiguration24, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory29);
        org.apache.camel.CamelContext camelContext31 = cacheEndpoint30.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer32 = cacheEndpoint30.createPollingConsumer();
        org.apache.camel.ServiceStatus serviceStatus33 = cacheEndpoint30.getStatus();
        org.apache.camel.CamelContext camelContext35 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent36 = new org.apache.camel.component.cache.CacheComponent(camelContext35);
        boolean b37 = cacheComponent36.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory38 = cacheComponent36.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint39 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration40 = new org.apache.camel.component.cache.CacheConfiguration();
        long long41 = cacheConfiguration40.getTimeToIdleSeconds();
        cacheConfiguration40.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer44 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint39, cacheConfiguration40);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory45 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint46 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent36, cacheConfiguration40, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory45);
        org.apache.camel.CamelContext camelContext47 = cacheEndpoint46.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer48 = cacheEndpoint46.createPollingConsumer();
        boolean b49 = cacheEndpoint46.isBridgeErrorHandler();
        org.apache.camel.CamelContext camelContext50 = cacheEndpoint46.getCamelContext();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj51 = cacheEndpoint46.getConsumerProperties();
        cacheEndpoint30.configureProperties(map_str_obj51);
        cacheEndpoint12.setConsumerProperties(map_str_obj51);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue("'" + serviceStatus15 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus15.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(cacheManagerFactory22);
        org.junit.Assert.assertTrue(long25 == 300L);
        org.junit.Assert.assertNull(camelContext31);
        org.junit.Assert.assertNotNull(pollingConsumer32);
        org.junit.Assert.assertTrue("'" + serviceStatus33 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus33.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(cacheManagerFactory38);
        org.junit.Assert.assertTrue(long41 == 300L);
        org.junit.Assert.assertNull(camelContext47);
        org.junit.Assert.assertNotNull(pollingConsumer48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(camelContext50);
        org.junit.Assert.assertNotNull(map_str_obj51);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        cacheComponent2.setConfigurationFile("");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration5 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration5.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = null;
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry8);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy10 = null;
        cacheConfiguration5.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy10);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry12 = null;
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry12);
        int i14 = cacheConfiguration5.getMaxElementsInMemory();
        long long15 = cacheConfiguration5.getTimeToLiveSeconds();
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry16 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        cacheConfiguration5.setEventListenerRegistry(cacheEventListenerRegistry16);
        long long18 = cacheConfiguration5.getDiskExpiryThreadIntervalSeconds();
        org.apache.camel.component.cache.CacheLoaderWrapper[] cacheLoaderWrapper_array19 = new org.apache.camel.component.cache.CacheLoaderWrapper[] {};
        java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper> arraylist_cacheLoaderWrapper20 = new java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper20, cacheLoaderWrapper_array19);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry22 = new org.apache.camel.component.cache.CacheLoaderRegistry((java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper20);
        int i23 = cacheLoaderRegistry22.size();
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry22);
        org.apache.camel.CamelContext camelContext25 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent26 = new org.apache.camel.component.cache.CacheComponent(camelContext25);
        org.apache.camel.ComponentConfiguration componentConfiguration27 = cacheComponent26.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus28 = cacheComponent26.getStatus();
        boolean b29 = cacheComponent26.isStarted();
        boolean b30 = cacheComponent26.useRawUri();
        org.apache.camel.CamelContext camelContext31 = cacheComponent26.getCamelContext();
        org.apache.camel.CamelContext camelContext33 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent34 = new org.apache.camel.component.cache.CacheComponent(camelContext33);
        cacheComponent34.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration37 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration37.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry40 = null;
        cacheConfiguration37.setCacheLoaderRegistry(cacheLoaderRegistry40);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory42 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint43 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent34, cacheConfiguration37, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory42);
        cacheComponent26.setCacheManagerFactory((org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory42);
        defaultCacheManagerFactory42.suspend();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint46 = new org.apache.camel.component.cache.CacheEndpoint("endpoint74", (org.apache.camel.Component) cacheComponent2, cacheConfiguration5, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory42);
        org.junit.Assert.assertTrue(i14 == 1000);
        org.junit.Assert.assertTrue(long15 == 300L);
        org.junit.Assert.assertTrue(long18 == 0L);
        org.junit.Assert.assertNotNull(cacheLoaderWrapper_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(componentConfiguration27);
        org.junit.Assert.assertTrue("'" + serviceStatus28 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus28.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(camelContext31);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.ServiceStatus serviceStatus15 = cacheEndpoint12.getStatus();
        java.lang.String str16 = cacheEndpoint12.getEndpointUri();
        boolean b17 = cacheEndpoint12.isRunAllowed();
        cacheEndpoint12.setPollingConsumerQueueSize((int) (byte) 100);
        java.lang.String str20 = cacheEndpoint12.getEndpointKey();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue("'" + serviceStatus15 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus15.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        boolean b15 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration17 = new org.apache.camel.component.cache.CacheConfiguration();
        long long18 = cacheConfiguration17.getTimeToIdleSeconds();
        cacheConfiguration17.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer21 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint16, cacheConfiguration17);
        org.apache.camel.component.cache.CacheProducer cacheProducer22 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration17);
        int i23 = cacheEndpoint12.getPollingConsumerQueueSize();
        int i24 = cacheEndpoint12.getPollingConsumerQueueSize();
        cacheEndpoint12.setEndpointUriIfNotSpecified("endpoint131");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(long18 == 300L);
        org.junit.Assert.assertTrue(i23 == 1000);
        org.junit.Assert.assertTrue(i24 == 1000);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer5 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression6 = cacheBasedMessageBodyReplacer5.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer10 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression11 = cacheBasedMessageBodyReplacer10.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer13 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression11, "");
        cacheBasedMessageBodyReplacer5.setKey(expression11);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer16 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression11, "");
        java.lang.String str17 = cacheBasedXPathReplacer16.getXpath();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer20 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str21 = cacheBasedMessageBodyReplacer20.getCacheName();
        cacheBasedMessageBodyReplacer20.stop();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer26 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression27 = cacheBasedMessageBodyReplacer26.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer29 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression27, "");
        org.apache.camel.Expression expression30 = cacheBasedTokenReplacer29.getKey();
        cacheBasedMessageBodyReplacer20.setKey(expression30);
        cacheBasedXPathReplacer16.setKey(expression30);
        org.apache.camel.Expression expression33 = cacheBasedXPathReplacer16.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer34 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", expression33);
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer39 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression40 = cacheBasedMessageBodyReplacer39.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer42 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression40, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer46 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression47 = cacheBasedMessageBodyReplacer46.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer49 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression47, "");
        cacheBasedTokenReplacer42.setKey(expression47);
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer51 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", expression47);
        cacheBasedMessageBodyReplacer34.setKey(expression47);
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer54 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("endpoint131", expression47, "");
        org.apache.camel.Expression expression55 = cacheBasedTokenReplacer54.getKey();
        org.junit.Assert.assertNotNull(expression6);
        org.junit.Assert.assertNotNull(expression11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(expression27);
        org.junit.Assert.assertNotNull(expression30);
        org.junit.Assert.assertNotNull(expression33);
        org.junit.Assert.assertNotNull(expression40);
        org.junit.Assert.assertNotNull(expression47);
        org.junit.Assert.assertNotNull(expression55);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy1 = org.apache.camel.component.cache.CacheConverter.toPolicy("Producer[]");
        org.junit.Assert.assertNotNull(memoryStoreEvictionPolicy1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        long long1 = cacheConfiguration0.getTimeToIdleSeconds();
        java.lang.String str2 = cacheConfiguration0.getCacheName();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration3 = cacheConfiguration0.copy();
        boolean b4 = cacheConfiguration3.isDiskPersistent();
        org.junit.Assert.assertTrue(long1 == 300L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(cacheConfiguration3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        boolean b14 = cacheEndpoint12.isBridgeErrorHandler();
        java.lang.String str15 = cacheEndpoint12.getEndpointKey();
        java.lang.String str16 = cacheEndpoint12.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        boolean b14 = cacheEndpoint12.isBridgeErrorHandler();
        int i15 = cacheEndpoint12.getPollingConsumerQueueSize();
        cacheEndpoint12.shutdown();
        boolean b17 = cacheEndpoint12.isSuspending();
        cacheEndpoint12.setOperation("");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 1000);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        cacheComponent2.setResolvePropertyPlaceholders(false);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration5 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration5.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = null;
        cacheConfiguration5.setCacheLoaderRegistry(cacheLoaderRegistry8);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory10 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint11 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration5, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory10);
        org.apache.camel.component.cache.FileCacheManagerFactory fileCacheManagerFactory13 = new org.apache.camel.component.cache.FileCacheManagerFactory("");
        fileCacheManagerFactory13.setFileName("");
        cacheEndpoint11.setCacheManagerFactory((org.apache.camel.component.cache.CacheManagerFactory) fileCacheManagerFactory13);
        try {
            net.sf.ehcache.CacheManager cacheManager17 = fileCacheManagerFactory13.getInstance();
            org.junit.Assert.fail("Expected exception of type org.apache.camel.RuntimeCamelException");
        } catch (org.apache.camel.RuntimeCamelException e) {
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        boolean b2 = cacheComponent1.isRunAllowed();
        cacheComponent1.suspend();
        java.lang.Class<? extends org.apache.camel.Endpoint> cls4 = cacheComponent1.getEndpointClass();
        boolean b5 = cacheComponent1.isRunAllowed();
        java.util.Collection<java.lang.Class<? extends org.apache.camel.component.extension.ComponentExtension>> collection_cls6 = cacheComponent1.getSupportedExtensions();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(cls4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(collection_cls6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        org.apache.camel.ComponentConfiguration componentConfiguration2 = cacheComponent1.createComponentConfiguration();
        org.apache.camel.ServiceStatus serviceStatus3 = cacheComponent1.getStatus();
        boolean b4 = cacheComponent1.isStarted();
        boolean b5 = cacheComponent1.useRawUri();
        org.apache.camel.CamelContext camelContext6 = cacheComponent1.getCamelContext();
        org.apache.camel.ServiceStatus serviceStatus7 = cacheComponent1.getStatus();
        org.apache.camel.CamelContext camelContext8 = cacheComponent1.getCamelContext();
        org.junit.Assert.assertNotNull(componentConfiguration2);
        org.junit.Assert.assertTrue("'" + serviceStatus3 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus3.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(camelContext6);
        org.junit.Assert.assertTrue("'" + serviceStatus7 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus7.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertNull(camelContext8);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        long long1 = cacheConfiguration0.getDiskExpiryThreadIntervalSeconds();
        java.lang.String str2 = cacheConfiguration0.getDiskStorePath();
        org.junit.Assert.assertTrue(long1 == 0L);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy5 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy5);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry7 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry7);
        int i9 = cacheConfiguration0.getMaxElementsInMemory();
        java.lang.String str10 = cacheConfiguration0.getCacheName();
        long long11 = cacheConfiguration0.getTimeToIdleSeconds();
        org.junit.Assert.assertTrue(i9 == 1000);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(long11 == 300L);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.camel.component.cache.CacheLoaderWrapper[] cacheLoaderWrapper_array0 = new org.apache.camel.component.cache.CacheLoaderWrapper[] {};
        java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper> arraylist_cacheLoaderWrapper1 = new java.util.ArrayList<org.apache.camel.component.cache.CacheLoaderWrapper>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper1, cacheLoaderWrapper_array0);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = new org.apache.camel.component.cache.CacheLoaderRegistry((java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper1);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry4 = new org.apache.camel.component.cache.CacheLoaderRegistry((java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper>) arraylist_cacheLoaderWrapper1);
        java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper> list_cacheLoaderWrapper5 = cacheLoaderRegistry4.getCacheLoaders();
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry6 = new org.apache.camel.component.cache.CacheLoaderRegistry(list_cacheLoaderWrapper5);
        java.util.List<org.apache.camel.component.cache.CacheLoaderWrapper> list_cacheLoaderWrapper7 = cacheLoaderRegistry6.getCacheLoaders();
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry8 = new org.apache.camel.component.cache.CacheLoaderRegistry(list_cacheLoaderWrapper7);
        org.junit.Assert.assertNotNull(cacheLoaderWrapper_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(list_cacheLoaderWrapper5);
        org.junit.Assert.assertNotNull(list_cacheLoaderWrapper7);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.camel.component.cache.FileCacheManagerFactory fileCacheManagerFactory1 = new org.apache.camel.component.cache.FileCacheManagerFactory("");
        fileCacheManagerFactory1.setFileName("");
        try {
            net.sf.ehcache.CacheManager cacheManager4 = fileCacheManagerFactory1.getInstance();
            org.junit.Assert.fail("Expected exception of type org.apache.camel.RuntimeCamelException");
        } catch (org.apache.camel.RuntimeCamelException e) {
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        boolean b31 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer35 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression36 = cacheBasedMessageBodyReplacer35.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer40 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression41 = cacheBasedMessageBodyReplacer40.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer43 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression41, "");
        cacheBasedMessageBodyReplacer35.setKey(expression41);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer46 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression41, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration47 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer48 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint12, (org.apache.camel.Processor) cacheBasedXPathReplacer46, cacheConfiguration47);
        cacheBasedXPathReplacer46.setXpath("");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(expression36);
        org.junit.Assert.assertNotNull(expression41);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer8 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression9 = cacheBasedMessageBodyReplacer8.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer11 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression9, "");
        cacheBasedMessageBodyReplacer3.setKey(expression9);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer14 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression9, "");
        java.lang.String str15 = cacheBasedXPathReplacer14.getXpath();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        java.lang.String str19 = cacheBasedMessageBodyReplacer18.getCacheName();
        cacheBasedMessageBodyReplacer18.stop();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer24 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression25 = cacheBasedMessageBodyReplacer24.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer27 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression25, "");
        org.apache.camel.Expression expression28 = cacheBasedTokenReplacer27.getKey();
        cacheBasedMessageBodyReplacer18.setKey(expression28);
        cacheBasedXPathReplacer14.setKey(expression28);
        java.lang.String str31 = cacheBasedXPathReplacer14.getCacheName();
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertNotNull(expression9);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(expression25);
        org.junit.Assert.assertNotNull(expression28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        boolean b14 = cacheEndpoint12.isBridgeErrorHandler();
        org.apache.camel.EndpointConfiguration endpointConfiguration15 = null;
        cacheEndpoint12.setEndpointConfiguration(endpointConfiguration15);
        cacheEndpoint12.stop();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent1 = new org.apache.camel.component.cache.CacheComponent(camelContext0);
        cacheComponent1.setResolvePropertyPlaceholders(false);
        cacheComponent1.suspend();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory5 = cacheComponent1.getCacheManagerFactory();
        org.apache.camel.ComponentConfiguration componentConfiguration6 = cacheComponent1.createComponentConfiguration();
        cacheComponent1.setConfigurationFile("Producer[]");
        cacheComponent1.setResolvePropertyPlaceholders(false);
        org.junit.Assert.assertNull(cacheManagerFactory5);
        org.junit.Assert.assertNotNull(componentConfiguration6);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setDiskStorePath("hi!");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry3 = cacheConfiguration0.getEventListenerRegistry();
        cacheConfiguration0.setEternal(true);
        org.junit.Assert.assertNotNull(cacheEventListenerRegistry3);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        org.apache.camel.CamelContext camelContext5 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent6 = new org.apache.camel.component.cache.CacheComponent(camelContext5);
        boolean b7 = cacheComponent6.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory8 = cacheComponent6.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint9 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration10 = new org.apache.camel.component.cache.CacheConfiguration();
        long long11 = cacheConfiguration10.getTimeToIdleSeconds();
        cacheConfiguration10.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer14 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint9, cacheConfiguration10);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory15 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint16 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent6, cacheConfiguration10, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory15);
        org.apache.camel.Producer producer17 = cacheEndpoint16.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration18 = cacheEndpoint16.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer22 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression23 = cacheBasedMessageBodyReplacer22.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer25 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression23, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer29 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression30 = cacheBasedMessageBodyReplacer29.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer32 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression30, "");
        cacheBasedTokenReplacer25.setKey(expression30);
        org.apache.camel.Consumer consumer34 = cacheEndpoint16.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer25);
        boolean b35 = cacheEndpoint16.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer39 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression40 = cacheBasedMessageBodyReplacer39.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer44 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression45 = cacheBasedMessageBodyReplacer44.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer47 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression45, "");
        cacheBasedMessageBodyReplacer39.setKey(expression45);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer50 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression45, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration51 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer52 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint16, (org.apache.camel.Processor) cacheBasedXPathReplacer50, cacheConfiguration51);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener53 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer52);
        org.apache.camel.AsyncProcessor asyncProcessor54 = cacheConsumer52.getAsyncProcessor();
        cacheEventListener1.setCacheConsumer(cacheConsumer52);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener56 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer52);
        org.apache.camel.Route route57 = null;
        cacheConsumer52.setRoute(route57);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(cacheManagerFactory8);
        org.junit.Assert.assertTrue(long11 == 300L);
        org.junit.Assert.assertNotNull(producer17);
        org.junit.Assert.assertNotNull(cacheConfiguration18);
        org.junit.Assert.assertNotNull(expression23);
        org.junit.Assert.assertNotNull(expression30);
        org.junit.Assert.assertNotNull(consumer34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(expression40);
        org.junit.Assert.assertNotNull(expression45);
        org.junit.Assert.assertNotNull(asyncProcessor54);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer3 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("Consumer[]", "hi!", "hi!");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        long long1 = cacheConfiguration0.getTimeToIdleSeconds();
        long long2 = cacheConfiguration0.getTimeToIdleSeconds();
        cacheConfiguration0.setMaxElementsInMemory(1);
        int i5 = cacheConfiguration0.getMaxElementsInMemory();
        cacheConfiguration0.setOverflowToDisk(false);
        boolean b8 = cacheConfiguration0.isEternal();
        cacheConfiguration0.setDiskPersistent(false);
        cacheConfiguration0.setDiskStorePath("endpoint131");
        org.junit.Assert.assertTrue(long1 == 300L);
        org.junit.Assert.assertTrue(long2 == 300L);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer3 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedMessageBodyReplacer3.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer8 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression9 = cacheBasedMessageBodyReplacer8.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer11 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression9, "");
        cacheBasedMessageBodyReplacer3.setKey(expression9);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer14 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression9, "");
        cacheBasedXPathReplacer14.setCacheName("endpoint74");
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertNotNull(expression9);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        cacheConfiguration0.setEternal(false);
        cacheConfiguration0.setCacheName("Producer[]");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry0 = new org.apache.camel.component.cache.CacheEventListenerRegistry();
        org.apache.camel.component.cache.CacheEventListener cacheEventListener1 = new org.apache.camel.component.cache.CacheEventListener();
        cacheEventListenerRegistry0.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener1);
        java.lang.Object obj3 = cacheEventListener1.clone();
        java.lang.Object obj4 = cacheEventListener1.clone();
        java.lang.Object obj5 = cacheEventListener1.clone();
        net.sf.ehcache.Ehcache ehcache6 = null;
        net.sf.ehcache.Element element7 = null;
        try {
            cacheEventListener1.notifyElementRemoved(ehcache6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration13 = new org.apache.camel.component.cache.CacheConfiguration();
        long long14 = cacheConfiguration13.getTimeToIdleSeconds();
        long long15 = cacheConfiguration13.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer16 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint12, cacheConfiguration13);
        cacheEndpoint12.stop();
        cacheEndpoint12.setPollingConsumerQueueSize((int) '#');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long14 == 300L);
        org.junit.Assert.assertTrue(long15 == 300L);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer3 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("endpoint74", "2.21.0-SNAPSHOT", "endpoint74");
        cacheBasedXPathReplacer3.setCacheName("Producer[]");
        cacheBasedXPathReplacer3.start();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.CamelContext camelContext13 = cacheEndpoint12.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer14 = cacheEndpoint12.createPollingConsumer();
        org.apache.camel.ExchangePattern exchangePattern15 = null;
        cacheEndpoint12.setExchangePattern(exchangePattern15);
        try {
            net.sf.ehcache.Ehcache ehcache17 = cacheEndpoint12.initializeCache();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNull(camelContext13);
        org.junit.Assert.assertNotNull(pollingConsumer14);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        long long13 = cacheEndpoint12.getPollingConsumerBlockTimeout();
        org.apache.camel.Processor processor14 = null;
        org.apache.camel.Consumer consumer15 = cacheEndpoint12.createConsumer(processor14);
        org.apache.camel.CamelContext camelContext17 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent18 = new org.apache.camel.component.cache.CacheComponent(camelContext17);
        boolean b19 = cacheComponent18.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory20 = cacheComponent18.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint21 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration22 = new org.apache.camel.component.cache.CacheConfiguration();
        long long23 = cacheConfiguration22.getTimeToIdleSeconds();
        cacheConfiguration22.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer26 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint21, cacheConfiguration22);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory27 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint28 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent18, cacheConfiguration22, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory27);
        org.apache.camel.Producer producer29 = cacheEndpoint28.createProducer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj30 = null;
        cacheEndpoint28.setConsumerProperties(map_str_obj30);
        org.apache.camel.ExchangePattern exchangePattern32 = cacheEndpoint28.getExchangePattern();
        org.apache.camel.CamelContext camelContext34 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent35 = new org.apache.camel.component.cache.CacheComponent(camelContext34);
        boolean b36 = cacheComponent35.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory37 = cacheComponent35.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint38 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration39 = new org.apache.camel.component.cache.CacheConfiguration();
        long long40 = cacheConfiguration39.getTimeToIdleSeconds();
        cacheConfiguration39.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer43 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint38, cacheConfiguration39);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory44 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint45 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent35, cacheConfiguration39, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory44);
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration46 = new org.apache.camel.component.cache.CacheConfiguration();
        long long47 = cacheConfiguration46.getTimeToIdleSeconds();
        long long48 = cacheConfiguration46.getTimeToIdleSeconds();
        org.apache.camel.component.cache.CacheProducer cacheProducer49 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint45, cacheConfiguration46);
        boolean b50 = cacheProducer49.isSingleton();
        org.apache.camel.CamelContext camelContext52 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent53 = new org.apache.camel.component.cache.CacheComponent(camelContext52);
        boolean b54 = cacheComponent53.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory55 = cacheComponent53.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint56 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration57 = new org.apache.camel.component.cache.CacheConfiguration();
        long long58 = cacheConfiguration57.getTimeToIdleSeconds();
        cacheConfiguration57.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer61 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint56, cacheConfiguration57);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory62 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint63 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent53, cacheConfiguration57, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory62);
        long long64 = cacheEndpoint63.getPollingConsumerBlockTimeout();
        boolean b65 = cacheEndpoint63.isSuspended();
        org.apache.camel.Component component66 = cacheEndpoint63.getComponent();
        org.apache.camel.CamelContext camelContext68 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent69 = new org.apache.camel.component.cache.CacheComponent(camelContext68);
        boolean b70 = cacheComponent69.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory71 = cacheComponent69.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint72 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration73 = new org.apache.camel.component.cache.CacheConfiguration();
        long long74 = cacheConfiguration73.getTimeToIdleSeconds();
        cacheConfiguration73.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer77 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint72, cacheConfiguration73);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory78 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint79 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent69, cacheConfiguration73, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory78);
        org.apache.camel.Producer producer80 = cacheEndpoint79.createProducer();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj81 = null;
        cacheEndpoint79.setConsumerProperties(map_str_obj81);
        org.apache.camel.ExchangePattern exchangePattern83 = cacheEndpoint79.getExchangePattern();
        org.apache.camel.Exchange exchange84 = cacheEndpoint63.createExchange(exchangePattern83);
        org.apache.camel.Exchange exchange85 = cacheProducer49.createExchange(exchangePattern83);
        cacheEndpoint28.setExchangePattern(exchangePattern83);
        org.apache.camel.Exchange exchange87 = cacheEndpoint12.createExchange(exchangePattern83);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertTrue(long13 == 0L);
        org.junit.Assert.assertNotNull(consumer15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(cacheManagerFactory20);
        org.junit.Assert.assertTrue(long23 == 300L);
        org.junit.Assert.assertNotNull(producer29);
        org.junit.Assert.assertTrue("'" + exchangePattern32 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern32.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(cacheManagerFactory37);
        org.junit.Assert.assertTrue(long40 == 300L);
        org.junit.Assert.assertTrue(long47 == 300L);
        org.junit.Assert.assertTrue(long48 == 300L);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(cacheManagerFactory55);
        org.junit.Assert.assertTrue(long58 == 300L);
        org.junit.Assert.assertTrue(long64 == 0L);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(component66);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(cacheManagerFactory71);
        org.junit.Assert.assertTrue(long74 == 300L);
        org.junit.Assert.assertNotNull(producer80);
        org.junit.Assert.assertTrue("'" + exchangePattern83 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern83.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange84);
        org.junit.Assert.assertNotNull(exchange85);
        org.junit.Assert.assertNotNull(exchange87);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.util.List<net.sf.ehcache.event.CacheEventListener> list_cacheEventListener0 = null;
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry1 = new org.apache.camel.component.cache.CacheEventListenerRegistry(list_cacheEventListener0);
        org.apache.camel.CamelContext camelContext3 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent4 = new org.apache.camel.component.cache.CacheComponent(camelContext3);
        boolean b5 = cacheComponent4.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory6 = cacheComponent4.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint7 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration8 = new org.apache.camel.component.cache.CacheConfiguration();
        long long9 = cacheConfiguration8.getTimeToIdleSeconds();
        cacheConfiguration8.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer12 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint7, cacheConfiguration8);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory13 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint14 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent4, cacheConfiguration8, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory13);
        org.apache.camel.Producer producer15 = cacheEndpoint14.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration16 = cacheEndpoint14.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer20 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression21 = cacheBasedMessageBodyReplacer20.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer23 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression21, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer27 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression28 = cacheBasedMessageBodyReplacer27.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer30 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression28, "");
        cacheBasedTokenReplacer23.setKey(expression28);
        org.apache.camel.Consumer consumer32 = cacheEndpoint14.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer23);
        boolean b33 = cacheEndpoint14.isBridgeErrorHandler();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer37 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression38 = cacheBasedMessageBodyReplacer37.getKey();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer42 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression43 = cacheBasedMessageBodyReplacer42.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer45 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression43, "");
        cacheBasedMessageBodyReplacer37.setKey(expression43);
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer48 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("", expression43, "");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration49 = new org.apache.camel.component.cache.CacheConfiguration();
        org.apache.camel.component.cache.CacheConsumer cacheConsumer50 = new org.apache.camel.component.cache.CacheConsumer((org.apache.camel.Endpoint) cacheEndpoint14, (org.apache.camel.Processor) cacheBasedXPathReplacer48, cacheConfiguration49);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener51 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer50);
        org.apache.camel.component.cache.CacheEventListener cacheEventListener52 = new org.apache.camel.component.cache.CacheEventListener(cacheConsumer50);
        cacheEventListenerRegistry1.addCacheEventListener((net.sf.ehcache.event.CacheEventListener) cacheEventListener52);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(cacheManagerFactory6);
        org.junit.Assert.assertTrue(long9 == 300L);
        org.junit.Assert.assertNotNull(producer15);
        org.junit.Assert.assertNotNull(cacheConfiguration16);
        org.junit.Assert.assertNotNull(expression21);
        org.junit.Assert.assertNotNull(expression28);
        org.junit.Assert.assertNotNull(consumer32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(expression38);
        org.junit.Assert.assertNotNull(expression43);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.camel.processor.cache.CacheBasedXPathReplacer cacheBasedXPathReplacer3 = new org.apache.camel.processor.cache.CacheBasedXPathReplacer("endpoint74", "hi!", "");
        org.apache.camel.Expression expression4 = cacheBasedXPathReplacer3.getKey();
        java.lang.String str5 = cacheBasedXPathReplacer3.getCacheName();
        org.junit.Assert.assertNotNull(expression4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "endpoint74" + "'", str5.equals("endpoint74"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        cacheConfiguration0.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry3 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry3);
        net.sf.ehcache.store.MemoryStoreEvictionPolicy memoryStoreEvictionPolicy5 = null;
        cacheConfiguration0.setMemoryStoreEvictionPolicy(memoryStoreEvictionPolicy5);
        org.apache.camel.component.cache.CacheLoaderRegistry cacheLoaderRegistry7 = null;
        cacheConfiguration0.setCacheLoaderRegistry(cacheLoaderRegistry7);
        cacheConfiguration0.setOverflowToDisk(false);
        java.lang.String str11 = cacheConfiguration0.getDiskStorePath();
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.camel.CamelContext camelContext1 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent2 = new org.apache.camel.component.cache.CacheComponent(camelContext1);
        boolean b3 = cacheComponent2.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory4 = cacheComponent2.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint5 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration6 = new org.apache.camel.component.cache.CacheConfiguration();
        long long7 = cacheConfiguration6.getTimeToIdleSeconds();
        cacheConfiguration6.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer10 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint5, cacheConfiguration6);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory11 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint12 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent2, cacheConfiguration6, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory11);
        org.apache.camel.Producer producer13 = cacheEndpoint12.createProducer();
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration14 = cacheEndpoint12.getConfig();
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer18 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression19 = cacheBasedMessageBodyReplacer18.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer21 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression19, "");
        org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer cacheBasedMessageBodyReplacer25 = new org.apache.camel.processor.cache.CacheBasedMessageBodyReplacer("hi!", "");
        org.apache.camel.Expression expression26 = cacheBasedMessageBodyReplacer25.getKey();
        org.apache.camel.processor.cache.CacheBasedTokenReplacer cacheBasedTokenReplacer28 = new org.apache.camel.processor.cache.CacheBasedTokenReplacer("", expression26, "");
        cacheBasedTokenReplacer21.setKey(expression26);
        org.apache.camel.Consumer consumer30 = cacheEndpoint12.createConsumer((org.apache.camel.Processor) cacheBasedTokenReplacer21);
        org.apache.camel.CamelContext camelContext32 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent33 = new org.apache.camel.component.cache.CacheComponent(camelContext32);
        boolean b34 = cacheComponent33.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory35 = cacheComponent33.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint36 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration37 = new org.apache.camel.component.cache.CacheConfiguration();
        long long38 = cacheConfiguration37.getTimeToIdleSeconds();
        cacheConfiguration37.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer41 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint36, cacheConfiguration37);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory42 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint43 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent33, cacheConfiguration37, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory42);
        long long44 = cacheEndpoint43.getPollingConsumerBlockTimeout();
        org.apache.camel.Processor processor45 = null;
        org.apache.camel.Consumer consumer46 = cacheEndpoint43.createConsumer(processor45);
        org.apache.camel.PollingConsumer pollingConsumer47 = cacheEndpoint43.createPollingConsumer();
        cacheEndpoint43.stop();
        org.apache.camel.CamelContext camelContext50 = null;
        org.apache.camel.component.cache.CacheComponent cacheComponent51 = new org.apache.camel.component.cache.CacheComponent(camelContext50);
        boolean b52 = cacheComponent51.useRawUri();
        org.apache.camel.component.cache.CacheManagerFactory cacheManagerFactory53 = cacheComponent51.getCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint54 = null;
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration55 = new org.apache.camel.component.cache.CacheConfiguration();
        long long56 = cacheConfiguration55.getTimeToIdleSeconds();
        cacheConfiguration55.setOverflowToDisk(true);
        org.apache.camel.component.cache.CacheProducer cacheProducer59 = new org.apache.camel.component.cache.CacheProducer(cacheEndpoint54, cacheConfiguration55);
        org.apache.camel.component.cache.DefaultCacheManagerFactory defaultCacheManagerFactory60 = new org.apache.camel.component.cache.DefaultCacheManagerFactory();
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint61 = new org.apache.camel.component.cache.CacheEndpoint("", (org.apache.camel.Component) cacheComponent51, cacheConfiguration55, (org.apache.camel.component.cache.CacheManagerFactory) defaultCacheManagerFactory60);
        org.apache.camel.CamelContext camelContext62 = cacheEndpoint61.getCamelContext();
        org.apache.camel.PollingConsumer pollingConsumer63 = cacheEndpoint61.createPollingConsumer();
        boolean b64 = cacheEndpoint61.isBridgeErrorHandler();
        org.apache.camel.CamelContext camelContext65 = cacheEndpoint61.getCamelContext();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj66 = cacheEndpoint61.getConsumerProperties();
        cacheEndpoint43.configureProperties(map_str_obj66);
        cacheEndpoint12.setConsumerProperties(map_str_obj66);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(cacheManagerFactory4);
        org.junit.Assert.assertTrue(long7 == 300L);
        org.junit.Assert.assertNotNull(producer13);
        org.junit.Assert.assertNotNull(cacheConfiguration14);
        org.junit.Assert.assertNotNull(expression19);
        org.junit.Assert.assertNotNull(expression26);
        org.junit.Assert.assertNotNull(consumer30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(cacheManagerFactory35);
        org.junit.Assert.assertTrue(long38 == 300L);
        org.junit.Assert.assertTrue(long44 == 0L);
        org.junit.Assert.assertNotNull(consumer46);
        org.junit.Assert.assertNotNull(pollingConsumer47);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(cacheManagerFactory53);
        org.junit.Assert.assertTrue(long56 == 300L);
        org.junit.Assert.assertNull(camelContext62);
        org.junit.Assert.assertNotNull(pollingConsumer63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(camelContext65);
        org.junit.Assert.assertNotNull(map_str_obj66);
    }
}
