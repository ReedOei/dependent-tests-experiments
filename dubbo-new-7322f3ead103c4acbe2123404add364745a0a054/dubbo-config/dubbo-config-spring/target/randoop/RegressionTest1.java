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
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        com.alibaba.dubbo.common.URL uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        java.lang.Class<?> cls12 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        java.lang.Class<?> cls13 = referencebean_dubboConfigBindingsRegistrar1.getInterfaceClass();
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig14 = referencebean_dubboConfigBindingsRegistrar1.getConsumer();
        try {
            java.lang.Boolean b15 = consumerConfig14.getSticky();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(cls12);
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertNull(consumerConfig14);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getLocal();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(i6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        servicebean_beanDefinitionRegistryPostProcessor1.setId("");
        servicebean_beanDefinitionRegistryPostProcessor1.setMock("");
        java.lang.String str19 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) true);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor12 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.lang.Integer i13 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor12);
        org.junit.Assert.assertNull(i13);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setGroup("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        com.alibaba.dubbo.config.RegistryConfig registryConfig14 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setRegistry(registryConfig14);
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor5.getDocument();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.lang.Boolean b11 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        referencebean_dubboConfigBindingsRegistrar1.setStub((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) true);
        try {
            referencebean_dubboConfigBindingsRegistrar1.setClient("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(b11);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        com.alibaba.dubbo.config.ProviderConfig providerConfig14 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        org.springframework.context.ApplicationContext applicationContext15 = null;
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setApplicationContext(applicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(providerConfig14);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
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
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) false);
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar dubboConfigBindingsRegistrar15 = referencebean_dubboConfigBindingsRegistrar1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 100);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor5 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.lang.Boolean b6 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) 100);
        com.alibaba.dubbo.config.annotation.Service service11 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor5);
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(service11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
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
        try {
            providerConfig12.setAccesslog("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(i11);
        org.junit.Assert.assertNull(providerConfig12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.Boolean b7 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setVersion("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        java.util.Map<java.lang.String, java.lang.String> map_str_str12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setParameters(map_str_str12);
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) (-2147483648));
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getGroup();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        com.alibaba.dubbo.common.URL uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        java.lang.Class<?> cls12 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getReconnect();
        java.lang.Boolean b14 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(cls12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(b14);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig8);
        com.alibaba.dubbo.config.ModuleConfig moduleConfig10 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig10);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        org.springframework.beans.PropertyValues propertyValues1 = null;
        try {
            com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor dubboConfigBindingBeanPostProcessor2 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />", propertyValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        java.lang.String[] str_array6 = new java.lang.String[] { "", "referenceAnnotationBeanPostProcessor", "hi!", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />", "hi!" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor7 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array6);
        org.springframework.core.io.ResourceLoader resourceLoader8 = null;
        serviceAnnotationBeanPostProcessor7.setResourceLoader(resourceLoader8);
        org.junit.Assert.assertNotNull(str_array6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig8);
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor11 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor12 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor11);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getUrl();
        java.lang.Boolean b13 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "referenceAnnotationBeanPostProcessor" + "'", str12.equals("referenceAnnotationBeanPostProcessor"));
        org.junit.Assert.assertTrue("'" + b13 + "' != '" + false + "'", b13.equals(false));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("null");
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.getSticky();
        com.alibaba.dubbo.common.URL uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        try {
            java.lang.Object obj12 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        boolean b8 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getLocal();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("");
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig15 = servicebean_beanDefinitionRegistryPostProcessor1.getMonitor();
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) 1);
        com.alibaba.dubbo.config.RegistryConfig registryConfig18 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig18);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(monitorConfig15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        servicebean_beanDefinitionRegistryPostProcessor1.setCluster("");
        com.alibaba.dubbo.config.MonitorConfig monitorConfig12 = servicebean_beanDefinitionRegistryPostProcessor1.getMonitor();
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("hi!");
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        servicebean_beanDefinitionRegistryPostProcessor1.setStub((java.lang.Boolean) true);
        java.lang.String[] str_array22 = new java.lang.String[] { "hi!", "referenceAnnotationBeanPostProcessor", "", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str23, str_array22);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor25 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str23);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor26 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str23);
        servicebean_beanDefinitionRegistryPostProcessor1.setRef((org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor) serviceAnnotationBeanPostProcessor26);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry28 = null;
        try {
            serviceAnnotationBeanPostProcessor26.postProcessBeanDefinitionRegistry(beanDefinitionRegistry28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(monitorConfig12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setProxy("");
        com.alibaba.dubbo.config.RegistryConfig registryConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig8);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("");
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        servicebean_beanDefinitionRegistryPostProcessor1.setLayer("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.RegistryConfig registryConfig17 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistry();
        boolean b18 = servicebean_beanDefinitionRegistryPostProcessor1.isExported();
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(registryConfig17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
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
        servicebean_beanDefinitionRegistryPostProcessor5.setDeprecated((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        annotationBean0.setPackage("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory5 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory5);
        annotationBean0.setPackage("");
        com.alibaba.dubbo.config.annotation.Service service9 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor10 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service9);
        servicebean_beanDefinitionRegistryPostProcessor10.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor10.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL15 = servicebean_beanDefinitionRegistryPostProcessor10.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor10.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig18 = null;
        servicebean_beanDefinitionRegistryPostProcessor10.setApplication(applicationConfig18);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig20 = servicebean_beanDefinitionRegistryPostProcessor10.getRegistries();
        java.lang.Integer i21 = servicebean_beanDefinitionRegistryPostProcessor10.getConnections();
        java.lang.Integer i22 = servicebean_beanDefinitionRegistryPostProcessor10.getCallbacks();
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig23 = servicebean_beanDefinitionRegistryPostProcessor10.getRegistries();
        java.lang.Integer i24 = servicebean_beanDefinitionRegistryPostProcessor10.getRetries();
        try {
            java.lang.Object obj26 = annotationBean0.postProcessAfterInitialization((java.lang.Object) i24, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(list_registryConfig20);
        org.junit.Assert.assertNull(i21);
        org.junit.Assert.assertNull(i22);
        org.junit.Assert.assertNull(list_registryConfig23);
        org.junit.Assert.assertNull(i24);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setProxy("");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setParameters(map_str_str8);
        servicebean_beanDefinitionRegistryPostProcessor5.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor5.setMerger("");
        java.lang.Object obj14 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) "", "");
        java.lang.ClassLoader classLoader15 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader15);
        org.springframework.beans.PropertyValues propertyValues17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = null;
        java.beans.PropertyDescriptor[] propertyDescriptor_array19 = new java.beans.PropertyDescriptor[] { propertyDescriptor18 };
        com.alibaba.dubbo.config.annotation.Service service20 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor21 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service20);
        servicebean_beanDefinitionRegistryPostProcessor21.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor21.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL26 = servicebean_beanDefinitionRegistryPostProcessor21.toUrl();
        java.lang.String str27 = servicebean_beanDefinitionRegistryPostProcessor21.getPath();
        java.lang.String str28 = servicebean_beanDefinitionRegistryPostProcessor21.getProxy();
        java.lang.Integer i29 = servicebean_beanDefinitionRegistryPostProcessor21.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig30 = null;
        servicebean_beanDefinitionRegistryPostProcessor21.setProtocol(protocolConfig30);
        java.lang.String str32 = servicebean_beanDefinitionRegistryPostProcessor21.getOnconnect();
        servicebean_beanDefinitionRegistryPostProcessor21.setTimeout((java.lang.Integer) (-2147483648));
        org.springframework.beans.PropertyValues propertyValues36 = referenceAnnotationBeanPostProcessor0.postProcessPropertyValues(propertyValues17, propertyDescriptor_array19, (java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor21, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.springframework.context.ApplicationContext applicationContext37 = null;
        try {
            servicebean_beanDefinitionRegistryPostProcessor21.setApplicationContext(applicationContext37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertNotNull(propertyDescriptor_array19);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483648) + "'", i29.equals((-2147483648)));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(propertyValues36);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        java.lang.Object obj5 = annotationBean0.postProcessAfterInitialization((java.lang.Object) 10.0d, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        com.alibaba.dubbo.config.annotation.Service service6 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor7 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service6);
        servicebean_beanDefinitionRegistryPostProcessor7.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor7.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL12 = servicebean_beanDefinitionRegistryPostProcessor7.toUrl();
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor7.getPath();
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor7.getProxy();
        servicebean_beanDefinitionRegistryPostProcessor7.setAccesslog((java.lang.Boolean) false);
        com.alibaba.dubbo.config.RegistryConfig registryConfig17 = null;
        servicebean_beanDefinitionRegistryPostProcessor7.setRegistry(registryConfig17);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig19 = servicebean_beanDefinitionRegistryPostProcessor7.getMethods();
        try {
            java.lang.Object obj21 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) list_methodConfig19, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d + "'", obj5.equals(10.0d));
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(list_methodConfig19);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        java.lang.String str6 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        com.alibaba.dubbo.common.URL uRL7 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        referencebean_dubboConfigBindingsRegistrar1.setId("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) false);
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("");
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor("null");
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig17 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(list_providerConfig17);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
        org.junit.Assert.assertNull(i9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        java.lang.Integer i14 = servicebean_beanDefinitionRegistryPostProcessor5.getWarmup();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig15 = servicebean_beanDefinitionRegistryPostProcessor5.getApplication();
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor5.getMock();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(applicationConfig15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        java.lang.String[] str_array1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str2, str_array1);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor4 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        java.lang.ClassLoader classLoader5 = null;
        serviceAnnotationBeanPostProcessor4.setBeanClassLoader(classLoader5);
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        serviceAnnotationBeanPostProcessor4.setResourceLoader(resourceLoader7);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory9 = null;
        serviceAnnotationBeanPostProcessor4.postProcessBeanFactory(configurableListableBeanFactory9);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory11 = null;
        serviceAnnotationBeanPostProcessor4.postProcessBeanFactory(configurableListableBeanFactory11);
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.config.MonitorConfig monitorConfig14 = servicebean_beanDefinitionRegistryPostProcessor1.getMonitor();
        java.lang.Boolean b15 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(monitorConfig14);
        org.junit.Assert.assertNull(b15);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        com.alibaba.dubbo.common.URL uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        java.lang.Class<?> cls12 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        java.lang.Class<?> cls13 = referencebean_dubboConfigBindingsRegistrar1.getInterfaceClass();
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getUrl();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(cls12);
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.lang.Class<?> cls10 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        java.lang.Class<?> cls11 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        referencebean_dubboConfigBindingsRegistrar1.setLocal((java.lang.Boolean) false);
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(cls10);
        org.junit.Assert.assertNull(cls11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
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
        java.lang.Class<?> cls13 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.Integer i15 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(i15);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />" + "'", str13.equals("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.Boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isInit();
        referencebean_dubboConfigBindingsRegistrar1.setProtocol("");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL14 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b9);
        org.junit.Assert.assertNotNull(list_uRL14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(list_uRL11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(i12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.lang.Boolean b11 = referencebean_dubboConfigBindingsRegistrar1.getStubevent();
        referencebean_dubboConfigBindingsRegistrar1.setInterface("");
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getLayer();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + b11 + "' != '" + true + "'", b11.equals(true));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        java.util.Map<java.lang.String, java.lang.String> map_str_str12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setParameters(map_str_str12);
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
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
        com.alibaba.dubbo.config.annotation.Service service14 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor15 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service14);
        servicebean_beanDefinitionRegistryPostProcessor15.setExport((java.lang.Boolean) false);
        java.lang.String str18 = servicebean_beanDefinitionRegistryPostProcessor15.getLoadbalance();
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor15.getConnections();
        java.lang.String str20 = servicebean_beanDefinitionRegistryPostProcessor15.getOnconnect();
        java.lang.Object obj22 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) str20, "referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.annotation.Service service23 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor24 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service23);
        servicebean_beanDefinitionRegistryPostProcessor24.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor24.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL29 = servicebean_beanDefinitionRegistryPostProcessor24.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor24.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig32 = null;
        servicebean_beanDefinitionRegistryPostProcessor24.setApplication(applicationConfig32);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig34 = servicebean_beanDefinitionRegistryPostProcessor24.getRegistries();
        java.lang.Integer i35 = servicebean_beanDefinitionRegistryPostProcessor24.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor24.setWeight((java.lang.Integer) 100);
        java.lang.String str38 = servicebean_beanDefinitionRegistryPostProcessor24.getPath();
        java.lang.Object obj40 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor24, "referenceAnnotationBeanPostProcessor");
        java.lang.String str41 = servicebean_beanDefinitionRegistryPostProcessor24.getOnconnect();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig42 = servicebean_beanDefinitionRegistryPostProcessor24.getProtocol();
        java.lang.Boolean b43 = servicebean_beanDefinitionRegistryPostProcessor24.isDeprecated();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(i19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(list_registryConfig34);
        org.junit.Assert.assertNull(i35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(protocolConfig42);
        org.junit.Assert.assertNull(b43);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.lang.Class<?> cls10 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        java.lang.Boolean b11 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(cls10);
        org.junit.Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setParameters(map_str_str8);
        servicebean_beanDefinitionRegistryPostProcessor5.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor5.setMerger("");
        java.lang.Object obj14 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) "", "");
        int i15 = referenceAnnotationBeanPostProcessor0.getOrder();
        org.springframework.context.ApplicationContext applicationContext16 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext16);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor18 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        boolean b21 = referenceAnnotationBeanPostProcessor18.postProcessAfterInstantiation((java.lang.Object) (byte) 100, "hi!");
        int i22 = referenceAnnotationBeanPostProcessor18.getOrder();
        com.alibaba.dubbo.config.annotation.Service service23 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor24 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service23);
        servicebean_beanDefinitionRegistryPostProcessor24.setExport((java.lang.Boolean) false);
        java.lang.String str27 = servicebean_beanDefinitionRegistryPostProcessor24.getLoadbalance();
        java.lang.Integer i28 = servicebean_beanDefinitionRegistryPostProcessor24.getConnections();
        java.lang.String str29 = servicebean_beanDefinitionRegistryPostProcessor24.getOnconnect();
        java.lang.Object obj31 = referenceAnnotationBeanPostProcessor18.getEarlyBeanReference((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor24, "referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.annotation.Service service32 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor33 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service32);
        servicebean_beanDefinitionRegistryPostProcessor33.setExport((java.lang.Boolean) false);
        java.lang.String str36 = servicebean_beanDefinitionRegistryPostProcessor33.getLoadbalance();
        java.lang.Integer i37 = servicebean_beanDefinitionRegistryPostProcessor33.getConnections();
        java.lang.String str38 = servicebean_beanDefinitionRegistryPostProcessor33.getOnconnect();
        java.lang.Object obj40 = referenceAnnotationBeanPostProcessor18.postProcessAfterInitialization((java.lang.Object) str38, "referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.annotation.Service service41 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor42 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service41);
        servicebean_beanDefinitionRegistryPostProcessor42.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor42.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL47 = servicebean_beanDefinitionRegistryPostProcessor42.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor42.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig50 = null;
        servicebean_beanDefinitionRegistryPostProcessor42.setApplication(applicationConfig50);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig52 = servicebean_beanDefinitionRegistryPostProcessor42.getRegistries();
        java.lang.Integer i53 = servicebean_beanDefinitionRegistryPostProcessor42.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor42.setWeight((java.lang.Integer) 100);
        java.lang.String str56 = servicebean_beanDefinitionRegistryPostProcessor42.getPath();
        java.lang.Object obj58 = referenceAnnotationBeanPostProcessor18.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor42, "referenceAnnotationBeanPostProcessor");
        java.lang.Object obj60 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor42, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        servicebean_beanDefinitionRegistryPostProcessor42.setAsync((java.lang.Boolean) false);
        java.lang.Integer i63 = servicebean_beanDefinitionRegistryPostProcessor42.getActives();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(i15 == 2147483647);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 2147483647);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(i28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(i37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(uRL47);
        org.junit.Assert.assertNull(list_registryConfig52);
        org.junit.Assert.assertNull(i53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNull(i63);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
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
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig15 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(list_providerConfig15);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        java.lang.Class<?> cls11 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setFilter("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(cls11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("hi!");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setProxy("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        org.springframework.context.ApplicationContext applicationContext12 = null;
        try {
            referencebean_dubboConfigBindingsRegistrar1.setApplicationContext(applicationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor> referencebean_serviceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor>();
        referencebean_serviceAnnotationBeanPostProcessor0.setCheck((java.lang.Boolean) false);
        referencebean_serviceAnnotationBeanPostProcessor0.setGroup("referenceAnnotationBeanPostProcessor");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("referenceAnnotationBeanPostProcessor");
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        annotationBean0.destroy();
        annotationBean0.destroy();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig12 = null;
        referencebean_dubboConfigBindingsRegistrar1.setConsumer(consumerConfig12);
        referencebean_dubboConfigBindingsRegistrar1.setInterface("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setLocal("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("referenceAnnotationBeanPostProcessor");
        servicebean_beanDefinitionRegistryPostProcessor1.setSent((java.lang.Boolean) false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        com.alibaba.dubbo.config.annotation.Service service1 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor2 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service1);
        servicebean_beanDefinitionRegistryPostProcessor2.setCallbacks((java.lang.Integer) 1);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor2.getId();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor2.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor2.destroy();
        servicebean_beanDefinitionRegistryPostProcessor2.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor2.setRetries((java.lang.Integer) 100);
        java.lang.Object obj13 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor2, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        annotationBean0.destroy();
        annotationBean0.setPackage("");
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory17 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory17);
        annotationBean0.setPackage("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("");
        servicebean_beanDefinitionRegistryPostProcessor1.setId("null");
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor16 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) 100);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor16);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("");
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig14 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig15 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig15);
        servicebean_beanDefinitionRegistryPostProcessor1.setConnections((java.lang.Integer) 10);
        com.alibaba.dubbo.config.ProviderConfig providerConfig19 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        try {
            providerConfig19.setWeight((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(list_providerConfig14);
        org.junit.Assert.assertNull(providerConfig19);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.lang.Boolean b7 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setVersion("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertTrue("'" + b7 + "' != '" + true + "'", b7.equals(true));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) false);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        servicebean_beanDefinitionRegistryPostProcessor1.setStub((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
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
        boolean b17 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        java.lang.String str18 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.Boolean b19 = referencebean_dubboConfigBindingsRegistrar1.isAsync();
        java.lang.Boolean b20 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig23 = referencebean_dubboConfigBindingsRegistrar1.getConsumer();
        java.lang.String str24 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(b19);
        org.junit.Assert.assertNull(b20);
        org.junit.Assert.assertNull(consumerConfig23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        java.lang.Boolean b11 = servicebean_beanDefinitionRegistryPostProcessor1.isAsync();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(b11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        annotationBean0.setPackage("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory5 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        annotationBean0.setApplicationContext(applicationContext7);
        annotationBean0.setPackage("hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) true);
        java.lang.String str10 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig12 = referencebean_dubboConfigBindingsRegistrar1.getConsumer();
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setLoadbalance("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(consumerConfig12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL13 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("");
        servicebean_beanDefinitionRegistryPostProcessor1.setVersion("");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list_uRL13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
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
        boolean b17 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        java.lang.String str18 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.Boolean b19 = referencebean_dubboConfigBindingsRegistrar1.isAsync();
        java.lang.Boolean b20 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(b19);
        org.junit.Assert.assertNull(b20);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        org.springframework.beans.PropertyValues propertyValues1 = null;
        try {
            com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor dubboConfigBindingBeanPostProcessor2 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />", propertyValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor7 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry8 = null;
        try {
            serviceAnnotationBeanPostProcessor7.postProcessBeanDefinitionRegistry(beanDefinitionRegistry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
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
        com.alibaba.dubbo.common.URL uRL13 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        java.lang.Boolean b15 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + b15 + "' != '" + true + "'", b15.equals(true));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setToken("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        servicebean_beanDefinitionRegistryPostProcessor1.setVersion("");
        servicebean_beanDefinitionRegistryPostProcessor1.setMock("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertNull(i6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        com.alibaba.dubbo.config.annotation.Service service9 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        com.alibaba.dubbo.config.RegistryConfig registryConfig11 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig11);
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
        org.junit.Assert.assertNull(service9);
        org.junit.Assert.assertNull(i10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
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
        com.alibaba.dubbo.config.annotation.Service service14 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor15 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service14);
        servicebean_beanDefinitionRegistryPostProcessor15.setExport((java.lang.Boolean) false);
        java.lang.String str18 = servicebean_beanDefinitionRegistryPostProcessor15.getLoadbalance();
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor15.getConnections();
        java.lang.String str20 = servicebean_beanDefinitionRegistryPostProcessor15.getOnconnect();
        java.lang.Object obj22 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) str20, "referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.annotation.Service service23 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor24 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service23);
        servicebean_beanDefinitionRegistryPostProcessor24.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor24.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL29 = servicebean_beanDefinitionRegistryPostProcessor24.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor24.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig32 = null;
        servicebean_beanDefinitionRegistryPostProcessor24.setApplication(applicationConfig32);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig34 = servicebean_beanDefinitionRegistryPostProcessor24.getRegistries();
        java.lang.Integer i35 = servicebean_beanDefinitionRegistryPostProcessor24.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor24.setWeight((java.lang.Integer) 100);
        java.lang.String str38 = servicebean_beanDefinitionRegistryPostProcessor24.getPath();
        java.lang.Object obj40 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor24, "referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig41 = servicebean_beanDefinitionRegistryPostProcessor24.getApplication();
        com.alibaba.dubbo.config.ProviderConfig providerConfig42 = servicebean_beanDefinitionRegistryPostProcessor24.getProvider();
        try {
            providerConfig42.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(i19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(list_registryConfig34);
        org.junit.Assert.assertNull(i35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(applicationConfig41);
        org.junit.Assert.assertNull(providerConfig42);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        boolean b6 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) 0.0d, "");
        referenceAnnotationBeanPostProcessor0.destroy();
        java.lang.ClassLoader classLoader8 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader8);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        com.alibaba.dubbo.config.ProviderConfig providerConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(providerConfig6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrls();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory1 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory1);
        annotationBean0.destroy();
        annotationBean0.destroy();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory5 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setParameters(map_str_str8);
        servicebean_beanDefinitionRegistryPostProcessor5.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor5.setMerger("");
        java.lang.Object obj14 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) "", "");
        java.lang.ClassLoader classLoader15 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader15);
        referenceAnnotationBeanPostProcessor0.destroy();
        java.lang.ClassLoader classLoader18 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader18);
        referenceAnnotationBeanPostProcessor0.destroy();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
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
        boolean b17 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        java.lang.String str18 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig19 = null;
        referencebean_dubboConfigBindingsRegistrar1.setApplication(applicationConfig19);
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("");
        servicebean_beanDefinitionRegistryPostProcessor1.setId("null");
        java.lang.Class<?> cls16 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        com.alibaba.dubbo.config.ProviderConfig providerConfig17 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        try {
            java.lang.String str18 = providerConfig17.getToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(cls16);
        org.junit.Assert.assertNull(providerConfig17);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler dubboNamespaceHandler0 = new com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler();
        dubboNamespaceHandler0.init();
        dubboNamespaceHandler0.init();
        dubboNamespaceHandler0.init();
        dubboNamespaceHandler0.init();
        org.w3c.dom.Element element5 = null;
        org.springframework.beans.factory.xml.ParserContext parserContext6 = null;
        try {
            org.springframework.beans.factory.config.BeanDefinition beanDefinition7 = dubboNamespaceHandler0.parse(element5, parserContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory7 = null;
        serviceAnnotationBeanPostProcessor6.postProcessBeanFactory(configurableListableBeanFactory7);
        java.lang.ClassLoader classLoader9 = null;
        serviceAnnotationBeanPostProcessor6.setBeanClassLoader(classLoader9);
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        serviceAnnotationBeanPostProcessor6.setResourceLoader(resourceLoader11);
        org.springframework.core.io.ResourceLoader resourceLoader13 = null;
        serviceAnnotationBeanPostProcessor6.setResourceLoader(resourceLoader13);
        org.springframework.core.env.Environment environment15 = null;
        serviceAnnotationBeanPostProcessor6.setEnvironment(environment15);
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getReconnect();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.destroy();
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig14 = referencebean_dubboConfigBindingsRegistrar1.getRegistries();
        java.lang.String str15 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str9.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
        org.junit.Assert.assertNull(list_registryConfig14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.Boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        boolean b10 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        java.lang.String str6 = referencebean_dubboConfigBindingsRegistrar1.getClient();
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) true);
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getUrl();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) false);
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig11 = null;
        referencebean_dubboConfigBindingsRegistrar1.setApplication(applicationConfig11);
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getCluster();
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setMock("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        com.alibaba.dubbo.common.URL uRL8 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) true);
        java.lang.Boolean b11 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setLoadbalance("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(b11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setGroup("");
        com.alibaba.dubbo.config.RegistryConfig registryConfig14 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig14);
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("");
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        com.alibaba.dubbo.config.MonitorConfig monitorConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig5);
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor8 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) 2147483647);
        java.lang.Boolean b11 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor8);
        org.junit.Assert.assertNull(b11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProviders(list_providerConfig12);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
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
        com.alibaba.dubbo.config.ProviderConfig providerConfig13 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig13);
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) 100);
        try {
            java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig17 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLoadbalance("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        boolean b12 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.Boolean b13 = referencebean_dubboConfigBindingsRegistrar1.getStubevent();
        java.lang.Integer i14 = referencebean_dubboConfigBindingsRegistrar1.getActives();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        org.junit.Assert.assertTrue("'" + b13 + "' != '" + true + "'", b13.equals(true));
        org.junit.Assert.assertNull(i14);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.Integer i12 = referencebean_dubboConfigBindingsRegistrar1.getRetries();
        referencebean_dubboConfigBindingsRegistrar1.setValidation("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setUrl("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.common.URL uRL17 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        referencebean_dubboConfigBindingsRegistrar1.setMonitor("");
        java.lang.Boolean b20 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        java.lang.String str21 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(b20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null" + "'", str21.equals("null"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("");
        com.alibaba.dubbo.config.RegistryConfig registryConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig9);
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("");
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
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
        java.lang.String str15 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig16 = null;
        referencebean_dubboConfigBindingsRegistrar1.setModule(moduleConfig16);
        try {
            referencebean_dubboConfigBindingsRegistrar1.setVersion("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(cls12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null" + "'", str15.equals("null"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
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
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig13 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.Integer i14 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) 2147483647);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setMock("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(list_registryConfig13);
        org.junit.Assert.assertNull(i14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) false);
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig11 = null;
        referencebean_dubboConfigBindingsRegistrar1.setApplication(applicationConfig11);
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig13 = null;
        referencebean_dubboConfigBindingsRegistrar1.setConsumer(consumerConfig13);
        java.lang.String str15 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
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
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig16 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig16);
        com.alibaba.dubbo.config.RegistryConfig registryConfig18 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig18);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setPath("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(cls14);
        org.junit.Assert.assertNull(b15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        java.lang.String[] str_array4 = new java.lang.String[] { "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />", "<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />", "referenceAnnotationBeanPostProcessor", "<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />" };
        java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str5, str_array4);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor7 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) arraylist_str5);
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        com.alibaba.dubbo.config.MonitorConfig monitorConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig5);
        com.alibaba.dubbo.config.RegistryConfig registryConfig7 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistry();
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(registryConfig7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
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
        java.lang.String str17 = referencebean_dubboConfigBindingsRegistrar1.getOndisconnect();
        java.lang.String str18 = referencebean_dubboConfigBindingsRegistrar1.getClient();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) true);
        java.lang.String str10 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) true);
        java.lang.Boolean b14 = referencebean_dubboConfigBindingsRegistrar1.isInit();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(b14);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig13 = referencebean_dubboConfigBindingsRegistrar1.getConsumer();
        try {
            consumerConfig13.setOwner("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        org.junit.Assert.assertNull(consumerConfig13);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setParameters(map_str_str8);
        servicebean_beanDefinitionRegistryPostProcessor5.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor5.setMerger("");
        java.lang.Object obj14 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) "", "");
        java.lang.ClassLoader classLoader15 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext17);
        org.springframework.beans.PropertyValues propertyValues19 = null;
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor20 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj23 = referenceAnnotationBeanPostProcessor20.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service24 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor25 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service24);
        servicebean_beanDefinitionRegistryPostProcessor25.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str28 = null;
        servicebean_beanDefinitionRegistryPostProcessor25.setParameters(map_str_str28);
        servicebean_beanDefinitionRegistryPostProcessor25.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor25.setMerger("");
        java.lang.Object obj34 = referenceAnnotationBeanPostProcessor20.getEarlyBeanReference((java.lang.Object) "", "");
        java.lang.ClassLoader classLoader35 = null;
        referenceAnnotationBeanPostProcessor20.setBeanClassLoader(classLoader35);
        org.springframework.beans.PropertyValues propertyValues37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = null;
        java.beans.PropertyDescriptor[] propertyDescriptor_array39 = new java.beans.PropertyDescriptor[] { propertyDescriptor38 };
        com.alibaba.dubbo.config.annotation.Service service40 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor41 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service40);
        servicebean_beanDefinitionRegistryPostProcessor41.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor41.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL46 = servicebean_beanDefinitionRegistryPostProcessor41.toUrl();
        java.lang.String str47 = servicebean_beanDefinitionRegistryPostProcessor41.getPath();
        java.lang.String str48 = servicebean_beanDefinitionRegistryPostProcessor41.getProxy();
        java.lang.Integer i49 = servicebean_beanDefinitionRegistryPostProcessor41.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig50 = null;
        servicebean_beanDefinitionRegistryPostProcessor41.setProtocol(protocolConfig50);
        java.lang.String str52 = servicebean_beanDefinitionRegistryPostProcessor41.getOnconnect();
        servicebean_beanDefinitionRegistryPostProcessor41.setTimeout((java.lang.Integer) (-2147483648));
        org.springframework.beans.PropertyValues propertyValues56 = referenceAnnotationBeanPostProcessor20.postProcessPropertyValues(propertyValues37, propertyDescriptor_array39, (java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor41, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.config.annotation.Service service57 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor58 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service57);
        servicebean_beanDefinitionRegistryPostProcessor58.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor58.setTimeout((java.lang.Integer) (-2147483648));
        java.lang.Integer i63 = servicebean_beanDefinitionRegistryPostProcessor58.getRetries();
        java.lang.String str64 = servicebean_beanDefinitionRegistryPostProcessor58.getListener();
        try {
            org.springframework.beans.PropertyValues propertyValues66 = referenceAnnotationBeanPostProcessor0.postProcessPropertyValues(propertyValues19, propertyDescriptor_array39, (java.lang.Object) str64, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0d + "'", obj23.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertNotNull(propertyDescriptor_array39);
        org.junit.Assert.assertNull(uRL46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + i49 + "' != '" + (-2147483648) + "'", i49.equals((-2147483648)));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(propertyValues56);
        org.junit.Assert.assertNull(i63);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        com.alibaba.dubbo.config.spring.context.annotation.DubboConfigConfigurationSelector dubboConfigConfigurationSelector0 = new com.alibaba.dubbo.config.spring.context.annotation.DubboConfigConfigurationSelector();
        int i1 = dubboConfigConfigurationSelector0.getOrder();
        int i2 = dubboConfigConfigurationSelector0.getOrder();
        org.springframework.core.type.AnnotationMetadata annotationMetadata3 = null;
        try {
            java.lang.String[] str_array4 = dubboConfigConfigurationSelector0.selectImports(annotationMetadata3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i1 == (-2147483648));
        org.junit.Assert.assertTrue(i2 == (-2147483648));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.Boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        com.alibaba.dubbo.config.ProviderConfig providerConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        servicebean_beanDefinitionRegistryPostProcessor1.setStub((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(providerConfig6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
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
        java.lang.Boolean b15 = servicebean_beanDefinitionRegistryPostProcessor1.isAsync();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig16 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(b15);
        org.junit.Assert.assertNull(list_methodConfig16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("referenceAnnotationBeanPostProcessor");
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setInjvm((java.lang.Boolean) false);
        java.lang.Boolean b11 = referencebean_dubboConfigBindingsRegistrar1.getStubevent();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getScope();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setCluster("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + b11 + "' != '" + true + "'", b11.equals(true));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
        org.junit.Assert.assertNull(list_methodConfig4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.lang.Boolean b11 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL12 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        org.springframework.context.ApplicationContext applicationContext13 = null;
        try {
            referencebean_dubboConfigBindingsRegistrar1.setApplicationContext(applicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(b11);
        org.junit.Assert.assertNotNull(list_uRL12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory1 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory1);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory3 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory3);
        java.lang.String str5 = annotationBean0.getPackage();
        java.lang.String str6 = annotationBean0.getPackage();
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor7 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj10 = referenceAnnotationBeanPostProcessor7.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service11 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor12 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service11);
        servicebean_beanDefinitionRegistryPostProcessor12.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig15 = null;
        servicebean_beanDefinitionRegistryPostProcessor12.setProtocol(protocolConfig15);
        servicebean_beanDefinitionRegistryPostProcessor12.setToken((java.lang.Boolean) true);
        java.lang.Object obj20 = referenceAnnotationBeanPostProcessor7.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor12, "");
        servicebean_beanDefinitionRegistryPostProcessor12.destroy();
        servicebean_beanDefinitionRegistryPostProcessor12.setConnections((java.lang.Integer) 10);
        servicebean_beanDefinitionRegistryPostProcessor12.setWeight((java.lang.Integer) 100);
        java.lang.Object obj27 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) 100, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0d + "'", obj10.equals(100.0d));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        boolean b3 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) (byte) 100, "hi!");
        int i4 = referenceAnnotationBeanPostProcessor0.getOrder();
        com.alibaba.dubbo.config.annotation.Service service5 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor6 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service5);
        servicebean_beanDefinitionRegistryPostProcessor6.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor6.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL11 = servicebean_beanDefinitionRegistryPostProcessor6.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor6.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig14 = servicebean_beanDefinitionRegistryPostProcessor6.getRegistries();
        java.lang.Object obj16 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) list_registryConfig14, "null");
        com.alibaba.dubbo.config.annotation.Service service17 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor18 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service17);
        servicebean_beanDefinitionRegistryPostProcessor18.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor18.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL23 = servicebean_beanDefinitionRegistryPostProcessor18.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor18.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig26 = servicebean_beanDefinitionRegistryPostProcessor18.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor18.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor18.setAccesslog((java.lang.Boolean) true);
        java.lang.String str31 = servicebean_beanDefinitionRegistryPostProcessor18.getStub();
        java.lang.Object obj33 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor18, "null");
        servicebean_beanDefinitionRegistryPostProcessor18.setActives((java.lang.Integer) 1);
        servicebean_beanDefinitionRegistryPostProcessor18.setGroup("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(list_registryConfig14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(list_registryConfig26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        java.lang.Boolean b11 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getCache();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(b11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) true);
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        boolean b10 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getLocal();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
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
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getVersion();
        servicebean_beanDefinitionRegistryPostProcessor1.setWarmup((java.lang.Integer) 100);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(i16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport> referencebean_namespaceHandlerSupport0 = new com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport>();
        referencebean_namespaceHandlerSupport0.setInit((java.lang.Boolean) false);
        java.lang.Boolean b3 = referencebean_namespaceHandlerSupport0.isInit();
        java.lang.Boolean b4 = referencebean_namespaceHandlerSupport0.isGeneric();
        referencebean_namespaceHandlerSupport0.setInjvm((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + b3 + "' != '" + false + "'", b3.equals(false));
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + false + "'", b4.equals(false));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig14 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig14);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 10);
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.Map<java.lang.String, java.lang.String> map_str_str11 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setParameters(map_str_str11);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        java.lang.String str6 = referencebean_dubboConfigBindingsRegistrar1.getLayer();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setClient("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str4 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        com.alibaba.dubbo.config.RegistryConfig registryConfig5 = null;
        referencebean_dubboConfigBindingsRegistrar1.setRegistry(registryConfig5);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        java.lang.String str2 = referencebean_dubboConfigBindingsRegistrar1.getCluster();
        referencebean_dubboConfigBindingsRegistrar1.setInjvm((java.lang.Boolean) true);
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar dubboConfigBindingsRegistrar5 = referencebean_dubboConfigBindingsRegistrar1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        com.alibaba.dubbo.config.MonitorConfig monitorConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig5);
        boolean b7 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Class<?> cls6 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        com.alibaba.dubbo.config.annotation.Service service7 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        java.lang.Integer i8 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig10 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(service7);
        org.junit.Assert.assertNull(i8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list_methodConfig10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        try {
            referencebean_dubboConfigBindingsRegistrar1.setClient("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" stub=\"\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        java.lang.String str6 = referencebean_dubboConfigBindingsRegistrar1.getLayer();
        referencebean_dubboConfigBindingsRegistrar1.setClient("null");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setLayer("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str6, str_array5);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor8 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str6);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor9 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str6);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor10 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str6);
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        serviceAnnotationBeanPostProcessor10.setResourceLoader(resourceLoader11);
        servicebean_beanDefinitionRegistryPostProcessor1.setRef((org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor) serviceAnnotationBeanPostProcessor10);
        servicebean_beanDefinitionRegistryPostProcessor1.setActives((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
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
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getLocal();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor14 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        java.lang.Class<?> cls17 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig18 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocol();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor14);
        org.junit.Assert.assertNull(cls17);
        org.junit.Assert.assertNull(protocolConfig18);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.lang.Boolean b11 = referencebean_dubboConfigBindingsRegistrar1.getStubevent();
        referencebean_dubboConfigBindingsRegistrar1.setInterface("");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + b11 + "' != '" + true + "'", b11.equals(true));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getFilter();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig8 = servicebean_beanDefinitionRegistryPostProcessor1.getApplication();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getOndisconnect();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        java.lang.Integer i11 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        servicebean_beanDefinitionRegistryPostProcessor1.setActives((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(applicationConfig8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(i11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.ProviderConfig providerConfig17 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        try {
            providerConfig17.setExport((java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(providerConfig17);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory1 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory1);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory3 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory3);
        annotationBean0.destroy();
        com.alibaba.dubbo.config.annotation.Service service6 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor7 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service6);
        servicebean_beanDefinitionRegistryPostProcessor7.setExport((java.lang.Boolean) false);
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor7.getOwner();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig11 = null;
        servicebean_beanDefinitionRegistryPostProcessor7.setModule(moduleConfig11);
        servicebean_beanDefinitionRegistryPostProcessor7.setDocument("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        java.lang.Object obj16 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        annotationBean0.setPackage("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", obj16.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
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
        com.alibaba.dubbo.config.MonitorConfig monitorConfig17 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig17);
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.String str20 = servicebean_beanDefinitionRegistryPostProcessor1.getDocument();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL21 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(i19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(list_uRL21);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        java.lang.String[] str_array1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str2, str_array1);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor4 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor5 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor7 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        java.lang.ClassLoader classLoader8 = null;
        serviceAnnotationBeanPostProcessor7.setBeanClassLoader(classLoader8);
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        java.lang.Class<?> cls11 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getOwner();
        java.lang.Boolean b13 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(cls11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + b13 + "' != '" + false + "'", b13.equals(false));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("");
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getOndisconnect();
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        com.alibaba.dubbo.config.ModuleConfig moduleConfig13 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig13);
        java.lang.Boolean b15 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("referenceAnnotationBeanPostProcessor");
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) (-2147483648));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(b15);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("");
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig15 = servicebean_beanDefinitionRegistryPostProcessor1.getMonitor();
        com.alibaba.dubbo.config.annotation.Service service16 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(monitorConfig15);
        org.junit.Assert.assertNull(service16);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.Boolean b14 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar dubboConfigBindingsRegistrar15 = referencebean_dubboConfigBindingsRegistrar1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(b14);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport> referencebean_namespaceHandlerSupport0 = new com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport>();
        referencebean_namespaceHandlerSupport0.setInit((java.lang.Boolean) false);
        referencebean_namespaceHandlerSupport0.setMock((java.lang.Boolean) true);
        referencebean_namespaceHandlerSupport0.setMerger("hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
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
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig16 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig16);
        java.lang.Boolean b18 = servicebean_beanDefinitionRegistryPostProcessor1.getSent();
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig19 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setMock("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(cls14);
        org.junit.Assert.assertNull(b15);
        org.junit.Assert.assertNull(b18);
        org.junit.Assert.assertNull(list_registryConfig19);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
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
        com.alibaba.dubbo.config.MonitorConfig monitorConfig17 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig17);
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.String str20 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.String str21 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(i19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("");
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        serviceAnnotationBeanPostProcessor6.setResourceLoader(resourceLoader7);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory9 = null;
        serviceAnnotationBeanPostProcessor6.postProcessBeanFactory(configurableListableBeanFactory9);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry11 = null;
        try {
            serviceAnnotationBeanPostProcessor6.postProcessBeanDefinitionRegistry(beanDefinitionRegistry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocol();
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        com.alibaba.dubbo.config.ProviderConfig providerConfig12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig12);
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
        org.junit.Assert.assertNull(protocolConfig9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("");
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal("");
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL12 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        boolean b13 = servicebean_beanDefinitionRegistryPostProcessor1.isExported();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list_uRL12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getCache();
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.Boolean b14 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(b14);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        referencebean_dubboConfigBindingsRegistrar1.destroy();
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getReconnect();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        servicebean_beanDefinitionRegistryPostProcessor1.export();
        java.lang.Boolean b9 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(b9);
        org.junit.Assert.assertNull(i10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 100);
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("hi!");
        referencebean_dubboConfigBindingsRegistrar1.setGroup("");
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.setStub((java.lang.Boolean) false);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getLayer();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
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
        com.alibaba.dubbo.config.annotation.Service service14 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor15 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service14);
        servicebean_beanDefinitionRegistryPostProcessor15.setExport((java.lang.Boolean) false);
        java.lang.String str18 = servicebean_beanDefinitionRegistryPostProcessor15.getLoadbalance();
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor15.getConnections();
        java.lang.String str20 = servicebean_beanDefinitionRegistryPostProcessor15.getOnconnect();
        java.lang.Object obj22 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) str20, "referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.annotation.Service service23 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor24 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service23);
        servicebean_beanDefinitionRegistryPostProcessor24.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor24.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL29 = servicebean_beanDefinitionRegistryPostProcessor24.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor24.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig32 = null;
        servicebean_beanDefinitionRegistryPostProcessor24.setApplication(applicationConfig32);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig34 = servicebean_beanDefinitionRegistryPostProcessor24.getRegistries();
        java.lang.Integer i35 = servicebean_beanDefinitionRegistryPostProcessor24.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor24.setWeight((java.lang.Integer) 100);
        java.lang.String str38 = servicebean_beanDefinitionRegistryPostProcessor24.getPath();
        java.lang.Object obj40 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor24, "referenceAnnotationBeanPostProcessor");
        java.lang.String str41 = servicebean_beanDefinitionRegistryPostProcessor24.getOnconnect();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig42 = servicebean_beanDefinitionRegistryPostProcessor24.getProtocol();
        servicebean_beanDefinitionRegistryPostProcessor24.setValidation("");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(i19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(list_registryConfig34);
        org.junit.Assert.assertNull(i35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(protocolConfig42);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        java.lang.Boolean b10 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        com.alibaba.dubbo.config.ProviderConfig providerConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(providerConfig11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        com.alibaba.dubbo.config.annotation.Service service2 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor3 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service2);
        java.lang.Integer i4 = servicebean_beanDefinitionRegistryPostProcessor3.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor3.setDynamic((java.lang.Boolean) false);
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor3.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL8 = servicebean_beanDefinitionRegistryPostProcessor3.toUrls();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor3.getLoadbalance();
        java.lang.Object obj11 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor3, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        com.alibaba.dubbo.config.annotation.Service service12 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor13 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service12);
        servicebean_beanDefinitionRegistryPostProcessor13.setExport((java.lang.Boolean) false);
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor13.getOwner();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig17 = null;
        servicebean_beanDefinitionRegistryPostProcessor13.setModule(moduleConfig17);
        servicebean_beanDefinitionRegistryPostProcessor13.setDocument("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        java.lang.Object obj22 = annotationBean0.postProcessAfterInitialization((java.lang.Object) "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory23 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory23);
        annotationBean0.destroy();
        org.junit.Assert.assertNull(i4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list_uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", obj22.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("");
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig15 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig15);
        java.lang.Integer i17 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setToken("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-2147483648) + "'", i17.equals((-2147483648)));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        servicebean_beanDefinitionRegistryPostProcessor1.export();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getDocument();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        servicebean_beanDefinitionRegistryPostProcessor1.setId("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        java.lang.Integer i9 = referencebean_dubboConfigBindingsRegistrar1.getCallbacks();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL10 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(i9);
        org.junit.Assert.assertNotNull(list_uRL10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        java.lang.String[] str_array0 = new java.lang.String[] {};
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor1 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array0);
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        serviceAnnotationBeanPostProcessor1.setResourceLoader(resourceLoader2);
        org.springframework.core.io.ResourceLoader resourceLoader4 = null;
        serviceAnnotationBeanPostProcessor1.setResourceLoader(resourceLoader4);
        org.junit.Assert.assertNotNull(str_array0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        java.util.Map<java.lang.String, java.lang.String> map_str_str12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setParameters(map_str_str12);
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) (-2147483648));
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrls();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.Boolean b4 = referencebean_dubboConfigBindingsRegistrar1.getStubevent();
        java.lang.String str5 = referencebean_dubboConfigBindingsRegistrar1.getVersion();
        java.lang.String str6 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        org.junit.Assert.assertTrue("'" + b4 + "' != '" + true + "'", b4.equals(true));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        com.alibaba.dubbo.config.annotation.Service service11 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(service11);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1 + "'", i12.equals(1));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
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
        com.alibaba.dubbo.config.annotation.Service service14 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor15 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service14);
        servicebean_beanDefinitionRegistryPostProcessor15.setExport((java.lang.Boolean) false);
        java.lang.String str18 = servicebean_beanDefinitionRegistryPostProcessor15.getLoadbalance();
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor15.getConnections();
        java.lang.String str20 = servicebean_beanDefinitionRegistryPostProcessor15.getOnconnect();
        java.lang.Object obj22 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) str20, "referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.annotation.Service service23 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor24 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service23);
        servicebean_beanDefinitionRegistryPostProcessor24.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor24.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL29 = servicebean_beanDefinitionRegistryPostProcessor24.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor24.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig32 = null;
        servicebean_beanDefinitionRegistryPostProcessor24.setApplication(applicationConfig32);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig34 = servicebean_beanDefinitionRegistryPostProcessor24.getRegistries();
        java.lang.Integer i35 = servicebean_beanDefinitionRegistryPostProcessor24.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor24.setWeight((java.lang.Integer) 100);
        java.lang.String str38 = servicebean_beanDefinitionRegistryPostProcessor24.getPath();
        java.lang.Object obj40 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor24, "referenceAnnotationBeanPostProcessor");
        java.lang.String str41 = servicebean_beanDefinitionRegistryPostProcessor24.getOnconnect();
        org.springframework.context.event.ContextRefreshedEvent contextRefreshedEvent42 = null;
        servicebean_beanDefinitionRegistryPostProcessor24.onApplicationEvent(contextRefreshedEvent42);
        try {
            servicebean_beanDefinitionRegistryPostProcessor24.setPath("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(i19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(list_registryConfig34);
        org.junit.Assert.assertNull(i35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setProxy("");
        com.alibaba.dubbo.config.RegistryConfig registryConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig8);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("");
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        servicebean_beanDefinitionRegistryPostProcessor1.setLayer("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.RegistryConfig registryConfig17 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistry();
        servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(registryConfig17);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("null");
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.getSticky();
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(b10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" stub=\"\" validation=\"hi!\" />");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getVersion();
        com.alibaba.dubbo.common.URL uRL9 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        referencebean_dubboConfigBindingsRegistrar1.setProtocol("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
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
        java.lang.Class<?> cls13 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getGroup();
        java.util.Map<java.lang.String, java.lang.String> map_str_str16 = servicebean_beanDefinitionRegistryPostProcessor1.getParameters();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(map_str_str16);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.Boolean b14 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setId("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(b14);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        com.alibaba.dubbo.config.annotation.Service service2 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor3 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service2);
        java.lang.Integer i4 = servicebean_beanDefinitionRegistryPostProcessor3.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor3.setDynamic((java.lang.Boolean) false);
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor3.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL8 = servicebean_beanDefinitionRegistryPostProcessor3.toUrls();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor3.getLoadbalance();
        java.lang.Object obj11 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor3, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        org.springframework.context.ApplicationContext applicationContext12 = null;
        annotationBean0.setApplicationContext(applicationContext12);
        org.springframework.context.ApplicationContext applicationContext14 = null;
        annotationBean0.setApplicationContext(applicationContext14);
        org.junit.Assert.assertNull(i4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list_uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("");
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig14 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig15 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig15);
        servicebean_beanDefinitionRegistryPostProcessor1.setConnections((java.lang.Integer) 10);
        java.lang.String str19 = servicebean_beanDefinitionRegistryPostProcessor1.getVersion();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig20 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        java.lang.Integer i21 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        java.lang.Integer i22 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(list_providerConfig14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(list_providerConfig20);
        org.junit.Assert.assertNull(i21);
        org.junit.Assert.assertNull(i22);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("referenceAnnotationBeanPostProcessor");
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        org.springframework.context.event.ContextRefreshedEvent contextRefreshedEvent11 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.onApplicationEvent(contextRefreshedEvent11);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor> referencebean_serviceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor>();
        java.lang.Boolean b1 = referencebean_serviceAnnotationBeanPostProcessor0.isInit();
        try {
            referencebean_serviceAnnotationBeanPostProcessor0.setLoadbalance("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(b1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 0);
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig15 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(list_protocolConfig15);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor0 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>();
        java.lang.String str1 = servicebean_beanDefinitionRegistryPostProcessor0.getOnconnect();
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor0.getConnections();
        try {
            servicebean_beanDefinitionRegistryPostProcessor0.setStub("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(i2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("hi!");
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getCache();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
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
        servicebean_beanDefinitionRegistryPostProcessor4.destroy();
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
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig8);
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        servicebean_beanDefinitionRegistryPostProcessor1.setMock("referenceAnnotationBeanPostProcessor");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig13 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(list_registryConfig13);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
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
        java.lang.Integer i20 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(list_uRL19);
        org.junit.Assert.assertNull(i20);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
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
        try {
            referencebean_dubboConfigBindingsRegistrar1.setVersion("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) (-2147483648));
        java.lang.String str22 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor> referencebean_serviceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor>();
        referencebean_serviceAnnotationBeanPostProcessor0.setCheck((java.lang.Boolean) false);
        java.lang.Integer i3 = referencebean_serviceAnnotationBeanPostProcessor0.getCallbacks();
        org.junit.Assert.assertNull(i3);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor8 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setListener("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor8);
        org.junit.Assert.assertNull(i9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport> referencebean_namespaceHandlerSupport0 = new com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport>();
        referencebean_namespaceHandlerSupport0.setInit((java.lang.Boolean) false);
        referencebean_namespaceHandlerSupport0.setOndisconnect("");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory1 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory1);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory3 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory3);
        annotationBean0.setPackage("");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getDocument();
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) (-2147483648));
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig10 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getApplication();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig12);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list_registryConfig10);
        org.junit.Assert.assertNull(applicationConfig11);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) false);
        boolean b11 = servicebean_beanDefinitionRegistryPostProcessor1.isExported();
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(i12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig5 = null;
        referencebean_dubboConfigBindingsRegistrar1.setModule(moduleConfig5);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        java.lang.Boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isInit();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b9);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig5);
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getFilter();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setInterface("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        java.lang.Integer i17 = referencebean_dubboConfigBindingsRegistrar1.getTimeout();
        referencebean_dubboConfigBindingsRegistrar1.setCallbacks((java.lang.Integer) (-2147483648));
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i17);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig5);
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.config.MonitorConfig monitorConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getMonitor();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(monitorConfig9);
        org.junit.Assert.assertNull(i10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig10 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getApplication();
        boolean b12 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        org.springframework.context.event.ContextRefreshedEvent contextRefreshedEvent13 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.onApplicationEvent(contextRefreshedEvent13);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list_registryConfig10);
        org.junit.Assert.assertNull(applicationConfig11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        boolean b3 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) (byte) 100, "hi!");
        int i4 = referenceAnnotationBeanPostProcessor0.getOrder();
        com.alibaba.dubbo.config.annotation.Service service5 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor6 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service5);
        servicebean_beanDefinitionRegistryPostProcessor6.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor6.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL11 = servicebean_beanDefinitionRegistryPostProcessor6.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor6.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig14 = servicebean_beanDefinitionRegistryPostProcessor6.getRegistries();
        java.lang.Object obj16 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) list_registryConfig14, "null");
        com.alibaba.dubbo.config.annotation.Service service17 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor18 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service17);
        servicebean_beanDefinitionRegistryPostProcessor18.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor18.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL23 = servicebean_beanDefinitionRegistryPostProcessor18.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor18.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig26 = servicebean_beanDefinitionRegistryPostProcessor18.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor18.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor18.setAccesslog((java.lang.Boolean) true);
        java.lang.String str31 = servicebean_beanDefinitionRegistryPostProcessor18.getStub();
        java.lang.Object obj33 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor18, "null");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor34 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj37 = referenceAnnotationBeanPostProcessor34.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        boolean b40 = referenceAnnotationBeanPostProcessor34.postProcessAfterInstantiation((java.lang.Object) 0.0d, "");
        referenceAnnotationBeanPostProcessor34.destroy();
        boolean b43 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) referenceAnnotationBeanPostProcessor34, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.springframework.beans.PropertyValues propertyValues44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = null;
        java.beans.PropertyDescriptor[] propertyDescriptor_array46 = new java.beans.PropertyDescriptor[] { propertyDescriptor45 };
        com.alibaba.dubbo.config.annotation.Service service47 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor48 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service47);
        servicebean_beanDefinitionRegistryPostProcessor48.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor48.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL53 = servicebean_beanDefinitionRegistryPostProcessor48.toUrl();
        java.lang.String str54 = servicebean_beanDefinitionRegistryPostProcessor48.getPath();
        java.lang.String str55 = servicebean_beanDefinitionRegistryPostProcessor48.getProxy();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig56 = servicebean_beanDefinitionRegistryPostProcessor48.getProviders();
        servicebean_beanDefinitionRegistryPostProcessor48.setRetries((java.lang.Integer) 1);
        java.lang.String str59 = servicebean_beanDefinitionRegistryPostProcessor48.getToken();
        java.lang.String str60 = servicebean_beanDefinitionRegistryPostProcessor48.getUniqueServiceName();
        java.lang.Class<?> cls61 = servicebean_beanDefinitionRegistryPostProcessor48.getInterfaceClass();
        java.lang.Boolean b62 = servicebean_beanDefinitionRegistryPostProcessor48.isRegister();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig63 = null;
        servicebean_beanDefinitionRegistryPostProcessor48.setProtocol(protocolConfig63);
        java.lang.Boolean b65 = servicebean_beanDefinitionRegistryPostProcessor48.getSent();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig66 = servicebean_beanDefinitionRegistryPostProcessor48.getMethods();
        servicebean_beanDefinitionRegistryPostProcessor48.setPath("null");
        servicebean_beanDefinitionRegistryPostProcessor48.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        org.springframework.beans.PropertyValues propertyValues72 = referenceAnnotationBeanPostProcessor34.postProcessPropertyValues(propertyValues44, propertyDescriptor_array46, (java.lang.Object) "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />", "null");
        com.alibaba.dubbo.config.annotation.Service service73 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor74 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service73);
        servicebean_beanDefinitionRegistryPostProcessor74.setCallbacks((java.lang.Integer) 1);
        java.lang.String str77 = servicebean_beanDefinitionRegistryPostProcessor74.getId();
        java.lang.String str78 = servicebean_beanDefinitionRegistryPostProcessor74.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor74.destroy();
        servicebean_beanDefinitionRegistryPostProcessor74.setId("null");
        java.lang.String str82 = servicebean_beanDefinitionRegistryPostProcessor74.getStub();
        boolean b83 = servicebean_beanDefinitionRegistryPostProcessor74.isUnexported();
        java.lang.Object obj85 = referenceAnnotationBeanPostProcessor34.postProcessBeforeInitialization((java.lang.Object) b83, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.config.annotation.Service service86 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor87 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service86);
        servicebean_beanDefinitionRegistryPostProcessor87.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor87.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL92 = servicebean_beanDefinitionRegistryPostProcessor87.toUrl();
        java.lang.String str93 = servicebean_beanDefinitionRegistryPostProcessor87.getPath();
        java.lang.String str94 = servicebean_beanDefinitionRegistryPostProcessor87.getProxy();
        java.lang.Integer i95 = servicebean_beanDefinitionRegistryPostProcessor87.getTimeout();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig96 = null;
        servicebean_beanDefinitionRegistryPostProcessor87.setApplication(applicationConfig96);
        boolean b99 = referenceAnnotationBeanPostProcessor34.postProcessAfterInstantiation((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor87, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(list_registryConfig14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(list_registryConfig26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100.0d + "'", obj37.equals(100.0d));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(propertyDescriptor_array46);
        org.junit.Assert.assertNull(uRL53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(list_providerConfig56);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        org.junit.Assert.assertNull(cls61);
        org.junit.Assert.assertNull(b62);
        org.junit.Assert.assertNull(b65);
        org.junit.Assert.assertNull(list_methodConfig66);
        org.junit.Assert.assertNull(propertyValues72);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "null" + "'", str78.equals("null"));
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + false + "'", obj85.equals(false));
        org.junit.Assert.assertNull(uRL92);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertTrue("'" + i95 + "' != '" + (-2147483648) + "'", i95.equals((-2147483648)));
        org.junit.Assert.assertTrue(b99 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
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
        com.alibaba.dubbo.config.MonitorConfig monitorConfig17 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig17);
        java.lang.String str19 = servicebean_beanDefinitionRegistryPostProcessor1.getGroup();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig8);
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        servicebean_beanDefinitionRegistryPostProcessor1.setMock("referenceAnnotationBeanPostProcessor");
        servicebean_beanDefinitionRegistryPostProcessor1.setAsync((java.lang.Boolean) false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(i10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        java.lang.String[] str_array1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str2, str_array1);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor4 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor5 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        java.lang.ClassLoader classLoader6 = null;
        serviceAnnotationBeanPostProcessor5.setBeanClassLoader(classLoader6);
        org.springframework.core.env.Environment environment8 = null;
        serviceAnnotationBeanPostProcessor5.setEnvironment(environment8);
        java.lang.ClassLoader classLoader10 = null;
        serviceAnnotationBeanPostProcessor5.setBeanClassLoader(classLoader10);
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) true);
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar dubboConfigBindingsRegistrar11 = referencebean_dubboConfigBindingsRegistrar1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
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
        com.alibaba.dubbo.config.ProviderConfig providerConfig16 = servicebean_beanDefinitionRegistryPostProcessor5.getProvider();
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor5.getFilter();
        servicebean_beanDefinitionRegistryPostProcessor5.setSent((java.lang.Boolean) false);
        java.lang.Integer i20 = servicebean_beanDefinitionRegistryPostProcessor5.getConnections();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(providerConfig16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(i20);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL5 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNotNull(list_uRL5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        java.lang.String str6 = referencebean_dubboConfigBindingsRegistrar1.getLayer();
        referencebean_dubboConfigBindingsRegistrar1.setClient("null");
        try {
            java.lang.Object obj9 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrls();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        referencebean_dubboConfigBindingsRegistrar1.setConnections((java.lang.Integer) 0);
        java.lang.Boolean b16 = referencebean_dubboConfigBindingsRegistrar1.getSticky();
        java.lang.String str17 = referencebean_dubboConfigBindingsRegistrar1.getClient();
        boolean b18 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(b16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.context.EnvironmentAware> servicebean_environmentAware0 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.context.EnvironmentAware>();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
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
        referencebean_dubboConfigBindingsRegistrar1.setProtocol("");
        java.lang.String str18 = referencebean_dubboConfigBindingsRegistrar1.getVersion();
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("");
        com.alibaba.dubbo.config.MonitorConfig monitorConfig21 = referencebean_dubboConfigBindingsRegistrar1.getMonitor();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNull(monitorConfig21);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
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
        java.lang.Class<?> cls13 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor("null");
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("referenceAnnotationBeanPostProcessor");
        java.lang.Boolean b6 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        boolean b7 = servicebean_beanDefinitionRegistryPostProcessor1.isExported();
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        referencebean_dubboConfigBindingsRegistrar1.setConnections((java.lang.Integer) 0);
        java.lang.String str16 = referencebean_dubboConfigBindingsRegistrar1.getStub();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        java.lang.String str6 = referencebean_dubboConfigBindingsRegistrar1.getClient();
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setCache("");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setLoadbalance("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        servicebean_beanDefinitionRegistryPostProcessor1.setMock((java.lang.Boolean) true);
        java.lang.Boolean b10 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        java.lang.Integer i11 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        com.alibaba.dubbo.config.ProviderConfig providerConfig12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig12);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(i11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
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
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig17 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        java.lang.String str18 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-2147483648) + "'", i16.equals((-2147483648)));
        org.junit.Assert.assertNull(list_methodConfig17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNull(i19);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrls();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_uRL6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig12);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setFilter("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig8);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig10 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list_registryConfig10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig5 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        servicebean_beanDefinitionRegistryPostProcessor1.setOwner("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setGroup("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) (-1));
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig14 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
        org.junit.Assert.assertNull(list_protocolConfig5);
        org.junit.Assert.assertNull(list_providerConfig14);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.Boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isInit();
        referencebean_dubboConfigBindingsRegistrar1.setProtocol("");
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        org.springframework.context.ApplicationContext applicationContext13 = null;
        try {
            referencebean_dubboConfigBindingsRegistrar1.setApplicationContext(applicationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.AbstractServiceConfig> referencebean_abstractServiceConfig0 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.AbstractServiceConfig>();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setId("null");
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig11 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig11);
        com.alibaba.dubbo.config.RegistryConfig registryConfig13 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig13);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(i9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL10 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal((java.lang.Boolean) true);
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNotNull(list_uRL10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("null");
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = servicebean_beanDefinitionRegistryPostProcessor1.getParameters();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(map_str_str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
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
        java.lang.Integer i15 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(cls14);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("");
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal("");
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL12 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setPath("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list_uRL12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory7 = null;
        serviceAnnotationBeanPostProcessor6.postProcessBeanFactory(configurableListableBeanFactory7);
        java.lang.ClassLoader classLoader9 = null;
        serviceAnnotationBeanPostProcessor6.setBeanClassLoader(classLoader9);
        java.lang.ClassLoader classLoader11 = null;
        serviceAnnotationBeanPostProcessor6.setBeanClassLoader(classLoader11);
        java.lang.ClassLoader classLoader13 = null;
        serviceAnnotationBeanPostProcessor6.setBeanClassLoader(classLoader13);
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 100);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        com.alibaba.dubbo.config.annotation.Service service12 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        servicebean_beanDefinitionRegistryPostProcessor1.setStub((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(service12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        java.lang.String[] str_array1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str2, str_array1);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor4 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor5 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry6 = null;
        try {
            serviceAnnotationBeanPostProcessor5.postProcessBeanDefinitionRegistry(beanDefinitionRegistry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        referencebean_dubboConfigBindingsRegistrar1.setMonitor("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
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
        referencebean_dubboConfigBindingsRegistrar1.setProtocol("");
        java.lang.String str18 = referencebean_dubboConfigBindingsRegistrar1.getVersion();
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        java.lang.String str21 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setOwner("null");
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 100);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor5 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.lang.Boolean b6 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("");
        com.alibaba.dubbo.config.ProviderConfig providerConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig9);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor5);
        org.junit.Assert.assertNull(b6);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        org.springframework.context.ApplicationContext applicationContext3 = null;
        annotationBean0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        annotationBean0.setApplicationContext(applicationContext5);
        java.lang.String str7 = annotationBean0.getPackage();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        com.alibaba.dubbo.config.MonitorConfig monitorConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig5);
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor8 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setListener("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
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
        com.alibaba.dubbo.config.MonitorConfig monitorConfig17 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig17);
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.String str20 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(i19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        java.lang.String[] str_array1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str2, str_array1);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor4 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor5 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor7 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor8 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor9 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler dubboNamespaceHandler0 = new com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler();
        dubboNamespaceHandler0.init();
        dubboNamespaceHandler0.init();
        dubboNamespaceHandler0.init();
        org.w3c.dom.Node node4 = null;
        org.springframework.beans.factory.config.BeanDefinitionHolder beanDefinitionHolder5 = null;
        org.springframework.beans.factory.xml.ParserContext parserContext6 = null;
        try {
            org.springframework.beans.factory.config.BeanDefinitionHolder beanDefinitionHolder7 = dubboNamespaceHandler0.decorate(node4, beanDefinitionHolder5, parserContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig5 = null;
        referencebean_dubboConfigBindingsRegistrar1.setModule(moduleConfig5);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setCluster("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str5 = referencebean_dubboConfigBindingsRegistrar1.toString();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig6 = referencebean_dubboConfigBindingsRegistrar1.getModule();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />" + "'", str5.equals("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />"));
        org.junit.Assert.assertNull(moduleConfig6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setValidation("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
        org.junit.Assert.assertNull(list_methodConfig4);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
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
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig13 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.Integer i14 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        com.alibaba.dubbo.config.annotation.Service service15 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor16 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service15);
        servicebean_beanDefinitionRegistryPostProcessor16.setExport((java.lang.Boolean) false);
        java.lang.String str19 = servicebean_beanDefinitionRegistryPostProcessor16.getLoadbalance();
        java.lang.Integer i20 = servicebean_beanDefinitionRegistryPostProcessor16.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor16.setProxy("");
        com.alibaba.dubbo.config.RegistryConfig registryConfig23 = null;
        servicebean_beanDefinitionRegistryPostProcessor16.setRegistry(registryConfig23);
        com.alibaba.dubbo.config.ProviderConfig[] providerConfig_array25 = new com.alibaba.dubbo.config.ProviderConfig[] {};
        java.util.ArrayList<com.alibaba.dubbo.config.ProviderConfig> arraylist_providerConfig26 = new java.util.ArrayList<com.alibaba.dubbo.config.ProviderConfig>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<com.alibaba.dubbo.config.ProviderConfig>) arraylist_providerConfig26, providerConfig_array25);
        servicebean_beanDefinitionRegistryPostProcessor16.setProviders((java.util.List<com.alibaba.dubbo.config.ProviderConfig>) arraylist_providerConfig26);
        servicebean_beanDefinitionRegistryPostProcessor1.setProviders((java.util.List<com.alibaba.dubbo.config.ProviderConfig>) arraylist_providerConfig26);
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(list_registryConfig13);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(i20);
        org.junit.Assert.assertNotNull(providerConfig_array25);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) true);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("");
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
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
        referencebean_dubboConfigBindingsRegistrar1.setProtocol("");
        java.lang.String str18 = referencebean_dubboConfigBindingsRegistrar1.getVersion();
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("");
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        java.lang.String str23 = referencebean_dubboConfigBindingsRegistrar1.getClient();
        try {
            java.lang.Object obj24 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(i10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.Boolean b4 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isInit();
        org.junit.Assert.assertNull(b4);
        org.junit.Assert.assertNull(b5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        java.lang.String str6 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.Boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(b9);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        java.lang.Integer i14 = servicebean_beanDefinitionRegistryPostProcessor5.getWarmup();
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor5.getAccesslog();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
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
        java.lang.Integer i21 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-2147483648) + "'", i16.equals((-2147483648)));
        org.junit.Assert.assertNull(i21);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) false);
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getLocal();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setInterface("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        java.lang.Integer i17 = referencebean_dubboConfigBindingsRegistrar1.getTimeout();
        java.lang.String str18 = referencebean_dubboConfigBindingsRegistrar1.getScope();
        try {
            referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.Class<?> cls13 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getLayer();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("");
        servicebean_beanDefinitionRegistryPostProcessor1.setMock("");
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getLayer();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.export();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.getSticky();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 100);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getDocument();
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
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
        com.alibaba.dubbo.config.annotation.Service service14 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor15 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service14);
        servicebean_beanDefinitionRegistryPostProcessor15.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor15.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL20 = servicebean_beanDefinitionRegistryPostProcessor15.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor15.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig23 = servicebean_beanDefinitionRegistryPostProcessor15.getRegistries();
        java.lang.String str24 = servicebean_beanDefinitionRegistryPostProcessor15.getOnconnect();
        java.lang.Object obj26 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) str24, "");
        com.alibaba.dubbo.config.annotation.Service service27 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor28 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service27);
        servicebean_beanDefinitionRegistryPostProcessor28.setExport((java.lang.Boolean) false);
        java.lang.String str31 = servicebean_beanDefinitionRegistryPostProcessor28.getLoadbalance();
        java.lang.Integer i32 = servicebean_beanDefinitionRegistryPostProcessor28.getConnections();
        java.lang.Integer i33 = servicebean_beanDefinitionRegistryPostProcessor28.getTimeout();
        java.lang.String str34 = servicebean_beanDefinitionRegistryPostProcessor28.getListener();
        java.lang.String str35 = servicebean_beanDefinitionRegistryPostProcessor28.toString();
        java.lang.String str36 = servicebean_beanDefinitionRegistryPostProcessor28.getStub();
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig37 = servicebean_beanDefinitionRegistryPostProcessor28.getRegistries();
        java.lang.Object obj39 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) list_registryConfig37, "null");
        org.springframework.context.ApplicationContext applicationContext40 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext40);
        org.springframework.beans.PropertyValues propertyValues42 = null;
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor43 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj46 = referenceAnnotationBeanPostProcessor43.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service47 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor48 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service47);
        servicebean_beanDefinitionRegistryPostProcessor48.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str51 = null;
        servicebean_beanDefinitionRegistryPostProcessor48.setParameters(map_str_str51);
        servicebean_beanDefinitionRegistryPostProcessor48.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor48.setMerger("");
        java.lang.Object obj57 = referenceAnnotationBeanPostProcessor43.getEarlyBeanReference((java.lang.Object) "", "");
        java.lang.ClassLoader classLoader58 = null;
        referenceAnnotationBeanPostProcessor43.setBeanClassLoader(classLoader58);
        org.springframework.beans.PropertyValues propertyValues60 = null;
        java.beans.PropertyDescriptor propertyDescriptor61 = null;
        java.beans.PropertyDescriptor[] propertyDescriptor_array62 = new java.beans.PropertyDescriptor[] { propertyDescriptor61 };
        com.alibaba.dubbo.config.annotation.Service service63 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor64 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service63);
        servicebean_beanDefinitionRegistryPostProcessor64.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor64.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL69 = servicebean_beanDefinitionRegistryPostProcessor64.toUrl();
        java.lang.String str70 = servicebean_beanDefinitionRegistryPostProcessor64.getPath();
        java.lang.String str71 = servicebean_beanDefinitionRegistryPostProcessor64.getProxy();
        java.lang.Integer i72 = servicebean_beanDefinitionRegistryPostProcessor64.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig73 = null;
        servicebean_beanDefinitionRegistryPostProcessor64.setProtocol(protocolConfig73);
        java.lang.String str75 = servicebean_beanDefinitionRegistryPostProcessor64.getOnconnect();
        servicebean_beanDefinitionRegistryPostProcessor64.setTimeout((java.lang.Integer) (-2147483648));
        org.springframework.beans.PropertyValues propertyValues79 = referenceAnnotationBeanPostProcessor43.postProcessPropertyValues(propertyValues60, propertyDescriptor_array62, (java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor64, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.config.annotation.Service service80 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor81 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service80);
        servicebean_beanDefinitionRegistryPostProcessor81.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor81.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL86 = servicebean_beanDefinitionRegistryPostProcessor81.toUrl();
        java.lang.String str87 = servicebean_beanDefinitionRegistryPostProcessor81.getPath();
        java.lang.String str88 = servicebean_beanDefinitionRegistryPostProcessor81.getProxy();
        java.lang.Integer i89 = servicebean_beanDefinitionRegistryPostProcessor81.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig90 = null;
        servicebean_beanDefinitionRegistryPostProcessor81.setProtocol(protocolConfig90);
        java.lang.String str92 = servicebean_beanDefinitionRegistryPostProcessor81.getOnconnect();
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig93 = servicebean_beanDefinitionRegistryPostProcessor81.getRegistries();
        java.lang.Integer i94 = servicebean_beanDefinitionRegistryPostProcessor81.getConnections();
        java.lang.Integer i95 = servicebean_beanDefinitionRegistryPostProcessor81.getExecutes();
        try {
            org.springframework.beans.PropertyValues propertyValues97 = referenceAnnotationBeanPostProcessor0.postProcessPropertyValues(propertyValues42, propertyDescriptor_array62, (java.lang.Object) i95, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(list_registryConfig23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(i32);
        org.junit.Assert.assertNull(i33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", str35.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(list_registryConfig37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0d + "'", obj46.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "" + "'", obj57.equals(""));
        org.junit.Assert.assertNotNull(propertyDescriptor_array62);
        org.junit.Assert.assertNull(uRL69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + i72 + "' != '" + (-2147483648) + "'", i72.equals((-2147483648)));
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(propertyValues79);
        org.junit.Assert.assertNull(uRL86);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertTrue("'" + i89 + "' != '" + (-2147483648) + "'", i89.equals((-2147483648)));
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNull(list_registryConfig93);
        org.junit.Assert.assertNull(i94);
        org.junit.Assert.assertNull(i95);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
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
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig17 = servicebean_beanDefinitionRegistryPostProcessor1.getModule();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLayer("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" stub=\"\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(cls14);
        org.junit.Assert.assertNull(b15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(moduleConfig17);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig15 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(list_methodConfig15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        org.springframework.beans.PropertyValues propertyValues1 = null;
        try {
            com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor dubboConfigBindingBeanPostProcessor2 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />", propertyValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.getStubevent();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig13 = null;
        referencebean_dubboConfigBindingsRegistrar1.setApplication(applicationConfig13);
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + true + "'", b12.equals(true));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.getStubevent();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + b10 + "' != '" + true + "'", b10.equals(true));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b15 = referencebean_dubboConfigBindingsRegistrar1.isInit();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(b15);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        com.alibaba.dubbo.config.ProviderConfig providerConfig10 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig10);
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig12);
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getOndisconnect();
        boolean b15 = servicebean_beanDefinitionRegistryPostProcessor1.isExported();
        java.lang.Class<?> cls16 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setListener("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(cls16);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        referencebean_dubboConfigBindingsRegistrar1.setInjvm((java.lang.Boolean) true);
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.context.ResourceLoaderAware> servicebean_resourceLoaderAware0 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.context.ResourceLoaderAware>();
        servicebean_resourceLoaderAware0.setMock("");
        servicebean_resourceLoaderAware0.setSent((java.lang.Boolean) true);
        servicebean_resourceLoaderAware0.setMonitor("hi!");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.lang.Boolean b7 = referencebean_dubboConfigBindingsRegistrar1.isAsync();
        java.lang.Boolean b8 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b7);
        org.junit.Assert.assertNull(b8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
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
        com.alibaba.dubbo.config.ProviderConfig providerConfig13 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig13);
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) 100);
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        java.lang.Boolean b18 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(b18);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("");
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("referenceAnnotationBeanPostProcessor");
        java.lang.String str20 = servicebean_beanDefinitionRegistryPostProcessor1.getVersion();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setProxy("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) 100);
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        org.junit.Assert.assertNull(list_methodConfig4);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.Boolean b7 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        servicebean_beanDefinitionRegistryPostProcessor1.setAsync((java.lang.Boolean) true);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(b7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.setStub((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) true);
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig10 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig10);
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", str5.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) true);
        java.lang.Integer i14 = referencebean_dubboConfigBindingsRegistrar1.getCallbacks();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(i14);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 100);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor5 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.lang.Boolean b6 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLocal("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor5);
        org.junit.Assert.assertNull(b6);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
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
        com.alibaba.dubbo.config.ModuleConfig moduleConfig13 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig13);
        java.lang.Integer i15 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig16 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertNull(list_protocolConfig16);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Class<?> cls6 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        com.alibaba.dubbo.config.annotation.Service service7 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("referenceAnnotationBeanPostProcessor");
        java.lang.Boolean b10 = servicebean_beanDefinitionRegistryPostProcessor1.getExport();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(service7);
        org.junit.Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(list_methodConfig6);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
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
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.Integer i16 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(i16);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) true);
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig9 = referencebean_dubboConfigBindingsRegistrar1.getConsumer();
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(consumerConfig9);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        com.alibaba.dubbo.config.annotation.Service service1 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor2 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service1);
        servicebean_beanDefinitionRegistryPostProcessor2.setCallbacks((java.lang.Integer) 1);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor2.getId();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor2.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor2.destroy();
        servicebean_beanDefinitionRegistryPostProcessor2.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor2.setRetries((java.lang.Integer) 100);
        java.lang.Object obj13 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor2, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        annotationBean0.destroy();
        com.alibaba.dubbo.config.annotation.Service service15 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor16 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service15);
        servicebean_beanDefinitionRegistryPostProcessor16.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor16.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL21 = servicebean_beanDefinitionRegistryPostProcessor16.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor16.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig24 = null;
        servicebean_beanDefinitionRegistryPostProcessor16.setApplication(applicationConfig24);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig26 = servicebean_beanDefinitionRegistryPostProcessor16.getRegistries();
        java.lang.Integer i27 = servicebean_beanDefinitionRegistryPostProcessor16.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor16.setWeight((java.lang.Integer) 100);
        java.lang.String str30 = servicebean_beanDefinitionRegistryPostProcessor16.getPath();
        java.lang.Integer i31 = servicebean_beanDefinitionRegistryPostProcessor16.getTimeout();
        java.lang.Object obj33 = annotationBean0.postProcessAfterInitialization((java.lang.Object) i31, "null");
        java.lang.String str34 = annotationBean0.getPackage();
        com.alibaba.dubbo.config.annotation.Service service35 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor36 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service35);
        servicebean_beanDefinitionRegistryPostProcessor36.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor36.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL41 = servicebean_beanDefinitionRegistryPostProcessor36.toUrl();
        java.lang.String str42 = servicebean_beanDefinitionRegistryPostProcessor36.getPath();
        java.lang.String str43 = servicebean_beanDefinitionRegistryPostProcessor36.getProxy();
        java.lang.Class<?> cls44 = servicebean_beanDefinitionRegistryPostProcessor36.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor36.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor36.setAsync((java.lang.Boolean) false);
        java.lang.Boolean b49 = servicebean_beanDefinitionRegistryPostProcessor36.isDeprecated();
        servicebean_beanDefinitionRegistryPostProcessor36.setDelay((java.lang.Integer) 0);
        java.lang.Object obj53 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor36, "referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.RegistryConfig registryConfig54 = null;
        servicebean_beanDefinitionRegistryPostProcessor36.setRegistry(registryConfig54);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(list_registryConfig26);
        org.junit.Assert.assertNull(i27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + i31 + "' != '" + (-2147483648) + "'", i31.equals((-2147483648)));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (-2147483648) + "'", obj33.equals((-2147483648)));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(uRL41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(cls44);
        org.junit.Assert.assertTrue("'" + b49 + "' != '" + true + "'", b49.equals(true));
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        com.alibaba.dubbo.config.annotation.Service service11 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getVersion();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(service11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        referencebean_dubboConfigBindingsRegistrar1.setProtocol("hi!");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setGroup("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        com.alibaba.dubbo.config.ProviderConfig providerConfig10 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig10);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken("null");
        java.lang.Boolean b14 = servicebean_beanDefinitionRegistryPostProcessor1.isAsync();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(b14);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        java.lang.String[] str_array6 = new java.lang.String[] { "", "referenceAnnotationBeanPostProcessor", "hi!", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />", "hi!" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor7 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array6);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry8 = null;
        try {
            serviceAnnotationBeanPostProcessor7.postProcessBeanDefinitionRegistry(beanDefinitionRegistry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array6);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("referenceAnnotationBeanPostProcessor");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setStub("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
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
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Class<?> cls6 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        com.alibaba.dubbo.config.annotation.Service service7 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        java.lang.Integer i8 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(service7);
        org.junit.Assert.assertNull(i8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i10);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
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
        com.alibaba.dubbo.config.ProviderConfig providerConfig16 = servicebean_beanDefinitionRegistryPostProcessor5.getProvider();
        java.lang.Integer i17 = servicebean_beanDefinitionRegistryPostProcessor5.getWarmup();
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig18 = servicebean_beanDefinitionRegistryPostProcessor5.getProtocols();
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor5.getTimeout();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(providerConfig16);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNotNull(list_protocolConfig18);
        org.junit.Assert.assertNull(i19);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getCluster();
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getUrl();
        try {
            java.lang.Object obj15 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "referenceAnnotationBeanPostProcessor" + "'", str14.equals("referenceAnnotationBeanPostProcessor"));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.Boolean b13 = referencebean_dubboConfigBindingsRegistrar1.getStubevent();
        boolean b14 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        java.lang.String str15 = referencebean_dubboConfigBindingsRegistrar1.getUrl();
        java.lang.String str16 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        org.junit.Assert.assertTrue("'" + b13 + "' != '" + true + "'", b13.equals(true));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "referenceAnnotationBeanPostProcessor" + "'", str15.equals("referenceAnnotationBeanPostProcessor"));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
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
        java.lang.Boolean b20 = referencebean_dubboConfigBindingsRegistrar1.getSticky();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null" + "'", str18.equals("null"));
        org.junit.Assert.assertNull(b20);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory7 = null;
        serviceAnnotationBeanPostProcessor6.postProcessBeanFactory(configurableListableBeanFactory7);
        java.lang.ClassLoader classLoader9 = null;
        serviceAnnotationBeanPostProcessor6.setBeanClassLoader(classLoader9);
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        serviceAnnotationBeanPostProcessor6.setResourceLoader(resourceLoader11);
        org.springframework.core.env.Environment environment13 = null;
        serviceAnnotationBeanPostProcessor6.setEnvironment(environment13);
        org.springframework.core.env.Environment environment15 = null;
        serviceAnnotationBeanPostProcessor6.setEnvironment(environment15);
        java.lang.ClassLoader classLoader17 = null;
        serviceAnnotationBeanPostProcessor6.setBeanClassLoader(classLoader17);
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getCluster();
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig15 = referencebean_dubboConfigBindingsRegistrar1.getConsumer();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(consumerConfig15);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        java.lang.String[] str_array1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str2, str_array1);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor4 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        java.lang.ClassLoader classLoader5 = null;
        serviceAnnotationBeanPostProcessor4.setBeanClassLoader(classLoader5);
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        serviceAnnotationBeanPostProcessor4.setResourceLoader(resourceLoader7);
        java.lang.ClassLoader classLoader9 = null;
        serviceAnnotationBeanPostProcessor4.setBeanClassLoader(classLoader9);
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        servicebean_beanDefinitionRegistryPostProcessor1.setMock((java.lang.Boolean) true);
        org.junit.Assert.assertNull(i6);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig10 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getApplication();
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list_registryConfig10);
        org.junit.Assert.assertNull(applicationConfig11);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        java.lang.Boolean b7 = servicebean_beanDefinitionRegistryPostProcessor1.getExport();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setParameters(map_str_str8);
        servicebean_beanDefinitionRegistryPostProcessor5.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor5.setMerger("");
        java.lang.Object obj14 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) "", "");
        java.lang.ClassLoader classLoader15 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader15);
        org.springframework.beans.PropertyValues propertyValues17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = null;
        java.beans.PropertyDescriptor[] propertyDescriptor_array19 = new java.beans.PropertyDescriptor[] { propertyDescriptor18 };
        com.alibaba.dubbo.config.annotation.Service service20 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor21 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service20);
        servicebean_beanDefinitionRegistryPostProcessor21.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor21.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL26 = servicebean_beanDefinitionRegistryPostProcessor21.toUrl();
        java.lang.String str27 = servicebean_beanDefinitionRegistryPostProcessor21.getPath();
        java.lang.String str28 = servicebean_beanDefinitionRegistryPostProcessor21.getProxy();
        java.lang.Integer i29 = servicebean_beanDefinitionRegistryPostProcessor21.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig30 = null;
        servicebean_beanDefinitionRegistryPostProcessor21.setProtocol(protocolConfig30);
        java.lang.String str32 = servicebean_beanDefinitionRegistryPostProcessor21.getOnconnect();
        servicebean_beanDefinitionRegistryPostProcessor21.setTimeout((java.lang.Integer) (-2147483648));
        org.springframework.beans.PropertyValues propertyValues36 = referenceAnnotationBeanPostProcessor0.postProcessPropertyValues(propertyValues17, propertyDescriptor_array19, (java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor21, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.config.annotation.Reference reference37 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar38 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference37);
        referencebean_dubboConfigBindingsRegistrar38.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig41 = referencebean_dubboConfigBindingsRegistrar38.getMethods();
        java.lang.Object obj43 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) referencebean_dubboConfigBindingsRegistrar38, "null");
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor44 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>();
        boolean b46 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor44, "hi!");
        com.alibaba.dubbo.config.spring.status.DataSourceStatusChecker dataSourceStatusChecker47 = new com.alibaba.dubbo.config.spring.status.DataSourceStatusChecker();
        com.alibaba.dubbo.common.status.Status status48 = dataSourceStatusChecker47.check();
        java.lang.Object obj50 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) dataSourceStatusChecker47, "null");
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertNotNull(propertyDescriptor_array19);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483648) + "'", i29.equals((-2147483648)));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(propertyValues36);
        org.junit.Assert.assertNull(list_methodConfig41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(status48);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) true);
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        referencebean_dubboConfigBindingsRegistrar1.setCache("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setStub((java.lang.Boolean) true);
        java.lang.String str15 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        java.lang.String str16 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        com.alibaba.dubbo.config.annotation.Service service9 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        java.lang.Boolean b10 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setVersion("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
        org.junit.Assert.assertNull(service9);
        org.junit.Assert.assertNull(b10);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        annotationBean0.setPackage("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory5 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory5);
        annotationBean0.destroy();
        annotationBean0.setPackage("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.ProviderConfig providerConfig13 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(providerConfig13);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null" + "'", str12.equals("null"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        com.alibaba.dubbo.config.annotation.Service service1 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor2 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service1);
        servicebean_beanDefinitionRegistryPostProcessor2.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor2.setValidation("hi!");
        java.lang.Object obj8 = annotationBean0.postProcessAfterInitialization((java.lang.Object) "hi!", "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.springframework.context.ApplicationContext applicationContext9 = null;
        annotationBean0.setApplicationContext(applicationContext9);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        annotationBean0.setPackage("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.springframework.context.ApplicationContext applicationContext5 = null;
        annotationBean0.setApplicationContext(applicationContext5);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        boolean b6 = servicebean_beanDefinitionRegistryPostProcessor1.isExported();
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
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
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) false);
        com.alibaba.dubbo.config.ModuleConfig moduleConfig19 = null;
        referencebean_dubboConfigBindingsRegistrar1.setModule(moduleConfig19);
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(cls12);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setAsync((java.lang.Boolean) false);
        java.lang.Boolean b14 = servicebean_beanDefinitionRegistryPostProcessor1.isDeprecated();
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) 0);
        java.lang.Integer i17 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertTrue("'" + b14 + "' != '" + true + "'", b14.equals(true));
        org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0 + "'", i17.equals(0));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setParameters(map_str_str8);
        servicebean_beanDefinitionRegistryPostProcessor5.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor5.setMerger("");
        java.lang.Object obj14 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) "", "");
        java.lang.ClassLoader classLoader15 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader15);
        org.springframework.beans.PropertyValues propertyValues17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = null;
        java.beans.PropertyDescriptor[] propertyDescriptor_array19 = new java.beans.PropertyDescriptor[] { propertyDescriptor18 };
        com.alibaba.dubbo.config.annotation.Service service20 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor21 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service20);
        servicebean_beanDefinitionRegistryPostProcessor21.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor21.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL26 = servicebean_beanDefinitionRegistryPostProcessor21.toUrl();
        java.lang.String str27 = servicebean_beanDefinitionRegistryPostProcessor21.getPath();
        java.lang.String str28 = servicebean_beanDefinitionRegistryPostProcessor21.getProxy();
        java.lang.Integer i29 = servicebean_beanDefinitionRegistryPostProcessor21.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig30 = null;
        servicebean_beanDefinitionRegistryPostProcessor21.setProtocol(protocolConfig30);
        java.lang.String str32 = servicebean_beanDefinitionRegistryPostProcessor21.getOnconnect();
        servicebean_beanDefinitionRegistryPostProcessor21.setTimeout((java.lang.Integer) (-2147483648));
        org.springframework.beans.PropertyValues propertyValues36 = referenceAnnotationBeanPostProcessor0.postProcessPropertyValues(propertyValues17, propertyDescriptor_array19, (java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor21, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        referenceAnnotationBeanPostProcessor0.destroy();
        referenceAnnotationBeanPostProcessor0.destroy();
        java.lang.Object obj39 = null;
        java.lang.Object obj41 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization(obj39, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertNotNull(propertyDescriptor_array19);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483648) + "'", i29.equals((-2147483648)));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(propertyValues36);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        boolean b3 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) (byte) 100, "hi!");
        int i4 = referenceAnnotationBeanPostProcessor0.getOrder();
        com.alibaba.dubbo.config.annotation.Service service5 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor6 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service5);
        servicebean_beanDefinitionRegistryPostProcessor6.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor6.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL11 = servicebean_beanDefinitionRegistryPostProcessor6.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor6.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig14 = servicebean_beanDefinitionRegistryPostProcessor6.getRegistries();
        java.lang.Object obj16 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) list_registryConfig14, "null");
        com.alibaba.dubbo.config.annotation.Service service17 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor18 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service17);
        servicebean_beanDefinitionRegistryPostProcessor18.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor18.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL23 = servicebean_beanDefinitionRegistryPostProcessor18.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor18.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig26 = servicebean_beanDefinitionRegistryPostProcessor18.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor18.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor18.setAccesslog((java.lang.Boolean) true);
        java.lang.String str31 = servicebean_beanDefinitionRegistryPostProcessor18.getStub();
        java.lang.Object obj33 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor18, "null");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor34 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj37 = referenceAnnotationBeanPostProcessor34.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        boolean b40 = referenceAnnotationBeanPostProcessor34.postProcessAfterInstantiation((java.lang.Object) 0.0d, "");
        referenceAnnotationBeanPostProcessor34.destroy();
        boolean b43 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) referenceAnnotationBeanPostProcessor34, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.config.annotation.Service service44 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor45 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service44);
        servicebean_beanDefinitionRegistryPostProcessor45.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor45.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL50 = servicebean_beanDefinitionRegistryPostProcessor45.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor45.setMerger("");
        java.lang.String str53 = servicebean_beanDefinitionRegistryPostProcessor45.getInterface();
        java.lang.String str54 = servicebean_beanDefinitionRegistryPostProcessor45.getGeneric();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL55 = servicebean_beanDefinitionRegistryPostProcessor45.getExportedUrls();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig56 = null;
        servicebean_beanDefinitionRegistryPostProcessor45.setModule(moduleConfig56);
        java.lang.String str58 = servicebean_beanDefinitionRegistryPostProcessor45.getProxy();
        java.lang.String str59 = servicebean_beanDefinitionRegistryPostProcessor45.getId();
        java.lang.Object obj61 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor45, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" stub=\"\" validation=\"hi!\" />");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(list_registryConfig14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(list_registryConfig26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100.0d + "'", obj37.equals(100.0d));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(uRL50);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(list_uRL55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        org.junit.Assert.assertNotNull(obj61);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setParameters(map_str_str4);
        servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("hi!");
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLayer("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(i9);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        com.alibaba.dubbo.config.annotation.Service service1 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor2 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service1);
        servicebean_beanDefinitionRegistryPostProcessor2.setCallbacks((java.lang.Integer) 1);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor2.getId();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor2.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor2.destroy();
        servicebean_beanDefinitionRegistryPostProcessor2.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor2.setRetries((java.lang.Integer) 100);
        java.lang.Object obj13 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor2, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        annotationBean0.destroy();
        annotationBean0.setPackage("");
        annotationBean0.destroy();
        annotationBean0.destroy();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig12 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        org.junit.Assert.assertNull(list_providerConfig12);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setId("null");
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        com.alibaba.dubbo.config.ProviderConfig providerConfig10 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(i9);
        org.junit.Assert.assertNull(providerConfig10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.lang.Boolean b11 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL12 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(b11);
        org.junit.Assert.assertNotNull(list_uRL12);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrls();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.lang.Class<?> cls10 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        java.lang.Class<?> cls11 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig15 = referencebean_dubboConfigBindingsRegistrar1.getConsumer();
        try {
            java.lang.String str16 = consumerConfig15.getGroup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(cls10);
        org.junit.Assert.assertNull(cls11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null" + "'", str14.equals("null"));
        org.junit.Assert.assertNull(consumerConfig15);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
        com.alibaba.dubbo.config.spring.context.annotation.DubboConfigConfigurationSelector dubboConfigConfigurationSelector0 = new com.alibaba.dubbo.config.spring.context.annotation.DubboConfigConfigurationSelector();
        int i1 = dubboConfigConfigurationSelector0.getOrder();
        int i2 = dubboConfigConfigurationSelector0.getOrder();
        int i3 = dubboConfigConfigurationSelector0.getOrder();
        int i4 = dubboConfigConfigurationSelector0.getOrder();
        org.springframework.core.type.AnnotationMetadata annotationMetadata5 = null;
        try {
            java.lang.String[] str_array6 = dubboConfigConfigurationSelector0.selectImports(annotationMetadata5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i1 == (-2147483648));
        org.junit.Assert.assertTrue(i2 == (-2147483648));
        org.junit.Assert.assertTrue(i3 == (-2147483648));
        org.junit.Assert.assertTrue(i4 == (-2147483648));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("");
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal("");
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.String> map_str_str13 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setParameters(map_str_str13);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        com.alibaba.dubbo.config.RegistryConfig registryConfig11 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig11);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken("");
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) (-2147483648));
        java.lang.String str19 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor14 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj17 = referenceAnnotationBeanPostProcessor14.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service18 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor19 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service18);
        servicebean_beanDefinitionRegistryPostProcessor19.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig22 = null;
        servicebean_beanDefinitionRegistryPostProcessor19.setProtocol(protocolConfig22);
        servicebean_beanDefinitionRegistryPostProcessor19.setToken((java.lang.Boolean) true);
        java.lang.Object obj27 = referenceAnnotationBeanPostProcessor14.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor19, "");
        com.alibaba.dubbo.config.spring.extension.SpringExtensionFactory springExtensionFactory28 = new com.alibaba.dubbo.config.spring.extension.SpringExtensionFactory();
        boolean b30 = referenceAnnotationBeanPostProcessor14.postProcessAfterInstantiation((java.lang.Object) springExtensionFactory28, "referenceAnnotationBeanPostProcessor");
        boolean b32 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) referenceAnnotationBeanPostProcessor14, "null");
        java.lang.ClassLoader classLoader33 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader33);
        int i35 = referenceAnnotationBeanPostProcessor0.getOrder();
        referenceAnnotationBeanPostProcessor0.destroy();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0d + "'", obj17.equals(100.0d));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(i35 == 2147483647);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        servicebean_beanDefinitionRegistryPostProcessor1.setConnections((java.lang.Integer) (-1));
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(list_methodConfig6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory1 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory1);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory3 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory3);
        java.lang.String str5 = annotationBean0.getPackage();
        java.lang.String str6 = annotationBean0.getPackage();
        annotationBean0.setPackage("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        boolean b3 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) (byte) 100, "hi!");
        int i4 = referenceAnnotationBeanPostProcessor0.getOrder();
        com.alibaba.dubbo.config.annotation.Service service5 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor6 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service5);
        servicebean_beanDefinitionRegistryPostProcessor6.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor6.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL11 = servicebean_beanDefinitionRegistryPostProcessor6.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor6.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig14 = servicebean_beanDefinitionRegistryPostProcessor6.getRegistries();
        java.lang.Object obj16 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) list_registryConfig14, "null");
        int i17 = referenceAnnotationBeanPostProcessor0.getOrder();
        org.springframework.beans.PropertyValues propertyValues18 = null;
        java.beans.PropertyDescriptor[] propertyDescriptor_array19 = new java.beans.PropertyDescriptor[] {};
        com.alibaba.dubbo.config.annotation.Service service20 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor21 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service20);
        servicebean_beanDefinitionRegistryPostProcessor21.setCallbacks((java.lang.Integer) 1);
        java.lang.String str24 = servicebean_beanDefinitionRegistryPostProcessor21.getId();
        java.lang.String str25 = servicebean_beanDefinitionRegistryPostProcessor21.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor21.setStub((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor21.setRegister((java.lang.Boolean) true);
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig30 = null;
        servicebean_beanDefinitionRegistryPostProcessor21.setApplication(applicationConfig30);
        org.springframework.beans.PropertyValues propertyValues33 = referenceAnnotationBeanPostProcessor0.postProcessPropertyValues(propertyValues18, propertyDescriptor_array19, (java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor21, "");
        int i34 = referenceAnnotationBeanPostProcessor0.getOrder();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(list_registryConfig14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 2147483647);
        org.junit.Assert.assertNotNull(propertyDescriptor_array19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null" + "'", str25.equals("null"));
        org.junit.Assert.assertNull(propertyValues33);
        org.junit.Assert.assertTrue(i34 == 2147483647);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig8);
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        servicebean_beanDefinitionRegistryPostProcessor1.setMock("referenceAnnotationBeanPostProcessor");
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) (-1));
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        java.lang.Boolean b17 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig18 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(b17);
        org.junit.Assert.assertNull(list_methodConfig18);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("");
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig15 = servicebean_beanDefinitionRegistryPostProcessor1.getMonitor();
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) 1);
        java.lang.Integer i18 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) 0);
        servicebean_beanDefinitionRegistryPostProcessor1.setMock("null");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(monitorConfig15);
        org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1 + "'", i18.equals(1));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
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
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getDocument();
        com.alibaba.dubbo.config.ProviderConfig providerConfig16 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(providerConfig16);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) true);
        try {
            referencebean_dubboConfigBindingsRegistrar1.setStub("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        annotationBean0.setPackage("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory5 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory5);
        com.alibaba.dubbo.config.annotation.Service service7 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor8 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service7);
        servicebean_beanDefinitionRegistryPostProcessor8.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor8.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL13 = servicebean_beanDefinitionRegistryPostProcessor8.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor8.setMerger("");
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor8.getInterface();
        servicebean_beanDefinitionRegistryPostProcessor8.setCluster("");
        com.alibaba.dubbo.config.MonitorConfig monitorConfig19 = servicebean_beanDefinitionRegistryPostProcessor8.getMonitor();
        servicebean_beanDefinitionRegistryPostProcessor8.setOnconnect("hi!");
        java.lang.String str22 = servicebean_beanDefinitionRegistryPostProcessor8.getCache();
        try {
            java.lang.Object obj24 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) str22, "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNull(monitorConfig19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getVersion();
        java.lang.Boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str10 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setLocal("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(b9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig7 = null;
        referencebean_dubboConfigBindingsRegistrar1.setModule(moduleConfig7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        try {
            referencebean_dubboConfigBindingsRegistrar1.setApplicationContext(applicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setProxy("");
        boolean b8 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        com.alibaba.dubbo.config.ProviderConfig providerConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig9);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
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
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getLocal();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor14 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setFilter("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("hi!");
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL10 = servicebean_beanDefinitionRegistryPostProcessor1.toUrls();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        org.junit.Assert.assertNotNull(list_uRL10);
        org.junit.Assert.assertNull(list_methodConfig11);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        servicebean_beanDefinitionRegistryPostProcessor5.setDelay((java.lang.Integer) 10);
        servicebean_beanDefinitionRegistryPostProcessor5.setWarmup((java.lang.Integer) 10);
        java.lang.String str18 = servicebean_beanDefinitionRegistryPostProcessor5.getPath();
        java.lang.String str19 = servicebean_beanDefinitionRegistryPostProcessor5.getVersion();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL20 = servicebean_beanDefinitionRegistryPostProcessor5.getExportedUrls();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list_uRL20);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        referencebean_dubboConfigBindingsRegistrar1.setMock((java.lang.Boolean) true);
        com.alibaba.dubbo.config.RegistryConfig registryConfig11 = null;
        referencebean_dubboConfigBindingsRegistrar1.setRegistry(registryConfig11);
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        org.junit.Assert.assertNull(b6);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
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
        boolean b17 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        java.lang.String str18 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.Boolean b19 = referencebean_dubboConfigBindingsRegistrar1.isAsync();
        java.lang.Boolean b20 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig23 = referencebean_dubboConfigBindingsRegistrar1.getConsumer();
        java.lang.String str24 = referencebean_dubboConfigBindingsRegistrar1.getOwner();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(b19);
        org.junit.Assert.assertNull(b20);
        org.junit.Assert.assertNull(consumerConfig23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory2 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory2);
        java.lang.String str4 = annotationBean0.getPackage();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory5 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory5);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL9 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) 0);
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getOndisconnect();
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.Boolean b14 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.Boolean b15 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(b14);
        org.junit.Assert.assertNull(b15);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrls();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_uRL6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        java.lang.String str6 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getOwner();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getCache();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig12 = servicebean_beanDefinitionRegistryPostProcessor1.getModule();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(moduleConfig12);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
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
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig13 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        try {
            java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig14 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(list_registryConfig13);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        java.util.Map<java.lang.String, java.lang.String> map_str_str12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setParameters(map_str_str12);
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) (-2147483648));
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getGroup();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        servicebean_beanDefinitionRegistryPostProcessor5.destroy();
        servicebean_beanDefinitionRegistryPostProcessor5.setConnections((java.lang.Integer) 10);
        try {
            servicebean_beanDefinitionRegistryPostProcessor5.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL10 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        com.alibaba.dubbo.config.ProviderConfig providerConfig11 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig11);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNotNull(list_uRL10);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        java.lang.Class<?> cls11 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getOwner();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(cls11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.setStub((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) true);
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig10 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig10);
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub((java.lang.Boolean) true);
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig16 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocol();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(protocolConfig16);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
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
        com.alibaba.dubbo.config.ProviderConfig providerConfig13 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig13);
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) 100);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setToken("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        servicebean_beanDefinitionRegistryPostProcessor1.setCluster("");
        servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL8 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        org.junit.Assert.assertNotNull(list_uRL8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.Integer i8 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertNull(i8);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) false);
        boolean b15 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setProtocol("hi!");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("referenceAnnotationBeanPostProcessor");
        referencebean_dubboConfigBindingsRegistrar1.setAsync((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" stub=\"\" validation=\"hi!\" />");
        java.lang.String str16 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("");
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setVersion("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" stub=\"\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(i10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        servicebean_beanDefinitionRegistryPostProcessor5.destroy();
        servicebean_beanDefinitionRegistryPostProcessor5.setConnections((java.lang.Integer) 10);
        servicebean_beanDefinitionRegistryPostProcessor5.setWeight((java.lang.Integer) 100);
        servicebean_beanDefinitionRegistryPostProcessor5.unexport();
        try {
            servicebean_beanDefinitionRegistryPostProcessor5.setProxy("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("");
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) true);
        boolean b14 = servicebean_beanDefinitionRegistryPostProcessor1.isExported();
        java.lang.Integer i15 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(i15);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        java.lang.Integer i9 = referencebean_dubboConfigBindingsRegistrar1.getCallbacks();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL10 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.Integer i11 = referencebean_dubboConfigBindingsRegistrar1.getActives();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getProxy();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(i9);
        org.junit.Assert.assertNotNull(list_uRL10);
        org.junit.Assert.assertNull(i11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setTimeout((java.lang.Integer) 0);
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getCache();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        servicebean_beanDefinitionRegistryPostProcessor1.export();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setOwner("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" stub=\"\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getUrl();
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("null");
        java.lang.Class<?> cls15 = referencebean_dubboConfigBindingsRegistrar1.getInterfaceClass();
        referencebean_dubboConfigBindingsRegistrar1.setInjvm((java.lang.Boolean) true);
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "referenceAnnotationBeanPostProcessor" + "'", str12.equals("referenceAnnotationBeanPostProcessor"));
        org.junit.Assert.assertNull(cls15);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        java.lang.Boolean b18 = servicebean_beanDefinitionRegistryPostProcessor1.isDeprecated();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(b18);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("");
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig15 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig15);
        java.lang.Integer i17 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.Integer i18 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-2147483648) + "'", i17.equals((-2147483648)));
        org.junit.Assert.assertNull(i18);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.context.ResourceLoaderAware> servicebean_resourceLoaderAware0 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.context.ResourceLoaderAware>();
        java.lang.String str1 = servicebean_resourceLoaderAware0.getValidation();
        try {
            servicebean_resourceLoaderAware0.setVersion("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        org.springframework.context.event.ContextRefreshedEvent contextRefreshedEvent6 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.onApplicationEvent(contextRefreshedEvent6);
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocol();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(protocolConfig8);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        com.alibaba.dubbo.config.annotation.Service service2 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor3 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service2);
        java.lang.Integer i4 = servicebean_beanDefinitionRegistryPostProcessor3.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor3.setDynamic((java.lang.Boolean) false);
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor3.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL8 = servicebean_beanDefinitionRegistryPostProcessor3.toUrls();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor3.getLoadbalance();
        java.lang.Object obj11 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor3, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        com.alibaba.dubbo.config.annotation.Service service12 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor13 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service12);
        servicebean_beanDefinitionRegistryPostProcessor13.setExport((java.lang.Boolean) false);
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor13.getLoadbalance();
        java.lang.Integer i17 = servicebean_beanDefinitionRegistryPostProcessor13.getConnections();
        java.lang.Integer i18 = servicebean_beanDefinitionRegistryPostProcessor13.getTimeout();
        java.lang.String str19 = servicebean_beanDefinitionRegistryPostProcessor13.getListener();
        servicebean_beanDefinitionRegistryPostProcessor13.export();
        java.lang.Object obj22 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor13, "null");
        com.alibaba.dubbo.config.annotation.Service service23 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor24 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service23);
        servicebean_beanDefinitionRegistryPostProcessor24.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor24.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL29 = servicebean_beanDefinitionRegistryPostProcessor24.toUrl();
        java.lang.String str30 = servicebean_beanDefinitionRegistryPostProcessor24.getPath();
        java.lang.String str31 = servicebean_beanDefinitionRegistryPostProcessor24.getProxy();
        servicebean_beanDefinitionRegistryPostProcessor24.setAccesslog((java.lang.Boolean) false);
        java.lang.Object obj35 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor24, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        java.lang.String str36 = annotationBean0.getPackage();
        org.junit.Assert.assertNull(i4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list_uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNull(i18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setParameters(map_str_str8);
        servicebean_beanDefinitionRegistryPostProcessor5.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor5.setMerger("");
        java.lang.Object obj14 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) "", "");
        java.lang.ClassLoader classLoader15 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader15);
        org.springframework.beans.PropertyValues propertyValues17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = null;
        java.beans.PropertyDescriptor[] propertyDescriptor_array19 = new java.beans.PropertyDescriptor[] { propertyDescriptor18 };
        com.alibaba.dubbo.config.annotation.Service service20 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor21 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service20);
        servicebean_beanDefinitionRegistryPostProcessor21.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor21.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL26 = servicebean_beanDefinitionRegistryPostProcessor21.toUrl();
        java.lang.String str27 = servicebean_beanDefinitionRegistryPostProcessor21.getPath();
        java.lang.String str28 = servicebean_beanDefinitionRegistryPostProcessor21.getProxy();
        java.lang.Integer i29 = servicebean_beanDefinitionRegistryPostProcessor21.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig30 = null;
        servicebean_beanDefinitionRegistryPostProcessor21.setProtocol(protocolConfig30);
        java.lang.String str32 = servicebean_beanDefinitionRegistryPostProcessor21.getOnconnect();
        servicebean_beanDefinitionRegistryPostProcessor21.setTimeout((java.lang.Integer) (-2147483648));
        org.springframework.beans.PropertyValues propertyValues36 = referenceAnnotationBeanPostProcessor0.postProcessPropertyValues(propertyValues17, propertyDescriptor_array19, (java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor21, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.config.annotation.Reference reference37 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar38 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference37);
        referencebean_dubboConfigBindingsRegistrar38.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig41 = referencebean_dubboConfigBindingsRegistrar38.getMethods();
        java.lang.Object obj43 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) referencebean_dubboConfigBindingsRegistrar38, "null");
        java.lang.String str44 = referencebean_dubboConfigBindingsRegistrar38.getClient();
        referencebean_dubboConfigBindingsRegistrar38.afterPropertiesSet();
        try {
            referencebean_dubboConfigBindingsRegistrar38.setProxy("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertNotNull(propertyDescriptor_array19);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483648) + "'", i29.equals((-2147483648)));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(propertyValues36);
        org.junit.Assert.assertNull(list_methodConfig41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.Boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isInit();
        referencebean_dubboConfigBindingsRegistrar1.setProtocol("");
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        referencebean_dubboConfigBindingsRegistrar1.setInjvm((java.lang.Boolean) false);
        java.lang.String str15 = referencebean_dubboConfigBindingsRegistrar1.getMock();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setGroup("");
        com.alibaba.dubbo.config.RegistryConfig registryConfig14 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig14);
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor("");
        java.lang.String str18 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setParameters(map_str_str8);
        servicebean_beanDefinitionRegistryPostProcessor5.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor5.setMerger("");
        java.lang.Object obj14 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) "", "");
        int i15 = referenceAnnotationBeanPostProcessor0.getOrder();
        org.springframework.context.ApplicationContext applicationContext16 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext16);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor18 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        boolean b21 = referenceAnnotationBeanPostProcessor18.postProcessAfterInstantiation((java.lang.Object) (byte) 100, "hi!");
        int i22 = referenceAnnotationBeanPostProcessor18.getOrder();
        com.alibaba.dubbo.config.annotation.Service service23 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor24 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service23);
        servicebean_beanDefinitionRegistryPostProcessor24.setExport((java.lang.Boolean) false);
        java.lang.String str27 = servicebean_beanDefinitionRegistryPostProcessor24.getLoadbalance();
        java.lang.Integer i28 = servicebean_beanDefinitionRegistryPostProcessor24.getConnections();
        java.lang.String str29 = servicebean_beanDefinitionRegistryPostProcessor24.getOnconnect();
        java.lang.Object obj31 = referenceAnnotationBeanPostProcessor18.getEarlyBeanReference((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor24, "referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.annotation.Service service32 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor33 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service32);
        servicebean_beanDefinitionRegistryPostProcessor33.setExport((java.lang.Boolean) false);
        java.lang.String str36 = servicebean_beanDefinitionRegistryPostProcessor33.getLoadbalance();
        java.lang.Integer i37 = servicebean_beanDefinitionRegistryPostProcessor33.getConnections();
        java.lang.String str38 = servicebean_beanDefinitionRegistryPostProcessor33.getOnconnect();
        java.lang.Object obj40 = referenceAnnotationBeanPostProcessor18.postProcessAfterInitialization((java.lang.Object) str38, "referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.annotation.Service service41 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor42 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service41);
        servicebean_beanDefinitionRegistryPostProcessor42.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor42.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL47 = servicebean_beanDefinitionRegistryPostProcessor42.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor42.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig50 = null;
        servicebean_beanDefinitionRegistryPostProcessor42.setApplication(applicationConfig50);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig52 = servicebean_beanDefinitionRegistryPostProcessor42.getRegistries();
        java.lang.Integer i53 = servicebean_beanDefinitionRegistryPostProcessor42.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor42.setWeight((java.lang.Integer) 100);
        java.lang.String str56 = servicebean_beanDefinitionRegistryPostProcessor42.getPath();
        java.lang.Object obj58 = referenceAnnotationBeanPostProcessor18.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor42, "referenceAnnotationBeanPostProcessor");
        java.lang.Object obj60 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor42, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        java.lang.String str61 = servicebean_beanDefinitionRegistryPostProcessor42.getMock();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(i15 == 2147483647);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 2147483647);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(i28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(i37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(uRL47);
        org.junit.Assert.assertNull(list_registryConfig52);
        org.junit.Assert.assertNull(i53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getReconnect();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.destroy();
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig14 = referencebean_dubboConfigBindingsRegistrar1.getRegistries();
        java.lang.String str15 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig16 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str9.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
        org.junit.Assert.assertNull(list_registryConfig14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(list_methodConfig16);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLayer("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.lang.String str10 = referencebean_dubboConfigBindingsRegistrar1.getMerger();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.Integer i12 = referencebean_dubboConfigBindingsRegistrar1.getRetries();
        referencebean_dubboConfigBindingsRegistrar1.setValidation("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setGroup("null");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i12);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrls();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig8 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) 10);
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(list_uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list_methodConfig8);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i10);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        servicebean_beanDefinitionRegistryPostProcessor5.setDelay((java.lang.Integer) 10);
        servicebean_beanDefinitionRegistryPostProcessor5.setWarmup((java.lang.Integer) 10);
        java.lang.Boolean b18 = servicebean_beanDefinitionRegistryPostProcessor5.getSent();
        try {
            servicebean_beanDefinitionRegistryPostProcessor5.setCluster("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(b18);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.Boolean b14 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) true);
        boolean b17 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(b14);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        annotationBean0.setPackage("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory5 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory5);
        annotationBean0.destroy();
        java.lang.Object obj8 = null;
        try {
            java.lang.Object obj10 = annotationBean0.postProcessBeforeInitialization(obj8, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 100);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        java.lang.Boolean b13 = servicebean_beanDefinitionRegistryPostProcessor1.getExport();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(b13);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.Boolean b14 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) true);
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("referenceAnnotationBeanPostProcessor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(b14);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setParameters(map_str_str8);
        servicebean_beanDefinitionRegistryPostProcessor5.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor5.setMerger("");
        java.lang.Object obj14 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) "", "");
        java.lang.ClassLoader classLoader15 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader15);
        org.springframework.beans.PropertyValues propertyValues17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = null;
        java.beans.PropertyDescriptor[] propertyDescriptor_array19 = new java.beans.PropertyDescriptor[] { propertyDescriptor18 };
        com.alibaba.dubbo.config.annotation.Service service20 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor21 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service20);
        servicebean_beanDefinitionRegistryPostProcessor21.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor21.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL26 = servicebean_beanDefinitionRegistryPostProcessor21.toUrl();
        java.lang.String str27 = servicebean_beanDefinitionRegistryPostProcessor21.getPath();
        java.lang.String str28 = servicebean_beanDefinitionRegistryPostProcessor21.getProxy();
        java.lang.Integer i29 = servicebean_beanDefinitionRegistryPostProcessor21.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig30 = null;
        servicebean_beanDefinitionRegistryPostProcessor21.setProtocol(protocolConfig30);
        java.lang.String str32 = servicebean_beanDefinitionRegistryPostProcessor21.getOnconnect();
        servicebean_beanDefinitionRegistryPostProcessor21.setTimeout((java.lang.Integer) (-2147483648));
        org.springframework.beans.PropertyValues propertyValues36 = referenceAnnotationBeanPostProcessor0.postProcessPropertyValues(propertyValues17, propertyDescriptor_array19, (java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor21, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.config.annotation.Reference reference37 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar38 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference37);
        referencebean_dubboConfigBindingsRegistrar38.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig41 = referencebean_dubboConfigBindingsRegistrar38.getMethods();
        java.lang.Object obj43 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) referencebean_dubboConfigBindingsRegistrar38, "null");
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor44 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>();
        boolean b46 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor44, "hi!");
        com.alibaba.dubbo.config.annotation.Service service47 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor48 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service47);
        servicebean_beanDefinitionRegistryPostProcessor48.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor51 = servicebean_beanDefinitionRegistryPostProcessor48.getRef();
        com.alibaba.dubbo.config.ProviderConfig providerConfig52 = null;
        servicebean_beanDefinitionRegistryPostProcessor48.setProvider(providerConfig52);
        servicebean_beanDefinitionRegistryPostProcessor48.setCallbacks((java.lang.Integer) 100);
        java.lang.Object obj57 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) 100, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        int i58 = referenceAnnotationBeanPostProcessor0.getOrder();
        com.alibaba.dubbo.config.annotation.Service service59 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor60 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service59);
        servicebean_beanDefinitionRegistryPostProcessor60.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor60.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL65 = servicebean_beanDefinitionRegistryPostProcessor60.toUrl();
        java.lang.String str66 = servicebean_beanDefinitionRegistryPostProcessor60.getPath();
        java.lang.String str67 = servicebean_beanDefinitionRegistryPostProcessor60.getProxy();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig68 = servicebean_beanDefinitionRegistryPostProcessor60.getProviders();
        servicebean_beanDefinitionRegistryPostProcessor60.setRetries((java.lang.Integer) 1);
        java.lang.String str71 = servicebean_beanDefinitionRegistryPostProcessor60.getToken();
        java.lang.String str72 = servicebean_beanDefinitionRegistryPostProcessor60.getUniqueServiceName();
        java.lang.Class<?> cls73 = servicebean_beanDefinitionRegistryPostProcessor60.getInterfaceClass();
        java.lang.Boolean b74 = servicebean_beanDefinitionRegistryPostProcessor60.isRegister();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig75 = null;
        servicebean_beanDefinitionRegistryPostProcessor60.setProtocol(protocolConfig75);
        java.lang.Boolean b77 = servicebean_beanDefinitionRegistryPostProcessor60.getSent();
        java.lang.Object obj79 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor60, "null");
        com.alibaba.dubbo.config.RegistryConfig registryConfig80 = null;
        servicebean_beanDefinitionRegistryPostProcessor60.setRegistry(registryConfig80);
        servicebean_beanDefinitionRegistryPostProcessor60.setDelay((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertNotNull(propertyDescriptor_array19);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483648) + "'", i29.equals((-2147483648)));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(propertyValues36);
        org.junit.Assert.assertNull(list_methodConfig41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor51);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100 + "'", obj57.equals(100));
        org.junit.Assert.assertTrue(i58 == 2147483647);
        org.junit.Assert.assertNull(uRL65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(list_providerConfig68);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        org.junit.Assert.assertNull(cls73);
        org.junit.Assert.assertNull(b74);
        org.junit.Assert.assertNull(b77);
        org.junit.Assert.assertNotNull(obj79);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
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
        java.lang.Class<?> cls13 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setPath("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setGroup("");
        com.alibaba.dubbo.config.RegistryConfig registryConfig14 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig14);
        com.alibaba.dubbo.config.ProviderConfig providerConfig16 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig16);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test399");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setVersion("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 100);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setStub("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test401");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        com.alibaba.dubbo.config.annotation.Service service2 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor3 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service2);
        java.lang.Integer i4 = servicebean_beanDefinitionRegistryPostProcessor3.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor3.setDynamic((java.lang.Boolean) false);
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor3.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL8 = servicebean_beanDefinitionRegistryPostProcessor3.toUrls();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor3.getLoadbalance();
        java.lang.Object obj11 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor3, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor3.getOndisconnect();
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor3.getVersion();
        java.lang.Boolean b14 = servicebean_beanDefinitionRegistryPostProcessor3.isDeprecated();
        org.junit.Assert.assertNull(i4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list_uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(b14);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test402");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("");
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("referenceAnnotationBeanPostProcessor");
        boolean b20 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig21 = servicebean_beanDefinitionRegistryPostProcessor1.getApplication();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(applicationConfig21);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test403");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        boolean b3 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) (byte) 100, "hi!");
        int i4 = referenceAnnotationBeanPostProcessor0.getOrder();
        com.alibaba.dubbo.config.annotation.Service service5 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor6 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service5);
        servicebean_beanDefinitionRegistryPostProcessor6.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor6.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL11 = servicebean_beanDefinitionRegistryPostProcessor6.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor6.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig14 = servicebean_beanDefinitionRegistryPostProcessor6.getRegistries();
        java.lang.Object obj16 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) list_registryConfig14, "null");
        com.alibaba.dubbo.config.annotation.Service service17 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor18 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service17);
        servicebean_beanDefinitionRegistryPostProcessor18.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor18.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL23 = servicebean_beanDefinitionRegistryPostProcessor18.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor18.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig26 = servicebean_beanDefinitionRegistryPostProcessor18.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor18.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor18.setAccesslog((java.lang.Boolean) true);
        java.lang.String str31 = servicebean_beanDefinitionRegistryPostProcessor18.getStub();
        java.lang.Object obj33 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor18, "null");
        java.lang.ClassLoader classLoader34 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader34);
        com.alibaba.dubbo.config.annotation.Service service36 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor37 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service36);
        servicebean_beanDefinitionRegistryPostProcessor37.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor40 = servicebean_beanDefinitionRegistryPostProcessor37.getRef();
        com.alibaba.dubbo.config.ProviderConfig providerConfig41 = null;
        servicebean_beanDefinitionRegistryPostProcessor37.setProvider(providerConfig41);
        servicebean_beanDefinitionRegistryPostProcessor37.setCallbacks((java.lang.Integer) 100);
        java.lang.String str45 = servicebean_beanDefinitionRegistryPostProcessor37.getListener();
        java.lang.Object obj47 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor37, "");
        com.alibaba.dubbo.config.annotation.Service service48 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor49 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service48);
        servicebean_beanDefinitionRegistryPostProcessor49.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor52 = servicebean_beanDefinitionRegistryPostProcessor49.getRef();
        com.alibaba.dubbo.config.ProviderConfig providerConfig53 = null;
        servicebean_beanDefinitionRegistryPostProcessor49.setProvider(providerConfig53);
        java.lang.Object obj56 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor49, "<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(list_registryConfig14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(list_registryConfig26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor40);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor52);
        org.junit.Assert.assertNotNull(obj56);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        com.alibaba.dubbo.config.annotation.Service service2 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor3 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service2);
        java.lang.Integer i4 = servicebean_beanDefinitionRegistryPostProcessor3.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor3.setDynamic((java.lang.Boolean) false);
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor3.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL8 = servicebean_beanDefinitionRegistryPostProcessor3.toUrls();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor3.getLoadbalance();
        java.lang.Object obj11 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor3, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor3.getOndisconnect();
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor3.getVersion();
        try {
            servicebean_beanDefinitionRegistryPostProcessor3.setMock("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(i4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list_uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.lang.Integer i11 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getFilter();
        java.lang.Integer i14 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(i11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />" + "'", str12.equals("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />"));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(i14);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor7 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory8 = null;
        serviceAnnotationBeanPostProcessor7.postProcessBeanFactory(configurableListableBeanFactory8);
        java.lang.ClassLoader classLoader10 = null;
        serviceAnnotationBeanPostProcessor7.setBeanClassLoader(classLoader10);
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig14 = servicebean_beanDefinitionRegistryPostProcessor5.getRegistries();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(list_registryConfig14);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        java.lang.Integer i14 = servicebean_beanDefinitionRegistryPostProcessor5.getWeight();
        servicebean_beanDefinitionRegistryPostProcessor5.unexport();
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor5.getGroup();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
        java.lang.String[] str_array0 = new java.lang.String[] {};
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor1 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array0);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor2 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array0);
        org.springframework.core.env.Environment environment3 = null;
        serviceAnnotationBeanPostProcessor2.setEnvironment(environment3);
        java.lang.ClassLoader classLoader5 = null;
        serviceAnnotationBeanPostProcessor2.setBeanClassLoader(classLoader5);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry7 = null;
        try {
            serviceAnnotationBeanPostProcessor2.postProcessBeanDefinitionRegistry(beanDefinitionRegistry7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(str_array0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
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
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig17 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        java.lang.Boolean b18 = servicebean_beanDefinitionRegistryPostProcessor1.getExport();
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-2147483648) + "'", i16.equals((-2147483648)));
        org.junit.Assert.assertNull(list_methodConfig17);
        org.junit.Assert.assertNull(b18);
        org.junit.Assert.assertNull(i19);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test412");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test413");
        java.lang.String[] str_array10 = new java.lang.String[] { "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />", "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />", "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />", "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />", "null", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" stub=\"\" validation=\"hi!\" />", "", "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />", "null" };
        java.util.ArrayList<java.lang.String> arraylist_str11 = new java.util.ArrayList<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str11, str_array10);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor13 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) arraylist_str11);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
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
        java.lang.String str22 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(i16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        org.springframework.context.event.ContextRefreshedEvent contextRefreshedEvent6 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.onApplicationEvent(contextRefreshedEvent6);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getVersion();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLoadbalance("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" stub=\"\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("");
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getOndisconnect();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test417");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        com.alibaba.dubbo.config.annotation.Service service1 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor2 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service1);
        servicebean_beanDefinitionRegistryPostProcessor2.setCallbacks((java.lang.Integer) 1);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor2.getId();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor2.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor2.destroy();
        servicebean_beanDefinitionRegistryPostProcessor2.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor2.setRetries((java.lang.Integer) 100);
        java.lang.Object obj13 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor2, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.config.annotation.Service service14 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor15 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service14);
        servicebean_beanDefinitionRegistryPostProcessor15.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str18 = null;
        servicebean_beanDefinitionRegistryPostProcessor15.setParameters(map_str_str18);
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig20 = null;
        servicebean_beanDefinitionRegistryPostProcessor15.setProviders(list_providerConfig20);
        servicebean_beanDefinitionRegistryPostProcessor15.setTimeout((java.lang.Integer) 10);
        java.lang.Object obj25 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor15, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory26 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory26);
        com.alibaba.dubbo.config.annotation.Service service28 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor29 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service28);
        servicebean_beanDefinitionRegistryPostProcessor29.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor29.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL34 = servicebean_beanDefinitionRegistryPostProcessor29.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor29.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig37 = null;
        servicebean_beanDefinitionRegistryPostProcessor29.setApplication(applicationConfig37);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig39 = servicebean_beanDefinitionRegistryPostProcessor29.getRegistries();
        java.lang.Integer i40 = servicebean_beanDefinitionRegistryPostProcessor29.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor29.setWeight((java.lang.Integer) 100);
        java.lang.String str43 = servicebean_beanDefinitionRegistryPostProcessor29.getPath();
        java.lang.String str44 = servicebean_beanDefinitionRegistryPostProcessor29.getGeneric();
        java.lang.Object obj46 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor29, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNull(list_registryConfig39);
        org.junit.Assert.assertNull(i40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test418");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("referenceAnnotationBeanPostProcessor");
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("null");
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getCache();
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test419");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.Integer i12 = referencebean_dubboConfigBindingsRegistrar1.getRetries();
        referencebean_dubboConfigBindingsRegistrar1.setValidation("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setUrl("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.common.URL uRL17 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setVersion("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test420");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        com.alibaba.dubbo.config.annotation.Service service11 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        servicebean_beanDefinitionRegistryPostProcessor1.setId("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(service11);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test421");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        servicebean_beanDefinitionRegistryPostProcessor1.setFilter("");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLayer("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
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
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.Class<?> cls16 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        org.springframework.context.ApplicationContext applicationContext17 = null;
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setApplicationContext(applicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(cls16);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getClient();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig11 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_methodConfig11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
        com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport> referencebean_namespaceHandlerSupport0 = new com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport>();
        referencebean_namespaceHandlerSupport0.setInit((java.lang.Boolean) false);
        referencebean_namespaceHandlerSupport0.setMock((java.lang.Boolean) true);
        referencebean_namespaceHandlerSupport0.setVersion("");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test425");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 100);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor5 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.lang.Boolean b6 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setPath("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor5);
        org.junit.Assert.assertNull(b6);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig7 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig7);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setMock("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test427");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL9 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) 0);
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        java.lang.String str6 = referencebean_dubboConfigBindingsRegistrar1.getClient();
        java.lang.Boolean b7 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(b7);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
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
        com.alibaba.dubbo.config.annotation.Service service14 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor15 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service14);
        servicebean_beanDefinitionRegistryPostProcessor15.setExport((java.lang.Boolean) false);
        java.lang.String str18 = servicebean_beanDefinitionRegistryPostProcessor15.getLoadbalance();
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor15.getConnections();
        java.lang.String str20 = servicebean_beanDefinitionRegistryPostProcessor15.getOnconnect();
        java.lang.Object obj22 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) str20, "referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.annotation.Service service23 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor24 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service23);
        servicebean_beanDefinitionRegistryPostProcessor24.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor24.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL29 = servicebean_beanDefinitionRegistryPostProcessor24.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor24.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig32 = null;
        servicebean_beanDefinitionRegistryPostProcessor24.setApplication(applicationConfig32);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig34 = servicebean_beanDefinitionRegistryPostProcessor24.getRegistries();
        java.lang.Integer i35 = servicebean_beanDefinitionRegistryPostProcessor24.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor24.setWeight((java.lang.Integer) 100);
        java.lang.String str38 = servicebean_beanDefinitionRegistryPostProcessor24.getPath();
        java.lang.Object obj40 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor24, "referenceAnnotationBeanPostProcessor");
        java.lang.String str41 = servicebean_beanDefinitionRegistryPostProcessor24.getOnconnect();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig42 = servicebean_beanDefinitionRegistryPostProcessor24.getProtocol();
        java.lang.Integer i43 = servicebean_beanDefinitionRegistryPostProcessor24.getCallbacks();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(i19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(list_registryConfig34);
        org.junit.Assert.assertNull(i35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(protocolConfig42);
        org.junit.Assert.assertNull(i43);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test430");
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
        boolean b17 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL18 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.String str19 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.Integer i20 = referencebean_dubboConfigBindingsRegistrar1.getActives();
        java.lang.Boolean b21 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(list_uRL18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(i20);
        org.junit.Assert.assertTrue("'" + b21 + "' != '" + false + "'", b21.equals(false));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test431");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig8);
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        com.alibaba.dubbo.config.ProviderConfig[] providerConfig_array11 = new com.alibaba.dubbo.config.ProviderConfig[] {};
        java.util.ArrayList<com.alibaba.dubbo.config.ProviderConfig> arraylist_providerConfig12 = new java.util.ArrayList<com.alibaba.dubbo.config.ProviderConfig>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<com.alibaba.dubbo.config.ProviderConfig>) arraylist_providerConfig12, providerConfig_array11);
        servicebean_beanDefinitionRegistryPostProcessor1.setProviders((java.util.List<com.alibaba.dubbo.config.ProviderConfig>) arraylist_providerConfig12);
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.annotation.Service service19 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNotNull(providerConfig_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(service19);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        servicebean_beanDefinitionRegistryPostProcessor1.setMock((java.lang.Boolean) true);
        java.lang.Boolean b10 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        java.lang.Integer i11 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(i11);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getVersion();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getLocal();
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getGroup();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test434");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        com.alibaba.dubbo.config.annotation.Service service2 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor3 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service2);
        java.lang.Integer i4 = servicebean_beanDefinitionRegistryPostProcessor3.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor3.setDynamic((java.lang.Boolean) false);
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor3.getProxy();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL8 = servicebean_beanDefinitionRegistryPostProcessor3.toUrls();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor3.getLoadbalance();
        java.lang.Object obj11 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor3, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        com.alibaba.dubbo.config.annotation.Service service12 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor13 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service12);
        servicebean_beanDefinitionRegistryPostProcessor13.setExport((java.lang.Boolean) false);
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor13.getLoadbalance();
        java.lang.Integer i17 = servicebean_beanDefinitionRegistryPostProcessor13.getConnections();
        java.lang.Integer i18 = servicebean_beanDefinitionRegistryPostProcessor13.getTimeout();
        java.lang.String str19 = servicebean_beanDefinitionRegistryPostProcessor13.getListener();
        servicebean_beanDefinitionRegistryPostProcessor13.export();
        java.lang.Object obj22 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor13, "null");
        com.alibaba.dubbo.config.annotation.Service service23 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor24 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service23);
        servicebean_beanDefinitionRegistryPostProcessor24.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor24.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL29 = servicebean_beanDefinitionRegistryPostProcessor24.toUrl();
        java.lang.String str30 = servicebean_beanDefinitionRegistryPostProcessor24.getPath();
        java.lang.String str31 = servicebean_beanDefinitionRegistryPostProcessor24.getProxy();
        servicebean_beanDefinitionRegistryPostProcessor24.setAccesslog((java.lang.Boolean) false);
        java.lang.Object obj35 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor24, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig36 = servicebean_beanDefinitionRegistryPostProcessor24.getMethods();
        com.alibaba.dubbo.config.annotation.Service service37 = servicebean_beanDefinitionRegistryPostProcessor24.getService();
        org.junit.Assert.assertNull(i4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list_uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(i17);
        org.junit.Assert.assertNull(i18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(list_methodConfig36);
        org.junit.Assert.assertNull(service37);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test435");
        org.springframework.beans.PropertyValues propertyValues1 = null;
        try {
            com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor dubboConfigBindingBeanPostProcessor2 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" accesslog=\"true\" timeout=\"-2147483648\" async=\"true\" id=\"\" />", propertyValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        com.alibaba.dubbo.config.ProviderConfig providerConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig5);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 100);
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL10 = servicebean_beanDefinitionRegistryPostProcessor1.toUrls();
        servicebean_beanDefinitionRegistryPostProcessor1.setMock((java.lang.Boolean) false);
        com.alibaba.dubbo.config.RegistryConfig registryConfig13 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistry();
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getFilter();
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list_uRL10);
        org.junit.Assert.assertNull(registryConfig13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig10 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getFilter();
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list_registryConfig10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.Boolean b7 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal((java.lang.Boolean) true);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setVersion("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(b7);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test439");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setProxy("");
        com.alibaba.dubbo.config.RegistryConfig registryConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig8);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("");
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        com.alibaba.dubbo.config.RegistryConfig registryConfig13 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistry();
        java.lang.Integer i14 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(registryConfig13);
        org.junit.Assert.assertNull(i14);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test440");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        boolean b5 = servicebean_beanDefinitionRegistryPostProcessor1.isExported();
        servicebean_beanDefinitionRegistryPostProcessor1.setPath("");
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getVersion();
        referencebean_dubboConfigBindingsRegistrar1.setLocal((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) false);
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" stub=\"\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("referenceAnnotationBeanPostProcessor");
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("null");
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getCache();
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 100);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test443");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 100);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setOwner("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1 + "'", i12.equals(1));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test444");
        com.alibaba.dubbo.config.spring.ServiceBean<java.lang.Iterable<com.alibaba.dubbo.common.URL>> servicebean_iterable_uRL0 = new com.alibaba.dubbo.config.spring.ServiceBean<java.lang.Iterable<com.alibaba.dubbo.common.URL>>();
        java.lang.String str1 = servicebean_iterable_uRL0.getGroup();
        servicebean_iterable_uRL0.setTimeout((java.lang.Integer) 2147483647);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test445");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInit();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertNull(b6);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test446");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getOwner();
        java.lang.String str15 = referencebean_dubboConfigBindingsRegistrar1.getLocal();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test447");
        org.springframework.beans.PropertyValues propertyValues1 = null;
        try {
            com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor dubboConfigBindingBeanPostProcessor2 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />", propertyValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test448");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("null");
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = servicebean_beanDefinitionRegistryPostProcessor1.getParameters();
        java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor16 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array15);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory17 = null;
        serviceAnnotationBeanPostProcessor16.postProcessBeanFactory(configurableListableBeanFactory17);
        java.lang.ClassLoader classLoader19 = null;
        serviceAnnotationBeanPostProcessor16.setBeanClassLoader(classLoader19);
        org.springframework.core.io.ResourceLoader resourceLoader21 = null;
        serviceAnnotationBeanPostProcessor16.setResourceLoader(resourceLoader21);
        servicebean_beanDefinitionRegistryPostProcessor1.setRef((org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor) serviceAnnotationBeanPostProcessor16);
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) (-2147483648));
        java.lang.String str26 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(map_str_str9);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test449");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.lang.Class<?> cls10 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        java.lang.Class<?> cls11 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(cls10);
        org.junit.Assert.assertNull(cls11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />" + "'", str14.equals("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />"));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test450");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.export();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test451");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        servicebean_beanDefinitionRegistryPostProcessor1.export();
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" uniqueServiceName=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" token=\"true\" id=\"<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />\" />");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
        org.junit.Assert.assertNull(i9);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test452");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
        org.junit.Assert.assertNull(i9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test453");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getLayer();
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) 100);
        com.alibaba.dubbo.config.RegistryConfig registryConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistry();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(registryConfig11);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test454");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("");
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test455");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) false);
        java.lang.Boolean b11 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertTrue("'" + b11 + "' != '" + false + "'", b11.equals(false));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test456");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        boolean b3 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) (byte) 100, "hi!");
        int i4 = referenceAnnotationBeanPostProcessor0.getOrder();
        com.alibaba.dubbo.config.annotation.Service service5 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor6 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service5);
        servicebean_beanDefinitionRegistryPostProcessor6.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor6.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL11 = servicebean_beanDefinitionRegistryPostProcessor6.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor6.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig14 = servicebean_beanDefinitionRegistryPostProcessor6.getRegistries();
        java.lang.Object obj16 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) list_registryConfig14, "null");
        com.alibaba.dubbo.config.annotation.Reference reference17 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar18 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference17);
        referencebean_dubboConfigBindingsRegistrar18.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig21 = referencebean_dubboConfigBindingsRegistrar18.getMethods();
        referencebean_dubboConfigBindingsRegistrar18.setClient("");
        referencebean_dubboConfigBindingsRegistrar18.setVersion("");
        java.lang.String str26 = referencebean_dubboConfigBindingsRegistrar18.getListener();
        referencebean_dubboConfigBindingsRegistrar18.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.Boolean b29 = referencebean_dubboConfigBindingsRegistrar18.isGeneric();
        java.lang.String str30 = referencebean_dubboConfigBindingsRegistrar18.getUrl();
        java.lang.Object obj32 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) str30, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.config.annotation.Service service33 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor34 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service33);
        servicebean_beanDefinitionRegistryPostProcessor34.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor34.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL39 = servicebean_beanDefinitionRegistryPostProcessor34.toUrl();
        java.lang.String str40 = servicebean_beanDefinitionRegistryPostProcessor34.getPath();
        java.lang.String str41 = servicebean_beanDefinitionRegistryPostProcessor34.getProxy();
        java.lang.Class<?> cls42 = servicebean_beanDefinitionRegistryPostProcessor34.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor34.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor34.setOnconnect("");
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig47 = servicebean_beanDefinitionRegistryPostProcessor34.getProviders();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig48 = null;
        servicebean_beanDefinitionRegistryPostProcessor34.setMonitor(monitorConfig48);
        servicebean_beanDefinitionRegistryPostProcessor34.setConnections((java.lang.Integer) 10);
        java.lang.String str52 = servicebean_beanDefinitionRegistryPostProcessor34.getVersion();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig53 = servicebean_beanDefinitionRegistryPostProcessor34.getProviders();
        java.lang.Integer i54 = servicebean_beanDefinitionRegistryPostProcessor34.getWarmup();
        java.lang.Object obj56 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor34, "");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(list_registryConfig14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(list_methodConfig21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + b29 + "' != '" + false + "'", b29.equals(false));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "referenceAnnotationBeanPostProcessor" + "'", str30.equals("referenceAnnotationBeanPostProcessor"));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "referenceAnnotationBeanPostProcessor" + "'", obj32.equals("referenceAnnotationBeanPostProcessor"));
        org.junit.Assert.assertNull(uRL39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(cls42);
        org.junit.Assert.assertNull(list_providerConfig47);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(list_providerConfig53);
        org.junit.Assert.assertNull(i54);
        org.junit.Assert.assertNotNull(obj56);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test457");
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
        com.alibaba.dubbo.config.ProviderConfig providerConfig13 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setApplicationContext(applicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test458");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.export();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test459");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test460");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.config.BeanPostProcessor> referencebean_beanPostProcessor1 = new com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.config.BeanPostProcessor>(reference0);
        referencebean_beanPostProcessor1.setMock((java.lang.Boolean) false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test461");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        boolean b3 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) (byte) 100, "hi!");
        int i4 = referenceAnnotationBeanPostProcessor0.getOrder();
        com.alibaba.dubbo.config.annotation.Service service5 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor6 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service5);
        servicebean_beanDefinitionRegistryPostProcessor6.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor6.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL11 = servicebean_beanDefinitionRegistryPostProcessor6.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor6.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig14 = servicebean_beanDefinitionRegistryPostProcessor6.getRegistries();
        java.lang.Object obj16 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) list_registryConfig14, "null");
        int i17 = referenceAnnotationBeanPostProcessor0.getOrder();
        org.springframework.beans.PropertyValues propertyValues18 = null;
        java.beans.PropertyDescriptor[] propertyDescriptor_array19 = new java.beans.PropertyDescriptor[] {};
        com.alibaba.dubbo.config.annotation.Service service20 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor21 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service20);
        servicebean_beanDefinitionRegistryPostProcessor21.setCallbacks((java.lang.Integer) 1);
        java.lang.String str24 = servicebean_beanDefinitionRegistryPostProcessor21.getId();
        java.lang.String str25 = servicebean_beanDefinitionRegistryPostProcessor21.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor21.setStub((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor21.setRegister((java.lang.Boolean) true);
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig30 = null;
        servicebean_beanDefinitionRegistryPostProcessor21.setApplication(applicationConfig30);
        org.springframework.beans.PropertyValues propertyValues33 = referenceAnnotationBeanPostProcessor0.postProcessPropertyValues(propertyValues18, propertyDescriptor_array19, (java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor21, "");
        java.lang.String str34 = servicebean_beanDefinitionRegistryPostProcessor21.getGeneric();
        try {
            servicebean_beanDefinitionRegistryPostProcessor21.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(list_registryConfig14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 2147483647);
        org.junit.Assert.assertNotNull(propertyDescriptor_array19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null" + "'", str25.equals("null"));
        org.junit.Assert.assertNull(propertyValues33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test462");
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
        com.alibaba.dubbo.common.URL uRL18 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test463");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        java.lang.Boolean b13 = servicebean_beanDefinitionRegistryPostProcessor1.getSent();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig14 = servicebean_beanDefinitionRegistryPostProcessor1.getApplication();
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 10);
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig17 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(b13);
        org.junit.Assert.assertNull(applicationConfig14);
        org.junit.Assert.assertNull(list_providerConfig17);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test464");
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
        referencebean_dubboConfigBindingsRegistrar1.setProtocol("");
        java.lang.String str18 = referencebean_dubboConfigBindingsRegistrar1.getVersion();
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("");
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        java.lang.String str23 = referencebean_dubboConfigBindingsRegistrar1.getClient();
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar dubboConfigBindingsRegistrar24 = referencebean_dubboConfigBindingsRegistrar1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test465");
        com.alibaba.dubbo.config.spring.ServiceBean<com.alibaba.dubbo.config.AbstractReferenceConfig> servicebean_abstractReferenceConfig0 = new com.alibaba.dubbo.config.spring.ServiceBean<com.alibaba.dubbo.config.AbstractReferenceConfig>();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test466");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("referenceAnnotationBeanPostProcessor");
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.isInit();
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig11 = null;
        referencebean_dubboConfigBindingsRegistrar1.setConsumer(consumerConfig11);
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(b10);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test467");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.destroy();
        java.lang.String str10 = referencebean_dubboConfigBindingsRegistrar1.getProxy();
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test468");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("null");
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = servicebean_beanDefinitionRegistryPostProcessor1.getParameters();
        java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor16 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array15);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory17 = null;
        serviceAnnotationBeanPostProcessor16.postProcessBeanFactory(configurableListableBeanFactory17);
        java.lang.ClassLoader classLoader19 = null;
        serviceAnnotationBeanPostProcessor16.setBeanClassLoader(classLoader19);
        org.springframework.core.io.ResourceLoader resourceLoader21 = null;
        serviceAnnotationBeanPostProcessor16.setResourceLoader(resourceLoader21);
        servicebean_beanDefinitionRegistryPostProcessor1.setRef((org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor) serviceAnnotationBeanPostProcessor16);
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("hi!");
        java.lang.Integer i26 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(map_str_str9);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertNull(i26);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test469");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.Integer i12 = referencebean_dubboConfigBindingsRegistrar1.getRetries();
        referencebean_dubboConfigBindingsRegistrar1.setValidation("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setUrl("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.common.URL uRL17 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        referencebean_dubboConfigBindingsRegistrar1.setMonitor("");
        java.lang.Boolean b20 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setLayer("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(b20);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test470");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        servicebean_beanDefinitionRegistryPostProcessor5.setDelay((java.lang.Integer) 10);
        servicebean_beanDefinitionRegistryPostProcessor5.setWarmup((java.lang.Integer) 10);
        java.lang.Boolean b18 = servicebean_beanDefinitionRegistryPostProcessor5.getSent();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig19 = servicebean_beanDefinitionRegistryPostProcessor5.getProtocol();
        com.alibaba.dubbo.config.ProviderConfig providerConfig20 = servicebean_beanDefinitionRegistryPostProcessor5.getProvider();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(b18);
        org.junit.Assert.assertNull(protocolConfig19);
        org.junit.Assert.assertNull(providerConfig20);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test471");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 100);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor5 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        com.alibaba.dubbo.config.ProviderConfig providerConfig7 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        org.junit.Assert.assertNull(providerConfig7);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test472");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        com.alibaba.dubbo.config.annotation.Service service1 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor2 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service1);
        servicebean_beanDefinitionRegistryPostProcessor2.setCallbacks((java.lang.Integer) 1);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor2.getId();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor2.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor2.destroy();
        servicebean_beanDefinitionRegistryPostProcessor2.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor2.setRetries((java.lang.Integer) 100);
        java.lang.Object obj13 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor2, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        annotationBean0.destroy();
        annotationBean0.setPackage("");
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory17 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory17);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory19 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory19);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test473");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory1 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory1);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory3 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory3);
        annotationBean0.destroy();
        com.alibaba.dubbo.config.annotation.Service service6 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor7 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service6);
        servicebean_beanDefinitionRegistryPostProcessor7.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor7.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL12 = servicebean_beanDefinitionRegistryPostProcessor7.toUrl();
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor7.getPath();
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor7.getProxy();
        java.lang.Class<?> cls15 = servicebean_beanDefinitionRegistryPostProcessor7.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor7.setDeprecated((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor7.setOnconnect("");
        servicebean_beanDefinitionRegistryPostProcessor7.setId("null");
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor22 = servicebean_beanDefinitionRegistryPostProcessor7.getRef();
        servicebean_beanDefinitionRegistryPostProcessor7.setCache("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        java.lang.Object obj26 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" stub=\"\" validation=\"hi!\" />");
        annotationBean0.setPackage("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(cls15);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", obj26.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test474");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        java.lang.Boolean b13 = servicebean_beanDefinitionRegistryPostProcessor1.getSent();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig14 = servicebean_beanDefinitionRegistryPostProcessor1.getApplication();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.export();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(b13);
        org.junit.Assert.assertNull(applicationConfig14);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test475");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory1 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory1);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory3 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory3);
        annotationBean0.destroy();
        java.lang.String str6 = annotationBean0.getPackage();
        annotationBean0.destroy();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test476");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 100);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor5 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.lang.Boolean b6 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) 100);
        java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "referenceAnnotationBeanPostProcessor", "", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str16, str_array15);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor18 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str16);
        org.springframework.core.io.ResourceLoader resourceLoader19 = null;
        serviceAnnotationBeanPostProcessor18.setResourceLoader(resourceLoader19);
        servicebean_beanDefinitionRegistryPostProcessor1.setRef((org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor) serviceAnnotationBeanPostProcessor18);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor5);
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test477");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        com.alibaba.dubbo.config.annotation.Service service1 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor2 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service1);
        servicebean_beanDefinitionRegistryPostProcessor2.setCallbacks((java.lang.Integer) 1);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor2.getId();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor2.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor2.destroy();
        servicebean_beanDefinitionRegistryPostProcessor2.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor2.setRetries((java.lang.Integer) 100);
        java.lang.Object obj13 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor2, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        servicebean_beanDefinitionRegistryPostProcessor2.setRetries((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null" + "'", str6.equals("null"));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test478");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setParameters(map_str_str8);
        servicebean_beanDefinitionRegistryPostProcessor5.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor5.setMerger("");
        java.lang.Object obj14 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) "", "");
        java.lang.ClassLoader classLoader15 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader15);
        org.springframework.beans.PropertyValues propertyValues17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = null;
        java.beans.PropertyDescriptor[] propertyDescriptor_array19 = new java.beans.PropertyDescriptor[] { propertyDescriptor18 };
        com.alibaba.dubbo.config.annotation.Service service20 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor21 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service20);
        servicebean_beanDefinitionRegistryPostProcessor21.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor21.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL26 = servicebean_beanDefinitionRegistryPostProcessor21.toUrl();
        java.lang.String str27 = servicebean_beanDefinitionRegistryPostProcessor21.getPath();
        java.lang.String str28 = servicebean_beanDefinitionRegistryPostProcessor21.getProxy();
        java.lang.Integer i29 = servicebean_beanDefinitionRegistryPostProcessor21.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig30 = null;
        servicebean_beanDefinitionRegistryPostProcessor21.setProtocol(protocolConfig30);
        java.lang.String str32 = servicebean_beanDefinitionRegistryPostProcessor21.getOnconnect();
        servicebean_beanDefinitionRegistryPostProcessor21.setTimeout((java.lang.Integer) (-2147483648));
        org.springframework.beans.PropertyValues propertyValues36 = referenceAnnotationBeanPostProcessor0.postProcessPropertyValues(propertyValues17, propertyDescriptor_array19, (java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor21, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        referenceAnnotationBeanPostProcessor0.destroy();
        com.alibaba.dubbo.config.annotation.Service service38 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor39 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service38);
        servicebean_beanDefinitionRegistryPostProcessor39.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor39.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL44 = servicebean_beanDefinitionRegistryPostProcessor39.toUrl();
        java.lang.String str45 = servicebean_beanDefinitionRegistryPostProcessor39.getPath();
        java.lang.String str46 = servicebean_beanDefinitionRegistryPostProcessor39.getProxy();
        java.lang.Class<?> cls47 = servicebean_beanDefinitionRegistryPostProcessor39.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor39.setDeprecated((java.lang.Boolean) true);
        java.lang.Object obj51 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) true, "referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.annotation.Reference reference52 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar53 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference52);
        referencebean_dubboConfigBindingsRegistrar53.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar53.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b58 = referencebean_dubboConfigBindingsRegistrar53.isInjvm();
        java.lang.String str59 = referencebean_dubboConfigBindingsRegistrar53.getUrl();
        java.lang.String str60 = referencebean_dubboConfigBindingsRegistrar53.getProtocol();
        java.lang.Object obj62 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) str60, "referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.annotation.Service service63 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor64 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service63);
        servicebean_beanDefinitionRegistryPostProcessor64.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor64.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL69 = servicebean_beanDefinitionRegistryPostProcessor64.toUrl();
        java.lang.String str70 = servicebean_beanDefinitionRegistryPostProcessor64.getPath();
        java.lang.String str71 = servicebean_beanDefinitionRegistryPostProcessor64.getProxy();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig72 = servicebean_beanDefinitionRegistryPostProcessor64.getProviders();
        servicebean_beanDefinitionRegistryPostProcessor64.setRetries((java.lang.Integer) 1);
        java.lang.String str75 = servicebean_beanDefinitionRegistryPostProcessor64.getToken();
        servicebean_beanDefinitionRegistryPostProcessor64.setDeprecated((java.lang.Boolean) true);
        boolean b79 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) true, "null");
        com.alibaba.dubbo.config.annotation.Service service80 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor81 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service80);
        servicebean_beanDefinitionRegistryPostProcessor81.setExport((java.lang.Boolean) false);
        java.lang.String str84 = servicebean_beanDefinitionRegistryPostProcessor81.getLoadbalance();
        java.lang.Integer i85 = servicebean_beanDefinitionRegistryPostProcessor81.getConnections();
        java.lang.Integer i86 = servicebean_beanDefinitionRegistryPostProcessor81.getTimeout();
        java.lang.String str87 = servicebean_beanDefinitionRegistryPostProcessor81.getListener();
        java.lang.String str88 = servicebean_beanDefinitionRegistryPostProcessor81.toString();
        java.lang.String str89 = servicebean_beanDefinitionRegistryPostProcessor81.getStub();
        boolean b91 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor81, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertNotNull(propertyDescriptor_array19);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483648) + "'", i29.equals((-2147483648)));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(propertyValues36);
        org.junit.Assert.assertNull(uRL44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(cls47);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + true + "'", obj51.equals(true));
        org.junit.Assert.assertNull(b58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(uRL69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(list_providerConfig72);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNull(i85);
        org.junit.Assert.assertNull(i86);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", str88.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertTrue(b91 == true);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test479");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("null");
        java.lang.String str10 = referencebean_dubboConfigBindingsRegistrar1.getMock();
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getReconnect();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig12 = null;
        referencebean_dubboConfigBindingsRegistrar1.setApplication(applicationConfig12);
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test480");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test481");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) false);
        java.lang.String[] str_array16 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor17 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array16);
        org.springframework.core.io.ResourceLoader resourceLoader18 = null;
        serviceAnnotationBeanPostProcessor17.setResourceLoader(resourceLoader18);
        servicebean_beanDefinitionRegistryPostProcessor1.setRef((org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor) serviceAnnotationBeanPostProcessor17);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(str_array16);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test482");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        java.lang.Boolean b11 = servicebean_beanDefinitionRegistryPostProcessor1.isAsync();
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig12 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig13 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocol();
        servicebean_beanDefinitionRegistryPostProcessor1.setWarmup((java.lang.Integer) (-1));
        com.alibaba.dubbo.config.ModuleConfig moduleConfig16 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig16);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(b11);
        org.junit.Assert.assertNull(list_registryConfig12);
        org.junit.Assert.assertNull(protocolConfig13);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test483");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        com.alibaba.dubbo.config.RegistryConfig registryConfig11 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig11);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig13 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        servicebean_beanDefinitionRegistryPostProcessor1.unexport();
        java.lang.Integer i16 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_methodConfig13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-2147483648) + "'", i16.equals((-2147483648)));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test484");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        boolean b8 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        org.springframework.context.event.ContextRefreshedEvent contextRefreshedEvent9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.onApplicationEvent(contextRefreshedEvent9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setApplicationContext(applicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test485");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        com.alibaba.dubbo.config.annotation.Service service9 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        java.lang.Boolean b10 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        com.alibaba.dubbo.common.URL uRL11 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
        org.junit.Assert.assertNull(service9);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test486");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        com.alibaba.dubbo.common.URL uRL7 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.Integer i8 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(i8);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test487");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setParameters(map_str_str4);
        servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("hi!");
        java.lang.Boolean b9 = servicebean_beanDefinitionRegistryPostProcessor1.getExport();
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test488");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig12);
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test489");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test490");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        boolean b8 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getVersion();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test491");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        java.lang.String str2 = referencebean_dubboConfigBindingsRegistrar1.getCluster();
        referencebean_dubboConfigBindingsRegistrar1.setInjvm((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setStub((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test492");
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
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getMock();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test493");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLoadbalance("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-2147483648) + "'", i16.equals((-2147483648)));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test494");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal((java.lang.Boolean) false);
        com.alibaba.dubbo.config.MonitorConfig monitorConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig4);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test495");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        java.util.Map<java.lang.String, java.lang.String> map_str_str12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setParameters(map_str_str12);
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) (-2147483648));
        java.lang.Integer i16 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        com.alibaba.dubbo.config.ProviderConfig providerConfig19 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig19);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-2147483648) + "'", i16.equals((-2147483648)));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test496");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.export();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test497");
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
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        referencebean_dubboConfigBindingsRegistrar1.setInterface("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test498");
        java.lang.String[] str_array1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str2, str_array1);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor4 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor5 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        serviceAnnotationBeanPostProcessor6.setResourceLoader(resourceLoader7);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory9 = null;
        serviceAnnotationBeanPostProcessor6.postProcessBeanFactory(configurableListableBeanFactory9);
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        serviceAnnotationBeanPostProcessor6.setResourceLoader(resourceLoader11);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory13 = null;
        serviceAnnotationBeanPostProcessor6.postProcessBeanFactory(configurableListableBeanFactory13);
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test499");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<com.alibaba.dubbo.config.spring.status.SpringStatusChecker> servicebean_springStatusChecker1 = new com.alibaba.dubbo.config.spring.ServiceBean<com.alibaba.dubbo.config.spring.status.SpringStatusChecker>(service0);
        servicebean_springStatusChecker1.setSent((java.lang.Boolean) true);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test500");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setTimeout((java.lang.Integer) 1);
        org.junit.Assert.assertNull(b6);
    }
}
