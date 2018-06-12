import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test01");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) true);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getLocal();
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "false" + "'", str12.equals("false"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        java.lang.String str2 = referencebean_dubboConfigBindingsRegistrar1.getCluster();
        referencebean_dubboConfigBindingsRegistrar1.setInjvm((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig5 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list_methodConfig5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig10 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig10);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.config.ProviderConfig providerConfig20 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        java.lang.String str21 = servicebean_beanDefinitionRegistryPostProcessor1.getGroup();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(providerConfig20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test04");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        java.lang.String str6 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getOwner();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test05");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        com.alibaba.dubbo.config.annotation.Service service3 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor4 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service3);
        servicebean_beanDefinitionRegistryPostProcessor4.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor4.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL9 = servicebean_beanDefinitionRegistryPostProcessor4.toUrl();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor4.getPath();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor4.getProxy();
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor4.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig13 = null;
        servicebean_beanDefinitionRegistryPostProcessor4.setProtocol(protocolConfig13);
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor4.getOnconnect();
        java.lang.Integer i16 = servicebean_beanDefinitionRegistryPostProcessor4.getDelay();
        java.lang.Integer i17 = servicebean_beanDefinitionRegistryPostProcessor4.getWarmup();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig18 = servicebean_beanDefinitionRegistryPostProcessor4.getProtocol();
        java.lang.Object obj20 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor4, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        java.lang.String str21 = servicebean_beanDefinitionRegistryPostProcessor4.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor4.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
        java.lang.String str24 = servicebean_beanDefinitionRegistryPostProcessor4.getPath();
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-2147483648) + "'", i12.equals((-2147483648)));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(i16);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNull(protocolConfig18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test06");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.lang.Integer i11 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        com.alibaba.dubbo.config.ProviderConfig providerConfig12 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) true);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(i11);
        org.junit.Assert.assertNull(providerConfig12);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test07");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.Class<?> cls12 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        java.lang.Boolean b13 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        java.lang.Class<?> cls14 = referencebean_dubboConfigBindingsRegistrar1.getInterfaceClass();
        java.lang.String str15 = referencebean_dubboConfigBindingsRegistrar1.getCache();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(cls12);
        org.junit.Assert.assertNull(b13);
        org.junit.Assert.assertNull(cls14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test08");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("");
        servicebean_beanDefinitionRegistryPostProcessor1.setMock("");
        servicebean_beanDefinitionRegistryPostProcessor1.setPath("referenceAnnotationBeanPostProcessor");
        java.lang.String[] str_array17 = new java.lang.String[] { "hi!", "referenceAnnotationBeanPostProcessor", "", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str18, str_array17);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor20 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str18);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor21 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str18);
        servicebean_beanDefinitionRegistryPostProcessor1.setRef((org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor) serviceAnnotationBeanPostProcessor21);
        java.lang.String str23 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.String str24 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test09");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        int i1 = referenceAnnotationBeanPostProcessor0.getOrder();
        com.alibaba.dubbo.config.annotation.Service service2 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor3 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service2);
        servicebean_beanDefinitionRegistryPostProcessor3.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor3.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL8 = servicebean_beanDefinitionRegistryPostProcessor3.toUrl();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor3.getPath();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor3.getProxy();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig11 = servicebean_beanDefinitionRegistryPostProcessor3.getProviders();
        servicebean_beanDefinitionRegistryPostProcessor3.setRetries((java.lang.Integer) 1);
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor3.getToken();
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor3.getLocal();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor16 = servicebean_beanDefinitionRegistryPostProcessor3.getRef();
        servicebean_beanDefinitionRegistryPostProcessor3.setAccesslog((java.lang.Boolean) false);
        java.lang.String str19 = servicebean_beanDefinitionRegistryPostProcessor3.getScope();
        boolean b21 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor3, "<dubbo:reference singleton=\"true\" uniqueServiceName=\"null\" check=\"false\" stubevent=\"true\" lazy=\"true\" generic=\"false\" onconnect=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
        org.junit.Assert.assertTrue(i1 == 2147483647);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(list_providerConfig11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test10");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i13 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLoadbalance("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(i13);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test11");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setGroup("");
        java.lang.Integer i14 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        java.lang.Integer i16 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        servicebean_beanDefinitionRegistryPostProcessor1.setOwner("referenceAnnotationBeanPostProcessor");
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        java.lang.String str21 = servicebean_beanDefinitionRegistryPostProcessor1.getGroup();
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig22 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.String str23 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        java.lang.String str24 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(i16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(list_registryConfig22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test12");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL19 = servicebean_beanDefinitionRegistryPostProcessor1.toUrls();
        com.alibaba.dubbo.config.ProviderConfig providerConfig20 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(list_uRL19);
        org.junit.Assert.assertNull(providerConfig20);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test13");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str5 = referencebean_dubboConfigBindingsRegistrar1.toString();
        java.lang.String str6 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />" + "'", str5.equals("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />"));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test14");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setParameters(map_str_str4);
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getVersion();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test15");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.destroy();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test16");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) true);
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        referencebean_dubboConfigBindingsRegistrar1.setCache("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test17");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("");
        com.alibaba.dubbo.config.RegistryConfig registryConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig9);
        java.lang.Integer i11 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getOndisconnect();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(i11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test18");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig5 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setAsync((java.lang.Boolean) true);
        com.alibaba.dubbo.config.RegistryConfig registryConfig10 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig10);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
        org.junit.Assert.assertNull(list_protocolConfig5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test19");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig10 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig10);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        servicebean_beanDefinitionRegistryPostProcessor1.setFilter("");
        java.lang.String str18 = servicebean_beanDefinitionRegistryPostProcessor1.getCache();
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) (-2147483648));
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 100);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test20");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("hi!");
        boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        java.lang.String str10 = referencebean_dubboConfigBindingsRegistrar1.getLoadbalance();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test21");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.Class<?> cls12 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        boolean b17 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig20 = referencebean_dubboConfigBindingsRegistrar1.getRegistries();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(cls12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(list_registryConfig20);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test22");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getClient();
        referencebean_dubboConfigBindingsRegistrar1.setActives((java.lang.Integer) 2147483647);
        try {
            java.lang.Object obj12 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test23");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.util.Map<java.lang.String, java.lang.String> map_str_str10 = null;
        referencebean_dubboConfigBindingsRegistrar1.setParameters(map_str_str10);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getVersion();
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) false);
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test24");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.context.ApplicationListener<org.springframework.context.event.ContextRefreshedEvent>> referencebean_applicationlistener_contextRefreshedEvent1 = new com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.context.ApplicationListener<org.springframework.context.event.ContextRefreshedEvent>>(reference0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test25");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.Boolean b14 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.Boolean b15 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setStub("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + b14 + "' != '" + false + "'", b14.equals(false));
        org.junit.Assert.assertTrue("'" + b15 + "' != '" + false + "'", b15.equals(false));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test26");
        com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport> referencebean_namespaceHandlerSupport0 = new com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport>();
        referencebean_namespaceHandlerSupport0.setMock((java.lang.Boolean) false);
        referencebean_namespaceHandlerSupport0.setSticky((java.lang.Boolean) false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test27");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) false);
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test28");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        org.springframework.context.event.ContextRefreshedEvent contextRefreshedEvent6 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.onApplicationEvent(contextRefreshedEvent6);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setConnections((java.lang.Integer) 10);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getDocument();
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getLocal();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test29");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("");
        servicebean_beanDefinitionRegistryPostProcessor1.setMock("");
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getLayer();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL12 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        boolean b13 = servicebean_beanDefinitionRegistryPostProcessor1.isExported();
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) 0);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setMock("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list_uRL12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test30");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        servicebean_beanDefinitionRegistryPostProcessor1.setVersion("");
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) 2147483647);
        java.lang.Integer i11 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertTrue("'" + i11 + "' != '" + 2147483647 + "'", i11.equals(2147483647));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test31");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setWarmup((java.lang.Integer) 2147483647);
        servicebean_beanDefinitionRegistryPostProcessor1.setGroup("");
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test32");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        com.alibaba.dubbo.config.ProviderConfig providerConfig10 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig10);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test33");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Class<?> cls6 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        com.alibaba.dubbo.config.annotation.Service service7 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.ProviderConfig[] providerConfig_array10 = new com.alibaba.dubbo.config.ProviderConfig[] {};
        java.util.ArrayList<com.alibaba.dubbo.config.ProviderConfig> arraylist_providerConfig11 = new java.util.ArrayList<com.alibaba.dubbo.config.ProviderConfig>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<com.alibaba.dubbo.config.ProviderConfig>) arraylist_providerConfig11, providerConfig_array10);
        servicebean_beanDefinitionRegistryPostProcessor1.setProviders((java.util.List<com.alibaba.dubbo.config.ProviderConfig>) arraylist_providerConfig11);
        servicebean_beanDefinitionRegistryPostProcessor1.unexport();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(service7);
        org.junit.Assert.assertNotNull(providerConfig_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test34");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 100);
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.Integer i16 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        java.lang.String str21 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-2147483648) + "'", i16.equals((-2147483648)));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test35");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory7 = null;
        serviceAnnotationBeanPostProcessor6.postProcessBeanFactory(configurableListableBeanFactory7);
        java.lang.ClassLoader classLoader9 = null;
        serviceAnnotationBeanPostProcessor6.setBeanClassLoader(classLoader9);
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        serviceAnnotationBeanPostProcessor6.setResourceLoader(resourceLoader11);
        java.lang.ClassLoader classLoader13 = null;
        serviceAnnotationBeanPostProcessor6.setBeanClassLoader(classLoader13);
        java.lang.ClassLoader classLoader15 = null;
        serviceAnnotationBeanPostProcessor6.setBeanClassLoader(classLoader15);
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test36");
        java.lang.String[] str_array1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str2, str_array1);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor4 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor5 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry7 = null;
        try {
            serviceAnnotationBeanPostProcessor6.postProcessBeanDefinitionRegistry(beanDefinitionRegistry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test37");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        boolean b3 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) (byte) 100, "hi!");
        int i4 = referenceAnnotationBeanPostProcessor0.getOrder();
        com.alibaba.dubbo.config.annotation.Service service5 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor6 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service5);
        servicebean_beanDefinitionRegistryPostProcessor6.setExport((java.lang.Boolean) false);
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor6.getLoadbalance();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor6.getConnections();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor6.getOnconnect();
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor6, "referenceAnnotationBeanPostProcessor");
        referenceAnnotationBeanPostProcessor0.destroy();
        java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str17, str_array16);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor19 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str17);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor20 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str17);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor21 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str17);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor22 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str17);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor23 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str17);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor24 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str17);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor25 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str17);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor26 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str17);
        java.lang.Object obj28 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) linkedhashset_str17, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(str_array16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test38");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        servicebean_beanDefinitionRegistryPostProcessor5.setRegister((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor5.setOnconnect("referenceAnnotationBeanPostProcessor");
        servicebean_beanDefinitionRegistryPostProcessor5.setCallbacks((java.lang.Integer) 10);
        com.alibaba.dubbo.config.ProviderConfig providerConfig20 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProvider(providerConfig20);
        java.lang.String str22 = servicebean_beanDefinitionRegistryPostProcessor5.getOndisconnect();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test39");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.String str10 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setInjvm((java.lang.Boolean) false);
        java.lang.Class<?> cls13 = referencebean_dubboConfigBindingsRegistrar1.getInterfaceClass();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(cls13);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test40");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL10 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) 10);
        servicebean_beanDefinitionRegistryPostProcessor1.setAsync((java.lang.Boolean) false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNotNull(list_uRL10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test41");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("hi!");
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getLayer();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMock();
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test42");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setInterface("");
        java.lang.Integer i15 = referencebean_dubboConfigBindingsRegistrar1.getConnections();
        java.lang.String str16 = referencebean_dubboConfigBindingsRegistrar1.getClient();
        com.alibaba.dubbo.common.URL uRL17 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        java.lang.String str18 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test43");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory1 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory1);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory3 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory3);
        java.lang.String str5 = annotationBean0.getPackage();
        java.lang.String str6 = annotationBean0.getPackage();
        com.alibaba.dubbo.config.annotation.Service service7 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor8 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service7);
        servicebean_beanDefinitionRegistryPostProcessor8.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor8.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL13 = servicebean_beanDefinitionRegistryPostProcessor8.toUrl();
        java.lang.Boolean b14 = servicebean_beanDefinitionRegistryPostProcessor8.isRegister();
        servicebean_beanDefinitionRegistryPostProcessor8.setRegister((java.lang.Boolean) false);
        java.lang.Object obj18 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) false, "null");
        annotationBean0.setPackage("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(b14);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test44");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 1);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        java.lang.Class<?> cls14 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        java.lang.Boolean b15 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        servicebean_beanDefinitionRegistryPostProcessor1.setPath("");
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(cls14);
        org.junit.Assert.assertNull(b15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test45");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>> servicebean_referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ServiceBean<com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>>(service0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test46");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setMock((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) true);
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getReconnect();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test47");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getLocal();
        com.alibaba.dubbo.config.RegistryConfig registryConfig12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig12);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test48");
        java.lang.String[] str_array0 = new java.lang.String[] {};
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor1 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array0);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor2 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array0);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor3 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array0);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor4 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array0);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor5 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array0);
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        serviceAnnotationBeanPostProcessor5.setResourceLoader(resourceLoader6);
        org.junit.Assert.assertNotNull(str_array0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test49");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Class<?> cls6 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        com.alibaba.dubbo.config.annotation.Service service7 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("referenceAnnotationBeanPostProcessor");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setToken("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" accesslog=\"true\" timeout=\"-2147483648\" async=\"true\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(service7);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test50");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig10 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig10);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        java.lang.Integer i13 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        java.lang.Integer i14 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) 2147483647);
        java.lang.Integer i17 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(i17);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test51");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("null");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 2147483647);
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertNull(list_registryConfig9);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test52");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.getSticky();
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig13 = null;
        referencebean_dubboConfigBindingsRegistrar1.setConsumer(consumerConfig13);
        com.alibaba.dubbo.common.URL uRL15 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig16 = null;
        referencebean_dubboConfigBindingsRegistrar1.setConsumer(consumerConfig16);
        java.lang.String str18 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        referencebean_dubboConfigBindingsRegistrar1.destroy();
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        java.lang.String str22 = referencebean_dubboConfigBindingsRegistrar1.getReconnect();
        com.alibaba.dubbo.common.URL uRL23 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null" + "'", str18.equals("null"));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(uRL23);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test53");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setCache("");
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getLoadbalance();
        java.lang.Boolean b8 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        org.springframework.context.ApplicationContext applicationContext9 = null;
        try {
            referencebean_dubboConfigBindingsRegistrar1.setApplicationContext(applicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(b8);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test54");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.Class<?> cls12 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.destroy();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(cls12);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test55");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrls();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        boolean b9 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        servicebean_beanDefinitionRegistryPostProcessor1.unexport();
        java.lang.Integer i11 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_uRL6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(i11);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test56");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setProxy("");
        com.alibaba.dubbo.config.RegistryConfig registryConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig8);
        servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
        java.lang.Integer i11 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i11);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test57");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        servicebean_beanDefinitionRegistryPostProcessor1.export();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig10 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig10);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test58");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor5.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL10 = servicebean_beanDefinitionRegistryPostProcessor5.toUrl();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor5.getPath();
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) str11, "null");
        org.springframework.context.ApplicationContext applicationContext14 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext14);
        com.alibaba.dubbo.config.annotation.Service service16 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor17 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service16);
        servicebean_beanDefinitionRegistryPostProcessor17.setCallbacks((java.lang.Integer) 1);
        java.lang.String str20 = servicebean_beanDefinitionRegistryPostProcessor17.getId();
        java.lang.String str21 = servicebean_beanDefinitionRegistryPostProcessor17.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor17.destroy();
        servicebean_beanDefinitionRegistryPostProcessor17.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor17.setWeight((java.lang.Integer) 1);
        servicebean_beanDefinitionRegistryPostProcessor17.setDeprecated((java.lang.Boolean) true);
        com.alibaba.dubbo.config.MonitorConfig monitorConfig29 = null;
        servicebean_beanDefinitionRegistryPostProcessor17.setMonitor(monitorConfig29);
        java.lang.Object obj32 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) monitorConfig29, "");
        com.alibaba.dubbo.config.annotation.Reference reference33 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar34 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference33);
        referencebean_dubboConfigBindingsRegistrar34.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar34.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b39 = referencebean_dubboConfigBindingsRegistrar34.isInjvm();
        referencebean_dubboConfigBindingsRegistrar34.setUrl("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        referencebean_dubboConfigBindingsRegistrar34.setMock((java.lang.Boolean) true);
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig44 = null;
        referencebean_dubboConfigBindingsRegistrar34.setConsumer(consumerConfig44);
        java.lang.Object obj47 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) referencebean_dubboConfigBindingsRegistrar34, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" stub=\"\" validation=\"hi!\" />");
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null" + "'", str21.equals("null"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(b39);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test59");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        com.alibaba.dubbo.config.ProviderConfig providerConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig5);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 100);
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        java.lang.Boolean b11 = servicebean_beanDefinitionRegistryPostProcessor1.getSent();
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(b11);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test60");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("null");
        java.lang.String str10 = referencebean_dubboConfigBindingsRegistrar1.getMock();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setValidation("null");
        java.lang.Boolean b17 = referencebean_dubboConfigBindingsRegistrar1.getStubevent();
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + b17 + "' != '" + true + "'", b17.equals(true));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test61");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        com.alibaba.dubbo.config.annotation.Service service3 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor4 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service3);
        servicebean_beanDefinitionRegistryPostProcessor4.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor4.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL9 = servicebean_beanDefinitionRegistryPostProcessor4.toUrl();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor4.getPath();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor4.getProxy();
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor4.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig13 = null;
        servicebean_beanDefinitionRegistryPostProcessor4.setProtocol(protocolConfig13);
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor4.getOnconnect();
        java.lang.Integer i16 = servicebean_beanDefinitionRegistryPostProcessor4.getDelay();
        java.lang.Integer i17 = servicebean_beanDefinitionRegistryPostProcessor4.getWarmup();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig18 = servicebean_beanDefinitionRegistryPostProcessor4.getProtocol();
        java.lang.Object obj20 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor4, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        com.alibaba.dubbo.config.annotation.Service service21 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor22 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service21);
        servicebean_beanDefinitionRegistryPostProcessor22.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor22.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig27 = servicebean_beanDefinitionRegistryPostProcessor22.getProtocols();
        java.lang.Integer i28 = servicebean_beanDefinitionRegistryPostProcessor22.getActives();
        java.lang.String str29 = servicebean_beanDefinitionRegistryPostProcessor22.getOnconnect();
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig30 = servicebean_beanDefinitionRegistryPostProcessor22.getProtocols();
        java.lang.Boolean b31 = servicebean_beanDefinitionRegistryPostProcessor22.isDeprecated();
        java.lang.Object obj33 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor22, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory34 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory34);
        annotationBean0.setPackage("true");
        java.lang.Object obj38 = null;
        try {
            java.lang.Object obj40 = annotationBean0.postProcessAfterInitialization(obj38, "true");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-2147483648) + "'", i12.equals((-2147483648)));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(i16);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNull(protocolConfig18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(list_protocolConfig27);
        org.junit.Assert.assertNull(i28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(list_protocolConfig30);
        org.junit.Assert.assertNull(b31);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test62");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) false);
        com.alibaba.dubbo.config.ModuleConfig moduleConfig14 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig14);
        servicebean_beanDefinitionRegistryPostProcessor1.setConnections((java.lang.Integer) 100);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig18 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig19 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.MonitorConfig monitorConfig22 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig22);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(list_methodConfig18);
        org.junit.Assert.assertNull(list_providerConfig19);
    }
}
