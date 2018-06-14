import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.camel.component.cache.CacheEndpoint cacheEndpoint0 = new org.apache.camel.component.cache.CacheEndpoint();
        org.junit.Assert.assertTrue("Contract failed: cacheEndpoint0.equals(cacheEndpoint0)", cacheEndpoint0.equals(cacheEndpoint0));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.camel.component.cache.CacheConfiguration cacheConfiguration0 = new org.apache.camel.component.cache.CacheConfiguration();
        long long1 = cacheConfiguration0.getTimeToIdleSeconds();
        java.lang.String str2 = cacheConfiguration0.getCacheName();
        org.apache.camel.component.cache.CacheEventListenerRegistry cacheEventListenerRegistry3 = cacheConfiguration0.getEventListenerRegistry();
        int i4 = cacheEventListenerRegistry3.size();
    }
}
