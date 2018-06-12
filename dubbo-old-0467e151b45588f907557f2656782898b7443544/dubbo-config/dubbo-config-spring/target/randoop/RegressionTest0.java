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
        org.springframework.beans.PropertyValues propertyValues1 = null;
        try {
            com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor dubboConfigBindingBeanPostProcessor2 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor("hi!", propertyValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.springframework.context.ApplicationContext applicationContext0 = null;
        try {
            com.alibaba.dubbo.config.spring.extension.SpringExtensionFactory.addApplicationContext(applicationContext0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int i0 = org.springframework.core.Ordered.HIGHEST_PRECEDENCE;
        org.junit.Assert.assertTrue(i0 == (-2147483648));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.alibaba.dubbo.config.spring.context.annotation.DubboConfigConfiguration dubboConfigConfiguration0 = new com.alibaba.dubbo.config.spring.context.annotation.DubboConfigConfiguration();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.springframework.context.ApplicationContext applicationContext0 = null;
        try {
            com.alibaba.dubbo.config.spring.extension.SpringExtensionFactory.removeApplicationContext(applicationContext0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setFilter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry0 = null;
        org.springframework.core.env.Environment environment1 = null;
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboClassPathBeanDefinitionScanner dubboClassPathBeanDefinitionScanner3 = new com.alibaba.dubbo.config.spring.context.annotation.DubboClassPathBeanDefinitionScanner(beanDefinitionRegistry0, environment1, resourceLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.alibaba.dubbo.config.spring.util.BeanFactoryUtils beanFactoryUtils0 = new com.alibaba.dubbo.config.spring.util.BeanFactoryUtils();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar dubboConfigBindingsRegistrar0 = new com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar();
        org.springframework.core.type.AnnotationMetadata annotationMetadata1 = null;
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry2 = null;
        try {
            dubboConfigBindingsRegistrar0.registerBeanDefinitions(annotationMetadata1, beanDefinitionRegistry2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.springframework.context.ApplicationContext applicationContext0 = com.alibaba.dubbo.config.spring.ServiceBean.getSpringContext();
        org.junit.Assert.assertNull(applicationContext0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar dubboConfigBindingsRegistrar0 = new com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar();
        org.springframework.core.env.Environment environment1 = null;
        try {
            dubboConfigBindingsRegistrar0.setEnvironment(environment1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        serviceAnnotationBeanPostProcessor6.setResourceLoader(resourceLoader7);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry9 = null;
        try {
            serviceAnnotationBeanPostProcessor6.postProcessBeanDefinitionRegistry(beanDefinitionRegistry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        com.alibaba.dubbo.common.URL uRL7 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLoadbalance("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.Boolean b7 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setFilter("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(b7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str0 = com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor.BEAN_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "referenceAnnotationBeanPostProcessor" + "'", str0.equals("referenceAnnotationBeanPostProcessor"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setStub("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setCluster("referenceAnnotationBeanPostProcessor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.Boolean b7 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setCluster("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(b7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int i0 = org.springframework.core.Ordered.LOWEST_PRECEDENCE;
        org.junit.Assert.assertTrue(i0 == 2147483647);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setStub("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry7 = null;
        try {
            serviceAnnotationBeanPostProcessor6.postProcessBeanDefinitionRegistry(beanDefinitionRegistry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory7 = null;
        serviceAnnotationBeanPostProcessor6.postProcessBeanFactory(configurableListableBeanFactory7);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry9 = null;
        try {
            serviceAnnotationBeanPostProcessor6.postProcessBeanDefinitionRegistry(beanDefinitionRegistry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry0 = null;
        org.springframework.core.env.Environment environment2 = null;
        org.springframework.core.io.ResourceLoader resourceLoader3 = null;
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboClassPathBeanDefinitionScanner dubboClassPathBeanDefinitionScanner4 = new com.alibaba.dubbo.config.spring.context.annotation.DubboClassPathBeanDefinitionScanner(beanDefinitionRegistry0, true, environment2, resourceLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("null");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setOwner("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.alibaba.dubbo.config.spring.context.annotation.DubboConfigConfigurationSelector dubboConfigConfigurationSelector0 = new com.alibaba.dubbo.config.spring.context.annotation.DubboConfigConfigurationSelector();
        org.springframework.core.type.AnnotationMetadata annotationMetadata1 = null;
        try {
            java.lang.String[] str_array2 = dubboConfigConfigurationSelector0.selectImports(annotationMetadata1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.springframework.beans.PropertyValues propertyValues1 = null;
        try {
            com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor dubboConfigBindingBeanPostProcessor2 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor("referenceAnnotationBeanPostProcessor", propertyValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setVersion("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) false);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setCluster("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
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
        org.springframework.context.ApplicationContext applicationContext14 = null;
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setApplicationContext(applicationContext14);
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig5 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        servicebean_beanDefinitionRegistryPostProcessor1.setOwner("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
        org.junit.Assert.assertNull(list_protocolConfig5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.alibaba.dubbo.config.spring.util.BeanRegistrar beanRegistrar0 = new com.alibaba.dubbo.config.spring.util.BeanRegistrar();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
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
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) 100);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setCluster("referenceAnnotationBeanPostProcessor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.String> map_str_str11 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setParameters(map_str_str11);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScanRegistrar dubboComponentScanRegistrar0 = new com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScanRegistrar();
        org.springframework.core.type.AnnotationMetadata annotationMetadata1 = null;
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry2 = null;
        try {
            dubboComponentScanRegistrar0.registerBeanDefinitions(annotationMetadata1, beanDefinitionRegistry2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setFilter("referenceAnnotationBeanPostProcessor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(list_methodConfig6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setVersion("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        servicebean_beanDefinitionRegistryPostProcessor1.setAsync((java.lang.Boolean) true);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setVersion("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal((java.lang.Boolean) false);
        org.springframework.context.ApplicationContext applicationContext10 = null;
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setApplicationContext(applicationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        java.lang.Boolean b10 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        servicebean_beanDefinitionRegistryPostProcessor1.setMock((java.lang.Boolean) true);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(b10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingRegistrar dubboConfigBindingRegistrar0 = new com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingRegistrar();
        org.springframework.core.env.Environment environment1 = null;
        try {
            dubboConfigBindingRegistrar0.setEnvironment(environment1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) false);
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setListener("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(i19);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.export();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        servicebean_beanDefinitionRegistryPostProcessor1.setCluster("");
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) true);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setCluster("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        try {
            java.lang.Object obj2 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setStub("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        servicebean_beanDefinitionRegistryPostProcessor1.setVersion("");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(i6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setId("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setCluster("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry0 = null;
        org.springframework.core.env.Environment environment2 = null;
        org.springframework.core.io.ResourceLoader resourceLoader3 = null;
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboClassPathBeanDefinitionScanner dubboClassPathBeanDefinitionScanner4 = new com.alibaba.dubbo.config.spring.context.annotation.DubboClassPathBeanDefinitionScanner(beanDefinitionRegistry0, false, environment2, resourceLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.springframework.beans.PropertyValues propertyValues1 = null;
        try {
            com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor dubboConfigBindingBeanPostProcessor2 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor("", propertyValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        int i14 = referenceAnnotationBeanPostProcessor0.getOrder();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i14 == 2147483647);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
        try {
            java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig18 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar dubboConfigBindingsRegistrar6 = referencebean_dubboConfigBindingsRegistrar1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Class<?> cls6 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        com.alibaba.dubbo.config.annotation.Service service7 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("referenceAnnotationBeanPostProcessor");
        servicebean_beanDefinitionRegistryPostProcessor1.setAsync((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(service7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.export();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setId("null");
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(i9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        org.springframework.context.ApplicationContext applicationContext4 = null;
        try {
            referencebean_dubboConfigBindingsRegistrar1.setApplicationContext(applicationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setProxy("");
        com.alibaba.dubbo.config.RegistryConfig registryConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig8);
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getDocument();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig8);
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig12 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.util.Map<java.lang.String, java.lang.String> map_str_str13 = servicebean_beanDefinitionRegistryPostProcessor1.getParameters();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(list_protocolConfig12);
        org.junit.Assert.assertNull(map_str_str13);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLocal("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setListener("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig5 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(list_methodConfig5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        boolean b5 = servicebean_beanDefinitionRegistryPostProcessor1.isExported();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(i6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory2 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory2);
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor5.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor5.setCache("hi!");
        java.lang.Integer i14 = servicebean_beanDefinitionRegistryPostProcessor5.getConnections();
        try {
            java.lang.Object obj16 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) i14, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(i14);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
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
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig5 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        boolean b6 = servicebean_beanDefinitionRegistryPostProcessor1.isExported();
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
        org.junit.Assert.assertNull(list_protocolConfig5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig5 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        servicebean_beanDefinitionRegistryPostProcessor1.setOwner("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setGroup("null");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLoadbalance("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
        org.junit.Assert.assertNull(list_protocolConfig5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setCluster("");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig7 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        servicebean_beanDefinitionRegistryPostProcessor1.setPath("");
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(list_methodConfig7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL10 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNotNull(list_uRL10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 100);
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        org.junit.Assert.assertNull(i5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("");
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getOndisconnect();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getMonitor();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(monitorConfig11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("hi!");
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setProxy("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) 100);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setVersion("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setMock("hi!");
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
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "referenceAnnotationBeanPostProcessor", "", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str5, str_array4);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor7 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str5);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry8 = null;
        try {
            serviceAnnotationBeanPostProcessor7.postProcessBeanDefinitionRegistry(beanDefinitionRegistry8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
        boolean b13 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getVersion();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getModule();
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(moduleConfig11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
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
        org.springframework.context.event.ContextRefreshedEvent contextRefreshedEvent15 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.onApplicationEvent(contextRefreshedEvent15);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i14);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
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
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig13 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProviders(list_providerConfig13);
        com.alibaba.dubbo.config.ProviderConfig providerConfig15 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(providerConfig15);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler dubboNamespaceHandler0 = new com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler();
        org.w3c.dom.Node node1 = null;
        org.springframework.beans.factory.config.BeanDefinitionHolder beanDefinitionHolder2 = null;
        org.springframework.beans.factory.xml.ParserContext parserContext3 = null;
        try {
            org.springframework.beans.factory.config.BeanDefinitionHolder beanDefinitionHolder4 = dubboNamespaceHandler0.decorate(node1, beanDefinitionHolder2, parserContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.export();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 0);
        servicebean_beanDefinitionRegistryPostProcessor1.setSent((java.lang.Boolean) true);
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getLayer();
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.Boolean b9 = servicebean_beanDefinitionRegistryPostProcessor1.isAsync();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(b9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setCluster("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        com.alibaba.dubbo.config.annotation.Service service10 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(service10);
        org.junit.Assert.assertNull(list_providerConfig11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 0);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.Collection<java.lang.String> collection_str0 = null;
        try {
            com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor1 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(collection_str0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(i7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(list_methodConfig6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
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
            servicebean_beanDefinitionRegistryPostProcessor5.setProxy("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("referenceAnnotationBeanPostProcessor");
        try {
            java.lang.Object obj10 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        try {
            java.lang.Object obj9 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        com.alibaba.dubbo.config.MonitorConfig monitorConfig13 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig13);
        servicebean_beanDefinitionRegistryPostProcessor1.unexport();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setGroup("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingRegistrar dubboConfigBindingRegistrar0 = new com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingRegistrar();
        org.springframework.core.type.AnnotationMetadata annotationMetadata1 = null;
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry2 = null;
        try {
            dubboConfigBindingRegistrar0.registerBeanDefinitions(annotationMetadata1, beanDefinitionRegistry2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setListener("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(list_methodConfig6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory1 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory1);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory3 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory3);
        java.lang.String str5 = annotationBean0.getPackage();
        annotationBean0.destroy();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("hi!");
        java.util.Map<java.lang.String, java.lang.String> map_str_str7 = servicebean_beanDefinitionRegistryPostProcessor1.getParameters();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(map_str_str7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list_registryConfig10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
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
        java.lang.Object obj39 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) 2147483647, "");
        java.lang.Object obj40 = null;
        java.lang.Object obj42 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference(obj40, "referenceAnnotationBeanPostProcessor");
        org.springframework.context.ApplicationContext applicationContext43 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext43);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertNotNull(propertyDescriptor_array19);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483648) + "'", i29.equals((-2147483648)));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(propertyValues36);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 2147483647 + "'", obj39.equals(2147483647));
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setFilter("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(i10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig7 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig7);
        boolean b9 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setProxy("");
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor3.getOwner();
        org.junit.Assert.assertNull(i4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list_uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setTimeout((java.lang.Integer) 0);
        try {
            referencebean_dubboConfigBindingsRegistrar1.setLoadbalance("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler dubboNamespaceHandler0 = new com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler();
        dubboNamespaceHandler0.init();
        org.w3c.dom.Element element2 = null;
        org.springframework.beans.factory.xml.ParserContext parserContext3 = null;
        try {
            org.springframework.beans.factory.config.BeanDefinition beanDefinition4 = dubboNamespaceHandler0.parse(element2, parserContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL47 = servicebean_beanDefinitionRegistryPostProcessor44.getExportedUrls();
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
        org.junit.Assert.assertNotNull(list_uRL47);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setWarmup((java.lang.Integer) 2147483647);
        java.lang.Boolean b13 = servicebean_beanDefinitionRegistryPostProcessor1.isAsync();
        java.lang.Integer i14 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(b13);
        org.junit.Assert.assertNull(i14);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 100);
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig10 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(i9);
        org.junit.Assert.assertNull(list_protocolConfig10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor8 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) (-2147483648));
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler dubboNamespaceHandler0 = new com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler();
        org.w3c.dom.Element element1 = null;
        org.springframework.beans.factory.xml.ParserContext parserContext2 = null;
        try {
            org.springframework.beans.factory.config.BeanDefinition beanDefinition3 = dubboNamespaceHandler0.parse(element1, parserContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        com.alibaba.dubbo.common.URL uRL7 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 10);
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
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
        try {
            java.lang.Object obj13 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(b11);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = servicebean_beanDefinitionRegistryPostProcessor1.getParameters();
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) 10);
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(map_str_str3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        com.alibaba.dubbo.config.annotation.Service service10 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        java.util.Map<java.lang.String, java.lang.String> map_str_str11 = servicebean_beanDefinitionRegistryPostProcessor1.getParameters();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(service10);
        org.junit.Assert.assertNull(map_str_str11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
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
        org.springframework.context.ApplicationContext applicationContext18 = null;
        try {
            referencebean_dubboConfigBindingsRegistrar1.setApplicationContext(applicationContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.alibaba.dubbo.config.spring.status.SpringStatusChecker springStatusChecker0 = new com.alibaba.dubbo.config.spring.status.SpringStatusChecker();
        com.alibaba.dubbo.common.status.Status status1 = springStatusChecker0.check();
        com.alibaba.dubbo.common.status.Status status2 = springStatusChecker0.check();
        com.alibaba.dubbo.common.status.Status status3 = springStatusChecker0.check();
        com.alibaba.dubbo.common.status.Status status4 = springStatusChecker0.check();
        com.alibaba.dubbo.common.status.Status status5 = springStatusChecker0.check();
        org.junit.Assert.assertNotNull(status1);
        org.junit.Assert.assertNotNull(status2);
        org.junit.Assert.assertNotNull(status3);
        org.junit.Assert.assertNotNull(status4);
        org.junit.Assert.assertNotNull(status5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        try {
            java.lang.Object obj8 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getDocument();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(i9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        servicebean_beanDefinitionRegistryPostProcessor1.setWarmup((java.lang.Integer) 2147483647);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        org.springframework.context.ApplicationContext applicationContext8 = null;
        try {
            referencebean_dubboConfigBindingsRegistrar1.setApplicationContext(applicationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory7 = null;
        serviceAnnotationBeanPostProcessor6.postProcessBeanFactory(configurableListableBeanFactory7);
        java.lang.ClassLoader classLoader9 = null;
        serviceAnnotationBeanPostProcessor6.setBeanClassLoader(classLoader9);
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        serviceAnnotationBeanPostProcessor6.setResourceLoader(resourceLoader11);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry13 = null;
        try {
            serviceAnnotationBeanPostProcessor6.postProcessBeanDefinitionRegistry(beanDefinitionRegistry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setProxy("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUrl();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        java.lang.Boolean b9 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(b9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setGroup("");
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(i16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        org.springframework.context.ApplicationContext applicationContext7 = null;
        try {
            referencebean_dubboConfigBindingsRegistrar1.setApplicationContext(applicationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
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
        org.springframework.context.ApplicationContext applicationContext11 = null;
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setApplicationContext(applicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.Set<java.lang.String> set_str0 = null;
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor1 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(set_str0);
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        serviceAnnotationBeanPostProcessor1.setResourceLoader(resourceLoader2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setCluster("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        try {
            java.lang.Object obj7 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.alibaba.dubbo.config.spring.ServiceBean<java.lang.CharSequence> servicebean_charSequence0 = new com.alibaba.dubbo.config.spring.ServiceBean<java.lang.CharSequence>();
        java.lang.String str1 = servicebean_charSequence0.getLayer();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setInjvm((java.lang.Boolean) false);
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getReconnect();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setWarmup((java.lang.Integer) (-2147483648));
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
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) true);
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        com.alibaba.dubbo.common.URL uRL10 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("hi!");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.String[] str_array1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str2, str_array1);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor4 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor5 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory6 = null;
        serviceAnnotationBeanPostProcessor5.postProcessBeanFactory(configurableListableBeanFactory6);
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setStub("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        serviceAnnotationBeanPostProcessor6.setResourceLoader(resourceLoader7);
        java.lang.ClassLoader classLoader9 = null;
        serviceAnnotationBeanPostProcessor6.setBeanClassLoader(classLoader9);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry11 = null;
        try {
            serviceAnnotationBeanPostProcessor6.postProcessBeanDefinitionRegistry(beanDefinitionRegistry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setCluster("");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(i2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setListener("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setAsync((java.lang.Boolean) false);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.export();
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
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
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
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor15 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setProxy("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor15);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.Boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isInit();
        referencebean_dubboConfigBindingsRegistrar1.setProtocol("");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setLocal("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b9);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        java.lang.Boolean b19 = servicebean_beanDefinitionRegistryPostProcessor1.getSent();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(b19);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig9);
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        java.lang.Boolean b12 = servicebean_beanDefinitionRegistryPostProcessor1.getExport();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(b12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
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
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor18 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor18);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("referenceAnnotationBeanPostProcessor");
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) false);
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setProxy("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 2147483647);
        com.alibaba.dubbo.config.ProviderConfig providerConfig14 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(providerConfig14);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor7 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.core.io.ResourceLoader resourceLoader8 = null;
        serviceAnnotationBeanPostProcessor7.setResourceLoader(resourceLoader8);
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        serviceAnnotationBeanPostProcessor7.setResourceLoader(resourceLoader10);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry12 = null;
        try {
            serviceAnnotationBeanPostProcessor7.postProcessBeanDefinitionRegistry(beanDefinitionRegistry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig7 = servicebean_beanDefinitionRegistryPostProcessor1.getModule();
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(moduleConfig7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) false);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric("hi!");
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.alibaba.dubbo.config.spring.context.annotation.DubboConfigConfigurationSelector dubboConfigConfigurationSelector0 = new com.alibaba.dubbo.config.spring.context.annotation.DubboConfigConfigurationSelector();
        int i1 = dubboConfigConfigurationSelector0.getOrder();
        org.springframework.core.type.AnnotationMetadata annotationMetadata2 = null;
        try {
            java.lang.String[] str_array3 = dubboConfigConfigurationSelector0.selectImports(annotationMetadata2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i1 == (-2147483648));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler dubboNamespaceHandler0 = new com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler();
        dubboNamespaceHandler0.init();
        dubboNamespaceHandler0.init();
        org.w3c.dom.Element element3 = null;
        org.springframework.beans.factory.xml.ParserContext parserContext4 = null;
        try {
            org.springframework.beans.factory.config.BeanDefinition beanDefinition5 = dubboNamespaceHandler0.parse(element3, parserContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setStub("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 1);
        com.alibaba.dubbo.config.ModuleConfig moduleConfig12 = servicebean_beanDefinitionRegistryPostProcessor1.getModule();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(moduleConfig12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        try {
            java.lang.Object obj6 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setActives((java.lang.Integer) (-1));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setParameters(map_str_str4);
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getVersion();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setActives((java.lang.Integer) (-2147483648));
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNotNull(providerConfig_array11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setCluster("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler dubboNamespaceHandler0 = new com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler();
        dubboNamespaceHandler0.init();
        dubboNamespaceHandler0.init();
        org.w3c.dom.Node node3 = null;
        org.springframework.beans.factory.config.BeanDefinitionHolder beanDefinitionHolder4 = null;
        org.springframework.beans.factory.xml.ParserContext parserContext5 = null;
        try {
            org.springframework.beans.factory.config.BeanDefinitionHolder beanDefinitionHolder6 = dubboNamespaceHandler0.decorate(node3, beanDefinitionHolder4, parserContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        servicebean_beanDefinitionRegistryPostProcessor1.setAsync((java.lang.Boolean) true);
        org.springframework.context.event.ContextRefreshedEvent contextRefreshedEvent7 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.onApplicationEvent(contextRefreshedEvent7);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("referenceAnnotationBeanPostProcessor");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setFilter("referenceAnnotationBeanPostProcessor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertTrue("'" + b6 + "' != '" + false + "'", b6.equals(false));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
        org.springframework.core.env.Environment environment24 = null;
        serviceAnnotationBeanPostProcessor16.setEnvironment(environment24);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(map_str_str9);
        org.junit.Assert.assertNotNull(str_array15);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
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
        java.lang.Integer i13 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) true);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(i13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        servicebean_beanDefinitionRegistryPostProcessor1.export();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("");
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i12);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list_uRL11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        org.springframework.context.ApplicationContext applicationContext8 = null;
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setApplicationContext(applicationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.lang.Class<?> cls10 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        java.lang.Boolean b11 = referencebean_dubboConfigBindingsRegistrar1.getStubevent();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setClient("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(cls10);
        org.junit.Assert.assertTrue("'" + b11 + "' != '" + true + "'", b11.equals(true));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport> referencebean_namespaceHandlerSupport0 = new com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport>();
        referencebean_namespaceHandlerSupport0.setInit((java.lang.Boolean) false);
        referencebean_namespaceHandlerSupport0.setCache("");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getCluster();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        servicebean_beanDefinitionRegistryPostProcessor1.setOnconnect("null");
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 2147483647);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        boolean b6 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) 0.0d, "");
        org.springframework.context.ApplicationContext applicationContext7 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext9);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str13.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
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
        com.alibaba.dubbo.config.ProviderConfig providerConfig15 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig15);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str4 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(b5);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.String[] str_array1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str2, str_array1);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor4 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor5 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
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
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
        org.junit.Assert.assertNull(i9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("");
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        servicebean_beanDefinitionRegistryPostProcessor1.setSent((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("hi!");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
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
        com.alibaba.dubbo.config.RegistryConfig registryConfig17 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setRegistry(registryConfig17);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor14);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor5.export();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(providerConfig16);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.Boolean b7 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) true);
        java.lang.String str10 = referencebean_dubboConfigBindingsRegistrar1.getClient();
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getOwner();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor(str_array5);
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory7 = null;
        serviceAnnotationBeanPostProcessor6.postProcessBeanFactory(configurableListableBeanFactory7);
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        serviceAnnotationBeanPostProcessor6.setResourceLoader(resourceLoader9);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry11 = null;
        try {
            serviceAnnotationBeanPostProcessor6.postProcessBeanDefinitionRegistry(beanDefinitionRegistry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getReconnect();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) true);
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar dubboConfigBindingsRegistrar13 = referencebean_dubboConfigBindingsRegistrar1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str9.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        referencebean_dubboConfigBindingsRegistrar1.setProtocol("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(b11);
        org.junit.Assert.assertNotNull(list_uRL12);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.Boolean b7 = servicebean_beanDefinitionRegistryPostProcessor1.isAsync();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(b7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
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
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar dubboConfigBindingsRegistrar12 = referencebean_dubboConfigBindingsRegistrar1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        com.alibaba.dubbo.config.MonitorConfig monitorConfig13 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig13);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setListener("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setCluster("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        com.alibaba.dubbo.config.ProviderConfig[] providerConfig_array11 = new com.alibaba.dubbo.config.ProviderConfig[] {};
        java.util.ArrayList<com.alibaba.dubbo.config.ProviderConfig> arraylist_providerConfig12 = new java.util.ArrayList<com.alibaba.dubbo.config.ProviderConfig>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<com.alibaba.dubbo.config.ProviderConfig>) arraylist_providerConfig12, providerConfig_array11);
        servicebean_beanDefinitionRegistryPostProcessor1.setProviders((java.util.List<com.alibaba.dubbo.config.ProviderConfig>) arraylist_providerConfig12);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(providerConfig_array11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.export();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getLayer();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setPath("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
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
        com.alibaba.dubbo.common.URL uRL17 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.String[] str_array1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str2, str_array1);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor4 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor5 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor6 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Collection<java.lang.String>) linkedhashset_str2);
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        serviceAnnotationBeanPostProcessor6.setResourceLoader(resourceLoader7);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry9 = null;
        try {
            serviceAnnotationBeanPostProcessor6.postProcessBeanDefinitionRegistry(beanDefinitionRegistry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.getLazy();
        com.alibaba.dubbo.common.URL uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setLayer("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 1);
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) false);
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig10 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig10);
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
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
        java.lang.Integer i80 = servicebean_beanDefinitionRegistryPostProcessor60.getExecutes();
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
        org.junit.Assert.assertNull(i80);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        servicebean_beanDefinitionRegistryPostProcessor1.export();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("");
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getLocal();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
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
        org.springframework.context.ApplicationContext applicationContext12 = null;
        try {
            referencebean_dubboConfigBindingsRegistrar1.setApplicationContext(applicationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
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
        java.lang.Boolean b16 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(b16);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
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
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(b12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.setStub((java.lang.Boolean) false);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setCluster("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
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
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getOndisconnect();
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(list_registryConfig13);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
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
        java.lang.Integer i14 = servicebean_beanDefinitionRegistryPostProcessor6.getRetries();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(i14);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setGroup("");
        servicebean_beanDefinitionRegistryPostProcessor1.setActives((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.config.RegistryConfig registryConfig16 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistry();
        com.alibaba.dubbo.config.ApplicationConfig applicationConfig17 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setApplication(applicationConfig17);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(registryConfig16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 100);
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocol();
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertNull(protocolConfig4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
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
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar dubboConfigBindingsRegistrar17 = referencebean_dubboConfigBindingsRegistrar1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(cls12);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor60.setToken("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
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
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 100);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = servicebean_beanDefinitionRegistryPostProcessor1.getParameters();
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig10 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(map_str_str9);
        org.junit.Assert.assertNotNull(list_protocolConfig10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.setStub((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
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
        java.lang.Integer i13 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(i13);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
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
        try {
            referencebean_dubboConfigBindingsRegistrar1.setClient("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setClient("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
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
        java.lang.ClassLoader classLoader35 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader35);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0d + "'", obj17.equals(100.0d));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.Boolean b7 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        java.lang.Class<?> cls9 = referencebean_dubboConfigBindingsRegistrar1.getInterfaceClass();
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
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
        try {
            java.lang.Object obj16 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setCluster("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
        java.lang.String str14 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(cls12);
        org.junit.Assert.assertNull(b13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
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
        java.lang.Object obj17 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) 2147483647, "null");
        org.springframework.context.ApplicationContext applicationContext18 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext18);
        com.alibaba.dubbo.config.annotation.Service service20 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor21 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service20);
        servicebean_beanDefinitionRegistryPostProcessor21.setExport((java.lang.Boolean) false);
        java.lang.String str24 = servicebean_beanDefinitionRegistryPostProcessor21.getLoadbalance();
        java.lang.Integer i25 = servicebean_beanDefinitionRegistryPostProcessor21.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor21.setBeanName("referenceAnnotationBeanPostProcessor");
        java.lang.Object obj29 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) "referenceAnnotationBeanPostProcessor", "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 2147483647 + "'", obj17.equals(2147483647));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(i25);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "referenceAnnotationBeanPostProcessor" + "'", obj29.equals("referenceAnnotationBeanPostProcessor"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
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
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
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
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig19 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        servicebean_beanDefinitionRegistryPostProcessor1.setPath("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(cls14);
        org.junit.Assert.assertNull(b15);
        org.junit.Assert.assertNull(b18);
        org.junit.Assert.assertNull(list_methodConfig19);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.Integer i12 = referencebean_dubboConfigBindingsRegistrar1.getActives();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
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
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig19 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        servicebean_beanDefinitionRegistryPostProcessor1.setPath("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        com.alibaba.dubbo.common.URL uRL24 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(cls14);
        org.junit.Assert.assertNull(b15);
        org.junit.Assert.assertNull(b18);
        org.junit.Assert.assertNull(list_methodConfig19);
        org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("");
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) 100);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
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
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        boolean b6 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) 0.0d, "");
        org.springframework.context.ApplicationContext applicationContext7 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext7);
        java.lang.Object obj9 = null;
        java.lang.Object obj11 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization(obj9, "");
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory1 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        annotationBean0.setApplicationContext(applicationContext3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.Boolean b7 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("");
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        servicebean_beanDefinitionRegistryPostProcessor5.setCallbacks((java.lang.Integer) 2147483647);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
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
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getLocal();
        servicebean_beanDefinitionRegistryPostProcessor1.setExecutes((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.ProviderConfig providerConfig8 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(providerConfig8);
        org.junit.Assert.assertNull(i9);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setScope("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        com.alibaba.dubbo.config.MonitorConfig monitorConfig18 = servicebean_beanDefinitionRegistryPostProcessor1.getMonitor();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(monitorConfig18);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig5);
        com.alibaba.dubbo.config.annotation.Service service7 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setStub("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(service7);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setGroup("");
        servicebean_beanDefinitionRegistryPostProcessor1.setActives((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.config.RegistryConfig registryConfig16 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistry();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(registryConfig16);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
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
        org.springframework.context.ApplicationContext applicationContext35 = null;
        annotationBean0.setApplicationContext(applicationContext35);
        com.alibaba.dubbo.config.annotation.Reference reference37 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar38 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference37);
        referencebean_dubboConfigBindingsRegistrar38.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig41 = referencebean_dubboConfigBindingsRegistrar38.getMethods();
        referencebean_dubboConfigBindingsRegistrar38.setClient("");
        referencebean_dubboConfigBindingsRegistrar38.setVersion("");
        java.lang.String str46 = referencebean_dubboConfigBindingsRegistrar38.getListener();
        referencebean_dubboConfigBindingsRegistrar38.setVersion("");
        java.lang.Integer i49 = referencebean_dubboConfigBindingsRegistrar38.getRetries();
        referencebean_dubboConfigBindingsRegistrar38.setValidation("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar38.setUrl("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        com.alibaba.dubbo.common.URL uRL54 = referencebean_dubboConfigBindingsRegistrar38.toUrl();
        referencebean_dubboConfigBindingsRegistrar38.setMonitor("");
        java.lang.Object obj58 = annotationBean0.postProcessBeforeInitialization((java.lang.Object) referencebean_dubboConfigBindingsRegistrar38, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
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
        org.junit.Assert.assertNull(list_methodConfig41);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(i49);
        org.junit.Assert.assertNull(uRL54);
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("");
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor10 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor10);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setCluster("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
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
        org.springframework.context.ApplicationContext applicationContext17 = null;
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setApplicationContext(applicationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
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
        com.alibaba.dubbo.config.ModuleConfig moduleConfig15 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig15);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        referencebean_dubboConfigBindingsRegistrar1.setInterface("null");
        org.junit.Assert.assertNull(b6);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getDocument();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(list_providerConfig14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.Boolean b7 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setLoadbalance("null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertTrue("'" + b7 + "' != '" + false + "'", b7.equals(false));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
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
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig16 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(list_protocolConfig16);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
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
        referencebean_dubboConfigBindingsRegistrar38.setLocal((java.lang.Boolean) true);
        try {
            java.lang.Object obj46 = referencebean_dubboConfigBindingsRegistrar38.getObject();
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
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        com.alibaba.dubbo.config.annotation.Service service9 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) 0);
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
        org.junit.Assert.assertNull(service9);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setVersion("null");
        java.lang.Integer i11 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(i11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 1);
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getMock();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor5.setOwner("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(providerConfig16);
        org.junit.Assert.assertNull(i17);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL9 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor10 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL9);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
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
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getGroup();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setOwner("");
        java.lang.String str18 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setMock("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(b15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("");
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getVersion();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setConnections((java.lang.Integer) 100);
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setWarmup((java.lang.Integer) 100);
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
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("null");
        java.lang.String str10 = referencebean_dubboConfigBindingsRegistrar1.getMock();
        com.alibaba.dubbo.common.URL uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getStub();
        servicebean_beanDefinitionRegistryPostProcessor1.unexport();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor5.setProtocol(protocolConfig8);
        servicebean_beanDefinitionRegistryPostProcessor5.setToken((java.lang.Boolean) true);
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor5, "");
        servicebean_beanDefinitionRegistryPostProcessor5.setAccesslog("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig13 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig13);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
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
        java.lang.String str15 = referencebean_dubboConfigBindingsRegistrar1.getClient();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
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
        org.springframework.context.ApplicationContext applicationContext15 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext15);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(list_methodConfig6);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        com.alibaba.dubbo.config.ProviderConfig providerConfig7 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig7);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
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
        java.lang.Integer i14 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-2147483648) + "'", i14.equals((-2147483648)));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setId("null");
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig10 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(i9);
        org.junit.Assert.assertNull(list_providerConfig10);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        com.alibaba.dubbo.config.ProviderConfig providerConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig5);
        servicebean_beanDefinitionRegistryPostProcessor1.setPath("");
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("null");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor16);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getLocal();
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getGroup();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setListener("referenceAnnotationBeanPostProcessor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        servicebean_beanDefinitionRegistryPostProcessor1.setAsync((java.lang.Boolean) true);
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getDocument();
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
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
        com.alibaba.dubbo.common.URL uRL12 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(list_registryConfig10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("null");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setFilter("referenceAnnotationBeanPostProcessor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(i12);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
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
        java.lang.String str15 = referencebean_dubboConfigBindingsRegistrar1.getOnconnect();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str15.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setInterface("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
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
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-2147483648) + "'", i16.equals((-2147483648)));
        org.junit.Assert.assertNull(list_methodConfig17);
        org.junit.Assert.assertNull(b18);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig5);
        com.alibaba.dubbo.config.annotation.Service service7 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(service7);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 0);
        servicebean_beanDefinitionRegistryPostProcessor1.setSent((java.lang.Boolean) true);
        com.alibaba.dubbo.config.MonitorConfig monitorConfig14 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig14);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig14 = referencebean_dubboConfigBindingsRegistrar1.getConsumer();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(consumerConfig14);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLocal("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
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
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getDocument();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
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
        java.lang.Boolean b15 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNull(b15);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
        com.alibaba.dubbo.common.URL uRL16 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLocal("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list_uRL13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getClient();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        try {
            referencebean_dubboConfigBindingsRegistrar1.setClient("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 100);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setStub("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.alibaba.dubbo.config.spring.ServiceBean<com.alibaba.dubbo.config.AbstractMethodConfig> servicebean_abstractMethodConfig0 = new com.alibaba.dubbo.config.spring.ServiceBean<com.alibaba.dubbo.config.AbstractMethodConfig>();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.ProviderConfig providerConfig8 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        servicebean_beanDefinitionRegistryPostProcessor1.setGroup("");
        org.springframework.context.ApplicationContext applicationContext11 = null;
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setApplicationContext(applicationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(providerConfig8);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        com.alibaba.dubbo.config.annotation.Service service9 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.Boolean b11 = servicebean_beanDefinitionRegistryPostProcessor1.isDeprecated();
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
        org.junit.Assert.assertNull(service9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(b11);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory2 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory2);
        org.springframework.context.ApplicationContext applicationContext4 = null;
        annotationBean0.setApplicationContext(applicationContext4);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport> referencebean_namespaceHandlerSupport0 = new com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport>();
        referencebean_namespaceHandlerSupport0.setInit((java.lang.Boolean) false);
        referencebean_namespaceHandlerSupport0.setVersion("");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.lang.String[] str_array1 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str2, str_array1);
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor4 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationBeanPostProcessor((java.util.Set<java.lang.String>) linkedhashset_str2);
        java.lang.ClassLoader classLoader5 = null;
        serviceAnnotationBeanPostProcessor4.setBeanClassLoader(classLoader5);
        org.springframework.core.io.ResourceLoader resourceLoader7 = null;
        serviceAnnotationBeanPostProcessor4.setResourceLoader(resourceLoader7);
        org.springframework.beans.factory.support.BeanDefinitionRegistry beanDefinitionRegistry9 = null;
        try {
            serviceAnnotationBeanPostProcessor4.postProcessBeanDefinitionRegistry(beanDefinitionRegistry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
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
        boolean b16 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(monitorConfig15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Class<?> cls6 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        com.alibaba.dubbo.config.annotation.Service service7 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        java.lang.Integer i8 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        servicebean_beanDefinitionRegistryPostProcessor1.setConnections((java.lang.Integer) 2147483647);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(service7);
        org.junit.Assert.assertNull(i8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("");
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal("");
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL12 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list_uRL12);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        com.alibaba.dubbo.config.annotation.Service service4 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor5 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service4);
        servicebean_beanDefinitionRegistryPostProcessor5.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor5.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL10 = servicebean_beanDefinitionRegistryPostProcessor5.toUrl();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor5.getPath();
        java.lang.Object obj13 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) str11, "null");
        referenceAnnotationBeanPostProcessor0.destroy();
        com.alibaba.dubbo.config.annotation.Reference reference15 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar16 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference15);
        referencebean_dubboConfigBindingsRegistrar16.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig19 = referencebean_dubboConfigBindingsRegistrar16.getMethods();
        referencebean_dubboConfigBindingsRegistrar16.setClient("");
        referencebean_dubboConfigBindingsRegistrar16.setVersion("");
        boolean b25 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) "", "hi!");
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(list_methodConfig19);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        java.lang.Object obj5 = annotationBean0.postProcessAfterInitialization((java.lang.Object) 10.0d, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        com.alibaba.dubbo.config.annotation.Service service6 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor7 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service6);
        servicebean_beanDefinitionRegistryPostProcessor7.setExport((java.lang.Boolean) false);
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor7.getLoadbalance();
        java.lang.Integer i11 = servicebean_beanDefinitionRegistryPostProcessor7.getConnections();
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor7.getScope();
        java.lang.Object obj14 = annotationBean0.postProcessAfterInitialization((java.lang.Object) servicebean_beanDefinitionRegistryPostProcessor7, "null");
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d + "'", obj5.equals(10.0d));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(i11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Class<?> cls6 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        com.alibaba.dubbo.config.annotation.Service service7 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        java.lang.Integer i8 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getAccesslog();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setStub("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(service7);
        org.junit.Assert.assertNull(i8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.destroy();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) true);
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar dubboConfigBindingsRegistrar10 = referencebean_dubboConfigBindingsRegistrar1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler dubboNamespaceHandler0 = new com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler();
        dubboNamespaceHandler0.init();
        dubboNamespaceHandler0.init();
        dubboNamespaceHandler0.init();
        org.w3c.dom.Element element4 = null;
        org.springframework.beans.factory.xml.ParserContext parserContext5 = null;
        try {
            org.springframework.beans.factory.config.BeanDefinition beanDefinition6 = dubboNamespaceHandler0.parse(element4, parserContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setToken("");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(monitorConfig15);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) true);
        java.lang.String str6 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
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
        referencebean_dubboConfigBindingsRegistrar1.destroy();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(consumerConfig12);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setListener("referenceAnnotationBeanPostProcessor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
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
        org.springframework.context.ApplicationContext applicationContext15 = null;
        try {
            referencebean_dubboConfigBindingsRegistrar1.setApplicationContext(applicationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(consumerConfig12);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        java.lang.Integer i19 = referencebean_dubboConfigBindingsRegistrar1.getConnections();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
        org.junit.Assert.assertNull(i15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNull(i19);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        com.alibaba.dubbo.config.annotation.Service service14 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor15 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service14);
        java.lang.Integer i16 = servicebean_beanDefinitionRegistryPostProcessor15.getConnections();
        try {
            java.lang.Object obj18 = annotationBean0.postProcessAfterInitialization((java.lang.Object) i16, "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(i4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list_uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(i16);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getReconnect();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        referencebean_dubboConfigBindingsRegistrar1.setInjvm((java.lang.Boolean) false);
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str9.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) true);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
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
        boolean b13 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        boolean b14 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
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
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getCache();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setProxy("referenceAnnotationBeanPostProcessor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(monitorConfig12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setId("null");
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getVersion();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLoadbalance("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(i9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
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
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        servicebean_beanDefinitionRegistryPostProcessor1.setActives((java.lang.Integer) 0);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(i19);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setValidation("hi!");
        org.junit.Assert.assertNull(list_methodConfig4);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.Boolean b8 = referencebean_dubboConfigBindingsRegistrar1.isInit();
        org.springframework.context.ApplicationContext applicationContext9 = null;
        try {
            referencebean_dubboConfigBindingsRegistrar1.setApplicationContext(applicationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(b8);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
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
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig15 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocol();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(protocolConfig15);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
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
        java.lang.Boolean b19 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) 1);
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) false);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.export();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(b19);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setAsync((java.lang.Boolean) false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.Boolean b4 = referencebean_dubboConfigBindingsRegistrar1.getSticky();
        try {
            java.lang.Object obj5 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(b4);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
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
        com.alibaba.dubbo.config.ModuleConfig moduleConfig16 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig16);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(b15);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
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
        try {
            referencebean_dubboConfigBindingsRegistrar1.setMock("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
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
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setFilter("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getDocument();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
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
        referenceAnnotationBeanPostProcessor0.destroy();
        referenceAnnotationBeanPostProcessor0.destroy();
        java.lang.Object obj20 = null;
        boolean b22 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation(obj20, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 2147483647);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(list_registryConfig14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 2147483647);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
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
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        java.lang.Boolean b13 = referencebean_dubboConfigBindingsRegistrar1.isInit();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(b13);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
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
        com.alibaba.dubbo.config.ProviderConfig providerConfig13 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNull(i9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(providerConfig13);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
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
        com.alibaba.dubbo.config.annotation.Service service40 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor41 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service40);
        servicebean_beanDefinitionRegistryPostProcessor41.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor41.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig46 = servicebean_beanDefinitionRegistryPostProcessor41.getProtocols();
        java.lang.Integer i47 = servicebean_beanDefinitionRegistryPostProcessor41.getActives();
        java.lang.String str48 = servicebean_beanDefinitionRegistryPostProcessor41.toString();
        com.alibaba.dubbo.config.annotation.Service service49 = servicebean_beanDefinitionRegistryPostProcessor41.getService();
        java.lang.Boolean b50 = servicebean_beanDefinitionRegistryPostProcessor41.isRegister();
        java.lang.Class<?> cls51 = servicebean_beanDefinitionRegistryPostProcessor41.getInterfaceClass();
        boolean b53 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) cls51, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
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
        org.junit.Assert.assertNull(list_protocolConfig46);
        org.junit.Assert.assertNull(i47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str48.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
        org.junit.Assert.assertNull(service49);
        org.junit.Assert.assertNull(b50);
        org.junit.Assert.assertNull(cls51);
        org.junit.Assert.assertTrue(b53 == true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        servicebean_beanDefinitionRegistryPostProcessor1.destroy();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setWeight((java.lang.Integer) 1);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL11 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.Boolean b13 = servicebean_beanDefinitionRegistryPostProcessor1.getSent();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(b13);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.alibaba.dubbo.config.spring.ServiceBean<java.util.LinkedHashSet<java.lang.String>> servicebean_linkedhashset_str0 = new com.alibaba.dubbo.config.spring.ServiceBean<java.util.LinkedHashSet<java.lang.String>>();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setFilter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getCluster();
        java.lang.Boolean b8 = referencebean_dubboConfigBindingsRegistrar1.getSent();
        java.lang.Boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isGeneric();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(b8);
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + false + "'", b9.equals(false));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getReconnect();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) true);
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str9.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setLayer("");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(i6);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        org.springframework.context.ApplicationContext applicationContext80 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext80);
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
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("");
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) false);
        com.alibaba.dubbo.config.ProviderConfig providerConfig17 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(providerConfig17);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
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
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig16 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setProxy("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(list_protocolConfig16);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog("");
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal("");
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getFilter();
        servicebean_beanDefinitionRegistryPostProcessor1.setCache("referenceAnnotationBeanPostProcessor");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
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
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(i19);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        boolean b5 = servicebean_beanDefinitionRegistryPostProcessor1.isExported();
        servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setId("null");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
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
        java.lang.Integer i22 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        java.lang.String str23 = servicebean_beanDefinitionRegistryPostProcessor1.getToken();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(i16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(i22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig5);
        servicebean_beanDefinitionRegistryPostProcessor1.setOwner("referenceAnnotationBeanPostProcessor");
        com.alibaba.dubbo.config.ProviderConfig providerConfig9 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig9);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
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
        try {
            providerConfig16.setVersion("null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(providerConfig16);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
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
        java.lang.Class<?> cls14 = referencebean_dubboConfigBindingsRegistrar1.getInterfaceClass();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + false + "'", b12.equals(false));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(cls14);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setProxy("referenceAnnotationBeanPostProcessor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i14);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        com.alibaba.dubbo.config.RegistryConfig registryConfig2 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistry();
        org.junit.Assert.assertNull(registryConfig2);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setId("hi!");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        org.junit.Assert.assertNull(list_methodConfig4);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
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
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getFilter();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(i13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setAsync((java.lang.Boolean) false);
        java.lang.String str23 = servicebean_beanDefinitionRegistryPostProcessor1.getLayer();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-2147483648) + "'", i16.equals((-2147483648)));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
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
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getOndisconnect();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig16 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocol();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL17 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(list_registryConfig13);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(protocolConfig16);
        org.junit.Assert.assertNotNull(list_uRL17);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
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
        try {
            referencebean_dubboConfigBindingsRegistrar1.setVersion("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null" + "'", str8.equals("null"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        java.lang.Integer i9 = referencebean_dubboConfigBindingsRegistrar1.getCallbacks();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL10 = referencebean_dubboConfigBindingsRegistrar1.toUrls();
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(i9);
        org.junit.Assert.assertNotNull(list_uRL10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
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
        referencebean_dubboConfigBindingsRegistrar38.setLocal((java.lang.Boolean) true);
        java.lang.String str46 = referencebean_dubboConfigBindingsRegistrar38.getProtocol();
        java.lang.Boolean b47 = referencebean_dubboConfigBindingsRegistrar38.isAsync();
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
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(b47);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
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
        java.lang.String str61 = servicebean_beanDefinitionRegistryPostProcessor42.getLoadbalance();
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
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        java.lang.Boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b9);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getMerger();
        java.util.Map<java.lang.String, java.lang.String> map_str_str9 = servicebean_beanDefinitionRegistryPostProcessor1.getParameters();
        java.lang.Boolean b10 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(map_str_str9);
        org.junit.Assert.assertNull(b10);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.alibaba.dubbo.config.spring.ServiceBean<java.util.Set<java.lang.String>> servicebean_set_str0 = new com.alibaba.dubbo.config.spring.ServiceBean<java.util.Set<java.lang.String>>();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        com.alibaba.dubbo.common.URL uRL8 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setInjvm((java.lang.Boolean) true);
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        try {
            referencebean_dubboConfigBindingsRegistrar1.setFilter("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
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
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig15 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig15);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setInjvm((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setSent((java.lang.Boolean) false);
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        referencebean_dubboConfigBindingsRegistrar1.setUrl("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig9 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(list_methodConfig9);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
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
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig19 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        servicebean_beanDefinitionRegistryPostProcessor1.setPath("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setOndisconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setFilter("hi!");
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
        org.junit.Assert.assertNull(list_methodConfig19);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setOwner("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig7 = null;
        referencebean_dubboConfigBindingsRegistrar1.setModule(moduleConfig7);
        java.lang.Boolean b9 = referencebean_dubboConfigBindingsRegistrar1.isInit();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertNull(b9);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        annotationBean0.destroy();
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory4 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory4);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("null");
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.getSticky();
        com.alibaba.dubbo.common.URL uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getId();
        try {
            java.lang.Object obj14 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
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
        java.lang.Object obj39 = referenceAnnotationBeanPostProcessor0.postProcessAfterInitialization((java.lang.Object) 2147483647, "");
        java.lang.ClassLoader classLoader40 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader40);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertNotNull(propertyDescriptor_array19);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + i29 + "' != '" + (-2147483648) + "'", i29.equals((-2147483648)));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(propertyValues36);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 2147483647 + "'", obj39.equals(2147483647));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
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
        servicebean_beanDefinitionRegistryPostProcessor5.setDeprecated((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor5.setWarmup((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        annotationBean0.setPackage("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        org.springframework.beans.factory.config.ConfigurableListableBeanFactory configurableListableBeanFactory5 = null;
        annotationBean0.postProcessBeanFactory(configurableListableBeanFactory5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        annotationBean0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        annotationBean0.setApplicationContext(applicationContext9);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
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
        com.alibaba.dubbo.common.URL uRL16 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig17 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list_uRL13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(list_providerConfig17);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        org.springframework.context.ApplicationContext applicationContext8 = null;
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setApplicationContext(applicationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        com.alibaba.dubbo.config.ProviderConfig providerConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig5);
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 100);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setListener("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig5 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        servicebean_beanDefinitionRegistryPostProcessor1.setOwner("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setGroup("null");
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) (-1));
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
        org.junit.Assert.assertNull(list_protocolConfig5);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setDelay((java.lang.Integer) 100);
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) true);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
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
        java.lang.Boolean b13 = referencebean_dubboConfigBindingsRegistrar1.getStubevent();
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + b13 + "' != '" + true + "'", b13.equals(true));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setCluster("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.context.ResourceLoaderAware> servicebean_resourceLoaderAware0 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.context.ResourceLoaderAware>();
        java.util.Map<java.lang.String, java.lang.String> map_str_str1 = null;
        servicebean_resourceLoaderAware0.setParameters(map_str_str1);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
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
        try {
            java.lang.Object obj13 = referencebean_dubboConfigBindingsRegistrar1.getObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setTimeout((java.lang.Integer) 0);
        java.lang.String str12 = referencebean_dubboConfigBindingsRegistrar1.getCache();
        referencebean_dubboConfigBindingsRegistrar1.setOndisconnect("null");
        try {
            referencebean_dubboConfigBindingsRegistrar1.setListener("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        boolean b6 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) 0.0d, "");
        org.springframework.context.ApplicationContext applicationContext7 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext7);
        com.alibaba.dubbo.config.annotation.Reference reference9 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar10 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference9);
        referencebean_dubboConfigBindingsRegistrar10.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig13 = referencebean_dubboConfigBindingsRegistrar10.getMethods();
        java.lang.Boolean b14 = referencebean_dubboConfigBindingsRegistrar10.isCheck();
        java.lang.Boolean b15 = referencebean_dubboConfigBindingsRegistrar10.isGeneric();
        java.lang.Object obj17 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) b15, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        java.lang.Object obj18 = null;
        java.lang.Object obj20 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization(obj18, "null");
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(list_methodConfig13);
        org.junit.Assert.assertNull(b14);
        org.junit.Assert.assertTrue("'" + b15 + "' != '" + false + "'", b15.equals(false));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getLayer();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor12 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor12);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        java.lang.String str10 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig11 = servicebean_beanDefinitionRegistryPostProcessor1.getMethods();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(list_methodConfig11);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.springframework.beans.PropertyValues propertyValues1 = null;
        try {
            com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor dubboConfigBindingBeanPostProcessor2 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor("null", propertyValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
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
        java.lang.String str22 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(i16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) true);
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getUrl();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setLayer("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.alibaba.dubbo.config.spring.AnnotationBean annotationBean0 = new com.alibaba.dubbo.config.spring.AnnotationBean();
        annotationBean0.destroy();
        annotationBean0.destroy();
        annotationBean0.destroy();
        java.lang.String str4 = annotationBean0.getPackage();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig7 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig7);
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getOndisconnect();
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
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
        java.lang.Boolean b19 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) 1);
        com.alibaba.dubbo.config.ProviderConfig providerConfig22 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(b19);
        org.junit.Assert.assertNull(providerConfig22);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig8);
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        java.lang.Integer i11 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        java.lang.Boolean b12 = servicebean_beanDefinitionRegistryPostProcessor1.isAsync();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(i11);
        org.junit.Assert.assertNull(b12);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor4 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.lang.Boolean b5 = servicebean_beanDefinitionRegistryPostProcessor1.isDeprecated();
        servicebean_beanDefinitionRegistryPostProcessor1.setActives((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor4);
        org.junit.Assert.assertNull(b5);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
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
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />" + "'", str8.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />"));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(list_registryConfig10);
        org.junit.Assert.assertNull(applicationConfig11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig16 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(list_providerConfig16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.Boolean b5 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        referencebean_dubboConfigBindingsRegistrar1.afterPropertiesSet();
        java.lang.Boolean b7 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(b5);
        org.junit.Assert.assertNull(b7);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getCallbacks();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) false);
        com.alibaba.dubbo.config.MonitorConfig monitorConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig5);
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getGeneric();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor8 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        org.junit.Assert.assertNull(i2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor8);
        org.junit.Assert.assertNull(i9);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("");
        java.lang.Boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setVersion("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(b12);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getProviders();
        servicebean_beanDefinitionRegistryPostProcessor1.setRetries((java.lang.Integer) 1);
        java.lang.String str12 = servicebean_beanDefinitionRegistryPostProcessor1.getDocument();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
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
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig14 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocol();
        servicebean_beanDefinitionRegistryPostProcessor1.setId("null");
        servicebean_beanDefinitionRegistryPostProcessor1.unexport();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(list_providerConfig9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(protocolConfig14);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getVersion();
        com.alibaba.dubbo.config.ProviderConfig providerConfig12 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProvider(providerConfig12);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
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
        com.alibaba.dubbo.config.annotation.Service service16 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor17 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service16);
        servicebean_beanDefinitionRegistryPostProcessor17.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor17.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL22 = servicebean_beanDefinitionRegistryPostProcessor17.toUrl();
        java.lang.String str23 = servicebean_beanDefinitionRegistryPostProcessor17.getPath();
        java.lang.String str24 = servicebean_beanDefinitionRegistryPostProcessor17.getProxy();
        java.lang.Integer i25 = servicebean_beanDefinitionRegistryPostProcessor17.getTimeout();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig26 = null;
        servicebean_beanDefinitionRegistryPostProcessor17.setProtocol(protocolConfig26);
        java.lang.String str28 = servicebean_beanDefinitionRegistryPostProcessor17.getOnconnect();
        java.lang.Integer i29 = servicebean_beanDefinitionRegistryPostProcessor17.getDelay();
        java.lang.String str30 = servicebean_beanDefinitionRegistryPostProcessor17.getMerger();
        servicebean_beanDefinitionRegistryPostProcessor17.setCallbacks((java.lang.Integer) 1);
        java.lang.Object obj34 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) 1, "");
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(i15 == 2147483647);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-2147483648) + "'", i25.equals((-2147483648)));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(i29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1 + "'", obj34.equals(1));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
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
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />" + "'", str13.equals("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />"));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport> referencebean_namespaceHandlerSupport0 = new com.alibaba.dubbo.config.spring.ReferenceBean<org.springframework.beans.factory.xml.NamespaceHandlerSupport>();
        referencebean_namespaceHandlerSupport0.setMock((java.lang.Boolean) false);
        referencebean_namespaceHandlerSupport0.setId("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
        try {
            referencebean_namespaceHandlerSupport0.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setUrl("referenceAnnotationBeanPostProcessor");
        java.lang.String str4 = referencebean_dubboConfigBindingsRegistrar1.getCache();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        java.lang.Integer i2 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setToken("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(i2);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
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
        servicebean_beanDefinitionRegistryPostProcessor24.destroy();
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
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
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
        referencebean_dubboConfigBindingsRegistrar1.setReconnect("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />");
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.util.List<com.alibaba.dubbo.config.RegistryConfig> list_registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistries();
        servicebean_beanDefinitionRegistryPostProcessor1.setBeanName("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setAccesslog((java.lang.Boolean) true);
        java.lang.String str14 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getListener();
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setProxy("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
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
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(b11);
        org.junit.Assert.assertNotNull(list_uRL12);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setSticky((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setLazy((java.lang.Boolean) false);
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.String str11 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        java.lang.Integer i12 = referencebean_dubboConfigBindingsRegistrar1.getActives();
        java.lang.String str13 = referencebean_dubboConfigBindingsRegistrar1.getFilter();
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) true);
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setClient("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setParameters(map_str_str4);
        java.util.List<com.alibaba.dubbo.config.ProviderConfig> list_providerConfig6 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProviders(list_providerConfig6);
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        servicebean_beanDefinitionRegistryPostProcessor1.setStub((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        java.lang.Boolean b2 = referencebean_dubboConfigBindingsRegistrar1.getSticky();
        java.lang.Class<?> cls3 = referencebean_dubboConfigBindingsRegistrar1.getObjectType();
        org.junit.Assert.assertNull(b2);
        org.junit.Assert.assertNull(cls3);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.alibaba.dubbo.config.spring.ServiceBean<com.alibaba.dubbo.config.spring.status.DataSourceStatusChecker> servicebean_dataSourceStatusChecker0 = new com.alibaba.dubbo.config.spring.ServiceBean<com.alibaba.dubbo.config.spring.status.DataSourceStatusChecker>();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
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
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getCache();
        com.alibaba.dubbo.common.URL uRL16 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMock("");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(monitorConfig12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
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
        java.lang.Integer i19 = servicebean_beanDefinitionRegistryPostProcessor5.getWarmup();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(i19);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
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
        java.lang.String str24 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        java.lang.Boolean b25 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
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
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNull(b25);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        java.lang.String str8 = referencebean_dubboConfigBindingsRegistrar1.getGroup();
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getListener();
        java.lang.String str10 = referencebean_dubboConfigBindingsRegistrar1.getGeneric();
        com.alibaba.dubbo.config.ConsumerConfig consumerConfig11 = null;
        referencebean_dubboConfigBindingsRegistrar1.setConsumer(consumerConfig11);
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.springframework.beans.PropertyValues propertyValues1 = null;
        try {
            com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor dubboConfigBindingBeanPostProcessor2 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor("<dubbo:reference singleton=\"true\" url=\"referenceAnnotationBeanPostProcessor\" uniqueServiceName=\"null\" generic=\"false\" />", propertyValues1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getProxy();
        java.lang.Class<?> cls9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterfaceClass();
        java.lang.Boolean b10 = servicebean_beanDefinitionRegistryPostProcessor1.isDynamic();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getGroup();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler dubboNamespaceHandler0 = new com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler();
        dubboNamespaceHandler0.init();
        dubboNamespaceHandler0.init();
        dubboNamespaceHandler0.init();
        dubboNamespaceHandler0.init();
        org.w3c.dom.Node node5 = null;
        org.springframework.beans.factory.config.BeanDefinitionHolder beanDefinitionHolder6 = null;
        org.springframework.beans.factory.xml.ParserContext parserContext7 = null;
        try {
            org.springframework.beans.factory.config.BeanDefinitionHolder beanDefinitionHolder8 = dubboNamespaceHandler0.decorate(node5, beanDefinitionHolder6, parserContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        com.alibaba.dubbo.common.URL uRL16 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        servicebean_beanDefinitionRegistryPostProcessor1.setStub("");
        boolean b8 = servicebean_beanDefinitionRegistryPostProcessor1.isUnexported();
        com.alibaba.dubbo.config.RegistryConfig registryConfig9 = servicebean_beanDefinitionRegistryPostProcessor1.getRegistry();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(registryConfig9);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setGeneric("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(i12);
        org.junit.Assert.assertNull(cls13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        servicebean_beanDefinitionRegistryPostProcessor1.setMock((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
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
        java.lang.String str20 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        java.lang.Boolean b21 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(cls9);
        org.junit.Assert.assertNull(list_providerConfig14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(b21);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getInterface();
        java.lang.Integer i10 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("");
        java.lang.String str13 = servicebean_beanDefinitionRegistryPostProcessor1.getValidation();
        org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor14 = servicebean_beanDefinitionRegistryPostProcessor1.getRef();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(beanDefinitionRegistryPostProcessor14);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        servicebean_beanDefinitionRegistryPostProcessor1.setValidation("hi!");
        java.util.List<com.alibaba.dubbo.config.ProtocolConfig> list_protocolConfig6 = servicebean_beanDefinitionRegistryPostProcessor1.getProtocols();
        java.lang.Integer i7 = servicebean_beanDefinitionRegistryPostProcessor1.getActives();
        java.lang.String str8 = servicebean_beanDefinitionRegistryPostProcessor1.getOnconnect();
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL9 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        com.alibaba.dubbo.config.annotation.Service service10 = servicebean_beanDefinitionRegistryPostProcessor1.getService();
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) true);
        java.lang.Integer i13 = servicebean_beanDefinitionRegistryPostProcessor1.getDelay();
        org.junit.Assert.assertNull(list_protocolConfig6);
        org.junit.Assert.assertNull(i7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list_uRL9);
        org.junit.Assert.assertNull(service10);
        org.junit.Assert.assertNull(i13);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setToken((java.lang.Boolean) true);
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL8 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(list_uRL8);
        org.junit.Assert.assertNull(i9);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        try {
            referencebean_dubboConfigBindingsRegistrar1.setVersion("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        java.lang.String str15 = servicebean_beanDefinitionRegistryPostProcessor1.getCache();
        java.lang.String str16 = servicebean_beanDefinitionRegistryPostProcessor1.toString();
        java.lang.String str17 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(monitorConfig12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />" + "'", str16.equals("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />"));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig4 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig4);
        servicebean_beanDefinitionRegistryPostProcessor1.setDynamic((java.lang.Boolean) true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig6 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getUniqueServiceName();
        referencebean_dubboConfigBindingsRegistrar1.setInit((java.lang.Boolean) true);
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.isCheck();
        referencebean_dubboConfigBindingsRegistrar1.setCache("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        try {
            com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar dubboConfigBindingsRegistrar13 = referencebean_dubboConfigBindingsRegistrar1.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(list_methodConfig6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null" + "'", str7.equals("null"));
        org.junit.Assert.assertTrue("'" + b10 + "' != '" + false + "'", b10.equals(false));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar1.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b6 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        java.lang.String str7 = referencebean_dubboConfigBindingsRegistrar1.getInterface();
        referencebean_dubboConfigBindingsRegistrar1.setVersion("null");
        java.lang.Boolean b10 = referencebean_dubboConfigBindingsRegistrar1.getSticky();
        com.alibaba.dubbo.common.URL uRL11 = referencebean_dubboConfigBindingsRegistrar1.toUrl();
        boolean b12 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        java.lang.Boolean b13 = referencebean_dubboConfigBindingsRegistrar1.isInjvm();
        org.junit.Assert.assertNull(b6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(b10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(b13);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getRetries();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig7 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig7);
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(i9);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
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
        java.lang.Integer i20 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(list_methodConfig18);
        org.junit.Assert.assertNull(list_providerConfig19);
        org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100 + "'", i20.equals(100));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
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
        java.lang.Boolean b17 = servicebean_beanDefinitionRegistryPostProcessor1.getExport();
        java.lang.Integer i18 = servicebean_beanDefinitionRegistryPostProcessor1.getExecutes();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(i16);
        org.junit.Assert.assertNull(b17);
        org.junit.Assert.assertNull(i18);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal((java.lang.Boolean) false);
        java.lang.Integer i4 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        org.junit.Assert.assertNull(i4);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.alibaba.dubbo.config.annotation.Reference reference0 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar1 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference0);
        referencebean_dubboConfigBindingsRegistrar1.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig4 = referencebean_dubboConfigBindingsRegistrar1.getMethods();
        referencebean_dubboConfigBindingsRegistrar1.setClient("");
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) true);
        java.lang.String str9 = referencebean_dubboConfigBindingsRegistrar1.getProtocol();
        boolean b10 = referencebean_dubboConfigBindingsRegistrar1.isSingleton();
        referencebean_dubboConfigBindingsRegistrar1.setGeneric((java.lang.Boolean) false);
        org.junit.Assert.assertNull(list_methodConfig4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
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
        java.util.List<com.alibaba.dubbo.common.URL> list_uRL14 = servicebean_beanDefinitionRegistryPostProcessor1.getExportedUrls();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setListener("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNotNull(list_uRL14);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
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
        java.lang.Integer i21 = servicebean_beanDefinitionRegistryPostProcessor1.getWeight();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setLocal("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" cluster=\"\" onconnect=\"hi!\" timeout=\"-2147483648\" merger=\"\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-2147483648) + "'", i9.equals((-2147483648)));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(i21);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        com.alibaba.dubbo.config.ModuleConfig moduleConfig5 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setModule(moduleConfig5);
        servicebean_beanDefinitionRegistryPostProcessor1.setDocument("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
        java.lang.Integer i9 = servicebean_beanDefinitionRegistryPostProcessor1.getWarmup();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i9);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.afterPropertiesSet();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
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
        java.lang.ClassLoader classLoader40 = null;
        referenceAnnotationBeanPostProcessor0.setBeanClassLoader(classLoader40);
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
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler dubboNamespaceHandler0 = new com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler();
        dubboNamespaceHandler0.init();
        org.w3c.dom.Node node2 = null;
        org.springframework.beans.factory.config.BeanDefinitionHolder beanDefinitionHolder3 = null;
        org.springframework.beans.factory.xml.ParserContext parserContext4 = null;
        try {
            org.springframework.beans.factory.config.BeanDefinitionHolder beanDefinitionHolder5 = dubboNamespaceHandler0.decorate(node2, beanDefinitionHolder3, parserContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        boolean b6 = referenceAnnotationBeanPostProcessor0.postProcessAfterInstantiation((java.lang.Object) 0.0d, "");
        org.springframework.context.ApplicationContext applicationContext7 = null;
        referenceAnnotationBeanPostProcessor0.setApplicationContext(applicationContext7);
        com.alibaba.dubbo.config.annotation.Reference reference9 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar10 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference9);
        referencebean_dubboConfigBindingsRegistrar10.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        java.util.List<com.alibaba.dubbo.config.MethodConfig> list_methodConfig13 = referencebean_dubboConfigBindingsRegistrar10.getMethods();
        java.lang.Boolean b14 = referencebean_dubboConfigBindingsRegistrar10.isCheck();
        java.lang.Boolean b15 = referencebean_dubboConfigBindingsRegistrar10.isGeneric();
        java.lang.Object obj17 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) b15, "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
        com.alibaba.dubbo.config.annotation.Reference reference18 = null;
        com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar> referencebean_dubboConfigBindingsRegistrar19 = new com.alibaba.dubbo.config.spring.ReferenceBean<com.alibaba.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar>(reference18);
        referencebean_dubboConfigBindingsRegistrar19.setOnconnect("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
        referencebean_dubboConfigBindingsRegistrar19.setCheck((java.lang.Boolean) false);
        java.lang.Boolean b24 = referencebean_dubboConfigBindingsRegistrar19.isInjvm();
        java.lang.String str25 = referencebean_dubboConfigBindingsRegistrar19.getUrl();
        java.lang.String str26 = referencebean_dubboConfigBindingsRegistrar19.getGeneric();
        java.lang.Object obj28 = referenceAnnotationBeanPostProcessor0.postProcessBeforeInitialization((java.lang.Object) referencebean_dubboConfigBindingsRegistrar19, "");
        try {
            referencebean_dubboConfigBindingsRegistrar19.setGroup("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(list_methodConfig13);
        org.junit.Assert.assertNull(b14);
        org.junit.Assert.assertTrue("'" + b15 + "' != '" + false + "'", b15.equals(false));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertNull(b24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
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
        java.lang.Boolean b14 = servicebean_beanDefinitionRegistryPostProcessor1.isRegister();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig11);
        org.junit.Assert.assertNull(b14);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getOwner();
        java.lang.String str5 = servicebean_beanDefinitionRegistryPostProcessor1.getLocal();
        servicebean_beanDefinitionRegistryPostProcessor1.setOwner("");
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setFilter("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.Integer i6 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        servicebean_beanDefinitionRegistryPostProcessor1.setDeprecated((java.lang.Boolean) false);
        java.lang.String str9 = servicebean_beanDefinitionRegistryPostProcessor1.getCluster();
        servicebean_beanDefinitionRegistryPostProcessor1.unexport();
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getUniqueServiceName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(i6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null" + "'", str11.equals("null"));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
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
        com.alibaba.dubbo.common.URL uRL14 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(i11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />" + "'", str12.equals("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" merger=\"\" id=\"\" />"));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
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
        com.alibaba.dubbo.config.ProviderConfig providerConfig16 = servicebean_beanDefinitionRegistryPostProcessor1.getProvider();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(providerConfig16);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
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
        java.lang.Boolean b22 = servicebean_beanDefinitionRegistryPostProcessor1.getSent();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(list_registryConfig9);
        org.junit.Assert.assertNull(i14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(i16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(b22);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        servicebean_beanDefinitionRegistryPostProcessor1.setMerger("");
        servicebean_beanDefinitionRegistryPostProcessor1.setCallbacks((java.lang.Integer) 1);
        java.lang.String str11 = servicebean_beanDefinitionRegistryPostProcessor1.getId();
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.export();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.alibaba.dubbo.config.spring.context.annotation.DubboConfigConfigurationSelector dubboConfigConfigurationSelector0 = new com.alibaba.dubbo.config.spring.context.annotation.DubboConfigConfigurationSelector();
        int i1 = dubboConfigConfigurationSelector0.getOrder();
        int i2 = dubboConfigConfigurationSelector0.getOrder();
        int i3 = dubboConfigConfigurationSelector0.getOrder();
        org.springframework.core.type.AnnotationMetadata annotationMetadata4 = null;
        try {
            java.lang.String[] str_array5 = dubboConfigConfigurationSelector0.selectImports(annotationMetadata4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i1 == (-2147483648));
        org.junit.Assert.assertTrue(i2 == (-2147483648));
        org.junit.Assert.assertTrue(i3 == (-2147483648));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor referenceAnnotationBeanPostProcessor0 = new com.alibaba.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor();
        java.lang.Object obj3 = referenceAnnotationBeanPostProcessor0.getEarlyBeanReference((java.lang.Object) 100.0d, "");
        referenceAnnotationBeanPostProcessor0.destroy();
        int i5 = referenceAnnotationBeanPostProcessor0.getOrder();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0d + "'", obj3.equals(100.0d));
        org.junit.Assert.assertTrue(i5 == 2147483647);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setExport((java.lang.Boolean) false);
        java.lang.String str4 = servicebean_beanDefinitionRegistryPostProcessor1.getLoadbalance();
        java.lang.Integer i5 = servicebean_beanDefinitionRegistryPostProcessor1.getConnections();
        java.lang.String str6 = servicebean_beanDefinitionRegistryPostProcessor1.getScope();
        com.alibaba.dubbo.config.ProtocolConfig protocolConfig7 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setProtocol(protocolConfig7);
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setToken("<dubbo:service exported=\"false\" unexported=\"false\" uniqueServiceName=\"null\" export=\"false\" validation=\"hi!\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
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
        servicebean_beanDefinitionRegistryPostProcessor1.setRegister((java.lang.Boolean) true);
        servicebean_beanDefinitionRegistryPostProcessor1.setLocal((java.lang.Boolean) false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(i10);
        org.junit.Assert.assertNotNull(providerConfig_array11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.alibaba.dubbo.config.annotation.Service service0 = null;
        com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor> servicebean_beanDefinitionRegistryPostProcessor1 = new com.alibaba.dubbo.config.spring.ServiceBean<org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor>(service0);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("");
        servicebean_beanDefinitionRegistryPostProcessor1.setTimeout((java.lang.Integer) (-2147483648));
        com.alibaba.dubbo.common.URL uRL6 = servicebean_beanDefinitionRegistryPostProcessor1.toUrl();
        java.lang.String str7 = servicebean_beanDefinitionRegistryPostProcessor1.getPath();
        com.alibaba.dubbo.config.MonitorConfig monitorConfig8 = null;
        servicebean_beanDefinitionRegistryPostProcessor1.setMonitor(monitorConfig8);
        servicebean_beanDefinitionRegistryPostProcessor1.setInterface("hi!");
        java.lang.Integer i12 = servicebean_beanDefinitionRegistryPostProcessor1.getTimeout();
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-2147483648) + "'", i12.equals((-2147483648)));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
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
        try {
            servicebean_beanDefinitionRegistryPostProcessor1.setFilter("<dubbo:service exported=\"false\" unexported=\"false\" interface=\"\" uniqueServiceName=\"\" timeout=\"-2147483648\" id=\"\" />");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(i5);
        org.junit.Assert.assertNull(cls6);
        org.junit.Assert.assertNull(service7);
        org.junit.Assert.assertNotNull(providerConfig_array10);
        org.junit.Assert.assertTrue(b12 == false);
    }
}

