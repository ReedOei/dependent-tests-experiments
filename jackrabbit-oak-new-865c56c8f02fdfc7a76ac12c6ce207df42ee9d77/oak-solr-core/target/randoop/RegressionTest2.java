import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.solr.client.solrj.SolrClient solrClient17 = defaultSolrServerProvider0.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient18 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient19 = defaultSolrServerProvider0.getSearchingSolrServer();
        java.lang.String[] str_array29 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration30 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array29);
        java.lang.reflect.Type type31 = remoteSolrServerConfiguration30.getType();
        int i32 = remoteSolrServerConfiguration30.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider33 = remoteSolrServerConfiguration30.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider34 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration30);
        java.lang.String str35 = remoteSolrServerConfiguration30.getSolrCollection();
        java.lang.String str36 = remoteSolrServerConfiguration30.getSolrCollection();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse37 = solrClient19.addBean("parentField", (java.lang.Object) str36);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.beans.BindingException");
        } catch (org.apache.solr.client.solrj.beans.BindingException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(solrClient17);
        org.junit.Assert.assertNotNull(solrClient18);
        org.junit.Assert.assertNotNull(solrClient19);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider3 = embeddedSolrServerConfiguration2.getProvider();
        java.lang.String str4 = embeddedSolrServerConfiguration2.getCoreName();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy5 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient6 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration2, strategy5);
        org.apache.solr.common.params.SolrParams solrParams7 = null;
        try {
            org.apache.solr.client.solrj.response.QueryResponse queryResponse8 = solrClient6.query(solrParams7);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "path_des" + "'", str4.equals("path_des"));
        org.junit.Assert.assertTrue("'" + strategy5 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy5.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNotNull(solrClient6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getSearchingSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder6 = solrClient5.getBinder();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse8 = solrClient5.deleteById("descendantsField");
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
        org.junit.Assert.assertNotNull(documentObjectBinder6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.spi.state.NodeBuilder nodeBuilder9 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState10 = null;
        org.apache.jackrabbit.oak.plugins.index.IndexUpdateCallback indexUpdateCallback11 = null;
        org.apache.jackrabbit.oak.spi.commit.Editor editor12 = solrIndexEditorProvider7.getIndexEditor("hi!_string_sort", nodeBuilder9, nodeState10, indexUpdateCallback11);
        org.apache.jackrabbit.oak.spi.state.NodeBuilder nodeBuilder14 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState15 = null;
        org.apache.jackrabbit.oak.plugins.index.IndexUpdateCallback indexUpdateCallback16 = null;
        org.apache.jackrabbit.oak.spi.commit.Editor editor17 = solrIndexEditorProvider7.getIndexEditor("coreName", nodeBuilder14, nodeState15, indexUpdateCallback16);
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNull(editor12);
        org.junit.Assert.assertNull(editor17);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder3 = solrClient2.getBinder();
        try {
            org.apache.solr.common.SolrDocument solrDocument5 = solrClient2.getById("");
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(documentObjectBinder3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        java.lang.String[] str_array15 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration16 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array15);
        java.lang.String str17 = remoteSolrServerConfiguration16.getSolrZkHost();
        java.lang.String[] str_array18 = remoteSolrServerConfiguration16.getSolrHttpUrls();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration19 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("path_des", "usedProperties", (int) (byte) 0, (int) (short) 0, "catchAllField", (int) (byte) 10, (int) (byte) 0, str_array18);
        int i20 = remoteSolrServerConfiguration19.getSolrReplicationFactor();
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        java.lang.CharSequence charSequence1 = org.apache.jackrabbit.oak.plugins.index.solr.util.SolrUtils.partialEscape((java.lang.CharSequence) "childrenField");
        org.junit.Assert.assertNotNull(charSequence1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration0 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str1 = defaultSolrConfiguration0.getPathField();
        boolean b2 = defaultSolrConfiguration0.collapseJcrContentNodes();
        boolean b3 = defaultSolrConfiguration0.useForPrimaryTypes();
        boolean b4 = defaultSolrConfiguration0.collapseJcrContentNodes();
        boolean b5 = defaultSolrConfiguration0.useForPathRestrictions();
        boolean b6 = defaultSolrConfiguration0.collapseJcrContentNodes();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "path_exact" + "'", str1.equals("path_exact"));
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.common.params.SolrParams solrParams6 = null;
        org.apache.solr.client.solrj.StreamingResponseCallback streamingResponseCallback7 = null;
        try {
            org.apache.solr.client.solrj.response.QueryResponse queryResponse8 = solrClient4.queryAndStreamResponse("commitPolicy", solrParams6, streamingResponseCallback7);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder6 = solrClient5.getBinder();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder7 = solrClient5.getBinder();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration8 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str9 = defaultSolrConfiguration8.getPathField();
        boolean b10 = defaultSolrConfiguration8.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider11 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration8);
        java.util.Collection<java.lang.String> collection_str12 = defaultSolrConfiguration8.getUsedProperties();
        java.util.Collection<java.lang.String> collection_str13 = defaultSolrConfiguration8.getIgnoredProperties();
        try {
            org.apache.solr.common.SolrDocumentList solrDocumentList14 = solrClient5.getById(collection_str13);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
        org.junit.Assert.assertNotNull(documentObjectBinder6);
        org.junit.Assert.assertNotNull(documentObjectBinder7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "path_exact" + "'", str9.equals("path_exact"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection_str12);
        org.junit.Assert.assertNotNull(collection_str13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        java.lang.String[] str_array25 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration26 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array25);
        java.lang.reflect.Type type27 = remoteSolrServerConfiguration26.getType();
        int i28 = remoteSolrServerConfiguration26.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider29 = remoteSolrServerConfiguration26.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration30 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str31 = defaultSolrConfiguration30.getPathField();
        boolean b32 = defaultSolrConfiguration30.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider33 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration30);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider34 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider29, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider33);
        java.lang.String[] str_array43 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration44 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array43);
        java.lang.reflect.Type type45 = remoteSolrServerConfiguration44.getType();
        int i46 = remoteSolrServerConfiguration44.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider47 = remoteSolrServerConfiguration44.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration48 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str49 = defaultSolrConfiguration48.getPathField();
        boolean b50 = defaultSolrConfiguration48.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider51 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration48);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider52 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider47, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider53 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider29, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider54 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.solr.client.solrj.SolrClient solrClient55 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient56 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient57 = defaultSolrServerProvider0.getSolrServer();
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "path_exact" + "'", str31.equals("path_exact"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "path_exact" + "'", str49.equals("path_exact"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(solrClient55);
        org.junit.Assert.assertNotNull(solrClient56);
        org.junit.Assert.assertNotNull(solrClient57);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.reflect.Type type10 = remoteSolrServerConfiguration9.getType();
        int i11 = remoteSolrServerConfiguration9.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = remoteSolrServerConfiguration9.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration9);
        int i14 = remoteSolrServerConfiguration9.getSolrShardsNo();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration9);
        java.lang.String str16 = remoteSolrServerConfiguration9.toString();
        int i17 = remoteSolrServerConfiguration9.getSolrReplicationFactor();
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider12);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "RemoteSolrServerConfiguration{solrConfDir='hi!', socketTimeout=1, connectionTimeout=-1, solrHttpUrls=[solrHomePath], solrZkHost='', solrCollection='hi!', solrShardsNo=1, solrReplicationFactor=100}" + "'", str16.equals("RemoteSolrServerConfiguration{solrConfDir='hi!', socketTimeout=1, connectionTimeout=-1, solrHttpUrls=[solrHomePath], solrZkHost='', solrCollection='hi!', solrShardsNo=1, solrReplicationFactor=100}"));
        org.junit.Assert.assertTrue(i17 == 100);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        java.lang.CharSequence charSequence1 = org.apache.jackrabbit.oak.plugins.index.solr.util.SolrUtils.partialEscape((java.lang.CharSequence) "zkHost");
        java.lang.CharSequence charSequence2 = org.apache.jackrabbit.oak.plugins.index.solr.util.SolrUtils.partialEscape(charSequence1);
        org.junit.Assert.assertNotNull(charSequence1);
        org.junit.Assert.assertNotNull(charSequence2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getIndexingSolrServer();
        solrClient5.close();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse10 = solrClient5.commit(true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        java.lang.String[] str_array9 = new java.lang.String[] { "http://127.0.0.1:8983/solr/oak", "RemoteSolrServerConfiguration{solrConfDir='path_anc', socketTimeout=1, connectionTimeout=0, solrHttpUrls=[solrHomePath], solrZkHost='hi!_string_sort', solrCollection='path_exact', solrShardsNo=100, solrReplicationFactor=10}" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration10 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("solrHomePath", "catch_all", 3000, (int) (byte) 100, "hi!_string_sort_string_sort", (int) '4', (int) (short) 100, str_array9);
        org.junit.Assert.assertNotNull(str_array9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider17 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient18 = defaultSolrServerProvider17.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient19 = defaultSolrServerProvider17.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient20 = defaultSolrServerProvider17.getIndexingSolrServer();
        java.lang.String[] str_array29 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration30 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array29);
        java.lang.reflect.Type type31 = remoteSolrServerConfiguration30.getType();
        int i32 = remoteSolrServerConfiguration30.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider33 = remoteSolrServerConfiguration30.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration34 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str35 = defaultSolrConfiguration34.getPathField();
        boolean b36 = defaultSolrConfiguration34.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider37 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration34);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider38 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider33, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider37);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration39 = defaultSolrConfigurationProvider37.getConfiguration();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider40 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider17, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider37);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration41 = defaultSolrConfigurationProvider37.getConfiguration();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator42 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider43 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider37, nodeAggregator42);
        defaultSolrServerProvider0.close();
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(solrClient18);
        org.junit.Assert.assertNotNull(solrClient19);
        org.junit.Assert.assertNotNull(solrClient20);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue(i32 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "path_exact" + "'", str35.equals("path_exact"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(oakSolrConfiguration39);
        org.junit.Assert.assertNotNull(oakSolrConfiguration41);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.solr.client.solrj.SolrClient solrClient17 = defaultSolrServerProvider0.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient18 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient19 = defaultSolrServerProvider0.getSearchingSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse20 = solrClient19.commit();
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(solrClient17);
        org.junit.Assert.assertNotNull(solrClient18);
        org.junit.Assert.assertNotNull(solrClient19);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.String str10 = remoteSolrServerConfiguration9.getSolrZkHost();
        java.lang.String[] str_array11 = remoteSolrServerConfiguration9.getSolrHttpUrls();
        java.lang.String str12 = remoteSolrServerConfiguration9.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy13 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient14 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration9, strategy13);
        try {
            org.apache.solr.common.SolrDocument solrDocument16 = solrClient14.getById("/solr_string_sort");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + strategy13 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy13.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNull(solrClient14);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.solr.client.solrj.SolrClient solrClient17 = defaultSolrServerProvider0.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient18 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.common.params.SolrParams solrParams20 = null;
        org.apache.solr.client.solrj.SolrRequest.METHOD mETHOD21 = null;
        try {
            org.apache.solr.client.solrj.response.QueryResponse queryResponse22 = solrClient18.query("propertyMappings_string_sort", solrParams20, mETHOD21);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(solrClient17);
        org.junit.Assert.assertNotNull(solrClient18);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.reflect.Type type10 = remoteSolrServerConfiguration9.getType();
        int i11 = remoteSolrServerConfiguration9.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = remoteSolrServerConfiguration9.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str14 = defaultSolrConfiguration13.getPathField();
        boolean b15 = defaultSolrConfiguration13.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider17 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider16);
        org.apache.jackrabbit.oak.spi.state.NodeBuilder nodeBuilder19 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState20 = null;
        org.apache.jackrabbit.oak.plugins.index.IndexUpdateCallback indexUpdateCallback21 = null;
        org.apache.jackrabbit.oak.spi.commit.Editor editor22 = solrIndexEditorProvider17.getIndexEditor("hi!_string_sort_string_sort", nodeBuilder19, nodeState20, indexUpdateCallback21);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "path_exact" + "'", str14.equals("path_exact"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(editor22);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        java.util.List<java.lang.String> list_str3 = null;
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse4 = solrClient2.deleteById(list_str3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse8 = solrClient4.optimize("catchAllField", true, true);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.reflect.Type type10 = remoteSolrServerConfiguration9.getType();
        java.lang.String str11 = remoteSolrServerConfiguration9.getSolrConfDir();
        java.lang.String str12 = remoteSolrServerConfiguration9.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient14 = defaultSolrServerProvider13.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy15 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration9, solrClient14, strategy15);
        org.apache.solr.common.SolrInputDocument solrInputDocument18 = null;
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse20 = solrClient14.add("hi!_string_sort_string_sort", solrInputDocument18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(solrClient14);
        org.junit.Assert.assertTrue("'" + strategy15 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy15.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider embeddedSolrServerConfigurationProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration<org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider> solrserverconfiguration_embeddedSolrServerProvider1 = embeddedSolrServerConfigurationProvider0.getSolrServerConfiguration();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration<org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider> solrserverconfiguration_embeddedSolrServerProvider2 = embeddedSolrServerConfigurationProvider0.getSolrServerConfiguration();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration<org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider> solrserverconfiguration_embeddedSolrServerProvider3 = embeddedSolrServerConfigurationProvider0.getSolrServerConfiguration();
        org.junit.Assert.assertNull(solrserverconfiguration_embeddedSolrServerProvider1);
        org.junit.Assert.assertNull(solrserverconfiguration_embeddedSolrServerProvider2);
        org.junit.Assert.assertNull(solrserverconfiguration_embeddedSolrServerProvider3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient3 = defaultSolrServerProvider0.getIndexingSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse7 = solrClient3.deleteByQuery("httpUrl", "hi!_string_sort_string_sort", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.nodestate.NodeStateSolrServerProvider nodeStateSolrServerProvider1 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.nodestate.NodeStateSolrServerProvider(nodeState0);
        nodeStateSolrServerProvider1.close();
        nodeStateSolrServerProvider1.close();
        try {
            org.apache.solr.client.solrj.SolrClient solrClient4 = nodeStateSolrServerProvider1.getSearchingSolrServer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration0 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str1 = defaultSolrConfiguration0.getPathField();
        boolean b2 = defaultSolrConfiguration0.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider3 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration0);
        java.util.Collection<java.lang.String> collection_str4 = defaultSolrConfiguration0.getUsedProperties();
        java.lang.String str5 = defaultSolrConfiguration0.getPathField();
        java.lang.String str6 = defaultSolrConfiguration0.getPathField();
        org.apache.jackrabbit.oak.spi.query.Filter.PropertyRestriction propertyRestriction7 = null;
        java.lang.String str8 = defaultSolrConfiguration0.getFieldForPropertyRestriction(propertyRestriction7);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "path_exact" + "'", str1.equals("path_exact"));
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(collection_str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "path_exact" + "'", str5.equals("path_exact"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "path_exact" + "'", str6.equals("path_exact"));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration0 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str1 = defaultSolrConfiguration0.getPathField();
        int i2 = defaultSolrConfiguration0.getRows();
        boolean b3 = defaultSolrConfiguration0.useForPathRestrictions();
        java.util.Collection<java.lang.String> collection_str4 = defaultSolrConfiguration0.getUsedProperties();
        boolean b5 = defaultSolrConfiguration0.useForPrimaryTypes();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "path_exact" + "'", str1.equals("path_exact"));
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection_str4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        java.lang.String[] str_array25 = new java.lang.String[] { "solrHomePath", "8983", "hi!", "path_des" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration26 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("childrenField", "httpPort", (int) 'a', 0, "http://127.0.0.1:8983/solr/oak", 1, (int) (byte) 1, str_array25);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration27 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("commitPolicy", "path_des", 0, (int) (short) -1, "socketTimeout", (int) (byte) 1, (-1), str_array25);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration28 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("collapseJcrContentNodes", "catch_all", 0, 2, "127.0.0.1:9983", (int) 'a', 10, str_array25);
        java.lang.String[] str_array29 = remoteSolrServerConfiguration28.getSolrHttpUrls();
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertNotNull(str_array29);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration6 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str7 = defaultSolrConfiguration6.getPathField();
        boolean b8 = defaultSolrConfiguration6.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration6);
        java.util.Collection<java.lang.String> collection_str10 = defaultSolrConfiguration6.getUsedProperties();
        java.util.Collection<java.lang.String> collection_str11 = defaultSolrConfiguration6.getIgnoredProperties();
        org.apache.solr.common.params.SolrParams solrParams12 = null;
        try {
            org.apache.solr.common.SolrDocumentList solrDocumentList13 = solrClient4.getById("replicationFactor", collection_str11, solrParams12);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "path_exact" + "'", str7.equals("path_exact"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection_str10);
        org.junit.Assert.assertNotNull(collection_str11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.solr.client.solrj.SolrClient solrClient8 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider0.getSearchingSolrServer();
        java.lang.Object obj10 = null;
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse12 = solrClient9.addBean(obj10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient8);
        org.junit.Assert.assertNotNull(solrClient9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        java.lang.reflect.Type type3 = embeddedSolrServerConfiguration2.getType();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator4 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider5 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex7 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator4, oakSolrConfigurationProvider5, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider6);
        org.apache.solr.client.solrj.SolrClient solrClient8 = defaultSolrServerProvider6.getSolrServer();
        java.lang.String[] str_array17 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration18 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array17);
        java.lang.reflect.Type type19 = remoteSolrServerConfiguration18.getType();
        java.lang.String str20 = remoteSolrServerConfiguration18.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider21 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration18);
        java.lang.String[] str_array30 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration31 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array30);
        java.lang.reflect.Type type32 = remoteSolrServerConfiguration31.getType();
        java.lang.String str33 = remoteSolrServerConfiguration31.getSolrConfDir();
        java.lang.String str34 = remoteSolrServerConfiguration31.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider35 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient36 = defaultSolrServerProvider35.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy37 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration31, solrClient36, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration18, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration2, solrClient8, strategy37);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse42 = solrClient8.commit("ignoredProperties");
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(solrClient8);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertNotNull(solrClient36);
        org.junit.Assert.assertTrue("'" + strategy37 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy37.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder6 = solrClient5.getBinder();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder7 = solrClient5.getBinder();
        try {
            org.apache.solr.client.solrj.response.SolrPingResponse solrPingResponse8 = solrClient5.ping();
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
        org.junit.Assert.assertNotNull(documentObjectBinder6);
        org.junit.Assert.assertNotNull(documentObjectBinder7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration0 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str1 = defaultSolrConfiguration0.getPathField();
        boolean b2 = defaultSolrConfiguration0.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider3 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration0);
        boolean b4 = defaultSolrConfiguration0.useForPropertyRestrictions();
        java.lang.String str5 = defaultSolrConfiguration0.getPathDepthField();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "path_exact" + "'", str1.equals("path_exact"));
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "path_depth" + "'", str5.equals("path_depth"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider3 = embeddedSolrServerConfiguration2.getProvider();
        java.lang.String str4 = embeddedSolrServerConfiguration2.getCoreName();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy5 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient6 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration2, strategy5);
        solrClient6.close();
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "path_des" + "'", str4.equals("path_des"));
        org.junit.Assert.assertTrue("'" + strategy5 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy5.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNotNull(solrClient6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider1 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration0);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider3 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider2);
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService oakSolrConfigurationProviderService4 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService4);
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator6 = null;
        java.lang.String[] str_array15 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration16 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array15);
        java.lang.reflect.Type type17 = remoteSolrServerConfiguration16.getType();
        int i18 = remoteSolrServerConfiguration16.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider19 = remoteSolrServerConfiguration16.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider20 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration16);
        remoteSolrServerProvider20.close();
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService oakSolrConfigurationProviderService22 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration23 = oakSolrConfigurationProviderService22.getConfiguration();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator24 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider25 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider20, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService22, nodeAggregator24);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration26 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider27 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration26);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider28 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider29 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider27, oakSolrConfigurationProvider28);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex30 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator6, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService22, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider27);
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator31 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider32 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService22, nodeAggregator31);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration33 = oakSolrConfigurationProviderService22.getConfiguration();
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider19);
        org.junit.Assert.assertNotNull(oakSolrConfiguration23);
        org.junit.Assert.assertNotNull(oakSolrConfiguration33);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        java.lang.String[] str_array15 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration16 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array15);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration17 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("catchAllField", "commitPolicy", (int) (byte) 1, (int) (short) 100, "pathField", (int) ' ', 10, str_array15);
        java.lang.String[] str_array18 = remoteSolrServerConfiguration17.getSolrHttpUrls();
        int i19 = remoteSolrServerConfiguration17.getSocketTimeout();
        int i20 = remoteSolrServerConfiguration17.getSolrShardsNo();
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(i19 == 32);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        java.lang.String[] str_array9 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration10 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array9);
        java.lang.reflect.Type type11 = remoteSolrServerConfiguration10.getType();
        int i12 = remoteSolrServerConfiguration10.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider13 = remoteSolrServerConfiguration10.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration14 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str15 = defaultSolrConfiguration14.getPathField();
        boolean b16 = defaultSolrConfiguration14.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider17 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration14);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider18 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider13, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider17);
        java.lang.String[] str_array27 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration28 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array27);
        java.lang.reflect.Type type29 = remoteSolrServerConfiguration28.getType();
        int i30 = remoteSolrServerConfiguration28.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider31 = remoteSolrServerConfiguration28.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration32 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str33 = defaultSolrConfiguration32.getPathField();
        boolean b34 = defaultSolrConfiguration32.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider35 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration32);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider36 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider31, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider35);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider37 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider13, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider35);
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator38 = null;
        java.lang.String[] str_array47 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration48 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array47);
        java.lang.reflect.Type type49 = remoteSolrServerConfiguration48.getType();
        int i50 = remoteSolrServerConfiguration48.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider51 = remoteSolrServerConfiguration48.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider52 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration48);
        remoteSolrServerProvider52.close();
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService oakSolrConfigurationProviderService54 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration55 = oakSolrConfigurationProviderService54.getConfiguration();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator56 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider57 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider52, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService54, nodeAggregator56);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration58 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider59 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration58);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider60 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider61 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider59, oakSolrConfigurationProvider60);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex62 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator38, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService54, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider59);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex63 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider35, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider59);
        try {
            org.apache.solr.client.solrj.SolrClient solrClient64 = remoteSolrServerProvider59.getSearchingSolrServer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "path_exact" + "'", str15.equals("path_exact"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider31);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "path_exact" + "'", str33.equals("path_exact"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(str_array47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue(i50 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider51);
        org.junit.Assert.assertNotNull(oakSolrConfiguration55);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration0 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str1 = defaultSolrConfiguration0.getPathField();
        int i2 = defaultSolrConfiguration0.getRows();
        boolean b3 = defaultSolrConfiguration0.useForPathRestrictions();
        boolean b4 = defaultSolrConfiguration0.useForPrimaryTypes();
        java.util.Collection<java.lang.String> collection_str5 = defaultSolrConfiguration0.getIgnoredProperties();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "path_exact" + "'", str1.equals("path_exact"));
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection_str5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        defaultSolrServerProvider0.close();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder10 = solrClient9.getBinder();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse12 = solrClient9.commit("replicationFactor");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(documentObjectBinder10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        java.lang.reflect.Type type3 = embeddedSolrServerConfiguration2.getType();
        java.lang.String[] str_array12 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array12);
        java.lang.reflect.Type type14 = remoteSolrServerConfiguration13.getType();
        java.lang.String str15 = remoteSolrServerConfiguration13.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration13);
        java.lang.String[] str_array25 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration26 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array25);
        java.lang.reflect.Type type27 = remoteSolrServerConfiguration26.getType();
        java.lang.String str28 = remoteSolrServerConfiguration26.getSolrConfDir();
        java.lang.String str29 = remoteSolrServerConfiguration26.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider30 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient31 = defaultSolrServerProvider30.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy32 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration26, solrClient31, strategy32);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration13, strategy32);
        org.apache.solr.client.solrj.SolrClient solrClient35 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration2, strategy32);
        org.apache.solr.common.params.SolrParams solrParams36 = null;
        org.apache.solr.client.solrj.SolrRequest.METHOD mETHOD37 = null;
        try {
            org.apache.solr.client.solrj.response.QueryResponse queryResponse38 = solrClient35.query(solrParams36, mETHOD37);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(str_array12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertNotNull(solrClient31);
        org.junit.Assert.assertTrue("'" + strategy32 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy32.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNotNull(solrClient35);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        solrClient4.close();
        org.apache.solr.common.params.SolrParams solrParams6 = null;
        try {
            org.apache.solr.client.solrj.response.QueryResponse queryResponse7 = solrClient4.query(solrParams6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        org.apache.jackrabbit.oak.plugins.index.solr.util.SolrIndexInitializer solrIndexInitializer1 = new org.apache.jackrabbit.oak.plugins.index.solr.util.SolrIndexInitializer("zkHost");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        java.lang.reflect.Type type3 = embeddedSolrServerConfiguration2.getType();
        java.lang.String str4 = embeddedSolrServerConfiguration2.getCoreName();
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider(embeddedSolrServerConfiguration2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "path_des" + "'", str4.equals("path_des"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        java.lang.String[] str_array15 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration16 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array15);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration17 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("catchAllField", "commitPolicy", (int) (byte) 1, (int) (short) 100, "pathField", (int) ' ', 10, str_array15);
        java.lang.String[] str_array18 = remoteSolrServerConfiguration17.getSolrHttpUrls();
        java.lang.reflect.Type type19 = remoteSolrServerConfiguration17.getType();
        java.lang.String str20 = remoteSolrServerConfiguration17.getSolrConfDir();
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "pathField" + "'", str20.equals("pathField"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getSolrServer();
        org.apache.solr.common.SolrInputDocument[] solrInputDocument_array6 = new org.apache.solr.common.SolrInputDocument[] {};
        java.util.ArrayList<org.apache.solr.common.SolrInputDocument> arraylist_solrInputDocument7 = new java.util.ArrayList<org.apache.solr.common.SolrInputDocument>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.solr.common.SolrInputDocument>) arraylist_solrInputDocument7, solrInputDocument_array6);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse10 = solrClient4.add("http://127.0.0.1", (java.util.Collection<org.apache.solr.common.SolrInputDocument>) arraylist_solrInputDocument7, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrInputDocument_array6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.reflect.Type type10 = remoteSolrServerConfiguration9.getType();
        java.lang.String str11 = remoteSolrServerConfiguration9.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration9);
        java.lang.String[] str_array21 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration22 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array21);
        java.lang.reflect.Type type23 = remoteSolrServerConfiguration22.getType();
        int i24 = remoteSolrServerConfiguration22.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider25 = remoteSolrServerConfiguration22.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration26 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str27 = defaultSolrConfiguration26.getPathField();
        boolean b28 = defaultSolrConfiguration26.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider29 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration26);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider30 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider25, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider29);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider31 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient32 = defaultSolrServerProvider31.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient33 = defaultSolrServerProvider31.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration34 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider35 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration34);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider36 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider37 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider35, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider36);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider38 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider31, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider36);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider39 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient40 = defaultSolrServerProvider39.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient41 = defaultSolrServerProvider39.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration42 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider43 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration42);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider44 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider45 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider43, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider44);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider46 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider39, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider44);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider47 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider31, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider44);
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator48 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider49 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider25, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider44, nodeAggregator48);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider50 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider44);
        try {
            org.apache.solr.client.solrj.SolrClient solrClient51 = remoteSolrServerProvider12.getIndexingSolrServer();
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue(i24 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider25);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "path_exact" + "'", str27.equals("path_exact"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(solrClient32);
        org.junit.Assert.assertNotNull(solrClient33);
        org.junit.Assert.assertNotNull(solrClient40);
        org.junit.Assert.assertNotNull(solrClient41);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration0 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str1 = defaultSolrConfiguration0.getPathField();
        boolean b2 = defaultSolrConfiguration0.collapseJcrContentNodes();
        boolean b3 = defaultSolrConfiguration0.useForPrimaryTypes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy commitPolicy4 = defaultSolrConfiguration0.getCommitPolicy();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "path_exact" + "'", str1.equals("path_exact"));
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + commitPolicy4 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy.SOFT + "'", commitPolicy4.equals(org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy.SOFT));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        java.lang.String[] str_array15 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration16 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array15);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration17 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("catchAllField", "commitPolicy", (int) (byte) 1, (int) (short) 100, "pathField", (int) ' ', 10, str_array15);
        java.lang.String[] str_array18 = remoteSolrServerConfiguration17.getSolrHttpUrls();
        int i19 = remoteSolrServerConfiguration17.getSocketTimeout();
        int i20 = remoteSolrServerConfiguration17.getConnectionTimeout();
        java.lang.reflect.Type type21 = remoteSolrServerConfiguration17.getType();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy22 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration17, strategy22);
        int i24 = remoteSolrServerConfiguration17.getConnectionTimeout();
        int i25 = remoteSolrServerConfiguration17.getSolrShardsNo();
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertTrue(i19 == 32);
        org.junit.Assert.assertTrue(i20 == 10);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + strategy22 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy22.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertTrue(i24 == 10);
        org.junit.Assert.assertTrue(i25 == 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.reflect.Type type10 = remoteSolrServerConfiguration9.getType();
        int i11 = remoteSolrServerConfiguration9.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = remoteSolrServerConfiguration9.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str14 = defaultSolrConfiguration13.getPathField();
        boolean b15 = defaultSolrConfiguration13.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider17 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider16);
        java.lang.String[] str_array26 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration27 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array26);
        java.lang.reflect.Type type28 = remoteSolrServerConfiguration27.getType();
        int i29 = remoteSolrServerConfiguration27.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider30 = remoteSolrServerConfiguration27.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration31 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str32 = defaultSolrConfiguration31.getPathField();
        boolean b33 = defaultSolrConfiguration31.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider34 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration31);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider35 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider30, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider34);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider36 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider34);
        org.apache.jackrabbit.oak.spi.state.NodeBuilder nodeBuilder38 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState39 = null;
        org.apache.jackrabbit.oak.plugins.index.IndexUpdateCallback indexUpdateCallback40 = null;
        org.apache.jackrabbit.oak.spi.commit.Editor editor41 = solrIndexEditorProvider36.getIndexEditor("coreName", nodeBuilder38, nodeState39, indexUpdateCallback40);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "path_exact" + "'", str14.equals("path_exact"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider30);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "path_exact" + "'", str32.equals("path_exact"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(editor41);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.common.params.SolrParams solrParams2 = null;
        org.apache.solr.client.solrj.SolrRequest.METHOD mETHOD3 = null;
        try {
            org.apache.solr.client.solrj.response.QueryResponse queryResponse4 = solrClient1.query(solrParams2, mETHOD3);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient3 = defaultSolrServerProvider0.getIndexingSolrServer();
        java.lang.String[] str_array12 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array12);
        java.lang.reflect.Type type14 = remoteSolrServerConfiguration13.getType();
        int i15 = remoteSolrServerConfiguration13.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider16 = remoteSolrServerConfiguration13.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration17 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str18 = defaultSolrConfiguration17.getPathField();
        boolean b19 = defaultSolrConfiguration17.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider20 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration17);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider21 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider16, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider20);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration22 = defaultSolrConfigurationProvider20.getConfiguration();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider23 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider20);
        org.apache.solr.client.solrj.SolrClient solrClient24 = defaultSolrServerProvider0.getSolrServer();
        try {
            org.apache.solr.common.SolrDocument solrDocument26 = solrClient24.getById("path_des");
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient3);
        org.junit.Assert.assertNotNull(str_array12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "path_exact" + "'", str18.equals("path_exact"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(oakSolrConfiguration22);
        org.junit.Assert.assertNotNull(solrClient24);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        defaultSolrServerProvider0.close();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder10 = solrClient9.getBinder();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse13 = solrClient9.deleteByQuery("primaryTypes", "RemoteSolrServerConfiguration{solrConfDir='path_anc', socketTimeout=1, connectionTimeout=0, solrHttpUrls=[solrHomePath], solrZkHost='hi!_string_sort', solrCollection='path_exact', solrShardsNo=100, solrReplicationFactor=10}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(documentObjectBinder10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        java.lang.CharSequence charSequence1 = org.apache.jackrabbit.oak.plugins.index.solr.util.SolrUtils.partialEscape((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(charSequence1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("typeMappings", "hi!_string_sort");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str6 = defaultSolrConfiguration5.getPathField();
        boolean b7 = defaultSolrConfiguration5.collapseJcrContentNodes();
        boolean b8 = defaultSolrConfiguration5.useForPrimaryTypes();
        boolean b9 = defaultSolrConfiguration5.collapseJcrContentNodes();
        java.util.Collection<java.lang.String> collection_str10 = defaultSolrConfiguration5.getUsedProperties();
        try {
            org.apache.solr.common.SolrDocumentList solrDocumentList11 = solrClient4.getById(collection_str10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "path_exact" + "'", str6.equals("path_exact"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection_str10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider10 = embeddedSolrServerConfiguration9.getProvider();
        java.lang.String str11 = embeddedSolrServerConfiguration9.getCoreName();
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider12 = embeddedSolrServerConfiguration9.getProvider();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse14 = solrClient5.addBean("path_child", (java.lang.Object) embeddedSolrServerProvider12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.beans.BindingException");
        } catch (org.apache.solr.client.solrj.beans.BindingException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "path_des" + "'", str11.equals("path_des"));
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder6 = solrClient5.getBinder();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse11 = solrClient5.optimize("/solr", true, false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
        org.junit.Assert.assertNotNull(documentObjectBinder6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder5 = solrClient4.getBinder();
        org.apache.solr.common.SolrInputDocument[] solrInputDocument_array7 = new org.apache.solr.common.SolrInputDocument[] {};
        java.util.ArrayList<org.apache.solr.common.SolrInputDocument> arraylist_solrInputDocument8 = new java.util.ArrayList<org.apache.solr.common.SolrInputDocument>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.solr.common.SolrInputDocument>) arraylist_solrInputDocument8, solrInputDocument_array7);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse11 = solrClient4.add("descendantsField", (java.util.Collection<org.apache.solr.common.SolrInputDocument>) arraylist_solrInputDocument8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(documentObjectBinder5);
        org.junit.Assert.assertNotNull(solrInputDocument_array7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("propertyMappings", "ignoredProperties");
        java.lang.String str3 = embeddedSolrServerConfiguration2.toString();
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider4 = embeddedSolrServerConfiguration2.getProvider();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "EmbeddedSolrServerConfiguration{solrHomePath='propertyMappings', coreName='ignoredProperties', httpConfiguration=null}" + "'", str3.equals("EmbeddedSolrServerConfiguration{solrHomePath='propertyMappings', coreName='ignoredProperties', httpConfiguration=null}"));
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration6 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str7 = defaultSolrConfiguration6.getCollapsedPathField();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy commitPolicy8 = defaultSolrConfiguration6.getCommitPolicy();
        java.util.Collection<java.lang.String> collection_str9 = defaultSolrConfiguration6.getIgnoredProperties();
        try {
            org.apache.solr.common.SolrDocumentList solrDocumentList10 = solrClient4.getById("oak", collection_str9);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "path_collapsed" + "'", str7.equals("path_collapsed"));
        org.junit.Assert.assertTrue("'" + commitPolicy8 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy.SOFT + "'", commitPolicy8.equals(org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy.SOFT));
        org.junit.Assert.assertNotNull(collection_str9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder3 = solrClient2.getBinder();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration4 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str5 = defaultSolrConfiguration4.getPathField();
        boolean b6 = defaultSolrConfiguration4.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration4);
        java.util.Collection<java.lang.String> collection_str8 = defaultSolrConfiguration4.getUsedProperties();
        java.lang.String str9 = defaultSolrConfiguration4.getPathField();
        java.lang.String str10 = defaultSolrConfiguration4.getPathField();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse12 = solrClient2.addBean((java.lang.Object) str10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.beans.BindingException");
        } catch (org.apache.solr.client.solrj.beans.BindingException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(documentObjectBinder3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "path_exact" + "'", str5.equals("path_exact"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection_str8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "path_exact" + "'", str9.equals("path_exact"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "path_exact" + "'", str10.equals("path_exact"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration1);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider3 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider2, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration5 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration5);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider7 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6, oakSolrConfigurationProvider7);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider9 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider10 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6, oakSolrConfigurationProvider9);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex11 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider3, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6);
        java.lang.String str12 = solrQueryIndex11.getIndexName();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator13 = solrQueryIndex11.getNodeAggregator();
        double d14 = solrQueryIndex11.getMinimumCost();
        org.apache.jackrabbit.oak.spi.query.Filter filter15 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState16 = null;
        try {
            double d17 = solrQueryIndex11.getCost(filter15, nodeState16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "solr" + "'", str12.equals("solr"));
        org.junit.Assert.assertNull(nodeAggregator13);
        org.junit.Assert.assertTrue(d14 == 2.3d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        java.lang.String[] str_array15 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration16 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array15);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration17 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("catchAllField", "commitPolicy", (int) (byte) 1, (int) (short) 100, "pathField", (int) ' ', 10, str_array15);
        java.lang.String[] str_array18 = remoteSolrServerConfiguration17.getSolrHttpUrls();
        java.lang.reflect.Type type19 = remoteSolrServerConfiguration17.getType();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy20 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient21 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration17, strategy20);
        java.lang.String[] str_array30 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration31 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array30);
        java.lang.String str32 = remoteSolrServerConfiguration31.getSolrZkHost();
        java.lang.String[] str_array33 = remoteSolrServerConfiguration31.getSolrHttpUrls();
        java.lang.String str34 = remoteSolrServerConfiguration31.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy35 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient36 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration31, strategy35);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration17, strategy35);
        java.lang.String str38 = remoteSolrServerConfiguration17.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider39 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration17);
        java.lang.String str40 = remoteSolrServerConfiguration17.getSolrCollection();
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + strategy20 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy20.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNull(solrClient21);
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertNotNull(str_array33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue("'" + strategy35 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy35.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNull(solrClient36);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "pathField" + "'", str38.equals("pathField"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "commitPolicy" + "'", str40.equals("commitPolicy"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getSolrServer();
        solrClient5.close();
        org.apache.solr.common.params.SolrParams solrParams8 = null;
        org.apache.solr.client.solrj.StreamingResponseCallback streamingResponseCallback9 = null;
        try {
            org.apache.solr.client.solrj.response.QueryResponse queryResponse10 = solrClient5.queryAndStreamResponse("solrHomePath", solrParams8, streamingResponseCallback9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration0 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str1 = defaultSolrConfiguration0.getCatchAllField();
        java.util.Collection<java.lang.String> collection_str2 = defaultSolrConfiguration0.getUsedProperties();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy commitPolicy3 = defaultSolrConfiguration0.getCommitPolicy();
        java.util.Collection<java.lang.String> collection_str4 = defaultSolrConfiguration0.getUsedProperties();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "catch_all" + "'", str1.equals("catch_all"));
        org.junit.Assert.assertNotNull(collection_str2);
        org.junit.Assert.assertTrue("'" + commitPolicy3 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy.SOFT + "'", commitPolicy3.equals(org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy.SOFT));
        org.junit.Assert.assertNotNull(collection_str4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        java.lang.String str2 = org.apache.jackrabbit.oak.plugins.index.solr.util.SolrUtils.getSortingField((int) (short) -1, "/solr_string_sort");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "/solr_string_sort_string_sort" + "'", str2.equals("/solr_string_sort_string_sort"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        defaultSolrServerProvider0.close();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder10 = solrClient9.getBinder();
        org.apache.solr.common.params.SolrParams solrParams11 = null;
        try {
            org.apache.solr.client.solrj.response.QueryResponse queryResponse12 = solrClient9.query(solrParams11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(documentObjectBinder10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        java.lang.CharSequence charSequence1 = org.apache.jackrabbit.oak.plugins.index.solr.util.SolrUtils.partialEscape((java.lang.CharSequence) "http://127.0.0.1");
        org.junit.Assert.assertNotNull(charSequence1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        java.lang.reflect.Type type3 = embeddedSolrServerConfiguration2.getType();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator4 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider5 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex7 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator4, oakSolrConfigurationProvider5, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider6);
        org.apache.solr.client.solrj.SolrClient solrClient8 = defaultSolrServerProvider6.getSolrServer();
        java.lang.String[] str_array17 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration18 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array17);
        java.lang.reflect.Type type19 = remoteSolrServerConfiguration18.getType();
        java.lang.String str20 = remoteSolrServerConfiguration18.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider21 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration18);
        java.lang.String[] str_array30 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration31 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array30);
        java.lang.reflect.Type type32 = remoteSolrServerConfiguration31.getType();
        java.lang.String str33 = remoteSolrServerConfiguration31.getSolrConfDir();
        java.lang.String str34 = remoteSolrServerConfiguration31.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider35 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient36 = defaultSolrServerProvider35.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy37 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration31, solrClient36, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration18, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration2, solrClient8, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration43 = embeddedSolrServerConfiguration2.withHttpConfiguration("catch_all", (java.lang.Integer) 10);
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider44 = embeddedSolrServerConfiguration2.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration.HttpConfiguration httpConfiguration45 = embeddedSolrServerConfiguration2.getHttpConfiguration();
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(solrClient8);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertNotNull(solrClient36);
        org.junit.Assert.assertTrue("'" + strategy37 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy37.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNotNull(embeddedSolrServerConfiguration43);
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider44);
        org.junit.Assert.assertNotNull(httpConfiguration45);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        java.lang.reflect.Type type3 = embeddedSolrServerConfiguration2.getType();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator4 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider5 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex7 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator4, oakSolrConfigurationProvider5, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider6);
        org.apache.solr.client.solrj.SolrClient solrClient8 = defaultSolrServerProvider6.getSolrServer();
        java.lang.String[] str_array17 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration18 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array17);
        java.lang.reflect.Type type19 = remoteSolrServerConfiguration18.getType();
        java.lang.String str20 = remoteSolrServerConfiguration18.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider21 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration18);
        java.lang.String[] str_array30 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration31 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array30);
        java.lang.reflect.Type type32 = remoteSolrServerConfiguration31.getType();
        java.lang.String str33 = remoteSolrServerConfiguration31.getSolrConfDir();
        java.lang.String str34 = remoteSolrServerConfiguration31.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider35 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient36 = defaultSolrServerProvider35.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy37 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration31, solrClient36, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration18, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration2, solrClient8, strategy37);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse42 = solrClient8.commit("127.0.0.1:9983");
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(solrClient8);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertNotNull(solrClient36);
        org.junit.Assert.assertTrue("'" + strategy37 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy37.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider3 = embeddedSolrServerConfiguration2.getProvider();
        java.lang.String str4 = embeddedSolrServerConfiguration2.getCoreName();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy5 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient6 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration2, strategy5);
        org.apache.solr.common.params.SolrParams solrParams8 = null;
        org.apache.solr.client.solrj.SolrRequest.METHOD mETHOD9 = null;
        try {
            org.apache.solr.client.solrj.response.QueryResponse queryResponse10 = solrClient6.query("solrContext", solrParams8, mETHOD9);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "path_des" + "'", str4.equals("path_des"));
        org.junit.Assert.assertTrue("'" + strategy5 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy5.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNotNull(solrClient6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.reflect.Type type10 = remoteSolrServerConfiguration9.getType();
        int i11 = remoteSolrServerConfiguration9.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = remoteSolrServerConfiguration9.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration9);
        java.lang.String[] str_array22 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration23 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array22);
        java.lang.String str24 = remoteSolrServerConfiguration23.getSolrZkHost();
        java.lang.String[] str_array25 = remoteSolrServerConfiguration23.getSolrHttpUrls();
        java.lang.String str26 = remoteSolrServerConfiguration23.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy27 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient28 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration23, strategy27);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration9, strategy27);
        java.lang.reflect.Type type30 = remoteSolrServerConfiguration9.getType();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider31 = remoteSolrServerConfiguration9.getProvider();
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider12);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + strategy27 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy27.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNull(solrClient28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(remoteSolrServerProvider31);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getSearchingSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder6 = solrClient5.getBinder();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse7 = solrClient5.commit();
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
        org.junit.Assert.assertNotNull(documentObjectBinder6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        defaultSolrServerProvider0.close();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder10 = solrClient9.getBinder();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder11 = solrClient9.getBinder();
        org.apache.solr.common.SolrInputDocument[] solrInputDocument_array12 = new org.apache.solr.common.SolrInputDocument[] {};
        java.util.ArrayList<org.apache.solr.common.SolrInputDocument> arraylist_solrInputDocument13 = new java.util.ArrayList<org.apache.solr.common.SolrInputDocument>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.solr.common.SolrInputDocument>) arraylist_solrInputDocument13, solrInputDocument_array12);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse15 = solrClient9.add((java.util.Collection<org.apache.solr.common.SolrInputDocument>) arraylist_solrInputDocument13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(documentObjectBinder10);
        org.junit.Assert.assertNotNull(documentObjectBinder11);
        org.junit.Assert.assertNotNull(solrInputDocument_array12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getIndexingSolrServer();
        solrClient5.close();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse11 = solrClient5.commit("RemoteSolrServerConfiguration{solrConfDir='pathField', socketTimeout=32, connectionTimeout=10, solrHttpUrls=[solrHomePath], solrZkHost='catchAllField', solrCollection='commitPolicy', solrShardsNo=1, solrReplicationFactor=100}", true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration1);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider3 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider2, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration5 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration5);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider7 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6, oakSolrConfigurationProvider7);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider9 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider10 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6, oakSolrConfigurationProvider9);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex11 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider3, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6);
        java.lang.String str12 = solrQueryIndex11.getIndexName();
        double d13 = solrQueryIndex11.getMinimumCost();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator14 = solrQueryIndex11.getNodeAggregator();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "solr" + "'", str12.equals("solr"));
        org.junit.Assert.assertTrue(d13 == 2.3d);
        org.junit.Assert.assertNull(nodeAggregator14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider3 = embeddedSolrServerConfiguration2.getProvider();
        java.lang.String str4 = embeddedSolrServerConfiguration2.getCoreName();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy5 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient6 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration2, strategy5);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration7 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str8 = defaultSolrConfiguration7.getPathField();
        java.lang.String str9 = defaultSolrConfiguration7.getPathDepthField();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy commitPolicy10 = defaultSolrConfiguration7.getCommitPolicy();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse11 = solrClient6.addBean((java.lang.Object) commitPolicy10);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.beans.BindingException");
        } catch (org.apache.solr.client.solrj.beans.BindingException e) {
        }
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "path_des" + "'", str4.equals("path_des"));
        org.junit.Assert.assertTrue("'" + strategy5 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy5.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNotNull(solrClient6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "path_exact" + "'", str8.equals("path_exact"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "path_depth" + "'", str9.equals("path_depth"));
        org.junit.Assert.assertTrue("'" + commitPolicy10 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy.SOFT + "'", commitPolicy10.equals(org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy.SOFT));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getSearchingSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse10 = solrClient5.optimize("path_collapsed", false, true, 10);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.nodestate.NodeStateSolrServerProvider nodeStateSolrServerProvider1 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.nodestate.NodeStateSolrServerProvider(nodeState0);
        nodeStateSolrServerProvider1.close();
        nodeStateSolrServerProvider1.close();
        nodeStateSolrServerProvider1.close();
        try {
            java.lang.String str5 = nodeStateSolrServerProvider1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder6 = solrClient5.getBinder();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse9 = solrClient5.deleteByQuery("oak", "");
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
        org.junit.Assert.assertNotNull(documentObjectBinder6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider3 = embeddedSolrServerConfiguration2.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider(embeddedSolrServerConfiguration2);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration7 = embeddedSolrServerConfiguration2.withHttpConfiguration("primaryTypes", (java.lang.Integer) 10);
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider8 = embeddedSolrServerConfiguration2.getProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = embeddedSolrServerProvider8.getIndexingSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse12 = solrClient9.deleteById("8983", "hi!_string_sort_string_sort");
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider3);
        org.junit.Assert.assertNotNull(embeddedSolrServerConfiguration7);
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider8);
        org.junit.Assert.assertNotNull(solrClient9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getIndexingSolrServer();
        solrClient5.close();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration7 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str8 = defaultSolrConfiguration7.getCatchAllField();
        java.util.Collection<java.lang.String> collection_str9 = defaultSolrConfiguration7.getUsedProperties();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse10 = solrClient5.addBean((java.lang.Object) defaultSolrConfiguration7);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.beans.BindingException");
        } catch (org.apache.solr.client.solrj.beans.BindingException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "catch_all" + "'", str8.equals("catch_all"));
        org.junit.Assert.assertNotNull(collection_str9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrIndexEditorProviderService solrIndexEditorProviderService0 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrIndexEditorProviderService();
        org.apache.jackrabbit.oak.spi.state.NodeBuilder nodeBuilder2 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState3 = null;
        org.apache.jackrabbit.oak.plugins.index.IndexUpdateCallback indexUpdateCallback4 = null;
        org.apache.jackrabbit.oak.spi.commit.Editor editor5 = solrIndexEditorProviderService0.getIndexEditor("hi!", nodeBuilder2, nodeState3, indexUpdateCallback4);
        org.junit.Assert.assertNull(editor5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration0 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str1 = defaultSolrConfiguration0.getPathField();
        int i2 = defaultSolrConfiguration0.getRows();
        org.apache.jackrabbit.oak.spi.query.Filter.PathRestriction pathRestriction3 = null;
        try {
            java.lang.String str4 = defaultSolrConfiguration0.getFieldForPathRestriction(pathRestriction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "path_exact" + "'", str1.equals("path_exact"));
        org.junit.Assert.assertTrue(i2 == 10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        java.lang.reflect.Type type3 = embeddedSolrServerConfiguration2.getType();
        java.lang.String[] str_array12 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array12);
        java.lang.reflect.Type type14 = remoteSolrServerConfiguration13.getType();
        java.lang.String str15 = remoteSolrServerConfiguration13.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration13);
        java.lang.String[] str_array25 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration26 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array25);
        java.lang.reflect.Type type27 = remoteSolrServerConfiguration26.getType();
        java.lang.String str28 = remoteSolrServerConfiguration26.getSolrConfDir();
        java.lang.String str29 = remoteSolrServerConfiguration26.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider30 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient31 = defaultSolrServerProvider30.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy32 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration26, solrClient31, strategy32);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration13, strategy32);
        org.apache.solr.client.solrj.SolrClient solrClient35 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration2, strategy32);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration37 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str38 = defaultSolrConfiguration37.getCatchAllField();
        java.util.Collection<java.lang.String> collection_str39 = defaultSolrConfiguration37.getUsedProperties();
        org.apache.solr.common.params.SolrParams solrParams40 = null;
        try {
            org.apache.solr.common.SolrDocumentList solrDocumentList41 = solrClient35.getById("catch_all", collection_str39, solrParams40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(str_array12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertNotNull(solrClient31);
        org.junit.Assert.assertTrue("'" + strategy32 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy32.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNotNull(solrClient35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "catch_all" + "'", str38.equals("catch_all"));
        org.junit.Assert.assertNotNull(collection_str39);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        solrClient4.close();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse8 = solrClient4.deleteById("http://127.0.0.1:8983/solr/oak", "httpUrl");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        org.apache.jackrabbit.oak.plugins.index.solr.util.SolrIndexInitializer solrIndexInitializer1 = new org.apache.jackrabbit.oak.plugins.index.solr.util.SolrIndexInitializer("usedProperties");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        java.lang.String[] str_array25 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration26 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array25);
        java.lang.reflect.Type type27 = remoteSolrServerConfiguration26.getType();
        int i28 = remoteSolrServerConfiguration26.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider29 = remoteSolrServerConfiguration26.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration30 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str31 = defaultSolrConfiguration30.getPathField();
        boolean b32 = defaultSolrConfiguration30.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider33 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration30);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider34 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider29, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider33);
        java.lang.String[] str_array43 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration44 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array43);
        java.lang.reflect.Type type45 = remoteSolrServerConfiguration44.getType();
        int i46 = remoteSolrServerConfiguration44.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider47 = remoteSolrServerConfiguration44.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration48 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str49 = defaultSolrConfiguration48.getPathField();
        boolean b50 = defaultSolrConfiguration48.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider51 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration48);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider52 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider47, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider53 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider29, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider54 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.solr.client.solrj.SolrClient solrClient55 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient56 = defaultSolrServerProvider0.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration60 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider61 = embeddedSolrServerConfiguration60.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider62 = new org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider(embeddedSolrServerConfiguration60);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration65 = embeddedSolrServerConfiguration60.withHttpConfiguration("primaryTypes", (java.lang.Integer) 10);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse67 = solrClient56.addBean("pathRestrictions", (java.lang.Object) "primaryTypes", 32);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.beans.BindingException");
        } catch (org.apache.solr.client.solrj.beans.BindingException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "path_exact" + "'", str31.equals("path_exact"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "path_exact" + "'", str49.equals("path_exact"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(solrClient55);
        org.junit.Assert.assertNotNull(solrClient56);
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider61);
        org.junit.Assert.assertNotNull(embeddedSolrServerConfiguration65);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        java.lang.String[] str_array15 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration16 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array15);
        java.lang.reflect.Type type17 = remoteSolrServerConfiguration16.getType();
        java.lang.String str18 = remoteSolrServerConfiguration16.getSolrConfDir();
        java.lang.String str19 = remoteSolrServerConfiguration16.getSolrZkHost();
        java.lang.String[] str_array20 = remoteSolrServerConfiguration16.getSolrHttpUrls();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration21 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("propertyMappings", "descendantsField", 32, (int) (byte) 100, "", (int) ' ', (int) '#', str_array20);
        java.lang.String str22 = remoteSolrServerConfiguration21.getSolrConfDir();
        java.lang.String str23 = remoteSolrServerConfiguration21.toString();
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "RemoteSolrServerConfiguration{solrConfDir='', socketTimeout=32, connectionTimeout=35, solrHttpUrls=[solrHomePath], solrZkHost='propertyMappings', solrCollection='descendantsField', solrShardsNo=32, solrReplicationFactor=100}" + "'", str23.equals("RemoteSolrServerConfiguration{solrConfDir='', socketTimeout=32, connectionTimeout=35, solrHttpUrls=[solrHomePath], solrZkHost='propertyMappings', solrCollection='descendantsField', solrShardsNo=32, solrReplicationFactor=100}"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.reflect.Type type10 = remoteSolrServerConfiguration9.getType();
        int i11 = remoteSolrServerConfiguration9.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = remoteSolrServerConfiguration9.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration9);
        java.lang.String[] str_array22 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration23 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array22);
        java.lang.String str24 = remoteSolrServerConfiguration23.getSolrZkHost();
        java.lang.String[] str_array25 = remoteSolrServerConfiguration23.getSolrHttpUrls();
        java.lang.String str26 = remoteSolrServerConfiguration23.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy27 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient28 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration23, strategy27);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration9, strategy27);
        java.lang.reflect.Type type30 = remoteSolrServerConfiguration9.getType();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator31 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider32 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider33 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex34 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator31, oakSolrConfigurationProvider32, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider33);
        org.apache.solr.client.solrj.SolrClient solrClient35 = defaultSolrServerProvider33.getSolrServer();
        java.lang.String[] str_array44 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration45 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array44);
        java.lang.reflect.Type type46 = remoteSolrServerConfiguration45.getType();
        int i47 = remoteSolrServerConfiguration45.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider48 = remoteSolrServerConfiguration45.getProvider();
        java.lang.reflect.Type type49 = remoteSolrServerConfiguration45.getType();
        java.lang.String[] str_array58 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration59 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array58);
        java.lang.reflect.Type type60 = remoteSolrServerConfiguration59.getType();
        java.lang.String str61 = remoteSolrServerConfiguration59.getSolrConfDir();
        java.lang.String str62 = remoteSolrServerConfiguration59.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider63 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient64 = defaultSolrServerProvider63.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy65 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration59, solrClient64, strategy65);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration45, strategy65);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration9, solrClient35, strategy65);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse72 = solrClient35.deleteByQuery("oak", "/solr", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider12);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + strategy27 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy27.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNull(solrClient28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(solrClient35);
        org.junit.Assert.assertNotNull(str_array44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue(i47 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(str_array58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        org.junit.Assert.assertNotNull(solrClient64);
        org.junit.Assert.assertTrue("'" + strategy65 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy65.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder5 = solrClient4.getBinder();
        org.apache.solr.common.SolrInputDocument[] solrInputDocument_array7 = new org.apache.solr.common.SolrInputDocument[] {};
        java.util.ArrayList<org.apache.solr.common.SolrInputDocument> arraylist_solrInputDocument8 = new java.util.ArrayList<org.apache.solr.common.SolrInputDocument>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.solr.common.SolrInputDocument>) arraylist_solrInputDocument8, solrInputDocument_array7);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse11 = solrClient4.add("/solr", (java.util.Collection<org.apache.solr.common.SolrInputDocument>) arraylist_solrInputDocument8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(documentObjectBinder5);
        org.junit.Assert.assertNotNull(solrInputDocument_array7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.solr.client.solrj.SolrClient solrClient17 = defaultSolrServerProvider0.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient18 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.common.params.SolrParams solrParams21 = null;
        try {
            org.apache.solr.common.SolrDocument solrDocument22 = solrClient18.getById("pathField", "path_collapsed", solrParams21);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(solrClient17);
        org.junit.Assert.assertNotNull(solrClient18);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration0 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str1 = defaultSolrConfiguration0.getPathField();
        boolean b2 = defaultSolrConfiguration0.collapseJcrContentNodes();
        boolean b3 = defaultSolrConfiguration0.useForPrimaryTypes();
        boolean b4 = defaultSolrConfiguration0.collapseJcrContentNodes();
        java.util.Collection<java.lang.String> collection_str5 = defaultSolrConfiguration0.getUsedProperties();
        java.util.Collection<java.lang.String> collection_str6 = defaultSolrConfiguration0.getIgnoredProperties();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "path_exact" + "'", str1.equals("path_exact"));
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection_str5);
        org.junit.Assert.assertNotNull(collection_str6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration0 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str1 = defaultSolrConfiguration0.getCollapsedPathField();
        java.lang.String str2 = defaultSolrConfiguration0.getCollapsedPathField();
        boolean b3 = defaultSolrConfiguration0.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration0);
        org.apache.jackrabbit.oak.spi.query.Filter.PathRestriction pathRestriction5 = null;
        try {
            java.lang.String str6 = defaultSolrConfiguration0.getFieldForPathRestriction(pathRestriction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "path_collapsed" + "'", str1.equals("path_collapsed"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "path_collapsed" + "'", str2.equals("path_collapsed"));
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider remoteSolrServerConfigurationProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration<org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider> solrserverconfiguration_remoteSolrServerProvider1 = remoteSolrServerConfigurationProvider0.getSolrServerConfiguration();
        try {
            org.apache.jackrabbit.oak.plugins.index.solr.server.OakSolrServer oakSolrServer2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.OakSolrServer((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfigurationProvider) remoteSolrServerConfigurationProvider0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(solrserverconfiguration_remoteSolrServerProvider1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        java.lang.String[] str_array25 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration26 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array25);
        java.lang.reflect.Type type27 = remoteSolrServerConfiguration26.getType();
        int i28 = remoteSolrServerConfiguration26.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider29 = remoteSolrServerConfiguration26.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration30 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str31 = defaultSolrConfiguration30.getPathField();
        boolean b32 = defaultSolrConfiguration30.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider33 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration30);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider34 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider29, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider33);
        java.lang.String[] str_array43 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration44 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array43);
        java.lang.reflect.Type type45 = remoteSolrServerConfiguration44.getType();
        int i46 = remoteSolrServerConfiguration44.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider47 = remoteSolrServerConfiguration44.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration48 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str49 = defaultSolrConfiguration48.getPathField();
        boolean b50 = defaultSolrConfiguration48.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider51 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration48);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider52 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider47, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider53 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider29, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider54 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.solr.client.solrj.SolrClient solrClient55 = defaultSolrServerProvider0.getSearchingSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse59 = solrClient55.commit("catchAllField", false, true);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "path_exact" + "'", str31.equals("path_exact"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "path_exact" + "'", str49.equals("path_exact"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(solrClient55);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        java.lang.String[] str_array25 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration26 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array25);
        java.lang.reflect.Type type27 = remoteSolrServerConfiguration26.getType();
        int i28 = remoteSolrServerConfiguration26.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider29 = remoteSolrServerConfiguration26.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration30 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str31 = defaultSolrConfiguration30.getPathField();
        boolean b32 = defaultSolrConfiguration30.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider33 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration30);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider34 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider29, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider33);
        java.lang.String[] str_array43 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration44 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array43);
        java.lang.reflect.Type type45 = remoteSolrServerConfiguration44.getType();
        int i46 = remoteSolrServerConfiguration44.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider47 = remoteSolrServerConfiguration44.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration48 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str49 = defaultSolrConfiguration48.getPathField();
        boolean b50 = defaultSolrConfiguration48.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider51 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration48);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider52 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider47, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider53 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider29, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider54 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration55 = defaultSolrConfigurationProvider51.getConfiguration();
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "path_exact" + "'", str31.equals("path_exact"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "path_exact" + "'", str49.equals("path_exact"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(oakSolrConfiguration55);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        int i10 = remoteSolrServerConfiguration9.getSolrShardsNo();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider11 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration9);
        try {
            org.apache.solr.client.solrj.SolrClient solrClient12 = remoteSolrServerProvider11.getSearchingSolrServer();
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration1);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider3 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider2, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration5 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration5);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider7 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6, oakSolrConfigurationProvider7);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider9 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider10 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6, oakSolrConfigurationProvider9);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex11 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider3, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6);
        org.apache.jackrabbit.oak.spi.query.Filter filter12 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState13 = null;
        try {
            java.lang.String str14 = solrQueryIndex11.getPlan(filter12, nodeState13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider3 = embeddedSolrServerConfiguration2.getProvider();
        java.lang.String str4 = embeddedSolrServerConfiguration2.getCoreName();
        java.lang.String str5 = embeddedSolrServerConfiguration2.getCoreName();
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider6 = embeddedSolrServerConfiguration2.getProvider();
        try {
            org.apache.solr.client.solrj.SolrClient solrClient7 = embeddedSolrServerProvider6.getSearchingSolrServer();
            org.junit.Assert.fail("Expected exception of type org.apache.solr.common.SolrException");
        } catch (org.apache.solr.common.SolrException e) {
        }
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "path_des" + "'", str4.equals("path_des"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "path_des" + "'", str5.equals("path_des"));
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.String str10 = remoteSolrServerConfiguration9.getSolrZkHost();
        java.lang.String[] str_array11 = remoteSolrServerConfiguration9.getSolrHttpUrls();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = remoteSolrServerConfiguration9.getProvider();
        java.lang.String str13 = remoteSolrServerConfiguration9.getSolrConfDir();
        int i14 = remoteSolrServerConfiguration9.getSolrReplicationFactor();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator15 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider16 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider17 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex18 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator15, oakSolrConfigurationProvider16, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider17);
        org.apache.solr.client.solrj.SolrClient solrClient19 = defaultSolrServerProvider17.getIndexingSolrServer();
        java.lang.String[] str_array35 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration36 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array35);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration37 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("catchAllField", "commitPolicy", (int) (byte) 1, (int) (short) 100, "pathField", (int) ' ', 10, str_array35);
        java.lang.String[] str_array38 = remoteSolrServerConfiguration37.getSolrHttpUrls();
        java.lang.reflect.Type type39 = remoteSolrServerConfiguration37.getType();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy40 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient41 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration37, strategy40);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration9, solrClient19, strategy40);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse44 = solrClient19.commit("solrServerType");
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertNotNull(remoteSolrServerProvider12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue(i14 == 100);
        org.junit.Assert.assertNotNull(solrClient19);
        org.junit.Assert.assertNotNull(str_array35);
        org.junit.Assert.assertNotNull(str_array38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + strategy40 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy40.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNull(solrClient41);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        java.lang.String str2 = org.apache.jackrabbit.oak.plugins.index.solr.util.SolrUtils.getSortingField((int) (byte) -1, "http://127.0.0.1");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://127.0.0.1_string_sort" + "'", str2.equals("http://127.0.0.1_string_sort"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.solr.client.solrj.SolrClient solrClient8 = defaultSolrServerProvider0.getSearchingSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse11 = solrClient8.commit(false, false);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        java.lang.reflect.Type type3 = embeddedSolrServerConfiguration2.getType();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator4 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider5 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex7 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator4, oakSolrConfigurationProvider5, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider6);
        org.apache.solr.client.solrj.SolrClient solrClient8 = defaultSolrServerProvider6.getSolrServer();
        java.lang.String[] str_array17 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration18 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array17);
        java.lang.reflect.Type type19 = remoteSolrServerConfiguration18.getType();
        java.lang.String str20 = remoteSolrServerConfiguration18.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider21 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration18);
        java.lang.String[] str_array30 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration31 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array30);
        java.lang.reflect.Type type32 = remoteSolrServerConfiguration31.getType();
        java.lang.String str33 = remoteSolrServerConfiguration31.getSolrConfDir();
        java.lang.String str34 = remoteSolrServerConfiguration31.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider35 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient36 = defaultSolrServerProvider35.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy37 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration31, solrClient36, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration18, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration2, solrClient8, strategy37);
        java.lang.String str41 = embeddedSolrServerConfiguration2.toString();
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider42 = embeddedSolrServerConfiguration2.getProvider();
        try {
            org.apache.solr.client.solrj.SolrClient solrClient43 = embeddedSolrServerProvider42.getIndexingSolrServer();
            org.junit.Assert.fail("Expected exception of type org.apache.solr.common.SolrException");
        } catch (org.apache.solr.common.SolrException e) {
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(solrClient8);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertNotNull(solrClient36);
        org.junit.Assert.assertTrue("'" + strategy37 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy37.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "EmbeddedSolrServerConfiguration{solrHomePath='descendantsField', coreName='path_des', httpConfiguration=null}" + "'", str41.equals("EmbeddedSolrServerConfiguration{solrHomePath='descendantsField', coreName='path_des', httpConfiguration=null}"));
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider42);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration2 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider3 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration2);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider3, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider4);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration6 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration6);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider8 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider9 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider7, oakSolrConfigurationProvider8);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex10 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator1, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider7);
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration12 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration12);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider13, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider14);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration16 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider17 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration16);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider18 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider19 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider17, oakSolrConfigurationProvider18);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider20 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider21 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider17, oakSolrConfigurationProvider20);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex22 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator11, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider14, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider17);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex23 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider17);
        java.lang.String str24 = solrQueryIndex23.getIndexName();
        java.lang.String str25 = solrQueryIndex23.getIndexName();
        org.apache.jackrabbit.oak.spi.query.Filter filter26 = null;
        org.apache.jackrabbit.oak.spi.query.QueryIndex.OrderEntry[] orderEntry_array27 = new org.apache.jackrabbit.oak.spi.query.QueryIndex.OrderEntry[] {};
        java.util.ArrayList<org.apache.jackrabbit.oak.spi.query.QueryIndex.OrderEntry> arraylist_orderEntry28 = new java.util.ArrayList<org.apache.jackrabbit.oak.spi.query.QueryIndex.OrderEntry>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.oak.spi.query.QueryIndex.OrderEntry>) arraylist_orderEntry28, orderEntry_array27);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState30 = null;
        try {
            java.util.List<org.apache.jackrabbit.oak.spi.query.QueryIndex.IndexPlan> list_indexPlan31 = solrQueryIndex23.getPlans(filter26, (java.util.List<org.apache.jackrabbit.oak.spi.query.QueryIndex.OrderEntry>) arraylist_orderEntry28, nodeState30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "solr" + "'", str24.equals("solr"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "solr" + "'", str25.equals("solr"));
        org.junit.Assert.assertNotNull(orderEntry_array27);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        java.lang.String[] str_array34 = new java.lang.String[] { "rows_string_sort", "collection", "EmbeddedSolrServerConfiguration{solrHomePath='path_anc', coreName='ignoredProperties', httpConfiguration=null}", "http://127.0.0.1_string_sort", "pathRestrictions", "typeMappings", "hi!", "catchAllField", "RemoteSolrServerConfiguration{solrConfDir='path_anc', socketTimeout=1, connectionTimeout=0, solrHttpUrls=[solrHomePath], solrZkHost='hi!_string_sort', solrCollection='path_exact', solrShardsNo=100, solrReplicationFactor=10}", "HttpConfiguration{context='primaryTypes', httpPort=10}", "collection", "catchAllField", "depthField", "usedProperties", "rows_string_sort", "propertyMappings_string_sort", "solrHomePath", "socketTimeout", "childrenField", "/solr_string_sort_string_sort", "EmbeddedSolrServerConfiguration{solrHomePath='descendantsField', coreName='path_des', httpConfiguration=null}", "RemoteSolrServerConfiguration{solrConfDir='pathField', socketTimeout=32, connectionTimeout=10, solrHttpUrls=[solrHomePath], solrZkHost='catchAllField', solrCollection='commitPolicy', solrShardsNo=1, solrReplicationFactor=100}", "shardsNo", "propertyRestrictions_string_sort", "propertyMappings_string_sort", "socketTimeout", "collapseJcrContentNodes", "collection", "path_collapsed", "descendantsField", "RemoteSolrServerConfiguration{solrConfDir='path_anc', socketTimeout=1, connectionTimeout=0, solrHttpUrls=[solrHomePath], solrZkHost='hi!_string_sort', solrCollection='path_exact', solrShardsNo=100, solrReplicationFactor=10}" };
        java.util.ArrayList<java.lang.String> arraylist_str35 = new java.util.ArrayList<java.lang.String>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str35, str_array34);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse38 = solrClient1.deleteById("collection", (java.util.List<java.lang.String>) arraylist_str35, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(str_array34);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        defaultSolrServerProvider0.close();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder10 = solrClient9.getBinder();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder11 = solrClient9.getBinder();
        java.lang.String[] str_array49 = new java.lang.String[] { "/solr_string_sort_string_sort", "replicationFactor", "", "collection", "EmbeddedSolrServerConfiguration{solrHomePath='propertyMappings', coreName='ignoredProperties', httpConfiguration=null}", "8983", "http://127.0.0.1:8983/solr/oak", "8983", "httpPort", "descendantsField", "zkHost", "pathField", "EmbeddedSolrServerConfiguration{solrHomePath='descendantsField', coreName='path_des', httpConfiguration=null}", "propertyRestrictions_string_sort", "RemoteSolrServerConfiguration{solrConfDir='hi!', socketTimeout=1, connectionTimeout=-1, solrHttpUrls=[solrHomePath], solrZkHost='', solrCollection='hi!', solrShardsNo=1, solrReplicationFactor=100}", "httpPort", "propertyRestrictions_string_sort", "solrContext", "path_collapsed", "propertyMappings_string_sort", "collection", "solrServerType", "primaryTypes", "127.0.0.1:9983", "path_depth", "path_des", "primaryTypes", "solrHomePath", "oak", "propertyMappings", "typeMappings", "httpUrl", "typeMappings", "path_child", "collection", "EmbeddedSolrServerConfiguration{solrHomePath='hi!', coreName='parentField', httpConfiguration=null}" };
        java.util.ArrayList<java.lang.String> arraylist_str50 = new java.util.ArrayList<java.lang.String>();
        boolean b51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str50, str_array49);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse52 = solrClient9.deleteById("hi!_string_sort_string_sort", (java.util.List<java.lang.String>) arraylist_str50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(documentObjectBinder10);
        org.junit.Assert.assertNotNull(documentObjectBinder11);
        org.junit.Assert.assertNotNull(str_array49);
        org.junit.Assert.assertTrue(b51 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        java.lang.String[] str_array15 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration16 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array15);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration17 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("catchAllField", "commitPolicy", (int) (byte) 1, (int) (short) 100, "pathField", (int) ' ', 10, str_array15);
        java.lang.String[] str_array18 = remoteSolrServerConfiguration17.getSolrHttpUrls();
        java.lang.reflect.Type type19 = remoteSolrServerConfiguration17.getType();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy20 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient21 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration17, strategy20);
        java.lang.String[] str_array30 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration31 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array30);
        java.lang.String str32 = remoteSolrServerConfiguration31.getSolrZkHost();
        java.lang.String[] str_array33 = remoteSolrServerConfiguration31.getSolrHttpUrls();
        java.lang.String str34 = remoteSolrServerConfiguration31.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy35 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient36 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration31, strategy35);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration17, strategy35);
        java.lang.String[] str_array38 = remoteSolrServerConfiguration17.getSolrHttpUrls();
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + strategy20 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy20.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNull(solrClient21);
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertNotNull(str_array33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue("'" + strategy35 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy35.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNull(solrClient36);
        org.junit.Assert.assertNotNull(str_array38);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        java.lang.reflect.Type type3 = embeddedSolrServerConfiguration2.getType();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator4 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider5 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex7 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator4, oakSolrConfigurationProvider5, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider6);
        org.apache.solr.client.solrj.SolrClient solrClient8 = defaultSolrServerProvider6.getSolrServer();
        java.lang.String[] str_array17 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration18 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array17);
        java.lang.reflect.Type type19 = remoteSolrServerConfiguration18.getType();
        java.lang.String str20 = remoteSolrServerConfiguration18.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider21 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration18);
        java.lang.String[] str_array30 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration31 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array30);
        java.lang.reflect.Type type32 = remoteSolrServerConfiguration31.getType();
        java.lang.String str33 = remoteSolrServerConfiguration31.getSolrConfDir();
        java.lang.String str34 = remoteSolrServerConfiguration31.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider35 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient36 = defaultSolrServerProvider35.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy37 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration31, solrClient36, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration18, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration2, solrClient8, strategy37);
        org.apache.solr.common.SolrInputDocument[] solrInputDocument_array41 = new org.apache.solr.common.SolrInputDocument[] {};
        java.util.ArrayList<org.apache.solr.common.SolrInputDocument> arraylist_solrInputDocument42 = new java.util.ArrayList<org.apache.solr.common.SolrInputDocument>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<org.apache.solr.common.SolrInputDocument>) arraylist_solrInputDocument42, solrInputDocument_array41);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse44 = solrClient8.add((java.util.Collection<org.apache.solr.common.SolrInputDocument>) arraylist_solrInputDocument42);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(solrClient8);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertNotNull(solrClient36);
        org.junit.Assert.assertTrue("'" + strategy37 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy37.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNotNull(solrInputDocument_array41);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.solr.client.solrj.SolrClient solrClient17 = defaultSolrServerProvider0.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient18 = defaultSolrServerProvider0.getSearchingSolrServer();
        java.lang.String[] str_array57 = new java.lang.String[] { "http://127.0.0.1", "primaryTypes", "pathRestrictions", "RemoteSolrServerConfiguration{solrConfDir='path_anc', socketTimeout=1, connectionTimeout=0, solrHttpUrls=[solrHomePath], solrZkHost='hi!_string_sort', solrCollection='path_exact', solrShardsNo=100, solrReplicationFactor=10}", "collapseJcrContentNodes", "RemoteSolrServerConfiguration{solrConfDir='pathField', socketTimeout=32, connectionTimeout=10, solrHttpUrls=[solrHomePath], solrZkHost='catchAllField', solrCollection='commitPolicy', solrShardsNo=1, solrReplicationFactor=100}", "commitPolicy", "HttpConfiguration{context='primaryTypes', httpPort=10}", "coreName", "EmbeddedSolrServerConfiguration{solrHomePath='hi!', coreName='parentField', httpConfiguration=null}", "hi!_string_sort_string_sort", "collection", "propertyMappings", "propertyRestrictions", "http://127.0.0.1:8983/solr/oak", "pathRestrictions", "EmbeddedSolrServerConfiguration{solrHomePath='path_anc', coreName='ignoredProperties', httpConfiguration=null}", "httpPort", "primaryTypes", "depthField", "descendantsField", "HttpConfiguration{context='primaryTypes', httpPort=10}", "EmbeddedSolrServerConfiguration{solrHomePath='propertyMappings', coreName='ignoredProperties', httpConfiguration=null}", "path_exact", "path_depth", "path_collapsed", "RemoteSolrServerConfiguration{solrConfDir='pathField', socketTimeout=32, connectionTimeout=10, solrHttpUrls=[solrHomePath], solrZkHost='catchAllField', solrCollection='commitPolicy', solrShardsNo=1, solrReplicationFactor=100}", "EmbeddedSolrServerConfiguration{solrHomePath='hi!', coreName='parentField', httpConfiguration=null}", "oak", "path_exact", "RemoteSolrServerConfiguration{solrConfDir='', socketTimeout=32, connectionTimeout=35, solrHttpUrls=[solrHomePath], solrZkHost='propertyMappings', solrCollection='descendantsField', solrShardsNo=32, solrReplicationFactor=100}", "pathRestrictions", "collapseJcrContentNodes", "hi!_string_sort_string_sort", "http://127.0.0.1_string_sort", "socketTimeout", "httpPort" };
        java.util.ArrayList<java.lang.String> arraylist_str58 = new java.util.ArrayList<java.lang.String>();
        boolean b59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str58, str_array57);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse60 = solrClient18.deleteById("solrServerType", (java.util.List<java.lang.String>) arraylist_str58);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(solrClient17);
        org.junit.Assert.assertNotNull(solrClient18);
        org.junit.Assert.assertNotNull(str_array57);
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrIndexEditorProviderService solrIndexEditorProviderService0 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrIndexEditorProviderService();
        org.apache.jackrabbit.oak.spi.state.NodeBuilder nodeBuilder2 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState3 = null;
        org.apache.jackrabbit.oak.plugins.index.IndexUpdateCallback indexUpdateCallback4 = null;
        org.apache.jackrabbit.oak.spi.commit.Editor editor5 = solrIndexEditorProviderService0.getIndexEditor("pathField", nodeBuilder2, nodeState3, indexUpdateCallback4);
        org.apache.jackrabbit.oak.spi.state.NodeBuilder nodeBuilder7 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState8 = null;
        org.apache.jackrabbit.oak.plugins.index.IndexUpdateCallback indexUpdateCallback9 = null;
        org.apache.jackrabbit.oak.spi.commit.Editor editor10 = solrIndexEditorProviderService0.getIndexEditor("coreName", nodeBuilder7, nodeState8, indexUpdateCallback9);
        org.junit.Assert.assertNull(editor5);
        org.junit.Assert.assertNull(editor10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        java.lang.reflect.Type type3 = embeddedSolrServerConfiguration2.getType();
        java.lang.String[] str_array12 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array12);
        java.lang.reflect.Type type14 = remoteSolrServerConfiguration13.getType();
        java.lang.String str15 = remoteSolrServerConfiguration13.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration13);
        java.lang.String[] str_array25 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration26 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array25);
        java.lang.reflect.Type type27 = remoteSolrServerConfiguration26.getType();
        java.lang.String str28 = remoteSolrServerConfiguration26.getSolrConfDir();
        java.lang.String str29 = remoteSolrServerConfiguration26.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider30 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient31 = defaultSolrServerProvider30.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy32 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration26, solrClient31, strategy32);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration13, strategy32);
        org.apache.solr.client.solrj.SolrClient solrClient35 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration2, strategy32);
        java.lang.String[] str_array44 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration45 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array44);
        java.lang.reflect.Type type46 = remoteSolrServerConfiguration45.getType();
        int i47 = remoteSolrServerConfiguration45.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider48 = remoteSolrServerConfiguration45.getProvider();
        java.lang.String str49 = remoteSolrServerConfiguration45.getSolrZkHost();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse51 = solrClient35.addBean((java.lang.Object) str49, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.beans.BindingException");
        } catch (org.apache.solr.client.solrj.beans.BindingException e) {
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(str_array12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertNotNull(solrClient31);
        org.junit.Assert.assertTrue("'" + strategy32 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy32.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNotNull(solrClient35);
        org.junit.Assert.assertNotNull(str_array44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue(i47 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration0 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str1 = defaultSolrConfiguration0.getPathField();
        boolean b2 = defaultSolrConfiguration0.collapseJcrContentNodes();
        boolean b3 = defaultSolrConfiguration0.useForPrimaryTypes();
        boolean b4 = defaultSolrConfiguration0.collapseJcrContentNodes();
        java.util.Collection<java.lang.String> collection_str5 = defaultSolrConfiguration0.getUsedProperties();
        org.apache.jackrabbit.oak.spi.query.Filter.PropertyRestriction propertyRestriction6 = null;
        java.lang.String str7 = defaultSolrConfiguration0.getFieldForPropertyRestriction(propertyRestriction6);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration0);
        int i9 = defaultSolrConfiguration0.getRows();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "path_exact" + "'", str1.equals("path_exact"));
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection_str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        java.lang.String[] str_array9 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration10 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array9);
        java.lang.reflect.Type type11 = remoteSolrServerConfiguration10.getType();
        java.lang.String str12 = remoteSolrServerConfiguration10.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration10);
        java.lang.String[] str_array22 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration23 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array22);
        java.lang.reflect.Type type24 = remoteSolrServerConfiguration23.getType();
        java.lang.String str25 = remoteSolrServerConfiguration23.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider26 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration23);
        java.lang.String[] str_array35 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration36 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array35);
        java.lang.reflect.Type type37 = remoteSolrServerConfiguration36.getType();
        int i38 = remoteSolrServerConfiguration36.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider39 = remoteSolrServerConfiguration36.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration40 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str41 = defaultSolrConfiguration40.getPathField();
        boolean b42 = defaultSolrConfiguration40.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider43 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration40);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider44 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider39, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider43);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider45 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient46 = defaultSolrServerProvider45.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient47 = defaultSolrServerProvider45.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration48 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider49 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration48);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider50 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider51 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider49, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider50);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider52 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider45, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider50);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider53 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient54 = defaultSolrServerProvider53.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient55 = defaultSolrServerProvider53.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration56 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider57 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration56);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider58 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider59 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider57, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider58);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider60 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider53, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider58);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider61 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider45, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider58);
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator62 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider63 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider39, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider58, nodeAggregator62);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider64 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider26, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider58);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider65 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider13, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider58);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider66 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient67 = defaultSolrServerProvider66.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient68 = defaultSolrServerProvider66.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration69 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider70 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration69);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider71 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider72 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider70, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider71);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider73 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider66, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider71);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider74 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient75 = defaultSolrServerProvider74.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient76 = defaultSolrServerProvider74.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration77 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider78 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration77);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider79 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider80 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider78, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider79);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider81 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider74, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider79);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider82 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider66, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider79);
        org.apache.solr.client.solrj.SolrClient solrClient83 = defaultSolrServerProvider66.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient84 = defaultSolrServerProvider66.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex85 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider58, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider66);
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider39);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "path_exact" + "'", str41.equals("path_exact"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(solrClient46);
        org.junit.Assert.assertNotNull(solrClient47);
        org.junit.Assert.assertNotNull(solrClient54);
        org.junit.Assert.assertNotNull(solrClient55);
        org.junit.Assert.assertNotNull(solrClient67);
        org.junit.Assert.assertNotNull(solrClient68);
        org.junit.Assert.assertNotNull(solrClient75);
        org.junit.Assert.assertNotNull(solrClient76);
        org.junit.Assert.assertNotNull(solrClient83);
        org.junit.Assert.assertNotNull(solrClient84);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        java.lang.String[] str_array9 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration10 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array9);
        java.lang.reflect.Type type11 = remoteSolrServerConfiguration10.getType();
        java.lang.String str12 = remoteSolrServerConfiguration10.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration10);
        java.lang.String[] str_array22 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration23 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array22);
        java.lang.reflect.Type type24 = remoteSolrServerConfiguration23.getType();
        int i25 = remoteSolrServerConfiguration23.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider26 = remoteSolrServerConfiguration23.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration27 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str28 = defaultSolrConfiguration27.getPathField();
        boolean b29 = defaultSolrConfiguration27.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider30 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration27);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider31 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider26, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider30);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider32 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient33 = defaultSolrServerProvider32.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient34 = defaultSolrServerProvider32.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration35 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider36 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration35);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider37 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider38 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider36, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider37);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider39 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider32, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider37);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider40 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient41 = defaultSolrServerProvider40.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient42 = defaultSolrServerProvider40.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration43 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider44 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration43);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider45 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider46 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider44, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider45);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider47 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider40, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider45);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider48 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider32, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider45);
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator49 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider50 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider26, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider45, nodeAggregator49);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider51 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider13, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider45);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration52 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider53 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration52);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider54 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider55 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider53, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider54);
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService oakSolrConfigurationProviderService56 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider57 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider53, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService56);
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator58 = null;
        java.lang.String[] str_array67 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration68 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array67);
        java.lang.reflect.Type type69 = remoteSolrServerConfiguration68.getType();
        int i70 = remoteSolrServerConfiguration68.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider71 = remoteSolrServerConfiguration68.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider72 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration68);
        remoteSolrServerProvider72.close();
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService oakSolrConfigurationProviderService74 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration75 = oakSolrConfigurationProviderService74.getConfiguration();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator76 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider77 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider72, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService74, nodeAggregator76);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration78 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider79 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration78);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider80 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider81 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider79, oakSolrConfigurationProvider80);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex82 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator58, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService74, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider79);
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator83 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider84 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider53, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService74, nodeAggregator83);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex85 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider45, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider53);
        java.lang.String str86 = solrQueryIndex85.getIndexName();
        org.apache.jackrabbit.oak.spi.query.Filter filter87 = null;
        org.apache.jackrabbit.oak.spi.query.QueryIndex.OrderEntry[] orderEntry_array88 = new org.apache.jackrabbit.oak.spi.query.QueryIndex.OrderEntry[] {};
        java.util.ArrayList<org.apache.jackrabbit.oak.spi.query.QueryIndex.OrderEntry> arraylist_orderEntry89 = new java.util.ArrayList<org.apache.jackrabbit.oak.spi.query.QueryIndex.OrderEntry>();
        boolean b90 = java.util.Collections.addAll((java.util.Collection<org.apache.jackrabbit.oak.spi.query.QueryIndex.OrderEntry>) arraylist_orderEntry89, orderEntry_array88);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState91 = null;
        try {
            java.util.List<org.apache.jackrabbit.oak.spi.query.QueryIndex.IndexPlan> list_indexPlan92 = solrQueryIndex85.getPlans(filter87, (java.util.List<org.apache.jackrabbit.oak.spi.query.QueryIndex.OrderEntry>) arraylist_orderEntry89, nodeState91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider26);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "path_exact" + "'", str28.equals("path_exact"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(solrClient33);
        org.junit.Assert.assertNotNull(solrClient34);
        org.junit.Assert.assertNotNull(solrClient41);
        org.junit.Assert.assertNotNull(solrClient42);
        org.junit.Assert.assertNotNull(str_array67);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertTrue(i70 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider71);
        org.junit.Assert.assertNotNull(oakSolrConfiguration75);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "solr" + "'", str86.equals("solr"));
        org.junit.Assert.assertNotNull(orderEntry_array88);
        org.junit.Assert.assertTrue(b90 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.solr.client.solrj.SolrClient solrClient17 = defaultSolrServerProvider0.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient18 = defaultSolrServerProvider0.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider19 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider20 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, oakSolrConfigurationProvider19);
        org.apache.solr.client.solrj.SolrClient solrClient21 = defaultSolrServerProvider0.getSolrServer();
        defaultSolrServerProvider0.close();
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(solrClient17);
        org.junit.Assert.assertNotNull(solrClient18);
        org.junit.Assert.assertNotNull(solrClient21);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient6 = defaultSolrServerProvider2.getIndexingSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse9 = solrClient6.deleteByQuery("RemoteSolrServerConfiguration{solrConfDir='path_anc', socketTimeout=1, connectionTimeout=0, solrHttpUrls=[solrHomePath], solrZkHost='hi!_string_sort', solrCollection='path_exact', solrShardsNo=100, solrReplicationFactor=10}", 0);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
        org.junit.Assert.assertNotNull(solrClient6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.solr.client.solrj.SolrClient solrClient17 = defaultSolrServerProvider0.getIndexingSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse22 = solrClient17.commit("rows", false, false, true);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(solrClient17);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        java.lang.String[] str_array22 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration23 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array22);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration24 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("catchAllField", "commitPolicy", (int) (byte) 1, (int) (short) 100, "pathField", (int) ' ', 10, str_array22);
        java.lang.String[] str_array25 = remoteSolrServerConfiguration24.getSolrHttpUrls();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration26 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("hi!_string_sort", "path_exact", (int) (byte) 100, (int) (byte) 10, "path_anc", (int) (short) 1, (int) (byte) 0, str_array25);
        java.lang.String str27 = remoteSolrServerConfiguration26.toString();
        java.lang.String str28 = remoteSolrServerConfiguration26.getSolrZkHost();
        int i29 = remoteSolrServerConfiguration26.getConnectionTimeout();
        int i30 = remoteSolrServerConfiguration26.getSolrShardsNo();
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "RemoteSolrServerConfiguration{solrConfDir='path_anc', socketTimeout=1, connectionTimeout=0, solrHttpUrls=[solrHomePath], solrZkHost='hi!_string_sort', solrCollection='path_exact', solrShardsNo=100, solrReplicationFactor=10}" + "'", str27.equals("RemoteSolrServerConfiguration{solrConfDir='path_anc', socketTimeout=1, connectionTimeout=0, solrHttpUrls=[solrHomePath], solrZkHost='hi!_string_sort', solrCollection='path_exact', solrShardsNo=100, solrReplicationFactor=10}"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!_string_sort" + "'", str28.equals("hi!_string_sort"));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i30 == 100);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider3 = embeddedSolrServerConfiguration2.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider(embeddedSolrServerConfiguration2);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration7 = embeddedSolrServerConfiguration2.withHttpConfiguration("primaryTypes", (java.lang.Integer) 10);
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider8 = embeddedSolrServerConfiguration2.getProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = embeddedSolrServerProvider8.getIndexingSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse12 = solrClient9.addBean("coreName", (java.lang.Object) "HttpConfiguration{context='primaryTypes', httpPort=10}");
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.beans.BindingException");
        } catch (org.apache.solr.client.solrj.beans.BindingException e) {
        }
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider3);
        org.junit.Assert.assertNotNull(embeddedSolrServerConfiguration7);
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider8);
        org.junit.Assert.assertNotNull(solrClient9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("propertyMappings", "ignoredProperties");
        java.lang.String str3 = embeddedSolrServerConfiguration2.getSolrHomePath();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration.HttpConfiguration httpConfiguration4 = embeddedSolrServerConfiguration2.getHttpConfiguration();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "propertyMappings" + "'", str3.equals("propertyMappings"));
        org.junit.Assert.assertNull(httpConfiguration4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.reflect.Type type10 = remoteSolrServerConfiguration9.getType();
        java.lang.String str11 = remoteSolrServerConfiguration9.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration9);
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService oakSolrConfigurationProviderService13 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator14 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService13, nodeAggregator14);
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState16 = null;
        java.util.List<? extends org.apache.jackrabbit.oak.spi.query.QueryIndex> list_wildcard17 = solrQueryIndexProvider15.getQueryIndexes(nodeState16);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(list_wildcard17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        defaultSolrServerProvider0.close();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.common.SolrInputDocument solrInputDocument11 = null;
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse12 = solrClient10.add(solrInputDocument11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        defaultSolrServerProvider0.close();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider0.getSolrServer();
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.solr.client.solrj.SolrClient solrClient17 = defaultSolrServerProvider0.getIndexingSolrServer();
        org.apache.solr.common.params.SolrParams solrParams19 = null;
        try {
            org.apache.solr.common.SolrDocument solrDocument20 = solrClient17.getById("oak", solrParams19);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(solrClient17);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.reflect.Type type10 = remoteSolrServerConfiguration9.getType();
        java.lang.String str11 = remoteSolrServerConfiguration9.getSolrConfDir();
        java.lang.String str12 = remoteSolrServerConfiguration9.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient14 = defaultSolrServerProvider13.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy15 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration9, solrClient14, strategy15);
        int i17 = remoteSolrServerConfiguration9.getSolrShardsNo();
        int i18 = remoteSolrServerConfiguration9.getSolrReplicationFactor();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration21 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("path_anc", "ignoredProperties");
        java.lang.reflect.Type type22 = embeddedSolrServerConfiguration21.getType();
        java.lang.String[] str_array31 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration32 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array31);
        java.lang.String str33 = remoteSolrServerConfiguration32.getSolrZkHost();
        java.lang.String[] str_array34 = remoteSolrServerConfiguration32.getSolrHttpUrls();
        java.lang.String str35 = remoteSolrServerConfiguration32.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy36 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient37 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration32, strategy36);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration21, strategy36);
        org.apache.solr.client.solrj.SolrClient solrClient39 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration9, strategy36);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse43 = solrClient39.optimize("zkHost", true, true);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(solrClient14);
        org.junit.Assert.assertTrue("'" + strategy15 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy15.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i18 == 100);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertNotNull(str_array34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue("'" + strategy36 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy36.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNotNull(solrClient37);
        org.junit.Assert.assertNotNull(solrClient39);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        java.lang.String str3 = embeddedSolrServerConfiguration2.getSolrHomePath();
        java.lang.reflect.Type type4 = embeddedSolrServerConfiguration2.getType();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "descendantsField" + "'", str3.equals("descendantsField"));
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.reflect.Type type10 = remoteSolrServerConfiguration9.getType();
        java.lang.String str11 = remoteSolrServerConfiguration9.getSolrConfDir();
        java.lang.String str12 = remoteSolrServerConfiguration9.getSolrZkHost();
        java.lang.String[] str_array13 = remoteSolrServerConfiguration9.getSolrHttpUrls();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration9);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(str_array13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        java.lang.String[] str_array15 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration16 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array15);
        int i17 = remoteSolrServerConfiguration16.getSolrShardsNo();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider18 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration16);
        java.lang.String str19 = remoteSolrServerConfiguration16.getSolrCollection();
        java.lang.String[] str_array20 = remoteSolrServerConfiguration16.getSolrHttpUrls();
        java.lang.String[] str_array21 = remoteSolrServerConfiguration16.getSolrHttpUrls();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration22 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "", 32, (int) 'a', "configurationDirectory", (int) (byte) 1, (int) (byte) 10, str_array21);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertNotNull(str_array21);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration1);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider3 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider2, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration5 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration5);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider7 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6, oakSolrConfigurationProvider7);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider9 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider10 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6, oakSolrConfigurationProvider9);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex11 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider3, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6);
        java.lang.String str12 = solrQueryIndex11.getIndexName();
        org.apache.jackrabbit.oak.spi.query.Filter filter13 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState14 = null;
        try {
            org.apache.jackrabbit.oak.spi.query.Cursor cursor15 = solrQueryIndex11.query(filter13, nodeState14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "solr" + "'", str12.equals("solr"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        javax.jcr.Session session1 = null;
        try {
            java.io.File file2 = org.apache.jackrabbit.oak.plugins.index.solr.util.NodeTypeIndexingUtils.createPrimaryTypeSynonymsFile("pathRestrictions", session1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.solr.client.solrj.SolrClient solrClient17 = defaultSolrServerProvider0.getIndexingSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse19 = solrClient17.deleteById("path_collapsed");
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(solrClient17);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse9 = solrClient5.optimize(false, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getIndexingSolrServer();
        solrClient5.close();
        org.apache.solr.common.params.SolrParams solrParams7 = null;
        org.apache.solr.client.solrj.SolrRequest.METHOD mETHOD8 = null;
        try {
            org.apache.solr.client.solrj.response.QueryResponse queryResponse9 = solrClient5.query(solrParams7, mETHOD8);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.solr.client.solrj.SolrClient solrClient8 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider0.getIndexingSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse11 = solrClient10.optimize();
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient8);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.reflect.Type type10 = remoteSolrServerConfiguration9.getType();
        java.lang.String str11 = remoteSolrServerConfiguration9.getSolrConfDir();
        java.lang.String str12 = remoteSolrServerConfiguration9.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient14 = defaultSolrServerProvider13.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy15 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration9, solrClient14, strategy15);
        java.lang.String[] str_array26 = new java.lang.String[] { "EmbeddedSolrServerConfiguration{solrHomePath='path_anc', coreName='ignoredProperties', httpConfiguration=null}", "8983", "/solr", "path_depth", "propertyRestrictions", "path_des", "/solr_string_sort_string_sort", "path_des" };
        java.util.ArrayList<java.lang.String> arraylist_str27 = new java.util.ArrayList<java.lang.String>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str27, str_array26);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse30 = solrClient14.deleteById("EmbeddedSolrServerConfiguration{solrHomePath='hi!', coreName='parentField', httpConfiguration=null}", (java.util.List<java.lang.String>) arraylist_str27, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(solrClient14);
        org.junit.Assert.assertTrue("'" + strategy15 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy15.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getSolrServer();
        solrClient5.close();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse7 = solrClient5.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration1);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider3 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider2, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration5 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration5);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider7 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6, oakSolrConfigurationProvider7);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider9 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider10 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6, oakSolrConfigurationProvider9);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex11 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider3, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6);
        java.lang.String str12 = solrQueryIndex11.getIndexName();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator13 = solrQueryIndex11.getNodeAggregator();
        double d14 = solrQueryIndex11.getMinimumCost();
        org.apache.jackrabbit.oak.spi.query.Filter filter15 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState16 = null;
        try {
            java.lang.String str17 = solrQueryIndex11.getPlan(filter15, nodeState16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "solr" + "'", str12.equals("solr"));
        org.junit.Assert.assertNull(nodeAggregator13);
        org.junit.Assert.assertTrue(d14 == 2.3d);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        java.lang.String[] str_array22 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration23 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array22);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration24 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("catchAllField", "commitPolicy", (int) (byte) 1, (int) (short) 100, "pathField", (int) ' ', 10, str_array22);
        java.lang.String[] str_array25 = remoteSolrServerConfiguration24.getSolrHttpUrls();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration26 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("hi!_string_sort", "path_exact", (int) (byte) 100, (int) (byte) 10, "path_anc", (int) (short) 1, (int) (byte) 0, str_array25);
        java.lang.reflect.Type type27 = remoteSolrServerConfiguration26.getType();
        int i28 = remoteSolrServerConfiguration26.getSocketTimeout();
        java.lang.String str29 = remoteSolrServerConfiguration26.getSolrZkHost();
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!_string_sort" + "'", str29.equals("hi!_string_sort"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        java.lang.String[] str_array9 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration10 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array9);
        java.lang.reflect.Type type11 = remoteSolrServerConfiguration10.getType();
        int i12 = remoteSolrServerConfiguration10.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider13 = remoteSolrServerConfiguration10.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration10);
        remoteSolrServerProvider14.close();
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService oakSolrConfigurationProviderService16 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration17 = oakSolrConfigurationProviderService16.getConfiguration();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator18 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider19 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider14, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService16, nodeAggregator18);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration20 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider21 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration20);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider22 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider23 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider21, oakSolrConfigurationProvider22);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex24 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService16, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider21);
        org.apache.jackrabbit.oak.spi.query.QueryIndex.IndexPlan indexPlan25 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState26 = null;
        try {
            org.apache.jackrabbit.oak.spi.query.Cursor cursor27 = solrQueryIndex24.query(indexPlan25, nodeState26);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider13);
        org.junit.Assert.assertNotNull(oakSolrConfiguration17);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService solrServerProviderService0 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService();
        org.apache.solr.client.solrj.SolrClient solrClient1 = solrServerProviderService0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = solrServerProviderService0.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient3 = solrServerProviderService0.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient4 = solrServerProviderService0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = solrServerProviderService0.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient6 = solrServerProviderService0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient7 = solrServerProviderService0.getSearchingSolrServer();
        org.junit.Assert.assertNull(solrClient1);
        org.junit.Assert.assertNull(solrClient2);
        org.junit.Assert.assertNull(solrClient3);
        org.junit.Assert.assertNull(solrClient4);
        org.junit.Assert.assertNull(solrClient5);
        org.junit.Assert.assertNull(solrClient6);
        org.junit.Assert.assertNull(solrClient7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.nodestate.NodeStateSolrServerProvider nodeStateSolrServerProvider1 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.nodestate.NodeStateSolrServerProvider(nodeState0);
        nodeStateSolrServerProvider1.close();
        try {
            org.apache.solr.client.solrj.SolrClient solrClient3 = nodeStateSolrServerProvider1.getIndexingSolrServer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient3 = defaultSolrServerProvider0.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.common.params.SolrParams solrParams7 = null;
        try {
            org.apache.solr.common.SolrDocument solrDocument8 = solrClient4.getById("catch_all", "childrenField", solrParams7);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient3);
        org.junit.Assert.assertNotNull(solrClient4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider1 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider1.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient3 = defaultSolrServerProvider1.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider1.getIndexingSolrServer();
        java.lang.String[] str_array13 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration14 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array13);
        java.lang.reflect.Type type15 = remoteSolrServerConfiguration14.getType();
        int i16 = remoteSolrServerConfiguration14.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider17 = remoteSolrServerConfiguration14.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration18 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str19 = defaultSolrConfiguration18.getPathField();
        boolean b20 = defaultSolrConfiguration18.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider21 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration18);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider22 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider17, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider21);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration23 = defaultSolrConfigurationProvider21.getConfiguration();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider24 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider21);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration25 = defaultSolrConfigurationProvider21.getConfiguration();
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService solrServerProviderService26 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService();
        org.apache.solr.client.solrj.SolrClient solrClient27 = solrServerProviderService26.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient28 = solrServerProviderService26.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient29 = solrServerProviderService26.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex30 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider21, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) solrServerProviderService26);
        solrServerProviderService26.close();
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient3);
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "path_exact" + "'", str19.equals("path_exact"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(oakSolrConfiguration23);
        org.junit.Assert.assertNotNull(oakSolrConfiguration25);
        org.junit.Assert.assertNull(solrClient27);
        org.junit.Assert.assertNull(solrClient28);
        org.junit.Assert.assertNull(solrClient29);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        solrClient4.close();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse10 = solrClient4.commit("shardsNo", false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        java.lang.String[] str_array9 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration10 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array9);
        java.lang.reflect.Type type11 = remoteSolrServerConfiguration10.getType();
        int i12 = remoteSolrServerConfiguration10.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider13 = remoteSolrServerConfiguration10.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration14 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str15 = defaultSolrConfiguration14.getPathField();
        boolean b16 = defaultSolrConfiguration14.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider17 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration14);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider18 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider13, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider17);
        java.lang.String[] str_array27 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration28 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array27);
        java.lang.reflect.Type type29 = remoteSolrServerConfiguration28.getType();
        int i30 = remoteSolrServerConfiguration28.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider31 = remoteSolrServerConfiguration28.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration32 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str33 = defaultSolrConfiguration32.getPathField();
        boolean b34 = defaultSolrConfiguration32.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider35 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration32);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider36 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider31, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider35);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider37 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider13, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider35);
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator38 = null;
        java.lang.String[] str_array47 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration48 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array47);
        java.lang.reflect.Type type49 = remoteSolrServerConfiguration48.getType();
        int i50 = remoteSolrServerConfiguration48.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider51 = remoteSolrServerConfiguration48.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider52 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration48);
        remoteSolrServerProvider52.close();
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService oakSolrConfigurationProviderService54 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration55 = oakSolrConfigurationProviderService54.getConfiguration();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator56 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider57 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider52, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService54, nodeAggregator56);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration58 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider59 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration58);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider60 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider61 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider59, oakSolrConfigurationProvider60);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex62 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator38, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) oakSolrConfigurationProviderService54, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider59);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex63 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider35, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider59);
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator64 = solrQueryIndex63.getNodeAggregator();
        double d65 = solrQueryIndex63.getMinimumCost();
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "path_exact" + "'", str15.equals("path_exact"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider31);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "path_exact" + "'", str33.equals("path_exact"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(str_array47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue(i50 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider51);
        org.junit.Assert.assertNotNull(oakSolrConfiguration55);
        org.junit.Assert.assertNull(nodeAggregator64);
        org.junit.Assert.assertTrue(d65 == 2.3d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        java.lang.reflect.Type type3 = embeddedSolrServerConfiguration2.getType();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator4 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider5 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex7 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator4, oakSolrConfigurationProvider5, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider6);
        org.apache.solr.client.solrj.SolrClient solrClient8 = defaultSolrServerProvider6.getSolrServer();
        java.lang.String[] str_array17 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration18 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array17);
        java.lang.reflect.Type type19 = remoteSolrServerConfiguration18.getType();
        java.lang.String str20 = remoteSolrServerConfiguration18.getSolrConfDir();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider21 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration18);
        java.lang.String[] str_array30 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration31 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array30);
        java.lang.reflect.Type type32 = remoteSolrServerConfiguration31.getType();
        java.lang.String str33 = remoteSolrServerConfiguration31.getSolrConfDir();
        java.lang.String str34 = remoteSolrServerConfiguration31.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider35 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient36 = defaultSolrServerProvider35.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy37 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration31, solrClient36, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.unregister((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration18, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) embeddedSolrServerConfiguration2, solrClient8, strategy37);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration43 = embeddedSolrServerConfiguration2.withHttpConfiguration("catch_all", (java.lang.Integer) 10);
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider44 = embeddedSolrServerConfiguration2.getProvider();
        embeddedSolrServerProvider44.close();
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(solrClient8);
        org.junit.Assert.assertNotNull(str_array17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(str_array30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertNotNull(solrClient36);
        org.junit.Assert.assertTrue("'" + strategy37 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy37.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNotNull(embeddedSolrServerConfiguration43);
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider44);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration0 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str1 = defaultSolrConfiguration0.getPathField();
        int i2 = defaultSolrConfiguration0.getRows();
        boolean b3 = defaultSolrConfiguration0.useForPathRestrictions();
        java.util.Collection<java.lang.String> collection_str4 = defaultSolrConfiguration0.getIgnoredProperties();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy commitPolicy5 = defaultSolrConfiguration0.getCommitPolicy();
        boolean b6 = defaultSolrConfiguration0.useForPrimaryTypes();
        java.util.Collection<java.lang.String> collection_str7 = defaultSolrConfiguration0.getIgnoredProperties();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "path_exact" + "'", str1.equals("path_exact"));
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection_str4);
        org.junit.Assert.assertTrue("'" + commitPolicy5 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy.SOFT + "'", commitPolicy5.equals(org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration.CommitPolicy.SOFT));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection_str7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService solrServerProviderService0 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService();
        org.apache.solr.client.solrj.SolrClient solrClient1 = solrServerProviderService0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = solrServerProviderService0.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient3 = solrServerProviderService0.getSolrServer();
        solrServerProviderService0.close();
        org.apache.solr.client.solrj.SolrClient solrClient5 = solrServerProviderService0.getSolrServer();
        org.junit.Assert.assertNull(solrClient1);
        org.junit.Assert.assertNull(solrClient2);
        org.junit.Assert.assertNull(solrClient3);
        org.junit.Assert.assertNull(solrClient5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient9 = defaultSolrServerProvider8.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient10 = defaultSolrServerProvider8.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration11 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider12 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration11);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider14 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider12, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider15 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider8, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider16 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider13);
        java.lang.String[] str_array25 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration26 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array25);
        java.lang.reflect.Type type27 = remoteSolrServerConfiguration26.getType();
        int i28 = remoteSolrServerConfiguration26.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider29 = remoteSolrServerConfiguration26.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration30 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str31 = defaultSolrConfiguration30.getPathField();
        boolean b32 = defaultSolrConfiguration30.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider33 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration30);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider34 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider29, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider33);
        java.lang.String[] str_array43 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration44 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array43);
        java.lang.reflect.Type type45 = remoteSolrServerConfiguration44.getType();
        int i46 = remoteSolrServerConfiguration44.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider47 = remoteSolrServerConfiguration44.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration48 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str49 = defaultSolrConfiguration48.getPathField();
        boolean b50 = defaultSolrConfiguration48.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider51 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration48);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider52 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider47, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider53 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider29, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider54 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider51);
        org.apache.solr.client.solrj.SolrClient solrClient55 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient56 = defaultSolrServerProvider0.getSolrServer();
        java.util.Collection<java.lang.String> collection_str58 = null;
        org.apache.solr.common.params.SolrParams solrParams59 = null;
        try {
            org.apache.solr.common.SolrDocumentList solrDocumentList60 = solrClient56.getById("httpPort", collection_str58, solrParams59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient9);
        org.junit.Assert.assertNotNull(solrClient10);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "path_exact" + "'", str31.equals("path_exact"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "path_exact" + "'", str49.equals("path_exact"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(solrClient55);
        org.junit.Assert.assertNotNull(solrClient56);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration3 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider5 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider4, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider7 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider5);
        org.apache.solr.client.solrj.SolrClient solrClient8 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.beans.DocumentObjectBinder documentObjectBinder9 = solrClient8.getBinder();
        org.apache.solr.common.SolrInputDocument solrInputDocument11 = null;
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse12 = solrClient8.add("path_anc", solrInputDocument11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient8);
        org.junit.Assert.assertNotNull(documentObjectBinder9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider0 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient1 = defaultSolrServerProvider0.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider0.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient3 = defaultSolrServerProvider0.getIndexingSolrServer();
        java.lang.String[] str_array12 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration13 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array12);
        java.lang.reflect.Type type14 = remoteSolrServerConfiguration13.getType();
        int i15 = remoteSolrServerConfiguration13.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider16 = remoteSolrServerConfiguration13.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration17 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str18 = defaultSolrConfiguration17.getPathField();
        boolean b19 = defaultSolrConfiguration17.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider20 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration17);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider21 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider16, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider20);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration22 = defaultSolrConfigurationProvider20.getConfiguration();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider23 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider20);
        org.apache.solr.client.solrj.SolrClient solrClient24 = defaultSolrServerProvider0.getSolrServer();
        java.lang.String[] str_array27 = new java.lang.String[] { "path_des" };
        java.util.ArrayList<java.lang.String> arraylist_str28 = new java.util.ArrayList<java.lang.String>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str28, str_array27);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse31 = solrClient24.deleteById("/solr", (java.util.List<java.lang.String>) arraylist_str28, 2);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient1);
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient3);
        org.junit.Assert.assertNotNull(str_array12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "path_exact" + "'", str18.equals("path_exact"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(oakSolrConfiguration22);
        org.junit.Assert.assertNotNull(solrClient24);
        org.junit.Assert.assertNotNull(str_array27);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        java.lang.String[] str_array15 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration16 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array15);
        java.lang.String str17 = remoteSolrServerConfiguration16.getSolrZkHost();
        java.lang.String[] str_array18 = remoteSolrServerConfiguration16.getSolrHttpUrls();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration19 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("path_des", "usedProperties", (int) (byte) 0, (int) (short) 0, "catchAllField", (int) (byte) 10, (int) (byte) 0, str_array18);
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider20 = remoteSolrServerConfiguration19.getProvider();
        java.lang.String str21 = remoteSolrServerConfiguration19.getSolrCollection();
        java.lang.reflect.Type type22 = remoteSolrServerConfiguration19.getType();
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(str_array18);
        org.junit.Assert.assertNotNull(remoteSolrServerProvider20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "usedProperties" + "'", str21.equals("usedProperties"));
        org.junit.Assert.assertNotNull(type22);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.jackrabbit.oak.spi.query.Filter filter4 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState5 = null;
        try {
            java.lang.String str6 = solrQueryIndex3.getPlan(filter4, nodeState5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        java.lang.String[] str_array8 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration9 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array8);
        java.lang.reflect.Type type10 = remoteSolrServerConfiguration9.getType();
        java.lang.String str11 = remoteSolrServerConfiguration9.getSolrConfDir();
        java.lang.String str12 = remoteSolrServerConfiguration9.getSolrZkHost();
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider13 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient14 = defaultSolrServerProvider13.getSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy15 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.register((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration9, solrClient14, strategy15);
        org.apache.solr.common.SolrInputDocument[] solrInputDocument_array17 = new org.apache.solr.common.SolrInputDocument[] {};
        java.util.ArrayList<org.apache.solr.common.SolrInputDocument> arraylist_solrInputDocument18 = new java.util.ArrayList<org.apache.solr.common.SolrInputDocument>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.solr.common.SolrInputDocument>) arraylist_solrInputDocument18, solrInputDocument_array17);
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse21 = solrClient14.add((java.util.Collection<org.apache.solr.common.SolrInputDocument>) arraylist_solrInputDocument18, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(solrClient14);
        org.junit.Assert.assertTrue("'" + strategy15 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy15.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNotNull(solrInputDocument_array17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration embeddedSolrServerConfiguration2 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.EmbeddedSolrServerConfiguration("descendantsField", "path_des");
        java.lang.reflect.Type type3 = embeddedSolrServerConfiguration2.getType();
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider4 = embeddedSolrServerConfiguration2.getProvider();
        java.lang.String str5 = embeddedSolrServerConfiguration2.toString();
        java.lang.reflect.Type type6 = embeddedSolrServerConfiguration2.getType();
        java.lang.reflect.Type type7 = embeddedSolrServerConfiguration2.getType();
        org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider embeddedSolrServerProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.server.EmbeddedSolrServerProvider(embeddedSolrServerConfiguration2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(embeddedSolrServerProvider4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "EmbeddedSolrServerConfiguration{solrHomePath='descendantsField', coreName='path_des', httpConfiguration=null}" + "'", str5.equals("EmbeddedSolrServerConfiguration{solrHomePath='descendantsField', coreName='path_des', httpConfiguration=null}"));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex3 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, oakSolrConfigurationProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider2);
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider2.getIndexingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient5 = defaultSolrServerProvider2.getIndexingSolrServer();
        try {
            org.apache.solr.client.solrj.response.UpdateResponse updateResponse10 = solrClient5.commit("configurationDirectory", true, true, false);
            org.junit.Assert.fail("Expected exception of type org.apache.solr.client.solrj.SolrServerException");
        } catch (org.apache.solr.client.solrj.SolrServerException e) {
        }
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(solrClient5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration0 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str1 = defaultSolrConfiguration0.getPathField();
        int i2 = defaultSolrConfiguration0.getRows();
        boolean b3 = defaultSolrConfiguration0.useForPathRestrictions();
        java.lang.String str4 = defaultSolrConfiguration0.getCatchAllField();
        boolean b5 = defaultSolrConfiguration0.collapseJcrContentNodes();
        boolean b6 = defaultSolrConfiguration0.useForPathRestrictions();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "path_exact" + "'", str1.equals("path_exact"));
        org.junit.Assert.assertTrue(i2 == 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "catch_all" + "'", str4.equals("catch_all"));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider defaultSolrServerProvider1 = new org.apache.jackrabbit.oak.plugins.index.solr.server.DefaultSolrServerProvider();
        org.apache.solr.client.solrj.SolrClient solrClient2 = defaultSolrServerProvider1.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient3 = defaultSolrServerProvider1.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient4 = defaultSolrServerProvider1.getIndexingSolrServer();
        java.lang.String[] str_array13 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration14 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array13);
        java.lang.reflect.Type type15 = remoteSolrServerConfiguration14.getType();
        int i16 = remoteSolrServerConfiguration14.getConnectionTimeout();
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider17 = remoteSolrServerConfiguration14.getProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration defaultSolrConfiguration18 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfiguration();
        java.lang.String str19 = defaultSolrConfiguration18.getPathField();
        boolean b20 = defaultSolrConfiguration18.collapseJcrContentNodes();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider21 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider((org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration) defaultSolrConfiguration18);
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider22 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider17, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider21);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration23 = defaultSolrConfigurationProvider21.getConfiguration();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider24 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) defaultSolrServerProvider1, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider21);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfiguration oakSolrConfiguration25 = defaultSolrConfigurationProvider21.getConfiguration();
        org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService solrServerProviderService26 = new org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService();
        org.apache.solr.client.solrj.SolrClient solrClient27 = solrServerProviderService26.getSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient28 = solrServerProviderService26.getSearchingSolrServer();
        org.apache.solr.client.solrj.SolrClient solrClient29 = solrServerProviderService26.getSearchingSolrServer();
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex30 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider21, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) solrServerProviderService26);
        double d31 = solrQueryIndex30.getMinimumCost();
        org.junit.Assert.assertNotNull(solrClient2);
        org.junit.Assert.assertNotNull(solrClient3);
        org.junit.Assert.assertNotNull(solrClient4);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertNotNull(remoteSolrServerProvider17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "path_exact" + "'", str19.equals("path_exact"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(oakSolrConfiguration23);
        org.junit.Assert.assertNotNull(oakSolrConfiguration25);
        org.junit.Assert.assertNull(solrClient27);
        org.junit.Assert.assertNull(solrClient28);
        org.junit.Assert.assertNull(solrClient29);
        org.junit.Assert.assertTrue(d31 == 2.3d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        java.lang.CharSequence charSequence1 = org.apache.jackrabbit.oak.plugins.index.solr.util.SolrUtils.partialEscape((java.lang.CharSequence) "path_depth");
        java.lang.CharSequence charSequence2 = org.apache.jackrabbit.oak.plugins.index.solr.util.SolrUtils.partialEscape((java.lang.CharSequence) "path_depth");
        java.lang.CharSequence charSequence3 = org.apache.jackrabbit.oak.plugins.index.solr.util.SolrUtils.partialEscape((java.lang.CharSequence) "path_depth");
        org.junit.Assert.assertNotNull(charSequence1);
        org.junit.Assert.assertNotNull(charSequence2);
        org.junit.Assert.assertNotNull(charSequence3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        java.lang.String[] str_array22 = new java.lang.String[] { "solrHomePath" };
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration23 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("", "hi!", 1, (int) (short) 100, "hi!", 1, (int) (short) -1, str_array22);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration24 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("catchAllField", "commitPolicy", (int) (byte) 1, (int) (short) 100, "pathField", (int) ' ', 10, str_array22);
        java.lang.String[] str_array25 = remoteSolrServerConfiguration24.getSolrHttpUrls();
        java.lang.reflect.Type type26 = remoteSolrServerConfiguration24.getType();
        org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy strategy27 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING;
        org.apache.solr.client.solrj.SolrClient solrClient28 = org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.get((org.apache.jackrabbit.oak.plugins.index.solr.configuration.SolrServerConfiguration) remoteSolrServerConfiguration24, strategy27);
        java.lang.String[] str_array29 = remoteSolrServerConfiguration24.getSolrHttpUrls();
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration30 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration("connectionTimeout", "EmbeddedSolrServerConfiguration{solrHomePath='path_anc', coreName='ignoredProperties', httpConfiguration=null}", 100, (int) (byte) 100, "catchAllField", (int) (short) 0, 1, str_array29);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertNotNull(str_array25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + strategy27 + "' != '" + org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING + "'", strategy27.equals(org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerRegistry.Strategy.INDEXING));
        org.junit.Assert.assertNull(solrClient28);
        org.junit.Assert.assertNotNull(str_array29);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator0 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration1 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider2 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration1);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider defaultSolrConfigurationProvider3 = new org.apache.jackrabbit.oak.plugins.index.solr.configuration.DefaultSolrConfigurationProvider();
        org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider solrIndexEditorProvider4 = new org.apache.jackrabbit.oak.plugins.index.solr.index.SolrIndexEditorProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider2, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider3);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.RemoteSolrServerConfiguration remoteSolrServerConfiguration5 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider remoteSolrServerProvider6 = new org.apache.jackrabbit.oak.plugins.index.solr.server.RemoteSolrServerProvider(remoteSolrServerConfiguration5);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider7 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider8 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6, oakSolrConfigurationProvider7);
        org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider oakSolrConfigurationProvider9 = null;
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider solrQueryIndexProvider10 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndexProvider((org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6, oakSolrConfigurationProvider9);
        org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex solrQueryIndex11 = new org.apache.jackrabbit.oak.plugins.index.solr.query.SolrQueryIndex(nodeAggregator0, (org.apache.jackrabbit.oak.plugins.index.solr.configuration.OakSolrConfigurationProvider) defaultSolrConfigurationProvider3, (org.apache.jackrabbit.oak.plugins.index.solr.server.SolrServerProvider) remoteSolrServerProvider6);
        java.lang.String str12 = solrQueryIndex11.getIndexName();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.NodeAggregator nodeAggregator13 = solrQueryIndex11.getNodeAggregator();
        java.lang.String str14 = solrQueryIndex11.getIndexName();
        org.apache.jackrabbit.oak.spi.query.QueryIndex.IndexPlan indexPlan15 = null;
        org.apache.jackrabbit.oak.spi.state.NodeState nodeState16 = null;
        try {
            org.apache.jackrabbit.oak.spi.query.Cursor cursor17 = solrQueryIndex11.query(indexPlan15, nodeState16);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "solr" + "'", str12.equals("solr"));
        org.junit.Assert.assertNull(nodeAggregator13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "solr" + "'", str14.equals("solr"));
    }
}
