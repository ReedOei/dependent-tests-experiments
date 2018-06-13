import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.activemq.advisory.DestinationSource destinationSource1 = null;
        org.apache.activemq.camel.component.CamelEndpointLoader camelEndpointLoader2 = new org.apache.activemq.camel.component.CamelEndpointLoader(camelContext0, destinationSource1);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent3 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent3.setTransactionTimeout((int) (short) 0);
        activeMQComponent3.setExposeListenerSession(true);
        long long8 = activeMQComponent3.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        org.apache.camel.component.jms.ReplyToType replyToType9 = null;
        activeMQComponent3.setReplyToType(replyToType9);
        camelEndpointLoader2.setComponent(activeMQComponent3);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent12 = camelEndpointLoader2.getComponent();
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent13 = camelEndpointLoader2.getComponent();
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent14 = camelEndpointLoader2.getComponent();
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertNotNull(activeMQComponent12);
        org.junit.Assert.assertNotNull(activeMQComponent13);
        org.junit.Assert.assertNotNull(activeMQComponent14);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test02");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        org.springframework.jms.support.converter.MessageConverter messageConverter5 = jmsEndpoint2.getMessageConverter();
        long long6 = jmsEndpoint2.getTimeToLive();
        java.lang.String str7 = jmsEndpoint2.getThreadName();
        jmsEndpoint2.setAsyncConsumer(false);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(messageConverter5);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "JmsConsumer[null]" + "'", str7.equals("JmsConsumer[null]"));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test03");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isTestConnectionOnStartup();
        jmsEndpoint2.setTransactionTimeout((int) ' ');
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = jmsEndpoint2.getExceptionHandler();
        jmsEndpoint2.setTransactedInOut(false);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent9 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent9.setTransactionTimeout((int) (short) 0);
        activeMQComponent9.setForceSendOriginalMessage(true);
        activeMQComponent9.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent9.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration18 = activeMQComponent9.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext19 = null;
        activeMQComponent9.setCamelContext(camelContext19);
        activeMQComponent9.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration23 = activeMQComponent9.getConfiguration();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint24 = null;
        org.springframework.jms.core.JmsOperations jmsOperations27 = jmsConfiguration23.createInOnlyTemplate(jmsEndpoint24, true, "failover://tcp://localhost:61616");
        jmsEndpoint2.setJmsOperations(jmsOperations27);
        jmsEndpoint2.setSelector("queue:");
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(exceptionHandler6);
        org.junit.Assert.assertNotNull(componentConfiguration18);
        org.junit.Assert.assertNotNull(jmsConfiguration23);
        org.junit.Assert.assertNotNull(jmsOperations27);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test04");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        activeMQConnection2.setConsumerExpiryCheckEnabled(true);
        activeMQConnection2.setUseRetroactiveConsumer(false);
        long long9 = activeMQConnection2.getTimeCreated();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertTrue(long9 == 1522670160839L);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test05");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCopyMessageOnSend(true);
        boolean b3 = activeMQConnection0.isUseCompression();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test06");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setDestinationName("queue:");
        jmsEndpoint2.setSubscriptionDurable(false);
        jmsEndpoint2.setReplyToConcurrentConsumers(1);
        boolean b14 = jmsEndpoint2.isExposeListenerSession();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test07");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration9 = activeMQComponent0.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext10 = null;
        activeMQComponent0.setCamelContext(camelContext10);
        activeMQComponent0.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration14 = activeMQComponent0.getConfiguration();
        boolean b15 = jmsConfiguration14.isMapJmsMessage();
        java.lang.String str16 = jmsConfiguration14.getReplyToDestinationSelectorName();
        int i17 = jmsConfiguration14.getTransactionTimeout();
        java.lang.String str18 = jmsConfiguration14.getReplyToDestinationSelectorName();
        org.apache.camel.component.jms.ReplyToType replyToType19 = jmsConfiguration14.getReplyToType();
        jmsConfiguration14.setCacheLevelName("temp-queue:");
        boolean b22 = jmsConfiguration14.isMapJmsMessage();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(replyToType19);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test08");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration9 = activeMQComponent0.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext10 = null;
        activeMQComponent0.setCamelContext(camelContext10);
        activeMQComponent0.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration14 = activeMQComponent0.getConfiguration();
        boolean b15 = jmsConfiguration14.isTransactedInOut();
        org.apache.activemq.camel.component.OriginalDestinationPropagateStrategy originalDestinationPropagateStrategy16 = new org.apache.activemq.camel.component.OriginalDestinationPropagateStrategy();
        jmsConfiguration14.setMessageCreatedStrategy((org.apache.camel.component.jms.MessageCreatedStrategy) originalDestinationPropagateStrategy16);
        jmsConfiguration14.setIdleTaskExecutionLimit((int) (byte) -1);
        jmsConfiguration14.setTimeToLive((long) 100);
        jmsConfiguration14.setUsername("2.19.3");
        boolean b24 = jmsConfiguration14.isTransacted();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test09");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration9 = activeMQComponent0.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext10 = null;
        activeMQComponent0.setCamelContext(camelContext10);
        activeMQComponent0.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration14 = activeMQComponent0.getConfiguration();
        boolean b15 = jmsConfiguration14.isMapJmsMessage();
        java.lang.String str16 = jmsConfiguration14.getReplyToDestinationSelectorName();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = null;
        org.springframework.jms.core.JmsOperations jmsOperations21 = jmsConfiguration14.createInOutTemplate(jmsEndpoint17, false, "temp-topic:", (long) 10);
        jmsConfiguration14.setWaitForProvisionCorrelationToBeUpdatedCounter((int) (short) 0);
        org.apache.camel.component.jms.ConsumerType consumerType24 = jmsConfiguration14.getConsumerType();
        org.apache.camel.component.jms.JmsComponent jmsComponent25 = org.apache.camel.component.jms.JmsComponent.jmsComponent(jmsConfiguration14);
        jmsConfiguration14.setCacheLevel(0);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jmsOperations21);
        org.junit.Assert.assertTrue("'" + consumerType24 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType24.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertNotNull(jmsComponent25);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test10");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration9 = activeMQComponent0.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext10 = null;
        activeMQComponent0.setCamelContext(camelContext10);
        activeMQComponent0.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration14 = activeMQComponent0.getConfiguration();
        boolean b15 = jmsConfiguration14.isDisableReplyTo();
        jmsConfiguration14.setReplyToConcurrentConsumers((int) (byte) -1);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test11");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        javax.jms.ExceptionListener exceptionListener5 = activeMQConnection2.getExceptionListener();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertNull(exceptionListener5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test12");
        org.apache.activemq.camel.CamelDestination camelDestination1 = new org.apache.activemq.camel.CamelDestination("");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelDestination1.getBinding();
        org.apache.camel.Endpoint endpoint3 = camelDestination1.getEndpoint();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNull(endpoint3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test13");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setSubscriptionDurable(false);
        int i10 = jmsEndpoint2.getIdleConsumerLimit();
        boolean b11 = jmsEndpoint2.isLazyCreateTransactionManager();
        org.apache.camel.component.jms.JmsMessageType jmsMessageType12 = null;
        jmsEndpoint2.setJmsMessageType(jmsMessageType12);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test14");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.EndpointConfiguration endpointConfiguration6 = null;
        jmsEndpoint2.setEndpointConfiguration(endpointConfiguration6);
        org.apache.camel.component.jms.JmsBinding jmsBinding8 = jmsEndpoint2.getBinding();
        java.lang.String str9 = jmsEndpoint2.getDestinationType();
        javax.jms.Destination destination10 = jmsEndpoint2.getDestination();
        jmsEndpoint2.setAsyncConsumer(false);
        int i13 = jmsEndpoint2.getConcurrentConsumers();
        boolean b14 = jmsEndpoint2.isAsyncStopListener();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(jmsBinding8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "topic" + "'", str9.equals("topic"));
        org.junit.Assert.assertNotNull(destination10);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test15");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        jmsEndpoint2.setBridgeErrorHandler(false);
        int i10 = jmsEndpoint2.getReplyToConcurrentConsumers();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy11 = jmsEndpoint2.getJmsKeyFormatStrategy();
        java.lang.String str12 = jmsEndpoint2.getId();
        boolean b13 = jmsEndpoint2.isAutoStartup();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "endpoint656" + "'", str12.equals("endpoint656"));
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test16");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent8 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent8.setTransactionTimeout((int) (short) 0);
        activeMQComponent8.setForceSendOriginalMessage(true);
        activeMQComponent8.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent8.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration17 = activeMQComponent8.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext18 = null;
        activeMQComponent8.setCamelContext(camelContext18);
        activeMQComponent8.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration22 = activeMQComponent8.getConfiguration();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint23 = null;
        org.springframework.jms.core.JmsOperations jmsOperations26 = jmsConfiguration22.createInOnlyTemplate(jmsEndpoint23, true, "failover://tcp://localhost:61616");
        jmsEndpoint2.setMetadataJmsOperations(jmsOperations26);
        jmsEndpoint2.setMessageIdEnabled(true);
        jmsEndpoint2.setBridgeErrorHandler(false);
        boolean b32 = jmsEndpoint2.isAllowNullBody();
        java.lang.String str33 = jmsEndpoint2.getTransactionName();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(componentConfiguration17);
        org.junit.Assert.assertNotNull(jmsConfiguration22);
        org.junit.Assert.assertNotNull(jmsOperations26);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test17");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isSuspendingOrSuspended();
        boolean b6 = activeMQComponent0.isSuspendingOrSuspended();
        activeMQComponent0.setRequestTimeoutCheckerInterval((long) (-1));
        activeMQComponent0.setUsePooledConnection(false);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager11 = null;
        activeMQComponent0.setTransactionManager(platformTransactionManager11);
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }
}

