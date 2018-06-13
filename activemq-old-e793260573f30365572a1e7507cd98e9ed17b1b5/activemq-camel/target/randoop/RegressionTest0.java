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
        java.lang.String str0 = org.apache.camel.component.jms.JmsConfiguration.TEMP_QUEUE_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "temp-queue:" + "'", str0.equals("temp-queue:"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_BROKER_URL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "failover://tcp://localhost:61616" + "'", str0.equals("failover://tcp://localhost:61616"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        try {
            org.apache.activemq.ActiveMQConnection activeMQConnection1 = org.apache.activemq.ActiveMQConnection.makeConnection("temp-queue:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnection.DEFAULT_BROKER_URL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "failover://tcp://localhost:61616" + "'", str0.equals("failover://tcp://localhost:61616"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.activemq.camel.CamelQueue camelQueue0 = null;
        org.apache.camel.Endpoint endpoint1 = null;
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver4 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue0, endpoint1, activeMQSession2, "hi!");
        try {
            javax.jms.Message message6 = camelQueueReceiver4.receive((long) '#');
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException");
        } catch (javax.jms.JMSException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.activemq.ActiveMQConnection.DEFAULT_THREAD_POOL_SIZE = (byte) -1;
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = org.apache.camel.component.jms.JmsConfiguration.TOPIC_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "topic:" + "'", str0.equals("topic:"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval((long) (-1));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        try {
            org.apache.activemq.ActiveMQConnection activeMQConnection1 = org.apache.activemq.ActiveMQConnection.makeConnection("hi!");
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException");
        } catch (javax.jms.JMSException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.activemq.camel.CamelQueue camelQueue0 = null;
        org.apache.camel.Endpoint endpoint1 = null;
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver4 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue0, endpoint1, activeMQSession2, "hi!");
        try {
            javax.jms.Message message5 = camelQueueReceiver4.receive();
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException");
        } catch (javax.jms.JMSException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        javax.jms.Destination destination0 = null;
        try {
            org.apache.camel.component.jms.JmsEndpoint jmsEndpoint1 = org.apache.camel.component.jms.JmsEndpoint.newInstance(destination0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.activemq.camel.converter.ActiveMQConverter activeMQConverter0 = new org.apache.activemq.camel.converter.ActiveMQConverter();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str0 = org.apache.camel.component.jms.JmsConfiguration.TEMP_TOPIC_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "temp-topic:" + "'", str0.equals("temp-topic:"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        activeMQComponent0.setUserName("topic:");
        activeMQComponent0.setForceSendOriginalMessage(true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setExposeListenerSession(true);
        long long5 = activeMQComponent0.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        javax.jms.ConnectionFactory connectionFactory6 = null;
        activeMQComponent0.setConnectionFactory(connectionFactory6);
        java.util.SortedMap<java.lang.String, org.apache.camel.impl.ParameterConfiguration> sortedmap_str_parameterConfiguration8 = activeMQComponent0.getParameterConfigurationMap();
        org.junit.Assert.assertTrue(long5 == 100L);
        org.junit.Assert.assertNotNull(sortedmap_str_parameterConfiguration8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponent(jmsConfiguration0);
        jmsComponent1.resume();
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isSuspendingOrSuspended();
        boolean b6 = activeMQComponent0.isStopped();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.camel.component.jms.DestinationEndpoint destinationEndpoint0 = null;
        org.springframework.jms.support.destination.DestinationResolver destinationResolver1 = org.apache.camel.component.jms.JmsConfiguration.createDestinationResolver(destinationEndpoint0);
        org.junit.Assert.assertNotNull(destinationResolver1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setExposeListenerSession(true);
        long long5 = activeMQComponent0.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        javax.jms.ConnectionFactory connectionFactory6 = null;
        activeMQComponent0.setConnectionFactory(connectionFactory6);
        org.apache.camel.ServiceStatus serviceStatus8 = activeMQComponent0.getStatus();
        org.junit.Assert.assertTrue(long5 == 100L);
        org.junit.Assert.assertTrue("'" + serviceStatus8 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus8.equals(org.apache.camel.ServiceStatus.Stopped));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isStopped();
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedCounter(0);
        java.util.SortedMap<java.lang.String, org.apache.camel.impl.ParameterConfiguration> sortedmap_str_parameterConfiguration8 = activeMQComponent0.getParameterConfigurationMap();
        activeMQComponent0.setClientId("failover://tcp://localhost:61616");
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(sortedmap_str_parameterConfiguration8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnection.DEFAULT_USER;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = null;
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = new org.apache.activemq.camel.component.ActiveMQComponent(activeMQConfiguration0);
        activeMQComponent1.setBrokerURL("temp-topic:");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str0 = org.apache.camel.component.jms.JmsConfiguration.QUEUE_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "queue:" + "'", str0.equals("queue:"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_USER;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int i0 = org.apache.activemq.ActiveMQConnection.DEFAULT_THREAD_POOL_SIZE;
        org.junit.Assert.assertTrue(i0 == (-1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.activemq.ActiveMQConnection.DEFAULT_THREAD_POOL_SIZE = 10;
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        javax.jms.ConnectionFactory connectionFactory5 = null;
        activeMQComponent0.setConnectionFactory(connectionFactory5);
        javax.jms.ExceptionListener exceptionListener7 = null;
        activeMQComponent0.setExceptionListener(exceptionListener7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isStopped();
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedCounter(0);
        java.util.SortedMap<java.lang.String, org.apache.camel.impl.ParameterConfiguration> sortedmap_str_parameterConfiguration8 = activeMQComponent0.getParameterConfigurationMap();
        activeMQComponent0.setUsePooledConnection(true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(sortedmap_str_parameterConfiguration8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setResolvePropertyPlaceholders(false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponent(jmsConfiguration0);
        jmsComponent1.setErrorHandlerLogStackTrace(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setExposeListenerSession(true);
        long long5 = activeMQComponent0.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        org.apache.camel.component.jms.ReplyToType replyToType6 = null;
        activeMQComponent0.setReplyToType(replyToType6);
        boolean b8 = activeMQComponent0.isStopping();
        org.junit.Assert.assertTrue(long5 == 100L);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setExposeListenerSession(true);
        activeMQComponent0.setTransferException(false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnection.DEFAULT_PASSWORD;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isSuspendingOrSuspended();
        activeMQComponent0.setAutoStartup(false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        activeMQComponent0.setUserName("topic:");
        boolean b11 = activeMQComponent0.isSuspendingOrSuspended();
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.ClassLoader classLoader1 = null;
        try {
            java.lang.Class<?> cls2 = org.apache.activemq.camel.component.ActiveMQConfiguration.loadClass("temp-queue:", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isStopped();
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedCounter(0);
        activeMQComponent0.setCorrelationProperty("queue:");
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.activemq.camel.CamelDestination camelDestination1 = new org.apache.activemq.camel.CamelDestination("temp-topic:");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        org.apache.camel.ExchangePattern exchangePattern2 = null;
        try {
            org.apache.camel.Exchange exchange3 = brokerProducer1.createExchange(exchangePattern2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isStopped();
        activeMQComponent0.setAsyncConsumer(true);
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime((long) 10);
        activeMQComponent0.setTransferExchange(false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        try {
            org.apache.camel.Exchange exchange2 = brokerProducer1.createExchange();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        try {
            boolean b2 = brokerProducer1.isSingleton();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.CamelContext camelContext2 = camelTopic1.getCamelContext();
        org.apache.camel.Endpoint endpoint3 = null;
        org.apache.activemq.ActiveMQSession activeMQSession4 = null;
        try {
            org.apache.activemq.camel.CamelMessageProducer camelMessageProducer5 = new org.apache.activemq.camel.CamelMessageProducer((org.apache.activemq.camel.CamelDestination) camelTopic1, endpoint3, activeMQSession4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(camelContext2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.activemq.camel.CamelQueue camelQueue0 = null;
        org.apache.camel.Endpoint endpoint1 = null;
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver4 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue0, endpoint1, activeMQSession2, "hi!");
        javax.jms.Queue queue5 = camelQueueReceiver4.getQueue();
        javax.jms.MessageListener messageListener6 = null;
        camelQueueReceiver4.setMessageListener(messageListener6);
        org.junit.Assert.assertNull(queue5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        org.apache.camel.Exchange exchange2 = null;
        try {
            brokerProducer1.process(exchange2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isStopped();
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedCounter(0);
        java.util.SortedMap<java.lang.String, org.apache.camel.impl.ParameterConfiguration> sortedmap_str_parameterConfiguration8 = activeMQComponent0.getParameterConfigurationMap();
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration9 = null;
        activeMQComponent0.setConfiguration(jmsConfiguration9);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(sortedmap_str_parameterConfiguration8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setLazyCreateTransactionManager(true);
        activeMQComponent0.setTransactionTimeout((int) (short) 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setAllowNullBody(true);
        try {
            activeMQComponent0.setJmsKeyFormatStrategy("failover://tcp://localhost:61616");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isSuspendingOrSuspended();
        boolean b6 = activeMQComponent0.isSuspendingOrSuspended();
        java.util.SortedMap<java.lang.String, org.apache.camel.impl.ParameterConfiguration> sortedmap_str_parameterConfiguration7 = activeMQComponent0.getParameterConfigurationMap();
        activeMQComponent0.setCacheLevel((int) (byte) 100);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(sortedmap_str_parameterConfiguration7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager1 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent2 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0, platformTransactionManager1);
        long long3 = jmsComponent2.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        org.junit.Assert.assertNotNull(jmsComponent2);
        org.junit.Assert.assertTrue(long3 == 100L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.activemq.advisory.DestinationSource destinationSource1 = null;
        org.apache.activemq.camel.component.CamelEndpointLoader camelEndpointLoader2 = new org.apache.activemq.camel.component.CamelEndpointLoader(camelContext0, destinationSource1);
        org.apache.camel.CamelContext camelContext3 = null;
        camelEndpointLoader2.setCamelContext(camelContext3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setExposeListenerSession(true);
        long long5 = activeMQComponent0.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        org.apache.camel.component.jms.ReplyToType replyToType6 = null;
        activeMQComponent0.setReplyToType(replyToType6);
        activeMQComponent0.setDeliveryMode((java.lang.Integer) 0);
        org.apache.camel.component.jms.ReplyToType replyToType10 = null;
        activeMQComponent0.setReplyToType(replyToType10);
        activeMQComponent0.setDurableSubscriptionName("queue:");
        org.junit.Assert.assertTrue(long5 == 100L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.activemq.camel.CamelDestination camelDestination1 = new org.apache.activemq.camel.CamelDestination("failover://tcp://localhost:61616");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelDestination1.getBinding();
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        try {
            javax.jms.MessageProducer messageProducer4 = camelDestination1.createProducer(activeMQSession3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setPubSubNoLocal(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration6 = null;
        activeMQComponent0.setConfiguration(jmsConfiguration6);
        activeMQComponent0.setEagerLoadingOfProperties(false);
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedCounter((int) (byte) 0);
        org.apache.camel.LoggingLevel loggingLevel7 = null;
        activeMQComponent0.setErrorHandlerLoggingLevel(loggingLevel7);
        activeMQComponent0.setReceiveTimeout((long) (byte) 0);
        activeMQComponent0.setCacheLevelName("failover://tcp://localhost:61616");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCopyMessageOnSend(true);
        int i3 = activeMQConnection0.getSendTimeout();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str1 = activeMQConnection0.getTrustedPackages();
        boolean b2 = activeMQConnection0.isMessagePrioritySupported();
        org.apache.activemq.command.ProducerId producerId3 = null;
        try {
            activeMQConnection0.removeProducer(producerId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(list_str1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setRequestTimeout(100L);
        activeMQComponent0.setRequestTimeout(0L);
        activeMQComponent0.setTransferException(true);
        org.apache.camel.component.jms.QueueBrowseStrategy queueBrowseStrategy10 = activeMQComponent0.getQueueBrowseStrategy();
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertNotNull(queueBrowseStrategy10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponent(connectionFactory0);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setLazyCreateTransactionManager(true);
        activeMQComponent0.setAlwaysCopyMessage(false);
        activeMQComponent0.setAcknowledgementMode((int) 'a');
        activeMQComponent0.setBrokerURL("failover://tcp://localhost:61616");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.activemq.camel.component.OriginalDestinationPropagateStrategy originalDestinationPropagateStrategy0 = new org.apache.activemq.camel.component.OriginalDestinationPropagateStrategy();
        javax.jms.Message message1 = null;
        javax.jms.Session session2 = null;
        org.apache.camel.Exchange exchange3 = null;
        java.lang.Throwable throwable4 = null;
        try {
            originalDestinationPropagateStrategy0.onMessageCreated(message1, session2, exchange3, throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponent(jmsConfiguration0);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy2 = jmsComponent1.getHeaderFilterStrategy();
        java.lang.Class<? extends org.apache.camel.Endpoint> cls3 = jmsComponent1.getEndpointClass();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNull(headerFilterStrategy2);
        org.junit.Assert.assertNotNull(cls3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        activeMQComponent0.setUserName("topic:");
        boolean b11 = activeMQComponent0.isStarting();
        activeMQComponent0.setReplyOnTimeoutToMaxConcurrentConsumers((int) (short) 10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent0 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        boolean b1 = brokerComponent0.isStarting();
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent2 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent2.setTransactionTimeout((int) (short) 0);
        activeMQComponent2.setForceSendOriginalMessage(true);
        activeMQComponent2.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent2.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration11 = activeMQComponent2.createComponentConfiguration();
        try {
            java.util.List<java.lang.String> list_str13 = brokerComponent0.completeEndpointPath(componentConfiguration11, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.camel.InvalidPropertyException");
        } catch (org.apache.camel.InvalidPropertyException e) {
        }
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(componentConfiguration11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        jmsConfiguration14.setDeliveryPersistent(true);
        boolean b19 = jmsConfiguration14.isAllowReplyManagerQuickStop();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setOptimizeAcknowledgeTimeOut((long) (-1));
        org.apache.activemq.command.ProducerId producerId3 = null;
        try {
            activeMQConnection0.removeProducer(producerId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent();
        org.junit.Assert.assertNotNull(activeMQComponent0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        try {
            java.lang.String str2 = brokerProducer1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCloseTimeout(0);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent3 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent3.setTransactionTimeout((int) (short) 0);
        activeMQComponent3.setForceSendOriginalMessage(true);
        boolean b8 = activeMQComponent3.isSuspendingOrSuspended();
        boolean b9 = activeMQComponent3.isSuspendingOrSuspended();
        activeMQComponent3.setRequestTimeoutCheckerInterval((long) (-1));
        try {
            activeMQConnection0.onCommand((java.lang.Object) activeMQComponent3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.activemq.camel.CamelDestination camelDestination1 = new org.apache.activemq.camel.CamelDestination("topic:");
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        try {
            javax.jms.QueueSender queueSender3 = camelDestination1.createSender(activeMQSession2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setPubSubNoLocal(false);
        activeMQComponent0.resume();
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isStopped();
        activeMQComponent0.setAsyncConsumer(true);
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime((long) 10);
        activeMQComponent0.setPassword("temp-topic:");
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.lang.String str1 = activeMQConnection0.toString();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ActiveMQConnection {id=ID:roei-main-45321-1522670064475-65:1,clientId=null,started=false}" + "'", str1.equals("ActiveMQConnection {id=ID:roei-main-45321-1522670064475-65:1,clientId=null,started=false}"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration9 = activeMQComponent0.createComponentConfiguration();
        activeMQComponent0.setExposeListenerSession(true);
        boolean b12 = activeMQComponent0.isAllowAutoWiredConnectionFactory();
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration13 = activeMQComponent0.getConfiguration();
        boolean b14 = jmsConfiguration13.isDisableTimeToLive();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(jmsConfiguration13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isStopped();
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedCounter(0);
        activeMQComponent0.setRequestTimeoutCheckerInterval((long) ' ');
        activeMQComponent0.setExplicitQosEnabled(false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setAllowNullBody(true);
        org.springframework.jms.core.JmsOperations jmsOperations6 = null;
        activeMQComponent0.setJmsOperations(jmsOperations6);
        boolean b8 = activeMQComponent0.isRunAllowed();
        activeMQComponent0.setMessageIdEnabled(true);
        java.lang.Class<? extends org.apache.camel.Endpoint> cls11 = activeMQComponent0.getEndpointClass();
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(cls11);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.activemq.camel.CamelQueue camelQueue0 = null;
        org.apache.camel.Endpoint endpoint1 = null;
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver4 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue0, endpoint1, activeMQSession2, "hi!");
        org.apache.activemq.ActiveMQSession activeMQSession5 = camelQueueReceiver4.getSession();
        org.junit.Assert.assertNull(activeMQSession5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isStopped();
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedCounter(0);
        activeMQComponent0.setUseSingleConnection(false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        jmsConfiguration14.setDeliveryPersistent(true);
        int i19 = jmsConfiguration14.getReplyToMaxConcurrentConsumers();
        jmsConfiguration14.setCacheLevel((int) (byte) 100);
        jmsConfiguration14.setAcknowledgementModeName("temp-queue:");
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
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
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent13 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent13.setTransactionTimeout((int) (short) 0);
        activeMQComponent13.setForceSendOriginalMessage(true);
        boolean b18 = activeMQComponent13.isSuspendingOrSuspended();
        activeMQComponent13.setUseMessageIDAsCorrelationID(true);
        camelEndpointLoader2.setComponent(activeMQComponent13);
        activeMQComponent13.setAutoStartup(true);
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertNotNull(activeMQComponent12);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent0 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent1.setTransactionTimeout((int) (short) 0);
        activeMQComponent1.setForceSendOriginalMessage(true);
        activeMQComponent1.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent1.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration10 = activeMQComponent1.createComponentConfiguration();
        try {
            java.util.List<java.lang.String> list_str12 = brokerComponent0.completeEndpointPath(componentConfiguration10, "topic:");
            org.junit.Assert.fail("Expected exception of type org.apache.camel.InvalidPropertyException");
        } catch (org.apache.camel.InvalidPropertyException e) {
        }
        org.junit.Assert.assertNotNull(componentConfiguration10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setForceSendOriginalMessage(false);
        jmsComponent1.setResolvePropertyPlaceholders(true);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.Endpoint endpoint2 = null;
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber7 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, endpoint2, activeMQSession3, "topic:", "hi!", false);
        boolean b8 = camelTopicSubscriber7.isNoLocal();
        try {
            javax.jms.Message message9 = camelTopicSubscriber7.receiveNoWait();
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException");
        } catch (javax.jms.JMSException e) {
        }
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.ActiveMQPrefetchPolicy activeMQPrefetchPolicy1 = null;
        activeMQConnection0.setPrefetchPolicy(activeMQPrefetchPolicy1);
        javax.jms.ConnectionMetaData connectionMetaData3 = activeMQConnection0.getMetaData();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener4 = null;
        activeMQConnection0.setClientInternalExceptionListener(clientInternalExceptionListener4);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(connectionMetaData3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        java.lang.String str17 = jmsConfiguration14.getAcknowledgementModeName();
        jmsConfiguration14.setDurableSubscriptionName("");
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isObjectMessageSerializationDefered();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setAllowNullBody(true);
        activeMQComponent0.start();
        boolean b7 = activeMQComponent0.isAllowAutoWiredConnectionFactory();
        activeMQComponent0.setUseSingleConnection(false);
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
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
        activeMQComponent12.setCorrelationProperty("hi!");
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertNotNull(activeMQComponent12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setClientId("failover://tcp://localhost:61616");
        org.apache.camel.component.jms.QueueBrowseStrategy queueBrowseStrategy5 = null;
        activeMQComponent0.setQueueBrowseStrategy(queueBrowseStrategy5);
        java.lang.String str7 = activeMQComponent0.getVersion();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "2.19.3" + "'", str7.equals("2.19.3"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setOptimizeAcknowledgeTimeOut((long) (-1));
        org.apache.activemq.command.Command command3 = null;
        try {
            org.apache.activemq.command.Response response4 = activeMQConnection0.syncSendPacket(command3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.activemq.camel.CamelDestination camelDestination1 = new org.apache.activemq.camel.CamelDestination("failover://tcp://localhost:61616");
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        try {
            javax.jms.QueueSender queueSender3 = camelDestination1.createSender(activeMQSession2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        jmsConfiguration14.setLazyCreateTransactionManager(true);
        jmsConfiguration14.setMaxConcurrentConsumers((int) (short) 10);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponent(jmsConfiguration0);
        boolean b2 = jmsComponent1.isRunAllowed();
        jmsComponent1.setRecoveryInterval((long) (byte) 10);
        jmsComponent1.setTransacted(false);
        org.apache.camel.component.jms.ReplyToType replyToType7 = null;
        jmsComponent1.setReplyToType(replyToType7);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isTransferFault();
        java.lang.String str18 = jmsConfiguration14.getReplyToOverride();
        org.apache.camel.component.jms.JmsProviderMetadata jmsProviderMetadata19 = null;
        jmsConfiguration14.setProviderMetadata(jmsProviderMetadata19);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        try {
            javax.jms.QueueSender queueSender3 = camelQueue1.createSender(activeMQSession2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
        jmsConfiguration14.setTransactionTimeout(0);
        java.lang.String str18 = jmsConfiguration14.getTransactionName();
        jmsConfiguration14.setReplyToOverride("failover://tcp://localhost:61616");
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        boolean b2 = brokerProducer1.isStarting();
        org.apache.camel.Exchange exchange3 = null;
        org.apache.camel.AsyncCallback asyncCallback4 = null;
        try {
            boolean b5 = brokerProducer1.process(exchange3, asyncCallback4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isTransferFault();
        java.lang.String str18 = jmsConfiguration14.getReplyToOverride();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint19 = null;
        try {
            org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer20 = jmsConfiguration14.createMessageListenerContainer(jmsEndpoint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.CamelContext camelContext2 = camelTopic1.getCamelContext();
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        try {
            javax.jms.TopicPublisher topicPublisher4 = camelTopic1.createPublisher(activeMQSession3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(camelContext2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_BROKER_BIND_URL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tcp://localhost:61616" + "'", str0.equals("tcp://localhost:61616"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isSuspendingOrSuspended();
        boolean b6 = activeMQComponent0.isSuspendingOrSuspended();
        java.util.SortedMap<java.lang.String, org.apache.camel.impl.ParameterConfiguration> sortedmap_str_parameterConfiguration7 = activeMQComponent0.getParameterConfigurationMap();
        int i8 = activeMQComponent0.getWaitForProvisionCorrelationToBeUpdatedCounter();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(sortedmap_str_parameterConfiguration7);
        org.junit.Assert.assertTrue(i8 == 50);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCloseTimeout(0);
        int i3 = activeMQConnection0.getCloseTimeout();
        java.lang.String str4 = activeMQConnection0.getClientID();
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap5 = null;
        activeMQConnection0.setRedeliveryPolicyMap(redeliveryPolicyMap5);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setPubSubNoLocal(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration6 = null;
        activeMQComponent0.setConfiguration(jmsConfiguration6);
        activeMQComponent0.setIdleTaskExecutionLimit((int) (short) 0);
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        jmsConfiguration14.setDeliveryPersistent(true);
        int i19 = jmsConfiguration14.getReplyToMaxConcurrentConsumers();
        boolean b20 = jmsConfiguration14.isReplyToDeliveryPersistent();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.activemq.camel.CamelDestination camelDestination1 = new org.apache.activemq.camel.CamelDestination("");
        try {
            org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelDestination1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str1 = activeMQConnection0.getTrustedPackages();
        boolean b2 = activeMQConnection0.isMessagePrioritySupported();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(list_str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(exceptionListener3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
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
        int i15 = jmsConfiguration14.getReplyToConcurrentConsumers();
        jmsConfiguration14.setDisableTimeToLive(true);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration18 = jmsConfiguration14.copy();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(jmsConfiguration18);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        boolean b2 = brokerProducer1.isStarting();
        try {
            boolean b3 = brokerProducer1.isSingleton();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        jmsConfiguration14.setPassword("temp-topic:");
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCloseTimeout(0);
        int i3 = activeMQConnection0.getCloseTimeout();
        activeMQConnection0.setCloseTimeout((-1));
        activeMQConnection0.setOptimizeAcknowledge(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.camel.component.jms.JmsComponent jmsComponent0 = org.apache.camel.component.jms.JmsComponent.jmsComponent();
        jmsComponent0.setAlwaysCopyMessage(true);
        org.junit.Assert.assertNotNull(jmsComponent0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.activemq.camel.CamelQueue camelQueue0 = null;
        org.apache.camel.Endpoint endpoint1 = null;
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver4 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue0, endpoint1, activeMQSession2, "hi!");
        java.lang.String str5 = camelQueueReceiver4.getMessageSelector();
        org.apache.activemq.ActiveMQSession activeMQSession6 = camelQueueReceiver4.getSession();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(activeMQSession6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
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
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = null;
        org.springframework.jms.core.JmsOperations jmsOperations18 = jmsConfiguration14.createInOnlyTemplate(jmsEndpoint15, true, "failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent19 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent19.setTransactionTimeout((int) (short) 0);
        activeMQComponent19.setForceSendOriginalMessage(true);
        activeMQComponent19.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent19.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration28 = activeMQComponent19.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext29 = null;
        activeMQComponent19.setCamelContext(camelContext29);
        activeMQComponent19.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration33 = activeMQComponent19.getConfiguration();
        boolean b34 = jmsConfiguration33.isMapJmsMessage();
        java.lang.String str35 = jmsConfiguration33.getReplyToDestinationSelectorName();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint36 = null;
        org.springframework.jms.core.JmsOperations jmsOperations40 = jmsConfiguration33.createInOutTemplate(jmsEndpoint36, false, "temp-topic:", (long) 10);
        jmsConfiguration33.setWaitForProvisionCorrelationToBeUpdatedCounter((int) (short) 0);
        org.apache.camel.component.jms.ConsumerType consumerType43 = jmsConfiguration33.getConsumerType();
        jmsConfiguration14.setConsumerType(consumerType43);
        boolean b45 = jmsConfiguration14.isDisableTimeToLive();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertNotNull(jmsOperations18);
        org.junit.Assert.assertNotNull(componentConfiguration28);
        org.junit.Assert.assertNotNull(jmsConfiguration33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(jmsOperations40);
        org.junit.Assert.assertTrue("'" + consumerType43 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType43.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setOptimizeAcknowledgeTimeOut((long) (-1));
        boolean b3 = activeMQConnection0.isUseDedicatedTaskRunner();
        activeMQConnection0.setUseRetroactiveConsumer(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.ActiveMQConnection activeMQConnection1 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection1.setOptimizeAcknowledgeTimeOut((long) (-1));
        activeMQConnection0.removeTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection1);
        boolean b5 = activeMQConnection1.isNestedMapAndListEnabled();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(activeMQConnection1);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setExposeListenerSession(true);
        long long5 = activeMQComponent0.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        org.apache.camel.component.jms.ReplyToType replyToType6 = null;
        activeMQComponent0.setReplyToType(replyToType6);
        activeMQComponent0.setDeliveryMode((java.lang.Integer) 0);
        activeMQComponent0.setAcknowledgementModeName("");
        org.junit.Assert.assertTrue(long5 == 100L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str2 = camelQueue1.getUri();
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        try {
            javax.jms.MessageProducer messageProducer4 = camelQueue1.createProducer(activeMQSession3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "queue:" + "'", str2.equals("queue:"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCloseTimeout(0);
        int i3 = activeMQConnection0.getCloseTimeout();
        boolean b4 = activeMQConnection0.isUseCompression();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isSuspendingOrSuspended();
        boolean b6 = activeMQComponent0.isSuspendingOrSuspended();
        activeMQComponent0.setExposeListenerSession(true);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy9 = null;
        activeMQComponent0.setHeaderFilterStrategy(headerFilterStrategy9);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
        jmsConfiguration14.setAsyncConsumer(true);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
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
        jmsConfiguration14.setTransactionTimeout(0);
        java.lang.String str18 = jmsConfiguration14.getPassword();
        jmsConfiguration14.setReplyToDestinationSelectorName("temp-topic:");
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        jmsConfiguration14.setDeliveryMode((java.lang.Integer) (-1));
        int i19 = jmsConfiguration14.getReplyToConcurrentConsumers();
        java.lang.String str20 = jmsConfiguration14.getReplyToDestinationSelectorName();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setSubscriptionDurable(false);
        try {
            org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer10 = jmsEndpoint2.createMessageListenerContainer();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        boolean b2 = brokerProducer1.isStarting();
        org.apache.camel.Endpoint endpoint3 = brokerProducer1.getEndpoint();
        org.apache.camel.Endpoint endpoint4 = brokerProducer1.getEndpoint();
        org.apache.camel.ExchangePattern exchangePattern5 = null;
        try {
            org.apache.camel.Exchange exchange6 = brokerProducer1.createExchange(exchangePattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(endpoint3);
        org.junit.Assert.assertNull(endpoint4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setAllowNullBody(true);
        org.springframework.jms.core.JmsOperations jmsOperations6 = null;
        activeMQComponent0.setJmsOperations(jmsOperations6);
        org.apache.camel.ServiceStatus serviceStatus8 = activeMQComponent0.getStatus();
        org.springframework.context.ApplicationContext applicationContext9 = null;
        activeMQComponent0.setApplicationContext(applicationContext9);
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertTrue("'" + serviceStatus8 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus8.equals(org.apache.camel.ServiceStatus.Stopped));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedCounter((int) (byte) 0);
        org.springframework.jms.support.converter.MessageConverter messageConverter7 = null;
        activeMQComponent0.setMessageConverter(messageConverter7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.EndpointConfiguration endpointConfiguration6 = null;
        jmsEndpoint2.setEndpointConfiguration(endpointConfiguration6);
        org.springframework.jms.support.converter.MessageConverter messageConverter8 = null;
        jmsEndpoint2.setMessageConverter(messageConverter8);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isStopped();
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedCounter(0);
        boolean b8 = activeMQComponent0.isStarted();
        activeMQComponent0.setReplyToConcurrentConsumers(50);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.activemq.command.ActiveMQDestination activeMQDestination1 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("failover://tcp://localhost:61616");
        java.io.ObjectInput objectInput2 = null;
        try {
            activeMQDestination1.readExternal(objectInput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQDestination1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.Endpoint endpoint2 = null;
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber7 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, endpoint2, activeMQSession3, "topic:", "hi!", false);
        boolean b8 = camelTopicSubscriber7.isNoLocal();
        java.lang.String str9 = camelTopicSubscriber7.getMessageSelector();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isTransferFault();
        org.springframework.core.task.TaskExecutor taskExecutor18 = jmsConfiguration14.getTaskExecutor();
        java.lang.String str19 = jmsConfiguration14.getDurableSubscriptionName();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(taskExecutor18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
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
        jmsConfiguration14.setDeliveryPersistent(false);
        jmsConfiguration14.setReplyToSameDestinationAllowed(true);
        int i20 = jmsConfiguration14.getReplyToMaxConcurrentConsumers();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str1 = activeMQConnection0.getTrustedPackages();
        boolean b2 = activeMQConnection0.isMessagePrioritySupported();
        activeMQConnection0.setDispatchAsync(true);
        activeMQConnection0.setTrustAllPackages(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(list_str1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.Endpoint endpoint2 = null;
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber7 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, endpoint2, activeMQSession3, "topic:", "hi!", false);
        boolean b8 = camelTopicSubscriber7.isNoLocal();
        javax.jms.MessageListener messageListener9 = null;
        camelTopicSubscriber7.setMessageListener(messageListener9);
        boolean b11 = camelTopicSubscriber7.isNoLocal();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.CamelContext camelContext2 = camelTopic1.getCamelContext();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isTestConnectionOnStartup();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber11 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "", "2.19.3", false);
        try {
            javax.jms.Message message12 = camelTopicSubscriber11.receiveNoWait();
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException");
        } catch (javax.jms.JMSException e) {
        }
        org.junit.Assert.assertNull(camelContext2);
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint6 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer7 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint6);
        boolean b8 = brokerProducer7.isStarting();
        org.apache.camel.Endpoint endpoint9 = brokerProducer7.getEndpoint();
        try {
            org.apache.camel.component.jms.JmsConsumer jmsConsumer10 = jmsEndpoint2.createConsumer((org.apache.camel.Processor) brokerProducer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(endpoint9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.activemq.camel.component.CamelEndpointLoader camelEndpointLoader0 = new org.apache.activemq.camel.component.CamelEndpointLoader();
        org.apache.camel.CamelContext camelContext1 = camelEndpointLoader0.getCamelContext();
        org.junit.Assert.assertNull(camelContext1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        boolean b2 = activeMQConnection0.isUseAsyncSend();
        int i3 = activeMQConnection0.getConnectResponseTimeout();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setRequestTimeout(100L);
        activeMQComponent0.setRequestTimeout(0L);
        activeMQComponent0.setTransferException(true);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy10 = activeMQComponent0.getHeaderFilterStrategy();
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertNull(headerFilterStrategy10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.Endpoint endpoint2 = null;
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber7 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, endpoint2, activeMQSession3, "topic:", "hi!", false);
        boolean b8 = camelTopicSubscriber7.isNoLocal();
        javax.jms.Topic topic9 = camelTopicSubscriber7.getTopic();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(topic9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        activeMQComponent0.setUserName("topic:");
        boolean b11 = activeMQComponent0.isStarting();
        org.springframework.context.ApplicationContext applicationContext12 = null;
        activeMQComponent0.setApplicationContext(applicationContext12);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setRequestTimeout(100L);
        activeMQComponent0.setErrorHandlerLogStackTrace(true);
        activeMQComponent0.setReplyToConcurrentConsumers((int) (short) 100);
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        activeMQConnection2.setConsumerExpiryCheckEnabled(true);
        activeMQConnection2.setUseDedicatedTaskRunner(true);
        activeMQConnection2.setWarnAboutUnstartedConnectionTimeout((long) '4');
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.Endpoint endpoint2 = null;
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber7 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, endpoint2, activeMQSession3, "topic:", "hi!", false);
        org.apache.activemq.ActiveMQSession activeMQSession8 = null;
        try {
            javax.jms.QueueReceiver queueReceiver10 = camelTopic1.createReceiver(activeMQSession8, "2.19.3");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
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
        jmsConfiguration14.setTransactionTimeout(0);
        java.lang.Integer i18 = jmsConfiguration14.getDeliveryMode();
        int i19 = jmsConfiguration14.getWaitForProvisionCorrelationToBeUpdatedCounter();
        jmsConfiguration14.setDisableTimeToLive(false);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(i18);
        org.junit.Assert.assertTrue(i19 == 50);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str2 = camelQueue1.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver9 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "temp-topic:");
        jmsEndpoint5.setDisableTimeToLive(true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "queue:" + "'", str2.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
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
        jmsConfiguration14.setTestConnectionOnStartup(false);
        jmsConfiguration14.setCacheLevelName("");
        jmsConfiguration14.setMessageTimestampEnabled(false);
        org.apache.camel.component.jms.JmsProviderMetadata jmsProviderMetadata22 = null;
        jmsConfiguration14.setProviderMetadata(jmsProviderMetadata22);
        boolean b24 = jmsConfiguration14.isMapJmsMessage();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        org.apache.camel.component.jms.ReplyToType replyToType17 = jmsConfiguration14.getReplyToType();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(replyToType17);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
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
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = null;
        org.springframework.jms.core.JmsOperations jmsOperations18 = jmsConfiguration14.createInOnlyTemplate(jmsEndpoint15, true, "failover://tcp://localhost:61616");
        boolean b19 = jmsConfiguration14.isErrorHandlerLogStackTrace();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertNotNull(jmsOperations18);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
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
        java.lang.String str18 = jmsConfiguration14.getReplyTo();
        javax.jms.ExceptionListener exceptionListener19 = null;
        jmsConfiguration14.setExceptionListener(exceptionListener19);
        boolean b21 = jmsConfiguration14.isAllowNullBody();
        jmsConfiguration14.setUsername("2.19.3");
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        int i5 = activeMQConnection0.getProducerWindowSize();
        boolean b6 = activeMQConnection0.isAlwaysSyncSend();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
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
        jmsEndpoint2.setTransferExchange(true);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(componentConfiguration17);
        org.junit.Assert.assertNotNull(jmsConfiguration22);
        org.junit.Assert.assertNotNull(jmsOperations26);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setRequestTimeout(100L);
        activeMQComponent0.setRequestTimeout(0L);
        org.apache.camel.ServiceStatus serviceStatus8 = activeMQComponent0.getStatus();
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertTrue("'" + serviceStatus8 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus8.equals(org.apache.camel.ServiceStatus.Stopped));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.activemq.camel.CamelDestination camelDestination1 = new org.apache.activemq.camel.CamelDestination("jms:topic:queue:");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isTestConnectionOnStartup();
        jmsEndpoint2.setTransactionTimeout((int) ' ');
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = null;
        try {
            jmsEndpoint2.configureProperties(map_str_obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.ClassLoader classLoader1 = null;
        try {
            java.lang.Class<?> cls2 = org.apache.activemq.camel.component.ActiveMQConfiguration.loadClass("queue:", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        jmsConfiguration14.setDeliveryPersistent(true);
        jmsConfiguration14.setAllowSerializedHeaders(false);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str2 = camelQueue1.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver9 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "temp-topic:");
        jmsEndpoint5.setPollingConsumerQueueSize((int) (byte) 0);
        java.lang.String str12 = jmsEndpoint5.getEndpointConfiguredDestinationName();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "queue:" + "'", str2.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setSubscriptionDurable(false);
        org.springframework.jms.core.JmsOperations jmsOperations10 = jmsEndpoint2.getJmsOperations();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(jmsOperations10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        try {
            org.apache.camel.EndpointConfiguration endpointConfiguration10 = activeMQComponent0.createConfiguration("jms:topic:queue:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        jmsConfiguration14.setTransactionTimeout(0);
        jmsConfiguration14.setRecoveryInterval(0L);
        org.springframework.core.task.TaskExecutor taskExecutor20 = null;
        jmsConfiguration14.setTaskExecutor(taskExecutor20);
        org.apache.camel.component.jms.ReplyToType replyToType22 = jmsConfiguration14.getReplyToType();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory23 = jmsConfiguration14.getMessageListenerContainerFactory();
        boolean b24 = jmsConfiguration14.isAsyncStopListener();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(replyToType22);
        org.junit.Assert.assertNull(messageListenerContainerFactory23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str2 = camelQueue1.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver9 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "temp-topic:");
        jmsEndpoint5.setPollingConsumerQueueSize((int) (byte) 0);
        jmsEndpoint5.setTransferFault(false);
        java.lang.String str14 = jmsEndpoint5.getEndpointConfiguredDestinationName();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "queue:" + "'", str2.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_PASSWORD;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
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
        int i16 = jmsConfiguration14.getConcurrentConsumers();
        javax.jms.ExceptionListener exceptionListener17 = jmsConfiguration14.getExceptionListener();
        jmsConfiguration14.setLazyCreateTransactionManager(false);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(exceptionListener17);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
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
        jmsConfiguration14.setUsername("tcp://localhost:61616");
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        boolean b17 = jmsConfiguration14.isDisableTimeToLive();
        boolean b18 = jmsConfiguration14.isForceSendOriginalMessage();
        java.lang.String str19 = jmsConfiguration14.getCorrelationProperty();
        jmsConfiguration14.setAsyncConsumer(false);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        boolean b2 = brokerProducer1.isStarting();
        org.apache.camel.Endpoint endpoint3 = brokerProducer1.getEndpoint();
        org.apache.camel.Endpoint endpoint4 = brokerProducer1.getEndpoint();
        org.apache.camel.Exchange exchange5 = null;
        try {
            org.apache.camel.Exchange exchange6 = brokerProducer1.createExchange(exchange5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(endpoint3);
        org.junit.Assert.assertNull(endpoint4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        boolean b2 = brokerProducer1.isStarting();
        org.apache.camel.Endpoint endpoint3 = brokerProducer1.getEndpoint();
        org.apache.camel.Endpoint endpoint4 = brokerProducer1.getEndpoint();
        org.apache.camel.Exchange exchange5 = null;
        try {
            brokerProducer1.process(exchange5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(endpoint3);
        org.junit.Assert.assertNull(endpoint4);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        activeMQConnection0.setTransactedIndividualAck(false);
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory7 = null;
        activeMQConnection0.setSessionTaskRunner(taskRunnerFactory7);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
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
        int i15 = jmsConfiguration14.getReplyToConcurrentConsumers();
        jmsConfiguration14.setPriority(1);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
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
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent13 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent13.setTransactionTimeout((int) (short) 0);
        activeMQComponent13.setForceSendOriginalMessage(true);
        boolean b18 = activeMQComponent13.isSuspendingOrSuspended();
        activeMQComponent13.setUseMessageIDAsCorrelationID(true);
        camelEndpointLoader2.setComponent(activeMQComponent13);
        activeMQComponent13.setUseMessageIDAsCorrelationID(true);
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertNotNull(activeMQComponent12);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
        org.springframework.jms.support.converter.MessageConverter messageConverter18 = jmsConfiguration14.getMessageConverter();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(messageConverter18);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
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
        int i16 = jmsConfiguration14.getConcurrentConsumers();
        javax.jms.ExceptionListener exceptionListener17 = jmsConfiguration14.getExceptionListener();
        long long18 = jmsConfiguration14.getTimeToLive();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(exceptionListener17);
        org.junit.Assert.assertTrue(long18 == (-1L));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        javax.jms.ConnectionFactory connectionFactory5 = null;
        activeMQComponent0.setConnectionFactory(connectionFactory5);
        activeMQComponent0.setConcurrentConsumers((int) (byte) -1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        jmsEndpoint2.setBridgeErrorHandler(false);
        org.apache.camel.component.jms.JmsMessageType jmsMessageType10 = jmsEndpoint2.getJmsMessageType();
        boolean b11 = jmsEndpoint2.isTransferExchange();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver12 = jmsEndpoint2.getDestinationResolver();
        org.springframework.util.ErrorHandler errorHandler13 = jmsEndpoint2.getErrorHandler();
        org.springframework.jms.core.JmsOperations jmsOperations14 = jmsEndpoint2.getJmsOperations();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jmsMessageType10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(destinationResolver12);
        org.junit.Assert.assertNull(errorHandler13);
        org.junit.Assert.assertNull(jmsOperations14);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.activemq.camel.CamelQueue camelQueue0 = null;
        org.apache.camel.Endpoint endpoint1 = null;
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver4 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue0, endpoint1, activeMQSession2, "hi!");
        java.lang.String str5 = camelQueueReceiver4.getMessageSelector();
        javax.jms.MessageListener messageListener6 = camelQueueReceiver4.getMessageListener();
        java.lang.String str7 = camelQueueReceiver4.getMessageSelector();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(messageListener6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.activemq.camel.CamelQueue camelQueue0 = null;
        org.apache.camel.Endpoint endpoint1 = null;
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver4 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue0, endpoint1, activeMQSession2, "hi!");
        javax.jms.Queue queue5 = camelQueueReceiver4.getQueue();
        try {
            javax.jms.Message message6 = camelQueueReceiver4.receive();
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException");
        } catch (javax.jms.JMSException e) {
        }
        org.junit.Assert.assertNull(queue5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setForceSendOriginalMessage(false);
        jmsComponent1.setSubscriptionDurable(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.ActiveMQPrefetchPolicy activeMQPrefetchPolicy1 = null;
        activeMQConnection0.setPrefetchPolicy(activeMQPrefetchPolicy1);
        activeMQConnection0.setConnectResponseTimeout(10);
        activeMQConnection0.setUseDedicatedTaskRunner(false);
        boolean b7 = activeMQConnection0.isWatchTopicAdvisories();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isUseMessageIDAsCorrelationID();
        java.lang.String str4 = jmsEndpoint2.getTransactionName();
        org.springframework.jms.core.JmsOperations jmsOperations5 = jmsEndpoint2.getJmsOperations();
        org.springframework.jms.core.JmsOperations jmsOperations6 = null;
        jmsEndpoint2.setMetadataJmsOperations(jmsOperations6);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jmsOperations5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        java.io.IOException iOException2 = null;
        activeMQConnection0.onException(iOException2);
        org.apache.activemq.transport.Transport transport4 = activeMQConnection0.getTransport();
        try {
            activeMQConnection0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(transport4);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setRequestTimeout(100L);
        activeMQComponent0.setRequestTimeout(0L);
        activeMQComponent0.setTransferException(true);
        int i10 = activeMQComponent0.getWaitForProvisionCorrelationToBeUpdatedCounter();
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertTrue(i10 == 50);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
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
        boolean b12 = activeMQComponent3.isSuspendingOrSuspended();
        boolean b13 = activeMQComponent3.isStopped();
        activeMQComponent3.setWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime((long) '#');
        activeMQComponent3.setSubscriptionDurable(true);
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
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
        jmsConfiguration14.setDeliveryPersistent(false);
        jmsConfiguration14.setReplyToSameDestinationAllowed(true);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration20 = jmsConfiguration14.copy();
        java.lang.String str21 = jmsConfiguration20.getClientId();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(jmsConfiguration20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isTransferFault();
        javax.jms.ConnectionFactory connectionFactory18 = null;
        jmsConfiguration14.setListenerConnectionFactory(connectionFactory18);
        org.apache.camel.component.jms.JmsMessageType jmsMessageType20 = null;
        jmsConfiguration14.setJmsMessageType(jmsMessageType20);
        org.apache.camel.component.jms.ConsumerType consumerType22 = jmsConfiguration14.getConsumerType();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + consumerType22 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType22.equals(org.apache.camel.component.jms.ConsumerType.Default));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
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
        activeMQComponent12.setExplicitQosEnabled(false);
        activeMQComponent12.setConcurrentConsumers(1);
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertNotNull(activeMQComponent12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.activemq.camel.CamelDestination camelDestination1 = new org.apache.activemq.camel.CamelDestination("");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelDestination1.getBinding();
        org.apache.activemq.camel.converter.ActiveMQMessageConverter activeMQMessageConverter3 = new org.apache.activemq.camel.converter.ActiveMQMessageConverter();
        org.apache.camel.component.jms.JmsBinding jmsBinding4 = activeMQMessageConverter3.getBinding();
        camelDestination1.setBinding(jmsBinding4);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsBinding4);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isTransferFault();
        java.lang.String str18 = jmsConfiguration14.getReplyToOverride();
        int i19 = jmsConfiguration14.getWaitForProvisionCorrelationToBeUpdatedCounter();
        boolean b20 = jmsConfiguration14.isUseMessageIDAsCorrelationID();
        boolean b21 = jmsConfiguration14.isUseMessageIDAsCorrelationID();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(i19 == 50);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setDestinationName("queue:");
        javax.jms.ExceptionListener exceptionListener10 = null;
        jmsEndpoint2.setExceptionListener(exceptionListener10);
        try {
            java.lang.Class<? extends javax.jms.TemporaryTopic> cls12 = jmsEndpoint2.getTemporaryTopicType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setOptimizeAcknowledgeTimeOut((long) (-1));
        boolean b3 = activeMQConnection0.isUseDedicatedTaskRunner();
        activeMQConnection0.setDisableTimeStampsByDefault(true);
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap6 = activeMQConnection0.getRedeliveryPolicyMap();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(redeliveryPolicyMap6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.activemq.camel.CamelQueue camelQueue0 = null;
        org.apache.camel.Endpoint endpoint1 = null;
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver4 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue0, endpoint1, activeMQSession2, "hi!");
        java.lang.String str5 = camelQueueReceiver4.getMessageSelector();
        try {
            javax.jms.Message message6 = camelQueueReceiver4.receiveNoWait();
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException");
        } catch (javax.jms.JMSException e) {
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("failover://tcp://localhost:61616");
        java.lang.String str2 = camelTopic1.getTopicName();
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        try {
            javax.jms.QueueSender queueSender4 = camelTopic1.createSender(activeMQSession3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "failover://tcp://localhost:61616" + "'", str2.equals("failover://tcp://localhost:61616"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.ActiveMQPrefetchPolicy activeMQPrefetchPolicy1 = null;
        activeMQConnection0.setPrefetchPolicy(activeMQPrefetchPolicy1);
        javax.jms.ConnectionMetaData connectionMetaData3 = activeMQConnection0.getMetaData();
        activeMQConnection0.setCheckForDuplicates(true);
        boolean b6 = activeMQConnection0.isUseDedicatedTaskRunner();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(connectionMetaData3);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.cleanUpTempDestinations();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection2.cleanUpTempDestinations();
        org.apache.activemq.ActiveMQPrefetchPolicy activeMQPrefetchPolicy4 = activeMQConnection2.getPrefetchPolicy();
        activeMQConnection0.setPrefetchPolicy(activeMQPrefetchPolicy4);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(activeMQPrefetchPolicy4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setAllowNullBody(true);
        org.springframework.jms.core.JmsOperations jmsOperations6 = null;
        activeMQComponent0.setJmsOperations(jmsOperations6);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy8 = null;
        activeMQComponent0.setHeaderFilterStrategy(headerFilterStrategy8);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy10 = null;
        activeMQComponent0.setHeaderFilterStrategy(headerFilterStrategy10);
        activeMQComponent0.setUseMessageIDAsCorrelationID(true);
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration9 = activeMQComponent0.createComponentConfiguration();
        activeMQComponent0.setExposeListenerSession(true);
        boolean b12 = activeMQComponent0.isAllowAutoWiredConnectionFactory();
        org.springframework.util.ErrorHandler errorHandler13 = null;
        activeMQComponent0.setErrorHandler(errorHandler13);
        boolean b15 = activeMQComponent0.isAllowAutoWiredDestinationResolver();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        java.lang.String str18 = jmsConfiguration14.getCacheLevelName();
        jmsConfiguration14.setAcknowledgementMode(0);
        org.apache.camel.component.jms.EndpointMessageListener endpointMessageListener21 = null;
        try {
            jmsConfiguration14.configureMessageListener(endpointMessageListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
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
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = null;
        org.springframework.jms.core.JmsOperations jmsOperations18 = jmsConfiguration14.createInOnlyTemplate(jmsEndpoint15, true, "failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent19 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent19.setTransactionTimeout((int) (short) 0);
        activeMQComponent19.setForceSendOriginalMessage(true);
        activeMQComponent19.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent19.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration28 = activeMQComponent19.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext29 = null;
        activeMQComponent19.setCamelContext(camelContext29);
        activeMQComponent19.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration33 = activeMQComponent19.getConfiguration();
        boolean b34 = jmsConfiguration33.isMapJmsMessage();
        java.lang.String str35 = jmsConfiguration33.getReplyToDestinationSelectorName();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint36 = null;
        org.springframework.jms.core.JmsOperations jmsOperations40 = jmsConfiguration33.createInOutTemplate(jmsEndpoint36, false, "temp-topic:", (long) 10);
        jmsConfiguration33.setWaitForProvisionCorrelationToBeUpdatedCounter((int) (short) 0);
        org.apache.camel.component.jms.ConsumerType consumerType43 = jmsConfiguration33.getConsumerType();
        jmsConfiguration14.setConsumerType(consumerType43);
        org.springframework.util.ErrorHandler errorHandler45 = jmsConfiguration14.getErrorHandler();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertNotNull(jmsOperations18);
        org.junit.Assert.assertNotNull(componentConfiguration28);
        org.junit.Assert.assertNotNull(jmsConfiguration33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(jmsOperations40);
        org.junit.Assert.assertTrue("'" + consumerType43 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType43.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertNull(errorHandler45);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
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
        jmsConfiguration14.setTransactionTimeout(0);
        java.lang.String str18 = jmsConfiguration14.getTransactionName();
        jmsConfiguration14.setTransferException(true);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.activemq.camel.CamelDestination camelDestination1 = new org.apache.activemq.camel.CamelDestination("");
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        try {
            javax.jms.QueueReceiver queueReceiver4 = camelDestination1.createReceiver(activeMQSession2, "2.19.3");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str2 = camelQueue1.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver9 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "temp-topic:");
        jmsEndpoint5.setTransactedInOut(false);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent12 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent12.setTransactionTimeout((int) (short) 0);
        activeMQComponent12.setForceSendOriginalMessage(true);
        activeMQComponent12.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent12.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration21 = activeMQComponent12.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext22 = null;
        activeMQComponent12.setCamelContext(camelContext22);
        activeMQComponent12.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration26 = activeMQComponent12.getConfiguration();
        boolean b27 = jmsConfiguration26.isMapJmsMessage();
        java.lang.String str28 = jmsConfiguration26.getReplyToDestinationSelectorName();
        boolean b29 = jmsConfiguration26.isAutoStartup();
        java.lang.String str30 = jmsConfiguration26.getReplyTo();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver31 = jmsConfiguration26.getDestinationResolver();
        javax.jms.ConnectionFactory connectionFactory32 = jmsConfiguration26.getConnectionFactory();
        jmsEndpoint5.setTemplateConnectionFactory(connectionFactory32);
        jmsEndpoint5.setEagerLoadingOfProperties(false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "queue:" + "'", str2.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(componentConfiguration21);
        org.junit.Assert.assertNotNull(jmsConfiguration26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(destinationResolver31);
        org.junit.Assert.assertNotNull(connectionFactory32);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str1 = activeMQConnection0.getTrustedPackages();
        boolean b2 = activeMQConnection0.isMessagePrioritySupported();
        org.apache.activemq.management.JMSConnectionStatsImpl jMSConnectionStatsImpl3 = activeMQConnection0.getConnectionStats();
        boolean b4 = activeMQConnection0.isMessagePrioritySupported();
        boolean b5 = activeMQConnection0.isStatsEnabled();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(list_str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(jMSConnectionStatsImpl3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
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
        boolean b12 = activeMQComponent3.isSuspendingOrSuspended();
        org.apache.camel.ServiceStatus serviceStatus13 = activeMQComponent3.getStatus();
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + serviceStatus13 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus13.equals(org.apache.camel.ServiceStatus.Stopped));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        activeMQComponent0.setUserName("topic:");
        activeMQComponent0.setBrokerURL("queue:");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
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
        boolean b20 = jmsConfiguration14.isReplyToDeliveryPersistent();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(replyToType19);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        boolean b17 = jmsConfiguration14.isDisableTimeToLive();
        boolean b18 = jmsConfiguration14.isForceSendOriginalMessage();
        java.lang.String str19 = jmsConfiguration14.getCorrelationProperty();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy20 = null;
        jmsConfiguration14.setMessageCreatedStrategy(messageCreatedStrategy20);
        jmsConfiguration14.setReplyToSameDestinationAllowed(true);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.EndpointConfiguration endpointConfiguration6 = null;
        jmsEndpoint2.setEndpointConfiguration(endpointConfiguration6);
        org.apache.camel.component.jms.JmsBinding jmsBinding8 = jmsEndpoint2.getBinding();
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType9 = jmsEndpoint2.getDefaultTaskExecutorType();
        boolean b10 = jmsEndpoint2.isAsyncStopListener();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(jmsBinding8);
        org.junit.Assert.assertNull(defaultTaskExecutorType9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
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
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = null;
        org.springframework.jms.core.JmsOperations jmsOperations18 = jmsConfiguration14.createInOnlyTemplate(jmsEndpoint15, true, "failover://tcp://localhost:61616");
        jmsConfiguration14.setMessageIdEnabled(false);
        jmsConfiguration14.setWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime((long) 0);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertNotNull(jmsOperations18);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCloseTimeout(0);
        int i3 = activeMQConnection0.getCloseTimeout();
        activeMQConnection0.setNestedMapAndListEnabled(false);
        boolean b6 = activeMQConnection0.isOptimizeAcknowledge();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        boolean b17 = jmsConfiguration14.isDisableTimeToLive();
        boolean b18 = jmsConfiguration14.isForceSendOriginalMessage();
        java.lang.String str19 = jmsConfiguration14.getCorrelationProperty();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy20 = null;
        jmsConfiguration14.setMessageCreatedStrategy(messageCreatedStrategy20);
        boolean b22 = jmsConfiguration14.isForceSendOriginalMessage();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        int i5 = activeMQConnection0.getProducerWindowSize();
        boolean b6 = activeMQConnection0.isUseRetroactiveConsumer();
        activeMQConnection0.setDispatchAsync(true);
        activeMQConnection0.setConsumerExpiryCheckEnabled(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        boolean b17 = jmsConfiguration14.isDisableTimeToLive();
        boolean b18 = jmsConfiguration14.isForceSendOriginalMessage();
        javax.jms.ConnectionFactory connectionFactory19 = null;
        jmsConfiguration14.setListenerConnectionFactory(connectionFactory19);
        boolean b21 = jmsConfiguration14.isPubSubNoLocal();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.activemq.camel.CamelDestination camelDestination0 = new org.apache.activemq.camel.CamelDestination();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.Endpoint endpoint2 = null;
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber7 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, endpoint2, activeMQSession3, "topic:", "hi!", false);
        org.apache.activemq.ActiveMQSession activeMQSession8 = null;
        try {
            javax.jms.TopicSubscriber topicSubscriber11 = camelTopic1.createSubscriber(activeMQSession8, "temp-queue:", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
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
        boolean b12 = activeMQComponent3.isSuspendingOrSuspended();
        boolean b13 = activeMQComponent3.isStopped();
        activeMQComponent3.setUsername("failover://tcp://localhost:61616");
        activeMQComponent3.setIdleTaskExecutionLimit(1);
        activeMQComponent3.setReplyToMaxConcurrentConsumers((int) (byte) -1);
        org.apache.activemq.camel.CamelTopic camelTopic21 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint22 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic21);
        boolean b23 = jmsEndpoint22.isTestConnectionOnStartup();
        boolean b24 = jmsEndpoint22.isAcceptMessagesWhileStopping();
        jmsEndpoint22.setAlwaysCopyMessage(true);
        activeMQComponent3.setEndpointHeaderFilterStrategy((org.apache.camel.Endpoint) jmsEndpoint22);
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(jmsEndpoint22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory17 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory17);
        org.apache.camel.component.jms.ReplyToType replyToType19 = null;
        jmsConfiguration14.setReplyToType(replyToType19);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("temp-topic:");
        org.junit.Assert.assertNotNull(activeMQComponent1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setDeliveryPersistent(true);
        activeMQComponent0.setPriority((int) (byte) -1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        jmsEndpoint2.setBridgeErrorHandler(false);
        org.apache.camel.component.jms.JmsMessageType jmsMessageType10 = jmsEndpoint2.getJmsMessageType();
        boolean b11 = jmsEndpoint2.isTransferExchange();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver12 = jmsEndpoint2.getDestinationResolver();
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent13 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent13.setTransactionTimeout((int) (short) 0);
        activeMQComponent13.setForceSendOriginalMessage(true);
        activeMQComponent13.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent13.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration22 = activeMQComponent13.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext23 = null;
        activeMQComponent13.setCamelContext(camelContext23);
        activeMQComponent13.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration27 = activeMQComponent13.getConfiguration();
        boolean b28 = jmsConfiguration27.isMapJmsMessage();
        java.lang.String str29 = jmsConfiguration27.getReplyToDestinationSelectorName();
        boolean b30 = jmsConfiguration27.isDisableReplyTo();
        org.apache.activemq.camel.CamelQueue camelQueue32 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str33 = camelQueue32.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic35 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint36 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic35);
        boolean b37 = jmsEndpoint36.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession38 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver40 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue32, (org.apache.camel.Endpoint) jmsEndpoint36, activeMQSession38, "temp-topic:");
        jmsEndpoint36.setTransactedInOut(false);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent43 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent43.setTransactionTimeout((int) (short) 0);
        activeMQComponent43.setForceSendOriginalMessage(true);
        activeMQComponent43.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent43.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration52 = activeMQComponent43.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext53 = null;
        activeMQComponent43.setCamelContext(camelContext53);
        activeMQComponent43.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration57 = activeMQComponent43.getConfiguration();
        boolean b58 = jmsConfiguration57.isMapJmsMessage();
        java.lang.String str59 = jmsConfiguration57.getReplyToDestinationSelectorName();
        boolean b60 = jmsConfiguration57.isAutoStartup();
        java.lang.String str61 = jmsConfiguration57.getReplyTo();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver62 = jmsConfiguration57.getDestinationResolver();
        javax.jms.ConnectionFactory connectionFactory63 = jmsConfiguration57.getConnectionFactory();
        jmsEndpoint36.setTemplateConnectionFactory(connectionFactory63);
        jmsConfiguration27.setConnectionFactory(connectionFactory63);
        jmsEndpoint2.setConnectionFactory(connectionFactory63);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jmsMessageType10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(destinationResolver12);
        org.junit.Assert.assertNotNull(componentConfiguration22);
        org.junit.Assert.assertNotNull(jmsConfiguration27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "queue:" + "'", str33.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(componentConfiguration52);
        org.junit.Assert.assertNotNull(jmsConfiguration57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(destinationResolver62);
        org.junit.Assert.assertNotNull(connectionFactory63);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.CamelContext camelContext2 = camelTopic1.getCamelContext();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isTestConnectionOnStartup();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber11 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "", "2.19.3", false);
        java.lang.String str12 = camelTopic1.getTopicName();
        org.apache.activemq.ActiveMQSession activeMQSession13 = null;
        try {
            javax.jms.QueueSender queueSender14 = camelTopic1.createSender(activeMQSession13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNull(camelContext2);
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "temp-topic:" + "'", str12.equals("temp-topic:"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isAsyncStopListener();
        jmsEndpoint2.setIncludeSentJMSMessageID(true);
        jmsEndpoint2.setWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime((long) 50);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isTransferFault();
        org.springframework.core.task.TaskExecutor taskExecutor18 = jmsConfiguration14.getTaskExecutor();
        jmsConfiguration14.setDeliveryPersistent(true);
        jmsConfiguration14.setCorrelationProperty("2.19.3");
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(taskExecutor18);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        activeMQConnection0.setTransactedIndividualAck(false);
        activeMQConnection0.setObjectMessageSerializationDefered(true);
        int i9 = activeMQConnection0.getCloseTimeout();
        activeMQConnection0.setCheckForDuplicates(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertTrue(i9 == 15000);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setLazyCreateTransactionManager(true);
        activeMQComponent0.setAlwaysCopyMessage(false);
        activeMQComponent0.setAcknowledgementMode((int) 'a');
        activeMQComponent0.setBrokerURL("ActiveMQConnection {id=ID:roei-main-45321-1522670064475-65:1,clientId=null,started=false}");
        activeMQComponent0.setUseMessageIDAsCorrelationID(false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setDestinationName("queue:");
        java.lang.String str10 = jmsEndpoint2.getEndpointConfiguredDestinationName();
        boolean b11 = jmsEndpoint2.isReplyToSameDestinationAllowed();
        boolean b12 = jmsEndpoint2.isIncludeAllJMSXProperties();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent1 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        boolean b2 = brokerComponent1.isStarting();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination5 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration6 = new org.apache.activemq.camel.component.broker.BrokerConfiguration();
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint7 = new org.apache.activemq.camel.component.broker.BrokerEndpoint("2.19.3", brokerComponent1, "tcp://localhost:61616", activeMQDestination5, brokerConfiguration6);
        java.io.ObjectOutput objectOutput8 = null;
        try {
            activeMQDestination5.writeExternal(objectOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(activeMQDestination5);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        java.io.IOException iOException2 = null;
        activeMQConnection0.onException(iOException2);
        org.apache.activemq.camel.CamelTopic camelTopic5 = new org.apache.activemq.camel.CamelTopic("queue:");
        javax.jms.ServerSessionPool serverSessionPool7 = null;
        try {
            javax.jms.ConnectionConsumer connectionConsumer9 = activeMQConnection0.createConnectionConsumer((javax.jms.Topic) camelTopic5, "topic:", serverSessionPool7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
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
        java.lang.String str24 = jmsConfiguration14.getCorrelationProperty();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jmsOperations21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
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
        jmsConfiguration14.setTransactionTimeout(0);
        jmsConfiguration14.setErrorHandlerLogStackTrace(false);
        long long20 = jmsConfiguration14.getReceiveTimeout();
        jmsConfiguration14.setReplyToCacheLevelName("JmsConsumer[null]");
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(long20 == 1000L);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy8 = jmsEndpoint2.getJmsKeyFormatStrategy();
        jmsEndpoint2.setWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime((long) (short) -1);
        boolean b11 = jmsEndpoint2.isAsyncStartListener();
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent13 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        boolean b14 = brokerComponent13.isStarting();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination17 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration18 = new org.apache.activemq.camel.component.broker.BrokerConfiguration();
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint19 = new org.apache.activemq.camel.component.broker.BrokerEndpoint("2.19.3", brokerComponent13, "tcp://localhost:61616", activeMQDestination17, brokerConfiguration18);
        org.apache.camel.Producer producer20 = brokerEndpoint19.createProducer();
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent21 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent21.setTransactionTimeout((int) (short) 0);
        activeMQComponent21.setForceSendOriginalMessage(true);
        activeMQComponent21.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent21.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration30 = activeMQComponent21.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext31 = null;
        activeMQComponent21.setCamelContext(camelContext31);
        activeMQComponent21.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration35 = activeMQComponent21.getConfiguration();
        boolean b36 = jmsConfiguration35.isTransactedInOut();
        jmsConfiguration35.setTestConnectionOnStartup(false);
        org.apache.activemq.camel.CamelTopic camelTopic40 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint41 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic40);
        jmsEndpoint41.setIdleTaskExecutionLimit(50);
        boolean b44 = jmsEndpoint41.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy45 = null;
        jmsEndpoint41.setMessageCreatedStrategy(messageCreatedStrategy45);
        jmsEndpoint41.setDestinationName("queue:");
        javax.jms.ExceptionListener exceptionListener49 = null;
        jmsEndpoint41.setExceptionListener(exceptionListener49);
        org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer51 = jmsConfiguration35.chooseMessageListenerContainerImplementation(jmsEndpoint41);
        try {
            org.apache.camel.component.jms.JmsConsumer jmsConsumer52 = jmsEndpoint2.createConsumer((org.apache.camel.Processor) producer20, abstractMessageListenerContainer51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(activeMQDestination17);
        org.junit.Assert.assertNotNull(producer20);
        org.junit.Assert.assertNotNull(componentConfiguration30);
        org.junit.Assert.assertNotNull(jmsConfiguration35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(jmsEndpoint41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(abstractMessageListenerContainer51);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = new org.apache.activemq.camel.component.ActiveMQComponent(camelContext0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
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
        jmsConfiguration14.setAllowNullBody(false);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCloseTimeout(0);
        activeMQConnection0.setConnectResponseTimeout(50);
        org.apache.activemq.command.ProducerId producerId5 = null;
        org.apache.activemq.ActiveMQMessageProducer activeMQMessageProducer6 = null;
        try {
            activeMQConnection0.addProducer(producerId5, activeMQMessageProducer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.EndpointConfiguration endpointConfiguration6 = null;
        jmsEndpoint2.setEndpointConfiguration(endpointConfiguration6);
        org.apache.camel.component.jms.JmsBinding jmsBinding8 = jmsEndpoint2.getBinding();
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType9 = jmsEndpoint2.getDefaultTaskExecutorType();
        jmsEndpoint2.setPollingConsumerBlockWhenFull(true);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(jmsBinding8);
        org.junit.Assert.assertNull(defaultTaskExecutorType9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
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
        org.apache.activemq.camel.CamelTopic camelTopic26 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint27 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic26);
        jmsEndpoint27.setIdleTaskExecutionLimit(50);
        boolean b30 = jmsEndpoint27.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy31 = null;
        jmsEndpoint27.setMessageCreatedStrategy(messageCreatedStrategy31);
        jmsEndpoint27.setSubscriptionDurable(false);
        int i35 = jmsEndpoint27.getIdleConsumerLimit();
        org.apache.camel.ExchangePattern exchangePattern36 = jmsEndpoint27.getExchangePattern();
        org.springframework.jms.core.JmsOperations jmsOperations40 = jmsConfiguration14.createInOutTemplate(jmsEndpoint27, true, "hi!", (long) (byte) 0);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(jmsOperations21);
        org.junit.Assert.assertTrue("'" + consumerType24 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType24.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertNotNull(jmsEndpoint27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue("'" + exchangePattern36 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern36.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(jmsOperations40);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
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
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = null;
        org.springframework.jms.core.JmsOperations jmsOperations18 = jmsConfiguration14.createInOnlyTemplate(jmsEndpoint15, true, "failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent19 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent19.setTransactionTimeout((int) (short) 0);
        activeMQComponent19.setForceSendOriginalMessage(true);
        activeMQComponent19.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent19.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration28 = activeMQComponent19.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext29 = null;
        activeMQComponent19.setCamelContext(camelContext29);
        activeMQComponent19.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration33 = activeMQComponent19.getConfiguration();
        boolean b34 = jmsConfiguration33.isMapJmsMessage();
        java.lang.String str35 = jmsConfiguration33.getReplyToDestinationSelectorName();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint36 = null;
        org.springframework.jms.core.JmsOperations jmsOperations40 = jmsConfiguration33.createInOutTemplate(jmsEndpoint36, false, "temp-topic:", (long) 10);
        jmsConfiguration33.setWaitForProvisionCorrelationToBeUpdatedCounter((int) (short) 0);
        org.apache.camel.component.jms.ConsumerType consumerType43 = jmsConfiguration33.getConsumerType();
        jmsConfiguration14.setConsumerType(consumerType43);
        int i45 = jmsConfiguration14.getCacheLevel();
        jmsConfiguration14.setMessageTimestampEnabled(true);
        jmsConfiguration14.setSubscriptionDurable(true);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertNotNull(jmsOperations18);
        org.junit.Assert.assertNotNull(componentConfiguration28);
        org.junit.Assert.assertNotNull(jmsConfiguration33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(jmsOperations40);
        org.junit.Assert.assertTrue("'" + consumerType43 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType43.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(i45 == (-1));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isUseMessageIDAsCorrelationID();
        int i4 = jmsEndpoint2.getIdleConsumerLimit();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration9 = activeMQComponent0.createComponentConfiguration();
        activeMQComponent0.setExposeListenerSession(true);
        boolean b12 = activeMQComponent0.isAllowAutoWiredConnectionFactory();
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration13 = activeMQComponent0.getConfiguration();
        try {
            jmsConfiguration13.setReplyToOverride("temp-topic:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(jmsConfiguration13);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = null;
        org.springframework.jms.core.JmsOperations jmsOperations18 = jmsConfiguration14.createInOnlyTemplate(jmsEndpoint15, true, "failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent19 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent19.setTransactionTimeout((int) (short) 0);
        activeMQComponent19.setForceSendOriginalMessage(true);
        activeMQComponent19.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent19.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration28 = activeMQComponent19.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext29 = null;
        activeMQComponent19.setCamelContext(camelContext29);
        activeMQComponent19.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration33 = activeMQComponent19.getConfiguration();
        boolean b34 = jmsConfiguration33.isMapJmsMessage();
        java.lang.String str35 = jmsConfiguration33.getReplyToDestinationSelectorName();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint36 = null;
        org.springframework.jms.core.JmsOperations jmsOperations40 = jmsConfiguration33.createInOutTemplate(jmsEndpoint36, false, "temp-topic:", (long) 10);
        jmsConfiguration33.setWaitForProvisionCorrelationToBeUpdatedCounter((int) (short) 0);
        org.apache.camel.component.jms.ConsumerType consumerType43 = jmsConfiguration33.getConsumerType();
        jmsConfiguration14.setConsumerType(consumerType43);
        int i45 = jmsConfiguration14.getCacheLevel();
        jmsConfiguration14.setMessageTimestampEnabled(true);
        javax.jms.ExceptionListener exceptionListener48 = jmsConfiguration14.getExceptionListener();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertNotNull(jmsOperations18);
        org.junit.Assert.assertNotNull(componentConfiguration28);
        org.junit.Assert.assertNotNull(jmsConfiguration33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(jmsOperations40);
        org.junit.Assert.assertTrue("'" + consumerType43 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType43.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertNull(exceptionListener48);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        activeMQConnection0.setTransactedIndividualAck(false);
        activeMQConnection0.setObjectMessageSerializationDefered(true);
        boolean b9 = activeMQConnection0.isNonBlockingRedelivery();
        long long10 = activeMQConnection0.getOptimizeAcknowledgeTimeOut();
        activeMQConnection0.setSendTimeout((int) '#');
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == 300L);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        jmsConfiguration14.setLazyCreateTransactionManager(true);
        int i19 = jmsConfiguration14.getAcknowledgementMode();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
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
        boolean b12 = activeMQComponent3.isSuspendingOrSuspended();
        boolean b13 = activeMQComponent3.isStopped();
        activeMQComponent3.setUsername("failover://tcp://localhost:61616");
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration16 = activeMQComponent3.getConfiguration();
        jmsConfiguration16.setAsyncStopListener(true);
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(jmsConfiguration16);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        org.apache.activemq.camel.CamelQueue camelQueue4 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str5 = camelQueue4.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic7 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic7);
        boolean b9 = jmsEndpoint8.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession10 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver12 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue4, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession10, "temp-topic:");
        jmsEndpoint8.setPollingConsumerQueueSize((int) (byte) 0);
        org.apache.activemq.ActiveMQSession activeMQSession15 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer18 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession15, "2.19.3", true);
        org.apache.camel.component.jms.JmsComponent jmsComponent19 = jmsEndpoint8.getComponent();
        boolean b20 = jmsEndpoint8.isTestConnectionOnStartup();
        java.lang.String str21 = jmsEndpoint8.getReplyToDestinationSelectorName();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "queue:" + "'", str5.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(jmsComponent19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.ActiveMQPrefetchPolicy activeMQPrefetchPolicy1 = null;
        activeMQConnection0.setPrefetchPolicy(activeMQPrefetchPolicy1);
        activeMQConnection0.setConnectResponseTimeout(10);
        org.apache.activemq.command.ConnectionInfo connectionInfo5 = activeMQConnection0.getConnectionInfo();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory6 = null;
        activeMQConnection0.setSessionTaskRunner(taskRunnerFactory6);
        activeMQConnection0.setWatchTopicAdvisories(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(connectionInfo5);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        jmsConfiguration14.setLazyCreateTransactionManager(true);
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy19 = jmsConfiguration14.getMessageCreatedStrategy();
        jmsConfiguration14.setReplyToCacheLevelName("jms:topic:queue:");
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(messageCreatedStrategy19);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setRequestTimeout(100L);
        activeMQComponent0.setRequestTimeout(0L);
        activeMQComponent0.setUsePooledConnection(false);
        activeMQComponent0.setUserName("JmsConsumer[null]");
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setAllowNullBody(true);
        org.springframework.jms.core.JmsOperations jmsOperations6 = null;
        activeMQComponent0.setJmsOperations(jmsOperations6);
        boolean b8 = activeMQComponent0.isRunAllowed();
        activeMQComponent0.resume();
        activeMQComponent0.setAllowReplyManagerQuickStop(false);
        activeMQComponent0.setPreserveMessageQos(true);
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str2 = camelQueue1.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver9 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "temp-topic:");
        jmsEndpoint5.setTransactedInOut(false);
        boolean b12 = jmsEndpoint5.isPreserveMessageQos();
        jmsEndpoint5.setAsyncStopListener(false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "queue:" + "'", str2.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
        int i16 = jmsConfiguration14.getConcurrentConsumers();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = null;
        org.springframework.jms.core.JmsOperations jmsOperations21 = jmsConfiguration14.createInOutTemplate(jmsEndpoint17, true, "failover://tcp://localhost:61616", (long) (short) 100);
        boolean b22 = jmsConfiguration14.isExplicitQosEnabled();
        jmsConfiguration14.setExplicitQosEnabled(false);
        boolean b25 = jmsConfiguration14.isAlwaysCopyMessage();
        org.apache.camel.component.jms.JmsProviderMetadata jmsProviderMetadata26 = null;
        jmsConfiguration14.setProviderMetadata(jmsProviderMetadata26);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNotNull(jmsOperations21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
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
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = null;
        org.springframework.jms.core.JmsOperations jmsOperations18 = jmsConfiguration14.createInOnlyTemplate(jmsEndpoint15, true, "failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent19 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent19.setTransactionTimeout((int) (short) 0);
        activeMQComponent19.setForceSendOriginalMessage(true);
        activeMQComponent19.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent19.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration28 = activeMQComponent19.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext29 = null;
        activeMQComponent19.setCamelContext(camelContext29);
        activeMQComponent19.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration33 = activeMQComponent19.getConfiguration();
        boolean b34 = jmsConfiguration33.isMapJmsMessage();
        java.lang.String str35 = jmsConfiguration33.getReplyToDestinationSelectorName();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint36 = null;
        org.springframework.jms.core.JmsOperations jmsOperations40 = jmsConfiguration33.createInOutTemplate(jmsEndpoint36, false, "temp-topic:", (long) 10);
        jmsConfiguration33.setWaitForProvisionCorrelationToBeUpdatedCounter((int) (short) 0);
        org.apache.camel.component.jms.ConsumerType consumerType43 = jmsConfiguration33.getConsumerType();
        jmsConfiguration14.setConsumerType(consumerType43);
        java.lang.String str45 = jmsConfiguration14.getReplyToDestinationSelectorName();
        javax.jms.ExceptionListener exceptionListener46 = null;
        jmsConfiguration14.setExceptionListener(exceptionListener46);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertNotNull(jmsOperations18);
        org.junit.Assert.assertNotNull(componentConfiguration28);
        org.junit.Assert.assertNotNull(jmsConfiguration33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(jmsOperations40);
        org.junit.Assert.assertTrue("'" + consumerType43 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType43.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
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
        java.lang.String str18 = jmsConfiguration14.getReplyTo();
        long long19 = jmsConfiguration14.getRequestTimeout();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(long19 == 20000L);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        org.apache.activemq.camel.CamelQueue camelQueue4 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str5 = camelQueue4.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic7 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic7);
        boolean b9 = jmsEndpoint8.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession10 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver12 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue4, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession10, "temp-topic:");
        jmsEndpoint8.setPollingConsumerQueueSize((int) (byte) 0);
        org.apache.activemq.ActiveMQSession activeMQSession15 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer18 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession15, "2.19.3", true);
        org.apache.camel.component.jms.JmsComponent jmsComponent19 = jmsEndpoint8.getComponent();
        jmsEndpoint8.setAsyncStartListener(true);
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory22 = jmsEndpoint8.getMessageListenerContainerFactory();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "queue:" + "'", str5.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(jmsComponent19);
        org.junit.Assert.assertNull(messageListenerContainerFactory22);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        boolean b2 = brokerProducer1.isStarting();
        org.apache.camel.Endpoint endpoint3 = brokerProducer1.getEndpoint();
        org.apache.camel.Endpoint endpoint4 = brokerProducer1.getEndpoint();
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent5 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent5.setTransactionTimeout((int) (short) 0);
        activeMQComponent5.setForceSendOriginalMessage(true);
        activeMQComponent5.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent5.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration14 = activeMQComponent5.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext15 = null;
        activeMQComponent5.setCamelContext(camelContext15);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent17 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent17.setTransactionTimeout((int) (short) 0);
        activeMQComponent17.setForceSendOriginalMessage(true);
        activeMQComponent17.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent17.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration26 = activeMQComponent17.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext27 = null;
        activeMQComponent17.setCamelContext(camelContext27);
        activeMQComponent17.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration31 = activeMQComponent17.getConfiguration();
        boolean b32 = jmsConfiguration31.isTransactedInOut();
        org.apache.activemq.camel.component.OriginalDestinationPropagateStrategy originalDestinationPropagateStrategy33 = new org.apache.activemq.camel.component.OriginalDestinationPropagateStrategy();
        jmsConfiguration31.setMessageCreatedStrategy((org.apache.camel.component.jms.MessageCreatedStrategy) originalDestinationPropagateStrategy33);
        activeMQComponent5.setMessageCreatedStrategy((org.apache.camel.component.jms.MessageCreatedStrategy) originalDestinationPropagateStrategy33);
        javax.jms.Message message36 = null;
        javax.jms.Session session37 = null;
        org.apache.activemq.camel.CamelTopic camelTopic39 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint40 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic39);
        jmsEndpoint40.setIdleTaskExecutionLimit(50);
        boolean b43 = jmsEndpoint40.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy44 = null;
        jmsEndpoint40.setMessageCreatedStrategy(messageCreatedStrategy44);
        jmsEndpoint40.setDestinationName("queue:");
        java.lang.String str48 = jmsEndpoint40.getEndpointConfiguredDestinationName();
        jmsEndpoint40.setAllowNullBody(true);
        org.apache.activemq.camel.CamelTopic camelTopic52 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint53 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic52);
        jmsEndpoint53.setIdleTaskExecutionLimit(50);
        boolean b56 = jmsEndpoint53.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy57 = null;
        jmsEndpoint53.setMessageCreatedStrategy(messageCreatedStrategy57);
        jmsEndpoint53.setDestinationName("queue:");
        java.lang.String str61 = jmsEndpoint53.getEndpointConfiguredDestinationName();
        boolean b62 = jmsEndpoint53.isReplyToSameDestinationAllowed();
        boolean b63 = jmsEndpoint53.isAllowReplyManagerQuickStop();
        org.apache.camel.ExchangePattern exchangePattern64 = jmsEndpoint53.getExchangePattern();
        org.apache.camel.Exchange exchange65 = jmsEndpoint40.createExchange(exchangePattern64);
        java.lang.Throwable throwable66 = null;
        originalDestinationPropagateStrategy33.onMessageCreated(message36, session37, exchange65, throwable66);
        try {
            org.apache.camel.Exchange exchange68 = brokerProducer1.createExchange(exchange65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(endpoint3);
        org.junit.Assert.assertNull(endpoint4);
        org.junit.Assert.assertNotNull(componentConfiguration14);
        org.junit.Assert.assertNotNull(componentConfiguration26);
        org.junit.Assert.assertNotNull(jmsConfiguration31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(jmsEndpoint40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(jmsEndpoint53);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + exchangePattern64 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern64.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange65);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setLazyCreateTransactionManager(true);
        activeMQComponent0.setAlwaysCopyMessage(false);
        activeMQComponent0.setAcknowledgementMode((int) 'a');
        activeMQComponent0.setTransactionName("queue:");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setDestinationName("queue:");
        int i10 = jmsEndpoint2.getPollingConsumerQueueSize();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i10 == 1000);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setAuditDepth((int) '4');
        activeMQConnection0.setNestedMapAndListEnabled(false);
        activeMQConnection0.changeUserInfo("failover://tcp://localhost:61616", "queue:");
        org.junit.Assert.assertNotNull(activeMQConnection0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
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
        long long15 = jmsConfiguration14.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        jmsConfiguration14.setReceiveTimeout((long) (short) 10);
        int i18 = jmsConfiguration14.getTransactionTimeout();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(long15 == 100L);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
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
        boolean b17 = jmsConfiguration14.isAutoStartup();
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType18 = jmsConfiguration14.getDefaultTaskExecutorType();
        jmsConfiguration14.setUsername("topic:");
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(defaultTaskExecutorType18);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener5 = activeMQConnection0.getClientInternalExceptionListener();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertNull(clientInternalExceptionListener5);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setPubSubNoLocal(false);
        activeMQComponent0.setAsyncStartListener(false);
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedCounter(1000);
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration9 = activeMQComponent0.createComponentConfiguration();
        activeMQComponent0.setExposeListenerSession(true);
        boolean b12 = activeMQComponent0.isAllowAutoWiredConnectionFactory();
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration13 = activeMQComponent0.getConfiguration();
        javax.jms.ExceptionListener exceptionListener14 = null;
        activeMQComponent0.setExceptionListener(exceptionListener14);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(jmsConfiguration13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str1 = activeMQConnection0.getTrustedPackages();
        boolean b2 = activeMQConnection0.isMessagePrioritySupported();
        activeMQConnection0.setDispatchAsync(true);
        boolean b5 = activeMQConnection0.isOptimizedMessageDispatch();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(list_str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.stop();
        java.lang.String str8 = activeMQComponent0.getVersion();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "2.19.3" + "'", str8.equals("2.19.3"));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
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
        java.lang.String str16 = jmsConfiguration14.getSelector();
        jmsConfiguration14.setAlwaysCopyMessage(true);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setRequestTimeout(100L);
        activeMQComponent0.setRequestTimeout(0L);
        activeMQComponent0.setUsePooledConnection(false);
        activeMQComponent0.setErrorHandlerLogStackTrace(false);
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setRequestTimeout(100L);
        activeMQComponent0.setRequestTimeout(0L);
        org.apache.camel.CamelContext camelContext8 = activeMQComponent0.getCamelContext();
        org.springframework.jms.support.converter.MessageConverter messageConverter9 = null;
        activeMQComponent0.setMessageConverter(messageConverter9);
        activeMQComponent0.setAllowReplyManagerQuickStop(false);
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertNull(camelContext8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setSubscriptionDurable(false);
        jmsEndpoint2.setReplyToDeliveryPersistent(false);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
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
        int i16 = jmsConfiguration14.getConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isMessageTimestampEnabled();
        jmsConfiguration14.setTransacted(false);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("failover://tcp://localhost:61616");
        java.lang.String str2 = camelTopic1.getTopicName();
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        try {
            javax.jms.MessageProducer messageProducer4 = camelTopic1.createProducer(activeMQSession3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "failover://tcp://localhost:61616" + "'", str2.equals("failover://tcp://localhost:61616"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.CamelContext camelContext2 = null;
        camelTopic1.setCamelContext(camelContext2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        boolean b2 = brokerProducer1.isStarting();
        org.apache.camel.Endpoint endpoint3 = brokerProducer1.getEndpoint();
        org.apache.camel.Endpoint endpoint4 = brokerProducer1.getEndpoint();
        try {
            org.apache.camel.Exchange exchange5 = brokerProducer1.createExchange();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(endpoint3);
        org.junit.Assert.assertNull(endpoint4);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy8 = jmsEndpoint2.getJmsKeyFormatStrategy();
        jmsEndpoint2.setReplyTo("tcp://localhost:61616");
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy8);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isTransferFault();
        java.lang.String str18 = jmsConfiguration14.getReplyToOverride();
        long long19 = jmsConfiguration14.getTimeToLive();
        boolean b20 = jmsConfiguration14.isTransferException();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(long19 == (-1L));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration9 = activeMQComponent0.createComponentConfiguration();
        activeMQComponent0.setExposeListenerSession(true);
        boolean b12 = activeMQComponent0.isAllowAutoWiredConnectionFactory();
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration13 = activeMQComponent0.getConfiguration();
        activeMQComponent0.setAcknowledgementMode((int) (byte) 1);
        boolean b16 = activeMQComponent0.isStoppingOrStopped();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(jmsConfiguration13);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCloseTimeout(0);
        int i3 = activeMQConnection0.getCloseTimeout();
        activeMQConnection0.setConsumerExpiryCheckEnabled(false);
        boolean b6 = activeMQConnection0.isOptimizedMessageDispatch();
        activeMQConnection0.doCleanup(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.EndpointConfiguration endpointConfiguration6 = null;
        jmsEndpoint2.setEndpointConfiguration(endpointConfiguration6);
        org.apache.camel.component.jms.JmsBinding jmsBinding8 = jmsEndpoint2.getBinding();
        try {
            java.lang.Class<? extends javax.jms.TemporaryQueue> cls9 = jmsEndpoint2.getTemporaryQueueType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(jmsBinding8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
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
        boolean b12 = activeMQComponent3.isSuspendingOrSuspended();
        boolean b13 = activeMQComponent3.isStopped();
        activeMQComponent3.setUsername("failover://tcp://localhost:61616");
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration16 = activeMQComponent3.getConfiguration();
        org.apache.camel.LoggingLevel loggingLevel17 = jmsConfiguration16.getErrorHandlerLoggingLevel();
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(jmsConfiguration16);
        org.junit.Assert.assertTrue("'" + loggingLevel17 + "' != '" + org.apache.camel.LoggingLevel.WARN + "'", loggingLevel17.equals(org.apache.camel.LoggingLevel.WARN));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isStopped();
        activeMQComponent0.setUsername("topic:");
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isTestConnectionOnStartup();
        jmsEndpoint2.setTransactionTimeout((int) ' ');
        java.lang.String str6 = jmsEndpoint2.getThreadName();
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent8 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        boolean b9 = brokerComponent8.isStarting();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination12 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration13 = new org.apache.activemq.camel.component.broker.BrokerConfiguration();
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint14 = new org.apache.activemq.camel.component.broker.BrokerEndpoint("2.19.3", brokerComponent8, "tcp://localhost:61616", activeMQDestination12, brokerConfiguration13);
        org.apache.activemq.command.ActiveMQDestination activeMQDestination15 = brokerEndpoint14.getDestination();
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer16 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint14);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent17 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent17.setTransactionTimeout((int) (short) 0);
        activeMQComponent17.setForceSendOriginalMessage(true);
        activeMQComponent17.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent17.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration26 = activeMQComponent17.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext27 = null;
        activeMQComponent17.setCamelContext(camelContext27);
        activeMQComponent17.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration31 = activeMQComponent17.getConfiguration();
        boolean b32 = jmsConfiguration31.isTransactedInOut();
        jmsConfiguration31.setTestConnectionOnStartup(false);
        org.apache.activemq.camel.CamelTopic camelTopic36 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint37 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic36);
        jmsEndpoint37.setIdleTaskExecutionLimit(50);
        boolean b40 = jmsEndpoint37.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy41 = null;
        jmsEndpoint37.setMessageCreatedStrategy(messageCreatedStrategy41);
        jmsEndpoint37.setDestinationName("queue:");
        javax.jms.ExceptionListener exceptionListener45 = null;
        jmsEndpoint37.setExceptionListener(exceptionListener45);
        org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer47 = jmsConfiguration31.chooseMessageListenerContainerImplementation(jmsEndpoint37);
        try {
            org.apache.camel.component.jms.JmsConsumer jmsConsumer48 = jmsEndpoint2.createConsumer((org.apache.camel.Processor) brokerProducer16, abstractMessageListenerContainer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "JmsConsumer[null]" + "'", str6.equals("JmsConsumer[null]"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(activeMQDestination12);
        org.junit.Assert.assertNotNull(activeMQDestination15);
        org.junit.Assert.assertNotNull(componentConfiguration26);
        org.junit.Assert.assertNotNull(jmsConfiguration31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(jmsEndpoint37);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(abstractMessageListenerContainer47);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
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
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = null;
        org.springframework.jms.core.JmsOperations jmsOperations18 = jmsConfiguration14.createInOnlyTemplate(jmsEndpoint15, true, "failover://tcp://localhost:61616");
        jmsConfiguration14.setMessageIdEnabled(false);
        jmsConfiguration14.setEagerLoadingOfProperties(true);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertNotNull(jmsOperations18);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isStopped();
        boolean b6 = activeMQComponent0.isRunAllowed();
        javax.jms.ExceptionListener exceptionListener7 = null;
        activeMQComponent0.setExceptionListener(exceptionListener7);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isDisableReplyTo();
        jmsConfiguration14.setConcurrentConsumers((-1));
        jmsConfiguration14.setRecoveryInterval((long) (short) 10);
        boolean b22 = jmsConfiguration14.isAlwaysCopyMessage();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setSubscriptionDurable(false);
        int i10 = jmsEndpoint2.getIdleConsumerLimit();
        boolean b11 = jmsEndpoint2.isLazyCreateTransactionManager();
        java.lang.String str12 = jmsEndpoint2.getEndpointConfiguredDestinationName();
        java.lang.String str13 = jmsEndpoint2.toString();
        jmsEndpoint2.setReplyToMaxConcurrentConsumers(100);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "jms:topic:queue:" + "'", str13.equals("jms:topic:queue:"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        jmsConfiguration14.setLazyCreateTransactionManager(true);
        jmsConfiguration14.setReplyToDeliveryPersistent(true);
        jmsConfiguration14.setPriority((int) (short) 100);
        java.lang.String str23 = jmsConfiguration14.getReplyToOverride();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
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
        jmsConfiguration14.setTestConnectionOnStartup(false);
        jmsConfiguration14.setCacheLevelName("");
        jmsConfiguration14.setMessageTimestampEnabled(false);
        jmsConfiguration14.setAutoStartup(true);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isSuspending();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setOptimizeAcknowledgeTimeOut((long) (-1));
        int i3 = activeMQConnection0.getProtocolVersion();
        activeMQConnection0.setAlwaysSessionAsync(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(i3 == 12);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setDestinationName("queue:");
        java.lang.String str10 = jmsEndpoint2.getEndpointConfiguredDestinationName();
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager11 = jmsEndpoint2.getTransactionManager();
        org.springframework.core.task.TaskExecutor taskExecutor12 = jmsEndpoint2.getTaskExecutor();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(platformTransactionManager11);
        org.junit.Assert.assertNull(taskExecutor12);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isTransferFault();
        org.springframework.core.task.TaskExecutor taskExecutor18 = jmsConfiguration14.getTaskExecutor();
        int i19 = jmsConfiguration14.getPriority();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(taskExecutor18);
        org.junit.Assert.assertTrue(i19 == 4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
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
        java.lang.String str32 = jmsEndpoint2.getClientId();
        javax.jms.ExceptionListener exceptionListener33 = jmsEndpoint2.getExceptionListener();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(componentConfiguration17);
        org.junit.Assert.assertNotNull(jmsConfiguration22);
        org.junit.Assert.assertNotNull(jmsOperations26);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(exceptionListener33);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setAuditDepth((int) '4');
        activeMQConnection0.setNestedMapAndListEnabled(false);
        boolean b5 = activeMQConnection0.isCopyMessageOnSend();
        boolean b6 = activeMQConnection0.isRmIdFromConnectionId();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setAllowNullBody(true);
        org.springframework.jms.core.JmsOperations jmsOperations6 = null;
        activeMQComponent0.setJmsOperations(jmsOperations6);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy8 = null;
        activeMQComponent0.setHeaderFilterStrategy(headerFilterStrategy8);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent10 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent10.setTransactionTimeout((int) (short) 0);
        activeMQComponent10.setForceSendOriginalMessage(true);
        activeMQComponent10.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent10.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration19 = activeMQComponent10.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext20 = null;
        activeMQComponent10.setCamelContext(camelContext20);
        activeMQComponent10.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration24 = activeMQComponent10.getConfiguration();
        boolean b25 = jmsConfiguration24.isTransactedInOut();
        jmsConfiguration24.setTestConnectionOnStartup(false);
        jmsConfiguration24.setCacheLevelName("");
        jmsConfiguration24.setMessageTimestampEnabled(false);
        activeMQComponent0.setConfiguration(jmsConfiguration24);
        jmsConfiguration24.setConcurrentConsumers((int) (short) 10);
        jmsConfiguration24.setWaitForProvisionCorrelationToBeUpdatedCounter((int) (byte) -1);
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertNotNull(componentConfiguration19);
        org.junit.Assert.assertNotNull(jmsConfiguration24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.activemq.camel.converter.ActiveMQMessageConverter activeMQMessageConverter0 = new org.apache.activemq.camel.converter.ActiveMQMessageConverter();
        javax.jms.MessageListener messageListener1 = null;
        org.apache.camel.Processor processor2 = activeMQMessageConverter0.toProcessor(messageListener1);
        javax.jms.MessageListener messageListener3 = null;
        org.apache.camel.Processor processor4 = activeMQMessageConverter0.toProcessor(messageListener3);
        org.junit.Assert.assertNotNull(processor2);
        org.junit.Assert.assertNotNull(processor4);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str2 = camelQueue1.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver9 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "temp-topic:");
        jmsEndpoint5.setReplyToSameDestinationAllowed(false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "queue:" + "'", str2.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setAuditDepth((int) '4');
        org.apache.activemq.command.ConsumerId consumerId3 = null;
        try {
            boolean b4 = activeMQConnection0.hasDispatcher(consumerId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        activeMQConnection0.setTransactedIndividualAck(false);
        boolean b7 = activeMQConnection0.isAlwaysSessionAsync();
        int i8 = activeMQConnection0.getSendTimeout();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        activeMQComponent0.setUserName("topic:");
        boolean b11 = activeMQComponent0.isStarting();
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setPriority((int) 'a');
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        int i5 = activeMQConnection0.getProducerWindowSize();
        org.apache.activemq.util.LongSequenceGenerator longSequenceGenerator6 = activeMQConnection0.getLocalTransactionIdGenerator();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(longSequenceGenerator6);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.camel.component.jms.JmsComponent jmsComponent0 = org.apache.camel.component.jms.JmsComponent.jmsComponent();
        jmsComponent0.setLazyCreateTransactionManager(false);
        org.junit.Assert.assertNotNull(jmsComponent0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
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
        boolean b17 = jmsConfiguration14.isAutoStartup();
        java.lang.String str18 = jmsConfiguration14.getReplyTo();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver19 = jmsConfiguration14.getDestinationResolver();
        javax.jms.ConnectionFactory connectionFactory20 = jmsConfiguration14.getConnectionFactory();
        org.apache.camel.component.jms.JmsComponent jmsComponent21 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory20);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(destinationResolver19);
        org.junit.Assert.assertNotNull(connectionFactory20);
        org.junit.Assert.assertNotNull(jmsComponent21);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.ActiveMQPrefetchPolicy activeMQPrefetchPolicy1 = null;
        activeMQConnection0.setPrefetchPolicy(activeMQPrefetchPolicy1);
        javax.jms.ConnectionMetaData connectionMetaData3 = activeMQConnection0.getMetaData();
        java.lang.String str4 = activeMQConnection0.getClientID();
        java.io.IOException iOException5 = null;
        activeMQConnection0.onException(iOException5);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(connectionMetaData3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.lang.ClassLoader classLoader1 = null;
        try {
            java.lang.Class<?> cls2 = org.apache.activemq.camel.component.ActiveMQConfiguration.loadClass("topic", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setAuditDepth((int) '4');
        activeMQConnection0.stop();
        activeMQConnection0.setExclusiveConsumer(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
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
        boolean b12 = activeMQComponent3.isSuspendingOrSuspended();
        boolean b13 = activeMQComponent3.isStopped();
        activeMQComponent3.setUsername("failover://tcp://localhost:61616");
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration16 = activeMQComponent3.getConfiguration();
        boolean b17 = activeMQComponent3.isStopped();
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(jmsConfiguration16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
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
        org.apache.camel.CamelContext camelContext12 = camelEndpointLoader2.getCamelContext();
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertNull(camelContext12);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isUseMessageIDAsCorrelationID();
        java.lang.String str4 = jmsEndpoint2.getTransactionName();
        try {
            javax.jms.ConnectionFactory connectionFactory5 = jmsEndpoint2.getConnectionFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
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
        boolean b28 = jmsEndpoint2.isExplicitQosEnabled();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(componentConfiguration17);
        org.junit.Assert.assertNotNull(jmsConfiguration22);
        org.junit.Assert.assertNotNull(jmsOperations26);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.activemq.camel.camelplugin.CamelRoutesBrokerPlugin camelRoutesBrokerPlugin0 = new org.apache.activemq.camel.camelplugin.CamelRoutesBrokerPlugin();
        java.lang.String str1 = camelRoutesBrokerPlugin0.getRoutesFile();
        java.lang.String str2 = camelRoutesBrokerPlugin0.getRoutesFile();
        int i3 = camelRoutesBrokerPlugin0.getCheckPeriod();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        activeMQConnection2.setConsumerExpiryCheckEnabled(true);
        activeMQConnection2.setUseDedicatedTaskRunner(true);
        org.apache.activemq.command.ProducerId producerId9 = null;
        try {
            activeMQConnection2.removeProducer(producerId9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setPubSubNoLocal(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration6 = null;
        activeMQComponent0.setConfiguration(jmsConfiguration6);
        activeMQComponent0.setTransferFault(true);
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        org.springframework.jms.support.converter.MessageConverter messageConverter8 = jmsEndpoint2.getMessageConverter();
        java.lang.String str9 = jmsEndpoint2.getVersion();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(messageConverter8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2.19.3" + "'", str9.equals("2.19.3"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        boolean b3 = activeMQComponent0.isStopped();
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.command.BrokerInfo brokerInfo2 = activeMQConnection0.getBrokerInfo();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(brokerInfo2);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
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
        boolean b12 = activeMQComponent3.isSuspendingOrSuspended();
        boolean b13 = activeMQComponent3.isStopped();
        activeMQComponent3.setUsername("failover://tcp://localhost:61616");
        activeMQComponent3.setIdleTaskExecutionLimit(1);
        activeMQComponent3.setBrokerURL("temp-topic:");
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        org.apache.activemq.camel.CamelQueue camelQueue4 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str5 = camelQueue4.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic7 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic7);
        boolean b9 = jmsEndpoint8.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession10 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver12 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue4, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession10, "temp-topic:");
        jmsEndpoint8.setPollingConsumerQueueSize((int) (byte) 0);
        org.apache.activemq.ActiveMQSession activeMQSession15 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer18 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession15, "2.19.3", true);
        org.apache.activemq.camel.CamelTopic camelTopic20 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint21 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic20);
        boolean b22 = jmsEndpoint21.isTestConnectionOnStartup();
        boolean b23 = jmsEndpoint21.isAcceptMessagesWhileStopping();
        jmsEndpoint21.setAlwaysCopyMessage(true);
        org.apache.activemq.ActiveMQSession activeMQSession26 = null;
        try {
            org.apache.activemq.camel.CamelTopicPublisher camelTopicPublisher27 = new org.apache.activemq.camel.CamelTopicPublisher(camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint21, activeMQSession26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "queue:" + "'", str5.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.activemq.camel.CamelDestination camelDestination1 = new org.apache.activemq.camel.CamelDestination("topic:");
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        try {
            javax.jms.TopicSubscriber topicSubscriber5 = camelDestination1.createSubscriber(activeMQSession2, "failover://tcp://localhost:61616", false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setAllowNullBody(true);
        org.springframework.jms.core.JmsOperations jmsOperations6 = null;
        activeMQComponent0.setJmsOperations(jmsOperations6);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy8 = null;
        activeMQComponent0.setHeaderFilterStrategy(headerFilterStrategy8);
        boolean b10 = activeMQComponent0.isResolvePropertyPlaceholders();
        activeMQComponent0.setTestConnectionOnStartup(false);
        activeMQComponent0.setAsyncConsumer(false);
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.ActiveMQPrefetchPolicy activeMQPrefetchPolicy1 = null;
        activeMQConnection0.setPrefetchPolicy(activeMQPrefetchPolicy1);
        activeMQConnection0.setConnectResponseTimeout(10);
        activeMQConnection0.cleanup();
        org.junit.Assert.assertNotNull(activeMQConnection0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        java.io.IOException iOException2 = null;
        activeMQConnection0.onException(iOException2);
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.ActiveMQPrefetchPolicy activeMQPrefetchPolicy1 = null;
        activeMQConnection0.setPrefetchPolicy(activeMQPrefetchPolicy1);
        activeMQConnection0.setConnectResponseTimeout(10);
        activeMQConnection0.setOptimizeAcknowledge(true);
        activeMQConnection0.setOptimizeAcknowledgeTimeOut(300L);
        org.junit.Assert.assertNotNull(activeMQConnection0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
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
        java.lang.String str16 = jmsConfiguration14.getSelector();
        jmsConfiguration14.setWaitForProvisionCorrelationToBeUpdatedCounter(10);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setLazyCreateTransactionManager(true);
        org.apache.camel.component.jms.ReplyToType replyToType3 = null;
        activeMQComponent0.setReplyToType(replyToType3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isTransferFault();
        javax.jms.ConnectionFactory connectionFactory18 = null;
        jmsConfiguration14.setListenerConnectionFactory(connectionFactory18);
        org.apache.camel.component.jms.JmsMessageType jmsMessageType20 = null;
        jmsConfiguration14.setJmsMessageType(jmsMessageType20);
        jmsConfiguration14.setWaitForProvisionCorrelationToBeUpdatedCounter((int) (short) 10);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isStopped();
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedCounter(0);
        activeMQComponent0.setRequestTimeoutCheckerInterval((-1L));
        activeMQComponent0.setAsyncStopListener(true);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
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
        boolean b12 = activeMQComponent3.isSuspendingOrSuspended();
        boolean b13 = activeMQComponent3.isStopped();
        activeMQComponent3.setAcknowledgementMode((int) (byte) 100);
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str1 = activeMQConnection0.getTrustedPackages();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection2.setOptimizeAcknowledgeTimeOut((long) (-1));
        boolean b5 = activeMQConnection2.isRmIdFromConnectionId();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        org.apache.activemq.command.ProducerId producerId7 = null;
        try {
            activeMQConnection2.removeProducer(producerId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(list_str1);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
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
        jmsConfiguration14.setAsyncStopListener(false);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setPubSubNoLocal(false);
        boolean b6 = activeMQComponent0.useRawUri();
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy8 = jmsEndpoint2.getJmsKeyFormatStrategy();
        boolean b9 = jmsEndpoint2.isPubSubNoLocal();
        java.lang.String str10 = jmsEndpoint2.getEndpointConfiguredDestinationName();
        jmsEndpoint2.setReplyToSameDestinationAllowed(false);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setExposeListenerSession(true);
        long long5 = activeMQComponent0.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        org.apache.camel.component.jms.ReplyToType replyToType6 = null;
        activeMQComponent0.setReplyToType(replyToType6);
        activeMQComponent0.setTrustAllPackages(false);
        activeMQComponent0.setConcurrentConsumers((int) (short) 10);
        org.junit.Assert.assertTrue(long5 == 100L);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setDestinationName("queue:");
        java.lang.String str10 = jmsEndpoint2.getEndpointConfiguredDestinationName();
        jmsEndpoint2.setAllowNullBody(true);
        org.apache.activemq.camel.CamelTopic camelTopic14 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic14);
        jmsEndpoint15.setIdleTaskExecutionLimit(50);
        boolean b18 = jmsEndpoint15.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy19 = null;
        jmsEndpoint15.setMessageCreatedStrategy(messageCreatedStrategy19);
        jmsEndpoint15.setDestinationName("queue:");
        java.lang.String str23 = jmsEndpoint15.getEndpointConfiguredDestinationName();
        boolean b24 = jmsEndpoint15.isReplyToSameDestinationAllowed();
        boolean b25 = jmsEndpoint15.isAllowReplyManagerQuickStop();
        org.apache.camel.ExchangePattern exchangePattern26 = jmsEndpoint15.getExchangePattern();
        org.apache.camel.Exchange exchange27 = jmsEndpoint2.createExchange(exchangePattern26);
        org.apache.camel.Processor processor28 = null;
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent29 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent29.setTransactionTimeout((int) (short) 0);
        activeMQComponent29.setForceSendOriginalMessage(true);
        activeMQComponent29.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent29.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration38 = activeMQComponent29.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext39 = null;
        activeMQComponent29.setCamelContext(camelContext39);
        activeMQComponent29.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration43 = activeMQComponent29.getConfiguration();
        boolean b44 = jmsConfiguration43.isTransactedInOut();
        jmsConfiguration43.setTestConnectionOnStartup(false);
        org.apache.activemq.camel.CamelTopic camelTopic48 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint49 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic48);
        jmsEndpoint49.setIdleTaskExecutionLimit(50);
        boolean b52 = jmsEndpoint49.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy53 = null;
        jmsEndpoint49.setMessageCreatedStrategy(messageCreatedStrategy53);
        jmsEndpoint49.setDestinationName("queue:");
        javax.jms.ExceptionListener exceptionListener57 = null;
        jmsEndpoint49.setExceptionListener(exceptionListener57);
        org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer59 = jmsConfiguration43.chooseMessageListenerContainerImplementation(jmsEndpoint49);
        try {
            org.apache.camel.component.jms.JmsConsumer jmsConsumer60 = jmsEndpoint2.createConsumer(processor28, abstractMessageListenerContainer59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jmsEndpoint15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + exchangePattern26 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern26.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange27);
        org.junit.Assert.assertNotNull(componentConfiguration38);
        org.junit.Assert.assertNotNull(jmsConfiguration43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(jmsEndpoint49);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(abstractMessageListenerContainer59);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
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
        jmsConfiguration14.setTransactionTimeout(0);
        jmsConfiguration14.setErrorHandlerLogStackTrace(false);
        long long20 = jmsConfiguration14.getReceiveTimeout();
        boolean b21 = jmsConfiguration14.isPreserveMessageQos();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(long20 == 1000L);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCloseTimeout(0);
        int i3 = activeMQConnection0.getCloseTimeout();
        activeMQConnection0.setConsumerExpiryCheckEnabled(false);
        boolean b6 = activeMQConnection0.isOptimizedMessageDispatch();
        boolean b7 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
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
        jmsConfiguration14.setTestConnectionOnStartup(false);
        boolean b18 = jmsConfiguration14.isDeliveryPersistent();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isTestConnectionOnStartup();
        long long4 = jmsEndpoint2.getTimeToLive();
        boolean b5 = jmsEndpoint2.isTransactedInOut();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(long4 == (-1L));
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent1 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        boolean b2 = brokerComponent1.isStarting();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination5 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration6 = new org.apache.activemq.camel.component.broker.BrokerConfiguration();
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint7 = new org.apache.activemq.camel.component.broker.BrokerEndpoint("2.19.3", brokerComponent1, "tcp://localhost:61616", activeMQDestination5, brokerConfiguration6);
        boolean b8 = brokerEndpoint7.isMultipleConsumersSupported();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(activeMQDestination5);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy8 = jmsEndpoint2.getJmsKeyFormatStrategy();
        boolean b9 = jmsEndpoint2.isPubSubNoLocal();
        java.lang.String str10 = jmsEndpoint2.getEndpointConfiguredDestinationName();
        jmsEndpoint2.setReplyToDeliveryPersistent(true);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isTransferFault();
        javax.jms.ConnectionFactory connectionFactory18 = null;
        jmsConfiguration14.setListenerConnectionFactory(connectionFactory18);
        jmsConfiguration14.setRecoveryInterval((long) (byte) 100);
        jmsConfiguration14.setReplyToOnTimeoutMaxConcurrentConsumers(12);
        org.apache.camel.component.jms.ReplyToType replyToType24 = jmsConfiguration14.getReplyToType();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(replyToType24);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setOptimizeAcknowledgeTimeOut((long) (-1));
        boolean b3 = activeMQConnection0.isUseDedicatedTaskRunner();
        activeMQConnection0.setDisableTimeStampsByDefault(true);
        activeMQConnection0.setStatsEnabled(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isTestConnectionOnStartup();
        boolean b4 = jmsEndpoint2.isAcceptMessagesWhileStopping();
        jmsEndpoint2.setAlwaysCopyMessage(true);
        org.springframework.util.ErrorHandler errorHandler7 = null;
        jmsEndpoint2.setErrorHandler(errorHandler7);
        jmsEndpoint2.setAllowSerializedHeaders(true);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        jmsConfiguration14.setTestConnectionOnStartup(false);
        jmsConfiguration14.setMaxConcurrentConsumers((int) (byte) -1);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType20 = jmsConfiguration14.getDefaultTaskExecutorType();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(defaultTaskExecutorType20);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
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
        boolean b12 = activeMQComponent3.isSuspendingOrSuspended();
        boolean b13 = activeMQComponent3.isStopped();
        activeMQComponent3.setPriority((int) (byte) 100);
        activeMQComponent3.setTrustAllPackages(true);
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
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
        java.lang.String str18 = jmsConfiguration14.getReplyTo();
        java.lang.String str19 = jmsConfiguration14.getReplyToOverride();
        java.lang.String str20 = jmsConfiguration14.getCorrelationProperty();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        boolean b17 = jmsConfiguration14.isDisableTimeToLive();
        boolean b18 = jmsConfiguration14.isDisableReplyTo();
        boolean b19 = jmsConfiguration14.isTransferExchange();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        org.apache.activemq.camel.CamelQueue camelQueue4 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str5 = camelQueue4.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic7 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic7);
        boolean b9 = jmsEndpoint8.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession10 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver12 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue4, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession10, "temp-topic:");
        jmsEndpoint8.setPollingConsumerQueueSize((int) (byte) 0);
        org.apache.activemq.ActiveMQSession activeMQSession15 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer18 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession15, "2.19.3", true);
        org.apache.camel.component.jms.JmsComponent jmsComponent19 = jmsEndpoint8.getComponent();
        boolean b20 = jmsEndpoint8.isTestConnectionOnStartup();
        boolean b21 = jmsEndpoint8.isAllowReplyManagerQuickStop();
        java.lang.String str22 = jmsEndpoint8.getThreadName();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "queue:" + "'", str5.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(jmsComponent19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "JmsConsumer[null]" + "'", str22.equals("JmsConsumer[null]"));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isAsyncStopListener();
        boolean b4 = jmsEndpoint2.isForceSendOriginalMessage();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        boolean b17 = jmsConfiguration14.isDisableTimeToLive();
        boolean b18 = jmsConfiguration14.isForceSendOriginalMessage();
        java.lang.String str19 = jmsConfiguration14.getCorrelationProperty();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy20 = null;
        jmsConfiguration14.setMessageCreatedStrategy(messageCreatedStrategy20);
        boolean b22 = jmsConfiguration14.isReplyToSameDestinationAllowed();
        jmsConfiguration14.setTransactedInOut(true);
        int i25 = jmsConfiguration14.getMaxConcurrentConsumers();
        jmsConfiguration14.setTransferException(false);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
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
        jmsConfiguration14.setTransactionTimeout(0);
        jmsConfiguration14.setRecoveryInterval(0L);
        jmsConfiguration14.setEagerLoadingOfProperties(true);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.activemq.camel.CamelDestination camelDestination1 = new org.apache.activemq.camel.CamelDestination("failover://tcp://localhost:61616");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelDestination1.getBinding();
        java.lang.String str3 = camelDestination1.getUri();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "failover://tcp://localhost:61616" + "'", str3.equals("failover://tcp://localhost:61616"));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str2 = camelQueue1.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver9 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "temp-topic:");
        java.lang.String str10 = jmsEndpoint5.getSelector();
        javax.jms.ExceptionListener exceptionListener11 = null;
        jmsEndpoint5.setExceptionListener(exceptionListener11);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "queue:" + "'", str2.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        long long6 = jmsEndpoint2.getReceiveTimeout();
        jmsEndpoint2.setReceiveTimeout((long) 4);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(long6 == 1000L);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        org.springframework.jms.support.converter.MessageConverter messageConverter8 = jmsEndpoint2.getMessageConverter();
        try {
            javax.jms.ConnectionFactory connectionFactory9 = jmsEndpoint2.getListenerConnectionFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(messageConverter8);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
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
        jmsConfiguration14.setTransactionTimeout(0);
        java.lang.Integer i18 = jmsConfiguration14.getDeliveryMode();
        org.apache.camel.component.jms.JmsProviderMetadata jmsProviderMetadata19 = jmsConfiguration14.getProviderMetadata();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(i18);
        org.junit.Assert.assertNotNull(jmsProviderMetadata19);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        boolean b17 = jmsConfiguration14.isDisableTimeToLive();
        boolean b18 = jmsConfiguration14.isForceSendOriginalMessage();
        jmsConfiguration14.setAcknowledgementMode((int) '#');
        jmsConfiguration14.setReplyToMaxConcurrentConsumers(100);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
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
        boolean b17 = jmsConfiguration14.isAutoStartup();
        java.lang.String str18 = jmsConfiguration14.getReplyTo();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver19 = jmsConfiguration14.getDestinationResolver();
        org.springframework.jms.support.converter.MessageConverter messageConverter20 = jmsConfiguration14.getMessageConverter();
        long long21 = jmsConfiguration14.getTimeToLive();
        org.apache.camel.component.jms.ReplyToType replyToType22 = null;
        jmsConfiguration14.setReplyToType(replyToType22);
        java.lang.Integer i24 = jmsConfiguration14.getDeliveryMode();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(destinationResolver19);
        org.junit.Assert.assertNull(messageConverter20);
        org.junit.Assert.assertTrue(long21 == (-1L));
        org.junit.Assert.assertNull(i24);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setForceSendOriginalMessage(false);
        jmsComponent1.setReplyToCacheLevelName("queue:");
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
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
        long long15 = jmsConfiguration14.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        jmsConfiguration14.setReceiveTimeout((long) (short) 10);
        javax.jms.ConnectionFactory connectionFactory18 = null;
        jmsConfiguration14.setConnectionFactory(connectionFactory18);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(long15 == 100L);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.ActiveMQPrefetchPolicy activeMQPrefetchPolicy1 = null;
        activeMQConnection0.setPrefetchPolicy(activeMQPrefetchPolicy1);
        activeMQConnection0.setConnectResponseTimeout(10);
        org.apache.activemq.command.ConnectionInfo connectionInfo5 = activeMQConnection0.getConnectionInfo();
        org.apache.activemq.ActiveMQConnection activeMQConnection6 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection6.setObjectMessageSerializationDefered(true);
        org.apache.activemq.command.ConnectionInfo connectionInfo9 = activeMQConnection6.getConnectionInfo();
        activeMQConnection0.removeTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection6);
        activeMQConnection0.setConnectResponseTimeout((int) 'a');
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(connectionInfo5);
        org.junit.Assert.assertNotNull(activeMQConnection6);
        org.junit.Assert.assertNotNull(connectionInfo9);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration9 = activeMQComponent0.createComponentConfiguration();
        activeMQComponent0.setExposeListenerSession(true);
        activeMQComponent0.start();
        org.junit.Assert.assertNotNull(componentConfiguration9);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy8 = jmsEndpoint2.getJmsKeyFormatStrategy();
        boolean b9 = jmsEndpoint2.isPubSubNoLocal();
        int i10 = jmsEndpoint2.getReplyToOnTimeoutMaxConcurrentConsumers();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isTestConnectionOnStartup();
        boolean b4 = jmsEndpoint2.isAcceptMessagesWhileStopping();
        jmsEndpoint2.setAlwaysCopyMessage(true);
        java.lang.String str7 = jmsEndpoint2.getDestinationName();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        org.apache.activemq.camel.CamelQueue camelQueue4 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str5 = camelQueue4.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic7 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic7);
        boolean b9 = jmsEndpoint8.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession10 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver12 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue4, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession10, "temp-topic:");
        jmsEndpoint8.setPollingConsumerQueueSize((int) (byte) 0);
        org.apache.activemq.ActiveMQSession activeMQSession15 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer18 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession15, "2.19.3", true);
        org.apache.camel.component.jms.JmsComponent jmsComponent19 = jmsEndpoint8.getComponent();
        jmsEndpoint8.setAsyncStartListener(true);
        jmsEndpoint8.setForceSendOriginalMessage(false);
        boolean b24 = jmsEndpoint8.isAcceptMessagesWhileStopping();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "queue:" + "'", str5.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(jmsComponent19);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setDestinationName("queue:");
        java.lang.String str10 = jmsEndpoint2.getEndpointConfiguredDestinationName();
        jmsEndpoint2.setAllowNullBody(true);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager13 = jmsEndpoint2.getTransactionManager();
        jmsEndpoint2.setAllowReplyManagerQuickStop(true);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(platformTransactionManager13);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setAllowNullBody(true);
        org.springframework.jms.core.JmsOperations jmsOperations6 = null;
        activeMQComponent0.setJmsOperations(jmsOperations6);
        org.apache.camel.ServiceStatus serviceStatus8 = activeMQComponent0.getStatus();
        activeMQComponent0.setIncludeAllJMSXProperties(true);
        long long11 = activeMQComponent0.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertTrue("'" + serviceStatus8 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus8.equals(org.apache.camel.ServiceStatus.Stopped));
        org.junit.Assert.assertTrue(long11 == 100L);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setDestinationName("queue:");
        java.lang.String str10 = jmsEndpoint2.getEndpointConfiguredDestinationName();
        jmsEndpoint2.setAllowNullBody(false);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        jmsConfiguration14.setDeliveryMode((java.lang.Integer) (-1));
        java.lang.String str19 = jmsConfiguration14.getAcknowledgementModeName();
        java.lang.String str20 = jmsConfiguration14.getUsername();
        org.apache.activemq.camel.CamelTopic camelTopic22 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint23 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic22);
        jmsEndpoint23.setIdleTaskExecutionLimit(50);
        java.lang.String str26 = jmsEndpoint23.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler27 = null;
        jmsEndpoint23.setExceptionHandler(exceptionHandler27);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy29 = jmsEndpoint23.getJmsKeyFormatStrategy();
        jmsConfiguration14.setJmsKeyFormatStrategy(jmsKeyFormatStrategy29);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "temp-queue:" + "'", str20.equals("temp-queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy29);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setLazyCreateTransactionManager(false);
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.stop();
        javax.jms.ConnectionFactory connectionFactory8 = null;
        activeMQComponent0.setConnectionFactory(connectionFactory8);
        activeMQComponent0.setMessageTimestampEnabled(false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        boolean b2 = activeMQConnection0.isUseAsyncSend();
        activeMQConnection0.changeUserInfo("2.19.3", "tcp://localhost:61616");
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setLazyCreateTransactionManager(true);
        activeMQComponent0.setAlwaysCopyMessage(false);
        activeMQComponent0.setDeliveryPersistent(false);
        activeMQComponent0.setAsyncStartListener(false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.activemq.camel.CamelTopic camelTopic3 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint4 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic3);
        boolean b5 = jmsEndpoint4.isTestConnectionOnStartup();
        boolean b6 = jmsEndpoint4.isAcceptMessagesWhileStopping();
        jmsEndpoint4.setAlwaysCopyMessage(true);
        org.springframework.util.ErrorHandler errorHandler9 = null;
        jmsEndpoint4.setErrorHandler(errorHandler9);
        java.lang.String str11 = jmsEndpoint4.getReplyTo();
        org.apache.activemq.ActiveMQSession activeMQSession12 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber16 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint4, activeMQSession12, "topic", "failover://tcp://localhost:61616", true);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = null;
        jmsEndpoint4.setConsumerProperties(map_str_obj17);
        org.apache.camel.LoggingLevel loggingLevel19 = jmsEndpoint4.getErrorHandlerLoggingLevel();
        org.junit.Assert.assertNotNull(jmsEndpoint4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + loggingLevel19 + "' != '" + org.apache.camel.LoggingLevel.WARN + "'", loggingLevel19.equals(org.apache.camel.LoggingLevel.WARN));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.ActiveMQPrefetchPolicy activeMQPrefetchPolicy1 = null;
        activeMQConnection0.setPrefetchPolicy(activeMQPrefetchPolicy1);
        activeMQConnection0.setConnectResponseTimeout(10);
        activeMQConnection0.setUseDedicatedTaskRunner(false);
        long long7 = activeMQConnection0.getTimeCreated();
        boolean b8 = activeMQConnection0.isNonBlockingRedelivery();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(long7 == 1522670147880L);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        jmsEndpoint2.setBridgeErrorHandler(false);
        int i10 = jmsEndpoint2.getReplyToConcurrentConsumers();
        jmsEndpoint2.setTimeToLive((long) (byte) 100);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setDestinationName("queue:");
        java.lang.String str10 = jmsEndpoint2.getEndpointConfiguredDestinationName();
        boolean b11 = jmsEndpoint2.isReplyToSameDestinationAllowed();
        boolean b12 = jmsEndpoint2.isAllowReplyManagerQuickStop();
        boolean b13 = jmsEndpoint2.isMessageTimestampEnabled();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        java.lang.String str17 = jmsConfiguration14.getReplyToCacheLevelName();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str1 = activeMQConnection0.getTrustedPackages();
        boolean b2 = activeMQConnection0.isMessagePrioritySupported();
        activeMQConnection0.setDispatchAsync(true);
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy5 = null;
        activeMQConnection0.setRedeliveryPolicy(redeliveryPolicy5);
        activeMQConnection0.setMaxThreadPoolSize((int) (short) 1);
        boolean b9 = activeMQConnection0.isSendAcksAsync();
        boolean b10 = activeMQConnection0.isUseDedicatedTaskRunner();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(list_str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
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
        int i16 = jmsConfiguration14.getConcurrentConsumers();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = null;
        org.springframework.jms.core.JmsOperations jmsOperations21 = jmsConfiguration14.createInOutTemplate(jmsEndpoint17, true, "failover://tcp://localhost:61616", (long) (short) 100);
        boolean b22 = jmsConfiguration14.isExplicitQosEnabled();
        jmsConfiguration14.setExplicitQosEnabled(false);
        jmsConfiguration14.setWaitForProvisionCorrelationToBeUpdatedCounter(50);
        jmsConfiguration14.setSubscriptionDurable(true);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNotNull(jmsOperations21);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        jmsEndpoint2.setBridgeErrorHandler(false);
        int i10 = jmsEndpoint2.getMaxConcurrentConsumers();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        jmsEndpoint2.setBridgeErrorHandler(false);
        int i10 = jmsEndpoint2.getReplyToConcurrentConsumers();
        javax.jms.Message message11 = null;
        javax.jms.Session session12 = null;
        org.apache.camel.Exchange exchange13 = jmsEndpoint2.createExchange(message11, session12);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(exchange13);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.Endpoint endpoint2 = null;
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber7 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, endpoint2, activeMQSession3, "topic:", "hi!", false);
        org.apache.activemq.ActiveMQSession activeMQSession8 = null;
        try {
            javax.jms.TopicSubscriber topicSubscriber11 = camelTopic1.createSubscriber(activeMQSession8, "tcp://localhost:61616", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        activeMQConnection0.setTransactedIndividualAck(false);
        activeMQConnection0.setObjectMessageSerializationDefered(true);
        boolean b9 = activeMQConnection0.isNonBlockingRedelivery();
        boolean b10 = activeMQConnection0.isUserSpecifiedClientID();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str1 = activeMQConnection0.getTrustedPackages();
        boolean b2 = activeMQConnection0.isMessagePrioritySupported();
        activeMQConnection0.setDispatchAsync(true);
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy5 = null;
        activeMQConnection0.setRedeliveryPolicy(redeliveryPolicy5);
        boolean b7 = activeMQConnection0.isUseDedicatedTaskRunner();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(list_str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setRequestTimeout(100L);
        activeMQComponent0.setRequestTimeout(0L);
        activeMQComponent0.setTransferException(true);
        activeMQComponent0.setReceiveTimeout((long) (-1));
        activeMQComponent0.setLazyCreateTransactionManager(true);
        activeMQComponent0.setConcurrentConsumers((-1));
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str2 = camelQueue1.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver9 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "temp-topic:");
        jmsEndpoint5.setTransactedInOut(false);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent12 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent12.setTransactionTimeout((int) (short) 0);
        activeMQComponent12.setForceSendOriginalMessage(true);
        activeMQComponent12.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent12.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration21 = activeMQComponent12.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext22 = null;
        activeMQComponent12.setCamelContext(camelContext22);
        activeMQComponent12.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration26 = activeMQComponent12.getConfiguration();
        boolean b27 = jmsConfiguration26.isMapJmsMessage();
        java.lang.String str28 = jmsConfiguration26.getReplyToDestinationSelectorName();
        boolean b29 = jmsConfiguration26.isAutoStartup();
        java.lang.String str30 = jmsConfiguration26.getReplyTo();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver31 = jmsConfiguration26.getDestinationResolver();
        javax.jms.ConnectionFactory connectionFactory32 = jmsConfiguration26.getConnectionFactory();
        jmsEndpoint5.setTemplateConnectionFactory(connectionFactory32);
        org.apache.camel.component.jms.JmsComponent jmsComponent34 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory32);
        try {
            org.apache.camel.EndpointConfiguration endpointConfiguration36 = jmsComponent34.createConfiguration("topic:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "queue:" + "'", str2.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(componentConfiguration21);
        org.junit.Assert.assertNotNull(jmsConfiguration26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(destinationResolver31);
        org.junit.Assert.assertNotNull(connectionFactory32);
        org.junit.Assert.assertNotNull(jmsComponent34);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        boolean b17 = jmsConfiguration14.isDisableTimeToLive();
        boolean b18 = jmsConfiguration14.isForceSendOriginalMessage();
        jmsConfiguration14.setAcknowledgementMode((int) '#');
        jmsConfiguration14.setReplyToMaxConcurrentConsumers((int) (byte) 0);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isTestConnectionOnStartup();
        int i4 = jmsEndpoint2.getMaxConcurrentConsumers();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration9 = activeMQComponent0.createComponentConfiguration();
        activeMQComponent0.setExposeListenerSession(true);
        boolean b12 = activeMQComponent0.isRunAllowed();
        org.springframework.core.task.TaskExecutor taskExecutor13 = null;
        activeMQComponent0.setTaskExecutor(taskExecutor13);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isStopped();
        activeMQComponent0.setAsyncConsumer(true);
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime((long) 10);
        activeMQComponent0.setLazyCreateTransactionManager(false);
        activeMQComponent0.setRecoveryInterval((long) (byte) 0);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedCounter((int) (byte) 0);
        org.apache.camel.LoggingLevel loggingLevel7 = null;
        activeMQComponent0.setErrorHandlerLoggingLevel(loggingLevel7);
        activeMQComponent0.setReceiveTimeout((long) (byte) 0);
        activeMQComponent0.setMessageTimestampEnabled(true);
        activeMQComponent0.setAsyncStartListener(false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
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
        javax.jms.ConnectionFactory connectionFactory15 = jmsConfiguration14.getConnectionFactory();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertNotNull(connectionFactory15);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCloseTimeout(0);
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory3 = activeMQConnection0.getSessionTaskRunner();
        activeMQConnection0.setDefaultClientID("temp-queue:");
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(taskRunnerFactory3);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
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
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = null;
        org.springframework.jms.core.JmsOperations jmsOperations18 = jmsConfiguration14.createInOnlyTemplate(jmsEndpoint15, true, "failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent19 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent19.setTransactionTimeout((int) (short) 0);
        activeMQComponent19.setForceSendOriginalMessage(true);
        activeMQComponent19.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent19.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration28 = activeMQComponent19.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext29 = null;
        activeMQComponent19.setCamelContext(camelContext29);
        activeMQComponent19.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration33 = activeMQComponent19.getConfiguration();
        boolean b34 = jmsConfiguration33.isMapJmsMessage();
        java.lang.String str35 = jmsConfiguration33.getReplyToDestinationSelectorName();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint36 = null;
        org.springframework.jms.core.JmsOperations jmsOperations40 = jmsConfiguration33.createInOutTemplate(jmsEndpoint36, false, "temp-topic:", (long) 10);
        jmsConfiguration33.setWaitForProvisionCorrelationToBeUpdatedCounter((int) (short) 0);
        org.apache.camel.component.jms.ConsumerType consumerType43 = jmsConfiguration33.getConsumerType();
        jmsConfiguration14.setConsumerType(consumerType43);
        int i45 = jmsConfiguration14.getCacheLevel();
        jmsConfiguration14.setReplyToOverride("topic");
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertNotNull(jmsOperations18);
        org.junit.Assert.assertNotNull(componentConfiguration28);
        org.junit.Assert.assertNotNull(jmsConfiguration33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(jmsOperations40);
        org.junit.Assert.assertTrue("'" + consumerType43 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType43.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(i45 == (-1));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration9 = activeMQComponent0.createComponentConfiguration();
        activeMQComponent0.setExposeListenerSession(true);
        boolean b12 = activeMQComponent0.isAllowAutoWiredConnectionFactory();
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration13 = activeMQComponent0.getConfiguration();
        activeMQComponent0.setAcknowledgementMode((int) (byte) 1);
        activeMQComponent0.setDeliveryPersistent(false);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(jmsConfiguration13);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy8 = jmsEndpoint2.getJmsKeyFormatStrategy();
        java.lang.String str9 = jmsEndpoint2.getReplyToCacheLevelName();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isTransferFault();
        java.lang.String str18 = jmsConfiguration14.getReplyToOverride();
        int i19 = jmsConfiguration14.getWaitForProvisionCorrelationToBeUpdatedCounter();
        boolean b20 = jmsConfiguration14.isUseMessageIDAsCorrelationID();
        long long21 = jmsConfiguration14.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(i19 == 50);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(long21 == 100L);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        java.io.IOException iOException2 = null;
        activeMQConnection0.onException(iOException2);
        org.apache.activemq.transport.Transport transport4 = activeMQConnection0.getTransport();
        activeMQConnection0.setUseRetroactiveConsumer(false);
        boolean b7 = activeMQConnection0.isDisableTimeStampsByDefault();
        activeMQConnection0.setAuditDepth(0);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(transport4);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        activeMQConnection0.setTransactedIndividualAck(false);
        activeMQConnection0.setWatchTopicAdvisories(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        activeMQComponent0.setUserName("topic:");
        boolean b11 = activeMQComponent0.isStarting();
        activeMQComponent0.setForceSendOriginalMessage(true);
        org.springframework.util.ErrorHandler errorHandler14 = null;
        activeMQComponent0.setErrorHandler(errorHandler14);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType16 = null;
        activeMQComponent0.setDefaultTaskExecutorType(defaultTaskExecutorType16);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.ActiveMQPrefetchPolicy activeMQPrefetchPolicy1 = null;
        activeMQConnection0.setPrefetchPolicy(activeMQPrefetchPolicy1);
        activeMQConnection0.setConnectResponseTimeout(10);
        org.apache.activemq.command.ConnectionInfo connectionInfo5 = activeMQConnection0.getConnectionInfo();
        org.apache.activemq.ActiveMQConnection activeMQConnection6 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection6.setObjectMessageSerializationDefered(true);
        org.apache.activemq.command.ConnectionInfo connectionInfo9 = activeMQConnection6.getConnectionInfo();
        activeMQConnection0.removeTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection6);
        int i11 = activeMQConnection0.getProducerWindowSize();
        org.apache.activemq.util.LongSequenceGenerator longSequenceGenerator12 = activeMQConnection0.getLocalTransactionIdGenerator();
        activeMQConnection0.setConsumerExpiryCheckEnabled(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(connectionInfo5);
        org.junit.Assert.assertNotNull(activeMQConnection6);
        org.junit.Assert.assertNotNull(connectionInfo9);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(longSequenceGenerator12);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str2 = camelQueue1.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver9 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "temp-topic:");
        jmsEndpoint5.setTransactedInOut(false);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent12 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent12.setTransactionTimeout((int) (short) 0);
        activeMQComponent12.setForceSendOriginalMessage(true);
        activeMQComponent12.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent12.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration21 = activeMQComponent12.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext22 = null;
        activeMQComponent12.setCamelContext(camelContext22);
        activeMQComponent12.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration26 = activeMQComponent12.getConfiguration();
        boolean b27 = jmsConfiguration26.isMapJmsMessage();
        java.lang.String str28 = jmsConfiguration26.getReplyToDestinationSelectorName();
        boolean b29 = jmsConfiguration26.isAutoStartup();
        java.lang.String str30 = jmsConfiguration26.getReplyTo();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver31 = jmsConfiguration26.getDestinationResolver();
        javax.jms.ConnectionFactory connectionFactory32 = jmsConfiguration26.getConnectionFactory();
        jmsEndpoint5.setTemplateConnectionFactory(connectionFactory32);
        java.lang.String str34 = jmsEndpoint5.getReplyToCacheLevelName();
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent35 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent35.setTransactionTimeout((int) (short) 0);
        activeMQComponent35.setForceSendOriginalMessage(true);
        activeMQComponent35.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent35.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration44 = activeMQComponent35.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext45 = null;
        activeMQComponent35.setCamelContext(camelContext45);
        activeMQComponent35.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration49 = activeMQComponent35.getConfiguration();
        boolean b50 = jmsConfiguration49.isMapJmsMessage();
        int i51 = jmsConfiguration49.getReplyToOnTimeoutMaxConcurrentConsumers();
        java.lang.String str52 = jmsConfiguration49.getAcknowledgementModeName();
        jmsConfiguration49.setAllowNullBody(true);
        javax.jms.ConnectionFactory connectionFactory55 = jmsConfiguration49.getConnectionFactory();
        jmsEndpoint5.setTemplateConnectionFactory(connectionFactory55);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "queue:" + "'", str2.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(componentConfiguration21);
        org.junit.Assert.assertNotNull(jmsConfiguration26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(destinationResolver31);
        org.junit.Assert.assertNotNull(connectionFactory32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(componentConfiguration44);
        org.junit.Assert.assertNotNull(jmsConfiguration49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(i51 == 1);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(connectionFactory55);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        int i0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_PRODUCER_WINDOW_SIZE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        org.apache.activemq.camel.CamelQueue camelQueue4 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str5 = camelQueue4.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic7 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic7);
        boolean b9 = jmsEndpoint8.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession10 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver12 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue4, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession10, "temp-topic:");
        jmsEndpoint8.setPollingConsumerQueueSize((int) (byte) 0);
        org.apache.activemq.ActiveMQSession activeMQSession15 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer18 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession15, "2.19.3", true);
        org.apache.activemq.camel.CamelTopic camelTopic20 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint21 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic20);
        jmsEndpoint21.setIdleTaskExecutionLimit(50);
        boolean b24 = jmsEndpoint21.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy25 = null;
        jmsEndpoint21.setMessageCreatedStrategy(messageCreatedStrategy25);
        jmsEndpoint21.setSubscriptionDurable(false);
        int i29 = jmsEndpoint21.getIdleConsumerLimit();
        boolean b30 = jmsEndpoint21.isLazyCreateTransactionManager();
        java.lang.String str31 = jmsEndpoint21.getEndpointConfiguredDestinationName();
        java.lang.String str32 = jmsEndpoint21.toString();
        org.apache.activemq.ActiveMQSession activeMQSession33 = null;
        try {
            org.apache.activemq.camel.CamelTopicPublisher camelTopicPublisher34 = new org.apache.activemq.camel.CamelTopicPublisher(camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint21, activeMQSession33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "queue:" + "'", str5.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i29 == 1);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "jms:topic:queue:" + "'", str32.equals("jms:topic:queue:"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.EndpointConfiguration endpointConfiguration6 = null;
        jmsEndpoint2.setEndpointConfiguration(endpointConfiguration6);
        org.apache.camel.component.jms.JmsBinding jmsBinding8 = jmsEndpoint2.getBinding();
        java.lang.String str9 = jmsEndpoint2.getDestinationType();
        javax.jms.Destination destination10 = jmsEndpoint2.getDestination();
        boolean b11 = jmsEndpoint2.isMessageTimestampEnabled();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(jmsBinding8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "topic" + "'", str9.equals("topic"));
        org.junit.Assert.assertNotNull(destination10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.ActiveMQPrefetchPolicy activeMQPrefetchPolicy1 = null;
        activeMQConnection0.setPrefetchPolicy(activeMQPrefetchPolicy1);
        javax.jms.ConnectionMetaData connectionMetaData3 = activeMQConnection0.getMetaData();
        java.lang.String str4 = activeMQConnection0.getClientID();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy5 = activeMQConnection0.getBlobTransferPolicy();
        org.apache.activemq.ActiveMQConnection activeMQConnection6 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str7 = activeMQConnection6.getTrustedPackages();
        boolean b8 = activeMQConnection6.isMessagePrioritySupported();
        activeMQConnection6.setDispatchAsync(true);
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection6);
        activeMQConnection6.setWarnAboutUnstartedConnectionTimeout((long) (byte) -1);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(connectionMetaData3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(blobTransferPolicy5);
        org.junit.Assert.assertNotNull(activeMQConnection6);
        org.junit.Assert.assertNotNull(list_str7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy8 = jmsEndpoint2.getJmsKeyFormatStrategy();
        int i9 = jmsEndpoint2.getReplyToOnTimeoutMaxConcurrentConsumers();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy8);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isAsyncStopListener();
        java.lang.String str4 = jmsEndpoint2.getReplyToDestinationSelectorName();
        boolean b5 = jmsEndpoint2.isErrorHandlerLogStackTrace();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        org.apache.activemq.camel.CamelQueue camelQueue4 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str5 = camelQueue4.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic7 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic7);
        boolean b9 = jmsEndpoint8.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession10 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver12 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue4, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession10, "temp-topic:");
        jmsEndpoint8.setPollingConsumerQueueSize((int) (byte) 0);
        org.apache.activemq.ActiveMQSession activeMQSession15 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer18 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession15, "2.19.3", true);
        org.apache.camel.CamelContext camelContext19 = null;
        camelTopic1.setCamelContext(camelContext19);
        org.apache.activemq.ActiveMQSession activeMQSession21 = null;
        try {
            javax.jms.TopicSubscriber topicSubscriber25 = camelTopic1.createDurableSubscriber(activeMQSession21, "topic", "topic", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "queue:" + "'", str5.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isUseMessageIDAsCorrelationID();
        jmsEndpoint2.setWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime(300L);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent6 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent6.setTransactionTimeout((int) (short) 0);
        activeMQComponent6.setForceSendOriginalMessage(true);
        activeMQComponent6.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent6.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration15 = activeMQComponent6.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext16 = null;
        activeMQComponent6.setCamelContext(camelContext16);
        activeMQComponent6.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration20 = activeMQComponent6.getConfiguration();
        boolean b21 = jmsConfiguration20.isMapJmsMessage();
        java.lang.String str22 = jmsConfiguration20.getReplyToDestinationSelectorName();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory23 = null;
        jmsConfiguration20.setMessageListenerContainerFactory(messageListenerContainerFactory23);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent25 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent25.setTransactionTimeout((int) (short) 0);
        activeMQComponent25.setForceSendOriginalMessage(true);
        activeMQComponent25.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent25.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration34 = activeMQComponent25.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext35 = null;
        activeMQComponent25.setCamelContext(camelContext35);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent37 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent37.setTransactionTimeout((int) (short) 0);
        activeMQComponent37.setForceSendOriginalMessage(true);
        activeMQComponent37.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent37.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration46 = activeMQComponent37.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext47 = null;
        activeMQComponent37.setCamelContext(camelContext47);
        activeMQComponent37.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration51 = activeMQComponent37.getConfiguration();
        boolean b52 = jmsConfiguration51.isTransactedInOut();
        org.apache.activemq.camel.component.OriginalDestinationPropagateStrategy originalDestinationPropagateStrategy53 = new org.apache.activemq.camel.component.OriginalDestinationPropagateStrategy();
        jmsConfiguration51.setMessageCreatedStrategy((org.apache.camel.component.jms.MessageCreatedStrategy) originalDestinationPropagateStrategy53);
        activeMQComponent25.setMessageCreatedStrategy((org.apache.camel.component.jms.MessageCreatedStrategy) originalDestinationPropagateStrategy53);
        jmsConfiguration20.setMessageCreatedStrategy((org.apache.camel.component.jms.MessageCreatedStrategy) originalDestinationPropagateStrategy53);
        org.apache.camel.component.jms.JmsProviderMetadata jmsProviderMetadata57 = jmsConfiguration20.getProviderMetadata();
        jmsEndpoint2.setProviderMetadata(jmsProviderMetadata57);
        jmsEndpoint2.setAcceptMessagesWhileStopping(true);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(componentConfiguration15);
        org.junit.Assert.assertNotNull(jmsConfiguration20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(componentConfiguration34);
        org.junit.Assert.assertNotNull(componentConfiguration46);
        org.junit.Assert.assertNotNull(jmsConfiguration51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(jmsProviderMetadata57);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration9 = activeMQComponent0.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext10 = null;
        activeMQComponent0.setCamelContext(camelContext10);
        activeMQComponent0.setRequestTimeout(0L);
        org.junit.Assert.assertNotNull(componentConfiguration9);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isTestConnectionOnStartup();
        boolean b4 = jmsEndpoint2.isAcceptMessagesWhileStopping();
        jmsEndpoint2.setAlwaysCopyMessage(true);
        org.springframework.util.ErrorHandler errorHandler7 = null;
        jmsEndpoint2.setErrorHandler(errorHandler7);
        boolean b9 = jmsEndpoint2.isTransferException();
        long long10 = jmsEndpoint2.getPollingConsumerBlockTimeout();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == 0L);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        boolean b2 = brokerProducer1.isStarting();
        org.apache.camel.Endpoint endpoint3 = brokerProducer1.getEndpoint();
        org.apache.camel.Exchange exchange4 = null;
        org.apache.camel.AsyncCallback asyncCallback5 = null;
        try {
            boolean b6 = brokerProducer1.process(exchange4, asyncCallback5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(endpoint3);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setExposeListenerSession(true);
        long long5 = activeMQComponent0.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        org.apache.camel.component.jms.ReplyToType replyToType6 = null;
        activeMQComponent0.setReplyToType(replyToType6);
        activeMQComponent0.setDeliveryMode((java.lang.Integer) 0);
        org.apache.camel.component.jms.ReplyToType replyToType10 = null;
        activeMQComponent0.setReplyToType(replyToType10);
        activeMQComponent0.setErrorHandlerLogStackTrace(false);
        activeMQComponent0.setCorrelationProperty("topic:");
        org.junit.Assert.assertTrue(long5 == 100L);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isAsyncStopListener();
        java.lang.String str4 = jmsEndpoint2.getReplyToDestinationSelectorName();
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isTestConnectionOnStartup();
        boolean b4 = jmsEndpoint2.isAcceptMessagesWhileStopping();
        jmsEndpoint2.setAlwaysCopyMessage(true);
        org.springframework.util.ErrorHandler errorHandler7 = null;
        jmsEndpoint2.setErrorHandler(errorHandler7);
        boolean b9 = jmsEndpoint2.isTransferException();
        java.lang.String str10 = jmsEndpoint2.getAcknowledgementModeName();
        org.springframework.jms.support.converter.MessageConverter messageConverter11 = null;
        jmsEndpoint2.setMessageConverter(messageConverter11);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        java.lang.String str17 = jmsConfiguration14.getAcknowledgementModeName();
        jmsConfiguration14.setAutoStartup(false);
        long long20 = jmsConfiguration14.getWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime();
        boolean b21 = jmsConfiguration14.isTransactedInOut();
        java.lang.String str22 = jmsConfiguration14.getClientId();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue(long20 == 100L);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setDeliveryPersistent(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy8 = jmsEndpoint2.getJmsKeyFormatStrategy();
        jmsEndpoint2.setWaitForProvisionCorrelationToBeUpdatedThreadSleepingTime((long) (short) -1);
        boolean b11 = jmsEndpoint2.isAsyncStartListener();
        int i12 = jmsEndpoint2.getConcurrentConsumers();
        org.apache.activemq.camel.CamelTopic camelTopic14 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic14);
        boolean b16 = jmsEndpoint15.isTestConnectionOnStartup();
        jmsEndpoint15.setTransactionTimeout((int) ' ');
        java.lang.String str19 = jmsEndpoint15.getThreadName();
        org.apache.camel.ExchangePattern exchangePattern20 = jmsEndpoint15.getExchangePattern();
        org.apache.camel.Exchange exchange21 = jmsEndpoint2.createExchange(exchangePattern20);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNotNull(jmsEndpoint15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "JmsConsumer[null]" + "'", str19.equals("JmsConsumer[null]"));
        org.junit.Assert.assertTrue("'" + exchangePattern20 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern20.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange21);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setSubscriptionDurable(false);
        int i10 = jmsEndpoint2.getIdleConsumerLimit();
        boolean b11 = jmsEndpoint2.isLazyCreateTransactionManager();
        javax.jms.ExceptionListener exceptionListener12 = null;
        jmsEndpoint2.setExceptionListener(exceptionListener12);
        int i14 = jmsEndpoint2.getAcknowledgementMode();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        jmsConfiguration14.setDeliveryMode((java.lang.Integer) (-1));
        int i19 = jmsConfiguration14.getReplyToConcurrentConsumers();
        jmsConfiguration14.setReplyToSameDestinationAllowed(true);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager22 = null;
        jmsConfiguration14.setTransactionManager(platformTransactionManager22);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        boolean b5 = activeMQComponent0.isSuspendingOrSuspended();
        activeMQComponent0.setAsyncStartListener(false);
        boolean b8 = activeMQComponent0.isStarted();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        int i8 = jmsEndpoint2.getAcknowledgementMode();
        jmsEndpoint2.setTestConnectionOnStartup(false);
        jmsEndpoint2.setCacheLevel((-1));
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
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
        try {
            jmsEndpoint2.setReplyTo("topic:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(jmsBinding8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "topic" + "'", str9.equals("topic"));
        org.junit.Assert.assertNotNull(destination10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.activemq.camel.CamelDestination camelDestination1 = new org.apache.activemq.camel.CamelDestination("failover://tcp://localhost:61616");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelDestination1.getBinding();
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        try {
            javax.jms.MessageConsumer messageConsumer6 = camelDestination1.createConsumer(activeMQSession3, "queue:", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.CamelContext camelContext2 = camelTopic1.getCamelContext();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isTestConnectionOnStartup();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber11 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "", "2.19.3", false);
        java.lang.String str12 = camelTopic1.getTopicName();
        org.apache.activemq.camel.CamelTopic camelTopic14 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic14);
        jmsEndpoint15.setIdleTaskExecutionLimit(50);
        boolean b18 = jmsEndpoint15.isTransferFault();
        org.apache.camel.EndpointConfiguration endpointConfiguration19 = null;
        jmsEndpoint15.setEndpointConfiguration(endpointConfiguration19);
        org.apache.camel.component.jms.JmsBinding jmsBinding21 = jmsEndpoint15.getBinding();
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType22 = jmsEndpoint15.getDefaultTaskExecutorType();
        org.apache.activemq.ActiveMQSession activeMQSession23 = null;
        try {
            org.apache.activemq.camel.CamelTopicPublisher camelTopicPublisher24 = new org.apache.activemq.camel.CamelTopicPublisher(camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint15, activeMQSession23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(camelContext2);
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "temp-topic:" + "'", str12.equals("temp-topic:"));
        org.junit.Assert.assertNotNull(jmsEndpoint15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(jmsBinding21);
        org.junit.Assert.assertNull(defaultTaskExecutorType22);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        boolean b2 = activeMQConnection0.isUseAsyncSend();
        boolean b3 = activeMQConnection0.isAlwaysSessionAsync();
        java.lang.String str4 = activeMQConnection0.toString();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy5 = activeMQConnection0.getBlobTransferPolicy();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ActiveMQConnection {id=ID:roei-main-45321-1522670064475-419:1,clientId=null,started=false}" + "'", str4.equals("ActiveMQConnection {id=ID:roei-main-45321-1522670064475-419:1,clientId=null,started=false}"));
        org.junit.Assert.assertNotNull(blobTransferPolicy5);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isTestConnectionOnStartup();
        jmsEndpoint2.setTransactionTimeout((int) ' ');
        java.lang.String str6 = jmsEndpoint2.getEndpointUri();
        javax.jms.ExceptionListener exceptionListener7 = null;
        jmsEndpoint2.setExceptionListener(exceptionListener7);
        jmsEndpoint2.setTransactionName("hi!");
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "jms:topic:queue:" + "'", str6.equals("jms:topic:queue:"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        boolean b2 = brokerProducer1.isStarting();
        org.apache.camel.Endpoint endpoint3 = brokerProducer1.getEndpoint();
        org.apache.activemq.camel.CamelTopic camelTopic5 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint6 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic5);
        jmsEndpoint6.setIdleTaskExecutionLimit(50);
        boolean b9 = jmsEndpoint6.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy10 = null;
        jmsEndpoint6.setMessageCreatedStrategy(messageCreatedStrategy10);
        jmsEndpoint6.setDestinationName("queue:");
        java.lang.String str14 = jmsEndpoint6.getEndpointConfiguredDestinationName();
        jmsEndpoint6.setAllowNullBody(true);
        org.apache.activemq.camel.CamelTopic camelTopic18 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint19 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic18);
        jmsEndpoint19.setIdleTaskExecutionLimit(50);
        boolean b22 = jmsEndpoint19.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy23 = null;
        jmsEndpoint19.setMessageCreatedStrategy(messageCreatedStrategy23);
        jmsEndpoint19.setDestinationName("queue:");
        java.lang.String str27 = jmsEndpoint19.getEndpointConfiguredDestinationName();
        boolean b28 = jmsEndpoint19.isReplyToSameDestinationAllowed();
        boolean b29 = jmsEndpoint19.isAllowReplyManagerQuickStop();
        org.apache.camel.ExchangePattern exchangePattern30 = jmsEndpoint19.getExchangePattern();
        org.apache.camel.Exchange exchange31 = jmsEndpoint6.createExchange(exchangePattern30);
        org.apache.camel.AsyncCallback asyncCallback32 = null;
        try {
            boolean b33 = brokerProducer1.process(exchange31, asyncCallback32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(endpoint3);
        org.junit.Assert.assertNotNull(jmsEndpoint6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jmsEndpoint19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + exchangePattern30 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern30.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange31);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setAllowNullBody(true);
        activeMQComponent0.start();
        boolean b7 = activeMQComponent0.isAllowAutoWiredConnectionFactory();
        activeMQComponent0.setAsyncConsumer(true);
        activeMQComponent0.suspend();
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        org.apache.activemq.command.ConnectionInfo connectionInfo1 = activeMQConnection0.getConnectionInfo();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener2 = null;
        activeMQConnection0.setClientInternalExceptionListener(clientInternalExceptionListener2);
        activeMQConnection0.setConnectResponseTimeout((int) (byte) 10);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(connectionInfo1);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
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
        boolean b17 = jmsConfiguration14.isAutoStartup();
        java.lang.String str18 = jmsConfiguration14.getReplyTo();
        boolean b19 = jmsConfiguration14.isAllowSerializedHeaders();
        boolean b20 = jmsConfiguration14.isDisableTimeToLive();
        org.apache.camel.component.jms.ReplyToType replyToType21 = null;
        jmsConfiguration14.setReplyToType(replyToType21);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str2 = camelQueue1.getUri();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isUseMessageIDAsCorrelationID();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver9 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "temp-topic:");
        jmsEndpoint5.setTransactedInOut(false);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent12 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent12.setTransactionTimeout((int) (short) 0);
        activeMQComponent12.setForceSendOriginalMessage(true);
        activeMQComponent12.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent12.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration21 = activeMQComponent12.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext22 = null;
        activeMQComponent12.setCamelContext(camelContext22);
        activeMQComponent12.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration26 = activeMQComponent12.getConfiguration();
        boolean b27 = jmsConfiguration26.isMapJmsMessage();
        java.lang.String str28 = jmsConfiguration26.getReplyToDestinationSelectorName();
        boolean b29 = jmsConfiguration26.isAutoStartup();
        java.lang.String str30 = jmsConfiguration26.getReplyTo();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver31 = jmsConfiguration26.getDestinationResolver();
        javax.jms.ConnectionFactory connectionFactory32 = jmsConfiguration26.getConnectionFactory();
        jmsEndpoint5.setTemplateConnectionFactory(connectionFactory32);
        int i34 = jmsEndpoint5.getCacheLevel();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "queue:" + "'", str2.equals("queue:"));
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(componentConfiguration21);
        org.junit.Assert.assertNotNull(jmsConfiguration26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(destinationResolver31);
        org.junit.Assert.assertNotNull(connectionFactory32);
        org.junit.Assert.assertTrue(i34 == (-1));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCloseTimeout(0);
        int i3 = activeMQConnection0.getCloseTimeout();
        activeMQConnection0.setConsumerExpiryCheckEnabled(false);
        activeMQConnection0.setCloseTimeout((int) (byte) 0);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent1 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        boolean b2 = brokerComponent1.isStarting();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination5 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration6 = new org.apache.activemq.camel.component.broker.BrokerConfiguration();
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint7 = new org.apache.activemq.camel.component.broker.BrokerEndpoint("2.19.3", brokerComponent1, "tcp://localhost:61616", activeMQDestination5, brokerConfiguration6);
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) activeMQDestination5);
        javax.naming.Reference reference9 = activeMQDestination5.getReference();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(activeMQDestination5);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertNotNull(reference9);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
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
        jmsConfiguration14.setTransactionTimeout(0);
        java.lang.String str18 = jmsConfiguration14.getTransactionName();
        boolean b19 = jmsConfiguration14.isTransferExchange();
        jmsConfiguration14.setReplyToConcurrentConsumers((int) ' ');
        jmsConfiguration14.setExposeListenerSession(false);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
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
        boolean b17 = jmsConfiguration14.isAutoStartup();
        java.lang.String str18 = jmsConfiguration14.getReplyTo();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver19 = jmsConfiguration14.getDestinationResolver();
        org.springframework.jms.support.converter.MessageConverter messageConverter20 = jmsConfiguration14.getMessageConverter();
        long long21 = jmsConfiguration14.getTimeToLive();
        org.apache.camel.component.jms.ReplyToType replyToType22 = null;
        jmsConfiguration14.setReplyToType(replyToType22);
        jmsConfiguration14.setPassword("ActiveMQConnection {id=ID:roei-main-45321-1522670064475-65:1,clientId=null,started=false}");
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(destinationResolver19);
        org.junit.Assert.assertNull(messageConverter20);
        org.junit.Assert.assertTrue(long21 == (-1L));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        java.lang.String str2 = camelQueue1.getUri();
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        try {
            javax.jms.QueueSender queueSender4 = camelQueue1.createSender(activeMQSession3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "queue:" + "'", str2.equals("queue:"));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setAllowNullBody(true);
        org.springframework.jms.core.JmsOperations jmsOperations6 = null;
        activeMQComponent0.setJmsOperations(jmsOperations6);
        boolean b8 = activeMQComponent0.isRunAllowed();
        activeMQComponent0.setWaitForProvisionCorrelationToBeUpdatedCounter((int) ' ');
        boolean b11 = activeMQComponent0.isRunAllowed();
        org.apache.activemq.camel.component.OriginalDestinationPropagateStrategy originalDestinationPropagateStrategy12 = new org.apache.activemq.camel.component.OriginalDestinationPropagateStrategy();
        activeMQComponent0.setMessageCreatedStrategy((org.apache.camel.component.jms.MessageCreatedStrategy) originalDestinationPropagateStrategy12);
        org.junit.Assert.assertNull(camelContext3);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
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
        jmsConfiguration14.setTestConnectionOnStartup(false);
        org.apache.activemq.camel.CamelTopic camelTopic19 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint20 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic19);
        jmsEndpoint20.setIdleTaskExecutionLimit(50);
        boolean b23 = jmsEndpoint20.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy24 = null;
        jmsEndpoint20.setMessageCreatedStrategy(messageCreatedStrategy24);
        jmsEndpoint20.setDestinationName("queue:");
        javax.jms.ExceptionListener exceptionListener28 = null;
        jmsEndpoint20.setExceptionListener(exceptionListener28);
        org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer30 = jmsConfiguration14.chooseMessageListenerContainerImplementation(jmsEndpoint20);
        java.lang.String str31 = jmsConfiguration14.getAcknowledgementModeName();
        boolean b32 = jmsConfiguration14.isPubSubNoLocal();
        boolean b33 = jmsConfiguration14.isDeliveryPersistent();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(jmsEndpoint20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(abstractMessageListenerContainer30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        activeMQComponent0.setForceSendOriginalMessage(true);
        activeMQComponent0.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent0.setUserName("temp-queue:");
        activeMQComponent0.setUserName("topic:");
        boolean b11 = activeMQComponent0.isStopped();
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent12 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent12.setTransactionTimeout((int) (short) 0);
        activeMQComponent12.setForceSendOriginalMessage(true);
        activeMQComponent12.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent12.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration21 = activeMQComponent12.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext22 = null;
        activeMQComponent12.setCamelContext(camelContext22);
        activeMQComponent12.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration26 = activeMQComponent12.getConfiguration();
        boolean b27 = jmsConfiguration26.isTransactedInOut();
        jmsConfiguration26.setTestConnectionOnStartup(false);
        org.springframework.core.task.TaskExecutor taskExecutor30 = null;
        jmsConfiguration26.setTaskExecutor(taskExecutor30);
        activeMQComponent0.setConfiguration(jmsConfiguration26);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(componentConfiguration21);
        org.junit.Assert.assertNotNull(jmsConfiguration26);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        activeMQConfiguration0.setUserName("tcp://localhost:61616");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
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
        activeMQComponent0.setAcknowledgementMode(100);
        try {
            org.apache.camel.EndpointConfiguration endpointConfiguration18 = activeMQComponent0.createConfiguration("ActiveMQConnection {id=ID:roei-main-45321-1522670064475-367:1,clientId=null,started=false}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
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
        jmsEndpoint2.setReplyToSameDestinationAllowed(false);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(jmsBinding8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "topic" + "'", str9.equals("topic"));
        org.junit.Assert.assertNotNull(destination10);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setDestinationName("queue:");
        java.lang.String str10 = jmsEndpoint2.getEndpointConfiguredDestinationName();
        boolean b11 = jmsEndpoint2.isPreserveMessageQos();
        org.apache.camel.component.jms.JmsMessageType jmsMessageType12 = jmsEndpoint2.getJmsMessageType();
        jmsEndpoint2.setTransactedInOut(false);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(jmsMessageType12);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setAllowNullBody(true);
        org.springframework.jms.core.JmsOperations jmsOperations6 = null;
        activeMQComponent0.setJmsOperations(jmsOperations6);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy8 = null;
        activeMQComponent0.setHeaderFilterStrategy(headerFilterStrategy8);
        org.apache.camel.LoggingLevel loggingLevel10 = null;
        activeMQComponent0.setErrorHandlerLoggingLevel(loggingLevel10);
        activeMQComponent0.setTransacted(true);
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        activeMQConnection2.setConsumerExpiryCheckEnabled(true);
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent8 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        boolean b9 = brokerComponent8.isStarting();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination12 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration13 = new org.apache.activemq.camel.component.broker.BrokerConfiguration();
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint14 = new org.apache.activemq.camel.component.broker.BrokerEndpoint("2.19.3", brokerComponent8, "tcp://localhost:61616", activeMQDestination12, brokerConfiguration13);
        boolean b15 = activeMQConnection2.isDeleted(activeMQDestination12);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(activeMQDestination12);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        long long6 = jmsEndpoint2.getReceiveTimeout();
        jmsEndpoint2.setAutoStartup(false);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(long6 == 1000L);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
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
        java.lang.String str18 = jmsConfiguration14.getCacheLevelName();
        long long19 = jmsConfiguration14.getTimeToLive();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(long19 == (-1L));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.CamelContext camelContext2 = camelTopic1.getCamelContext();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isTestConnectionOnStartup();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber11 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "", "2.19.3", false);
        try {
            javax.jms.Message message13 = camelTopicSubscriber11.receive((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException");
        } catch (javax.jms.JMSException e) {
        }
        org.junit.Assert.assertNull(camelContext2);
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        org.springframework.jms.support.converter.MessageConverter messageConverter8 = jmsEndpoint2.getMessageConverter();
        java.lang.String str9 = jmsEndpoint2.getEndpointUri();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(messageConverter8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "jms:topic:queue:" + "'", str9.equals("jms:topic:queue:"));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
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
        jmsConfiguration14.setTestConnectionOnStartup(false);
        org.apache.activemq.camel.CamelTopic camelTopic19 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint20 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic19);
        jmsEndpoint20.setIdleTaskExecutionLimit(50);
        boolean b23 = jmsEndpoint20.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy24 = null;
        jmsEndpoint20.setMessageCreatedStrategy(messageCreatedStrategy24);
        jmsEndpoint20.setDestinationName("queue:");
        javax.jms.ExceptionListener exceptionListener28 = null;
        jmsEndpoint20.setExceptionListener(exceptionListener28);
        org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer30 = jmsConfiguration14.chooseMessageListenerContainerImplementation(jmsEndpoint20);
        java.lang.String str31 = jmsConfiguration14.getAcknowledgementModeName();
        boolean b32 = jmsConfiguration14.isPubSubNoLocal();
        java.lang.String str33 = jmsConfiguration14.getReplyToDestinationSelectorName();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(jmsEndpoint20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(abstractMessageListenerContainer30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.CamelContext camelContext2 = camelTopic1.getCamelContext();
        org.apache.activemq.camel.CamelTopic camelTopic4 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic4);
        boolean b6 = jmsEndpoint5.isTestConnectionOnStartup();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber11 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession7, "", "2.19.3", false);
        int i12 = jmsEndpoint5.getWaitForProvisionCorrelationToBeUpdatedCounter();
        java.lang.String str13 = jmsEndpoint5.toString();
        org.junit.Assert.assertNull(camelContext2);
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i12 == 50);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "jms:topic:queue:" + "'", str13.equals("jms:topic:queue:"));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isAsyncStopListener();
        java.lang.String str4 = jmsEndpoint2.getReplyToDestinationSelectorName();
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.EndpointConfiguration endpointConfiguration6 = null;
        jmsEndpoint2.setEndpointConfiguration(endpointConfiguration6);
        org.apache.camel.LoggingLevel loggingLevel8 = jmsEndpoint2.getErrorHandlerLoggingLevel();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + loggingLevel8 + "' != '" + org.apache.camel.LoggingLevel.WARN + "'", loggingLevel8.equals(org.apache.camel.LoggingLevel.WARN));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
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
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent12 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent12.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext15 = activeMQComponent12.getCamelContext();
        activeMQComponent12.setAllowNullBody(true);
        org.springframework.jms.core.JmsOperations jmsOperations18 = null;
        activeMQComponent12.setJmsOperations(jmsOperations18);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy20 = null;
        activeMQComponent12.setHeaderFilterStrategy(headerFilterStrategy20);
        activeMQComponent12.setCorrelationProperty("queue:");
        activeMQComponent12.setWaitForProvisionCorrelationToBeUpdatedCounter((int) (byte) 1);
        camelEndpointLoader2.setComponent(activeMQComponent12);
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertNull(camelContext15);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
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
        java.lang.String str18 = jmsConfiguration14.getCacheLevelName();
        jmsConfiguration14.setAcknowledgementMode(0);
        jmsConfiguration14.setTransactionTimeout((int) (byte) 1);
        org.springframework.jms.support.destination.DestinationResolver destinationResolver23 = jmsConfiguration14.getDestinationResolver();
        jmsConfiguration14.setUseMessageIDAsCorrelationID(false);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(destinationResolver23);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.activemq.camel.CamelTopic camelTopic3 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint4 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic3);
        jmsEndpoint4.setIdleTaskExecutionLimit(50);
        boolean b7 = jmsEndpoint4.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy8 = null;
        jmsEndpoint4.setMessageCreatedStrategy(messageCreatedStrategy8);
        jmsEndpoint4.setSubscriptionDurable(false);
        int i12 = jmsEndpoint4.getIdleConsumerLimit();
        boolean b13 = jmsEndpoint4.isLazyCreateTransactionManager();
        java.lang.String str14 = jmsEndpoint4.getEndpointConfiguredDestinationName();
        java.lang.String str15 = jmsEndpoint4.toString();
        int i16 = jmsEndpoint4.getTransactionTimeout();
        org.apache.activemq.ActiveMQSession activeMQSession17 = null;
        try {
            org.apache.activemq.camel.CamelQueueSender camelQueueSender18 = new org.apache.activemq.camel.CamelQueueSender(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint4, activeMQSession17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "jms:topic:queue:" + "'", str15.equals("jms:topic:queue:"));
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setLazyCreateTransactionManager(true);
        int i3 = activeMQComponent0.getWaitForProvisionCorrelationToBeUpdatedCounter();
        activeMQComponent0.setConcurrentConsumers((int) (short) 0);
        org.junit.Assert.assertTrue(i3 == 50);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isTestConnectionOnStartup();
        jmsEndpoint2.setTransactionTimeout((int) ' ');
        java.lang.String str6 = jmsEndpoint2.getThreadName();
        org.apache.camel.EndpointConfiguration endpointConfiguration7 = null;
        jmsEndpoint2.setEndpointConfiguration(endpointConfiguration7);
        java.lang.String str9 = jmsEndpoint2.toString();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "JmsConsumer[null]" + "'", str6.equals("JmsConsumer[null]"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "jms:topic:queue:" + "'", str9.equals("jms:topic:queue:"));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setDestinationName("queue:");
        java.lang.String str10 = jmsEndpoint2.getEndpointConfiguredDestinationName();
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent11 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent11.setTransactionTimeout((int) (short) 0);
        activeMQComponent11.setForceSendOriginalMessage(true);
        activeMQComponent11.setRequestTimeoutCheckerInterval(10L);
        activeMQComponent11.setUserName("temp-queue:");
        org.apache.camel.ComponentConfiguration componentConfiguration20 = activeMQComponent11.createComponentConfiguration();
        org.apache.camel.CamelContext camelContext21 = null;
        activeMQComponent11.setCamelContext(camelContext21);
        activeMQComponent11.setTransferException(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration25 = activeMQComponent11.getConfiguration();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory26 = null;
        jmsConfiguration25.setMessageListenerContainerFactory(messageListenerContainerFactory26);
        boolean b28 = jmsConfiguration25.isDisableTimeToLive();
        boolean b29 = jmsConfiguration25.isDisableReplyTo();
        jmsEndpoint2.setConfiguration(jmsConfiguration25);
        boolean b31 = jmsEndpoint2.isReplyToSameDestinationAllowed();
        boolean b32 = jmsEndpoint2.isTransferException();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(componentConfiguration20);
        org.junit.Assert.assertNotNull(jmsConfiguration25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("endpoint357");
        org.junit.Assert.assertNotNull(activeMQComponent1);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        java.lang.String str3 = camelTopic1.getUri();
        org.apache.activemq.ActiveMQSession activeMQSession4 = null;
        try {
            javax.jms.TopicSubscriber topicSubscriber8 = camelTopic1.createDurableSubscriber(activeMQSession4, "tcp://localhost:61616", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "queue:" + "'", str3.equals("queue:"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isTestConnectionOnStartup();
        jmsEndpoint2.setTransactionTimeout((int) ' ');
        java.lang.String str6 = jmsEndpoint2.getEndpointUri();
        org.apache.camel.Producer producer7 = jmsEndpoint2.createProducer();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "jms:topic:queue:" + "'", str6.equals("jms:topic:queue:"));
        org.junit.Assert.assertNotNull(producer7);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        activeMQConnection2.setConsumerExpiryCheckEnabled(true);
        activeMQConnection2.setUseRetroactiveConsumer(false);
        boolean b9 = activeMQConnection2.isUseAsyncSend();
        activeMQConnection2.cleanup();
        org.apache.activemq.command.ProducerId producerId11 = null;
        org.apache.activemq.ActiveMQMessageProducer activeMQMessageProducer12 = null;
        try {
            activeMQConnection2.addProducer(producerId11, activeMQMessageProducer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
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
        jmsConfiguration14.setTransactionTimeout(0);
        jmsConfiguration14.setRecoveryInterval(0L);
        org.springframework.core.task.TaskExecutor taskExecutor20 = null;
        jmsConfiguration14.setTaskExecutor(taskExecutor20);
        org.apache.camel.component.jms.ReplyToType replyToType22 = jmsConfiguration14.getReplyToType();
        jmsConfiguration14.setSubscriptionDurable(true);
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory25 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory25);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(replyToType22);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
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
        boolean b12 = activeMQComponent3.isSuspendingOrSuspended();
        boolean b13 = activeMQComponent3.isStopped();
        activeMQComponent3.setUsername("failover://tcp://localhost:61616");
        activeMQComponent3.start();
        org.junit.Assert.assertTrue(long8 == 100L);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        jmsEndpoint2.setBridgeErrorHandler(false);
        int i10 = jmsEndpoint2.getReplyToConcurrentConsumers();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy11 = jmsEndpoint2.getJmsKeyFormatStrategy();
        jmsEndpoint2.setReplyToCacheLevelName("2.19.3");
        org.apache.camel.Exchange exchange14 = jmsEndpoint2.createExchange();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy15 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy15);
        boolean b17 = jmsEndpoint2.isLenientProperties();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy11);
        org.junit.Assert.assertNotNull(exchange14);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
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
        int i16 = jmsConfiguration14.getConcurrentConsumers();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = null;
        org.springframework.jms.core.JmsOperations jmsOperations21 = jmsConfiguration14.createInOutTemplate(jmsEndpoint17, true, "failover://tcp://localhost:61616", (long) (short) 100);
        boolean b22 = jmsConfiguration14.isExplicitQosEnabled();
        jmsConfiguration14.setTransacted(true);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType25 = null;
        jmsConfiguration14.setDefaultTaskExecutorType(defaultTaskExecutorType25);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNotNull(jmsOperations21);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setSubscriptionDurable(false);
        int i10 = jmsEndpoint2.getIdleConsumerLimit();
        boolean b11 = jmsEndpoint2.isLazyCreateTransactionManager();
        org.apache.camel.component.jms.JmsComponent jmsComponent12 = jmsEndpoint2.getComponent();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(jmsComponent12);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        jmsEndpoint2.setBridgeErrorHandler(false);
        int i10 = jmsEndpoint2.getReplyToConcurrentConsumers();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy11 = jmsEndpoint2.getJmsKeyFormatStrategy();
        int i12 = jmsEndpoint2.getReplyToConcurrentConsumers();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy11);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        jmsEndpoint2.setAcknowledgementModeName("ActiveMQConnection {id=ID:roei-main-45321-1522670064475-367:1,clientId=null,started=false}");
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
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
        jmsConfiguration14.setDeliveryPersistent(false);
        javax.jms.ExceptionListener exceptionListener18 = jmsConfiguration14.getExceptionListener();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(exceptionListener18);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.activemq.camel.CamelTopic camelTopic3 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint4 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic3);
        jmsEndpoint4.setIdleTaskExecutionLimit(50);
        boolean b7 = jmsEndpoint4.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy8 = null;
        jmsEndpoint4.setMessageCreatedStrategy(messageCreatedStrategy8);
        jmsEndpoint4.setSubscriptionDurable(false);
        java.lang.String str12 = jmsEndpoint4.getReplyToType();
        org.apache.activemq.ActiveMQSession activeMQSession13 = null;
        try {
            org.apache.activemq.camel.CamelMessageProducer camelMessageProducer14 = new org.apache.activemq.camel.CamelMessageProducer((org.apache.activemq.camel.CamelDestination) camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint4, activeMQSession13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsEndpoint4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        activeMQConnection0.setTransactedIndividualAck(false);
        activeMQConnection0.setObjectMessageSerializationDefered(true);
        boolean b9 = activeMQConnection0.isNonBlockingRedelivery();
        activeMQConnection0.setAuditMaximumProducerNumber((int) ' ');
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponent(jmsConfiguration0);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy2 = jmsComponent1.getHeaderFilterStrategy();
        boolean b3 = jmsComponent1.isStoppingOrStopped();
        jmsComponent1.setAcknowledgementModeName("");
        javax.jms.ConnectionFactory connectionFactory6 = null;
        jmsComponent1.setConnectionFactory(connectionFactory6);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNull(headerFilterStrategy2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isTransferFault();
        java.lang.String str18 = jmsConfiguration14.getReplyToOverride();
        long long19 = jmsConfiguration14.getTimeToLive();
        java.lang.String str20 = jmsConfiguration14.getAcknowledgementModeName();
        org.springframework.core.task.TaskExecutor taskExecutor21 = jmsConfiguration14.getTaskExecutor();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(long19 == (-1L));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(taskExecutor21);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        jmsEndpoint2.setBridgeErrorHandler(false);
        int i10 = jmsEndpoint2.getReplyToConcurrentConsumers();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy11 = jmsEndpoint2.getJmsKeyFormatStrategy();
        java.lang.String str12 = jmsEndpoint2.getDestinationType();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "topic" + "'", str12.equals("topic"));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        long long6 = jmsEndpoint2.getReceiveTimeout();
        boolean b7 = jmsEndpoint2.isSuspending();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(long6 == 1000L);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setUseMessageIDAsCorrelationID(true);
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCloseTimeout(0);
        activeMQConnection0.setConnectResponseTimeout(50);
        activeMQConnection0.setWarnAboutUnstartedConnectionTimeout((long) 1);
        long long7 = activeMQConnection0.getWarnAboutUnstartedConnectionTimeout();
        org.apache.activemq.command.ProducerId producerId8 = null;
        org.apache.activemq.ActiveMQMessageProducer activeMQMessageProducer9 = null;
        try {
            activeMQConnection0.addProducer(producerId8, activeMQMessageProducer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(long7 == 1L);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("temp-topic:");
        org.apache.camel.Endpoint endpoint2 = null;
        org.apache.activemq.ActiveMQSession activeMQSession3 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber7 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, endpoint2, activeMQSession3, "topic:", "hi!", false);
        javax.jms.Topic topic8 = camelTopicSubscriber7.getTopic();
        boolean b9 = camelTopicSubscriber7.getNoLocal();
        org.junit.Assert.assertNotNull(topic8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        boolean b5 = jmsEndpoint2.isTransferFault();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy6 = null;
        jmsEndpoint2.setMessageCreatedStrategy(messageCreatedStrategy6);
        jmsEndpoint2.setDestinationName("queue:");
        jmsEndpoint2.setSubscriptionDurable(false);
        boolean b12 = jmsEndpoint2.isTransferExchange();
        java.lang.String str13 = jmsEndpoint2.getDestinationType();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "topic" + "'", str13.equals("topic"));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent1 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        boolean b2 = brokerComponent1.isStarting();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination5 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration6 = new org.apache.activemq.camel.component.broker.BrokerConfiguration();
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint7 = new org.apache.activemq.camel.component.broker.BrokerEndpoint("2.19.3", brokerComponent1, "tcp://localhost:61616", activeMQDestination5, brokerConfiguration6);
        org.apache.camel.Producer producer8 = brokerEndpoint7.createProducer();
        boolean b9 = brokerEndpoint7.isSingleton();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(activeMQDestination5);
        org.junit.Assert.assertNotNull(producer8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        boolean b3 = jmsEndpoint2.isUseMessageIDAsCorrelationID();
        org.apache.camel.CamelContext camelContext4 = jmsEndpoint2.getCamelContext();
        jmsEndpoint2.setAutoStartup(false);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(camelContext4);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setTransactionTimeout((int) (short) 0);
        org.apache.camel.CamelContext camelContext3 = activeMQComponent0.getCamelContext();
        activeMQComponent0.setRequestTimeout(100L);
        activeMQComponent0.setRequestTimeout(0L);
        activeMQComponent0.setTransferException(true);
        activeMQComponent0.setAlwaysCopyMessage(true);
        activeMQComponent0.setTransferFault(false);
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isDisableReplyTo();
        jmsConfiguration14.setConcurrentConsumers((-1));
        boolean b20 = jmsConfiguration14.isTransactedInOut();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection0.setCopyMessageOnSend(true);
        boolean b3 = activeMQConnection0.isWatchTopicAdvisories();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
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
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        boolean b17 = jmsConfiguration14.isDisableTimeToLive();
        boolean b18 = jmsConfiguration14.isDisableReplyTo();
        jmsConfiguration14.setRequestTimeoutCheckerInterval((long) 1);
        boolean b21 = jmsConfiguration14.isAllowReplyManagerQuickStop();
        jmsConfiguration14.setPreserveMessageQos(false);
        javax.jms.ConnectionFactory connectionFactory24 = jmsConfiguration14.getListenerConnectionFactory();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(connectionFactory24);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
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
        java.lang.String str18 = jmsConfiguration14.getCacheLevelName();
        jmsConfiguration14.setAcknowledgementMode(0);
        boolean b21 = jmsConfiguration14.isAllowSerializedHeaders();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
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
        boolean b17 = jmsConfiguration14.isAutoStartup();
        java.lang.String str18 = jmsConfiguration14.getReplyTo();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver19 = jmsConfiguration14.getDestinationResolver();
        javax.jms.ConnectionFactory connectionFactory20 = jmsConfiguration14.getConnectionFactory();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory21 = null;
        jmsConfiguration14.setMessageListenerContainerFactory(messageListenerContainerFactory21);
        java.lang.String str23 = jmsConfiguration14.getTransactionName();
        jmsConfiguration14.setErrorHandlerLogStackTrace(true);
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(destinationResolver19);
        org.junit.Assert.assertNotNull(connectionFactory20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
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
        int i16 = jmsConfiguration14.getReplyToOnTimeoutMaxConcurrentConsumers();
        boolean b17 = jmsConfiguration14.isDisableReplyTo();
        jmsConfiguration14.setConcurrentConsumers((-1));
        jmsConfiguration14.setRecoveryInterval((long) (short) 10);
        boolean b22 = jmsConfiguration14.isPreserveMessageQos();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        jmsEndpoint2.setBridgeErrorHandler(false);
        java.lang.String str10 = jmsEndpoint2.getReplyTo();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy11 = jmsEndpoint2.getMessageCreatedStrategy();
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(messageCreatedStrategy11);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str1 = activeMQConnection0.getTrustedPackages();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        activeMQConnection2.setObjectMessageSerializationDefered(true);
        activeMQConnection2.setUseDedicatedTaskRunner(true);
        org.apache.activemq.ActiveMQConnection activeMQConnection7 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b8 = activeMQConnection7.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection9 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str10 = activeMQConnection9.getTrustedPackages();
        activeMQConnection7.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection9);
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy12 = activeMQConnection9.getRedeliveryPolicy();
        activeMQConnection2.setRedeliveryPolicy(redeliveryPolicy12);
        activeMQConnection0.setRedeliveryPolicy(redeliveryPolicy12);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(list_str1);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(activeMQConnection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(activeMQConnection9);
        org.junit.Assert.assertNotNull(list_str10);
        org.junit.Assert.assertNotNull(redeliveryPolicy12);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent1 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        boolean b2 = brokerComponent1.isStarting();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination5 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("failover://tcp://localhost:61616");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration6 = new org.apache.activemq.camel.component.broker.BrokerConfiguration();
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint7 = new org.apache.activemq.camel.component.broker.BrokerEndpoint("2.19.3", brokerComponent1, "tcp://localhost:61616", activeMQDestination5, brokerConfiguration6);
        org.apache.activemq.command.ActiveMQDestination activeMQDestination8 = brokerEndpoint7.getDestination();
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer9 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint7);
        int i10 = brokerEndpoint7.getPollingConsumerQueueSize();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(activeMQDestination5);
        org.junit.Assert.assertNotNull(activeMQDestination8);
        org.junit.Assert.assertTrue(i10 == 1000);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        boolean b2 = activeMQConnection0.isUseAsyncSend();
        boolean b3 = activeMQConnection0.isAlwaysSessionAsync();
        java.lang.String str4 = activeMQConnection0.toString();
        activeMQConnection0.setDispatchAsync(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "ActiveMQConnection {id=ID:roei-main-45321-1522670064475-457:1,clientId=null,started=false}" + "'", str4.equals("ActiveMQConnection {id=ID:roei-main-45321-1522670064475-457:1,clientId=null,started=false}"));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
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
        boolean b17 = jmsConfiguration14.isAutoStartup();
        java.lang.String str18 = jmsConfiguration14.getReplyTo();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver19 = jmsConfiguration14.getDestinationResolver();
        org.springframework.jms.support.converter.MessageConverter messageConverter20 = jmsConfiguration14.getMessageConverter();
        long long21 = jmsConfiguration14.getTimeToLive();
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager22 = jmsConfiguration14.getTransactionManager();
        long long23 = jmsConfiguration14.getReceiveTimeout();
        org.junit.Assert.assertNotNull(componentConfiguration9);
        org.junit.Assert.assertNotNull(jmsConfiguration14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(destinationResolver19);
        org.junit.Assert.assertNull(messageConverter20);
        org.junit.Assert.assertTrue(long21 == (-1L));
        org.junit.Assert.assertNull(platformTransactionManager22);
        org.junit.Assert.assertTrue(long23 == 1000L);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isUseAsyncSend();
        org.apache.activemq.ActiveMQConnection activeMQConnection2 = org.apache.activemq.ActiveMQConnection.makeConnection();
        java.util.List<java.lang.String> list_str3 = activeMQConnection2.getTrustedPackages();
        activeMQConnection0.addTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection2);
        activeMQConnection0.transportInterupted();
        boolean b6 = activeMQConnection0.isWatchTopicAdvisories();
        long long7 = activeMQConnection0.getTimeCreated();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(activeMQConnection2);
        org.junit.Assert.assertNotNull(list_str3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(long7 == 1522670160750L);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        jmsEndpoint2.setBridgeErrorHandler(false);
        int i10 = jmsEndpoint2.getReplyToConcurrentConsumers();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj11 = null;
        jmsEndpoint2.setConsumerProperties(map_str_obj11);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getUserName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("queue:");
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint2 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelTopic1);
        jmsEndpoint2.setIdleTaskExecutionLimit(50);
        java.lang.String str5 = jmsEndpoint2.getReplyToOverride();
        org.apache.camel.spi.ExceptionHandler exceptionHandler6 = null;
        jmsEndpoint2.setExceptionHandler(exceptionHandler6);
        jmsEndpoint2.setAcknowledgementMode(0);
        org.junit.Assert.assertNotNull(jmsEndpoint2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.activemq.camel.camelplugin.CamelRoutesBrokerPlugin camelRoutesBrokerPlugin0 = new org.apache.activemq.camel.camelplugin.CamelRoutesBrokerPlugin();
        java.lang.String str1 = camelRoutesBrokerPlugin0.getRoutesFile();
        java.lang.String str2 = camelRoutesBrokerPlugin0.getRoutesFile();
        camelRoutesBrokerPlugin0.setCheckPeriod((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }
}

